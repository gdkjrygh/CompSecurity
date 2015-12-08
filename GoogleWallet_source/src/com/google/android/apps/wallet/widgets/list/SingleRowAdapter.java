// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.list;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

public class SingleRowAdapter extends BaseAdapter
{

    private TextView mCachedTextView;
    private Object mData;
    private boolean mIsSelectable;
    private View mView;

    public SingleRowAdapter()
    {
    }

    private TextView getCachedTextView()
    {
        if (mCachedTextView != null)
        {
            return mCachedTextView;
        }
        if (mView == null)
        {
            return null;
        }
        if (mView instanceof TextView)
        {
            mCachedTextView = (TextView)mView;
        }
        return mCachedTextView;
    }

    public boolean areAllItemsEnabled()
    {
        return mIsSelectable;
    }

    public int getCount()
    {
        return !isVisible() ? 0 : 1;
    }

    public Object getItem(int i)
    {
        return mData;
    }

    public long getItemId(int i)
    {
        return -1L;
    }

    public final View getView()
    {
        return mView;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        return getView();
    }

    public boolean isEnabled(int i)
    {
        return mIsSelectable;
    }

    public boolean isVisible()
    {
        return mView != null;
    }

    public final void setText(String s)
    {
        TextView textview = getCachedTextView();
        Preconditions.checkNotNull(textview, "Can not set text on a row without a text view.");
        if (!Objects.equal(textview.getText().toString(), s))
        {
            textview.setText(s);
            notifyDataSetChanged();
        }
    }

    public final void setView(View view)
    {
        setView(view, null, false);
    }

    public final void setView(View view, Object obj, boolean flag)
    {
        mView = view;
        mData = obj;
        mIsSelectable = flag;
        mCachedTextView = null;
        notifyDataSetChanged();
    }
}
