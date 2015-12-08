// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.sleep.ui.landing;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.ui.b.a;
import com.fitbit.util.fonts.FitbitFont;

public class SleepLoggingLandingActivity extends FitbitActivity
{

    public SleepLoggingLandingActivity()
    {
    }

    public static Intent a(Context context)
    {
        return new Intent(context, com/fitbit/sleep/ui/landing/SleepLoggingLandingActivity);
    }

    protected void n_()
    {
        com.fitbit.ui.b.a.a(this, H);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f04004c);
    }

    protected FitbitFont p_()
    {
        return FitbitFont.g;
    }
}
