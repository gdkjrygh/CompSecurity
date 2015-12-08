// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;

// Referenced classes of package com.amobee.pulse3d:
//            Pulse3DWebView, Pulse3DView, Pulse3DViewListener, Utility

class this._cls2
    implements android.view.animation.stener
{

    final holder this$2;

    public void onAnimationEnd(Animation animation)
    {
        v.removeView(mFullScreenHolder);
        mPlaceholder.setVisibility(0);
        if (android.os. >= 16)
        {
            mFullScreenHolder.setBackground(null);
        } else
        {
            mFullScreenHolder.setBackgroundDrawable(null);
        }
        Pulse3DWebView.access$202(_fld0, false);
        inTransition = false;
        isExpanded = false;
        if (mPulse3DView.mPulse3DViewListener != null)
        {
            mPulse3DView.mPulse3DViewListener.onEndTransition(mPulse3DView, false);
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        mFullScreenHolder.removeView(mPlaceholder);
        if (mPlaceholder.getParent() == null)
        {
            mPulse3DView.addView(mPlaceholder);
        }
    }

    v()
    {
        this$2 = this._cls2.this;
        super();
    }

    // Unreferenced inner class com/amobee/pulse3d/Pulse3DWebView$2

/* anonymous class */
    class Pulse3DWebView._cls2
        implements Runnable
    {

        final Pulse3DWebView this$0;
        final int val$bannerheight;
        final int val$bannerwidth;
        final Pulse3DWebView val$p3dwv;
        final int val$rootHeight;
        final int val$rootWidth;
        final ViewGroup val$v;

        public void run()
        {
            Bitmap bitmap = Utility.createBitmapFromGLSurface(0, 0, rootWidth, rootHeight);
            mPlaceholder.post(bitmap. new Pulse3DWebView._cls2._cls1());
        }

            
            {
                this$0 = final_pulse3dwebview;
                rootWidth = i;
                rootHeight = j;
                p3dwv = pulse3dwebview1;
                bannerwidth = k;
                bannerheight = l;
                v = ViewGroup.this;
                super();
            }
    }


    // Unreferenced inner class com/amobee/pulse3d/Pulse3DWebView$2$1

/* anonymous class */
    class Pulse3DWebView._cls2._cls1
        implements Runnable
    {

        final Pulse3DWebView._cls2 this$1;
        final Bitmap val$glSurfaceCapture;

        public void run()
        {
            if (glSurfaceCapture != null)
            {
                Object obj = Pulse3DWebView.loadBitmapFromView(p3dwv, glSurfaceCapture);
                glSurfaceCapture.recycle();
                obj = new BitmapDrawable(((Bitmap) (obj)));
                if (android.os.Build.VERSION.SDK_INT >= 16)
                {
                    mFullScreenHolder.setBackground(((android.graphics.drawable.Drawable) (obj)));
                } else
                {
                    mFullScreenHolder.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj)));
                }
            }
            mPlaceholder.setVisibility(4);
            injectJS((new StringBuilder()).append("AdKitNative.NativeCallbacks.willStartTransition(false, 0.0, ").append(bannerwidth).append(", ").append(bannerheight).append(")").toString());
            injectJS("AdKitNative.NativeCallbacks.didEndTransition(false)");
            obj = new TranslateAnimation(0.0F, 0.0F, 0.0F, rootHeight);
            ((Animation) (obj)).setDuration(700L);
            ((Animation) (obj)).setRepeatMode(1);
            ((Animation) (obj)).setRepeatCount(0);
            ((Animation) (obj)).setAnimationListener(new Pulse3DWebView._cls2._cls1._cls1());
            mFullScreenHolder.startAnimation(((Animation) (obj)));
        }

            
            {
                this$1 = final__pcls2;
                glSurfaceCapture = Bitmap.this;
                super();
            }
    }

}
