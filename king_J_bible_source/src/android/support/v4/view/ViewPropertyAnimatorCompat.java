// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorListener, ViewPropertyAnimatorCompatICS, ViewCompat, ViewPropertyAnimatorCompatJellybeanMr2, 
//            ViewPropertyAnimatorCompatJB

public class ViewPropertyAnimatorCompat
{
    static class BaseViewPropertyAnimatorCompatImpl
        implements ViewPropertyAnimatorCompatImpl
    {

        public void alpha(View view, float f)
        {
        }

        public void alphaBy(View view, float f)
        {
        }

        public void cancel(View view)
        {
        }

        public long getDuration(View view)
        {
            return 0L;
        }

        public Interpolator getInterpolator(View view)
        {
            return null;
        }

        public long getStartDelay(View view)
        {
            return 0L;
        }

        public void rotation(View view, float f)
        {
        }

        public void rotationBy(View view, float f)
        {
        }

        public void rotationX(View view, float f)
        {
        }

        public void rotationXBy(View view, float f)
        {
        }

        public void rotationY(View view, float f)
        {
        }

        public void rotationYBy(View view, float f)
        {
        }

        public void scaleX(View view, float f)
        {
        }

        public void scaleXBy(View view, float f)
        {
        }

        public void scaleY(View view, float f)
        {
        }

        public void scaleYBy(View view, float f)
        {
        }

        public void setDuration(View view, long l)
        {
        }

        public void setInterpolator(View view, Interpolator interpolator)
        {
        }

        public void setListener(View view, ViewPropertyAnimatorListener viewpropertyanimatorlistener)
        {
        }

        public void setStartDelay(View view, long l)
        {
        }

        public void start(View view)
        {
        }

        public void translationX(View view, float f)
        {
        }

        public void translationXBy(View view, float f)
        {
        }

        public void translationY(View view, float f)
        {
        }

        public void translationYBy(View view, float f)
        {
        }

        public void withEndAction(View view, Runnable runnable)
        {
            runnable.run();
        }

        public void withLayer(View view)
        {
        }

        public void withStartAction(View view, Runnable runnable)
        {
            runnable.run();
        }

        public void x(View view, float f)
        {
        }

        public void xBy(View view, float f)
        {
        }

        public void y(View view, float f)
        {
        }

        public void yBy(View view, float f)
        {
        }

        BaseViewPropertyAnimatorCompatImpl()
        {
        }
    }

    static class ICSViewPropertyAnimatorCompatImpl extends BaseViewPropertyAnimatorCompatImpl
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

        public void withEndAction(View view, Runnable runnable)
        {
            setListener(view, runnable. new ViewPropertyAnimatorListener() {

                final ICSViewPropertyAnimatorCompatImpl this$0;
                final Runnable val$runnable;

                public void onAnimationCancel(View view)
                {
                }

                public void onAnimationEnd(View view)
                {
                    runnable.run();
                    setListener(view, null);
                }

                public void onAnimationStart(View view)
                {
                }

            
            {
                this$0 = final_icsviewpropertyanimatorcompatimpl;
                runnable = Runnable.this;
                super();
            }
            });
        }

        public void withLayer(View view)
        {
            setListener(view, ViewCompat.getLayerType(view). new ViewPropertyAnimatorListener() {

                final ICSViewPropertyAnimatorCompatImpl this$0;
                final int val$currentLayerType;

                public void onAnimationCancel(View view)
                {
                }

                public void onAnimationEnd(View view)
                {
                    ViewCompat.setLayerType(view, currentLayerType, null);
                    setListener(view, null);
                }

                public void onAnimationStart(View view)
                {
                    ViewCompat.setLayerType(view, 2, null);
                }

            
            {
                this$0 = final_icsviewpropertyanimatorcompatimpl;
                currentLayerType = I.this;
                super();
            }
            });
        }

