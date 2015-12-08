// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
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
