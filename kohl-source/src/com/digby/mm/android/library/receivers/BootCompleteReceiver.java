// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.digby.mm.android.library.services.impl.BootCompleteService;
import com.digby.mm.android.library.utils.Logger;

public class BootCompleteReceiver extends BroadcastReceiver
{

    public BootCompleteReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        try
        {
            Logger.Debug("Received BOOT_COMPLETED broadcast.", context);
            context.startService(new Intent(context, com/digby/mm/android/library/services/impl/BootCompleteService));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Logger.Error("BootCompleteReceiver_onReceive", context);
        }
    }
}
