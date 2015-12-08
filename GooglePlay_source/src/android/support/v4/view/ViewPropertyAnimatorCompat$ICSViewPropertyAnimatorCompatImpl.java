// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorCompat, ViewPropertyAnimatorListener, ViewCompat

static class mLayerMap extends 
{
    static final class MyVpaListener
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
            if (ViewPropertyAnimatorCompat.access$400(mVpa) >= 0)
            {
                ViewCompat.setLayerType(view, ViewPropertyAnimatorCompat.access$400(mVpa), null);
                int _tmp = ViewPropertyAnimatorCompat.access$402$3efd0312(mVpa);
            }
            ViewPropertyAnimatorCompat.access$000$65bc5e74();
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
            if (ViewPropertyAnimatorCompat.access$400(mVpa) >= 0)
            {
                ViewCompat.setLayerType(view, 2, null);
            }
            ViewPropertyAnimatorCompat.access$100$65bc5e74();
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

        MyVpaListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat)
        {
            mVpa = viewpropertyanimatorcompat;
        }
    }


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
        view.animate().setListener(new MyVpaListener(viewpropertyanimatorcompat, view));
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

    MyVpaListener.mVpa()
    {
        mLayerMap = null;
    }
}
