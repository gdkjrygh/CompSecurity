// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.amazon.device.iap.internal.d;
import com.amazon.device.iap.internal.util.e;

public final class ResponseReceiver extends BroadcastReceiver
{

    private static final String TAG = com/amazon/device/iap/ResponseReceiver.getSimpleName();

    public ResponseReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        try
        {
            d.d().a(context, intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            e.b(TAG, (new StringBuilder()).append("Error in onReceive: ").append(context).toString());
        }
    }

}
