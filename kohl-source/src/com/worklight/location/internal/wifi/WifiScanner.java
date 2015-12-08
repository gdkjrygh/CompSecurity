// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.wifi;


// Referenced classes of package com.worklight.location.internal.wifi:
//            WifiException, IWifiScannerReceiver

public interface WifiScanner
{

    public abstract void scan(IWifiScannerReceiver iwifiscannerreceiver)
        throws WifiException;
}
