// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a.a;

import android.os.StrictMode;
import android.util.Log;
import com.b.a.a.a;

public class ai extends a
{

    private static final String TAG = com/b/a/a/a/ai.getSimpleName();
    private static final int TARGET_VERSION = 9;
    private Object mPolicy;

    public ai()
    {
        try
        {
            mPolicy = StrictMode.getVmPolicy();
            return;
        }
        catch (Throwable throwable)
        {
            Log.e(TAG, "Unable to retrieve current vm policy.", throwable);
        }
    }

    protected int getMinimumApiLevel()
    {
        return 9;
    }

    protected android.os.StrictMode.VmPolicy onUpdateVmPolicy(android.os.StrictMode.VmPolicy.Builder builder)
    {
        return createVmBuilder((android.os.StrictMode.VmPolicy)mPolicy).build();
    }

    protected boolean shouldRestoreVmPenaltyLog()
    {
        return !isPenaltyLogSet((android.os.StrictMode.VmPolicy)mPolicy);
    }

}
