// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.alarm.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.fitbit.analytics.core.a;
import com.fitbit.data.domain.device.Device;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.ui.s;

// Referenced classes of package com.fitbit.alarm.ui:
//            AlarmActivity_, AlarmFragment

public class AlarmActivity extends FitbitActivity
{

    protected String a;
    protected AlarmFragment b;

    public AlarmActivity()
    {
    }

    public static void a(Context context, Device device)
    {
        if (device != null && device.d() != null)
        {
            com.fitbit.alarm.ui.AlarmActivity_.a(context).a(device.d()).b();
        }
    }

    protected void a()
    {
        b.a(a);
        b.a(true);
    }

    protected void a(int i, Intent intent)
    {
        if (intent != null && intent.getExtras() != null && intent.hasExtra("EXTRA_CANCEL_RESULT_REASON"))
        {
            s.a(this, intent.getExtras().getString("EXTRA_CANCEL_RESULT_REASON"), 1).i();
        }
    }

    protected void onResumeFragments()
    {
        super.onResumeFragments();
        com.fitbit.analytics.core.a.a(com.fitbit.analytics.core.Interaction.DEFAULTS.i);
    }
}
