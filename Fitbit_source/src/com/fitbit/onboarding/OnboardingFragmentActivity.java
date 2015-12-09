// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding;

import android.os.Bundle;
import com.fitbit.ui.BluetoothMessagesController;
import com.fitbit.ui.FitbitActivity;

public class OnboardingFragmentActivity extends FitbitActivity
{

    public OnboardingFragmentActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        R().a("ACTION_SYNC_DISABLED_DUE_SUPPORT_STATUS");
    }
}
