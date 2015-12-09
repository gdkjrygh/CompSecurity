// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.view.View;
import android.widget.TextView;
import com.fitbit.customui.HeartRatePicker;
import com.fitbit.heartrate.HeartRate;

// Referenced classes of package com.fitbit.settings.ui:
//            HeartRateCustomZoneActivity

private class b
{

    final HeartRateCustomZoneActivity a;
    private final View b;

    public int a()
    {
        return (int)Math.round(((HeartRate)((HeartRatePicker)b.findViewById(0x7f1103d1)).g()).b());
    }

    public void a(int i)
    {
        ((TextView)b.findViewById(0x7f1103d0)).setText(i);
    }

    public void b()
    {
        HeartRatePicker heartratepicker = (HeartRatePicker)b.findViewById(0x7f1103d1);
        heartratepicker.f();
        heartratepicker.a(true);
        heartratepicker.a(new com.fitbit.customui.MeasurablePicker.a() {

            final HeartRateCustomZoneActivity.a a;

            public void a(HeartRate heartrate)
            {
                HeartRateCustomZoneActivity.a(a.a, heartrate);
            }

            public volatile void a(Object obj)
            {
                a((HeartRate)obj);
            }

            
            {
                a = HeartRateCustomZoneActivity.a.this;
                super();
            }
        });
    }

    public void b(int i)
    {
        ((HeartRatePicker)b.findViewById(0x7f1103d1)).a(new HeartRate(i));
    }

    public _cls1.a(HeartRateCustomZoneActivity heartratecustomzoneactivity, View view)
    {
        a = heartratecustomzoneactivity;
        super();
        b = view;
    }
}
