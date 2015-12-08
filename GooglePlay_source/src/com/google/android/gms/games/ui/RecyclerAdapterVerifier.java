// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import com.google.android.gms.common.internal.Asserts;

public final class RecyclerAdapterVerifier extends android.support.v7.widget.RecyclerView.AdapterDataObserver
{

    private int mCount;

    public final void onChanged()
    {
        throw new NullPointerException();
    }

    public final void onItemRangeChanged(int i, int j)
    {
        throw new NullPointerException();
    }

    public final void onItemRangeInserted(int i, int j)
    {
        boolean flag;
        if (i <= mCount)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        mCount = mCount + j;
        throw new NullPointerException();
    }

    public final void onItemRangeRemoved(int i, int j)
    {
        boolean flag;
        if (i + j <= mCount)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        mCount = mCount - j;
        throw new NullPointerException();
    }
}
