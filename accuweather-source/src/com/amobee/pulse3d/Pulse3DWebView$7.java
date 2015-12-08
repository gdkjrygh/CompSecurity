// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.animation.Animator;
import android.app.Activity;
import android.view.ViewGroup;

// Referenced classes of package com.amobee.pulse3d:
//            Pulse3DWebView, Pulse3DView, Pulse3DViewListener

class val.v
    implements android.animation.Listener
{

    final Pulse3DWebView this$0;
    final ViewGroup val$v;

    public void onAnimationCancel(Animator animator)
    {
    }

    public void onAnimationEnd(Animator animator)
    {
        injectJS("AdKitNative.NativeCallbacks.didEndTransition(false)");
        mPulse3DView.post(new Runnable() {

            final Pulse3DWebView._cls7 this$1;

            public void run()
            {
                v.setLayoutTransition(restoreLayoutTransition);
                restoreLayoutTransition = null;
                if (Pulse3DWebView.access$300(this$0))
                {
                    Pulse3DWebView.access$302(this$0, false);
                    ((Activity)mContext).setRequestedOrientation(appRequestedOrientation);
                }
                if (mPulse3DView.mPulse3DViewListener != null)
                {
                    mPulse3DView.mPulse3DViewListener.onEndTransition(mPulse3DView, false);
                }
                if (mPulse3DView.getParent() != null)
                {
                    ((ViewGroup)mPulse3DView.getParent()).removeView(mPulse3DView);
                }
            }

            
            {
                this$1 = Pulse3DWebView._cls7.this;
                super();
            }
        });
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
    }

    _cls1.this._cls1()
    {
        this$0 = final_pulse3dwebview;
        val$v = ViewGroup.this;
        super();
    }
}
