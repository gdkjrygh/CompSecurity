// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.network.connectionclass;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.facebook.network.connectionclass:
//            ConnectionClassManager

public class DeviceBandwidthSampler
{

    static final long SAMPLE_TIME = 1000L;
    private final ConnectionClassManager mConnectionClassManager;
    private Handler mHandler;
    private long mLastTimeReading;
    private AtomicInteger mSamplingCounter;
    private HandlerThread mThread;

    private DeviceBandwidthSampler(ConnectionClassManager connectionclassmanager)
    {
        mConnectionClassManager = connectionclassmanager;
        mSamplingCounter = new AtomicInteger();
        mThread = new HandlerThread("ParseThread");
        mThread.start();
        mHandler = new SamplingHandler(mThread.getLooper());
    }

    DeviceBandwidthSampler(ConnectionClassManager connectionclassmanager, _cls1 _pcls1)
    {
        this(connectionclassmanager);
    }

    public static DeviceBandwidthSampler getInstance()
    {
        return DeviceBandwidthSamplerHolder.instance;
    }

    public boolean isSampling()
    {
        return mSamplingCounter.get() != 0;
    }

    public void startSampling()
    {
        if (mSamplingCounter.getAndIncrement() == 0)
        {
            mHandler.sendEmptyMessage(1);
            mLastTimeReading = SystemClock.elapsedRealtime();
        }
    }

    public void stopSampling()
    {
        if (mSamplingCounter.decrementAndGet() == 0)
        {
            mHandler.sendEmptyMessage(2);
        }
    }



/*
    static long access$102(DeviceBandwidthSampler devicebandwidthsampler, long l)
    {
        devicebandwidthsampler.mLastTimeReading = l;
        return l;
    }

*/


    private class SamplingHandler extends Handler
    {

        static final int MSG_START = 1;
        static final int MSG_STOP = 2;
        final DeviceBandwidthSampler this$0;

        private void addSample()
        {
            long l = QTagParser.getInstance().parseDataUsageForUidAndTag(Process.myUid());
            this;
            JVM INSTR monitorenter ;
            long l1 = SystemClock.elapsedRealtime();
            if (l == -1L)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            mConnectionClassManager.addBandwidth(l, l1 - mLastTimeReading);
            mLastTimeReading = l1;
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Unknown what=")).append(message.what).toString());

            case 1: // '\001'
                addSample();
                sendEmptyMessageDelayed(1, 1000L);
                return;

            case 2: // '\002'
                addSample();
                break;
            }
            removeMessages(1);
        }

        public SamplingHandler(Looper looper)
        {
            this$0 = DeviceBandwidthSampler.this;
            super(looper);
        }
    }


    private class DeviceBandwidthSamplerHolder
    {

        public static final DeviceBandwidthSampler instance = new DeviceBandwidthSampler(ConnectionClassManager.getInstance(), null);


        private DeviceBandwidthSamplerHolder()
        {
        }
    }

}
