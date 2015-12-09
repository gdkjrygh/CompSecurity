// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.list;

import com.google.common.base.Preconditions;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.widgets.list:
//            BaseListAdapter, ListItemBinder

public final class SimpleListAdapter extends BaseListAdapter
{

    private final List list = Lists.newArrayList();
    private final ListItemBinder listItemBinder;

    public SimpleListAdapter(ListItemBinder listitembinder)
    {
        Preconditions.checkNotNull(listitembinder);
        listItemBinder = listitembinder;
    }

    public final void addItems(Iterable iterable)
    {
        Iterables.addAll(list, iterable);
        notifyDataSetChanged();
    }

    public final void clearItems()
    {
        list.clear();
        notifyDataSetChanged();
    }

    public final int getCount()
    {
        return list.size();
    }

    public final Object getItem(int i)
    {
        return list.get(i);
    }

    protected final ListItemBinder getItemBinder(int i)
    {
        return listItemBinder;
    }

    public final void setItems(Iterable iterable)
    {
        list.clear();
        Iterables.addAll(list, iterable);
        notifyDataSetChanged();
    }
}
