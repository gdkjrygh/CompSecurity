// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;
import com.jcp.b.b;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

// Referenced classes of package com.jcp.activities:
//            an, SplashActivity

public class FutureDatePickerActivity extends an
{

    private static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
    protected DatePicker datePicker;
    protected TimePicker timePicker;

    public FutureDatePickerActivity()
    {
    }

    private void c()
    {
        GregorianCalendar gregoriancalendar = new GregorianCalendar();
        gregoriancalendar.set(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth(), timePicker.getCurrentHour().intValue(), timePicker.getCurrentMinute().intValue());
        b.k = a.format(gregoriancalendar.getTime());
        Toast.makeText(this, (new StringBuilder()).append("Date selected: ").append(b.k).toString(), 0).show();
    }

    private void g()
    {
        b.j = false;
        startActivity(new Intent(this, com/jcp/activities/SplashActivity));
        finish();
    }

    protected String a()
    {
        return null;
    }

    protected boolean b()
    {
        return false;
    }

    void onCancel()
    {
        Toast.makeText(this, "No asOf time selected", 0).show();
        g();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        g();
    }

    void onSet()
    {
        c();
        g();
    }

}
