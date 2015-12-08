// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.animation.Animator;
import android.view.ViewGroup;

// Referenced classes of package com.amobee.pulse3d:
//            Pulse3DWebView, Pulse3DView, Pulse3DViewListener

class this._cls1
    implements Runnable
{

    final oreLayoutTransition this$1;

    public void run()
    {
        v.setLayoutTransition(restoreLayoutTransition);
        restoreLayoutTransition = null;
    }

    l.v()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/amobee/pulse3d/Pulse3DWebView$6

/* anonymous class */
    class Pulse3DWebView._cls6
        implements android.animation.Animator.AnimatorListener
    {

        final Pulse3DWebView this$0;
        final ViewGroup val$v;

        public void onAnimationCancel(Animator animator)
        {
        }

        public void onAnimationEnd(Animator animator)
        {
            while (mPulse3DView == null || mPulse3DView.mPulse3dWebView == null) 
            {
                return;
            }
            v.postDelayed(new Pulse3DWebView._cls6._cls1(), 500L);
            injectJS("AdKitNative.NativeCallbacks.didEndTransition(true)");
            mPulse3DView.mPulse3dWebView.requestFocus(130);
            inTransition = false;
            if (mPulse3DView.mPulse3DViewListener != null)
            {
                mPulse3DView.mPulse3DViewListener.onEndTransition(mPulse3DView, true);
            }
            isExpanded = true;
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
