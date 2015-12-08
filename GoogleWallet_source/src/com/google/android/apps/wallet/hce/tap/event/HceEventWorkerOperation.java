// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.tap.event;

import android.nfc.cardemulation.HostApduService;
import com.google.common.base.Preconditions;

final class HceEventWorkerOperation
{

    private final Object data;
    private final HostApduService hostApduService;
    private final int type;

    private HceEventWorkerOperation(int i, Object obj, HostApduService hostapduservice)
    {
        boolean flag;
        if (i == 1 || i == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Unrecognized type: %s", new Object[] {
            Integer.valueOf(i)
        });
        type = i;
        data = obj;
        hostApduService = hostapduservice;
    }

    static HceEventWorkerOperation newDeactivatedOperation(HostApduService hostapduservice)
    {
        return new HceEventWorkerOperation(2, null, hostapduservice);
    }

    static HceEventWorkerOperation newMessageOperation(byte abyte0[], HostApduService hostapduservice)
    {
        return new HceEventWorkerOperation(1, abyte0, hostapduservice);
    }

    final byte[] getCommandData()
    {
        boolean flag;
        if (type == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Unexpected type: %s", new Object[] {
            Integer.valueOf(type)
        });
        return (byte[])Preconditions.checkNotNull(data);
    }

    final HostApduService getHostApduService()
    {
        return hostApduService;
    }

    final int getType()
    {
        return type;
    }
}
