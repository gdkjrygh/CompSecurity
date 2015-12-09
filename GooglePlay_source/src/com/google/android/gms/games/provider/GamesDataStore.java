// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.provider;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.games.GamesSharedPrefs;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.games.provider:
//            GamesDatabaseHelper, ImageStore

final class GamesDataStore
{

    final GamesDatabaseHelper mDatabaseHelper;
    ImageStore mImageStore;
    int mInitRetries;
    final String mName;
    private final String mPrefsFileName;
    volatile CountDownLatch mReadAccessLatch;
    volatile CountDownLatch mWriteAccessLatch;

    public GamesDataStore(Context context, String s)
    {
        mName = (String)Preconditions.checkNotNull(s);
        mDatabaseHelper = new GamesDatabaseHelper(this, context, mName);
        mPrefsFileName = (new StringBuilder("games.data_store_")).append(s).toString();
        mReadAccessLatch = new CountDownLatch(1);
        mWriteAccessLatch = new CountDownLatch(1);
        mInitRetries = 0;
        GamesSharedPrefs.addDataStoreName(context, s);
    }

    static void waitForAccess(CountDownLatch countdownlatch)
    {
        if (countdownlatch == null)
        {
            return;
        }
        break MISSING_BLOCK_LABEL_12;
        InterruptedException interruptedexception;
        interruptedexception;
        Thread.currentThread().interrupt();
        countdownlatch.await();
        return;
    }

    public final SharedPreferences getPrefs(Context context)
    {
        AndroidUtils.assertMainGmsProcess();
        return context.getSharedPreferences(mPrefsFileName, 0);
    }

    public final boolean initialize(Context context)
    {
        boolean flag;
        if (mReadAccessLatch == null && mWriteAccessLatch == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return true;
        }
        context = ImageStore.verifyImageDirectory(context.getFilesDir(), mName);
        if (context == null)
        {
            mInitRetries = mInitRetries + 1;
            return false;
        } else
        {
            mImageStore = new ImageStore(context, mDatabaseHelper);
            mReadAccessLatch.countDown();
            mReadAccessLatch = null;
            mWriteAccessLatch.countDown();
            mWriteAccessLatch = null;
            mInitRetries = 0;
            return true;
        }
    }
}
