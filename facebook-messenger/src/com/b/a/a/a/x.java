// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a.a;

import android.os.StrictMode;
import android.util.Log;
import com.b.a.a.a;

public class x extends a
{

    private static final String TAG = com/b/a/a/a/x.getSimpleName();
    private static final int TARGET_VERSION = 9;
    private Object mPolicy;

    public x()
    {
        try
        {
            mPolicy = StrictMode.getThreadPolicy();
            return;
        }
        catch (Throwable throwable)
        {
            Log.e(TAG, "Unable to retrieve current thread policy.", throwable);
        }
    }

    protected int getMinimumApiLevel()
    {
        return 9;
    }

    protected android.os.StrictMode.ThreadPolicy onUpdateThreadPolicy(android.os.StrictMode.ThreadPolicy.Builder builder)
    {
        return (new android.os.StrictMode.ThreadPolicy.Builder((android.os.StrictMode.ThreadPolicy)mPolicy)).build();
    }

    protected boolean shouldRestoreThreadPenaltyLog()
    {
        return !isPenaltyLogSet((android.os.StrictMode.ThreadPolicy)mPolicy);
    }

}
