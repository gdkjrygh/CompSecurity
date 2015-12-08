// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.ads.identifier.internal.IAdvertisingIdService;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class AdvertisingIdClient
{
    static final class AutoDisconnectTask extends Thread
    {

        boolean mAutoDisconnected;
        private WeakReference mClient;
        CountDownLatch mCountDown;
        private long mDelayMillis;

        private void disconnect()
        {
            AdvertisingIdClient advertisingidclient = (AdvertisingIdClient)mClient.get();
            if (advertisingidclient != null)
            {
                advertisingidclient.finish();
                mAutoDisconnected = true;
            }
        }

        public final void run()
        {
            try
            {
                if (!mCountDown.await(mDelayMillis, TimeUnit.MILLISECONDS))
                {
                    disconnect();
                }
                return;
            }
            catch (InterruptedException interruptedexception)
            {
                disconnect();
            }
        }

        public AutoDisconnectTask(AdvertisingIdClient advertisingidclient, long l)
        {
            mClient = new WeakReference(advertisingidclient);
            mDelayMillis = l;
            mCountDown = new CountDownLatch(1);
            mAutoDisconnected = false;
            start();
        }
    }

    public static final class Info
    {

        public final String mAdvertisingId;
        public final boolean mLimitAdTrackingEnabled;

        public final String toString()
        {
            return (new StringBuilder("{")).append(mAdvertisingId).append("}").append(mLimitAdTrackingEnabled).toString();
        }

        public Info(String s, boolean flag)
        {
            mAdvertisingId = s;
            mLimitAdTrackingEnabled = flag;
        }
    }


    private static boolean mShouldSkipGmsCoreVersionCheck = false;
    AutoDisconnectTask mAutoDisconnectTask;
    Object mAutoDisconnectTaskLock;
    boolean mBounded;
    BlockingServiceConnection mConnection;
    private final Context mContext;
    IAdvertisingIdService mService;
    final long mTimeOutInMillis = -1L;

    private AdvertisingIdClient(Context context)
    {
        mAutoDisconnectTaskLock = new Object();
        Preconditions.checkNotNull(context);
        mContext = context;
        mBounded = false;
    }

    public static Info getAdvertisingIdInfo(Context context)
        throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
    {
        context = new AdvertisingIdClient(context);
        Info info;
        context.start$1385ff();
        info = context.getInfo();
        context.finish();
        return info;
        Exception exception;
        exception;
        context.finish();
        throw exception;
    }

    private static IAdvertisingIdService getAdvertisingIdService$266d5771(BlockingServiceConnection blockingserviceconnection)
        throws IOException
    {
        try
        {
            blockingserviceconnection = com.google.android.gms.ads.identifier.internal.IAdvertisingIdService.Stub.asInterface(blockingserviceconnection.getService());
        }
        // Misplaced declaration of an exception variable
        catch (BlockingServiceConnection blockingserviceconnection)
        {
            throw new IOException("Interrupted exception");
        }
        // Misplaced declaration of an exception variable
        catch (BlockingServiceConnection blockingserviceconnection)
        {
            throw new IOException(blockingserviceconnection);
        }
        return blockingserviceconnection;
    }

    private Info getInfo()
        throws IOException
    {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        this;
        JVM INSTR monitorenter ;
        if (mBounded)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        Object obj = mAutoDisconnectTaskLock;
        obj;
        JVM INSTR monitorenter ;
        if (mAutoDisconnectTask == null || !mAutoDisconnectTask.mAutoDisconnected)
        {
            throw new IOException("AdvertisingIdClient is not connected.");
        }
        break MISSING_BLOCK_LABEL_58;
        Exception exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        JVM INSTR monitorexit ;
        start$1385ff();
        if (!mBounded)
        {
            throw new IOException("AdvertisingIdClient cannot reconnect.");
        }
        break MISSING_BLOCK_LABEL_93;
        Exception exception;
        exception;
        throw new IOException("AdvertisingIdClient cannot reconnect.", exception);
        Preconditions.checkNotNull(mConnection);
        Preconditions.checkNotNull(mService);
        Info info = new Info(mService.getId(), mService.isLimitAdTrackingEnabled(true));
        this;
        JVM INSTR monitorexit ;
        exception = ((Exception) (mAutoDisconnectTaskLock));
        exception;
        JVM INSTR monitorenter ;
        if (mAutoDisconnectTask == null)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        mAutoDisconnectTask.mCountDown.countDown();
        try
        {
            mAutoDisconnectTask.join();
        }
        catch (InterruptedException interruptedexception) { }
        if (-1L <= 0L)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        mAutoDisconnectTask = new AutoDisconnectTask(this, -1L);
        exception;
        JVM INSTR monitorexit ;
        return info;
        exception;
        Log.i("AdvertisingIdClient", "GMS remote exception ", exception);
        throw new IOException("Remote exception");
        info;
        exception;
        JVM INSTR monitorexit ;
        throw info;
    }

    private static BlockingServiceConnection getServiceConnection(Context context)
        throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
    {
        BlockingServiceConnection blockingserviceconnection;
        Intent intent;
        boolean flag;
        try
        {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new GooglePlayServicesNotAvailableException(9);
        }
        try
        {
            GooglePlayServicesUtil.ensurePlayServicesAvailable(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IOException(context);
        }
        blockingserviceconnection = new BlockingServiceConnection();
        intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try
        {
            flag = ConnectionTracker.getInstance().bindService(context, intent, blockingserviceconnection, 1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IOException(context);
        }
        if (flag)
        {
            return blockingserviceconnection;
        } else
        {
            throw new IOException("Connection failure");
        }
    }

    private void start$1385ff()
        throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
    {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        this;
        JVM INSTR monitorenter ;
        if (mBounded)
        {
            finish();
        }
        mConnection = getServiceConnection(mContext);
        mService = getAdvertisingIdService$266d5771(mConnection);
        mBounded = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void finalize()
        throws Throwable
    {
        finish();
        super.finalize();
    }

    public final void finish()
    {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        this;
        JVM INSTR monitorenter ;
        if (mContext != null && mConnection != null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        if (mBounded)
        {
            ConnectionTracker.getInstance().unbindService(mContext, mConnection);
        }
_L1:
        mBounded = false;
        mService = null;
        mConnection = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", ((Throwable) (obj)));
          goto _L1
    }

}
