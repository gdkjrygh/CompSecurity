// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;


// Referenced classes of package com.facebook.orca.fbwebrtc:
//            WebrtcIncallActivity

class t
    implements Runnable
{

    final WebrtcIncallActivity a;

    t(WebrtcIncallActivity webrtcincallactivity)
    {
        a = webrtcincallactivity;
        super();
    }

    public void run()
    {
        a.finish();
    }
}
