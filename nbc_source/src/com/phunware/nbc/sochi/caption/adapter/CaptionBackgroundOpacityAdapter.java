// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.caption.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import com.nbcsports.liveextra.ApplicationComponent;
import com.phunware.nbc.sochi.NBCSportsApplication;
import com.phunware.nbc.sochi.caption.caption.CaptionPreviewHelper;
import com.phunware.nbc.sochi.data.BindingAdapter;

public class CaptionBackgroundOpacityAdapter extends BindingAdapter
{

    private final CaptionPreviewHelper captionPreviewHelper = NBCSportsApplication.component().captionPreviewHelper();
    private final LayoutInflater inflater;
    private final Context mContext;
    private final int mDefaultOpacity;
    private final int mOpacities[];

    public CaptionBackgroundOpacityAdapter(Context context, int i)
    {
        mContext = context;
        inflater = (LayoutInflater)context.getSystemService("layout_inflater");
        mDefaultOpacity = i;
        mOpacities = mContext.getResources().getIntArray(0x7f0d0006);
    }

    public void bindView(int i, int j, View view, ViewGroup viewgroup)
    {
        viewgroup = view.findViewById(0x7f0f0124);
        CheckedTextView checkedtextview = (CheckedTextView)view.findViewById(0x1020014);
        i = getItem(i).intValue();
        viewgroup.setBackgroundColor(captionPreviewHelper.mapColorNameToARGB("Black", i));
        viewgroup = mContext.getString(0x7f07009a, new Object[] {
            Integer.valueOf(i)
        });
        view = viewgroup;
        if (i == mDefaultOpacity)
        {
            view = mContext.getString(0x7f07007b, new Object[] {
                viewgroup
            });
        }
        checkedtextview.setText(view);
    }

    public int getCount()
    {
        return mOpacities.length;
    }

    public Integer getItem(int i)
    {
        return Integer.valueOf(mOpacities[i]);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int[] getItems()
    {
        return mOpacities;
    }

    public View newView(int i, ViewGroup viewgroup)
    {
        return inflater.inflate(0x7f040058, viewgroup, false);
    }
}
