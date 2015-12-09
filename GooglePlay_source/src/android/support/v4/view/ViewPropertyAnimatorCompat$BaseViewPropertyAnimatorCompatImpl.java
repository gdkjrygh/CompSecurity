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
    final class Starter
        implements Runnable
    {

        WeakReference mViewRef;
        ViewPropertyAnimatorCompat mVpa;
        final ViewPropertyAnimatorCompat.BaseViewPropertyAnimatorCompatImpl this$0;

        public final void run()
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

        Starter(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, byte byte0)
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
        ViewPropertyAnimatorCompat.access$100$65bc5e74();
        ViewPropertyAnimatorCompat.access$000$65bc5e74();
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

    Starter()
    {
        mStarterMap = null;
    }
}
