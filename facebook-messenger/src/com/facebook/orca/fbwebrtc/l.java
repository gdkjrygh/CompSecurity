// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import android.content.Context;
import android.content.Intent;
import com.facebook.c.s;
import com.facebook.o;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            bb, WebrtcIncallActivity

public class l
{

    private Context a;
    private bb b;
    private s c;

    public l(Context context, bb bb1, s s1)
    {
        a = context;
        b = bb1;
        c = s1;
    }

    public boolean a()
    {
        return b.c() != 0;
    }

    public String b()
    {
        String s1;
        if (b.e() == 0L)
        {
            s1 = a.getString(o.webrtc_incall_status_connecting);
        } else
        {
            s1 = b.f();
        }
        return a.getString(o.webrtc_call_status_bar_text, new Object[] {
            s1
        });
    }

    public void c()
    {
        Intent intent = new Intent(a, com/facebook/orca/fbwebrtc/WebrtcIncallActivity);
        intent.setAction("com.facebook.orca.fbwebrtc.intent.action.SHOW_UI");
        intent.addFlags(0x10000000);
        intent.putExtra("CONTACT_ID", b.a());
        c.a(intent, a);
    }
}
