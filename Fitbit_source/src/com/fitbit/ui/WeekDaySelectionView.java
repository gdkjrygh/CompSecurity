// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.fitbit.customui.BundleSaveState;
import com.fitbit.util.al;
import com.fitbit.util.d;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Set;
import java.util.TreeSet;

public class WeekDaySelectionView extends LinearLayout
    implements android.widget.CompoundButton.OnCheckedChangeListener
{
    private static class WeekDayFormat extends DateFormat
    {

        private static final SparseIntArray a;
        private static final long serialVersionUID = 0x953a319656cbb4dfL;
        private Calendar calendar;
        private Context context;

        public StringBuffer format(Date date, StringBuffer stringbuffer, FieldPosition fieldposition)
        {
            calendar.setTime(date);
            int i = calendar.get(7);
            i = a.get(i, 0);
            if (i != 0)
            {
                return new StringBuffer(context.getString(i));
            } else
            {
                return new StringBuffer();
            }
        }

        public Date parse(String s, ParsePosition parseposition)
        {
            return null;
        }

        static 
        {
            a = new SparseIntArray();
            a.put(2, 0x7f080407);
            a.put(3, 0x7f08055f);
            a.put(5, 0x7f080520);
            a.put(6, 0x7f08022e);
            a.put(1, 0x7f0804f9);
            a.put(7, 0x7f080498);
            a.put(4, 0x7f08058c);
        }

        public WeekDayFormat(Context context1)
        {
            context = context1.getApplicationContext();
            calendar = new GregorianCalendar();
        }
    }

    public static interface a
    {

        public abstract void a(WeekDaySelectionView weekdayselectionview, Set set);
    }


    private static final int a[] = {
        0x7f11048c, 0x7f11048d, 0x7f11048e, 0x7f11048f, 0x7f110490, 0x7f110491, 0x7f110492
    };
    private CheckBox b[];
    private Calendar c;
    private Set d;
    private a e;
    private WeekDayFormat f;

    public WeekDaySelectionView(Context context)
    {
        this(context, null);
    }

    public WeekDaySelectionView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = new CheckBox[7];
        d = new TreeSet();
    }

    public WeekDaySelectionView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = new CheckBox[7];
        d = new TreeSet();
    }

    private int a(int i)
    {
        c.set(7, c.getFirstDayOfWeek());
        c.add(7, i);
        return c.get(7);
    }

    private int a(CompoundButton compoundbutton)
    {
        for (int i = 0; i < b.length; i++)
        {
            if (compoundbutton == b[i])
            {
                return i;
            }
        }

        return -1;
    }

    private void e()
    {
        c.set(7, c.getFirstDayOfWeek());
        for (int i = 0; i < b.length; i++)
        {
            b[i] = (CheckBox)findViewById(a[i]);
            b[i].setText(f.format(c.getTime()));
            b[i].setChecked(d.contains(Integer.valueOf(c.get(7))));
            b[i].setOnCheckedChangeListener(this);
            c.add(7, 1);
        }

    }

    protected void a()
    {
        if (c == null)
        {
            c = new GregorianCalendar(al.a());
        }
        if (f == null)
        {
            f = new WeekDayFormat(getContext());
        }
        e();
    }

    public void a(a a1)
    {
        e = a1;
    }

    public void a(Set set)
    {
        d = set;
        if (d == null)
        {
            d = new TreeSet();
        }
        e();
    }

    public void b()
    {
        e();
    }

    public Set c()
    {
        return new TreeSet(d);
    }

    public a d()
    {
        return e;
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        int i = a(compoundbutton);
        if (i >= 0)
        {
            if (flag)
            {
                d.add(Integer.valueOf(a(i)));
            } else
            {
                d.remove(Integer.valueOf(a(i)));
            }
            if (e != null)
            {
                e.a(this, new TreeSet(d));
            }
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (BundleSaveState)parcelable;
        int ai[] = parcelable.a().getIntArray("days");
        d.clear();
        d.addAll(com.fitbit.util.d.a(ai));
        e();
        super.onRestoreInstanceState(parcelable.getSuperState());
    }

    protected Parcelable onSaveInstanceState()
    {
        BundleSaveState bundlesavestate = new BundleSaveState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        bundle.putIntArray("days", com.fitbit.util.d.a(d));
        bundlesavestate.a(bundle);
        return bundlesavestate;
    }

}
