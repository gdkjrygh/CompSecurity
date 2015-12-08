// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.fitbit.challenges.ui:
//            ChallengesFragment

class a extends BroadcastReceiver
{

    final ChallengesFragment a;

    public void onReceive(Context context, Intent intent)
    {
        boolean flag;
        if (!"com.fitbit.FitbitMobile.NotificationBroadcastReceiver.ACTION_CHALLENGE_INVITE_RECEIVED".equalsIgnoreCase(intent.getAction()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ChallengesFragment.a(a, flag);
    }

    (ChallengesFragment challengesfragment)
    {
        a = challengesfragment;
        super();
    }
}
