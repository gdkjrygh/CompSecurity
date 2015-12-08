// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.support.v4.view.x;
import android.view.View;

final class v
{

    private final View a;
    private int b;
    private int c;
    private int d;
    private int e;

    public v(View view)
    {
        a = view;
    }

    private void c()
    {
        x.d(a, d - (a.getTop() - b));
        x.e(a, e - (a.getLeft() - c));
        Object obj = a.getParent();
        if (obj instanceof View)
        {
            obj = (View)obj;
            float f = x.o(((View) (obj)));
            x.a(((View) (obj)), 1.0F + f);
            x.a(((View) (obj)), f);
        }
    }

    public final void a()
    {
        b = a.getTop();
        c = a.getLeft();
        c();
    }

    public final boolean a(int i)
    {
        if (d != i)
        {
            d = i;
            c();
            return true;
        } else
        {
            return false;
        }
    }

    public final int b()
    {
        return d;
    }

    public final boolean b(int i)
    {
        if (e != i)
        {
            e = i;
            c();
            return true;
        } else
        {
            return false;
        }
    }
}
