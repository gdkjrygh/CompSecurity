// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import com.facebook.debug.log.b;
import com.facebook.o;
import com.facebook.webrtc.IWebrtcUiInterface;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            WebrtcIncallActivity, ad, bb

class z
    implements IWebrtcUiInterface
{

    final WebrtcIncallActivity a;

    z(WebrtcIncallActivity webrtcincallactivity)
    {
        a = webrtcincallactivity;
        super();
    }

    public void handleError(int i)
    {
    }

    public void hideCallUI(int i, long l, boolean flag)
    {
        String s = WebrtcIncallActivity.a(a, i);
        WebrtcIncallActivity.a(a, s, ad.NONE);
        if (l != 0L)
        {
            WebrtcIncallActivity.j(a);
            WebrtcIncallActivity.a(a, l);
            return;
        } else
        {
            a.finish();
            return;
        }
    }

    public void showConnectionDetails(boolean flag, String s)
    {
        if (WebrtcIncallActivity.f(a).h() && !WebrtcIncallActivity.g(a))
        {
            WebrtcIncallActivity.h(a);
            WebrtcIncallActivity.i(a);
        }
        WebrtcIncallActivity.a(a, s, flag);
    }

    public void showOutdatedProtocolAlert(boolean flag, long l)
    {
        b.c(WebrtcIncallActivity.j(), "Outgoing call with upgrade alert");
        WebrtcIncallActivity.a(a, flag);
    }

    public void switchToIncomingCallUI(long l)
    {
    }

    public void switchToRingingUI()
    {
    }

    public void switchToStreamingUI()
    {
        WebrtcIncallActivity.a(a, a.getString(o.webrtc_incall_status_connecting), ad.CONNECTING);
    }

    public void updateMuteState(boolean flag)
    {
    }
}
