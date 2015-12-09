// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.list;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.SectionIndexer;

// Referenced classes of package com.google.android.apps.wallet.widgets.list:
//            HeadedListAdapter

public static class ctionIndexerListAdapter
{

    private View mFooterView;
    private View mHeaderView;
    private ListAdapter mListAdapter;

    public final HeadedListAdapter build()
    {
        Object obj;
        if (mListAdapter != null && (mListAdapter instanceof SectionIndexer))
        {
            obj = new ctionIndexerListAdapter();
        } else
        {
            obj = new HeadedListAdapter();
        }
        if (mHeaderView != null)
        {
            ((HeadedListAdapter) (obj)).setHeaderView(mHeaderView);
        }
        if (mFooterView != null)
        {
            ((HeadedListAdapter) (obj)).setFooterView(mFooterView);
        }
        if (mListAdapter != null)
        {
            ((HeadedListAdapter) (obj)).setAdapter(mListAdapter);
        }
        return ((HeadedListAdapter) (obj));
    }

    public final mListAdapter withDefaultHeaderView(Activity activity)
    {
        mHeaderView = LayoutInflater.from(activity).inflate(com.google.android.apps.walletnfcrel.uilder.mHeaderView, null);
        return this;
    }

    public final mHeaderView withHeaderView(View view)
    {
        mHeaderView = view;
        return this;
    }

    public final mHeaderView withListAdapter(ListAdapter listadapter)
    {
        mListAdapter = listadapter;
        return this;
    }

    public ctionIndexerListAdapter()
    {
    }
}
