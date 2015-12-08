// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            Pulse3DWebView, Pulse3DView

class this._cls0
    implements Runnable
{

    final Pulse3DWebView this$0;

    public void run()
    {
        isExpanded = false;
        inTransition = false;
        mPulse3DView.setVisibility(4);
    }

    ()
    {
        this$0 = Pulse3DWebView.this;
        super();
    }
}
