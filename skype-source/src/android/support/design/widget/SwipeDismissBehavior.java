// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.support.v4.view.m;
import android.support.v4.view.x;
import android.support.v4.widget.s;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//            CoordinatorLayout

public class SwipeDismissBehavior extends CoordinatorLayout.b
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(int k);
    }

    private final class b
        implements Runnable
    {

        final SwipeDismissBehavior a;
        private final View b;
        private final boolean c;

        public final void run()
        {
            if (SwipeDismissBehavior.b(a) != null && SwipeDismissBehavior.b(a).g())
            {
                x.a(b, this);
            } else
            if (c && SwipeDismissBehavior.a(a) != null)
            {
                SwipeDismissBehavior.a(a).a();
                return;
            }
        }

        b(View view, boolean flag)
        {
            a = SwipeDismissBehavior.this;
            super();
            b = view;
            c = flag;
        }
    }


    private s a;
    private a b;
    private boolean c;
    private float d;
    private boolean e;
    private int f;
    private float g;
    private float h;
    private float i;
    private final android.support.v4.widget.s.a j = new android.support.v4.widget.s.a() {

        final SwipeDismissBehavior a;
        private int b;

        public final int a(View view, int k)
        {
            int l;
            int i1;
            if (x.h(view) == 1)
            {
                l = 1;
            } else
            {
                l = 0;
            }
            if (SwipeDismissBehavior.c(a) == 0)
            {
                if (l != 0)
                {
                    i1 = b - view.getWidth();
                    l = b;
                } else
                {
                    i1 = b;
                    l = b + view.getWidth();
                }
            } else
            if (SwipeDismissBehavior.c(a) == 1)
            {
                if (l != 0)
                {
                    i1 = b;
                    l = b + view.getWidth();
                } else
                {
                    i1 = b - view.getWidth();
                    l = b;
                }
            } else
            {
                i1 = b - view.getWidth();
                l = b + view.getWidth();
            }
            return SwipeDismissBehavior.a(i1, k, l);
        }

        public final void a(int k)
        {
            if (SwipeDismissBehavior.a(a) != null)
            {
                SwipeDismissBehavior.a(a).a(k);
            }
        }

        public final void a(View view, float f1)
        {
            boolean flag = true;
            int l = view.getWidth();
            boolean flag1 = false;
            int k;
            if (f1 != 0.0F)
            {
                if (x.h(view) == 1)
                {
                    k = 1;
                } else
                {
                    k = 0;
                }
                int i1;
                int j1;
                int k1;
                if (SwipeDismissBehavior.c(a) == 2)
                {
                    k = ((flag) ? 1 : 0);
                } else
                if (SwipeDismissBehavior.c(a) == 0)
                {
                    if (k != 0)
                    {
                        k = ((flag) ? 1 : 0);
                        if (f1 >= 0.0F)
                        {
                            k = 0;
                        }
                    } else
                    {
                        k = ((flag) ? 1 : 0);
                        if (f1 <= 0.0F)
                        {
                            k = 0;
                        }
                    }
                } else
                if (SwipeDismissBehavior.c(a) == 1)
                {
                    if (k != 0)
                    {
                        k = ((flag) ? 1 : 0);
                        if (f1 <= 0.0F)
                        {
                            k = 0;
                        }
                    } else
                    {
                        k = ((flag) ? 1 : 0);
                        if (f1 >= 0.0F)
                        {
                            k = 0;
                        }
                    }
                } else
                {
                    k = 0;
                }
            } else
            {
                i1 = view.getLeft();
                j1 = b;
                k1 = Math.round((float)view.getWidth() * SwipeDismissBehavior.d(a));
                k = ((flag) ? 1 : 0);
                if (Math.abs(i1 - j1) < k1)
                {
                    k = 0;
                }
            }
            if (k != 0)
            {
                if (view.getLeft() < b)
                {
                    k = b - l;
                } else
                {
                    k = b + l;
                }
                flag1 = true;
            } else
            {
                k = b;
            }
            if (SwipeDismissBehavior.b(a).a(k, view.getTop()))
            {
                x.a(view, a. new b(view, flag1));
            } else
            if (flag1 && SwipeDismissBehavior.a(a) != null)
            {
                SwipeDismissBehavior.a(a).a();
                return;
            }
        }

        public final boolean a(View view)
        {
            b = view.getLeft();
            return true;
        }

        public final int b(View view)
        {
            return view.getWidth();
        }

        public final void b(View view, int k)
        {
            float f1 = (float)b + (float)view.getWidth() * SwipeDismissBehavior.e(a);
            float f2 = (float)b + (float)view.getWidth() * SwipeDismissBehavior.f(a);
            if ((float)k <= f1)
            {
                x.c(view, 1.0F);
                return;
            }
            if ((float)k >= f2)
            {
                x.c(view, 0.0F);
                return;
            } else
            {
                x.c(view, SwipeDismissBehavior.a(1.0F - SwipeDismissBehavior.a(f1, f2, k)));
                return;
            }
        }

        public final int c(View view)
        {
            return view.getTop();
        }

            
            {
                a = SwipeDismissBehavior.this;
                super();
            }
    };

    public SwipeDismissBehavior()
    {
        d = 0.0F;
        f = 2;
        g = 0.5F;
        h = 0.0F;
        i = 0.5F;
    }

    static float a(float f1)
    {
        return b(f1);
    }

    static float a(float f1, float f2, float f3)
    {
        return (f3 - f1) / (f2 - f1);
    }

    static int a(int k, int l, int i1)
    {
        return Math.min(Math.max(k, l), i1);
    }

    static a a(SwipeDismissBehavior swipedismissbehavior)
    {
        return swipedismissbehavior.b;
    }

    private static float b(float f1)
    {
        return Math.min(Math.max(0.0F, f1), 1.0F);
    }

    static s b(SwipeDismissBehavior swipedismissbehavior)
    {
        return swipedismissbehavior.a;
    }

    static int c(SwipeDismissBehavior swipedismissbehavior)
    {
        return swipedismissbehavior.f;
    }

    static float d(SwipeDismissBehavior swipedismissbehavior)
    {
        return swipedismissbehavior.g;
    }

    static float e(SwipeDismissBehavior swipedismissbehavior)
    {
        return swipedismissbehavior.h;
    }

    static float f(SwipeDismissBehavior swipedismissbehavior)
    {
        return swipedismissbehavior.i;
    }

    public final void a()
    {
        f = 0;
    }

    public final void a(a a1)
    {
        b = a1;
    }

    public final boolean a(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
    {
        if (a != null)
        {
            a.b(motionevent);
            return true;
        } else
        {
            return false;
        }
    }

    public final void b()
    {
        h = b(0.1F);
    }

    public boolean b(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
    {
        m.a(motionevent);
        JVM INSTR tableswitch 1 3: default 32
    //                   1 68
    //                   2 32
    //                   3 68;
           goto _L1 _L2 _L1 _L2
_L1:
        boolean flag;
        if (!coordinatorlayout.a(view, (int)motionevent.getX(), (int)motionevent.getY()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
_L4:
        if (c)
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (c)
        {
            c = false;
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (a == null)
        {
            if (e)
            {
                coordinatorlayout = s.a(coordinatorlayout, d, j);
            } else
            {
                coordinatorlayout = s.a(coordinatorlayout, j);
            }
            a = coordinatorlayout;
        }
        return a.a(motionevent);
    }

    public final void c()
    {
        i = b(0.6F);
    }

    public final int d()
    {
        if (a != null)
        {
            return a.a();
        } else
        {
            return 0;
        }
    }
}
