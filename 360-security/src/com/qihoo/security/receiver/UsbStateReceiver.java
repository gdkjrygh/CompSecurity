// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.qihoo.security.opti.b.a;

public class UsbStateReceiver extends BroadcastReceiver
{

    public UsbStateReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
label0:
        {
            if ("android.hardware.usb.action.USB_STATE".equals(intent.getAction()))
            {
                if (!intent.getExtras().getBoolean("connected"))
                {
                    break label0;
                }
                a.c(true);
                a.a();
            }
            return;
        }
        a.c(false);
        a.a();
    }
}
