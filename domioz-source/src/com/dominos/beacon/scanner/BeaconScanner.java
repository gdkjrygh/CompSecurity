// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.scanner;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.beacon.model.Beacon;
import com.dominos.beacon.util.BeaconValidator;

// Referenced classes of package com.dominos.beacon.scanner:
//            LollipopScanner_, PreLollipopScanner_

public abstract class BeaconScanner
{

    private static final String TAG = com/dominos/beacon/scanner/BeaconScanner.getSimpleName();
    private OnBeaconListener mBeaconListener;
    protected Handler mHandler;
    protected Runnable mScanDelayRunnable;
    private int mScanTime;
    protected boolean mScanning;

    public BeaconScanner()
    {
        mHandler = new Handler();
        mScanDelayRunnable = new _cls1();
    }

    public static BeaconScanner newInstance(Context context, OnBeaconListener onbeaconlistener, int i)
    {
        Object obj = null;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            LogUtil.d(TAG, "Creating instance for Lollipop and higher devices", new Object[0]);
            obj = LollipopScanner_.getInstance_(context);
        } else
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            LogUtil.d(TAG, "Creating instance for Jelly bean and higher devices below lollipop", new Object[0]);
            obj = PreLollipopScanner_.getInstance_(context);
        }
        if (obj != null)
        {
            ((BeaconScanner) (obj)).setBeaconListener(onbeaconlistener);
            ((BeaconScanner) (obj)).setScanTime(i);
            return ((BeaconScanner) (obj));
        } else
        {
            LogUtil.d(TAG, "Unable to create instance, android version not supported.", new Object[0]);
            return ((BeaconScanner) (obj));
        }
    }

    protected void onBeaconResult(BluetoothDevice bluetoothdevice, int i, byte abyte0[])
    {
        abyte0 = BeaconValidator.getBeaconFromScannedRecord(abyte0);
        if (abyte0 != null)
        {
            abyte0.setDeviceName(bluetoothdevice.getName());
            abyte0.setRssi(i);
            abyte0.setMacAddress(bluetoothdevice.getAddress());
            if (mBeaconListener != null)
            {
                mBeaconListener.onBeaconFound(abyte0);
            }
        }
    }

    public void setBeaconListener(OnBeaconListener onbeaconlistener)
    {
        mBeaconListener = onbeaconlistener;
    }

    public void setScanTime(int i)
    {
        mScanTime = i;
    }

    protected void setScheduleToStopScanning()
    {
        mHandler.removeCallbacks(mScanDelayRunnable);
        mHandler.postDelayed(mScanDelayRunnable, mScanTime);
    }

    public abstract void start();

    public void stop()
    {
        mHandler.removeCallbacks(mScanDelayRunnable);
    }



    private class _cls1
        implements Runnable
    {

        final BeaconScanner this$0;

        public void run()
        {
            stop();
            if (mBeaconListener != null)
            {
                mBeaconListener.onScanFinished();
            }
        }

        _cls1()
        {
            this$0 = BeaconScanner.this;
            super();
        }
    }


    private class OnBeaconListener
    {

        public abstract void onBeaconFound(Beacon beacon);

        public abstract void onScanFinished();
    }

}
