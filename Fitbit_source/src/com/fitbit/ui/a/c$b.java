// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.a;


// Referenced classes of package com.fitbit.ui.a:
//            c

private static class b
    implements Comparable
{

    private final b a;
    private final int b;

    static int b( )
    {
        return .b;
    }

    static b c(b b1)
    {
        return b1.a;
    }

    public int a(a a1)
    {
        return b - a1.b;
    }

    public int compareTo(Object obj)
    {
        return a((a)obj);
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof a) && ((a)obj).b == b;
    }

    public ( , int i)
    {
        a = ;
        b = i;
    }
}
