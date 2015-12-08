// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import me.lyft.android.domain.driver.DriverActivities;
import me.lyft.android.domain.payment.Money;

public class DriverActivitiesView extends LinearLayout
{

    private static final int SECONDS_IN_HOUR = 3600;
    private static final int SECONDS_IN_MINUTE = 60;
    TextView activityTitle;
    TextView amountEarned;
    TextView hoursCount;
    TextView ridesCount;

    public DriverActivitiesView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    private Spanned formatTimeDriven(int i)
    {
        long l1 = i;
        long l = l1 / 3600L;
        l1 = (l1 - 3600L * l) / 60L;
        return Html.fromHtml(getContext().getString(0x7f070358, new Object[] {
            Long.valueOf(l), Long.valueOf(l1)
        }));
    }

    public void displayStats(DriverActivities driveractivities)
    {
        if (driveractivities.isNull())
        {
            return;
        } else
        {
            activityTitle.setText(driveractivities.getSubtitle());
            amountEarned.setText(driveractivities.getAmountEarned().format());
            amountEarned.setEnabled(true);
            ridesCount.setText(String.valueOf(driveractivities.getRideCount()));
            ridesCount.setEnabled(true);
            hoursCount.setText(formatTimeDriven(driveractivities.getTimeDrivenSeconds().intValue()));
            hoursCount.setEnabled(true);
            return;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        hoursCount.setText(Html.fromHtml(getContext().getString(0x7f070352)));
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }
}
