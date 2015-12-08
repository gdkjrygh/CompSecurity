// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;


// Referenced classes of package com.google.a.b:
//            a

final class bn extends a
{

    final Object a[];
    final int b;

    bn(int i, int j, Object aobj[], int k)
    {
        a = aobj;
        b = k;
        super(i, j);
    }

    protected final Object a(int i)
    {
        return a[b + i];
    }
}
