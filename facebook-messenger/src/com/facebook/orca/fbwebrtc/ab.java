// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;


// Referenced classes of package com.facebook.orca.fbwebrtc:
//            WebrtcIncallActivity

class ab
    implements Runnable
{

    final WebrtcIncallActivity a;

    ab(WebrtcIncallActivity webrtcincallactivity)
    {
        a = webrtcincallactivity;
        super();
    }

    public void run()
    {
        WebrtcIncallActivity.b(a, false);
        WebrtcIncallActivity.h(a);
    }
}
