// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import cug;

// Referenced classes of package com.google.common.collect:
//            ImmutableList

final class a extends cug
{

    private ImmutableList a;

    protected final Object a(int i)
    {
        return a.get(i);
    }

    (ImmutableList immutablelist, int i, int j)
    {
        a = immutablelist;
        super(i, j);
    }
}
