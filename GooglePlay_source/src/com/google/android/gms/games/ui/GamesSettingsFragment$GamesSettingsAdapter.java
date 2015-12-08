// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.gms.common.internal.Asserts;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesSettingsFragment

private final class mListItems extends BaseAdapter
{

    private ArrayList mListItems;
    final GamesSettingsFragment this$0;

    public final boolean areAllItemsEnabled()
    {
        return false;
    }

    public final int getCount()
    {
        return mListItems.size();
    }

    public final Object getItem(int i)
    {
        return mListItems.get(i);
    }

    public final long getItemId(int i)
    {
        return (long)((mListItems)getItem(i)).getItem;
    }

    public final int getItemViewType(int i)
    {
        return ((getItem)getItem(i)).getItem;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        getItem getitem = (getItem)getItem(i);
        if (view == null)
        {
            view = LayoutInflater.from(((Fragment) (getitem.getItem)).mActivity).inflate(getitem.getItem, viewgroup, false);
        }
        getitem.getItem(view);
        return view;
    }

    public final int getViewTypeCount()
    {
        return 3;
    }

    public final boolean isEnabled(int i)
    {
        return ((getItem)mListItems.get(i)).mListItems;
    }

    public (ArrayList arraylist)
    {
        this$0 = GamesSettingsFragment.this;
        super();
        Asserts.checkNotNull(arraylist);
        mListItems = arraylist;
    }
}
