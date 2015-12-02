// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import android.content.Context;
import android.content.Intent;
import com.facebook.c.s;
import com.facebook.e.c;
import com.facebook.o;
import com.facebook.prefs.shared.d;
import com.facebook.push.mqtt.v;
import com.facebook.ui.d.a;
import com.facebook.user.UserKey;
import com.facebook.user.n;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            k, j, WebrtcIncallActivity, ag, 
//            ay, ae

public class i
{

    private static final Class a = com/facebook/orca/fbwebrtc/i;
    private final s b;
    private final d c;
    private final v d;
    private final ae e;
    private final ag f;
    private final c g;
    private final javax.inject.a h;
    private final javax.inject.a i;

    public i(s s1, d d1, v v1, ae ae, ag ag1, c c1, javax.inject.a a1, 
            javax.inject.a a2)
    {
        b = s1;
        c = d1;
        d = v1;
        e = ae;
        f = ag1;
        g = c1;
        h = a1;
        i = a2;
    }

    static ae a(i l)
    {
        return l.e;
    }

    private void a(Context context, Intent intent)
    {
        (new android.app.AlertDialog.Builder(context)).setTitle(o.webrtc_free_call_notification_title).setMessage(o.webrtc_free_call_notification_body).setPositiveButton(o.webrtc_free_call_call, new k(this, intent, context)).setNegativeButton(0x1040000, new j(this)).show();
    }

    private void a(Context context, String s1)
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = context.getString(o.webrtc_unable_call_generic_message);
        }
        com.facebook.ui.d.a.a(context).a(o.webrtc_unable_call_title).b(s2).a();
    }

    static d b(i l)
    {
        return l.c;
    }

    static s c(i l)
    {
        return l.b;
    }

    public void a(Context context, UserKey userkey, boolean flag, String s1)
    {
        long l;
        boolean flag1;
        if (userkey.a() == n.FACEBOOK)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkArgument(flag1);
        l = Long.parseLong(userkey.b());
        if (((Boolean)i.b()).booleanValue() && !g.b())
        {
            a(context, context.getString(o.webrtc_incall_status_carrier_blocked));
            return;
        }
        if (!flag)
        {
            a(context, s1);
            return;
        }
        if (!d.d())
        {
            a(context, context.getString(o.webrtc_unable_call_generic_message));
            return;
        }
        userkey = new Intent(context, com/facebook/orca/fbwebrtc/WebrtcIncallActivity);
        if (!f.e())
        {
            break MISSING_BLOCK_LABEL_223;
        }
        if (!f.d() || f.c() != l) goto _L2; else goto _L1
_L1:
        userkey.setAction("com.facebook.orca.fbwebrtc.intent.action.SHOW_UI");
_L3:
        userkey.putExtra("CONTACT_ID", l);
        if (((Boolean)h.b()).booleanValue() && !c.a(com.facebook.orca.fbwebrtc.ay.c, false))
        {
            a(context, ((Intent) (userkey)));
            return;
        } else
        {
            b.a(userkey, context);
            return;
        }
_L2:
        a(context, context.getString(o.webrtc_unable_call_ongoing_call));
        return;
        userkey.setAction("com.facebook.orca.fbwebrtc.intent.action.CALL");
          goto _L3
    }

}
