// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorListener, ViewPropertyAnimatorCompat

class a
    implements a
{

    WeakHashMap a;

    static void a(a a1, ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
    {
        a1.c(viewpropertyanimatorcompat, view);
    }

    private void a(View view)
    {
        if (a != null)
        {
            Runnable runnable = (Runnable)a.get(view);
            if (runnable != null)
            {
                view.removeCallbacks(runnable);
            }
        }
    }

    private void c(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
    {
        Object obj = view.getTag(0x7e000000);
        Runnable runnable;
        if (obj instanceof ViewPropertyAnimatorListener)
        {
            obj = (ViewPropertyAnimatorListener)obj;
        } else
        {
            obj = null;
        }
        runnable = ViewPropertyAnimatorCompat.a(viewpropertyanimatorcompat);
        viewpropertyanimatorcompat = ViewPropertyAnimatorCompat.b(viewpropertyanimatorcompat);
        if (runnable != null)
        {
            runnable.run();
        }
        if (obj != null)
        {
            ((ViewPropertyAnimatorListener) (obj)).onAnimationStart(view);
            ((ViewPropertyAnimatorListener) (obj)).onAnimationEnd(view);
        }
        if (viewpropertyanimatorcompat != null)
        {
            viewpropertyanimatorcompat.run();
        }
        if (a != null)
        {
            a.remove(view);
        }
    }

    private void d(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
    {
        Runnable runnable;
        Object obj;
        if (a != null)
        {
            runnable = (Runnable)a.get(view);
        } else
        {
            runnable = null;
        }
        obj = runnable;
        if (runnable == null)
        {
            class Starter
                implements Runnable
            {

                WeakReference a;
                ViewPropertyAnimatorCompat b;
                final ViewPropertyAnimatorCompat.BaseViewPropertyAnimatorCompatImpl c;

                public void run()
                {
                    View view1 = (View)a.get();
                    if (view1 != null)
                    {
                        ViewPropertyAnimatorCompat.BaseViewPropertyAnimatorCompatImpl.a(c, b, view1);
                    }
                }

            private Starter(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
            {
                c = ViewPropertyAnimatorCompat.BaseViewPropertyAnimatorCompatImpl.this;
                super();
                a = new WeakReference(view);
                b = viewpropertyanimatorcompat;
            }

            Starter(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorCompat._cls1 _pcls1)
            {
                this(viewpropertyanimatorcompat, view);
            }
            }

            obj = new Starter(viewpropertyanimatorcompat, view, null);
            if (a == null)
            {
                a = new WeakHashMap();
            }
            a.put(view, obj);
        }
        view.removeCallbacks(((Runnable) (obj)));
        view.post(((Runnable) (obj)));
    }

    public void a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
    {
        d(viewpropertyanimatorcompat, view);
    }

    public void a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        d(viewpropertyanimatorcompat, view);
    }

    public void a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, long l)
    {
    }

    public void a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorListener viewpropertyanimatorlistener)
    {
        view.setTag(0x7e000000, viewpropertyanimatorlistener);
    }

    public void a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Interpolator interpolator)
    {
    }

    public void a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Runnable runnable)
    {
        ViewPropertyAnimatorCompat.a(viewpropertyanimatorcompat, runnable);
        d(viewpropertyanimatorcompat, view);
    }

    public void b(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
    {
        a(view);
        c(viewpropertyanimatorcompat, view);
    }

    public void b(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        d(viewpropertyanimatorcompat, view);
    }

    public void c(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
    {
        d(viewpropertyanimatorcompat, view);
    }

    Starter()
    {
        a = null;
    }
}
