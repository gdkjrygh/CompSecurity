// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.animation.Animator;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

// Referenced classes of package com.amobee.pulse3d:
//            Pulse3DWebView, Pulse3DView, Pulse3DGLRenderer, Log, 
//            Pulse3DViewListener, Utility

class val.glSurfaceCapture
    implements Runnable
{

    final panded this$1;
    final Bitmap val$glSurfaceCapture;

    public void run()
    {
        if (val$glSurfaceCapture != null)
        {
            Bitmap bitmap = Pulse3DWebView.loadBitmapFromView(p3dwv, val$glSurfaceCapture);
            val$glSurfaceCapture.recycle();
            mPulse3DView.mBannerCoverImageView.setImageBitmap(bitmap);
            mPulse3DView.mBannerCoverImageView.setVisibility(0);
            mPulse3DView.mBannerCoverImageView.bringToFront();
        }
        mPulse3DView.removeView(mPlaceholder);
        if (mPlaceholder.getParent() == null)
        {
            mFullScreenHolder.addView(mPlaceholder);
        }
        if (android.os.NT >= 11)
        {
            LayoutTransition layouttransition = new LayoutTransition();
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(null, "translationY", new float[] {
                (float)_rootHeight, 0.0F
            });
            objectanimator.addListener(new android.animation.Animator.AnimatorListener() {

                final Pulse3DWebView._cls5._cls1 this$2;

                public void onAnimationCancel(Animator animator)
                {
                }

                public void onAnimationEnd(Animator animator)
                {
                    while (mPulse3DView == null || mPulse3DView.mPulse3dWebView == null) 
                    {
                        return;
                    }
                    injectJS("AdKitNative.NativeCallbacks.didEndTransition(true)");
                    mPulse3DView.mPulse3dWebView.requestFocus(130);
                    inTransition = false;
                    if (mPulse3DView.mPulse3DViewListener != null)
                    {
                        mPulse3DView.mPulse3DViewListener.onEndTransition(mPulse3DView, true);
                    }
                    isExpanded = true;
                    v.postDelayed(new Runnable() {

                        final _cls1 this$3;

                        public void run()
                        {
                            Pulse3DWebView.access$202(this$0, false);
                            v.setLayoutTransition(restoreLayoutTransition);
                            restoreLayoutTransition = null;
                        }

            
            {
                this$3 = _cls1.this;
                super();
            }
                    }, 500L);
                }

                public void onAnimationRepeat(Animator animator)
                {
                }

                public void onAnimationStart(Animator animator)
                {
                }

            
            {
                this$2 = Pulse3DWebView._cls5._cls1.this;
                super();
            }
            });
            layouttransition.setAnimator(2, objectanimator);
            layouttransition.setDuration(2, 400L);
            layouttransition.setStartDelay(2, 800L);
            restoreLayoutTransition = v.getLayoutTransition();
            v.setLayoutTransition(layouttransition);
            injectJS((new StringBuilder()).append("AdKitNative.NativeCallbacks.willStartTransition(true, 0.5, ").append(fullWidth).append(", ").append(fullHeight).append(")").toString());
            Log.d("Pulse3DWebView", (new StringBuilder()).append("22 willStartTransition: w ").append(fullWidth).append(" h").append(fullHeight).append(" scale:").append(Pulse3DGLRenderer.content_scale).append(" rootWidth").append(_rootWidth).append(" rootHeight").append(_rootHeight).toString());
            if (mFullScreenHolder.getParent() == null)
            {
                v.addView(mFullScreenHolder);
            }
            return;
        }
        mPlaceholder.setVisibility(0);
        injectJS((new StringBuilder()).append("AdKitNative.NativeCallbacks.willStartTransition(true, 0.5, ").append(fullWidth).append(", ").append(fullHeight).append(")").toString());
        Log.d("Pulse3DWebView", (new StringBuilder()).append("33 willStartTransition: w ").append(fullWidth).append(" h").append(fullHeight).toString());
        v.addView(mFullScreenHolder);
        injectJS("AdKitNative.NativeCallbacks.didEndTransition(true)");
        inTransition = false;
        if (mPulse3DView.mPulse3DViewListener != null)
        {
            mPulse3DView.mPulse3DViewListener.onEndTransition(mPulse3DView, true);
        }
        isExpanded = true;
    }

    l._rootWidth()
    {
        this$1 = final__prootwidth;
        val$glSurfaceCapture = Bitmap.this;
        super();
    }

    // Unreferenced inner class com/amobee/pulse3d/Pulse3DWebView$5

/* anonymous class */
    class Pulse3DWebView._cls5
        implements Runnable
    {

        final Pulse3DWebView this$0;
        final int val$_rootHeight;
        final int val$_rootWidth;
        final int val$bgHeight;
        final int val$bgWidth;
        final int val$fullHeight;
        final int val$fullWidth;
        final Pulse3DWebView val$p3dwv;
        final ViewGroup val$v;

        public void run()
        {
            Bitmap bitmap = Utility.createBitmapFromGLSurface(0, 0, bgWidth, bgHeight);
            mPlaceholder.post(bitmap. new Pulse3DWebView._cls5._cls1());
        }

            
            {
                this$0 = final_pulse3dwebview;
                bgWidth = i;
                bgHeight = j;
                p3dwv = pulse3dwebview1;
                _rootHeight = k;
                v = viewgroup;
                fullWidth = l;
                fullHeight = i1;
                _rootWidth = I.this;
                super();
            }
    }

}
