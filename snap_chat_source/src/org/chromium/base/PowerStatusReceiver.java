// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package org.chromium.base:
//            PowerMonitor

public class PowerStatusReceiver extends BroadcastReceiver
{

    public PowerStatusReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        PowerMonitor.a();
    }
}
