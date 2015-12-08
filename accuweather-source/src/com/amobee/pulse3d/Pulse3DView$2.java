// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            Pulse3DView, Pulse3DWebView

class this._cls0
    implements Runnable
{

    final Pulse3DView this$0;

    public void run()
    {
        if (!presentAsFullscreen)
        {
            mPulse3dWebView.toggleBanner();
            return;
        } else
        {
            mPulse3dWebView.presentFullScreen();
            return;
        }
    }

    ()
    {
        this$0 = Pulse3DView.this;
        super();
    }
}
