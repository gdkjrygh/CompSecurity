// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.view.b;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.q;
import com.facebook.reflex.Container;
import com.facebook.reflex.Widget;
import com.facebook.reflex.d;
import com.facebook.reflex.j;
import com.facebook.reflex.y;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;

// Referenced classes of package com.facebook.reflex.view.b:
//            g, i, b, r, 
//            e, k, h, m, 
//            j, f, c, d

public class a
{

    private static final g i[];
    protected final i a;
    protected final h b;
    protected final ViewGroup c;
    protected final Container d = new Container();
    protected final m e;
    protected final ArrayList f = new ArrayList();
    protected EnumSet g;
    protected long h;

    public a(i i1, h h1)
    {
        g = EnumSet.noneOf(com/facebook/reflex/view/b/g);
        h = 0L;
        a = i1;
        b = h1;
        c = i1.b();
        e = new b(this, c);
        c.setWillNotDraw(false);
    }

    private void a(View view, int i1, int j1)
    {
        if (view.getVisibility() == 0)
        {
            if (view instanceof r)
            {
                Widget widget = ((r)view).getBackingWidget();
                f.add(widget);
                widget.b(view.getLeft() + i1, view.getTop() + j1);
                return;
            }
            if (view instanceof ViewGroup)
            {
                a((ViewGroup)view, view.getLeft() + i1, view.getTop() + j1);
                return;
            }
        }
    }

    private void a(ViewGroup viewgroup, int i1, int j1)
    {
        int l1 = viewgroup.getChildCount();
        for (int k1 = 0; k1 < l1; k1++)
        {
            a(viewgroup.getChildAt(k1), i1, j1);
        }

    }

    static void a(a a1, MotionEvent motionevent)
    {
        a1.b(motionevent);
    }

    private void a(y y1)
    {
        d.a(new e(this), y1);
    }

    private void b(MotionEvent motionevent)
    {
        com.facebook.reflex.view.b.k.a().a(c, motionevent);
        b.a(motionevent);
    }

    private boolean k()
    {
        if (e.j() && !d())
        {
            d.a(e);
            return true;
        } else
        {
            d.a(null);
            return false;
        }
    }

    private void l()
    {
        a(c, 0, 0);
        d.a(f);
        f.clear();
    }

    public Container a()
    {
        return d;
    }

    public void a(float f1)
    {
        d.b(f1);
    }

    public void a(int i1, int j1)
    {
        d.a(i1, j1);
        e.a(i1, j1);
    }

    public void a(Canvas canvas)
    {
        if (d())
        {
            a.a(canvas);
            return;
        } else
        {
            a.a(com.facebook.reflex.view.b.j.a());
            return;
        }
    }

    public void a(AttributeSet attributeset)
    {
        int i1;
        int j1;
        i1 = 0;
        attributeset = c.getContext().obtainStyledAttributes(attributeset, q.ContainerView);
        a(attributeset.getBoolean(q.ContainerView_dispatchAndroidTouchEvents, false));
        b(attributeset.getBoolean(q.ContainerView_compatibilityDrawMode, false));
        j1 = attributeset.getInt(q.ContainerView_reflexAndroidTouchMode, -1);
        if (j1 < 0) goto _L2; else goto _L1
_L1:
        EnumSet enumset = EnumSet.noneOf(com/facebook/reflex/view/b/g);
_L6:
        if (i1 < 32 && j1 != 0) goto _L4; else goto _L3
_L3:
        a(enumset);
_L2:
        attributeset.recycle();
        return;
_L4:
        if ((j1 & 1) == 1)
        {
            enumset.add(i[i1]);
        }
        j1 >>= 1;
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a(EnumSet enumset)
    {
        if (!enumset.containsAll(g) || !g.containsAll(enumset))
        {
            boolean flag = enumset.contains(g.HorizontalPans);
            boolean flag1 = enumset.contains(g.VerticalPans);
            boolean flag2 = enumset.contains(g.UnconstrainedPans);
            if ((!flag || !flag1 && !flag2) && (!flag1 || !flag2))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag);
            g = EnumSet.copyOf(enumset);
            d.a(null);
            d.a(null);
            d.a(null);
            enumset = g.iterator();
            do
            {
                if (!enumset.hasNext())
                {
                    continue;
                }
                g g1 = (g)enumset.next();
                switch (f.a[g1.ordinal()])
                {
                case 1: // '\001'
                    d.a(new c(this));
                    break;

                case 2: // '\002'
                    a(y.PanHorizontal);
                    break;

                case 3: // '\003'
                    a(y.PanVertical);
                    break;

                case 4: // '\004'
                    a(y.PanUnconstrained);
                    break;

                case 5: // '\005'
                    d.a(new com.facebook.reflex.view.b.d(this));
                    break;
                }
            } while (true);
        }
        break MISSING_BLOCK_LABEL_250;
        while (true) 
        {
            return;
        }
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            h = h | 4L;
            return;
        } else
        {
            h = h & -5L;
            return;
        }
    }

    public boolean a(int i1, int j1, int k1, int l1)
    {
        if (h())
        {
            ((j)c.getContext()).a(a.c());
        }
        return h();
    }

    public boolean a(Rect rect)
    {
        if (h())
        {
            ((j)c.getContext()).a(a.c());
        }
        return h();
    }

    public boolean a(MotionEvent motionevent)
    {
        return !c() || b == null || b.a(motionevent);
    }

    public boolean a(int ai[], Rect rect)
    {
        if (h())
        {
            ((j)c.getContext()).a(a.c());
        }
        return h();
    }

    public d b()
    {
        return e;
    }

    public void b(float f1)
    {
        d.c(f1);
    }

    public void b(boolean flag)
    {
        if (flag)
        {
            h = h | 1L;
        } else
        {
            h = h & -2L;
        }
        k();
    }

    public boolean c()
    {
        return (h & 4L) != 0L;
    }

    public boolean d()
    {
        return (h & 1L) != 0L;
    }

    public boolean e()
    {
        if (h())
        {
            ((j)c.getContext()).a(a.c());
        }
        return h();
    }

    public void f()
    {
        if (k())
        {
            e.f();
        }
    }

    public void g()
    {
        l();
        k();
    }

    public boolean h()
    {
        return !d();
    }

    public float i()
    {
        return d.j();
    }

    public float j()
    {
        return d.k();
    }

    static 
    {
        i = (new g[] {
            g.Taps, g.HorizontalPans, g.VerticalPans, g.UnconstrainedPans, g.GenericTouches
        });
    }
}
