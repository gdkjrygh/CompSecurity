// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.analytics.helper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.adobe.mobile.Analytics;

public class GPBroadcastReceiver extends BroadcastReceiver
{

    public GPBroadcastReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        Analytics.processReferrer(context, intent);
    }
}
