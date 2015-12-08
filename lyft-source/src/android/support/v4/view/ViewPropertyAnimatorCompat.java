// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorListener

public class ViewPropertyAnimatorCompat
{

    static final ViewPropertyAnimatorCompatImpl a;
    private WeakReference b;
    private Runnable c;
    private Runnable d;
    private int e;

    ViewPropertyAnimatorCompat(View view)
    {
        c = null;
        d = null;
        e = -1;
        b = new WeakReference(view);
    }

    static int a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, int i)
    {
        viewpropertyanimatorcompat.e = i;
        return i;
    }

    static Runnable a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat)
    {
        return viewpropertyanimatorcompat.c;
    }

    static Runnable a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, Runnable runnable)
    {
        viewpropertyanimatorcompat.d = runnable;
        return runnable;
    }

    static Runnable b(ViewPropertyAnimatorCompat viewpropertyanimatorcompat)
    {
        return viewpropertyanimatorcompat.d;
    }

    static int c(ViewPropertyAnimatorCompat viewpropertyanimatorcompat)
    {
        return viewpropertyanimatorcompat.e;
    }

    public ViewPropertyAnimatorCompat a(float f)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(this, view, f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat a(long l)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(this, view, l);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat a(ViewPropertyAnimatorListener viewpropertyanimatorlistener)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(this, view, viewpropertyanimatorlistener);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat a(Interpolator interpolator)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(this, view, interpolator);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat a(Runnable runnable)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(this, view, runnable);
        }
        return this;
    }

    public void a()
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(this, view);
        }
    }

    public ViewPropertyAnimatorCompat b(float f)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.b(this, view, f);
        }
        return this;
    }

    public void b()
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.b(this, view);
        }
    }

    public ViewPropertyAnimatorCompat c(float f)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.c(this, view, f);
        }
        return this;
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            a = new LollipopViewPropertyAnimatorCompatImpl();
        } else
        if (i >= 19)
        {
            a = new KitKatViewPropertyAnimatorCompatImpl();
        } else
        if (i >= 18)
        {
            a = new JBMr2ViewPropertyAnimatorCompatImpl();
        } else
        if (i >= 16)
        {
            a = new JBViewPropertyAnimatorCompatImpl();
        } else
        if (i >= 14)
        {
            a = new ICSViewPropertyAnimatorCompatImpl();
        } else
        {
            a = new BaseViewPropertyAnimatorCompatImpl();
        }
    }

    private class ViewPropertyAnimatorCompatImpl
    {

        public abstract void a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view);

        public abstract void a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

        public abstract void a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, long l);

        public abstract void a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorListener viewpropertyanimatorlistener);

        public abstract void a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Interpolator interpolator);

        public abstract void a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Runnable runnable);

        public abstract void b(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view);

        public abstract void b(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

        public abstract void c(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);
    }


    private class LollipopViewPropertyAnimatorCompatImpl extends KitKatViewPropertyAnimatorCompatImpl
    {
        private class KitKatViewPropertyAnimatorCompatImpl extends JBMr2ViewPropertyAnimatorCompatImpl
        {
            private class JBMr2ViewPropertyAnimatorCompatImpl extends JBViewPropertyAnimatorCompatImpl
            {
                private class JBViewPropertyAnimatorCompatImpl extends ICSViewPropertyAnimatorCompatImpl
                {
                    private class ICSViewPropertyAnimatorCompatImpl extends BaseViewPropertyAnimatorCompatImpl
                    {
                        private class BaseViewPropertyAnimatorCompatImpl
                            implements ViewPropertyAnimatorCompatImpl
                        {

                            WeakHashMap a;

                            static void a(BaseViewPropertyAnimatorCompatImpl baseviewpropertyanimatorcompatimpl, ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
                            {
                                baseviewpropertyanimatorcompatimpl.c(viewpropertyanimatorcompat, view);
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
                                        final BaseViewPropertyAnimatorCompatImpl c;

                                        public void run()
                                        {
                                            View view1 = (View)a.get();
                                            if (view1 != null)
                                            {
                                                BaseViewPropertyAnimatorCompatImpl.a(c, b, view1);
                                            }
                                        }

                                    private Starter(View view)
                                    {
                                        c = BaseViewPropertyAnimatorCompatImpl.this;
                                        super();
                                        a = new WeakReference(view);
                                        b = ViewPropertyAnimatorCompat.this;
                                    }

                                    }

                                    obj = viewpropertyanimatorcompat. new Starter(view);
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

                            BaseViewPropertyAnimatorCompatImpl()
                            {
                                a = null;
                            }
                        }


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

                                MyVpaListener()
                                {
                                    a = ViewPropertyAnimatorCompat.this;
                                }
                            }

                            ViewPropertyAnimatorCompatICS.a(view, viewpropertyanimatorcompat. new MyVpaListener());
                        }

                        public void a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Interpolator interpolator)
                        {
                            ViewPropertyAnimatorCompatICS.a(view, interpolator);
                        }

                        public void a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Runnable runnable)
                        {
                            ViewPropertyAnimatorCompatICS.a(view, viewpropertyanimatorcompat. new MyVpaListener());
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

                        ICSViewPropertyAnimatorCompatImpl()
                        {
                            b = null;
                        }
                    }


                    public void a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorListener viewpropertyanimatorlistener)
                    {
                        ViewPropertyAnimatorCompatJB.a(view, viewpropertyanimatorlistener);
                    }

                    public void a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Runnable runnable)
                    {
                        ViewPropertyAnimatorCompatJB.a(view, runnable);
                    }

                    JBViewPropertyAnimatorCompatImpl()
                    {
                    }
                }


                JBMr2ViewPropertyAnimatorCompatImpl()
                {
                }
            }


            KitKatViewPropertyAnimatorCompatImpl()
            {
            }
        }


        LollipopViewPropertyAnimatorCompatImpl()
        {
        }
    }

}
