// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ImageView;

abstract class dil
    implements dio
{

    protected final dip a;
    protected final ImageView b;
    protected final View c;
    protected boolean d;
    protected boolean e;
    protected View f;
    protected View g;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected int l;
    protected int m;
    protected int n;
    protected int o;
    protected dii p;
    protected CharSequence q;

    public dil(dip dip, ImageView imageview, View view, int i1)
    {
        d = true;
        e = true;
        p = dii.a;
        a = dip;
        b = imageview;
        c = view;
        l = i1;
    }

    public final int a()
    {
        return o;
    }

    public void a(int i1)
    {
        b.setColorFilter(i1);
    }

    public final void a(View view)
    {
        f = view;
    }

    public final void a(dii dii1)
    {
        p = dii1;
    }

    public final void a(CharSequence charsequence)
    {
        q = charsequence;
    }

    public void a(boolean flag)
    {
    }

    public final int b()
    {
        return n;
    }

    public void b(int i1)
    {
    }

    public final void b(View view)
    {
        g = view;
    }

    public ImageView c()
    {
        return b;
    }

    public void c(int i1)
    {
        h = i1;
    }

    public void d(int i1)
    {
        i = i1;
    }

    public final boolean d()
    {
        return d;
    }

    public final int e()
    {
        return h;
    }

    public final void e(int i1)
    {
        m = i1;
    }

    public final void f()
    {
        e = false;
    }
}
