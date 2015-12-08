// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.app;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Debug;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.base.CommandLine;
import org.chromium.base.library_loader.LibraryLoader;
import org.chromium.base.library_loader.Linker;
import org.chromium.base.library_loader.ProcessInitException;
import org.chromium.content.common.IChildProcessCallback;
import org.chromium.content.common.SurfaceWrapper;

// Referenced classes of package org.chromium.content.app:
//            ChromiumLinkerParams, ContentMain

public class ChildProcessService extends Service
{

    private static final String MAIN_THREAD_NAME = "ChildProcessMain";
    private static final String TAG = "ChildProcessService";
    private static AtomicReference sContext = new AtomicReference(null);
    private final org.chromium.content.common.IChildProcessService.Stub mBinder = new org.chromium.content.common.IChildProcessService.Stub() {

        static final boolean $assertionsDisabled;
        final ChildProcessService this$0;

        public void crashIntentionallyForTesting()
        {
            Process.killProcess(Process.myPid());
        }

        public int setupConnection(Bundle bundle, IChildProcessCallback ichildprocesscallback)
        {
            mCallback = ichildprocesscallback;
            ichildprocesscallback = mMainThread;
            ichildprocesscallback;
            JVM INSTR monitorenter ;
            if (mCommandLineParams == null)
            {
                mCommandLineParams = bundle.getStringArray("com.google.android.apps.chrome.extra.command_line");
            }
            if (!$assertionsDisabled && mCommandLineParams == null)
            {
                throw new AssertionError();
            }
            break MISSING_BLOCK_LABEL_72;
            bundle;
            ichildprocesscallback;
            JVM INSTR monitorexit ;
            throw bundle;
            mCpuCount = bundle.getInt("com.google.android.apps.chrome.extra.cpu_count");
            mCpuFeatures = bundle.getLong("com.google.android.apps.chrome.extra.cpu_features");
            if (!$assertionsDisabled && mCpuCount <= 0)
            {
                throw new AssertionError();
            }
            mFileIds = new ArrayList();
            mFileFds = new ArrayList();
            int i = 0;
_L2:
            Object obj = (ParcelFileDescriptor)bundle.getParcelable((new StringBuilder()).append("com.google.android.apps.chrome.extra.extraFile_").append(i).append("_fd").toString());
            if (obj != null)
            {
                break MISSING_BLOCK_LABEL_225;
            }
            bundle = bundle.getBundle("org.chromium.base.android.linker.shared_relros");
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_209;
            }
            Linker.useSharedRelros(bundle);
            mMainThread.notifyAll();
            ichildprocesscallback;
            JVM INSTR monitorexit ;
            return Process.myPid();
            mFileFds.add(obj);
            obj = (new StringBuilder()).append("com.google.android.apps.chrome.extra.extraFile_").append(i).append("_id").toString();
            mFileIds.add(Integer.valueOf(bundle.getInt(((String) (obj)))));
            i++;
            if (true) goto _L2; else goto _L1
_L1:
        }

        static 
        {
            boolean flag;
            if (!org/chromium/content/app/ChildProcessService.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            $assertionsDisabled = flag;
        }

            
            {
                this$0 = ChildProcessService.this;
                super();
            }
    };
    private IChildProcessCallback mCallback;
    private String mCommandLineParams[];
    private int mCpuCount;
    private long mCpuFeatures;
    private ArrayList mFileFds;
    private ArrayList mFileIds;
    private boolean mIsBound;
    private boolean mLibraryInitialized;
    private ChromiumLinkerParams mLinkerParams;
    private Thread mMainThread;

    public ChildProcessService()
    {
        mLibraryInitialized = false;
        mIsBound = false;
    }

    private void establishSurfaceTexturePeer(int i, Object obj, int j, int k)
    {
        if (mCallback != null) goto _L2; else goto _L1
_L1:
        Log.e("ChildProcessService", "No callback interface has been provided.");
_L3:
        return;
_L2:
        boolean flag;
        flag = false;
        if (obj instanceof Surface)
        {
            obj = (Surface)obj;
        } else
        if (obj instanceof SurfaceTexture)
        {
            obj = new Surface((SurfaceTexture)obj);
            flag = true;
        } else
        {
            Log.e("ChildProcessService", (new StringBuilder()).append("Not a valid surfaceObject: ").append(obj).toString());
            return;
        }
        mCallback.establishSurfacePeer(i, ((Surface) (obj)), j, k);
        if (flag)
        {
            ((Surface) (obj)).release();
            return;
        }
          goto _L3
        Object obj1;
        obj1;
        Log.e("ChildProcessService", (new StringBuilder()).append("Unable to call establishSurfaceTexturePeer: ").append(obj1).toString());
        if (!flag) goto _L3; else goto _L4
_L4:
        ((Surface) (obj)).release();
        return;
        obj1;
        if (flag)
        {
            ((Surface) (obj)).release();
        }
        throw obj1;
    }

