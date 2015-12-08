// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorCompatICS, ViewPropertyAnimatorCompat, ViewPropertyAnimatorListener

class b extends 
{

    WeakHashMap b;

    public void a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
    {
        ViewPropertyAnimatorCompatICS.a(view);
    }

    public void a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        ViewPropertyAnimatorCompatICS.a(view, f);
    }

    public void a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, long l)
    {
        ViewPropertyAnimatorCompatICS.a(view, l);
    }

    public void a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorListener viewpropertyanimatorlistener)
    {
        view.setTag(0x7e000000, viewpropertyanimatorlistener);
        class MyVpaListener
            implements ViewPropertyAnimatorListener
        {

            ViewPropertyAnimatorCompat a;

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
                if (ViewPropertyAnimatorCompat.c(a) >= 0)
                {
                    ViewCompat.a(view1, ViewPropertyAnimatorCompat.c(a), null);
                    ViewPropertyAnimatorCompat.a(a, -1);
                }
                if (ViewPropertyAnimatorCompat.b(a) != null)
                {
                    ViewPropertyAnimatorCompat.b(a).run();
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
                if (ViewPropertyAnimatorCompat.c(a) >= 0)
                {
                    ViewCompat.a(view1, 2, null);
                }
                if (ViewPropertyAnimatorCompat.a(a) != null)
                {
                    ViewPropertyAnimatorCompat.a(a).run();
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
                a = viewpropertyanimatorcompat;
            }
        }

        ViewPropertyAnimatorCompatICS.a(view, new MyVpaListener(viewpropertyanimatorcompat));
    }

    public void a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Interpolator interpolator)
    {
        ViewPropertyAnimatorCompatICS.a(view, interpolator);
    }

    public void a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Runnable runnable)
    {
        ViewPropertyAnimatorCompatICS.a(view, new MyVpaListener(viewpropertyanimatorcompat));
        ViewPropertyAnimatorCompat.a(viewpropertyanimatorcompat, runnable);
    }

    public void b(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
    {
        ViewPropertyAnimatorCompatICS.b(view);
    }

    public void b(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        ViewPropertyAnimatorCompatICS.b(view, f);
    }

    public void c(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        ViewPropertyAnimatorCompatICS.c(view, f);
    }

    MyVpaListener()
    {
        b = null;
    }
}
