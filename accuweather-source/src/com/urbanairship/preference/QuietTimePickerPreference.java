// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.preference;

import android.content.Context;
import android.preference.DialogPreference;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TimePicker;
import java.util.Calendar;

// Referenced classes of package com.urbanairship.preference:
//            UAPreference

abstract class QuietTimePickerPreference extends DialogPreference
    implements UAPreference
{

    private long currentTime;
    private TimePicker timePicker;

    public QuietTimePickerPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        timePicker = null;
        currentTime = -1L;
    }

    public QuietTimePickerPreference(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        timePicker = null;
        currentTime = -1L;
    }

    private Calendar getCalendar()
    {
        Calendar calendar = Calendar.getInstance();
        if (currentTime != -1L)
        {
            calendar.setTimeInMillis(currentTime);
        }
        return calendar;
    }

    public volatile CharSequence getSummary()
    {
        return getSummary();
    }

    public String getSummary()
    {
        return DateFormat.getTimeFormat(getContext()).format(getCalendar().getTime());
    }

    protected View onCreateDialogView()
    {
        timePicker = new TimePicker(getContext());
        timePicker.setIs24HourView(Boolean.valueOf(DateFormat.is24HourFormat(getContext())));
        Calendar calendar = getCalendar();
        timePicker.setCurrentHour(Integer.valueOf(calendar.get(11)));
        timePicker.setCurrentMinute(Integer.valueOf(calendar.get(12)));
        return timePicker;
    }

    public View onCreateView(ViewGroup viewgroup)
    {
        viewgroup = super.onCreateView(viewgroup);
        viewgroup.setContentDescription(getPreferenceType().toString());
        return viewgroup;
    }

    public void onDialogClosed(boolean flag)
    {
        if (flag)
        {
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, timePicker.getCurrentHour().intValue());
            calendar.set(12, timePicker.getCurrentMinute().intValue());
            long l = calendar.getTimeInMillis();
            if (callChangeListener(Long.valueOf(l)))
            {
                currentTime = l;
                notifyChanged();
            }
        }
    }

    public void setValue(Object obj)
    {
        currentTime = ((Long)obj).longValue();
        notifyChanged();
    }

    protected boolean shouldPersist()
    {
        return false;
    }
}
