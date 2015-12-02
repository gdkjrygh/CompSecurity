// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.intents;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.c.s;
import com.facebook.orca.auth.StartScreenActivity;
import com.facebook.orca.prefs.OrcaRootPreferenceActivity;
import com.facebook.orca.threadview.ThreadViewActivity;
import com.facebook.user.UserKey;
import com.facebook.user.n;
import com.google.common.d.a.ab;
import com.google.common.d.a.i;
import java.util.List;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.intents:
//            c, CanonicalThreadHandler

public class b
{

    private static final Class a = com/facebook/orca/intents/b;
    private final Context b;
    private final com.facebook.user.i c;
    private final com.facebook.auth.b.b d;
    private final a e;
    private final a f;
    private final s g;
    private final ComponentName h;
    private final com.facebook.b.a.b i;

    public b(Context context, com.facebook.user.i j, com.facebook.auth.b.b b1, a a1, a a2, s s1, ComponentName componentname, 
            com.facebook.b.a.b b2)
    {
        b = context;
        c = j;
        d = b1;
        e = a1;
        f = a2;
        g = s1;
        h = componentname;
        i = b2;
    }

    static Intent a(b b1, String s1, boolean flag, String s2)
    {
        return b1.a(s1, flag, s2);
    }

    private Intent a(String s1, boolean flag, String s2)
    {
        Intent intent;
        if (flag)
        {
            intent = new Intent();
            intent.setComponent(h);
            intent.setFlags(0x4000000);
        } else
        {
            intent = new Intent(b, com/facebook/orca/threadview/ThreadViewActivity);
        }
        intent.putExtra("thread_id", s1);
        intent.putExtra("trigger", s2);
        return intent;
    }

    private com.google.common.d.a.s a(Intent intent, Intent intent1)
    {
        if (intent.hasExtra("from_notification"))
        {
            intent1.putExtra("from_notification", intent.getBooleanExtra("from_notification", false));
        }
        if (!(b instanceof Activity))
        {
            intent1.setFlags(intent1.getFlags() | 0x10000000);
        }
        g.a(intent1, b);
        return com.google.common.d.a.i.a(Boolean.valueOf(true));
    }

    private com.google.common.d.a.s a(Intent intent, String s1, boolean flag, String s2)
    {
        ab ab1 = ab.a();
        com.google.common.d.a.i.a(i.a(s1, "from_notification"), new c(this, intent, s1, flag, s2, ab1));
        return ab1;
    }

    static com.google.common.d.a.s a(b b1, Intent intent, Intent intent1)
    {
        return b1.a(intent, intent1);
    }

    public com.google.common.d.a.s a(Intent intent)
    {
        String s1;
        Object obj;
        String s2;
        Object obj1;
        boolean flag;
        obj1 = intent.getData();
        obj = ((Uri) (obj1)).getAuthority();
        s2 = ((Uri) (obj1)).getScheme();
        s1 = ((Uri) (obj1)).getSchemeSpecificPart();
        obj1 = ((Uri) (obj1)).getPathSegments();
        flag = intent.getBooleanExtra("modify_backstack_override", true);
        if (d.b()) goto _L2; else goto _L1
_L1:
        a(intent, new Intent(b, com/facebook/orca/auth/StartScreenActivity));
_L4:
        return com.google.common.d.a.i.a(Boolean.valueOf(false));
_L2:
label0:
        {
label1:
            {
                if ("smsto".equals(s2) || "sms".equals(s2) || "mmsto".equals(s2) || "mms".equals(s2))
                {
                    if (((Boolean)e.b()).booleanValue() && ((Boolean)f.b()).booleanValue())
                    {
                        obj = new Intent(b, com/facebook/orca/intents/CanonicalThreadHandler);
                        ((Intent) (obj)).putExtra("user_key", c.d(s1).c());
                        ((Intent) (obj)).putExtra("use_thread_list", flag);
                        a(intent, ((Intent) (obj)));
                    } else
                    {
                        a(intent, new Intent(b, com/facebook/orca/auth/StartScreenActivity));
                    }
                    continue; /* Loop/switch isn't completed */
                }
                if (!"thread".equals(obj) || ((List) (obj1)).size() != 1)
                {
                    break label0;
                }
                s1 = (String)((List) (obj1)).get(0);
                obj = intent.getStringExtra("trigger");
                if (intent.getBooleanExtra("prefer_chat_if_possible", false))
                {
                    if (!(b instanceof Activity))
                    {
                        break label1;
                    }
                    com.facebook.debug.log.b.d(a, "To view a thread in a chat head, use startService.");
                }
                return a(intent, a(s1, flag, ((String) (obj))));
            }
            return a(intent, s1, flag, ((String) (obj)));
        }
        if ("threads".equals(obj))
        {
            Intent intent1 = new Intent();
            intent1.setComponent(h);
            intent1.setFlags(0x4000000);
            return a(intent, intent1);
        }
        if ("settings".equals(obj))
        {
            return a(intent, new Intent(b, com/facebook/orca/prefs/OrcaRootPreferenceActivity));
        }
        if ("user".equals(obj) && ((List) (obj1)).size() == 1)
        {
            Intent intent2 = new Intent(b, com/facebook/orca/intents/CanonicalThreadHandler);
            intent2.putExtra("user_key", (new UserKey(n.FACEBOOK, (String)((List) (obj1)).get(0))).c());
            intent2.putExtra("use_thread_list", flag);
            a(intent, intent2);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
