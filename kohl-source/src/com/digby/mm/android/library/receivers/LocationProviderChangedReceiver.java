// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.digby.mm.android.library.services.impl.GeofenceTransitionsService;
import com.digby.mm.android.library.utils.Logger;

public class LocationProviderChangedReceiver extends BroadcastReceiver
{

    public LocationProviderChangedReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        try
        {
            Logger.Debug((new StringBuilder()).append("Received Location provider changed broadcast, action: ").append(intent.getAction()).toString(), context);
            Intent intent1 = new Intent(context, com/digby/mm/android/library/services/impl/GeofenceTransitionsService);
            intent1.setAction(intent.getAction());
            context.startService(intent1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Logger.Error("LocationProviderChangedReceiver_onReceive", context);
        }
    }
}
