// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.list;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

// Referenced classes of package com.google.android.apps.wallet.widgets.list:
//            BaseListAdapter, ListItemBinder

public final class SingleItemAdapter extends BaseListAdapter
{

    private boolean mIsEnabled;
    private Object mItem;
    private final ListItemBinder mListItemBinder;

    public SingleItemAdapter(ListItemBinder listitembinder)
    {
        mIsEnabled = false;
        Preconditions.checkNotNull(listitembinder);
        mListItemBinder = listitembinder;
    }

    public final boolean areAllItemsEnabled()
    {
        return mIsEnabled;
    }

    public final int getCount()
    {
        return mItem == null ? 0 : 1;
    }

    public final Object getItem(int i)
    {
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return mItem;
    }

    protected final ListItemBinder getItemBinder(int i)
    {
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return mListItemBinder;
    }

    public final boolean isEnabled(int i)
    {
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return mIsEnabled;
    }

    public final SingleItemAdapter setIsEnabled(boolean flag)
    {
        if (mIsEnabled != flag)
        {
            mIsEnabled = flag;
            notifyDataSetChanged();
        }
        return this;
    }

    public final SingleItemAdapter setItem(Object obj)
    {
        if (!Objects.equal(mItem, obj))
        {
            mItem = obj;
            notifyDataSetChanged();
        }
        return this;
    }
}
