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
import java.text.DateFormatSymbols;
import java.util.Calendar;

public class DayOfWeekDialog extends DialogFragment
    implements android.view.View.OnClickListener
{
    public static interface DayOfWeekDialogListener
    {

        public abstract void onDayOfWeekSelected(int i);
    }

    public static final class Factory
    {

        public static DayOfWeekDialog create(String s, int i)
        {
            DayOfWeekDialog dayofweekdialog = new DayOfWeekDialog();
            Bundle bundle = new Bundle();
            bundle.putString("title", s);
            bundle.putInt("dayOfWeek", i);
            dayofweekdialog.setArguments(bundle);
            return dayofweekdialog;
        }

        public Factory()
        {
        }
    }


    public DayOfWeekDialog()
    {
    }

    public void onClick(View view)
    {
        int i = ((Integer)view.getTag()).intValue();
        ((DayOfWeekDialogListener)getActivity()).onDayOfWeekSelected(i);
        dismiss();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.day_of_week_dialog, viewgroup);
        getDialog().setTitle(getArguments().getString("title"));
        bundle = new DateFormatSymbols();
        int j = Calendar.getInstance().getFirstDayOfWeek();
        int k = getArguments().getInt("dayOfWeek");
        viewgroup = bundle.getShortWeekdays();
        bundle = bundle.getShortWeekdays();
        GridLayout gridlayout = (GridLayout)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.daysContainer);
        int i = 0;
        while (i < 7) 
        {
            TextView textview = (TextView)gridlayout.getChildAt(i);
            int l = ((j + i) - 1) % 7 + 1;
            textview.setTag(Integer.valueOf(l));
            textview.setText(viewgroup[l]);
            textview.setContentDescription(bundle[l]);
            textview.setOnClickListener(this);
            boolean flag;
            if (k == l)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            textview.setSelected(flag);
            i++;
        }
        return layoutinflater;
    }
}
