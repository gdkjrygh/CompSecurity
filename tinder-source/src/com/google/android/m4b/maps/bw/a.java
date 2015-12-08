// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bw;


public final class a
    implements Comparable
{

    public static final a a = new a(-1);
    private static a c = a(new int[0]);
    private final int b;

    private a(int i)
    {
        b = i;
    }

    public static a a(a a1, a a2)
    {
        return new a(a1.b & ~a2.b);
    }

    public static transient a a(int ai[])
    {
        return new a(b(ai));
    }

    private static transient int b(int ai[])
    {
        int i = 0;
        int k = ai.length;
        int j = 0;
        for (; i < k; i++)
        {
            j |= 1 << ai[i];
        }

        return j;
    }

    public final int a(a a1)
    {
        return b - a1.b;
    }

    public final boolean a(int i)
    {
        return (b & 1 << i) != 0;
    }

    public final int compareTo(Object obj)
    {
        return a((a)obj);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof a)
        {
            flag = flag1;
            if (((a)obj).b == b)
            {
                flag = true;
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return b;
    }

    public final String toString()
    {
        boolean flag = true;
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("{");
        int i = 0;
        while (i <= 31) 
        {
            boolean flag1 = flag;
            if (a(i))
            {
                if (!flag)
                {
                    stringbuilder.append(", ");
                } else
                {
                    flag = false;
                }
                stringbuilder.append(i);
                flag1 = flag;
            }
            i++;
            flag = flag1;
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

}
