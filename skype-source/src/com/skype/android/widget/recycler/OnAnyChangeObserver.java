// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.recycler;


public abstract class OnAnyChangeObserver extends android.support.v7.widget.RecyclerView.c
{

    public OnAnyChangeObserver()
    {
    }

    public void onItemRangeChanged(int i, int j)
    {
        onChanged();
    }

    public void onItemRangeInserted(int i, int j)
    {
        onChanged();
    }

    public void onItemRangeMoved(int i, int j, int k)
    {
        onChanged();
    }

    public void onItemRangeRemoved(int i, int j)
    {
        onChanged();
    }
}
