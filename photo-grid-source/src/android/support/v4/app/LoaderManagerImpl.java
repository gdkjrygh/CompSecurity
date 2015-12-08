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
//            LoaderManager, FragmentActivity, FragmentManagerImpl

class LoaderManagerImpl extends LoaderManager
{

    static boolean DEBUG = false;
    static final String TAG = "LoaderManager";
    FragmentActivity mActivity;
    boolean mCreatingLoader;
    final SparseArrayCompat mInactiveLoaders = new SparseArrayCompat();
    final SparseArrayCompat mLoaders = new SparseArrayCompat();
    boolean mRetaining;
    boolean mRetainingStarted;
    boolean mStarted;
    final String mWho;

    LoaderManagerImpl(String s, FragmentActivity fragmentactivity, boolean flag)
    {
        mWho = s;
        mActivity = fragmentactivity;
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
            (new StringBuilder("destroyLoader in ")).append(this).append(" of ").append(i);
        }
        int j = mLoaders.indexOfKey(i);
        if (j >= 0)
        {
            LoaderInfo loaderinfo = (LoaderInfo)mLoaders.valueAt(j);
            mLoaders.removeAt(j);
            loaderinfo.destroy();
        }
        i = mInactiveLoaders.indexOfKey(i);
        if (i >= 0)
        {
            LoaderInfo loaderinfo1 = (LoaderInfo)mInactiveLoaders.valueAt(i);
            mInactiveLoaders.removeAt(i);
            loaderinfo1.destroy();
        }
        if (mActivity != null && !hasRunningLoaders())
        {
            mActivity.mFragments.startPendingDeferredFragments();
        }
    }

    void doDestroy()
    {
        if (!mRetaining)
        {
            if (DEBUG)
            {
                (new StringBuilder("Destroying Active in ")).append(this);
            }
            for (int i = mLoaders.size() - 1; i >= 0; i--)
            {
                ((LoaderInfo)mLoaders.valueAt(i)).destroy();
            }

            mLoaders.clear();
        }
        if (DEBUG)
        {
            (new StringBuilder("Destroying Inactive in ")).append(this);
        }
        for (int j = mInactiveLoaders.size() - 1; j >= 0; j--)
        {
            ((LoaderInfo)mInactiveLoaders.valueAt(j)).destroy();
        }

        mInactiveLoaders.clear();
    }

    void doReportNextStart()
    {
        for (int i = mLoaders.size() - 1; i >= 0; i--)
        {
            ((LoaderInfo)mLoaders.valueAt(i)).mReportNextStart = true;
        }

    }

    void doReportStart()
    {
        for (int i = mLoaders.size() - 1; i >= 0; i--)
        {
            ((LoaderInfo)mLoaders.valueAt(i)).reportStart();
        }

    }

    void doRetain()
    {
        if (DEBUG)
        {
            (new StringBuilder("Retaining in ")).append(this);
        }
        if (!mStarted)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder("Called doRetain when not started: ")).append(this).toString(), runtimeexception);
        } else
        {
            mRetaining = true;
            mStarted = false;
            int i = mLoaders.size() - 1;
            while (i >= 0) 
            {
                ((LoaderInfo)mLoaders.valueAt(i)).retain();
                i--;
            }
        }
    }

    void doStart()
    {
        if (DEBUG)
        {
            (new StringBuilder("Starting in ")).append(this);
        }
        if (mStarted)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder("Called doStart when already started: ")).append(this).toString(), runtimeexception);
        } else
        {
            mStarted = true;
            int i = mLoaders.size() - 1;
            while (i >= 0) 
            {
                ((LoaderInfo)mLoaders.valueAt(i)).start();
                i--;
            }
        }
    }

    void doStop()
    {
        if (DEBUG)
        {
            (new StringBuilder("Stopping in ")).append(this);
        }
        if (!mStarted)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder("Called doStop when not started: ")).append(this).toString(), runtimeexception);
            return;
        }
        for (int i = mLoaders.size() - 1; i >= 0; i--)
        {
            ((LoaderInfo)mLoaders.valueAt(i)).stop();
        }

        mStarted = false;
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        boolean flag = false;
        if (mLoaders.size() > 0)
        {
            printwriter.print(s);
            printwriter.println("Active Loaders:");
            String s1 = (new StringBuilder()).append(s).append("    ").toString();
            for (int i = 0; i < mLoaders.size(); i++)
            {
                LoaderInfo loaderinfo = (LoaderInfo)mLoaders.valueAt(i);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(mLoaders.keyAt(i));
                printwriter.print(": ");
                printwriter.println(loaderinfo.toString());
                loaderinfo.dump(s1, filedescriptor, printwriter, as);
            }

        }
        if (mInactiveLoaders.size() > 0)
        {
            printwriter.print(s);
            printwriter.println("Inactive Loaders:");
            String s2 = (new StringBuilder()).append(s).append("    ").toString();
            for (int j = ((flag) ? 1 : 0); j < mInactiveLoaders.size(); j++)
            {
                LoaderInfo loaderinfo1 = (LoaderInfo)mInactiveLoaders.valueAt(j);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(mInactiveLoaders.keyAt(j));
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
                (new StringBuilder("Finished Retaining in ")).append(this);
            }
            mRetaining = false;
            for (int i = mLoaders.size() - 1; i >= 0; i--)
            {
                ((LoaderInfo)mLoaders.valueAt(i)).finishRetain();
            }

        }
    }

    public Loader getLoader(int i)
    {
        if (mCreatingLoader)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        LoaderInfo loaderinfo = (LoaderInfo)mLoaders.get(i);
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
        int j = mLoaders.size();
        int i = 0;
        boolean flag1 = false;
        while (i < j) 
        {
            LoaderInfo loaderinfo = (LoaderInfo)mLoaders.valueAt(i);
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
        LoaderInfo loaderinfo = (LoaderInfo)mLoaders.get(i);
        if (DEBUG)
        {
            (new StringBuilder("initLoader in ")).append(this).append(": args=").append(bundle);
        }
        if (loaderinfo == null)
        {
            loadercallbacks = createAndInstallLoader(i, bundle, loadercallbacks);
            bundle = loadercallbacks;
            if (DEBUG)
            {
                (new StringBuilder("  Created new loader ")).append(loadercallbacks);
                bundle = loadercallbacks;
            }
        } else
        {
            if (DEBUG)
            {
                (new StringBuilder("  Re-using existing loader ")).append(loaderinfo);
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
        mLoaders.put(loaderinfo.mId, loaderinfo);
        if (mStarted)
        {
            loaderinfo.start();
        }
    }

    public Loader restartLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks loadercallbacks)
    {
        LoaderInfo loaderinfo;
        if (mCreatingLoader)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        loaderinfo = (LoaderInfo)mLoaders.get(i);
        if (DEBUG)
        {
            (new StringBuilder("restartLoader in ")).append(this).append(": args=").append(bundle);
        }
        if (loaderinfo == null) goto _L2; else goto _L1
_L1:
        LoaderInfo loaderinfo1 = (LoaderInfo)mInactiveLoaders.get(i);
        if (loaderinfo1 == null) goto _L4; else goto _L3
_L3:
        if (!loaderinfo.mHaveData) goto _L6; else goto _L5
_L5:
        if (DEBUG)
        {
            (new StringBuilder("  Removing last inactive loader: ")).append(loaderinfo);
        }
        loaderinfo1.mDeliveredData = false;
        loaderinfo1.destroy();
_L9:
        loaderinfo.mLoader.abandon();
        mInactiveLoaders.put(i, loaderinfo);
_L2:
        return createAndInstallLoader(i, bundle, loadercallbacks).mLoader;
_L6:
        if (loaderinfo.mStarted)
        {
            break; /* Loop/switch isn't completed */
        }
        mLoaders.put(i, null);
        loaderinfo.destroy();
        if (true) goto _L2; else goto _L7
_L7:
        if (loaderinfo.mPendingLoader != null)
        {
            if (DEBUG)
            {
                (new StringBuilder("  Removing pending loader: ")).append(loaderinfo.mPendingLoader);
            }
            loaderinfo.mPendingLoader.destroy();
            loaderinfo.mPendingLoader = null;
        }
        loaderinfo.mPendingLoader = createLoader(i, bundle, loadercallbacks);
        return loaderinfo.mPendingLoader.mLoader;
_L4:
        if (DEBUG)
        {
            (new StringBuilder("  Making last loader inactive: ")).append(loaderinfo);
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("LoaderManager{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" in ");
        DebugUtils.buildShortClassTag(mActivity, stringbuilder);
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }

    void updateActivity(FragmentActivity fragmentactivity)
    {
        mActivity = fragmentactivity;
    }

    static 
    {
        DEBUG = false;
    }

    private class LoaderInfo
        implements android.support.v4.content.Loader.OnLoadCompleteListener
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

        final void callOnLoadFinished(Loader loader, Object obj)
        {
            if (mCallbacks == null)
            {
                break MISSING_BLOCK_LABEL_119;
            }
            String s;
            if (mActivity != null)
            {
                s = mActivity.mFragments.mNoTransactionsBecause;
                mActivity.mFragments.mNoTransactionsBecause = "onLoadFinished";
            } else
            {
                s = null;
            }
            if (LoaderManagerImpl.DEBUG)
            {
                (new StringBuilder("  onLoadFinished in ")).append(loader).append(": ").append(loader.dataToString(obj));
            }
            mCallbacks.onLoadFinished(loader, obj);
            if (mActivity != null)
            {
                mActivity.mFragments.mNoTransactionsBecause = s;
            }
            mDeliveredData = true;
            return;
            loader;
            if (mActivity != null)
            {
                mActivity.mFragments.mNoTransactionsBecause = s;
            }
            throw loader;
        }

        final void destroy()
        {
            LoaderInfo loaderinfo = this;
_L2:
            if (LoaderManagerImpl.DEBUG)
            {
                (new StringBuilder("  Destroying: ")).append(loaderinfo);
            }
            loaderinfo.mDestroyed = true;
            boolean flag = loaderinfo.mDeliveredData;
            loaderinfo.mDeliveredData = false;
            if (loaderinfo.mCallbacks == null || loaderinfo.mLoader == null || !loaderinfo.mHaveData || !flag)
            {
                break MISSING_BLOCK_LABEL_160;
            }
            if (LoaderManagerImpl.DEBUG)
            {
                (new StringBuilder("  Reseting: ")).append(loaderinfo);
            }
            String s;
            Exception exception;
            if (loaderinfo.this$0.mActivity != null)
            {
                s = loaderinfo.this$0.mActivity.mFragments.mNoTransactionsBecause;
                loaderinfo.this$0.mActivity.mFragments.mNoTransactionsBecause = "onLoaderReset";
            } else
            {
                s = null;
            }
            loaderinfo.mCallbacks.onLoaderReset(loaderinfo.mLoader);
            if (loaderinfo.this$0.mActivity != null)
            {
                loaderinfo.this$0.mActivity.mFragments.mNoTransactionsBecause = s;
            }
            loaderinfo.mCallbacks = null;
            loaderinfo.mData = null;
            loaderinfo.mHaveData = false;
            if (loaderinfo.mLoader != null)
            {
                if (loaderinfo.mListenerRegistered)
                {
                    loaderinfo.mListenerRegistered = false;
                    loaderinfo.mLoader.unregisterListener(loaderinfo);
                }
                loaderinfo.mLoader.reset();
            }
            if (loaderinfo.mPendingLoader != null)
            {
                loaderinfo = loaderinfo.mPendingLoader;
            } else
            {
                return;
            }
            if (true) goto _L2; else goto _L1
_L1:
            exception;
            if (loaderinfo.this$0.mActivity != null)
            {
                loaderinfo.this$0.mActivity.mFragments.mNoTransactionsBecause = s;
            }
            throw exception;
        }

        public final void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
        {
            String s1 = s;
            s = this;
            do
            {
                printwriter.print(s1);
                printwriter.print("mId=");
                printwriter.print(((LoaderInfo) (s)).mId);
                printwriter.print(" mArgs=");
                printwriter.println(((LoaderInfo) (s)).mArgs);
                printwriter.print(s1);
                printwriter.print("mCallbacks=");
                printwriter.println(((LoaderInfo) (s)).mCallbacks);
                printwriter.print(s1);
                printwriter.print("mLoader=");
                printwriter.println(((LoaderInfo) (s)).mLoader);
                if (((LoaderInfo) (s)).mLoader != null)
                {
                    ((LoaderInfo) (s)).mLoader.dump((new StringBuilder()).append(s1).append("  ").toString(), filedescriptor, printwriter, as);
                }
                if (((LoaderInfo) (s)).mHaveData || ((LoaderInfo) (s)).mDeliveredData)
                {
                    printwriter.print(s1);
                    printwriter.print("mHaveData=");
                    printwriter.print(((LoaderInfo) (s)).mHaveData);
                    printwriter.print("  mDeliveredData=");
                    printwriter.println(((LoaderInfo) (s)).mDeliveredData);
                    printwriter.print(s1);
                    printwriter.print("mData=");
                    printwriter.println(((LoaderInfo) (s)).mData);
                }
                printwriter.print(s1);
                printwriter.print("mStarted=");
                printwriter.print(((LoaderInfo) (s)).mStarted);
                printwriter.print(" mReportNextStart=");
                printwriter.print(((LoaderInfo) (s)).mReportNextStart);
                printwriter.print(" mDestroyed=");
                printwriter.println(((LoaderInfo) (s)).mDestroyed);
                printwriter.print(s1);
                printwriter.print("mRetaining=");
                printwriter.print(((LoaderInfo) (s)).mRetaining);
                printwriter.print(" mRetainingStarted=");
                printwriter.print(((LoaderInfo) (s)).mRetainingStarted);
                printwriter.print(" mListenerRegistered=");
                printwriter.println(((LoaderInfo) (s)).mListenerRegistered);
                if (((LoaderInfo) (s)).mPendingLoader != null)
                {
                    printwriter.print(s1);
                    printwriter.println("Pending Loader ");
                    printwriter.print(((LoaderInfo) (s)).mPendingLoader);
                    printwriter.println(":");
                    s = ((LoaderInfo) (s)).mPendingLoader;
                    s1 = (new StringBuilder()).append(s1).append("  ").toString();
                } else
                {
                    return;
                }
            } while (true);
        }

        final void finishRetain()
        {
            if (mRetaining)
            {
                if (LoaderManagerImpl.DEBUG)
                {
                    (new StringBuilder("  Finished Retaining: ")).append(this);
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

        public final void onLoadComplete(Loader loader, Object obj)
        {
            if (LoaderManagerImpl.DEBUG)
            {
                (new StringBuilder("onLoadComplete: ")).append(this);
            }
            boolean flag;
            if (mDestroyed)
            {
                flag = LoaderManagerImpl.DEBUG;
            } else
            {
                if (mLoaders.get(mId) != this)
                {
                    boolean flag1 = LoaderManagerImpl.DEBUG;
                    return;
                }
                LoaderInfo loaderinfo = mPendingLoader;
                if (loaderinfo != null)
                {
                    if (LoaderManagerImpl.DEBUG)
                    {
                        (new StringBuilder("  Switching to pending loader: ")).append(loaderinfo);
                    }
                    mPendingLoader = null;
                    mLoaders.put(mId, null);
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
                loader = (LoaderInfo)mInactiveLoaders.get(mId);
                if (loader != null && loader != this)
                {
                    loader.mDeliveredData = false;
                    loader.destroy();
                    mInactiveLoaders.remove(mId);
                }
                if (mActivity != null && !hasRunningLoaders())
                {
                    mActivity.mFragments.startPendingDeferredFragments();
                    return;
                }
            }
        }

        final void reportStart()
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

        final void retain()
        {
            if (LoaderManagerImpl.DEBUG)
            {
                (new StringBuilder("  Retaining: ")).append(this);
            }
            mRetaining = true;
            mRetainingStarted = mStarted;
            mStarted = false;
            mCallbacks = null;
        }

        final void start()
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
                    (new StringBuilder("  Starting: ")).append(this);
                }
                if (mLoader == null && mCallbacks != null)
                {
                    mLoader = mCallbacks.onCreateLoader(mId, mArgs);
                }
                if (mLoader != null)
                {
                    if (mLoader.getClass().isMemberClass() && !Modifier.isStatic(mLoader.getClass().getModifiers()))
                    {
                        throw new IllegalArgumentException((new StringBuilder("Object returned from onCreateLoader must not be a non-static inner member class: ")).append(mLoader).toString());
                    }
                    if (!mListenerRegistered)
                    {
                        mLoader.registerListener(mId, this);
                        mListenerRegistered = true;
                    }
                    mLoader.startLoading();
                    return;
                }
            }
        }

        final void stop()
        {
            if (LoaderManagerImpl.DEBUG)
            {
                (new StringBuilder("  Stopping: ")).append(this);
            }
            mStarted = false;
            if (!mRetaining && mLoader != null && mListenerRegistered)
            {
                mListenerRegistered = false;
                mLoader.unregisterListener(this);
                mLoader.stopLoading();
            }
        }

        public final String toString()
        {
            StringBuilder stringbuilder = new StringBuilder(64);
            stringbuilder.append("LoaderInfo{");
            stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringbuilder.append(" #");
            stringbuilder.append(mId);
            stringbuilder.append(" : ");
            DebugUtils.buildShortClassTag(mLoader, stringbuilder);
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
