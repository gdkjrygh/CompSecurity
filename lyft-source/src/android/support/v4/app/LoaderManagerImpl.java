// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.Loader;
import android.support.v4.util.DebugUtils;
import android.support.v4.util.SparseArrayCompat;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//            LoaderManager, FragmentHostCallback, FragmentManagerImpl

class LoaderManagerImpl extends LoaderManager
{

    static boolean DEBUG = false;
    static final String TAG = "LoaderManager";
    boolean mCreatingLoader;
    private FragmentHostCallback mHost;
    final SparseArrayCompat mInactiveLoaders = new SparseArrayCompat();
    final SparseArrayCompat mLoaders = new SparseArrayCompat();
    boolean mRetaining;
    boolean mRetainingStarted;
    boolean mStarted;
    final String mWho;

    LoaderManagerImpl(String s, FragmentHostCallback fragmenthostcallback, boolean flag)
    {
        mWho = s;
        mHost = fragmenthostcallback;
        mStarted = flag;
    }

    private LoaderInfo createAndInstallLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks loadercallbacks)
    {
        mCreatingLoader = true;
        bundle = createLoader(i, bundle, loadercallbacks);
        installLoader(bundle);
        mCreatingLoader = false;
        return bundle;
        bundle;
        mCreatingLoader = false;
        throw bundle;
    }

    private LoaderInfo createLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks loadercallbacks)
    {
        LoaderInfo loaderinfo = new LoaderInfo(i, bundle, loadercallbacks);
        loaderinfo.mLoader = loadercallbacks.onCreateLoader(i, bundle);
        return loaderinfo;
    }

    public void destroyLoader(int i)
    {
        if (mCreatingLoader)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (DEBUG)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("destroyLoader in ").append(this).append(" of ").append(i).toString());
        }
        int j = mLoaders.g(i);
        if (j >= 0)
        {
            LoaderInfo loaderinfo = (LoaderInfo)mLoaders.f(j);
            mLoaders.d(j);
            loaderinfo.destroy();
        }
        i = mInactiveLoaders.g(i);
        if (i >= 0)
        {
            LoaderInfo loaderinfo1 = (LoaderInfo)mInactiveLoaders.f(i);
            mInactiveLoaders.d(i);
            loaderinfo1.destroy();
        }
        if (mHost != null && !hasRunningLoaders())
        {
            mHost.mFragmentManager.startPendingDeferredFragments();
        }
    }

    void doDestroy()
    {
        if (!mRetaining)
        {
            if (DEBUG)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("Destroying Active in ").append(this).toString());
            }
            for (int i = mLoaders.b() - 1; i >= 0; i--)
            {
                ((LoaderInfo)mLoaders.f(i)).destroy();
            }

            mLoaders.c();
        }
        if (DEBUG)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("Destroying Inactive in ").append(this).toString());
        }
        for (int j = mInactiveLoaders.b() - 1; j >= 0; j--)
        {
            ((LoaderInfo)mInactiveLoaders.f(j)).destroy();
        }

        mInactiveLoaders.c();
    }

    void doReportNextStart()
    {
        for (int i = mLoaders.b() - 1; i >= 0; i--)
        {
            ((LoaderInfo)mLoaders.f(i)).mReportNextStart = true;
        }

    }

    void doReportStart()
    {
        for (int i = mLoaders.b() - 1; i >= 0; i--)
        {
            ((LoaderInfo)mLoaders.f(i)).reportStart();
        }

    }

    void doRetain()
    {
        if (DEBUG)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("Retaining in ").append(this).toString());
        }
        if (!mStarted)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder()).append("Called doRetain when not started: ").append(this).toString(), runtimeexception);
        } else
        {
            mRetaining = true;
            mStarted = false;
            int i = mLoaders.b() - 1;
            while (i >= 0) 
            {
                ((LoaderInfo)mLoaders.f(i)).retain();
                i--;
            }
        }
    }

    void doStart()
    {
        if (DEBUG)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("Starting in ").append(this).toString());
        }
        if (mStarted)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder()).append("Called doStart when already started: ").append(this).toString(), runtimeexception);
        } else
        {
            mStarted = true;
            int i = mLoaders.b() - 1;
            while (i >= 0) 
            {
                ((LoaderInfo)mLoaders.f(i)).start();
                i--;
            }
        }
    }

    void doStop()
    {
        if (DEBUG)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("Stopping in ").append(this).toString());
        }
        if (!mStarted)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder()).append("Called doStop when not started: ").append(this).toString(), runtimeexception);
            return;
        }
        for (int i = mLoaders.b() - 1; i >= 0; i--)
        {
            ((LoaderInfo)mLoaders.f(i)).stop();
        }

        mStarted = false;
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        boolean flag = false;
        if (mLoaders.b() > 0)
        {
            printwriter.print(s);
            printwriter.println("Active Loaders:");
            String s1 = (new StringBuilder()).append(s).append("    ").toString();
            for (int i = 0; i < mLoaders.b(); i++)
            {
                LoaderInfo loaderinfo = (LoaderInfo)mLoaders.f(i);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(mLoaders.e(i));
                printwriter.print(": ");
                printwriter.println(loaderinfo.toString());
                loaderinfo.dump(s1, filedescriptor, printwriter, as);
            }

        }
        if (mInactiveLoaders.b() > 0)
        {
            printwriter.print(s);
            printwriter.println("Inactive Loaders:");
            String s2 = (new StringBuilder()).append(s).append("    ").toString();
            for (int j = ((flag) ? 1 : 0); j < mInactiveLoaders.b(); j++)
            {
                LoaderInfo loaderinfo1 = (LoaderInfo)mInactiveLoaders.f(j);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(mInactiveLoaders.e(j));
                printwriter.print(": ");
                printwriter.println(loaderinfo1.toString());
                loaderinfo1.dump(s2, filedescriptor, printwriter, as);
            }

        }
    }

    void finishRetain()
    {
        if (mRetaining)
        {
            if (DEBUG)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("Finished Retaining in ").append(this).toString());
            }
            mRetaining = false;
            for (int i = mLoaders.b() - 1; i >= 0; i--)
            {
                ((LoaderInfo)mLoaders.f(i)).finishRetain();
            }

        }
    }

    public Loader getLoader(int i)
    {
        if (mCreatingLoader)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        LoaderInfo loaderinfo = (LoaderInfo)mLoaders.a(i);
        if (loaderinfo != null)
        {
            if (loaderinfo.mPendingLoader != null)
            {
                return loaderinfo.mPendingLoader.mLoader;
            } else
            {
                return loaderinfo.mLoader;
            }
        } else
        {
            return null;
        }
    }

    public boolean hasRunningLoaders()
    {
        int j = mLoaders.b();
        int i = 0;
        boolean flag1 = false;
        while (i < j) 
        {
            LoaderInfo loaderinfo = (LoaderInfo)mLoaders.f(i);
            boolean flag;
            if (loaderinfo.mStarted && !loaderinfo.mDeliveredData)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 |= flag;
            i++;
        }
        return flag1;
    }

    public Loader initLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks loadercallbacks)
    {
        if (mCreatingLoader)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        LoaderInfo loaderinfo = (LoaderInfo)mLoaders.a(i);
        if (DEBUG)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("initLoader in ").append(this).append(": args=").append(bundle).toString());
        }
        if (loaderinfo == null)
        {
            loadercallbacks = createAndInstallLoader(i, bundle, loadercallbacks);
            bundle = loadercallbacks;
            if (DEBUG)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("  Created new loader ").append(loadercallbacks).toString());
                bundle = loadercallbacks;
            }
        } else
        {
            if (DEBUG)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("  Re-using existing loader ").append(loaderinfo).toString());
            }
            loaderinfo.mCallbacks = loadercallbacks;
            bundle = loaderinfo;
        }
        if (((LoaderInfo) (bundle)).mHaveData && mStarted)
        {
            bundle.callOnLoadFinished(((LoaderInfo) (bundle)).mLoader, ((LoaderInfo) (bundle)).mData);
        }
        return ((LoaderInfo) (bundle)).mLoader;
    }

    void installLoader(LoaderInfo loaderinfo)
    {
        mLoaders.b(loaderinfo.mId, loaderinfo);
        if (mStarted)
        {
            loaderinfo.start();
        }
    }

    public Loader restartLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks loadercallbacks)
    {
        if (mCreatingLoader)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        LoaderInfo loaderinfo = (LoaderInfo)mLoaders.a(i);
        if (DEBUG)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("restartLoader in ").append(this).append(": args=").append(bundle).toString());
        }
        if (loaderinfo != null)
        {
            LoaderInfo loaderinfo1 = (LoaderInfo)mInactiveLoaders.a(i);
            if (loaderinfo1 != null)
            {
                if (loaderinfo.mHaveData)
                {
                    if (DEBUG)
                    {
                        Log.v("LoaderManager", (new StringBuilder()).append("  Removing last inactive loader: ").append(loaderinfo).toString());
                    }
                    loaderinfo1.mDeliveredData = false;
                    loaderinfo1.destroy();
                    loaderinfo.mLoader.j();
                    mInactiveLoaders.b(i, loaderinfo);
                } else
                if (!loaderinfo.mStarted)
                {
                    if (DEBUG)
                    {
                        Log.v("LoaderManager", "  Current loader is stopped; replacing");
                    }
                    mLoaders.b(i, null);
                    loaderinfo.destroy();
                } else
                {
                    if (DEBUG)
                    {
                        Log.v("LoaderManager", "  Current loader is running; attempting to cancel");
                    }
                    loaderinfo.cancel();
                    if (loaderinfo.mPendingLoader != null)
                    {
                        if (DEBUG)
                        {
                            Log.v("LoaderManager", (new StringBuilder()).append("  Removing pending loader: ").append(loaderinfo.mPendingLoader).toString());
                        }
                        loaderinfo.mPendingLoader.destroy();
                        loaderinfo.mPendingLoader = null;
                    }
                    if (DEBUG)
                    {
                        Log.v("LoaderManager", "  Enqueuing as new pending loader");
                    }
                    loaderinfo.mPendingLoader = createLoader(i, bundle, loadercallbacks);
                    return loaderinfo.mPendingLoader.mLoader;
                }
            } else
            {
                if (DEBUG)
                {
                    Log.v("LoaderManager", (new StringBuilder()).append("  Making last loader inactive: ").append(loaderinfo).toString());
                }
                loaderinfo.mLoader.j();
                mInactiveLoaders.b(i, loaderinfo);
            }
        }
        return createAndInstallLoader(i, bundle, loadercallbacks).mLoader;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("LoaderManager{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" in ");
        DebugUtils.a(mHost, stringbuilder);
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }

    void updateHostController(FragmentHostCallback fragmenthostcallback)
    {
        mHost = fragmenthostcallback;
    }

    static 
    {
        DEBUG = false;
    }


    private class LoaderInfo
        implements android.support.v4.content.Loader.OnLoadCanceledListener, android.support.v4.content.Loader.OnLoadCompleteListener
    {

        final Bundle mArgs;
        LoaderManager.LoaderCallbacks mCallbacks;
        Object mData;
        boolean mDeliveredData;
        boolean mDestroyed;
        boolean mHaveData;
        final int mId;
        boolean mListenerRegistered;
        Loader mLoader;
        LoaderInfo mPendingLoader;
        boolean mReportNextStart;
        boolean mRetaining;
        boolean mRetainingStarted;
        boolean mStarted;
        final LoaderManagerImpl this$0;

        void callOnLoadFinished(Loader loader, Object obj)
        {
            if (mCallbacks == null)
            {
                break MISSING_BLOCK_LABEL_130;
            }
            String s;
            if (mHost != null)
            {
                s = mHost.mFragmentManager.mNoTransactionsBecause;
                mHost.mFragmentManager.mNoTransactionsBecause = "onLoadFinished";
            } else
            {
                s = null;
            }
            if (LoaderManagerImpl.DEBUG)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("  onLoadFinished in ").append(loader).append(": ").append(loader.b(obj)).toString());
            }
            mCallbacks.onLoadFinished(loader, obj);
            if (mHost != null)
            {
                mHost.mFragmentManager.mNoTransactionsBecause = s;
            }
            mDeliveredData = true;
            return;
            loader;
            if (mHost != null)
            {
                mHost.mFragmentManager.mNoTransactionsBecause = s;
            }
            throw loader;
        }

        void cancel()
        {
            if (LoaderManagerImpl.DEBUG)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("  Canceling: ").append(this).toString());
            }
            if (mStarted && mLoader != null && mListenerRegistered && !mLoader.f())
            {
                onLoadCanceled(mLoader);
            }
        }

        void destroy()
        {
            if (LoaderManagerImpl.DEBUG)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("  Destroying: ").append(this).toString());
            }
            mDestroyed = true;
            boolean flag = mDeliveredData;
            mDeliveredData = false;
            if (mCallbacks == null || mLoader == null || !mHaveData || !flag)
            {
                break MISSING_BLOCK_LABEL_178;
            }
            if (LoaderManagerImpl.DEBUG)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("  Reseting: ").append(this).toString());
            }
            String s;
            Exception exception;
            if (mHost != null)
            {
                s = mHost.mFragmentManager.mNoTransactionsBecause;
                mHost.mFragmentManager.mNoTransactionsBecause = "onLoaderReset";
            } else
            {
                s = null;
            }
            mCallbacks.onLoaderReset(mLoader);
            if (mHost != null)
            {
                mHost.mFragmentManager.mNoTransactionsBecause = s;
            }
            mCallbacks = null;
            mData = null;
            mHaveData = false;
            if (mLoader != null)
            {
                if (mListenerRegistered)
                {
                    mListenerRegistered = false;
                    mLoader.a(this);
                    mLoader.b(this);
                }
                mLoader.l();
            }
            if (mPendingLoader != null)
            {
                mPendingLoader.destroy();
            }
            return;
            exception;
            if (mHost != null)
            {
                mHost.mFragmentManager.mNoTransactionsBecause = s;
            }
            throw exception;
        }

        public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
        {
            printwriter.print(s);
            printwriter.print("mId=");
            printwriter.print(mId);
            printwriter.print(" mArgs=");
            printwriter.println(mArgs);
            printwriter.print(s);
            printwriter.print("mCallbacks=");
            printwriter.println(mCallbacks);
            printwriter.print(s);
            printwriter.print("mLoader=");
            printwriter.println(mLoader);
            if (mLoader != null)
            {
                mLoader.a((new StringBuilder()).append(s).append("  ").toString(), filedescriptor, printwriter, as);
            }
            if (mHaveData || mDeliveredData)
            {
                printwriter.print(s);
                printwriter.print("mHaveData=");
                printwriter.print(mHaveData);
                printwriter.print("  mDeliveredData=");
                printwriter.println(mDeliveredData);
                printwriter.print(s);
                printwriter.print("mData=");
                printwriter.println(mData);
            }
            printwriter.print(s);
            printwriter.print("mStarted=");
            printwriter.print(mStarted);
            printwriter.print(" mReportNextStart=");
            printwriter.print(mReportNextStart);
            printwriter.print(" mDestroyed=");
            printwriter.println(mDestroyed);
            printwriter.print(s);
            printwriter.print("mRetaining=");
            printwriter.print(mRetaining);
            printwriter.print(" mRetainingStarted=");
            printwriter.print(mRetainingStarted);
            printwriter.print(" mListenerRegistered=");
            printwriter.println(mListenerRegistered);
            if (mPendingLoader != null)
            {
                printwriter.print(s);
                printwriter.println("Pending Loader ");
                printwriter.print(mPendingLoader);
                printwriter.println(":");
                mPendingLoader.dump((new StringBuilder()).append(s).append("  ").toString(), filedescriptor, printwriter, as);
            }
        }

        void finishRetain()
        {
            if (mRetaining)
            {
                if (LoaderManagerImpl.DEBUG)
                {
                    Log.v("LoaderManager", (new StringBuilder()).append("  Finished Retaining: ").append(this).toString());
                }
                mRetaining = false;
                if (mStarted != mRetainingStarted && !mStarted)
                {
                    stop();
                }
            }
            if (mStarted && mHaveData && !mReportNextStart)
            {
                callOnLoadFinished(mLoader, mData);
            }
        }

        public void onLoadCanceled(Loader loader)
        {
            if (LoaderManagerImpl.DEBUG)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("onLoadCanceled: ").append(this).toString());
            }
            if (!mDestroyed) goto _L2; else goto _L1