        public void withStartAction(View view, Runnable runnable)
        {
            setListener(view, runnable. new ViewPropertyAnimatorListener() {

                final ICSViewPropertyAnimatorCompatImpl this$0;
                final Runnable val$runnable;

                public void onAnimationCancel(View view)
                {
                }

                public void onAnimationEnd(View view)
                {
                }

                public void onAnimationStart(View view)
                {
                    runnable.run();
                    setListener(view, null);
                }

            
            {
                this$0 = final_icsviewpropertyanimatorcompatimpl;
                runnable = Runnable.this;
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

        ICSViewPropertyAnimatorCompatImpl()
        {
        }
    }

    static class JBMr2ViewPropertyAnimatorCompatImpl extends JBViewPropertyAnimatorCompatImpl
    {

        public Interpolator getInterpolator(View view)
        {
            return ViewPropertyAnimatorCompatJellybeanMr2.getInterpolator(view);
        }

        JBMr2ViewPropertyAnimatorCompatImpl()
        {
        }
    }

    static class JBViewPropertyAnimatorCompatImpl extends ICSViewPropertyAnimatorCompatImpl
    {

        public void withEndAction(View view, Runnable runnable)
        {
            ViewPropertyAnimatorCompatJB.withEndAction(view, runnable);
        }

        public void withLayer(View view)
        {
            ViewPropertyAnimatorCompatJB.withLayer(view);
        }

        public void withStartAction(View view, Runnable runnable)
        {
            ViewPropertyAnimatorCompatJB.withStartAction(view, runnable);
        }

        JBViewPropertyAnimatorCompatImpl()
        {
        }
    }

    static interface ViewPropertyAnimatorCompatImpl
    {

        public abstract void alpha(View view, float f);

        public abstract void alphaBy(View view, float f);

        public abstract void cancel(View view);

        public abstract long getDuration(View view);

        public abstract Interpolator getInterpolator(View view);

        public abstract long getStartDelay(View view);

        public abstract void rotation(View view, float f);

        public abstract void rotationBy(View view, float f);

        public abstract void rotationX(View view, float f);

        public abstract void rotationXBy(View view, float f);

        public abstract void rotationY(View view, float f);

        public abstract void rotationYBy(View view, float f);

        public abstract void scaleX(View view, float f);

        public abstract void scaleXBy(View view, float f);

        public abstract void scaleY(View view, float f);

        public abstract void scaleYBy(View view, float f);

        public abstract void setDuration(View view, long l);

        public abstract void setInterpolator(View view, Interpolator interpolator);

        public abstract void setListener(View view, ViewPropertyAnimatorListener viewpropertyanimatorlistener);

        public abstract void setStartDelay(View view, long l);

        public abstract void start(View view);

        public abstract void translationX(View view, float f);

        public abstract void translationXBy(View view, float f);

        public abstract void translationY(View view, float f);

        public abstract void translationYBy(View view, float f);

        public abstract void withEndAction(View view, Runnable runnable);

        public abstract void withLayer(View view);

        public abstract void withStartAction(View view, Runnable runnable);

        public abstract void x(View view, float f);

        public abstract void xBy(View view, float f);

        public abstract void y(View view, float f);

        public abstract void yBy(View view, float f);
    }


    static final ViewPropertyAnimatorCompatImpl IMPL;
    private static final String TAG = "ViewAnimatorCompat";
    private WeakReference mView;

    ViewPropertyAnimatorCompat(View view)
    {
        mView = new WeakReference(view);
    }

    public ViewPropertyAnimatorCompat alpha(float f)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.alpha(view, f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat alphaBy(float f)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.alphaBy(view, f);
        }
        return this;
    }

    public void cancel()
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.cancel(view);
        }
    }

    public long getDuration()
    {
        View view = (View)mView.get();
        if (view != null)
        {
            return IMPL.getDuration(view);
        } else
        {
            return 0L;
        }
    }

    public Interpolator getInterpolator()
    {
        View view = (View)mView.get();
        if (view != null)
        {
            return IMPL.getInterpolator(view);
        } else
        {
            return null;
        }
    }

    public long getStartDelay()
    {
        View view = (View)mView.get();
        if (view != null)
        {
            return IMPL.getStartDelay(view);
        } else
        {
            return 0L;
        }
    }

    public ViewPropertyAnimatorCompat rotation(float f)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.rotation(view, f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat rotationBy(float f)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.rotationBy(view, f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat rotationX(float f)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.rotationX(view, f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat rotationXBy(float f)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.rotationXBy(view, f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat rotationY(float f)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.rotationY(view, f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat rotationYBy(float f)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.rotationYBy(view, f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat scaleX(float f)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.scaleX(view, f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat scaleXBy(float f)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.scaleXBy(view, f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat scaleY(float f)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.scaleY(view, f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat scaleYBy(float f)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.scaleYBy(view, f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat setDuration(long l)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.setDuration(view, l);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat setInterpolator(Interpolator interpolator)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.setInterpolator(view, interpolator);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat setListener(ViewPropertyAnimatorListener viewpropertyanimatorlistener)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.setListener(view, viewpropertyanimatorlistener);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat setStartDelay(long l)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.setStartDelay(view, l);
        }
        return this;
    }

    public void start()
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.start(view);
        }
    }

    public ViewPropertyAnimatorCompat translationX(float f)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.translationX(view, f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat translationXBy(float f)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.translationXBy(view, f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat translationY(float f)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.translationY(view, f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat translationYBy(float f)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.translationYBy(view, f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat withEndAction(Runnable runnable)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.withEndAction(view, runnable);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat withLayer()
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.withLayer(view);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat withStartAction(Runnable runnable)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.withStartAction(view, runnable);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat x(float f)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.x(view, f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat xBy(float f)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.xBy(view, f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat y(float f)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.y(view, f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat yBy(float f)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.yBy(view, f);
        }
        return this;
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 18)
        {
            IMPL = new JBMr2ViewPropertyAnimatorCompatImpl();
        } else
        if (i >= 16)
        {
            IMPL = new JBViewPropertyAnimatorCompatImpl();
        } else
        if (i >= 14)
        {
            IMPL = new ICSViewPropertyAnimatorCompatImpl();
        } else
        {
            IMPL = new BaseViewPropertyAnimatorCompatImpl();
        }
    }
}
