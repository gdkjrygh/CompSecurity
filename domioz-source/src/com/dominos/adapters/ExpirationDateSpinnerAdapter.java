// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class ExpirationDateSpinnerAdapter extends ArrayAdapter
{

    private Context mContext;

    public ExpirationDateSpinnerAdapter(Context context, int i, List list)
    {
        super(context, i, list);
        mContext = context;
    }

    public ExpirationDateSpinnerAdapter(Context context, int i, String as[])
    {
        super(context, i, as);
        mContext = context;
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        view = (TextView)super.getDropDownView(i, view, viewgroup);
        view.setHeight(mContext.getResources().getDimensionPixelSize(0x7f0a00cf));
        view.setWidth(mContext.getResources().getDimensionPixelSize(0x7f0a00d0));
        return view;
    }
}
