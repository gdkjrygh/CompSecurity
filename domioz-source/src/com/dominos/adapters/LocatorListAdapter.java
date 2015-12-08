// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.dom.locator.LocatorStore;
import com.dominos.views.StoreView;
import java.util.List;

public class LocatorListAdapter extends ArrayAdapter
    implements android.view.View.OnClickListener
{

    private OnItemLinkClickListener linkClickListener;
    private final Context mContext;
    private final List mStoreList;

    public LocatorListAdapter(Context context, List list)
    {
        super(context, 0x7f0300b2, list);
        mContext = context;
        mStoreList = list;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = (LocatorStore)getItem(i);
        if (view == null)
        {
            view = LayoutInflater.from(mContext).inflate(0x7f0300b2, null);
        }
        ((StoreView)view).setStore(viewgroup);
        ((LinearLayout)view.findViewById(0x7f0f03b6)).setOnClickListener(this);
        viewgroup = (TextView)view.findViewById(0x7f0f03b3);
        if (viewgroup != null && mStoreList.size() > 0)
        {
            viewgroup.setText(Integer.toString(i + 1));
        }
        FontManager.applyDominosFont((ViewGroup)view);
        if (getCount() == 1)
        {
            view.findViewById(0x7f0f01d0).setBackgroundResource(0x7f020139);
            return view;
        }
        if (i == 0)
        {
            view.findViewById(0x7f0f01d0).setBackgroundResource(0x7f02013a);
            return view;
        }
        if (i == getCount() - 1)
        {
            view.findViewById(0x7f0f01d0).setBackgroundResource(0x7f020137);
            return view;
        } else
        {
            view.findViewById(0x7f0f01d0).setBackgroundResource(0x7f020138);
            return view;
        }
    }

    public void onClick(View view)
    {
        if (linkClickListener != null)
        {
            linkClickListener.onLinkClickListener(view);
        }
    }

    public void setOnItemLinkClickListener(OnItemLinkClickListener onitemlinkclicklistener)
    {
        linkClickListener = onitemlinkclicklistener;
    }

    private class OnItemLinkClickListener
    {

        public abstract void onLinkClickListener(View view);
    }

}
