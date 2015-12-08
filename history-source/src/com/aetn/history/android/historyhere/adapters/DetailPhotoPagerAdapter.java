// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.aetn.history.android.historyhere.model.HttpRequestManager;
import com.aetn.history.android.historyhere.model.PhotoData;
import com.aetn.history.android.historyhere.widgets.FontFitTextView;
import com.android.volley.toolbox.NetworkImageView;
import java.util.ArrayList;

public class DetailPhotoPagerAdapter extends PagerAdapter
{

    private final String TAG = "DetailPhotoPagerAdapter";
    LayoutInflater inflater;
    private Context mContext;
    private ArrayList mData;

    public DetailPhotoPagerAdapter(Context context, ArrayList arraylist)
    {
        mContext = context;
        mData = arraylist;
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView((RelativeLayout)obj);
    }

    public int getCount()
    {
        return mData.size();
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        inflater = (LayoutInflater)mContext.getSystemService("layout_inflater");
        View view = inflater.inflate(0x7f03002d, viewgroup, false);
        NetworkImageView networkimageview = (NetworkImageView)view.findViewById(0x7f0a007f);
        FontFitTextView fontfittextview = (FontFitTextView)view.findViewById(0x7f0a0080);
        PhotoData photodata = (PhotoData)mData.get(i);
        if (!photodata.photoCredit.isEmpty())
        {
            fontfittextview.setText(photodata.photoCredit);
            fontfittextview.setVisibility(0);
        } else
        {
            fontfittextview.setVisibility(4);
        }
        networkimageview.setImageUrl(photodata.photoURL, HttpRequestManager.getInstance(mContext).getImageLoader());
        viewgroup.addView(view);
        return view;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }
}
