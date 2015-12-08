// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.wifi;

import java.util.Collection;

// Referenced classes of package com.worklight.location.internal.wifi:
//            IWifiScannerReceiver

public class MultiWifiScannerReceiver
    implements IWifiScannerReceiver
{

    private final IWifiScannerReceiver receivers[];

    public MultiWifiScannerReceiver(IWifiScannerReceiver iwifiscannerreceiver, IWifiScannerReceiver iwifiscannerreceiver1)
    {
        this(new IWifiScannerReceiver[] {
            iwifiscannerreceiver, iwifiscannerreceiver1
        });
    }

    public MultiWifiScannerReceiver(IWifiScannerReceiver aiwifiscannerreceiver[])
    {
        receivers = aiwifiscannerreceiver;
    }

    public void onScanResults(Collection collection, long l)
    {
        IWifiScannerReceiver aiwifiscannerreceiver[] = receivers;
        int j = aiwifiscannerreceiver.length;
        for (int i = 0; i < j; i++)
        {
            aiwifiscannerreceiver[i].onScanResults(collection, l);
        }

    }
}
