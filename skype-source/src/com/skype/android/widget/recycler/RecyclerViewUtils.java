// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.recycler;

import android.view.View;
import android.view.ViewGroup;

public class RecyclerViewUtils
{

    public RecyclerViewUtils()
    {
    }

    public static View a(android.support.v7.widget.RecyclerView.a a1, int i, ViewGroup viewgroup)
    {
        viewgroup = a1.createViewHolder(viewgroup, a1.getItemViewType(i));
        a1.bindViewHolder(viewgroup, i);
        return ((android.support.v7.widget.RecyclerView.v) (viewgroup)).itemView;
    }
}
