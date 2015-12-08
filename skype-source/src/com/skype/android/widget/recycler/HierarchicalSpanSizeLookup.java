// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.recycler;

import android.util.SparseIntArray;

public abstract class HierarchicalSpanSizeLookup extends android.support.v7.widget.g.c
{

    final SparseIntArray a = new SparseIntArray();
    final SparseIntArray b = new SparseIntArray();

    public HierarchicalSpanSizeLookup()
    {
        setSpanIndexCacheEnabled(true);
    }
}
