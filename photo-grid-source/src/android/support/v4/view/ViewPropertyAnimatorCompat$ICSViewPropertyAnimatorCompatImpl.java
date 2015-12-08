// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorCompatICS, ViewPropertyAnimatorCompat, ViewCompat, ViewPropertyAnimatorListener

class mLayerMap extends 
{

    WeakHashMap mLayerMap;

    public void alpha(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        ViewPropertyAnimatorCompatICS.alpha(view, f);
    }

    public void alphaBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        ViewPropertyAnimatorCompatICS.alphaBy(view, f);
    }

    public void cancel(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
    {
        ViewPropertyAnimatorCompatICS.cancel(view);
    }

    public long getDuration(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
    {
        return ViewPropertyAnimatorCompatICS.getDuration(view);
    }

    public long getStartDelay(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
    {
        return ViewPropertyAnimatorCompatICS.getStartDelay(view);
    }

    public void rotation(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        ViewPropertyAnimatorCompatICS.rotation(view, f);
    }

    public void rotationBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        ViewPropertyAnimatorCompatICS.rotationBy(view, f);
    }

    public void rotationX(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        ViewPropertyAnimatorCompatICS.rotationX(view, f);
    }

    public void rotationXBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        ViewPropertyAnimatorCompatICS.rotationXBy(view, f);
    }

    public void rotationY(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        ViewPropertyAnimatorCompatICS.rotationY(view, f);
    }

    public void rotationYBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        ViewPropertyAnimatorCompatICS.rotationYBy(view, f);
    }

    public void scaleX(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        ViewPropertyAnimatorCompatICS.scaleX(view, f);
    }

    public void scaleXBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        ViewPropertyAnimatorCompatICS.scaleXBy(view, f);
    }

    public void scaleY(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        ViewPropertyAnimatorCompatICS.scaleY(view, f);
    }

    public void scaleYBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        ViewPropertyAnimatorCompatICS.scaleYBy(view, f);
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
        class MyVpaListener
            implements ViewPropertyAnimatorListener
        {

            ViewPropertyAnimatorCompat mVpa;

            public void onAnimationCancel(View view1)
            {
                Object obj = view1.getTag(0x7e000000);
                if (obj instanceof ViewPropertyAnimatorListener)
                {
                    obj = (ViewPropertyAnimatorListener)obj;
                } else
                {
                    obj = null;
                }
                if (obj != null)
                {
                    ((ViewPropertyAnimatorListener) (obj)).onAnimationCancel(view1);
                }
            }

            public void onAnimationEnd(View view1)
            {
                if (ViewPropertyAnimatorCompat.access$400(mVpa) >= 0)
                {
                    ViewCompat.setLayerType(view1, ViewPropertyAnimatorCompat.access$400(mVpa), null);
                    ViewPropertyAnimatorCompat.access$402(mVpa, -1);
                }
                if (ViewPropertyAnimatorCompat.access$000(mVpa) != null)
                {
                    ViewPropertyAnimatorCompat.access$000(mVpa).run();
                }
                Object obj = view1.getTag(0x7e000000);
                if (obj instanceof ViewPropertyAnimatorListener)
                {
                    obj = (ViewPropertyAnimatorListener)obj;
                } else
                {
                    obj = null;
                }
                if (obj != null)
                {
                    ((ViewPropertyAnimatorListener) (obj)).onAnimationEnd(view1);
                }
            }

            public void onAnimationStart(View view1)
            {
                if (ViewPropertyAnimatorCompat.access$400(mVpa) >= 0)
                {
                    ViewCompat.setLayerType(view1, 2, null);
                }
                if (ViewPropertyAnimatorCompat.access$100(mVpa) != null)
                {
                    ViewPropertyAnimatorCompat.access$100(mVpa).run();
                }
                Object obj = view1.getTag(0x7e000000);
                if (obj instanceof ViewPropertyAnimatorListener)
                {
                    obj = (ViewPropertyAnimatorListener)obj;
                } else
                {
                    obj = null;
                }
                if (obj != null)
                {
                    ((ViewPropertyAnimatorListener) (obj)).onAnimationStart(view1);
                }
            }

            MyVpaListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat)
            {
                mVpa = viewpropertyanimatorcompat;
            }
        }

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

    public void translationXBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        ViewPropertyAnimatorCompatICS.translationXBy(view, f);
    }

    public void translationY(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        ViewPropertyAnimatorCompatICS.translationY(view, f);
    }

    public void translationYBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        ViewPropertyAnimatorCompatICS.translationYBy(view, f);
    }

    public void withEndAction(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Runnable runnable)
    {
        ViewPropertyAnimatorCompatICS.setListener(view, new MyVpaListener(viewpropertyanimatorcompat));
        ViewPropertyAnimatorCompat.access$002(viewpropertyanimatorcompat, runnable);
    }

    public void withLayer(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
    {
        ViewPropertyAnimatorCompat.access$402(viewpropertyanimatorcompat, ViewCompat.getLayerType(view));
        ViewPropertyAnimatorCompatICS.setListener(view, new MyVpaListener(viewpropertyanimatorcompat));
    }

    public void withStartAction(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Runnable runnable)
    {
        ViewPropertyAnimatorCompatICS.setListener(view, new MyVpaListener(viewpropertyanimatorcompat));
        ViewPropertyAnimatorCompat.access$102(viewpropertyanimatorcompat, runnable);
    }

    public void x(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        ViewPropertyAnimatorCompatICS.x(view, f);
    }

    public void xBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        ViewPropertyAnimatorCompatICS.xBy(view, f);
    }

    public void y(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        ViewPropertyAnimatorCompatICS.y(view, f);
    }

    public void yBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        ViewPropertyAnimatorCompatICS.yBy(view, f);
    }

    MyVpaListener()
    {
        mLayerMap = null;
    }
}
