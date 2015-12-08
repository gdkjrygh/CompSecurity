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
    /* block-local class not found */
    class LoaderInfo {}

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
                Log.v("LoaderManager", (new StringBuilder()).append("Destroying Active in ").append(this).toString());
            }
            for (int i = mLoaders.size() - 1; i >= 0; i--)
            {
                ((LoaderInfo)mLoaders.valueAt(i)).destroy();
            }

            mLoaders.clear();
        }
        if (DEBUG)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("Destroying Inactive in ").append(this).toString());
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
            Log.v("LoaderManager", (new StringBuilder()).append("Stopping in ").append(this).toString());
        }
        if (!mStarted)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder()).append("Called doStop when not started: ").append(this).toString(), runtimeexception);
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
            for (int j = 0; j < mInactiveLoaders.size(); j++)
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
                Log.v("LoaderManager", (new StringBuilder()).append("Finished Retaining in ").append(this).toString());
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
        boolean flag1 = false;
        int j = mLoaders.size();
        int i = 0;
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
        mLoaders.put(loaderinfo.mId, loaderinfo);
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
        LoaderInfo loaderinfo = (LoaderInfo)mLoaders.get(i);
        if (DEBUG)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("restartLoader in ").append(this).append(": args=").append(bundle).toString());
        }
        if (loaderinfo != null)
        {
            LoaderInfo loaderinfo1 = (LoaderInfo)mInactiveLoaders.get(i);
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
                    loaderinfo.mLoader.abandon();
                    mInactiveLoaders.put(i, loaderinfo);
                } else
                if (!loaderinfo.mStarted)
                {
                    if (DEBUG)
                    {
                        Log.v("LoaderManager", "  Current loader is stopped; replacing");
                    }
                    mLoaders.put(i, null);
                    loaderinfo.destroy();
                } else
                {
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
                loaderinfo.mLoader.abandon();
                mInactiveLoaders.put(i, loaderinfo);
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
}
