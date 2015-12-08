// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

// Referenced classes of package android.support.v4.view:
//            AccessibilityDelegateCompat, ViewPropertyAnimatorCompat

public class ViewCompat
{

    static final ViewCompatImpl a;

    public static int a(View view)
    {
        return a.a(view);
    }

    public static void a(View view, float f1)
    {
        a.a(view, f1);
    }

    public static void a(View view, int i1, int j1, int k1, int l1)
    {
        a.a(view, i1, j1, k1, l1);
    }

    public static void a(View view, int i1, Paint paint)
    {
        a.a(view, i1, paint);
    }

    public static void a(View view, Paint paint)
    {
        a.a(view, paint);
    }

    public static void a(View view, AccessibilityDelegateCompat accessibilitydelegatecompat)
    {
        a.a(view, accessibilitydelegatecompat);
    }

    public static void a(View view, Runnable runnable)
    {
        a.a(view, runnable);
    }

    public static void a(View view, Runnable runnable, long l1)
    {
        a.a(view, runnable, l1);
    }

    public static void a(View view, boolean flag)
    {
        a.a(view, flag);
    }

    public static void a(ViewGroup viewgroup, boolean flag)
    {
        a.a(viewgroup, flag);
    }

    public static boolean a(View view, int i1)
    {
        return a.a(view, i1);
    }

    public static void b(View view, float f1)
    {
        a.b(view, f1);
    }

    public static boolean b(View view)
    {
        return a.b(view);
    }

    public static boolean b(View view, int i1)
    {
        return a.b(view, i1);
    }

    public static void c(View view, float f1)
    {
        a.c(view, f1);
    }

    public static void c(View view, int i1)
    {
        a.c(view, i1);
    }

    public static boolean c(View view)
    {
        return a.c(view);
    }

    public static void d(View view)
    {
        a.d(view);
    }

    public static void d(View view, float f1)
    {
        a.d(view, f1);
    }

    public static int e(View view)
    {
        return a.e(view);
    }

    public static void e(View view, float f1)
    {
        a.e(view, f1);
    }

    public static float f(View view)
    {
        return a.f(view);
    }

    public static void f(View view, float f1)
    {
        a.f(view, f1);
    }

    public static int g(View view)
    {
        return a.g(view);
    }

    public static int h(View view)
    {
        return a.h(view);
    }

    public static ViewParent i(View view)
    {
        return a.i(view);
    }

    public static boolean j(View view)
    {
        return a.j(view);
    }

    public static float k(View view)
    {
        return a.l(view);
    }

    public static float l(View view)
    {
        return a.m(view);
    }

    public static int m(View view)
    {
        return a.o(view);
    }

    public static int n(View view)
    {
        return a.p(view);
    }

    public static ViewPropertyAnimatorCompat o(View view)
    {
        return a.q(view);
    }

    public static float p(View view)
    {
        return a.n(view);
    }

    public static float q(View view)
    {
        return a.r(view);
    }

    public static boolean r(View view)
    {
        return a.s(view);
    }

    public static boolean s(View view)
    {
        return a.k(view);
    }

    public static boolean t(View view)
    {
        return a.t(view);
    }

    public static void u(View view)
    {
        a.u(view);
    }

