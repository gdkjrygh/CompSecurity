// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorCompat, ViewPropertyAnimatorCompatICS, ViewPropertyAnimatorListener, ViewCompat

static class mLayerMap extends 
{
    static class MyVpaListener
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
            if (ViewPropertyAnimatorCompat.access$400(mVpa) >= 0)
            {
                ViewCompat.setLayerType(view, ViewPropertyAnimatorCompat.access$400(mVpa), null);
                ViewPropertyAnimatorCompat.access$402(mVpa, -1);
            }
            if (ViewPropertyAnimatorCompat.access$000(mVpa) != null)
            {
                ViewPropertyAnimatorCompat.access$000(mVpa).run();
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
            if (ViewPropertyAnimatorCompat.access$400(mVpa) >= 0)
            {
                ViewCompat.setLayerType(view, 2, null);
            }
            if (ViewPropertyAnimatorCompat.access$100(mVpa) != null)
            {
                ViewPropertyAnimatorCompat.access$100(mVpa).run();
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

        MyVpaListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat)
        {
            mVpa = viewpropertyanimatorcompat;
        }
    }


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

    MyVpaListener.mVpa()
    {
        mLayerMap = null;
    }
}
