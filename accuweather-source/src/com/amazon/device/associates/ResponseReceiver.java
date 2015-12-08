// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.amazon.device.associates:
//            AssociatesAPI, m, x

public final class ResponseReceiver extends BroadcastReceiver
{

    private static final String a = com/amazon/device/associates/ResponseReceiver.getName();

    public ResponseReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        m m1;
        try
        {
            m1 = (m)AssociatesAPI.getShoppingService();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            x.a(a, (new StringBuilder()).append("Error in handling broadcast: ").append(context).toString());
            return;
        }
        if (m1 == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        m1.a(context, intent);
    }

}
