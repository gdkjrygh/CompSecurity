// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import a.a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.presentation.CellRenderer;
import com.soundcloud.java.checks.Preconditions;
import java.util.List;

class SearchItemRenderer
    implements CellRenderer
{
    static interface SearchListener
    {

        public abstract void onSearchClicked(Context context);
    }


    private SearchListener searchListener;

    public SearchItemRenderer()
    {
    }

    public void bindItemView(int i, View view, List list)
    {
        a.a(this, view);
    }

    public View createItemView(ViewGroup viewgroup)
    {
        return LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0300aa, viewgroup, false);
    }

    public void onSearchClick(View view)
    {
        if (searchListener != null)
        {
            searchListener.onSearchClicked(view.getContext());
        }
    }

    void setSearchListener(SearchListener searchlistener)
    {
        Preconditions.checkNotNull(searchlistener);
        searchListener = searchlistener;
    }
}
