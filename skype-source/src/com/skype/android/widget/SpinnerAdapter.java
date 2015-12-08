// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.List;

public class SpinnerAdapter extends ArrayAdapter
{

    private int selectedPosition;

    public SpinnerAdapter(Context context)
    {
        super(context, 0x7f03010f);
        setDropDownViewResource(0x7f03010f);
    }

    public SpinnerAdapter(Context context, int i)
    {
        super(context, i);
        setDropDownViewResource(i);
    }

    public SpinnerAdapter(Context context, List list)
    {
        super(context, 0x7f03010f, list);
        setDropDownViewResource(0x7f03010f);
    }

    public int getSelectedPosition()
    {
        return selectedPosition;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view == null)
        {
            viewgroup = LayoutInflater.from(getContext()).inflate(0x7f030110, null);
        }
        return viewgroup;
    }

    public void setSelectedPosition(int i)
    {
        selectedPosition = i;
    }
}
