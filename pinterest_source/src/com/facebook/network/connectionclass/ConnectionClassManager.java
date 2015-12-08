// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.network.connectionclass;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.facebook.network.connectionclass:
//            ExponentialGeometricAverage, ConnectionQuality

public class ConnectionClassManager
{

    static final long BANDWIDTH_LOWER_BOUND = 10L;
    private static final int BYTES_TO_BITS = 8;
    private static final double DEFAULT_DECAY_CONSTANT = 0.050000000000000003D;
    private static final int DEFAULT_GOOD_BANDWIDTH = 2000;
    private static final int DEFAULT_MODERATE_BANDWIDTH = 550;
    private static final int DEFAULT_POOR_BANDWIDTH = 150;
    static final double DEFAULT_SAMPLES_TO_QUALITY_CHANGE = 5D;
    private AtomicReference mCurrentBandwidthConnectionQuality;
    private ExponentialGeometricAverage mDownloadBandwidth;
    private volatile boolean mInitiateStateChange;
    private ArrayList mListenerList;
    private AtomicReference mNextBandwidthConnectionQuality;
    private int mSampleCounter;

    private ConnectionClassManager()
    {
        mDownloadBandwidth = new ExponentialGeometricAverage(0.050000000000000003D);
        mInitiateStateChange = false;
        mCurrentBandwidthConnectionQuality = new AtomicReference(ConnectionQuality.UNKNOWN);
        mListenerList = new ArrayList();
    }

    ConnectionClassManager(_cls1 _pcls1)
    {
        this();
    }

    public static ConnectionClassManager getInstance()
    {
        return ConnectionClassManagerHolder.instance;
    }

    private ConnectionQuality mapBandwidthQuality(double d)
    {
        if (d < 0.0D)
        {
            return ConnectionQuality.UNKNOWN;
        }
        if (d < 150D)
        {
            return ConnectionQuality.POOR;
        }
        if (d < 550D)
        {
            return ConnectionQuality.MODERATE;
        }
        if (d < 2000D)
        {
            return ConnectionQuality.GOOD;
        } else
        {
            return ConnectionQuality.EXCELLENT;
        }
    }

    private void notifyListeners()
    {
        int j = mListenerList.size();
        for (int i = 0; i < j; i++)
        {
            ((ConnectionClassStateChangeListener)mListenerList.get(i)).onBandwidthStateChange((ConnectionQuality)mCurrentBandwidthConnectionQuality.get());
        }

    }

    public void addBandwidth(long l, long l1)
    {
        this;
        JVM INSTR monitorenter ;
        if (l1 != 0L && (((double)l * 1.0D) / (double)l1) * 8D >= 10D) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        double d = ((double)l * 1.0D) / (double)l1;
        mDownloadBandwidth.addMeasurement(d * 8D);
        if (!mInitiateStateChange) goto _L4; else goto _L3
_L3:
        mSampleCounter = mSampleCounter + 1;
        if (getCurrentBandwidthQuality() != mNextBandwidthConnectionQuality.get())
        {
            mInitiateStateChange = false;
            mSampleCounter = 1;
        }
        if ((double)mSampleCounter >= 5D)
        {
            mInitiateStateChange = false;
            mSampleCounter = 1;
            mCurrentBandwidthConnectionQuality.set(mNextBandwidthConnectionQuality.get());
            notifyListeners();
        }
          goto _L1
        Exception exception;
        exception;
        throw exception;
_L4:
        if (mCurrentBandwidthConnectionQuality.get() == getCurrentBandwidthQuality()) goto _L1; else goto _L5
_L5:
        mInitiateStateChange = true;
        mNextBandwidthConnectionQuality = new AtomicReference(getCurrentBandwidthQuality());
          goto _L1
    }

    public ConnectionQuality getCurrentBandwidthQuality()
    {
        this;
        JVM INSTR monitorenter ;
        if (mDownloadBandwidth != null) goto _L2; else goto _L1
_L1:
        ConnectionQuality connectionquality = ConnectionQuality.UNKNOWN;
_L4:
        this;
        JVM INSTR monitorexit ;
        return connectionquality;
_L2:
        connectionquality = mapBandwidthQuality(mDownloadBandwidth.getAverage());
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public double getDownloadKBitsPerSecond()
    {
        this;
        JVM INSTR monitorenter ;
        ExponentialGeometricAverage exponentialgeometricaverage = mDownloadBandwidth;
        if (exponentialgeometricaverage != null) goto _L2; else goto _L1
_L1:
        double d = -1D;
_L4:
        this;
        JVM INSTR monitorexit ;
        return d;
_L2:
        d = mDownloadBandwidth.getAverage();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public ConnectionQuality register(ConnectionClassStateChangeListener connectionclassstatechangelistener)
    {
        if (connectionclassstatechangelistener != null)
        {
            mListenerList.add(connectionclassstatechangelistener);
        }
        return (ConnectionQuality)mCurrentBandwidthConnectionQuality.get();
    }

    public void remove(ConnectionClassStateChangeListener connectionclassstatechangelistener)
    {
        if (connectionclassstatechangelistener != null)
        {
            mListenerList.remove(connectionclassstatechangelistener);
        }
    }

    public void reset()
    {
        if (mDownloadBandwidth != null)
        {
            mDownloadBandwidth.reset();
        }
        mCurrentBandwidthConnectionQuality.set(ConnectionQuality.UNKNOWN);
    }

    private class ConnectionClassManagerHolder
    {

        public static final ConnectionClassManager instance = new ConnectionClassManager(null);


        private ConnectionClassManagerHolder()
        {
        }
    }


    private class ConnectionClassStateChangeListener
    {

        public abstract void onBandwidthStateChange(ConnectionQuality connectionquality);
    }

}
