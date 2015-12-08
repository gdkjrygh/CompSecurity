// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//            CoordinatorLayout

public static final class i extends android.view.utParams
{

    m a;
    boolean b;
    public int c;
    public int d;
    public int e;
    int f;
    View g;
    View h;
    final Rect i;
    Object j;
    private boolean k;
    private boolean l;
    private boolean m;

    public final void a()
    {
        h = null;
        g = null;
        f = 0x7f1002ce;
    }

    public final void a(f f1)
    {
        if (a != f1)
        {
            a = f1;
            j = null;
            b = true;
        }
    }

    final void a(boolean flag)
    {
        l = flag;
    }

    final boolean a(View view)
    {
        return view == h || a != null && a.a(view);
    }

    final boolean b()
    {
        if (a == null)
        {
            k = false;
        }
        return k;
    }

    final boolean c()
    {
        if (k)
        {
            return true;
        } else
        {
            boolean flag = k | false;
            k = flag;
            return flag;
        }
    }

    final void d()
    {
        k = false;
    }

    final void e()
    {
        l = false;
    }

    final boolean f()
    {
        return l;
    }

    final boolean g()
    {
        return m;
    }

    final void h()
    {
        m = false;
    }

    final void i()
    {
        m = false;
    }

    public ()
    {
        super(-2, -2);
        b = false;
        c = 0;
        d = 0;
        e = -1;
        f = -1;
        i = new Rect();
    }

    i(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = false;
        c = 0;
        d = 0;
        e = -1;
        f = -1;
        i = new Rect();
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.design.t_LayoutParams);
        c = typedarray.getInteger(android.support.design.t_LayoutParams_android_layout_gravity, 0);
        f = typedarray.getResourceId(android.support.design.t_LayoutParams_layout_anchor, -1);
        d = typedarray.getInteger(android.support.design.t_LayoutParams_layout_anchorGravity, 0);
        e = typedarray.getInteger(android.support.design.t_LayoutParams_layout_keyline, -1);
        b = typedarray.hasValue(android.support.design.t_LayoutParams_layout_behavior);
        if (b)
        {
            a = CoordinatorLayout.a(context, attributeset, typedarray.getString(android.support.design.t_LayoutParams_layout_behavior));
        }
        typedarray.recycle();
    }

    public ior(ior ior)
    {
        super(ior);
        b = false;
        c = 0;
        d = 0;
        e = -1;
        f = -1;
        i = new Rect();
    }

    public i(android.view.ms ms)
    {
        super(ms);
        b = false;
        c = 0;
        d = 0;
        e = -1;
        f = -1;
        i = new Rect();
    }

    public i(android.view.utParams utparams)
    {
        super(utparams);
        b = false;
        c = 0;
        d = 0;
        e = -1;
        f = -1;
        i = new Rect();
    }
}
