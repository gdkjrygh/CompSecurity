// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorCompat, ViewPropertyAnimatorListener, ViewPropertyAnimatorUpdateListener

static class mStarterMap
    implements mStarterMap
{
    class Starter
        implements Runnable
    {

        WeakReference mViewRef;
        ViewPropertyAnimatorCompat mVpa;
        final ViewPropertyAnimatorCompat.BaseViewPropertyAnimatorCompatImpl this$0;

        public void run()
        {
            View view = (View)mViewRef.get();
            if (view != null)
            {
                startAnimation(mVpa, view);
            }
        }

        private Starter(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
        {
            this$0 = ViewPropertyAnimatorCompat.BaseViewPropertyAnimatorCompatImpl.this;
            super();
            mViewRef = new WeakReference(view);
            mVpa = viewpropertyanimatorcompat;
        }

        Starter(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorCompat._cls1 _pcls1)
        {
            this(viewpropertyanimatorcompat, view);
        }
    }


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
            obj = new Starter(viewpropertyanimatorcompat, view, null);
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
        obj = ViewPropertyAnimatorCompat.access$100(viewpropertyanimatorcompat);
        viewpropertyanimatorcompat = ViewPropertyAnimatorCompat.access$000(viewpropertyanimatorcompat);
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


    Starter()
    {
        mStarterMap = null;
    }
}
