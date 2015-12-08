// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.scanner;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.content.Context;
import com.dominos.android.sdk.common.LogUtil;
import java.util.ArrayList;

// Referenced classes of package com.dominos.beacon.scanner:
//            BeaconScanner

public class LollipopScanner extends BeaconScanner
{

    private static final String TAG = com/dominos/beacon/scanner/LollipopScanner.getSimpleName();
    private BluetoothLeScanner mBluetoothLeScanner;
    private BluetoothManager mBluetoothManager;
    Context mContext;
    private ScanCallback mScanCallback;

    public LollipopScanner()
    {
        mScanCallback = new _cls1();
    }

    protected void onAfterInject()
    {
        mBluetoothManager = (BluetoothManager)mContext.getSystemService("bluetooth");
        mBluetoothLeScanner = mBluetoothManager.getAdapter().getBluetoothLeScanner();
    }

    public void start()
    {
        stop();
        if (!mBluetoothManager.getAdapter().isEnabled())
        {
            LogUtil.d(TAG, "Bluetooth not enabled", new Object[0]);
            return;
        }
        try
        {
            android.bluetooth.le.ScanSettings scansettings = (new android.bluetooth.le.ScanSettings.Builder()).setScanMode(0).build();
            ArrayList arraylist = new ArrayList();
            mBluetoothLeScanner.startScan(arraylist, scansettings, mScanCallback);
            mScanning = true;
        }
        catch (Exception exception)
        {
            LogUtil.d(TAG, "Unable to start scan ", new Object[0]);
        }
        setScheduleToStopScanning();
    }

    public void stop()
    {
        super.stop();
        try
        {
            if (mScanning)
            {
                mBluetoothLeScanner.stopScan(mScanCallback);
                mScanning = false;
            }
            return;
        }
        catch (Exception exception)
        {
            LogUtil.d(TAG, "Unable to stop scanning ", new Object[0]);
        }
    }


    private class _cls1 extends ScanCallback
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

        _cls1()
        {
            this$0 = LollipopScanner.this;
            super();
        }
    }

}
