// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.heartrate.landing;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import com.fitbit.analytics.core.a;
import com.fitbit.ui.FitbitActivity;

public class HeartRateLandingActivity extends FitbitActivity
{

    public HeartRateLandingActivity()
    {
    }

    public static void a(Context context)
    {
        context.startActivity(new Intent(context, com/fitbit/heartrate/landing/HeartRateLandingActivity));
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f04002c);
        setSupportActionBar((Toolbar)findViewById(0x7f11012c));
    }

    protected void onResumeFragments()
    {
        super.onResumeFragments();
        com.fitbit.analytics.core.a.a(com.fitbit.analytics.core.Interaction.DEFAULTS.l);
    }
}
