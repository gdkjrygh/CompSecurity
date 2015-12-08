// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.net.wifi.WifiManager;
import com.skype.android.util.ref.ReferenceCounted;
import java.util.logging.Logger;

final class f
    implements ReferenceCounted
{

    private static final Logger log = Logger.getLogger("ReferenceCountedWifiLock");
    private android.net.wifi.WifiManager.WifiLock wifiLock;
    private WifiManager wifiManager;

    public f(WifiManager wifimanager)
    {
        if (wifimanager == null)
        {
            throw new IllegalArgumentException("null wifiManager");
        } else
        {
            wifiManager = wifimanager;
            return;
        }
    }

    public final void acquireOnce()
    {
        if (wifiLock == null)
        {
            wifiLock = wifiManager.createWifiLock(3, "WifiLock");
            wifiLock.setReferenceCounted(true);
        }
        wifiLock.acquire();
        log.info("acquired");
    }

    public final void releaseFully()
    {
        if (wifiLock != null)
        {
            wifiLock.setReferenceCounted(false);
            wifiLock.release();
            wifiLock = null;
        }
    }

    public final void releaseOnce()
    {
        if (wifiLock != null)
        {
            wifiLock.release();
            if (!wifiLock.isHeld())
            {
                log.info("released");
                wifiLock = null;
            }
        }
    }

}
