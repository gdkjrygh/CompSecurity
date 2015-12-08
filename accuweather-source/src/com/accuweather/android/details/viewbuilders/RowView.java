// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.details.viewbuilders;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.accuweather.android.enums.LayoutStyleType;

public class RowView extends LinearLayout
{

    public RowView(Context context, LayoutStyleType layoutstyletype)
    {
        super(context);
        if (layoutstyletype.equals(LayoutStyleType.RIGHT_MARGIN))
        {
            View.inflate(context, com.accuweather.android.R.layout.details_quick_view_row_left_align, this);
        } else
        {
            if (layoutstyletype.equals(LayoutStyleType.LEFT_MARGIN))
            {
                View.inflate(context, com.accuweather.android.R.layout.details_quick_view_row_right_align, this);
                return;
            }
            if (layoutstyletype.equals(LayoutStyleType.DAILY_TABLE))
            {
                View.inflate(context, com.accuweather.android.R.layout.daily_details_table_row, this);
                return;
            }
            if (layoutstyletype.equals(LayoutStyleType.HOURLY_TABLE))
            {
                View.inflate(context, com.accuweather.android.R.layout.hourly_details_table_row, this);
                return;
            }
        }
    }
}
