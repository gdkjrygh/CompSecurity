// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.scanner;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.dominos.android.sdk.common.LogUtil;

// Referenced classes of package com.dominos.beacon.scanner:
//            BeaconScanner

public class PreLollipopScanner extends BeaconScanner
{

    private static final String TAG = com/dominos/beacon/scanner/PreLollipopScanner.getSimpleName();
    private BluetoothAdapter mBluetoothAdapter;
    Context mContext;
    private android.bluetooth.BluetoothAdapter.LeScanCallback mLeScanCallback;

    public PreLollipopScanner()
    {
        mLeScanCallback = new _cls1();
    }

    protected void onAfterInject()
    {
        mBluetoothAdapter = ((BluetoothManager)mContext.getSystemService("bluetooth")).getAdapter();
    }

    public void start()
    {
        stop();
        if (!mBluetoothAdapter.isEnabled())
        {
            LogUtil.d(TAG, "Bluetooth not enabled", new Object[0]);
            return;
        }
        try
        {
            mBluetoothAdapter.startLeScan(mLeScanCallback);
            mScanning = true;
        }
        catch (Exception exception)
        {
            LogUtil.d(TAG, "Unable to start scan", new Object[0]);
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
                mScanning = false;
                mBluetoothAdapter.stopLeScan(mLeScanCallback);
            }
            return;
        }
        catch (Exception exception)
        {
            LogUtil.d(TAG, "Unable to stop scanning ", new Object[0]);
        }
    }


    private class _cls1
        implements android.bluetooth.BluetoothAdapter.LeScanCallback
    {

        final PreLollipopScanner this$0;

        public void onLeScan(BluetoothDevice bluetoothdevice, int i, byte abyte0[])
        {
            if (abyte0 != null && abyte0.length > 0)
            {
                onBeaconResult(bluetoothdevice, i, abyte0);
            }
        }

        _cls1()
        {
            this$0 = PreLollipopScanner.this;
            super();
        }
    }

}
