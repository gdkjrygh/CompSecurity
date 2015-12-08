// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesBaseAdapter

public class SingleItemAdapter extends GamesBaseAdapter
{

    private boolean mIsVisible;
    private Object mItem;
    private View mView;

    public SingleItemAdapter()
    {
        this((byte)0);
    }

    private SingleItemAdapter(byte byte0)
    {
        mIsVisible = true;
        mView = null;
        mItem = null;
        mIsVisible = true;
    }

    public boolean areAllItemsEnabled()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (mIsVisible)
        {
            flag = flag1;
            if (isEnabled(0))
            {
                flag = true;
            }
        }
        return flag;
    }

    public int getCount()
    {
        return !mIsVisible ? 0 : 1;
    }

    public Object getItem(int i)
    {
        Asserts.checkState(mIsVisible);
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        return null;
    }

    public long getItemId(int i)
    {
        Asserts.checkState(mIsVisible);
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        return 0L;
    }

    public int getItemViewType(int i)
    {
        Asserts.checkState(mIsVisible);
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Asserts.checkState(mIsVisible);
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        return (View)Preconditions.checkNotNull(null);
    }

    public int getViewTypeCount()
    {
        return 1;
    }

    public boolean hasStableIds()
    {
        return true;
    }

    public boolean isEnabled(int i)
    {
        Asserts.checkState(mIsVisible);
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        return false;
    }

    public final void setVisible(boolean flag)
    {
        if (mIsVisible != flag)
        {
            mIsVisible = flag;
            notifyDataSetChanged();
        }
    }
}
