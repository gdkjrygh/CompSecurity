// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsUncaughtExceptionHandler

class a extends BroadcastReceiver
{

    final CrashlyticsUncaughtExceptionHandler a;

    public void onReceive(Context context, Intent intent)
    {
        CrashlyticsUncaughtExceptionHandler.a(a, false);
    }

    (CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler)
    {
        a = crashlyticsuncaughtexceptionhandler;
        super();
    }
}
