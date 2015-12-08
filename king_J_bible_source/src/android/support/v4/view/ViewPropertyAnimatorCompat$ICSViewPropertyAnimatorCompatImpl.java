// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorCompat, ViewPropertyAnimatorCompatICS, ViewCompat, ViewPropertyAnimatorListener

static class _cls3.val.currentLayerType extends 
{

    public void alpha(View view, float f)
    {
        ViewPropertyAnimatorCompatICS.alpha(view, f);
    }

    public void alphaBy(View view, float f)
    {
        ViewPropertyAnimatorCompatICS.alphaBy(view, f);
    }

    public void cancel(View view)
    {
        ViewPropertyAnimatorCompatICS.cancel(view);
    }

    public long getDuration(View view)
    {
        return ViewPropertyAnimatorCompatICS.getDuration(view);
    }

    public long getStartDelay(View view)
    {
        return ViewPropertyAnimatorCompatICS.getStartDelay(view);
    }

    public void rotation(View view, float f)
    {
        ViewPropertyAnimatorCompatICS.rotation(view, f);
    }

    public void rotationBy(View view, float f)
    {
        ViewPropertyAnimatorCompatICS.rotationBy(view, f);
    }

    public void rotationX(View view, float f)
    {
        ViewPropertyAnimatorCompatICS.rotationX(view, f);
    }

    public void rotationXBy(View view, float f)
    {
        ViewPropertyAnimatorCompatICS.rotationXBy(view, f);
    }

    public void rotationY(View view, float f)
    {
        ViewPropertyAnimatorCompatICS.rotationY(view, f);
    }

    public void rotationYBy(View view, float f)
    {
        ViewPropertyAnimatorCompatICS.rotationYBy(view, f);
    }

    public void scaleX(View view, float f)
    {
        ViewPropertyAnimatorCompatICS.scaleX(view, f);
    }

    public void scaleXBy(View view, float f)
    {
        ViewPropertyAnimatorCompatICS.scaleXBy(view, f);
    }

    public void scaleY(View view, float f)
    {
        ViewPropertyAnimatorCompatICS.scaleY(view, f);
    }

    public void scaleYBy(View view, float f)
    {
        ViewPropertyAnimatorCompatICS.scaleYBy(view, f);
    }

    public void setDuration(View view, long l)
    {
        ViewPropertyAnimatorCompatICS.setDuration(view, l);
    }

    public void setInterpolator(View view, Interpolator interpolator)
    {
        ViewPropertyAnimatorCompatICS.setInterpolator(view, interpolator);
    }

    public void setListener(View view, ViewPropertyAnimatorListener viewpropertyanimatorlistener)
    {
        ViewPropertyAnimatorCompatICS.setListener(view, viewpropertyanimatorlistener);
    }

    public void setStartDelay(View view, long l)
    {
        ViewPropertyAnimatorCompatICS.setStartDelay(view, l);
    }

    public void start(View view)
    {
        ViewPropertyAnimatorCompatICS.start(view);
    }

    public void translationX(View view, float f)
    {
        ViewPropertyAnimatorCompatICS.translationX(view, f);
    }

    public void translationXBy(View view, float f)
    {
        ViewPropertyAnimatorCompatICS.translationXBy(view, f);
    }

    public void translationY(View view, float f)
    {
        ViewPropertyAnimatorCompatICS.translationY(view, f);
    }

    public void translationYBy(View view, float f)
    {
        ViewPropertyAnimatorCompatICS.translationYBy(view, f);
    }

    public void withEndAction(View view, final Runnable runnable)
    {
        setListener(view, new ViewPropertyAnimatorListener() {

            final ViewPropertyAnimatorCompat.ICSViewPropertyAnimatorCompatImpl this$0;
            final Runnable val$runnable;

            public void onAnimationCancel(View view1)
            {
            }

            public void onAnimationEnd(View view1)
            {
                runnable.run();
                setListener(view1, null);
            }

            public void onAnimationStart(View view1)
            {
            }

            
            {
                this$0 = ViewPropertyAnimatorCompat.ICSViewPropertyAnimatorCompatImpl.this;
                runnable = runnable1;
                super();
            }
        });
    }

    public void withLayer(View view)
    {
        setListener(view, new ViewPropertyAnimatorListener() {

            final ViewPropertyAnimatorCompat.ICSViewPropertyAnimatorCompatImpl this$0;
            final int val$currentLayerType;

            public void onAnimationCancel(View view1)
            {
            }

            public void onAnimationEnd(View view1)
            {
                ViewCompat.setLayerType(view1, currentLayerType, null);
                setListener(view1, null);
            }

            public void onAnimationStart(View view1)
            {
                ViewCompat.setLayerType(view1, 2, null);
            }

            
            {
                this$0 = ViewPropertyAnimatorCompat.ICSViewPropertyAnimatorCompatImpl.this;
                currentLayerType = i;
                super();
            }
        });
    }

    public void withStartAction(View view, final Runnable runnable)
    {
        setListener(view, new ViewPropertyAnimatorListener() {

            final ViewPropertyAnimatorCompat.ICSViewPropertyAnimatorCompatImpl this$0;
            final Runnable val$runnable;

            public void onAnimationCancel(View view1)
            {
            }

            public void onAnimationEnd(View view1)
            {
            }

            public void onAnimationStart(View view1)
            {
                runnable.run();
                setListener(view1, null);
            }

            
            {
                this$0 = ViewPropertyAnimatorCompat.ICSViewPropertyAnimatorCompatImpl.this;
                runnable = runnable1;
                super();
            }
        });
    }

    public void x(View view, float f)
    {
        ViewPropertyAnimatorCompatICS.x(view, f);
    }

    public void xBy(View view, float f)
    {
        ViewPropertyAnimatorCompatICS.xBy(view, f);
    }

    public void y(View view, float f)
    {
        ViewPropertyAnimatorCompatICS.y(view, f);
    }

    public void yBy(View view, float f)
    {
        ViewPropertyAnimatorCompatICS.yBy(view, f);
    }

    _cls3.val.currentLayerType()
    {
    }
}
