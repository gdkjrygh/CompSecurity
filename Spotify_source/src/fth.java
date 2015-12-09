// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ListAdapter;
import com.spotify.mobile.android.util.Assertion;

final class fth
{

    public final ListAdapter a;
    public String b;
    public final int c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public View h;
    public View i;
    private boolean j;
    private boolean k;

    private fth(ListAdapter listadapter, String s, int l, View view)
    {
        g = -1;
        ctz.a(listadapter);
        a = listadapter;
        b = s;
        c = l;
        d = true;
        h = null;
        i = view;
        j = true;
        k = true;
    }

    fth(ListAdapter listadapter, String s, int l, View view, byte byte0)
    {
        this(listadapter, s, l, view);
    }

    public final boolean a()
    {
        return b != null;
    }

    public final boolean a(int l)
    {
        return l < b();
    }

    public final int b()
    {
        return !a() ? 0 : 1;
    }

    public final boolean b(int l)
    {
        return l < b() && l >= b();
    }

    public final int c()
    {
        boolean flag;
        if (i != null && j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return !flag ? 0 : 1;
    }

    public final boolean c(int l)
    {
        return l < b() + a.getCount() + c() && l >= b() + a.getCount();
    }

    public final int d(int l)
    {
        int i1 = l - e;
        if (i1 < 0 || i1 >= a.getCount() + b() + c())
        {
            Assertion.a((new StringBuilder("global position out of bounds: ")).append(l).toString());
        }
        return i1;
    }

    public final int e(int l)
    {
        int i1 = d(l);
        if (a(i1))
        {
            Assertion.a((new StringBuilder("Should not find title at ")).append(l).toString());
        }
        if (b(i1))
        {
            Assertion.a((new StringBuilder("Should not find header at ")).append(l).toString());
        }
        if (c(i1))
        {
            Assertion.a((new StringBuilder("Should not find footer at ")).append(l).toString());
        }
        return i1 - b();
    }
}
