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

public static final class l extends android.view.utParams
{

    a a;
    boolean b;
    public int c;
    public int d;
    public int e;
    int f;
    View g;
    View h;
    boolean i;
    boolean j;
    boolean k;
    final Rect l;
    Object m;

    public final void a(l l1)
    {
        if (a != l1)
        {
            a = l1;
            m = null;
            b = true;
        }
    }

    final boolean a(View view)
    {
        if (view != h)
        {
            if (a == null);
            return false;
        } else
        {
            return true;
        }
    }

    public ()
    {
        super(-2, -2);
        b = false;
        c = 0;
        d = 0;
        e = -1;
        f = -1;
        l = new Rect();
    }

    l(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = false;
        c = 0;
        d = 0;
        e = -1;
        f = -1;
        l = new Rect();
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.design.t_LayoutParams);
        c = typedarray.getInteger(android.support.design.t_LayoutParams_android_layout_gravity, 0);
        f = typedarray.getResourceId(android.support.design.t_LayoutParams_layout_anchor, -1);
        d = typedarray.getInteger(android.support.design.t_LayoutParams_layout_anchorGravity, 0);
        e = typedarray.getInteger(android.support.design.t_LayoutParams_layout_keyline, -1);
        b = typedarray.hasValue(android.support.design.t_LayoutParams_layout_behavior);
        if (b)
        {
            a = CoordinatorLayout.parseBehavior(context, attributeset, typedarray.getString(android.support.design.t_LayoutParams_layout_behavior));
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
        l = new Rect();
    }

    public l(android.view.ms ms)
    {
        super(ms);
        b = false;
        c = 0;
        d = 0;
        e = -1;
        f = -1;
        l = new Rect();
    }

    public l(android.view.utParams utparams)
    {
        super(utparams);
        b = false;
        c = 0;
        d = 0;
        e = -1;
        f = -1;
        l = new Rect();
    }
}
