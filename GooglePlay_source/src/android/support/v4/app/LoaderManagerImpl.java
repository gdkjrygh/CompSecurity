// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.support.v4.util.DebugUtils;
import android.support.v4.util.SparseArrayCompat;
import android.util.Log;

// Referenced classes of package android.support.v4.app:
//            LoaderManager, FragmentActivity

final class LoaderManagerImpl extends LoaderManager
{

    static boolean DEBUG = false;
    FragmentActivity mActivity;
    final SparseArrayCompat mInactiveLoaders;
    final SparseArrayCompat mLoaders;
    boolean mRetaining;
    boolean mStarted;
    final String mWho;

    final void doDestroy()
    {
        if (!mRetaining)
        {
            mLoaders.clear();
        }
        mInactiveLoaders.clear();
    }

    final void doRetain()
    {
        if (!mStarted)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder("Called doRetain when not started: ")).append(this).toString(), runtimeexception);
            return;
        } else
        {
            mRetaining = true;
            mStarted = false;
            return;
        }
    }

    final void doStart()
    {
        if (mStarted)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder("Called doStart when already started: ")).append(this).toString(), runtimeexception);
            return;
        } else
        {
            mStarted = true;
            return;
        }
    }

    final void doStop()
    {
        if (!mStarted)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder("Called doStop when not started: ")).append(this).toString(), runtimeexception);
            return;
        } else
        {
            mStarted = false;
            return;
        }
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("LoaderManager{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" in ");
        DebugUtils.buildShortClassTag(mActivity, stringbuilder);
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }

}
