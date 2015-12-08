// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Utilities;
import java.util.ArrayList;
import java.util.List;

public class LiteTitleSpinnerAdapter extends ArrayAdapter
{

    private Context mContext;
    private int mDropdownResId;
    private LayoutInflater mInflater;
    private List mItems;
    private int mResId;
    private int mTextColor;

    public LiteTitleSpinnerAdapter(Context context, int i, List list)
    {
        super(context, i, 0x1020014, list);
        mItems = new ArrayList();
        mTextColor = -1;
        mResId = i;
        mItems = list;
        mContext = context;
        mInflater = (LayoutInflater)context.getSystemService("layout_inflater");
        mDropdownResId = com.accuweather.android.R.layout.spinner_dropdown_item;
    }

    private CharSequence getValueForEditText(int i)
    {
        Object obj = getItem(i);
        if (obj != null)
        {
            return obj.toString();
        } else
        {
            return "";
        }
    }

    public int getCount()
    {
        if (mItems != null)
        {
            return mItems.size();
        } else
        {
            return 0;
        }
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view == null)
        {
            viewgroup = mInflater.inflate(mDropdownResId, null);
        }
        view = ((View) (getItem(i)));
        if (view != null && view.equals(mContext.getString(com.accuweather.android.R.string.NoLocationFound)))
        {
            viewgroup.setOnTouchListener(new android.view.View.OnTouchListener() {

                final LiteTitleSpinnerAdapter this$0;

                public boolean onTouch(View view1, MotionEvent motionevent)
                {
                    return true;
                }

            
            {
                this$0 = LiteTitleSpinnerAdapter.this;
                super();
            }
            });
        } else
        {
            viewgroup.setOnTouchListener(null);
        }
        view = getValueForEditText(i);
        ((TextView)viewgroup.findViewById(0x1020014)).setText(view);
        Utilities.setTypeFace(viewgroup, Data.getRobotoCondensed());
        return viewgroup;
    }

    public Object getItem(int i)
    {
        if (mItems != null && mItems.size() >= i)
        {
            return mItems.get(i);
        } else
        {
            return null;
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view == null)
        {
            viewgroup = mInflater.inflate(mResId, null);
        }
        view = getValueForEditText(i);
        ((TextView)viewgroup.findViewById(0x1020014)).setText(view);
        Utilities.setTypeFace(viewgroup, Data.getRobotoCondensed());
        Utilities.setTextColor(viewgroup, mTextColor);
        return viewgroup;
    }

    public void setDropDownViewResource(int i)
    {
        mDropdownResId = i;
        super.setDropDownViewResource(i);
    }

    public void setTextColor(int i)
    {
        mTextColor = i;
        notifyDataSetChanged();
    }
}