    static Context getContext()
    {
        return (Context)sContext.get();
    }

    private Surface getSurfaceTextureSurface(int i, int j)
    {
        if (mCallback == null)
        {
            Log.e("ChildProcessService", "No callback interface has been provided.");
            return null;
        }
        Surface surface;
        try
        {
            surface = mCallback.getSurfaceTextureSurface(i, j).getSurface();
        }
        catch (RemoteException remoteexception)
        {
            Log.e("ChildProcessService", (new StringBuilder()).append("Unable to call getSurfaceTextureSurface: ").append(remoteexception).toString());
            return null;
        }
        return surface;
    }

    private Surface getViewSurface(int i)
    {
        if (mCallback == null)
        {
            Log.e("ChildProcessService", "No callback interface has been provided.");
            return null;
        }
        Surface surface;
        try
        {
            surface = mCallback.getViewSurface(i).getSurface();
        }
        catch (RemoteException remoteexception)
        {
            Log.e("ChildProcessService", (new StringBuilder()).append("Unable to call establishSurfaceTexturePeer: ").append(remoteexception).toString());
            return null;
        }
        return surface;
    }

    private static native void nativeExitChildProcess();

    private static native void nativeInitChildProcess(Context context, ChildProcessService childprocessservice, int ai[], int ai1[], int i, long l);

    private native void nativeShutdownMainThread();

    public IBinder onBind(Intent intent)
    {
        stopSelf();
        synchronized (mMainThread)
        {
            mCommandLineParams = intent.getStringArrayExtra("com.google.android.apps.chrome.extra.command_line");
            mLinkerParams = new ChromiumLinkerParams(intent);
            mIsBound = true;
            mMainThread.notifyAll();
        }
        return mBinder;
        intent;
        thread;
        JVM INSTR monitorexit ;
        throw intent;
    }

