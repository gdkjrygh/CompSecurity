// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.network;

import com.google.common.base.Objects;

public class NetworkConnectivityEvent
{

    private final boolean connected;

    public NetworkConnectivityEvent(boolean flag)
    {
        connected = flag;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (NetworkConnectivityEvent)obj;
            if (connected != ((NetworkConnectivityEvent) (obj)).connected)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            Boolean.valueOf(connected)
        });
    }

    public final boolean isConnected()
    {
        return connected;
    }
}
