// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import me.lyft.android.common.DateUtils;
import me.lyft.android.rx.MessageBus;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            DialogContainerView

public class DatePickerDialogView extends DialogContainerView
    implements android.widget.DatePicker.OnDateChangedListener
{

    MessageBus bus;
    DatePicker datePicker;
    Button okButton;
    me.lyft.android.ui.Dialogs.DatePickerDialog params;

    public DatePickerDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        params = (me.lyft.android.ui.Dialogs.DatePickerDialog)context.a();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        datePicker.init(params.year, params.month, params.day, this);
        if (params.disablePastDate)
        {
            Date date = DateUtils.createDate(params.year, params.month, params.day);
            datePicker.setMinDate(date.getTime() - TimeUnit.HOURS.toMillis(1L));
        }
    }

    public void onDateChanged(DatePicker datepicker, int i, int j, int k)
    {
        datePicker.init(i, j, k, this);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        okButton.setOnClickListener(new android.view.View.OnClickListener() {

            final DatePickerDialogView this$0;

            public void onClick(View view)
            {
                bus.post(me/lyft/android/ui/dialogs/DatePickerDialogView$DateSelectedEvent, new DateSelectedEventArgs(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth()));
            }

            
            {
                this$0 = DatePickerDialogView.this;
                super();
            }

            private class DateSelectedEventArgs
            {

                int day;
                int month;
                int year;

                public int getDay()
                {
                    return day;
                }

                public int getMonth()
                {
                    return month;
                }

                public int getYear()
                {
                    return year;
                }

                public DateSelectedEventArgs(int i, int j, int k)
                {
                    year = i;
                    month = j;
                    day = k;
                }
            }

        });
    }
}