    public void onCreate()
    {
        Log.i("ChildProcessService", (new StringBuilder()).append("Creating new ChildProcessService pid=").append(Process.myPid()).toString());
        if (sContext.get() != null)
        {
            Log.e("ChildProcessService", "ChildProcessService created again in process!");
        }
        sContext.set(this);
        super.onCreate();
        mMainThread = new Thread(new Runnable() {

            static final boolean $assertionsDisabled;
            final ChildProcessService this$0;

            public void run()
            {
                Object obj = mMainThread;
                obj;
                JVM INSTR monitorenter ;
                while (mCommandLineParams == null) 
                {
                    mMainThread.wait();
                }
                  goto _L1
                Exception exception;
                exception;
                obj;
                JVM INSTR monitorexit ;
                  goto _L2
_L1:
                obj;
                JVM INSTR monitorexit ;
                CommandLine.init(mCommandLineParams);
                flag2 = Linker.isUsed();
                int i;
                boolean flag;
                flag = false;
                i = 0;
                if (!flag2) goto _L4; else goto _L3
_L3:
                obj = mMainThread;
                obj;
                JVM INSTR monitorenter ;
                while (!mIsBound) 
                {
                    mMainThread.wait();
                }
                break MISSING_BLOCK_LABEL_157;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
_L2:
                boolean flag2;
                try
                {
                    throw exception;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.w("ChildProcessService", (new StringBuilder()).append("ChildProcessMain startup failed: ").append(obj).toString());
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.w("ChildProcessService", (new StringBuilder()).append("ChildProcessMain startup failed: ").append(obj).toString());
                }
                return;
                obj;
                JVM INSTR monitorexit ;
                if (!$assertionsDisabled && mLinkerParams == null)
                {
                    throw new AssertionError();
                }
                if (!mLinkerParams.mWaitForSharedRelro) goto _L6; else goto _L5
_L5:
                i = 1;
                Linker.initServiceProcess(mLinkerParams.mBaseLoadAddress);
_L8:
                Linker.setTestRunnerClassName(mLinkerParams.mTestRunnerClassName);
                flag = i;
_L4:
                i = 0;
                if (CommandLine.getInstance().hasSwitch("renderer-wait-for-java-debugger"))
                {
                    Debug.waitForDebugger();
                }
                LibraryLoader.loadNow(getApplicationContext(), false);
                i = 1;
_L9:
                boolean flag1;
                flag1 = i;
                if (i)
                {
                    break MISSING_BLOCK_LABEL_288;
                }
                flag1 = i;
                if (!flag)
                {
                    break MISSING_BLOCK_LABEL_288;
                }
                Linker.disableSharedRelros();
                LibraryLoader.loadNow(getApplicationContext(), false);
                flag1 = true;
_L10:
                if (flag1)
                {
                    break MISSING_BLOCK_LABEL_297;
                }
                System.exit(-1);
                LibraryLoader.initialize();
                obj = mMainThread;
                obj;
                JVM INSTR monitorenter ;
                mLibraryInitialized = true;
                mMainThread.notifyAll();
                while (mFileIds == null) 
                {
                    mMainThread.wait();
                }
                  goto _L7
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
_L6:
                Linker.disableSharedRelros();
                  goto _L8
                obj;
                if (!flag)
                {
                    break MISSING_BLOCK_LABEL_380;
                }
                Log.w("ChildProcessService", "Failed to load native library with shared RELRO, retrying without");
                  goto _L9
                Log.e("ChildProcessService", "Failed to load native library", ((Throwable) (obj)));
                  goto _L9
                obj;
                Log.e("ChildProcessService", "Failed to load native library on retry", ((Throwable) (obj)));
                flag1 = i;
                  goto _L10
_L7:
                obj;
                JVM INSTR monitorexit ;
                int ai[];
                int ai1[];
                if (!$assertionsDisabled && mFileIds.size() != mFileFds.size())
                {
                    throw new AssertionError();
                }
                ai = new int[mFileIds.size()];
                ai1 = new int[mFileFds.size()];
                i = 0;
_L12:
                if (i >= mFileIds.size())
                {
                    break; /* Loop/switch isn't completed */
                }
                ai[i] = ((Integer)mFileIds.get(i)).intValue();
                ai1[i] = ((ParcelFileDescriptor)mFileFds.get(i)).detachFd();
                i++;
                if (true) goto _L12; else goto _L11
_L11:
                ContentMain.initApplicationContext(((Context)ChildProcessService.sContext.get()).getApplicationContext());
                ChildProcessService.nativeInitChildProcess(((Context)ChildProcessService.sContext.get()).getApplicationContext(), ChildProcessService.this, ai, ai1, mCpuCount, mCpuFeatures);
                ContentMain.start();
                ChildProcessService.nativeExitChildProcess();
                return;
                  goto _L8
            }

            static 
            {
                boolean flag;
                if (!org/chromium/content/app/ChildProcessService.desiredAssertionStatus())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                $assertionsDisabled = flag;
            }

            
            {
                this$0 = ChildProcessService.this;
                super();
            }
        }, "ChildProcessMain");
        mMainThread.start();
    }

    public void onDestroy()
    {
        Log.i("ChildProcessService", (new StringBuilder()).append("Destroying ChildProcessService pid=").append(Process.myPid()).toString());
        super.onDestroy();
        if (mCommandLineParams == null)
        {
            return;
        }
        Thread thread = mMainThread;
        thread;
        JVM INSTR monitorenter ;
        Exception exception;
        try
        {
            while (!mLibraryInitialized) 
            {
                mMainThread.wait();
            }
        }
        catch (InterruptedException interruptedexception) { }
        finally { }
        thread;
        JVM INSTR monitorexit ;
        nativeShutdownMainThread();
        return;
        thread;
        JVM INSTR monitorexit ;
        throw exception;
    }



/*
    static IChildProcessCallback access$002(ChildProcessService childprocessservice, IChildProcessCallback ichildprocesscallback)
    {
        childprocessservice.mCallback = ichildprocesscallback;
        return ichildprocesscallback;
    }

*/







/*
    static String[] access$202(ChildProcessService childprocessservice, String as[])
    {
        childprocessservice.mCommandLineParams = as;
        return as;
    }

*/



/*
    static int access$302(ChildProcessService childprocessservice, int i)
    {
        childprocessservice.mCpuCount = i;
        return i;
    }

*/



/*
    static long access$402(ChildProcessService childprocessservice, long l)
    {
        childprocessservice.mCpuFeatures = l;
        return l;
    }

*/



/*
    static ArrayList access$502(ChildProcessService childprocessservice, ArrayList arraylist)
    {
        childprocessservice.mFileIds = arraylist;
        return arraylist;
    }

*/



/*
    static ArrayList access$602(ChildProcessService childprocessservice, ArrayList arraylist)
    {
        childprocessservice.mFileFds = arraylist;
        return arraylist;
    }

*/




/*
    static boolean access$902(ChildProcessService childprocessservice, boolean flag)
    {
        childprocessservice.mLibraryInitialized = flag;
        return flag;
    }

*/
}
