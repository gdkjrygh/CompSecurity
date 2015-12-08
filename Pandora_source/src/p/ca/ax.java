// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v4.app.f;
import android.text.format.DateFormat;
import android.widget.TimePicker;
import com.pandora.android.data.AlarmData;
import com.pandora.android.provider.b;

public class ax extends f
    implements android.app.TimePickerDialog.OnTimeSetListener
{

    private AlarmData a;

    public ax()
    {
    }

    public static ax a(AlarmData alarmdata)
    {
        ax ax1 = new ax();
        Bundle bundle = new Bundle();
        bundle.putParcelable("alarm", alarmdata);
        ax1.setArguments(bundle);
        return ax1;
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        a = (AlarmData)getArguments().getParcelable("alarm");
        int i = a.e();
        int j = a.f();
        boolean flag = DateFormat.is24HourFormat(getActivity());
        return new TimePickerDialog(getActivity(), this, i, j, flag);
    }

    public void onTimeSet(TimePicker timepicker, int i, int j)
    {
        a.b(i);
        a.c(j);
        b.a.e().a(new p.bz.b(a, false));
    }
}
