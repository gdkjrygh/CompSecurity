// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

public class HorizontalListView extends HorizontalScrollView
    implements android.view.View.OnClickListener
{

    private BaseAdapter mAdapter;
    private final Context mContext;
    AbstractDataSetObserver mDataSetObserver;
    private OnItemClickListener mOnItemClickListener;
    private LinearLayout mParent;

    public HorizontalListView(Context context)
    {
        super(context);
        mContext = context;
    }

    public HorizontalListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mContext = context;
    }

    private void addItemView(View view, int i)
    {
        setupItemView(view, i);
        mParent.addView(view, i);
    }

    private View obtainView(int i)
    {
        return mAdapter.getView(i, null, this);
    }

    private void setupItemView(View view, int i)
    {
        view.requestFocusFromTouch();
        view.setPadding(2, 0, 2, 0);
        view.setOnClickListener(this);
        view.setTag(Integer.valueOf(i));
    }

    public void clear()
    {
        if (mParent != null)
        {
            mParent.removeAllViewsInLayout();
        }
    }

    public Adapter getAdapter()
    {
        return mAdapter;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (mAdapter != null && mDataSetObserver == null)
        {
            mDataSetObserver = new AbstractDataSetObserver(null);
            mAdapter.registerDataSetObserver(mDataSetObserver);
        }
    }

    public void onClick(View view)
    {
        if (mOnItemClickListener != null)
        {
            mOnItemClickListener.onItemClick(view, ((Integer)view.getTag()).intValue());
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (mAdapter != null && mDataSetObserver != null)
        {
            mAdapter.unregisterDataSetObserver(mDataSetObserver);
            mDataSetObserver = null;
        }
    }

    void refreshLayout()
    {
        if (mParent != null)
        {
            removeAllViewsInLayout();
        }
        mParent = new LinearLayout(mContext);
        int j = mAdapter.getCount();
        int i = 0;
        do
        {
            if (i >= j)
            {
                break;
            }
            View view = obtainView(i);
            if (view != null)
            {
                addItemView(view, i);
                i++;
            }
        } while (true);
        addView(mParent);
    }

    public void setAdapter(BaseAdapter baseadapter)
    {
        if (mAdapter != null && mDataSetObserver != null)
        {
            mAdapter.unregisterDataSetObserver(mDataSetObserver);
            mDataSetObserver = null;
        }
        mAdapter = baseadapter;
        if (mAdapter != null)
        {
            mDataSetObserver = new AbstractDataSetObserver(null);
            mAdapter.registerDataSetObserver(mDataSetObserver);
        }
        refreshLayout();
    }

    public void setOnItemClickListener(OnItemClickListener onitemclicklistener)
    {
        mOnItemClickListener = onitemclicklistener;
    }

    private class AbstractDataSetObserver extends DataSetObserver
    {

        final HorizontalListView this$0;

        public void onChanged()
        {
            refreshLayout();
        }

        public void onInvalidated()
        {
            super.onInvalidated();
            refreshLayout();
        }

        private AbstractDataSetObserver()
        {
            this$0 = HorizontalListView.this;
            super();
        }

        AbstractDataSetObserver(_cls1 _pcls1)
        {
            this();
        }
    }


    private class OnItemClickListener
    {

        public abstract void onItemClick(View view, int i);
    }

}
