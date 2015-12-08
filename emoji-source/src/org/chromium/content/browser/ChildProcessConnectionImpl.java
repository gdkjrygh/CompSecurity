// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;
import org.chromium.base.CpuFeatures;
import org.chromium.base.ThreadUtils;
import org.chromium.base.TraceEvent;
import org.chromium.content.app.ChromiumLinkerParams;
import org.chromium.content.common.IChildProcessCallback;
import org.chromium.content.common.IChildProcessService;

// Referenced classes of package org.chromium.content.browser:
//            ChildProcessConnection, FileDescriptorInfo

public class ChildProcessConnectionImpl
    implements ChildProcessConnection
{
    private class ChildServiceConnection
        implements ServiceConnection
    {

        private final int mBindFlags;
        private boolean mBound;
        final ChildProcessConnectionImpl this$0;

        private Intent createServiceBindIntent()
        {
            Intent intent = new Intent();
            intent.setClassName(mContext, (new StringBuilder()).append(mServiceClass.getName()).append(mServiceNumber).toString());
            intent.setPackage(mContext.getPackageName());
            return intent;
        }

        boolean bind(String as[])
        {
            if (!mBound)
            {
                TraceEvent.begin();
                Intent intent = createServiceBindIntent();
                if (as != null)
                {
                    intent.putExtra("com.google.android.apps.chrome.extra.command_line", as);
                }
                if (mLinkerParams != null)
                {
                    mLinkerParams.addIntentExtras(intent);
                }
                mBound = mContext.bindService(intent, this, mBindFlags);
                TraceEvent.end();
            }
            return mBound;
        }

        boolean isBound()
        {
            return mBound;
        }

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
label0:
            {
                synchronized (mLock)
                {
                    if (!mServiceConnectComplete)
                    {
                        break label0;
                    }
                }
                return;
            }
            TraceEvent.begin();
            mServiceConnectComplete = true;
            mService = org.chromium.content.common.IChildProcessService.Stub.asInterface(ibinder);
            if (mConnectionParams != null)
            {
                doConnectionSetupLocked();
            }
            TraceEvent.end();
            componentname;
            JVM INSTR monitorexit ;
            return;
            ibinder;
            componentname;
            JVM INSTR monitorexit ;
            throw ibinder;
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            boolean flag;
label0:
            {
                flag = false;
                synchronized (mLock)
                {
                    if (!mServiceDisconnected)
                    {
                        break label0;
                    }
                }
                return;
            }
            ChildProcessConnectionImpl childprocessconnectionimpl;
            mServiceDisconnected = true;
            childprocessconnectionimpl = ChildProcessConnectionImpl.this;
            if (mInitialBinding.isBound() || mStrongBinding.isBound())
            {
                flag = true;
            }
            childprocessconnectionimpl.mWasOomProtected = flag;
            Log.w("ChildProcessConnection", (new StringBuilder()).append("onServiceDisconnected (crash or killed by oom): pid=").append(mPid).toString());
            stop();
            mDeathCallback.onChildProcessDied(ChildProcessConnectionImpl.this);
            if (mConnectionCallback != null)
            {
                mConnectionCallback.onConnected(0);
            }
            mConnectionCallback = null;
            componentname;
            JVM INSTR monitorexit ;
            return;
            exception;
            componentname;
            JVM INSTR monitorexit ;
            throw exception;
        }

        void unbind()
        {
            if (mBound)
            {
                mContext.unbindService(this);
                mBound = false;
            }
        }

        public ChildServiceConnection(int i)
        {
            this$0 = ChildProcessConnectionImpl.this;
            super();
            mBound = false;
            mBindFlags = i;
        }
    }

    private static class ConnectionParams
    {

        final IChildProcessCallback mCallback;
        final String mCommandLine[];
        final FileDescriptorInfo mFilesToBeMapped[];
        final Bundle mSharedRelros;

        ConnectionParams(String as[], FileDescriptorInfo afiledescriptorinfo[], IChildProcessCallback ichildprocesscallback, Bundle bundle)
        {
            mCommandLine = as;
            mFilesToBeMapped = afiledescriptorinfo;
            mCallback = ichildprocesscallback;
            mSharedRelros = bundle;
        }
    }


    static final boolean $assertionsDisabled;
    private static final String TAG = "ChildProcessConnection";
    private ChildProcessConnection.ConnectionCallback mConnectionCallback;
    private ConnectionParams mConnectionParams;
    private final Context mContext;
    private final ChildProcessConnection.DeathCallback mDeathCallback;
    private final boolean mInSandbox;
    private ChildServiceConnection mInitialBinding;
    private ChromiumLinkerParams mLinkerParams;
    private final Object mLock = new Object();
    private int mPid;
    private IChildProcessService mService;
    private final Class mServiceClass;
    private boolean mServiceConnectComplete;
    private boolean mServiceDisconnected;
    private final int mServiceNumber;
    private ChildServiceConnection mStrongBinding;
    private int mStrongBindingCount;
    private ChildServiceConnection mWaivedBinding;
    private boolean mWasOomProtected;

    ChildProcessConnectionImpl(Context context, int i, boolean flag, ChildProcessConnection.DeathCallback deathcallback, Class class1, ChromiumLinkerParams chromiumlinkerparams)
    {
        mService = null;
        mServiceConnectComplete = false;
        mServiceDisconnected = false;
        mWasOomProtected = false;
        mPid = 0;
        mInitialBinding = null;
        mStrongBinding = null;
        mWaivedBinding = null;
        mStrongBindingCount = 0;
        mLinkerParams = null;
        mContext = context;
        mServiceNumber = i;
        mInSandbox = flag;
        mDeathCallback = deathcallback;
        mServiceClass = class1;
        mLinkerParams = chromiumlinkerparams;
        mInitialBinding = new ChildServiceConnection(1);
        mStrongBinding = new ChildServiceConnection(65);
        mWaivedBinding = new ChildServiceConnection(33);
    }

    private void doConnectionSetupLocked()
    {
        Object obj;
        TraceEvent.begin();
        if (!$assertionsDisabled && (!mServiceConnectComplete || mService == null))
        {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && mConnectionParams == null)
        {
            throw new AssertionError();
        }
        Bundle bundle = new Bundle();
        bundle.putStringArray("com.google.android.apps.chrome.extra.command_line", mConnectionParams.mCommandLine);
        FileDescriptorInfo afiledescriptorinfo[] = mConnectionParams.mFilesToBeMapped;
        obj = new ParcelFileDescriptor[afiledescriptorinfo.length];
        int i = 0;
        while (i < afiledescriptorinfo.length) 
        {
            if (afiledescriptorinfo[i].mFd == -1)
            {
                Log.e("ChildProcessConnection", (new StringBuilder()).append("Invalid FD (id=").append(afiledescriptorinfo[i].mId).append(") for process connection, ").append("aborting connection.").toString());
                return;
            }
            String s = (new StringBuilder()).append("com.google.android.apps.chrome.extra.extraFile_").append(i).append("_id").toString();
            String s1 = (new StringBuilder()).append("com.google.android.apps.chrome.extra.extraFile_").append(i).append("_fd").toString();
            if (afiledescriptorinfo[i].mAutoClose)
            {
                obj[i] = ParcelFileDescriptor.adoptFd(afiledescriptorinfo[i].mFd);
            } else
            {
                try
                {
                    obj[i] = ParcelFileDescriptor.fromFd(afiledescriptorinfo[i].mFd);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.e("ChildProcessConnection", "Invalid FD provided for process connection, aborting connection.", ((Throwable) (obj)));
                    return;
                }
            }
            bundle.putParcelable(s1, obj[i]);
            bundle.putInt(s, afiledescriptorinfo[i].mId);
            i++;
        }
        bundle.putInt("com.google.android.apps.chrome.extra.cpu_count", CpuFeatures.getCount());
        bundle.putLong("com.google.android.apps.chrome.extra.cpu_features", CpuFeatures.getMask());
        bundle.putBundle("org.chromium.base.android.linker.shared_relros", mConnectionParams.mSharedRelros);
        try
        {
            mPid = mService.setupConnection(bundle, mConnectionParams.mCallback);
            if (!$assertionsDisabled && mPid == 0)
            {
                throw new AssertionError("Child service claims to be run by a process of pid=0.");
            }
        }
        catch (RemoteException remoteexception)
        {
            Log.e("ChildProcessConnection", "Failed to setup connection.", remoteexception);
        }
        int k = obj.length;
        int j = 0;
_L2:
        ParcelFileDescriptor parcelfiledescriptor;
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        parcelfiledescriptor = obj[j];
        if (parcelfiledescriptor == null)
        {
            break MISSING_BLOCK_LABEL_402;
        }
        parcelfiledescriptor.close();
        j++;
        if (true) goto _L2; else goto _L1
        IOException ioexception;
        ioexception;
        Log.w("ChildProcessConnection", "Failed to close FD.", ioexception);
_L1:
        mConnectionParams = null;
        if (mConnectionCallback != null)
        {
            mConnectionCallback.onConnected(mPid);
        }
        mConnectionCallback = null;
        TraceEvent.end();
        return;
    }

    public void addStrongBinding()
    {
label0:
        {
            synchronized (mLock)
            {
                if (mService != null)
                {
                    break label0;
                }
                Log.w("ChildProcessConnection", (new StringBuilder()).append("The connection is not bound for ").append(mPid).toString());
            }
            return;
        }
        if (mStrongBindingCount == 0)
        {
            mStrongBinding.bind(null);
        }
        mStrongBindingCount = mStrongBindingCount + 1;
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean crashServiceForTesting()
        throws RemoteException
    {
        try
        {
            mService.crashIntentionallyForTesting();
        }
        catch (DeadObjectException deadobjectexception)
        {
            return true;
        }
        return false;
    }

    public void dropOomBindings()
    {
        synchronized (mLock)
        {
            mInitialBinding.unbind();
            mStrongBindingCount = 0;
            mStrongBinding.unbind();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int getPid()
    {
        int i;
        synchronized (mLock)
        {
            i = mPid;
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public IChildProcessService getService()
    {
        IChildProcessService ichildprocessservice;
        synchronized (mLock)
        {
            ichildprocessservice = mService;
        }
        return ichildprocessservice;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int getServiceNumber()
    {
        return mServiceNumber;
    }

    public boolean isConnected()
    {
        return mService != null;
    }

    public boolean isInSandbox()
    {
        return mInSandbox;
    }

    public boolean isInitialBindingBound()
    {
        boolean flag;
        synchronized (mLock)
        {
            flag = mInitialBinding.isBound();
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isOomProtectedOrWasWhenDied()
    {
label0:
        {
            boolean flag;
            synchronized (mLock)
            {
                if (!mServiceDisconnected)
                {
                    break label0;
                }
                flag = mWasOomProtected;
            }
            return flag;
        }
        boolean flag1;
        if (!mInitialBinding.isBound() && !mStrongBinding.isBound())
        {
            flag1 = false;
        } else
        {
            flag1 = true;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isStrongBindingBound()
    {
        boolean flag;
        synchronized (mLock)
        {
            flag = mStrongBinding.isBound();
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void removeInitialBinding()
    {
        synchronized (mLock)
        {
            mInitialBinding.unbind();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void removeStrongBinding()
    {
label0:
        {
            synchronized (mLock)
            {
                if (mService != null)
                {
                    break label0;
                }
                Log.w("ChildProcessConnection", (new StringBuilder()).append("The connection is not bound for ").append(mPid).toString());
            }
            return;
        }
        if (!$assertionsDisabled && mStrongBindingCount <= 0)
        {
            throw new AssertionError();
        }
        break MISSING_BLOCK_LABEL_72;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        mStrongBindingCount = mStrongBindingCount - 1;
        if (mStrongBindingCount == 0)
        {
            mStrongBinding.unbind();
        }
        obj;
        JVM INSTR monitorexit ;
    }

    public void setupConnection(String as[], FileDescriptorInfo afiledescriptorinfo[], IChildProcessCallback ichildprocesscallback, ChildProcessConnection.ConnectionCallback connectioncallback, Bundle bundle)
    {
        Object obj = mLock;
        obj;
        JVM INSTR monitorenter ;
        if (!$assertionsDisabled && mConnectionParams != null)
        {
            throw new AssertionError();
        }
        break MISSING_BLOCK_LABEL_36;
        as;
        obj;
        JVM INSTR monitorexit ;
        throw as;
        if (!mServiceDisconnected)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        Log.w("ChildProcessConnection", "Tried to setup a connection that already disconnected.");
        connectioncallback.onConnected(0);
        obj;
        JVM INSTR monitorexit ;
        return;
        TraceEvent.begin();
        mConnectionCallback = connectioncallback;
        mConnectionParams = new ConnectionParams(as, afiledescriptorinfo, ichildprocesscallback, bundle);
        if (mServiceConnectComplete)
        {
            doConnectionSetupLocked();
        }
        TraceEvent.end();
        obj;
        JVM INSTR monitorexit ;
    }

    public void start(String as[])
    {
        Object obj = mLock;
        obj;
        JVM INSTR monitorenter ;
        TraceEvent.begin();
        if (!$assertionsDisabled && ThreadUtils.runningOnUiThread())
        {
            throw new AssertionError();
        }
        break MISSING_BLOCK_LABEL_35;
        as;
        obj;
        JVM INSTR monitorexit ;
        throw as;
        if (!$assertionsDisabled && mConnectionParams != null)
        {
            throw new AssertionError("setupConnection() called before start() in ChildProcessConnectionImpl.");
        }
        if (mInitialBinding.bind(as))
        {
            break MISSING_BLOCK_LABEL_95;
        }
        Log.e("ChildProcessConnection", "Failed to establish the service connection.");
        mDeathCallback.onChildProcessDied(this);
_L2:
        TraceEvent.end();
        obj;
        JVM INSTR monitorexit ;
        return;
        mWaivedBinding.bind(null);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void stop()
    {
        synchronized (mLock)
        {
            mInitialBinding.unbind();
            mStrongBinding.unbind();
            mWaivedBinding.unbind();
            mStrongBindingCount = 0;
            if (mService != null)
            {
                mService = null;
            }
            mConnectionParams = null;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        boolean flag;
        if (!org/chromium/content/browser/ChildProcessConnectionImpl.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }




/*
    static boolean access$1002(ChildProcessConnectionImpl childprocessconnectionimpl, boolean flag)
    {
        childprocessconnectionimpl.mWasOomProtected = flag;
        return flag;
    }

*/







/*
    static ChildProcessConnection.ConnectionCallback access$1502(ChildProcessConnectionImpl childprocessconnectionimpl, ChildProcessConnection.ConnectionCallback connectioncallback)
    {
        childprocessconnectionimpl.mConnectionCallback = connectioncallback;
        return connectioncallback;
    }

*/






/*
    static boolean access$502(ChildProcessConnectionImpl childprocessconnectionimpl, boolean flag)
    {
        childprocessconnectionimpl.mServiceConnectComplete = flag;
        return flag;
    }

*/


/*
    static IChildProcessService access$602(ChildProcessConnectionImpl childprocessconnectionimpl, IChildProcessService ichildprocessservice)
    {
        childprocessconnectionimpl.mService = ichildprocessservice;
        return ichildprocessservice;
    }

*/





/*
    static boolean access$902(ChildProcessConnectionImpl childprocessconnectionimpl, boolean flag)
    {
        childprocessconnectionimpl.mServiceDisconnected = flag;
        return flag;
    }

*/
}
