// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter.a;

import android.util.SparseArray;

public final class b
{

    private final SparseArray a = new SparseArray();

    public b()
    {
    }

    public final Object a(int i)
    {
        return a.get(i);
    }

    public final void a(int i, Object obj)
    {
        a.put(i, obj);
    }
}
