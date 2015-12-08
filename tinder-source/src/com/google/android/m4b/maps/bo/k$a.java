// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;


// Referenced classes of package com.google.android.m4b.maps.bo:
//            k, g

public static final class b
{

    int a[];
    public int b;

    public final k a()
    {
        int ai[] = new int[b * 3];
        System.arraycopy(a, 0, ai, 0, b * 3);
        return new k(ai, (byte)0);
    }

    public final boolean a(g g1)
    {
        int i = g1.a;
        int j = g1.b;
        int l = g1.c;
        if (b * 3 == a.length)
        {
            g1 = new int[a.length * 2];
            System.arraycopy(a, 0, g1, 0, b * 3);
            a = g1;
        }
        int i1 = b * 3;
        if (b > 0 && i == a[i1 - 3] && j == a[i1 - 2] && l == a[i1 - 1])
        {
            return false;
        } else
        {
            a[i1] = i;
            a[i1 + 1] = j;
            a[i1 + 2] = l;
            b = b + 1;
            return true;
        }
    }

    public ()
    {
        this(16);
    }

    public <init>(int i)
    {
        if (i <= 0)
        {
            throw new AssertionError();
        } else
        {
            a = new int[i * 3];
            b = 0;
            return;
        }
    }
}
