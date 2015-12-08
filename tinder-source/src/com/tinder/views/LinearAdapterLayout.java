// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;

public class LinearAdapterLayout extends LinearLayout
{
    private class Observer extends DataSetObserver
    {

        final LinearAdapterLayout this$0;

        public void onChanged()
        {
            super.onChanged();
            layoutFromAdapter();
        }

        private Observer()
        {
            this$0 = LinearAdapterLayout.this;
            super();
        }

    }


    private BaseAdapter mAdapter;
    private View mFooter;
    private View mHeader;
    private DataSetObserver mObserver;
    private android.view.View.OnClickListener mOnClickListenerExternal;
    private android.view.View.OnClickListener mOnClickListenerInternal;

    public LinearAdapterLayout(Context context)
    {
        super(context);
        init();
    }

    public LinearAdapterLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public LinearAdapterLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    public LinearAdapterLayout(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
        init();
    }

    private void init()
    {
        mObserver = new Observer();
    }

    private void layoutFromAdapter()
    {
        boolean flag = true;
        boolean flag1 = false;
        int j = mAdapter.getCount();
        int i;
        if (mHeader != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (mFooter == null)
        {
            flag = false;
        }
        removeAllViews();
        if (i != 0)
        {
            addView(mHeader);
        }
        for (i = 0; i < j; i++)
        {
            addView(mAdapter.getView(i, null, this));
        }

        i = ((flag1) ? 1 : 0);
        if (flag)
        {
            addView(mFooter);
            i = ((flag1) ? 1 : 0);
        }
        for (; i < getChildCount(); i++)
        {
            getChildAt(i).setOnClickListener(mOnClickListenerInternal);
        }

    }

    public BaseAdapter getAdapter()
    {
        return mAdapter;
    }

    public View getFooter()
    {
        return mFooter;
    }

    public View getHeader()
    {
        return mHeader;
    }

    public void setAdapter(BaseAdapter baseadapter)
    {
        mAdapter = baseadapter;
        mAdapter.registerDataSetObserver(mObserver);
        mObserver.onChanged();
    }

    public void setFooter(View view)
    {
        mFooter = view;
        if (mAdapter != null)
        {
            mObserver.onChanged();
        }
    }

    public void setHeader(View view)
    {
        mHeader = view;
        if (mAdapter != null)
        {
            mObserver.onChanged();
        }
    }

    public void setOnClickListenerForItems(android.view.View.OnClickListener onclicklistener)
    {
        mOnClickListenerExternal = onclicklistener;
        mOnClickListenerInternal = new android.view.View.OnClickListener() {

            final LinearAdapterLayout this$0;

            public void onClick(View view)
            {
                mOnClickListenerExternal.onClick(view);
            }

            
            {
                this$0 = LinearAdapterLayout.this;
                super();
            }
        };
    }


}
