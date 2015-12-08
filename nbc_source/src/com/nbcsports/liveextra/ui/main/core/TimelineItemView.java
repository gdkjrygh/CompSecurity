// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class TimelineItemView extends RelativeLayout
{

    private DateTime date;
    private boolean selected;
    TextView tv1;
    TextView tv2;

    public TimelineItemView(Context context)
    {
        this(context, null);
    }

    public TimelineItemView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TimelineItemView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void bind(DateTime datetime)
    {
        date = datetime;
        if (tv1 == null)
        {
            return;
        }
        setSelected(selected);
        if (datetime == null)
        {
            tv1.setText(0x7f07011e);
            tv2.setVisibility(8);
            tv1.setTag(Integer.valueOf(0));
            return;
        } else
        {
            tv1.setText(DateTimeFormat.forPattern("MM/dd").print(datetime));
            tv1.setTag(Long.valueOf(datetime.getMillis()));
            tv2.setVisibility(0);
            tv2.setText(datetime.dayOfWeek().getAsText());
            return;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        ButterKnife.bind(this);
        bind(date);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        ButterKnife.unbind(this);
    }

    public void setSelected(boolean flag)
    {
        super.setSelected(flag);
        selected = flag;
        if (tv1 == null)
        {
            return;
        } else
        {
            tv1.setSelected(flag);
            tv2.setSelected(flag);
            return;
        }
    }
}
