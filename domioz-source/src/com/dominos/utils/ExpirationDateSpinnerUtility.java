// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;

import android.content.Context;
import android.content.res.Resources;
import android.widget.Spinner;
import com.dominos.adapters.ExpirationDateSpinnerAdapter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ExpirationDateSpinnerUtility
{

    private static final long SPINNER_LISTENER_DELAY = 1000L;
    private Context context;
    private ExpirationDateSpinnerAdapter mMonthAdapter;
    private ExpirationDateSpinnerAdapter mYearAdapter;
    private final List months = new ArrayList();
    private String monthsArray[];
    private final Spinner ourMonthSpinner;
    private final Spinner ourYearSpinner;
    private final List years = new ArrayList();

    public ExpirationDateSpinnerUtility(Context context1, Spinner spinner, Spinner spinner1)
    {
        context = context1;
        ourMonthSpinner = spinner;
        ourYearSpinner = spinner1;
        years.add(context1.getString(0x7f080344));
        spinner = Calendar.getInstance();
        for (int i = 1; i < 18; i++)
        {
            years.add(String.valueOf(spinner.get(1)));
            spinner.roll(1, true);
        }

        monthsArray = context1.getResources().getStringArray(0x7f090000);
        context1 = monthsArray;
        int k = context1.length;
        for (int j = 0; j < k; j++)
        {
            spinner = context1[j];
            months.add(spinner);
        }

    }

    private void initializeYearSpinner()
    {
        mYearAdapter = new ExpirationDateSpinnerAdapter(context, 0x1090008, years);
        mYearAdapter.setDropDownViewResource(0x1090009);
        ourYearSpinner.setAdapter(mYearAdapter);
        ourYearSpinner.setEnabled(true);
    }

    private void intializeMonthSpinner()
    {
        mMonthAdapter = new ExpirationDateSpinnerAdapter(context, 0x1090008, context.getResources().getStringArray(0x7f090001));
        mMonthAdapter.setDropDownViewResource(0x1090009);
        ourMonthSpinner.setAdapter(mMonthAdapter);
        ourMonthSpinner.setEnabled(true);
        ourMonthSpinner.setFocusable(true);
        ourMonthSpinner.setFocusableInTouchMode(true);
        ourMonthSpinner.postDelayed(new _cls1(), 1000L);
        ourMonthSpinner.setOnFocusChangeListener(new _cls2());
    }

    public void initializeSpinners()
    {
        initializeYearSpinner();
        intializeMonthSpinner();
    }

    public void setMonthSpinnerSelection(String s)
    {
        String s1 = s.trim();
        s = s1;
        if (s1.length() == 1)
        {
            s = (new StringBuilder("0")).append(s1).toString();
        }
        if (months.contains(s))
        {
            ourMonthSpinner.setSelection(months.indexOf(s));
            return;
        } else
        {
            ourMonthSpinner.setSelection(0);
            return;
        }
    }

    public void setYearSpinnerSelection(String s)
    {
        if (years.contains(s))
        {
            ourYearSpinner.setSelection(years.indexOf(s));
            return;
        } else
        {
            ourYearSpinner.setSelection(0);
            return;
        }
    }



    private class _cls1
        implements Runnable
    {

        final ExpirationDateSpinnerUtility this$0;

        public void run()
        {
            class _cls1
                implements android.widget.AdapterView.OnItemSelectedListener
            {

                final _cls1 this$1;

                public void onItemSelected(AdapterView adapterview, View view, int i, long l)
                {
                    if (adapterview.getSelectedItemPosition() > 0)
                    {
                        ourYearSpinner.performClick();
                    }
                }

                public void onNothingSelected(AdapterView adapterview)
                {
                }

                _cls1()
                {
                    this$1 = _cls1.this;
                    super();
                }
            }

            ourMonthSpinner.setOnItemSelectedListener(new _cls1());
        }

        _cls1()
        {
            this$0 = ExpirationDateSpinnerUtility.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnFocusChangeListener
    {

        final ExpirationDateSpinnerUtility this$0;

        public void onFocusChange(View view, boolean flag)
        {
            if (flag)
            {
                ourMonthSpinner.performClick();
            }
        }

        _cls2()
        {
            this$0 = ExpirationDateSpinnerUtility.this;
            super();
        }
    }

}
