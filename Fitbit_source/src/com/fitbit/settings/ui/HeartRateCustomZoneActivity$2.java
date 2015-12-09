// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.widget.CompoundButton;

// Referenced classes of package com.fitbit.settings.ui:
//            HeartRateCustomZoneActivity

class a
    implements android.widget.Listener
{

    final HeartRateCustomZoneActivity a;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (HeartRateCustomZoneActivity.a(a) != null)
        {
            HeartRateCustomZoneActivity.a(a).a(flag);
            if (!HeartRateCustomZoneActivity.b(a))
            {
                HeartRateCustomZoneActivity.c(a);
            }
        }
    }

    (HeartRateCustomZoneActivity heartratecustomzoneactivity)
    {
        a = heartratecustomzoneactivity;
        super();
    }
}
