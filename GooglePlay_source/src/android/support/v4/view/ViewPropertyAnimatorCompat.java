// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorListener, ViewPropertyAnimatorUpdateListener, ViewCompat

public final class ViewPropertyAnimatorCompat
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
                obj = new Starter(viewpropertyanimatorcompat, view, (byte)0);
                if (mStarterMap == null)
                {
                    mStarterMap = new WeakHashMap();
                }
                mStarterMap.put(view, obj);
            }
            view.removeCallbacks(((Runnable) (obj)));
            view.post(((Runnable) (obj)));
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

        public void setDuration$65a8a4c6(View view, long l)
        {
        }

        public void setInterpolator$4b3df29b(View view, Interpolator interpolator)
        {
        }

        public void setListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorListener viewpropertyanimatorlistener)
        {
            view.setTag(0x7e000000, viewpropertyanimatorlistener);
        }

        public void setUpdateListener$587f161e(View view, ViewPropertyAnimatorUpdateListener viewpropertyanimatorupdatelistener)
        {
        }

        public void start(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
        {
            if (mStarterMap != null)
            {
                Runnable runnable = (Runnable)mStarterMap.get(view);
                if (runnable != null)
                {
                    view.removeCallbacks(runnable);
                }
            }
            startAnimation(viewpropertyanimatorcompat, view);
        }

        final void startAnimation(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
        {
            Object obj = view.getTag(0x7e000000);
            viewpropertyanimatorcompat = null;
            if (obj instanceof ViewPropertyAnimatorListener)
            {
                viewpropertyanimatorcompat = (ViewPropertyAnimatorListener)obj;
            }
            null;
            null;
            if (viewpropertyanimatorcompat != null)
            {
                viewpropertyanimatorcompat.onAnimationStart(view);
                viewpropertyanimatorcompat.onAnimationEnd(view);
            }
            if (mStarterMap != null)
            {
                mStarterMap.remove(view);
            }
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

    final class BaseViewPropertyAnimatorCompatImpl.Starter
        implements Runnable
    {

        WeakReference mViewRef;
        ViewPropertyAnimatorCompat mVpa;
        final BaseViewPropertyAnimatorCompatImpl this$0;

        public final void run()
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

        BaseViewPropertyAnimatorCompatImpl.Starter(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, byte byte0)
        {
            this(viewpropertyanimatorcompat, view);
        }
    }

    static class ICSViewPropertyAnimatorCompatImpl extends BaseViewPropertyAnimatorCompatImpl
    {

        WeakHashMap mLayerMap;

        public final void alpha(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
        {
            view.animate().alpha(f);
        }

        public final void cancel(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
        {
            view.animate().cancel();
        }

        public final void scaleY(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
        {
            view.animate().scaleY(1.0F);
        }

        public final void setDuration$65a8a4c6(View view, long l)
        {
            view.animate().setDuration(l);
        }

        public final void setInterpolator$4b3df29b(View view, Interpolator interpolator)
        {
            view.animate().setInterpolator(interpolator);
        }

        public void setListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorListener viewpropertyanimatorlistener)
        {
            view.setTag(0x7e000000, viewpropertyanimatorlistener);
            viewpropertyanimatorcompat = new MyVpaListener(viewpropertyanimatorcompat);
            view.animate().setListener(new ViewPropertyAnimatorCompatICS._cls1(viewpropertyanimatorcompat, view));
        }

        public final void start(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
        {
            view.animate().start();
        }

        public final void translationX(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
        {
            view.animate().translationX(f);
        }

        public final void translationY(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
        {
            view.animate().translationY(f);
        }

        ICSViewPropertyAnimatorCompatImpl()
        {
            mLayerMap = null;
        }
    }

    static final class ICSViewPropertyAnimatorCompatImpl.MyVpaListener
        implements ViewPropertyAnimatorListener
    {

        ViewPropertyAnimatorCompat mVpa;

        public final void onAnimationCancel(View view)
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

        public final void onAnimationEnd(View view)
        {
            if (mVpa.mOldLayerType >= 0)
            {
                ViewCompat.setLayerType(view, mVpa.mOldLayerType, null);
                mVpa.mOldLayerType;
            }
            null;
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

        public final void onAnimationStart(View view)
        {
            if (mVpa.mOldLayerType >= 0)
            {
                ViewCompat.setLayerType(view, 2, null);
            }
            null;
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

        public final void setListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorListener viewpropertyanimatorlistener)
        {
            if (viewpropertyanimatorlistener != null)
            {
                view.animate().setListener(new ViewPropertyAnimatorCompatJB._cls1(viewpropertyanimatorlistener, view));
                return;
            } else
            {
                view.animate().setListener(null);
                return;
            }
        }

        JBViewPropertyAnimatorCompatImpl()
        {
        }
    }

    static class KitKatViewPropertyAnimatorCompatImpl extends JBMr2ViewPropertyAnimatorCompatImpl
    {

        public final void setUpdateListener$587f161e(View view, ViewPropertyAnimatorUpdateListener viewpropertyanimatorupdatelistener)
        {
            view.animate().setUpdateListener(new ViewPropertyAnimatorCompatKK._cls1(viewpropertyanimatorupdatelistener, view));
        }

        KitKatViewPropertyAnimatorCompatImpl()
        {
        }
    }

    static final class LollipopViewPropertyAnimatorCompatImpl extends KitKatViewPropertyAnimatorCompatImpl
    {

        LollipopViewPropertyAnimatorCompatImpl()
        {
        }
    }

    public static interface ViewPropertyAnimatorCompatImpl
    {

        public abstract void alpha(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

        public abstract void cancel(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view);

        public abstract void scaleY(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

        public abstract void setDuration$65a8a4c6(View view, long l);

        public abstract void setInterpolator$4b3df29b(View view, Interpolator interpolator);

        public abstract void setListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorListener viewpropertyanimatorlistener);

        public abstract void setUpdateListener$587f161e(View view, ViewPropertyAnimatorUpdateListener viewpropertyanimatorupdatelistener);

        public abstract void start(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view);

        public abstract void translationX(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

        public abstract void translationY(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);
    }


    public static final ViewPropertyAnimatorCompatImpl IMPL;
    private Runnable mEndAction;
    private int mOldLayerType;
    private Runnable mStartAction;
    public WeakReference mView;

    ViewPropertyAnimatorCompat(View view)
    {
        mStartAction = null;
        mEndAction = null;
        mOldLayerType = -1;
        mView = new WeakReference(view);
    }

    public final ViewPropertyAnimatorCompat alpha(float f)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.alpha(this, view, f);
        }
        return this;
    }

    public final void cancel()
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.cancel(this, view);
        }
    }

    public final ViewPropertyAnimatorCompat setDuration(long l)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL._mth65a8a4c6(view, l);
        }
        return this;
    }

    public final ViewPropertyAnimatorCompat setInterpolator(Interpolator interpolator)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL._mth4b3df29b(view, interpolator);
        }
        return this;
    }

    public final ViewPropertyAnimatorCompat setListener(ViewPropertyAnimatorListener viewpropertyanimatorlistener)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.setListener(this, view, viewpropertyanimatorlistener);
        }
        return this;
    }

    public final ViewPropertyAnimatorCompat setUpdateListener(ViewPropertyAnimatorUpdateListener viewpropertyanimatorupdatelistener)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL._mth587f161e(view, viewpropertyanimatorupdatelistener);
        }
        return this;
    }

    public final void start()
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.start(this, view);
        }
    }

    public final ViewPropertyAnimatorCompat translationX(float f)
    {
        View view = (View)mView.get();
        if (view != null)
        {
            IMPL.translationX(this, view, f);
        }
        return this;
    }

    public final ViewPropertyAnimatorCompat translationY(float f)
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
    static int access$402$3efd0312(ViewPropertyAnimatorCompat viewpropertyanimatorcompat)
    {
        viewpropertyanimatorcompat.mOldLayerType = -1;
        return -1;
    }

*/
}
