// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.eyesfree.braille.selfbraille;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Referenced classes of package com.googlecode.eyesfree.braille.selfbraille:
//            ISelfBrailleService, WriteData

public class SelfBrailleClient
{
    private class Connection
        implements ServiceConnection
    {

        private volatile ISelfBrailleService mService;
        final SelfBrailleClient this$0;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            if (!verifyPackage())
            {
                Log.w(SelfBrailleClient.LOG_TAG, String.format("Service certificate mismatch for %s, dropping connection", new Object[] {
                    "com.googlecode.eyesfree.brailleback"
                }));
                mHandler.unbindService();
                return;
            }
            Log.i(SelfBrailleClient.LOG_TAG, "Connected to self braille service");
            mService = ISelfBrailleService.Stub.asInterface(ibinder);
            synchronized (mHandler)
            {
                mNumFailedBinds = 0;
            }
            return;
            ibinder;
            componentname;
            JVM INSTR monitorexit ;
            throw ibinder;
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            Log.e(SelfBrailleClient.LOG_TAG, "Disconnected from self braille service");
            mService = null;
            mHandler.scheduleRebind();
        }


        private Connection()
        {
            this$0 = SelfBrailleClient.this;
            super();
        }

    }


    private static final String ACTION_SELF_BRAILLE_SERVICE = "com.googlecode.eyesfree.braille.service.ACTION_SELF_BRAILLE_SERVICE";
    private static final String BRAILLE_BACK_PACKAGE = "com.googlecode.eyesfree.brailleback";
    private static final byte EYES_FREE_CERT_SHA1[] = {
        -101, 66, 76, 45, 39, -83, 81, -92, 42, 51, 
        126, 11, -74, -103, 28, 118, -20, -92, 68, 97
    };
    private static final String LOG_TAG = com/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient.getSimpleName();
    private static final int MAX_REBIND_ATTEMPTS = 5;
    private static final int REBIND_DELAY_MILLIS = 500;
    private static final Intent mServiceIntent = (new Intent("com.googlecode.eyesfree.braille.service.ACTION_SELF_BRAILLE_SERVICE")).setPackage("com.googlecode.eyesfree.brailleback");
    private final boolean mAllowDebugService;
    private volatile Connection mConnection;
    private final Context mContext;
    private final SelfBrailleHandler mHandler = new SelfBrailleHandler();
    private final Binder mIdentity = new Binder();
    private int mNumFailedBinds;
    private boolean mShutdown;

    public SelfBrailleClient(Context context, boolean flag)
    {
        mShutdown = false;
        mNumFailedBinds = 0;
        mContext = context;
        mAllowDebugService = flag;
        doBindService();
    }

    private void doBindService()
    {
        Connection connection = new Connection();
        if (!mContext.bindService(mServiceIntent, connection, 1))
        {
            Log.e(LOG_TAG, "Failed to bind to service");
            mHandler.scheduleRebind();
            return;
        } else
        {
            mConnection = connection;
            Log.i(LOG_TAG, "Bound to self braille service");
            return;
        }
    }

    private void doUnbindService()
    {
        if (mConnection != null)
        {
            ISelfBrailleService iselfbrailleservice = getSelfBrailleService();
            if (iselfbrailleservice != null)
            {
                try
                {
                    iselfbrailleservice.disconnect(mIdentity);
                }
                catch (RemoteException remoteexception) { }
            }
            mContext.unbindService(mConnection);
            mConnection = null;
        }
    }

    private ISelfBrailleService getSelfBrailleService()
    {
        Connection connection = mConnection;
        if (connection != null)
        {
            return connection.mService;
        } else
        {
            return null;
        }
    }

    private boolean verifyPackage()
    {
        Object obj = mContext.getPackageManager();
        PackageInfo packageinfo;
        Signature asignature[];
        int j;
        try
        {
            packageinfo = ((PackageManager) (obj)).getPackageInfo("com.googlecode.eyesfree.brailleback", 64);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.w(LOG_TAG, "Can't verify package com.googlecode.eyesfree.brailleback", ((Throwable) (obj)));
            return false;
        }
        try
        {
            obj = MessageDigest.getInstance("SHA-1");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e(LOG_TAG, "SHA-1 not supported", ((Throwable) (obj)));
            return false;
        }
        asignature = packageinfo.signatures;
        j = asignature.length;
        for (int i = 0; i < j; i++)
        {
            ((MessageDigest) (obj)).update(asignature[i].toByteArray());
            if (MessageDigest.isEqual(EYES_FREE_CERT_SHA1, ((MessageDigest) (obj)).digest()))
            {
                return true;
            }
            ((MessageDigest) (obj)).reset();
        }

        if (mAllowDebugService)
        {
            Log.w(LOG_TAG, String.format("*** %s connected to BrailleBack with invalid (debug?) signature ***", new Object[] {
                mContext.getPackageName()
            }));
            return true;
        } else
        {
            return false;
        }
    }

    public void shutdown()
    {
        mShutdown = true;
        doUnbindService();
    }

    public void write(WriteData writedata)
    {
        ISelfBrailleService iselfbrailleservice;
        writedata.validate();
        iselfbrailleservice = getSelfBrailleService();
        if (iselfbrailleservice == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        iselfbrailleservice.write(mIdentity, writedata);
        return;
        writedata;
        Log.e(LOG_TAG, "Self braille write failed", writedata);
        return;
    }








/*
    static int access$602(SelfBrailleClient selfbrailleclient, int i)
    {
        selfbrailleclient.mNumFailedBinds = i;
        return i;
    }

*/


/*
    static int access$604(SelfBrailleClient selfbrailleclient)
    {
        int i = selfbrailleclient.mNumFailedBinds + 1;
        selfbrailleclient.mNumFailedBinds = i;
        return i;
    }

*/



}
