// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.validation;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public abstract class ValidatedSpinnerAdapterWrapper
    implements SpinnerAdapter
{

    private final SpinnerAdapter baseAdapter;
    private final Context context;
    private final int hintTextViewResId;
    private final LayoutInflater inflater;

    public ValidatedSpinnerAdapterWrapper(Context context1, SpinnerAdapter spinneradapter, int i)
    {
        context = context1;
        inflater = LayoutInflater.from(context1);
        baseAdapter = spinneradapter;
        hintTextViewResId = i;
    }

    public static int getNumExtraViews()
    {
        return 1;
    }

    public int getCount()
    {
        int i = baseAdapter.getCount();
        if (i == 0)
        {
            return i;
        } else
        {
            return i + 1;
        }
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        if (i == 0)
        {
            if (view != null && "TAG_HINT".equals(view.getTag()))
            {
                return view;
            } else
            {
                view = new View(context);
                view.setVisibility(8);
                view.setTag("TAG_HINT");
                return view;
            }
        }
        View view1 = view;
        if (view != null)
        {
            view1 = view;
            if (!"TAG_ITEM".equals(view.getTag()))
            {
                view1 = null;
            }
        }
        view = baseAdapter.getDropDownView(i - 1, view1, viewgroup);
        view.setTag("TAG_ITEM");
        return view;
    }

    protected abstract String getHintText();

    public Object getItem(int i)
    {
        if (i == 0)
        {
            return null;
        } else
        {
            return baseAdapter.getItem(i - 1);
        }
    }

    public long getItemId(int i)
    {
        if (i == 0)
        {
            return -1L;
        } else
        {
            return baseAdapter.getItemId(i - 1);
        }
    }

    protected abstract Object getItemValue(int i);

    public int getItemViewType(int i)
    {
        if (i == 0)
        {
            return baseAdapter.getViewTypeCount();
        } else
        {
            return baseAdapter.getItemViewType(i - 1);
        }
    }

    public final Object getValue(int i)
    {
        if (i == 0)
        {
            return null;
        } else
        {
            return getItemValue(i - 1);
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (i == 0)
        {
            if (view != null && "TAG_HINT".equals(view.getTag()))
            {
                view = (TextView)view;
            } else
            {
                view = (TextView)inflater.inflate(hintTextViewResId, viewgroup, false);
                view.setTag("TAG_HINT");
            }
            view.setText(getHintText());
            view.setTextColor(context.getResources().getColor(com.google.android.apps.walletnfcrel.R.color.light));
            return view;
        }
        View view1 = view;
        if (view != null)
        {
            view1 = view;
            if (!"TAG_ITEM".equals(view.getTag()))
            {
                view1 = null;
            }
        }
        view = baseAdapter.getView(i - 1, view1, viewgroup);
        view.setTag("TAG_ITEM");
        return view;
    }

    public int getViewTypeCount()
    {
        return baseAdapter.getViewTypeCount();
    }

    public boolean hasStableIds()
    {
        return baseAdapter.hasStableIds();
    }

    public boolean isEmpty()
    {
        return baseAdapter.isEmpty();
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        baseAdapter.registerDataSetObserver(datasetobserver);
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        baseAdapter.unregisterDataSetObserver(datasetobserver);
    }
}
