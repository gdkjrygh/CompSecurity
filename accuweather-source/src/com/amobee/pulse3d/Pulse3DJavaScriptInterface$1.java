// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.widget.ImageView;
import android.widget.RelativeLayout;

// Referenced classes of package com.amobee.pulse3d:
//            Pulse3DJavaScriptInterface, Pulse3DView, Pulse3DGLSurfaceView, Pulse3DGLRenderer, 
//            Pulse3DViewListener

class this._cls0
    implements Runnable
{

    final Pulse3DJavaScriptInterface this$0;

    public void run()
    {
        Pulse3DJavaScriptInterface.access$000(Pulse3DJavaScriptInterface.this).mPlaceHolder.setVisibility(0);
        if (Pulse3DJavaScriptInterface.access$000(Pulse3DJavaScriptInterface.this).mBannerCoverImageView != null)
        {
            Pulse3DJavaScriptInterface.access$000(Pulse3DJavaScriptInterface.this).mBannerCoverImageView.setVisibility(4);
        }
        Pulse3DJavaScriptInterface.access$000(Pulse3DJavaScriptInterface.this).mGLView.renderer.ready = true;
        if (!isRedrawSuspended)
        {
            Pulse3DJavaScriptInterface.access$000(Pulse3DJavaScriptInterface.this).mGLView.requestRender();
        }
        if (Pulse3DJavaScriptInterface.access$000(Pulse3DJavaScriptInterface.this).mPulse3DViewListener != null)
        {
            Pulse3DJavaScriptInterface.access$000(Pulse3DJavaScriptInterface.this).mPulse3DViewListener.onFinishLoadingSceneAtURL(Pulse3DJavaScriptInterface.access$000(Pulse3DJavaScriptInterface.this), Pulse3DJavaScriptInterface.access$000(Pulse3DJavaScriptInterface.this).mURL);
        }
    }

    ()
    {
        this$0 = Pulse3DJavaScriptInterface.this;
        super();
    }
}