_L1:
            if (LoaderManagerImpl.DEBUG)
            {
                Log.v("LoaderManager", "  Ignoring load canceled -- destroyed");
            }
_L4:
            return;
_L2:
            if (mLoaders.a(mId) == this)
            {
                break; /* Loop/switch isn't completed */
            }
            if (LoaderManagerImpl.DEBUG)
            {
                Log.v("LoaderManager", "  Ignoring load canceled -- not active");
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
            loader = mPendingLoader;
            if (loader != null)
            {
                if (LoaderManagerImpl.DEBUG)
                {
                    Log.v("LoaderManager", (new StringBuilder()).append("  Switching to pending loader: ").append(loader).toString());
                }
                mPendingLoader = null;
                mLoaders.b(mId, null);
                destroy();
                installLoader(loader);
                return;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        public void onLoadComplete(Loader loader, Object obj)
        {
            if (LoaderManagerImpl.DEBUG)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("onLoadComplete: ").append(this).toString());
            }
            if (!mDestroyed) goto _L2; else goto _L1
_L1:
            if (LoaderManagerImpl.DEBUG)
            {
                Log.v("LoaderManager", "  Ignoring load complete -- destroyed");
            }
_L4:
            return;
_L2:
            if (mLoaders.a(mId) == this)
            {
                break; /* Loop/switch isn't completed */
            }
            if (LoaderManagerImpl.DEBUG)
            {
                Log.v("LoaderManager", "  Ignoring load complete -- not active");
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
            LoaderInfo loaderinfo = mPendingLoader;
            if (loaderinfo != null)
            {
                if (LoaderManagerImpl.DEBUG)
                {
                    Log.v("LoaderManager", (new StringBuilder()).append("  Switching to pending loader: ").append(loaderinfo).toString());
                }
                mPendingLoader = null;
                mLoaders.b(mId, null);
                destroy();
                installLoader(loaderinfo);
                return;
            }
            if (mData != obj || !mHaveData)
            {
                mData = obj;
                mHaveData = true;
                if (mStarted)
                {
                    callOnLoadFinished(loader, obj);
                }
            }
            loader = (LoaderInfo)mInactiveLoaders.a(mId);
            if (loader != null && loader != this)
            {
                loader.mDeliveredData = false;
                loader.destroy();
                mInactiveLoaders.c(mId);
            }
            if (mHost != null && !hasRunningLoaders())
            {
                mHost.mFragmentManager.startPendingDeferredFragments();
                return;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        void reportStart()
        {
            if (mStarted && mReportNextStart)
            {
                mReportNextStart = false;
                if (mHaveData)
                {
                    callOnLoadFinished(mLoader, mData);
                }
            }
        }

        void retain()
        {
            if (LoaderManagerImpl.DEBUG)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("  Retaining: ").append(this).toString());
            }
            mRetaining = true;
            mRetainingStarted = mStarted;
            mStarted = false;
            mCallbacks = null;
        }

        void start()
        {
            if (mRetaining && mRetainingStarted)
            {
                mStarted = true;
            } else
            if (!mStarted)
            {
                mStarted = true;
                if (LoaderManagerImpl.DEBUG)
                {
                    Log.v("LoaderManager", (new StringBuilder()).append("  Starting: ").append(this).toString());
                }
                if (mLoader == null && mCallbacks != null)
                {
                    mLoader = mCallbacks.onCreateLoader(mId, mArgs);
                }
                if (mLoader != null)
                {
                    if (mLoader.getClass().isMemberClass() && !Modifier.isStatic(mLoader.getClass().getModifiers()))
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append("Object returned from onCreateLoader must not be a non-static inner member class: ").append(mLoader).toString());
                    }
                    if (!mListenerRegistered)
                    {
                        mLoader.a(mId, this);
                        mLoader.a(this);
                        mListenerRegistered = true;
                    }
                    mLoader.d();
                    return;
                }
            }
        }

        void stop()
        {
            if (LoaderManagerImpl.DEBUG)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("  Stopping: ").append(this).toString());
            }
            mStarted = false;
            if (!mRetaining && mLoader != null && mListenerRegistered)
            {
                mListenerRegistered = false;
                mLoader.a(this);
                mLoader.b(this);
                mLoader.h();
            }
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder(64);
            stringbuilder.append("LoaderInfo{");
            stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringbuilder.append(" #");
            stringbuilder.append(mId);
            stringbuilder.append(" : ");
            DebugUtils.a(mLoader, stringbuilder);
            stringbuilder.append("}}");
            return stringbuilder.toString();
        }

        public LoaderInfo(int i, Bundle bundle, LoaderManager.LoaderCallbacks loadercallbacks)
        {
            this$0 = LoaderManagerImpl.this;
            super();
            mId = i;
            mArgs = bundle;
            mCallbacks = loadercallbacks;
        }
    }

}
