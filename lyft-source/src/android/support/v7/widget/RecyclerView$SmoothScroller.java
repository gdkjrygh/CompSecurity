// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public abstract class Action.d
{

    private int a;
    private RecyclerView b;
    private  c;
    private boolean d;
    private boolean e;
    private View f;
    private final Action g = new Action(0, 0);

    private void a(int k, int l)
    {
label0:
        {
            RecyclerView recyclerview = b;
            if (!e || a == -1 || recyclerview == null)
            {
                f();
            }
            d = false;
            if (f != null)
            {
                if (a(f) == a)
                {
                    a(f, recyclerview.mState, g);
                    Action.a(g, recyclerview);
                    f();
                } else
                {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    f = null;
                }
            }
            if (e)
            {
                a(k, l, recyclerview.mState, g);
                boolean flag = g.a();
                Action.a(g, recyclerview);
                if (flag)
                {
                    if (!e)
                    {
                        break label0;
                    }
                    d = true;
                    RecyclerView.access$4900(recyclerview).d();
                }
            }
            return;
        }
        f();
    }

    static void a(f f1, int k, int l)
    {
        f1.a(k, l);
    }

    public int a(View view)
    {
        return b.getChildLayoutPosition(view);
    }

    protected abstract void a();

    protected abstract void a(int k, int l, Action action, Action action1);

    protected void a(PointF pointf)
    {
        double d1 = Math.sqrt(pointf.x * pointf.x + pointf.y * pointf.y);
        pointf.x = (float)((double)pointf.x / d1);
        pointf.y = (float)((double)pointf.y / d1);
    }

    void a(RecyclerView recyclerview, Action action)
    {
        b = recyclerview;
        c = action;
        if (a == -1)
        {
            throw new IllegalArgumentException("Invalid target position");
        } else
        {
            a(b.mState, a);
            e = true;
            d = true;
            f = e(i());
            a();
            RecyclerView.access$4900(b).b();
            return;
        }
    }

    protected abstract void a(View view, Action action, Action action1);

    protected abstract void b();

    protected void b(View view)
    {
        if (a(view) == i())
        {
            f = view;
        }
    }

    public void d(int k)
    {
        a = k;
    }

    public a e()
    {
        return c;
    }

    public View e(int k)
    {
        return RecyclerView.access$1300(b).(k);
    }

    protected final void f()
    {
        if (!e)
        {
            return;
        } else
        {
            b();
            b(b.mState, -1);
            f = null;
            a = -1;
            d = false;
            e = false;
            (c, this);
            c = null;
            b = null;
            return;
        }
    }

    public boolean g()
    {
        return d;
    }

    public boolean h()
    {
        return e;
    }

    public int i()
    {
        return a;
    }

    public int j()
    {
        return RecyclerView.access$1300(b).();
    }

    public Action.e()
    {
        a = -1;
        class Action
        {

            private int a;
            private int b;
            private int c;
            private int d;
            private Interpolator e;
            private boolean f;
            private int g;

            static void a(Action action, RecyclerView recyclerview)
            {
                action.a(recyclerview);
            }

            private void a(RecyclerView recyclerview)
            {
                if (d >= 0)
                {
                    int k = d;
                    d = -1;
                    RecyclerView.access$5200(recyclerview, k);
                    f = false;
                    return;
                }
                if (f)
                {
                    b();
                    if (e == null)
                    {
                        if (c == 0x80000000)
                        {
                            RecyclerView.access$4900(recyclerview).b(a, b);
                        } else
                        {
                            RecyclerView.access$4900(recyclerview).a(a, b, c);
                        }
                    } else
                    {
                        RecyclerView.access$4900(recyclerview).a(a, b, c, e);
                    }
                    g = g + 1;
                    if (g > 10)
                    {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    f = false;
                    return;
                } else
                {
                    g = 0;
                    return;
                }
            }

            private void b()
            {
                if (e != null && c < 1)
                {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (c < 1)
                {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                } else
                {
                    return;
                }
            }

            public void a(int k)
            {
                d = k;
            }

            public void a(int k, int l, int i1, Interpolator interpolator)
            {
                a = k;
                b = l;
                c = i1;
                e = interpolator;
                f = true;
            }

            boolean a()
            {
                return d >= 0;
            }

            public Action(int k, int l)
            {
                this(k, l, 0x80000000, null);
            }

            public Action(int k, int l, int i1, Interpolator interpolator)
            {
                d = -1;
                f = false;
                g = 0;
                a = k;
                b = l;
                c = i1;
                e = interpolator;
            }
        }

    }
}
