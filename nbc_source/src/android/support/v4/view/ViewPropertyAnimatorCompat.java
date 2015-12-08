// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorListener, ViewPropertyAnimatorUpdateListener, ViewPropertyAnimatorCompatICS, ViewCompat, 
//            ViewPropertyAnimatorCompatJB, ViewPropertyAnimatorCompatKK

public class ViewPropertyAnimatorCompat
{
    static class BaseViewPropertyAnimatorCompatImpl
        implements ViewPropertyAnimatorCompatImpl
    {

        WeakHashMap mStarterMap;

        private void postStartMessage(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
        {
            Runnable runnable = null;
            if (mStarterMap != null)
            {
                runnable = (Runnable)mStarterMap.get(view);
            }
            Object obj = runnable;
            if (runnable == null)
            {
                obj = new Starter(viewpropertyanimatorcompat, view);
                if (mStarterMap == null)
                {
                    mStarterMap = new WeakHashMap();
                }
                mStarterMap.put(view, obj);
            }
            view.removeCallbacks(((Runnable) (obj)));
            view.post(((Runnable) (obj)));
        }

        private void removeStartMessage(View view)
        {
            if (mStarterMap != null)
            {
                Runnable runnable = (Runnable)mStarterMap.get(view);
                if (runnable != null)
                {
                    view.removeCallbacks(runnable);
                }
            }
        }

        private void startAnimation(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
        {
            Object obj = view.getTag(0x7e000000);
            ViewPropertyAnimatorListener viewpropertyanimatorlistener = null;
            if (obj instanceof ViewPropertyAnimatorListener)
            {
                viewpropertyanimatorlistener = (ViewPropertyAnimatorListener)obj;
            }
            obj = viewpropertyanimatorcompat.mStartAction;
            viewpropertyanimatorcompat = viewpropertyanimatorcompat.mEndAction;
            if (obj != null)
            {
                ((Runnable) (obj)).run();
            }
            if (viewpropertyanimatorlistener != null)
            {
                viewpropertyanimatorlistener.onAnimationStart(view);
                viewpropertyanimatorlistener.onAnimationEnd(view);
            }
            if (viewpropertyanimatorcompat != null)
            {
                viewpropertyanimatorcompat.run();
            }
            if (mStarterMap != null)
            {
                mStarterMap.remove(view);
            }
        }

        public void alpha(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
        {
            postStartMessage(viewpropertyanimatorcompat, view);
        }

        public void cancel(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
        {
            postStartMessage(viewpropertyanimatorcompat, view);
        }

        public void scaleY(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
        {
            postStartMessage(viewpropertyanimatorcompat, view);
        }

        public void setDuration(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, long l)
        {
        }

        public void setInterpolator(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Interpolator interpolator)
        {
        }

        public void setListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorListener viewpropertyanimatorlistener)
        {
            view.setTag(0x7e000000, viewpropertyanimatorlistener);
        }

        public void setStartDelay(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, long l)
        {
        }

        public void setUpdateListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorUpdateListener viewpropertyanimatorupdatelistener)
        {
        }

        public void start(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
        {
            removeStartMessage(view);
            startAnimation(viewpropertyanimatorcompat, view);
        }

        public void translationX(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
        {
            postStartMessage(viewpropertyanimatorcompat, view);
        }

        public void translationY(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
        {
            postStartMessage(viewpropertyanimatorcompat, view);
        }


        BaseViewPropertyAnimatorCompatImpl()
        {
            mStarterMap = null;
        }
    }

    class BaseViewPropertyAnimatorCompatImpl.Starter
        implements Runnable
    {

        WeakReference mViewRef;
        ViewPropertyAnimatorCompat mVpa;
        final BaseViewPropertyAnimatorCompatImpl this$0;

        public void run()
        {
            View view = (View)mViewRef.get();
            if (view != null)
            {
                startAnimation(mVpa, view);
            }
        }

        private BaseViewPropertyAnimatorCompatImpl.Starter(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
        {
            this$0 = BaseViewPropertyAnimatorCompatImpl.this;
            super();
            mViewRef = new WeakReference(view);
            mVpa = viewpropertyanimatorcompat;
        }

    }

    static class ICSViewPropertyAnimatorCompatImpl extends BaseViewPropertyAnimatorCompatImpl
    {

        WeakHashMap mLayerMap;

        public void alpha(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
        {
            ViewPropertyAnimatorCompatICS.alpha(view, f);
        }

        public void cancel(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
        {
            ViewPropertyAnimatorCompatICS.cancel(view);
        }

        public void scaleY(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
        {
            ViewPropertyAnimatorCompatICS.scaleY(view, f);
        }

        public void setDuration(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, long l)
        {
            ViewPropertyAnimatorCompatICS.setDuration(view, l);
        }

        public void setInterpolator(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Interpolator interpolator)
        {
            ViewPropertyAnimatorCompatICS.setInterpolator(view, interpolator);
        }

        public void setListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorListener viewpropertyanimatorlistener)
        {
            view.setTag(0x7e000000, viewpropertyanimatorlistener);
            ViewPropertyAnimatorCompatICS.setListener(view, new MyVpaListener(viewpropertyanimatorcompat));
        }

        public void setStartDelay(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, long l)
        {
            ViewPropertyAnimatorCompatICS.setStartDelay(view, l);
        }

        public void start(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
        {
            ViewPropertyAnimatorCompatICS.start(view);
        }

        public void translationX(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
        {
            ViewPropertyAnimatorCompatICS.translationX(view, f);
        }

        public void translationY(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
        {
            ViewPropertyAnimatorCompatICS.translationY(view, f);
        }

        ICSViewPropertyAnimatorCompatImpl()
        {
            mLayerMap = null;
        }
    }

    static class ICSViewPropertyAnimatorCompatImpl.MyVpaListener
        implements ViewPropertyAnimatorListener
    {

        ViewPropertyAnimatorCompat mVpa;

        public void onAnimationCancel(View view)
        {
            Object obj = view.getTag(0x7e000000);
            ViewPropertyAnimatorListener viewpropertyanimatorlistener = null;
            if (obj instanceof ViewPropertyAnimatorListener)
            {
                viewpropertyanimatorlistener = (ViewPropertyAnimatorListener)obj;
            }
            if (viewpropertyanimatorlistener != null)
            {
                viewpropertyanimatorlistener.onAnimationCancel(view);
            }
        }

        public void onAnimationEnd(View view)
        {
            if (mVpa.mOldLayerType >= 0)
            {
                ViewCompat.setLayerType(view, mVpa.mOldLayerType, null);
                mVpa.mOldLayerType = -1;
            }
            if (mVpa.mEndAction != null)
            {
                mVpa.mEndAction.run();
            }
            Object obj = view.getTag(0x7e000000);
            ViewPropertyAnimatorListener viewpropertyanimatorlistener = null;
            if (obj instanceof ViewPropertyAnimatorListener)
            {
                viewpropertyanimatorlistener = (ViewPropertyAnimatorListener)obj;
            }
            if (viewpropertyanimatorlistener != null)
            {
                viewpropertyanimatorlistener.onAnimationEnd(view);
            }
        }

        public void onAnimationStart(View view)
        {
            if (mVpa.mOldLayerType >= 0)
            {
                ViewCompat.setLayerType(view, 2, null);
            }
            if (mVpa.mStartAction != null)
            {
                mVpa.mStartAction.run();
            }
            Object obj = view.getTag(0x7e000000);
            ViewPropertyAnimatorListener viewpropertyanimatorlistener = null;
            if (obj instanceof ViewPropertyAnimatorListener)
            {
                viewpropertyanimatorlistener = (ViewPropertyAnimatorListener)obj;
            }
            if (viewpropertyanimatorlistener != null)
            {
                viewpropertyanimatorlistener.onAnimationStart(view);
            }
        }

        ICSViewPropertyAnimatorCompatImpl.MyVpaListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat)
        {
            mVpa = viewpropertyanimatorcompat;
        }
    }

    static class JBMr2ViewPropertyAnimatorCompatImpl extends JBViewPropertyAnimatorCompatImpl
    {

        JBMr2ViewPropertyAnimatorCompatImpl()
        {
        }
    }

    static class JBViewPropertyAnimatorCompatImpl extends ICSViewPropertyAnimatorCompatImpl
    {

        public void setListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorListener viewpropertyanimatorlistener)
        {
            ViewPropertyAnimatorCompatJB.setListener(view, viewpropertyanimatorlistener);
        }

        JBViewPropertyAnimatorCompatImpl()
        {
        }
    }

    static class KitKatViewPropertyAnimatorCompatImpl extends JBMr2ViewPropertyAnimatorCompatImpl
    {

        public void setUpdateListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorUpdateListener viewpropertyanimatorupdatelistener)
        {
            ViewPropertyAnimatorCompatKK.setUpdateListener(view, viewpropertyanimatorupdatelistener);
        }

        KitKatViewPropertyAnimatorCompatImpl()
        {
        }
    }

    static class LollipopViewPropertyAnimatorCompatImpl extends KitKatViewPropertyAnimatorCompatImpl
    {

        LollipopViewPropertyAnimatorCompatImpl()
        {
        }
    }

    static interface ViewPropertyAnimatorCompatImpl
    {

        public abstract void alpha(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

        public abstract void cancel(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view);

        public abstract void scaleY(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

        public abstract void setDuration(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, long l);

        public abstract void setInterpolator(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Interpolator interpolator);

        public abstract void setListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorListener viewpropertyanimatorlistener);

        public abstract void setStartDelay(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, long l);

        public abstract void setUpdateListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorUpdateListener viewpropertyanimatorupdatelistener);

        public abstract void start(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view);

        public abstract void translationX(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

        public abstract void translationY(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);
    }


    static final ViewPropertyAnimatorCompatImpl IMPL;
    private Runnable mEndAction;
    private int mOldLayerType;
    private Runnable mStartAction;
    private WeakReference mView;

    ViewPropertyAnimatorCompat(View view)
    {
        mStartAction = null;
        mEndAction = null;
        mOldLayerType = -1;
        mView = new WeakReference(view);
    }

    public ViewPropertyAnimatorCompat alpha(float f)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.alpha(this, view, f);
        }
        return this;
    }

    public void cancel()
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.cancel(this, view);
        }
    }

    public ViewPropertyAnimatorCompat scaleY(float f)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.scaleY(this, view, f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat setDuration(long l)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.setDuration(this, view, l);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat setInterpolator(Interpolator interpolator)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.setInterpolator(this, view, interpolator);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat setListener(ViewPropertyAnimatorListener viewpropertyanimatorlistener)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.setListener(this, view, viewpropertyanimatorlistener);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat setStartDelay(long l)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.setStartDelay(this, view, l);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat setUpdateListener(ViewPropertyAnimatorUpdateListener viewpropertyanimatorupdatelistener)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.setUpdateListener(this, view, viewpropertyanimatorupdatelistener);
        }
        return this;
    }

    public void start()
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.start(this, view);
        }
    }

    public ViewPropertyAnimatorCompat translationX(float f)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.translationX(this, view, f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat translationY(float f)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.translationY(this, view, f);
        }
        return this;
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            IMPL = new LollipopViewPropertyAnimatorCompatImpl();
        } else
        if (i >= 19)
        {
            IMPL = new KitKatViewPropertyAnimatorCompatImpl();
        } else
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





/*
    static int access$402(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, int i)
    {
        viewpropertyanimatorcompat.mOldLayerType = i;
        return i;
    }

*/
}
