// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.scanner;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import java.util.List;

// Referenced classes of package com.dominos.beacon.scanner:
//            LollipopScanner

class this._cls0 extends ScanCallback
{

    final LollipopScanner this$0;

    public void onBatchScanResults(List list)
    {
        super.onBatchScanResults(list);
    }

    public void onScanFailed(int i)
    {
        super.onScanFailed(i);
    }

    public void onScanResult(int i, ScanResult scanresult)
    {
        super.onScanResult(i, scanresult);
        byte abyte0[];
        if (scanresult != null && scanresult.getScanRecord() != null)
        {
            if ((abyte0 = scanresult.getScanRecord().getBytes()) != null && abyte0.length > 0)
            {
                onBeaconResult(scanresult.getDevice(), scanresult.getRssi(), abyte0);
                return;
            }
        }
    }

    ()
    {
        this$0 = LollipopScanner.this;
        super();
    }
}
