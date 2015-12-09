// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fitbit.home.ui.HomeActivity;

// Referenced classes of package com.fitbit.ui:
//            FitbitActivity

class er extends BroadcastReceiver
{

    final FitbitActivity a;

    public void onReceive(Context context, Intent intent)
    {
        HomeActivity.a(a);
    }

    (FitbitActivity fitbitactivity)
    {
        a = fitbitactivity;
        super();
    }
}
