// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.animation.Animator;
import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

// Referenced classes of package com.amobee.pulse3d:
//            Pulse3DWebView, Pulse3DView, Pulse3DViewListener

class this._cls1
    implements Runnable
{

    final oreLayoutTransition this$1;

    public void run()
    {
        if (mFullScreenHolder.getParent() != null)
        {
            ((ViewGroup)mFullScreenHolder.getParent()).removeView(mFullScreenHolder);
        }
        if (mPulse3DView != null && mPulse3DView.mBannerCoverImageView != null)
        {
            mPulse3DView.mBannerCoverImageView.setVisibility(4);
        }
        Pulse3DWebView.access$202(_fld0, false);
        inTransition = false;
        isExpanded = false;
        if (Pulse3DWebView.access$300(_fld0))
        {
            Pulse3DWebView.access$302(_fld0, false);
            ((Activity)mContext).setRequestedOrientation(appRequestedOrientation);
        }
        v.setLayoutTransition(restoreLayoutTransition);
        restoreLayoutTransition = null;
    }

    l.v()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/amobee/pulse3d/Pulse3DWebView$3

/* anonymous class */
    class Pulse3DWebView._cls3
        implements android.animation.Animator.AnimatorListener
    {

        final Pulse3DWebView this$0;
        final ViewGroup val$v;

        public void onAnimationCancel(Animator animator)
        {
        }

        public void onAnimationEnd(Animator animator)
        {
            mFullScreenHolder.removeAllViews();
            if (mPlaceholder.getParent() == null)
            {
                mPulse3DView.addView(mPlaceholder, 0);
            }
            injectJS("AdKitNative.NativeCallbacks.didEndTransition(false)");
            v.postDelayed(new Pulse3DWebView._cls3._cls1(), 1000L);
            if (mPulse3DView.mPulse3DViewListener != null)
            {
                mPulse3DView.mPulse3DViewListener.onEndTransition(mPulse3DView, false);
            }
        }

        public void onAnimationRepeat(Animator animator)
        {
        }

        public void onAnimationStart(Animator animator)
        {
        }

            
            {
                this$0 = final_pulse3dwebview;
                v = ViewGroup.this;
                super();
            }
    }

}
