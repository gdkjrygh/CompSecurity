// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            a, ImmutableList

final class at extends a
{

    final ImmutableList a;

    at(ImmutableList immutablelist, int i, int j)
    {
        a = immutablelist;
        super(i, j);
    }

    protected final Object a(int i)
    {
        return a.get(i);
    }
}