    static 
    {
        int i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 >= 21)
        {
            a = new LollipopViewCompatImpl();
        } else
        if (i1 >= 19)
        {
            a = new KitKatViewCompatImpl();
        } else
        if (i1 >= 17)
        {
            a = new JbMr1ViewCompatImpl();
        } else
        if (i1 >= 16)
        {
            a = new JBViewCompatImpl();
        } else
        if (i1 >= 14)
        {
            a = new ICSViewCompatImpl();
        } else
        if (i1 >= 11)
        {
            a = new HCViewCompatImpl();
        } else
        if (i1 >= 9)
        {
            a = new GBViewCompatImpl();
        } else
        if (i1 >= 7)
        {
            a = new EclairMr1ViewCompatImpl();
        } else
        {
            a = new BaseViewCompatImpl();
        }
    }

    private class ViewCompatImpl
    {

        public abstract int a(View view);

        public abstract void a(View view, float f1);

        public abstract void a(View view, int i1, int j1, int k1, int l1);

        public abstract void a(View view, int i1, Paint paint);

        public abstract void a(View view, Paint paint);

        public abstract void a(View view, AccessibilityDelegateCompat accessibilitydelegatecompat);

        public abstract void a(View view, Runnable runnable);

        public abstract void a(View view, Runnable runnable, long l1);

        public abstract void a(View view, boolean flag);

        public abstract void a(ViewGroup viewgroup, boolean flag);

        public abstract boolean a(View view, int i1);

        public abstract void b(View view, float f1);

        public abstract boolean b(View view);

        public abstract boolean b(View view, int i1);

        public abstract void c(View view, float f1);

        public abstract void c(View view, int i1);

        public abstract boolean c(View view);

        public abstract void d(View view);

        public abstract void d(View view, float f1);

        public abstract int e(View view);

        public abstract void e(View view, float f1);

        public abstract float f(View view);

        public abstract void f(View view, float f1);

        public abstract int g(View view);

        public abstract int h(View view);

        public abstract ViewParent i(View view);

        public abstract boolean j(View view);

        public abstract boolean k(View view);

        public abstract float l(View view);

        public abstract float m(View view);

        public abstract float n(View view);

        public abstract int o(View view);

        public abstract int p(View view);

        public abstract ViewPropertyAnimatorCompat q(View view);

        public abstract float r(View view);

        public abstract boolean s(View view);

        public abstract boolean t(View view);

        public abstract void u(View view);
    }


    private class LollipopViewCompatImpl extends KitKatViewCompatImpl
    {
        private class KitKatViewCompatImpl extends JbMr2ViewCompatImpl
        {
            private class JbMr2ViewCompatImpl extends JbMr1ViewCompatImpl
            {
                private class JbMr1ViewCompatImpl extends JBViewCompatImpl
                {
                    private class JBViewCompatImpl extends ICSViewCompatImpl
                    {
                        private class ICSViewCompatImpl extends HCViewCompatImpl
                        {
                            private class HCViewCompatImpl extends GBViewCompatImpl
                            {
                                private class GBViewCompatImpl extends EclairMr1ViewCompatImpl
                                {
                                    private class EclairMr1ViewCompatImpl extends BaseViewCompatImpl
                                    {
                                        private class BaseViewCompatImpl
                                            implements ViewCompatImpl
                                        {

                                            WeakHashMap a;

                                            private boolean a(ScrollingView scrollingview, int i1)
                                            {
                                                int j1;
                                                int k1;
                                                boolean flag;
                                                flag = true;
                                                j1 = scrollingview.computeHorizontalScrollOffset();
                                                k1 = scrollingview.computeHorizontalScrollRange() - scrollingview.computeHorizontalScrollExtent();
                                                if (k1 != 0) goto _L2; else goto _L1
_L1:
                                                flag = false;
_L4:
                                                return flag;
_L2:
                                                if (i1 >= 0)
                                                {
                                                    continue; /* Loop/switch isn't completed */
                                                }
                                                if (j1 > 0) goto _L4; else goto _L3
_L3:
                                                return false;
                                                if (j1 < k1 - 1) goto _L4; else goto _L5
_L5:
                                                return false;
                                            }

                                            private boolean b(ScrollingView scrollingview, int i1)
                                            {
                                                int j1;
                                                int k1;
                                                boolean flag;
                                                flag = true;
                                                j1 = scrollingview.computeVerticalScrollOffset();
                                                k1 = scrollingview.computeVerticalScrollRange() - scrollingview.computeVerticalScrollExtent();
                                                if (k1 != 0) goto _L2; else goto _L1
_L1:
                                                flag = false;
_L4:
                                                return flag;
_L2:
                                                if (i1 >= 0)
                                                {
                                                    continue; /* Loop/switch isn't completed */
                                                }
                                                if (j1 > 0) goto _L4; else goto _L3
_L3:
                                                return false;
                                                if (j1 < k1 - 1) goto _L4; else goto _L5
_L5:
                                                return false;
                                            }

                                            public int a(View view)
                                            {
                                                return 2;
                                            }

                                            long a()
                                            {
                                                return 10L;
                                            }

                                            public void a(View view, float f1)
                                            {
                                            }

                                            public void a(View view, int i1, int j1, int k1, int l1)
                                            {
                                                view.invalidate(i1, j1, k1, l1);
                                            }

                                            public void a(View view, int i1, Paint paint)
                                            {
                                            }

                                            public void a(View view, Paint paint)
                                            {
                                            }

                                            public void a(View view, AccessibilityDelegateCompat accessibilitydelegatecompat)
                                            {
                                            }

                                            public void a(View view, Runnable runnable)
                                            {
                                                view.postDelayed(runnable, a());
                                            }

                                            public void a(View view, Runnable runnable, long l1)
                                            {
                                                view.postDelayed(runnable, a() + l1);
                                            }

                                            public void a(View view, boolean flag)
                                            {
                                            }

                                            public void a(ViewGroup viewgroup, boolean flag)
                                            {
                                            }

                                            public boolean a(View view, int i1)
                                            {
                                                return (view instanceof ScrollingView) && a((ScrollingView)view, i1);
                                            }

                                            public void b(View view, float f1)
                                            {
                                            }

                                            public boolean b(View view)
                                            {
                                                return false;
                                            }

                                            public boolean b(View view, int i1)
                                            {
                                                return (view instanceof ScrollingView) && b((ScrollingView)view, i1);
                                            }

                                            public void c(View view, float f1)
                                            {
                                            }

                                            public void c(View view, int i1)
                                            {
                                            }

                                            public boolean c(View view)
                                            {
                                                return false;
                                            }

                                            public void d(View view)
                                            {
                                                view.invalidate();
                                            }

                                            public void d(View view, float f1)
                                            {
                                            }

                                            public int e(View view)
                                            {
                                                return 0;
                                            }

                                            public void e(View view, float f1)
                                            {
                                            }

                                            public float f(View view)
                                            {
                                                return 1.0F;
                                            }

                                            public void f(View view, float f1)
                                            {
                                            }

                                            public int g(View view)
                                            {
                                                return 0;
                                            }

                                            public int h(View view)
                                            {
                                                return 0;
                                            }

                                            public ViewParent i(View view)
                                            {
                                                return view.getParent();
                                            }

                                            public boolean j(View view)
                                            {
                                                boolean flag1 = false;
                                                view = view.getBackground();
                                                boolean flag = flag1;
                                                if (view != null)
                                                {
                                                    flag = flag1;
                                                    if (view.getOpacity() == -1)
                                                    {
                                                        flag = true;
                                                    }
                                                }
                                                return flag;
                                            }

                                            public boolean k(View view)
                                            {
                                                return true;
                                            }

                                            public float l(View view)
                                            {
                                                return 0.0F;
                                            }

                                            public float m(View view)
                                            {
                                                return 0.0F;
                                            }

                                            public float n(View view)
                                            {
                                                return 0.0F;
                                            }

                                            public int o(View view)
                                            {
                                                return ViewCompatBase.a(view);
                                            }

                                            public int p(View view)
                                            {
                                                return ViewCompatBase.b(view);
                                            }

                                            public ViewPropertyAnimatorCompat q(View view)
                                            {
                                                return new ViewPropertyAnimatorCompat(view);
                                            }

                                            public float r(View view)
                                            {
                                                return 0.0F;
                                            }

                                            public boolean s(View view)
                                            {
                                                return false;
                                            }

                                            public boolean t(View view)
                                            {
                                                if (view instanceof NestedScrollingChild)
                                                {
                                                    return ((NestedScrollingChild)view).isNestedScrollingEnabled();
                                                } else
                                                {
                                                    return false;
                                                }
                                            }

                                            public void u(View view)
                                            {
                                                if (view instanceof NestedScrollingChild)
                                                {
                                                    ((NestedScrollingChild)view).stopNestedScroll();
                                                }
                                            }

                                            BaseViewCompatImpl()
                                            {
                                                a = null;
                                            }
                                        }


                                        public void a(ViewGroup viewgroup, boolean flag)
                                        {
                                            ViewCompatEclairMr1.a(viewgroup, flag);
                                        }

                                        public boolean j(View view)
                                        {
                                            return ViewCompatEclairMr1.a(view);
                                        }

                                        EclairMr1ViewCompatImpl()
                                        {
                                        }
                                    }


                                    public int a(View view)
                                    {
                                        return ViewCompatGingerbread.a(view);
                                    }

                                    GBViewCompatImpl()
                                    {
                                    }
                                }


                                long a()
                                {
                                    return ViewCompatHC.a();
                                }

                                public void a(View view, float f1)
                                {
                                    ViewCompatHC.a(view, f1);
                                }

                                public void a(View view, int i1, Paint paint)
                                {
                                    ViewCompatHC.a(view, i1, paint);
                                }

                                public void a(View view, Paint paint)
                                {
                                    a(view, g(view), paint);
                                    view.invalidate();
                                }

                                public void a(View view, boolean flag)
                                {
                                    ViewCompatHC.a(view, flag);
                                }

                                public void b(View view, float f1)
                                {
                                    ViewCompatHC.b(view, f1);
                                }

                                public void c(View view, float f1)
                                {
                                    ViewCompatHC.c(view, f1);
                                }

                                public void d(View view, float f1)
                                {
                                    ViewCompatHC.d(view, f1);
                                }

                                public void e(View view, float f1)
                                {
                                    ViewCompatHC.e(view, f1);
                                }

                                public float f(View view)
                                {
                                    return ViewCompatHC.a(view);
                                }

                                public int g(View view)
                                {
                                    return ViewCompatHC.b(view);
                                }

                                public float l(View view)
                                {
                                    return ViewCompatHC.c(view);
                                }

                                public float m(View view)
                                {
                                    return ViewCompatHC.d(view);
                                }

                                public float n(View view)
                                {
                                    return ViewCompatHC.e(view);
                                }

                                HCViewCompatImpl()
                                {
                                }
                            }


                            static Field b;
                            static boolean c = false;

                            public void a(View view, AccessibilityDelegateCompat accessibilitydelegatecompat)
                            {
                                if (accessibilitydelegatecompat == null)
                                {
                                    accessibilitydelegatecompat = null;
                                } else
                                {
                                    accessibilitydelegatecompat = ((AccessibilityDelegateCompat) (accessibilitydelegatecompat.a()));
                                }
                                ViewCompatICS.a(view, accessibilitydelegatecompat);
                            }

                            public boolean a(View view, int i1)
                            {
                                return ViewCompatICS.a(view, i1);
                            }

                            public boolean b(View view)
                            {
                                boolean flag = true;
                                if (c)
                                {
                                    return false;
                                }
                                if (b == null)
                                {
                                    try
                                    {
                                        b = android/view/View.getDeclaredField("mAccessibilityDelegate");
                                        b.setAccessible(true);
                                    }
                                    // Misplaced declaration of an exception variable
                                    catch (View view)
                                    {
                                        c = true;
                                        return false;
                                    }
                                }
                                try
                                {
                                    view = ((View) (b.get(view)));
                                }
                                // Misplaced declaration of an exception variable
                                catch (View view)
                                {
                                    c = true;
                                    return false;
                                }
                                if (view == null)
                                {
                                    flag = false;
                                }
                                return flag;
                            }

                            public boolean b(View view, int i1)
                            {
                                return ViewCompatICS.b(view, i1);
                            }

                            public ViewPropertyAnimatorCompat q(View view)
                            {
                                if (a == null)
                                {
                                    a = new WeakHashMap();
                                }
                                ViewPropertyAnimatorCompat viewpropertyanimatorcompat1 = (ViewPropertyAnimatorCompat)a.get(view);
                                ViewPropertyAnimatorCompat viewpropertyanimatorcompat = viewpropertyanimatorcompat1;
                                if (viewpropertyanimatorcompat1 == null)
                                {
                                    viewpropertyanimatorcompat = new ViewPropertyAnimatorCompat(view);
                                    a.put(view, viewpropertyanimatorcompat);
                                }
                                return viewpropertyanimatorcompat;
                            }


                            ICSViewCompatImpl()
                            {
                            }
                        }


                        public void a(View view, int i1, int j1, int k1, int l1)
                        {
                            ViewCompatJB.a(view, i1, j1, k1, l1);
                        }

                        public void a(View view, Runnable runnable)
                        {
                            ViewCompatJB.a(view, runnable);
                        }

                        public void a(View view, Runnable runnable, long l1)
                        {
                            ViewCompatJB.a(view, runnable, l1);
                        }

                        public void c(View view, int i1)
                        {
                            int j1 = i1;
                            if (i1 == 4)
                            {
                                j1 = 2;
                            }
                            ViewCompatJB.a(view, j1);
                        }

                        public boolean c(View view)
                        {
                            return ViewCompatJB.a(view);
                        }

                        public void d(View view)
                        {
                            ViewCompatJB.b(view);
                        }

                        public int e(View view)
                        {
                            return ViewCompatJB.c(view);
                        }

                        public ViewParent i(View view)
                        {
                            return ViewCompatJB.d(view);
                        }

                        public boolean k(View view)
                        {
                            return ViewCompatJB.h(view);
                        }

                        public int o(View view)
                        {
                            return ViewCompatJB.e(view);
                        }

                        public int p(View view)
                        {
                            return ViewCompatJB.f(view);
                        }

                        public boolean s(View view)
                        {
                            return ViewCompatJB.g(view);
                        }

                        JBViewCompatImpl()
                        {
                        }
                    }


                    public void a(View view, Paint paint)
                    {
                        ViewCompatJellybeanMr1.a(view, paint);
                    }

                    public int h(View view)
                    {
                        return ViewCompatJellybeanMr1.a(view);
                    }

                    JbMr1ViewCompatImpl()
                    {
                    }
                }


                JbMr2ViewCompatImpl()
                {
                }
            }


            public void c(View view, int i1)
            {
                ViewCompatJB.a(view, i1);
            }

            KitKatViewCompatImpl()
            {
            }
        }


        public void f(View view, float f1)
        {
            ViewCompatLollipop.a(view, f1);
        }

        public float r(View view)
        {
            return ViewCompatLollipop.a(view);
        }

        public boolean t(View view)
        {
            return ViewCompatLollipop.b(view);
        }

        public void u(View view)
        {
            ViewCompatLollipop.c(view);
        }

        LollipopViewCompatImpl()
        {
        }
    }

}
