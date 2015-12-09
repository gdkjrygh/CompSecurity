// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            p

class r
{

    private final int a;
    private final int b;

    private r(int i, int j)
    {
        a = i;
        b = j;
    }

    r(int i, int j, p p)
    {
        this(i, j);
    }

    boolean a(int i)
    {
        return a <= i && i <= b;
    }
}
