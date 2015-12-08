// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public abstract class abs extends aay
{

    private boolean a;

    public abs()
    {
        a = true;
    }

    public abstract boolean a(abo abo1);

    public abstract boolean a(abo abo1, int i, int j, int k, int l);

    public final boolean a(abo abo1, aba aba1, aba aba2)
    {
        int k = aba1.a;
        int l = aba1.b;
        aba1 = abo1.a;
        int i;
        int j;
        if (aba2 == null)
        {
            i = aba1.getLeft();
        } else
        {
            i = aba2.a;
        }
        if (aba2 == null)
        {
            j = aba1.getTop();
        } else
        {
            j = aba2.b;
        }
        if (!abo1.n() && (k != i || l != j))
        {
            aba1.layout(i, j, aba1.getWidth() + i, aba1.getHeight() + j);
            return a(abo1, k, l, i, j);
        } else
        {
            return a(abo1);
        }
    }

    public abstract boolean a(abo abo1, abo abo2, int i, int j, int k, int l);

    public boolean a(abo abo1, abo abo2, aba aba1, aba aba2)
    {
        int k = aba1.a;
        int l = aba1.b;
        int i;
        int j;
        if (abo2.E_())
        {
            i = aba1.a;
            j = aba1.b;
        } else
        {
            i = aba2.a;
            j = aba2.b;
        }
        return a(abo1, abo2, k, l, i, j);
    }

    public abstract boolean b(abo abo1);

    public final boolean b(abo abo1, aba aba1, aba aba2)
    {
        if (aba1 != null && (aba1.a != aba2.a || aba1.b != aba2.b))
        {
            return a(abo1, aba1.a, aba1.b, aba2.a, aba2.b);
        } else
        {
            return b(abo1);
        }
    }

    public final boolean c(abo abo1, aba aba1, aba aba2)
    {
        if (aba1.a != aba2.a || aba1.b != aba2.b)
        {
            return a(abo1, aba1.a, aba1.b, aba2.a, aba2.b);
        } else
        {
            e(abo1);
            return false;
        }
    }

    public final boolean f(abo abo1)
    {
        return !a || abo1.k();
    }
}
