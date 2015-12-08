// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.dominos.android.sdk.common.ConversionUtil;
import com.dominos.android.sdk.common.ConversionUtil_;
import com.dominos.android.sdk.common.FontManager;
import java.util.List;

public class DominosArrayAdapter extends ArrayAdapter
{

    private static final int BLACK_COLOR_ID = 0x7f0e000b;
    private static final int GREY_COLOR_ID = 0x7f0e00c2;
    private int colorId;
    private final Context context;
    private ConversionUtil mConversionUtil;

    public DominosArrayAdapter(Context context1, int i, List list)
    {
        super(context1, i, list);
        colorId = 0x7f0e000b;
        context = context1;
        mConversionUtil = ConversionUtil_.getInstance_(context);
    }

    public DominosArrayAdapter(Context context1, int i, List list, int j)
    {
        super(context1, i, list);
        colorId = 0x7f0e000b;
        context = context1;
        colorId = j;
        mConversionUtil = ConversionUtil_.getInstance_(context);
    }

    public DominosArrayAdapter(Context context1, int i, String as[])
    {
        super(context1, i, as);
        colorId = 0x7f0e000b;
        context = context1;
        mConversionUtil = ConversionUtil_.getInstance_(context);
    }

    private void applyStyle(TextView textview, int i)
    {
        FontManager.applyDominosFont(textview);
        if (i > 0)
        {
            textview.setTextColor(context.getResources().getColor(colorId));
        } else
        {
            textview.setTextColor(context.getResources().getColor(0x7f0e00c2));
        }
        textview.setTextSize(2, 14F);
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        view = (TextView)super.getDropDownView(i, view, viewgroup);
        applyStyle(view, i);
        return view;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = (TextView)super.getView(i, view, viewgroup);
        applyStyle(view, i);
        view.setGravity(16);
        view.setHeight(mConversionUtil.dpToPixels(30));
        return view;
    }
}
