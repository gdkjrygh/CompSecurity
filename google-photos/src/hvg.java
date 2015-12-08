// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;

final class hvg
    implements gml
{

    private final hgo a[];
    private final gml b;

    transient hvg(gml gml1, hgo ahgo[])
    {
        a = ahgo;
        b = gml1;
    }

    public final int a()
    {
        return a.length + b.a();
    }

    public final int a(int i, int j)
    {
        if (i < a.length)
        {
            return j;
        } else
        {
            return b.a(i - a.length, j);
        }
    }

    public final int a(gml gml1, int i)
    {
        if (gml1 == this)
        {
            return i;
        } else
        {
            return a.length + b.a(gml1, i);
        }
    }

    public final void a(RecyclerView recyclerview, int i)
    {
        b.a(recyclerview, i);
    }

    public final boolean a(int i)
    {
        return i < a.length || b.a(i - a.length);
    }

    public final void a_(int i, int j, int k)
    {
        int l = 0;
        i -= a.length;
        if (i < 0)
        {
            j = 0;
            i = l;
        }
        l = a.length;
        if (i <= 0)
        {
            return;
        } else
        {
            b.a_(i, j, k - l);
            return;
        }
    }

    public final int b(int i, int j)
    {
        if (i < a.length)
        {
            return 0;
        } else
        {
            return b.b(i - a.length, j);
        }
    }

    public final int b(gml gml1, int i)
    {
        if (gml1 == this)
        {
            return i;
        } else
        {
            return b.b(gml1, i - a.length);
        }
    }

    public final hgo b(int i)
    {
        if (i < a.length)
        {
            return a[i];
        } else
        {
            return b.b(i - a.length);
        }
    }

    public final int c(int i, int j)
    {
        if (i < a.length)
        {
            return i;
        } else
        {
            return a.length + b.c(i - a.length, j);
        }
    }
}
