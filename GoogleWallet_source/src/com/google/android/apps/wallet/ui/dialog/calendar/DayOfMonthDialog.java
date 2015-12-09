// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.ui.dialog.calendar;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.TextView;
import com.google.android.apps.wallet.util.view.Views;
import java.text.NumberFormat;

public class DayOfMonthDialog extends DialogFragment
    implements android.view.View.OnClickListener
{
    public static interface DayOfMonthDialogListener
    {

        public abstract void onDayOfMonthSelected(int i);
    }

    public static final class Factory
    {

        public static DayOfMonthDialog create(String s, int i)
        {
            DayOfMonthDialog dayofmonthdialog = new DayOfMonthDialog();
            Bundle bundle = new Bundle();
            bundle.putString("title", s);
            bundle.putInt("dayOfMonth", i);
            dayofmonthdialog.setArguments(bundle);
            return dayofmonthdialog;
        }

        public Factory()
        {
        }
    }


    private NumberFormat numberFormat;

    public DayOfMonthDialog()
    {
        numberFormat = NumberFormat.getNumberInstance();
    }

    public void onClick(View view)
    {
        int i = ((Integer)view.getTag()).intValue();
        ((DayOfMonthDialogListener)getActivity()).onDayOfMonthSelected(i);
        dismiss();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.day_of_month_dialog, viewgroup);
        getDialog().setTitle(getArguments().getString("title"));
        int j = getArguments().getInt("dayOfMonth");
        viewgroup = (GridLayout)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.daysContainer);
        int i = 0;
        while (i < 28) 
        {
            int k = i + 1;
            bundle = (TextView)viewgroup.getChildAt(i);
            bundle.setTag(Integer.valueOf(k));
            bundle.setText(numberFormat.format(k));
            bundle.setOnClickListener(this);
            boolean flag;
            if (j == k)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            bundle.setSelected(flag);
            i++;
        }
        viewgroup = (TextView)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.lastDayButton);
        viewgroup.setTag(Integer.valueOf(32));
        viewgroup.setOnClickListener(this);
        boolean flag1;
        if (j == 32)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        viewgroup.setSelected(flag1);
        return layoutinflater;
    }
}
