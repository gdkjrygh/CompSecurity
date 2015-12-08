// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bk;

import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.bk:
//            g

final class h extends g
{

    private int b[];

    protected h(double ad[], int ai[])
    {
        super(ad);
        b = ai;
    }

    private boolean c(int i, int j)
    {
        return i >= b[j] && i < b[j + 1];
    }

    private String f()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 1; i < b.length - 1; i++)
        {
            stringbuilder.append("\nHole ");
            stringbuilder.append(i);
            stringbuilder.append(":");
            stringbuilder.append(b(b[i], b[i + 1]));
        }

        return stringbuilder.toString();
    }

    public final int a()
    {
        return b.length - 2;
    }

    protected final boolean a(Object obj)
    {
        return obj instanceof h;
    }

    public final int c(int i)
    {
        int j = f(i);
        if (c(i - 1, j))
        {
            return i - 1;
        } else
        {
            return b[j + 1] - 1;
        }
    }

    public final int d(int i)
    {
        int j = f(i);
        if (c(i + 1, j))
        {
            return i + 1;
        } else
        {
            return b[j];
        }
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof h))
        {
            return false;
        }
        h h1 = (h)obj;
        return (this instanceof h) && super.equals(obj) && Arrays.equals(b, h1.b);
    }

    public final int f(int i)
    {
        if (i < 0 || i >= a)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        int j;
        for (j = 0; i >= b[j]; j++) { }
        return j - 1;
    }

    public final int g(int i)
    {
        return b[i];
    }

    public final int hashCode()
    {
        return super.hashCode() + Arrays.hashCode(b) * 31;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("{");
        stringbuilder.append(super.toString());
        stringbuilder.append(";");
        stringbuilder.append(f());
        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
