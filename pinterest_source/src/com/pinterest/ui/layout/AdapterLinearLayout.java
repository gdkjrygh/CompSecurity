// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.layout;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Adapter;
import android.widget.LinearLayout;

public class AdapterLinearLayout extends LinearLayout
    implements android.view.View.OnClickListener
{

    private Adapter _adapter;
    private DataSetObserver _dataSetObserver;
    private int _maxChildViews;
    private int _numHeaderView;
    private OnChildViewClickListener _onChildViewClickListener;

    public AdapterLinearLayout(Context context)
    {
        this(context, null);
    }

    public AdapterLinearLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AdapterLinearLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _dataSetObserver = new _cls1();
        _maxChildViews = 0x7fffffff;
        _numHeaderView = 0;
    }

    public void addHeaderView(View view)
    {
        addView(view, 0);
        _numHeaderView = _numHeaderView + 1;
        requestLayout();
    }

    protected android.widget.LinearLayout.LayoutParams createChildViewLayoutParams(View view, int i)
    {
        return null;
    }

    public Adapter getAdapter()
    {
        return _adapter;
    }

    public void onClick(View view)
    {
        int i;
        if (_onChildViewClickListener != null)
        {
            if ((i = indexOfChild(view)) != -1)
            {
                _onChildViewClickListener.onChildViewClick(_adapter.getItem(i - _numHeaderView));
                return;
            }
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (_adapter != null)
        {
            _adapter.unregisterDataSetObserver(_dataSetObserver);
        }
    }

    public void setAdapter(Adapter adapter)
    {
        if (_adapter == adapter)
        {
            return;
        }
        _adapter = adapter;
        if (adapter != null)
        {
            adapter.registerDataSetObserver(_dataSetObserver);
        }
        updateView();
    }

    public void setMaxChildViews(int i)
    {
        _maxChildViews = i;
        updateView();
    }

    public void setOnChildViewClickListener(OnChildViewClickListener onchildviewclicklistener)
    {
        _onChildViewClickListener = onchildviewclicklistener;
    }

    protected void updateView()
    {
        int i = 0;
        removeAllViews();
        _numHeaderView = 0;
        if (_adapter == null)
        {
            return;
        }
        for (int j = Math.min(_adapter.getCount(), _maxChildViews); i < j; i++)
        {
            View view = _adapter.getView(i, null, this);
            android.widget.LinearLayout.LayoutParams layoutparams = createChildViewLayoutParams(view, i);
            if (layoutparams != null)
            {
                view.setLayoutParams(layoutparams);
            }
            view.setOnClickListener(this);
            if (view != null)
            {
                addView(view);
            }
        }

        requestLayout();
    }

    private class _cls1 extends DataSetObserver
    {

        final AdapterLinearLayout this$0;

        public void onChanged()
        {
            super.onChanged();
            updateView();
        }

        _cls1()
        {
            this$0 = AdapterLinearLayout.this;
            super();
        }
    }


    private class OnChildViewClickListener
    {

        public abstract void onChildViewClick(Object obj);
    }

}
