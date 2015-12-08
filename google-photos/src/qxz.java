// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.IntentFilter;

public final class qxz extends IntentFilter
{

    public qxz(boolean flag)
    {
        addAction("android.net.conn.CONNECTIVITY_CHANGE");
        if (flag)
        {
            addAction("android.net.wifi.RSSI_CHANGED");
        }
    }
}
