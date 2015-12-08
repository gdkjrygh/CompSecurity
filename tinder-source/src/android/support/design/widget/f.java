// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.support.v4.view.n;
import android.support.v4.view.x;
import android.support.v4.widget.u;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//            CoordinatorLayout

public class f extends CoordinatorLayout.b
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(int k);
    }

    private final class b
        implements Runnable
    {

        final f a;
        private final View b;
        private final boolean c;

        public final void run()
        {
            if (a.b != null && a.b.c())
            {
                x.a(b, this);
            } else
            if (c && a.c != null)
            {
                a.c.a();
                return;
            }
        }

        b(View view, boolean flag)
        {
            a = f.this;
            super();
            b = view;
            c = flag;
        }
    }


    private boolean a;
    u b;
    a c;
    int d;
    float e;
    float f;
    float g;
    private float h;
    private boolean i;
    private final android.support.v4.widget.u.a j = new android.support.v4.widget.u.a() {

        final f a;
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
            if (a.d == 0)
            {
                if (l != 0)
                {
                    l = b - view.getWidth();
                    i1 = b;
                } else
                {
                    l = b;
                    i1 = b + view.getWidth();
                }
            } else
            if (a.d == 1)
            {
                if (l != 0)
                {
                    l = b;
                    i1 = b + view.getWidth();
                } else
                {
                    l = b - view.getWidth();
                    i1 = b;
                }
            } else
            {
                l = b - view.getWidth();
                i1 = b + view.getWidth();
            }
            return Math.min(Math.max(l, k), i1);
        }

        public final void a(int k)
        {
            if (a.c != null)
            {
                a.c.a(k);
            }
        }

        public final void a(View view, float f1)
        {
            boolean flag = true;
            int l = view.getWidth();
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
                if (a.d == 2)
                {
                    k = 1;
                } else
                if (a.d == 0)
                {
                    if (k != 0)
                    {
                        if (f1 < 0.0F)
                        {
                            k = 1;
                        } else
                        {
                            k = 0;
                        }
                    } else
                    if (f1 > 0.0F)
                    {
                        k = 1;
                    } else
                    {
                        k = 0;
                    }
                } else
                if (a.d == 1)
                {
                    if (k != 0)
                    {
                        if (f1 > 0.0F)
                        {
                            k = 1;
                        } else
                        {
                            k = 0;
                        }
                    } else
                    if (f1 < 0.0F)
                    {
                        k = 1;
                    } else
                    {
                        k = 0;
                    }
                } else
                {
                    k = 0;
                }
            } else
            {
                k = view.getLeft();
                i1 = b;
                j1 = Math.round((float)view.getWidth() * a.e);
                if (Math.abs(k - i1) >= j1)
                {
                    k = 1;
                } else
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
            } else
            {
                k = b;
                flag = false;
            }
            if (a.b.a(k, view.getTop()))
            {
                x.a(view, a. new b(view, flag));
            } else
            if (flag && a.c != null)
            {
                a.c.a();
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
            float f1 = (float)view.getWidth() * a.f;
            float f2 = (float)view.getWidth() * a.g;
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
                x.c(view, f.a(1.0F - ((float)k - f1) / (f2 - f1)));
                return;
            }
        }

        public final int c(View view)
        {
            return view.getTop();
        }

            
            {
                a = f.this;
                super();
            }
    };

    public f()
    {
        h = 0.0F;
        d = 2;
        e = 0.5F;
        f = 0.0F;
        g = 0.5F;
    }

    static float a(float f1)
    {
        return Math.min(Math.max(0.0F, f1), 1.0F);
    }

    public boolean a(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
    {
        n.a(motionevent);
        JVM INSTR tableswitch 1 3: default 32
    //                   1 68
    //                   2 32
    //                   3 68;
           goto _L1 _L2 _L1 _L2
_L1:
        boolean flag;
        if (!coordinatorlayout.isPointInChildBounds(view, (int)motionevent.getX(), (int)motionevent.getY()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
_L4:
        if (a)
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (a)
        {
            a = false;
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (b == null)
        {
            if (i)
            {
                coordinatorlayout = u.a(coordinatorlayout, h, j);
            } else
            {
                coordinatorlayout = u.a(coordinatorlayout, j);
            }
            b = coordinatorlayout;
        }
        return b.a(motionevent);
    }

    public final boolean a(MotionEvent motionevent)
    {
        if (b != null)
        {
            b.b(motionevent);
            return true;
        } else
        {
            return false;
        }
    }
}
