// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.tts;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.text.TextUtils;
import com.google.android.libraries.translate.core.b;
import com.google.android.libraries.translate.core.j;
import com.google.android.libraries.translate.e.o;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.tts.a.c;
import com.google.android.libraries.translate.tts.a.e;
import com.google.android.libraries.translate.tts.a.f;
import com.google.android.libraries.translate.tts.network.LongTextNetworkTts;
import com.google.android.libraries.translate.tts.network.i;

// Referenced classes of package com.google.android.libraries.translate.tts:
//            d, e, a, c

public class MyTts extends BroadcastReceiver
    implements j, d
{

    private Context a;
    private d b;
    private d c;
    private final boolean d = false;
    private a e;

    public MyTts(Context context)
    {
        a = context;
        c();
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentfilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentfilter.addDataScheme("package");
        context.registerReceiver(this, intentfilter);
    }

    static a a(MyTts mytts)
    {
        return mytts.e;
    }

    static a a(MyTts mytts, a a1)
    {
        mytts.e = a1;
        return a1;
    }

    public static com.google.android.libraries.translate.tts.c a(String s)
    {
        Object obj;
        obj = TextUtils.split(s, "\t");
        int l;
        if (obj.length != 3)
        {
            int k = obj.length;
            obj = null;
        } else
        if (!obj[0].equals("TwsTtsDialect"))
        {
            obj = null;
        } else
        {
            obj = new i(obj[1], obj[2]);
        }
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        s = TextUtils.split(s, "\t");
        if (s.length == 5) goto _L2; else goto _L1
_L1:
        l = s.length;
_L4:
        return null;
_L2:
        if (!s[0].equals("TwsTtsDialect")) goto _L4; else goto _L3
_L3:
        return new e(s[1], s[2], s[3], s[4]);
        return ((com.google.android.libraries.translate.tts.c) (obj));
    }

    private boolean b(Language language)
    {
        return c != null && c.a(language);
    }

    private void c()
    {
        b = new LongTextNetworkTts(a);
        Object obj;
        if (d)
        {
            obj = new f(a);
        } else
        {
            obj = new c(a);
        }
        c = ((d) (obj));
    }

    private boolean c(Language language)
    {
        if (com.google.android.libraries.translate.core.b.d(a))
        {
            boolean flag;
            if (b != null && b.a(language))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    public final void a()
    {
        a.unregisterReceiver(this);
        if (c != null)
        {
            c.a();
        }
        if (b != null)
        {
            b.a();
        }
    }

    public final void a(Context context, Language language, String s, String s1, com.google.android.libraries.translate.tts.e e1)
    {
        AudioManager audiomanager = (AudioManager)a.getSystemService("audio");
        if (audiomanager != null && audiomanager.getStreamVolume(3) == 0 && context != null)
        {
            e1.b(2);
        } else
        {
            b();
            e1 = new a(this, e1);
            boolean flag = c(language);
            if (flag && o.b(a))
            {
                b.a(context, language, s, s1, e1);
                return;
            }
            if (b(language))
            {
                c.a(context, language, s, s1, e1);
                return;
            }
            if (flag)
            {
                b.a(context, language, s, s1, e1);
                return;
            }
        }
    }

    public final boolean a(Language language)
    {
        return c(language) || b(language);
    }

    public final void b()
    {
        b.b();
        if (c != null)
        {
            c.b();
        }
        if (e != null)
        {
            e.j();
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        c();
    }
}
