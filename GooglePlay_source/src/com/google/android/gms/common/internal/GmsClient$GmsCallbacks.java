// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.common.internal:
//            GmsClient, Preconditions

public static final class mDisconnectCount extends mDisconnectCount
{

    private final int mDisconnectCount;
    private GmsClient mGmsClient;

    public final void onAccountValidationComplete(int i, Bundle bundle)
    {
        Preconditions.checkNotNull(mGmsClient, "onAccountValidationComplete can be called only once per call to validateAccount");
        GmsClient gmsclient = mGmsClient;
        int j = mDisconnectCount;
        gmsclient.mHandler.sendMessage(gmsclient.mHandler.obtainMessage(5, j, -1, new nCallback(gmsclient, i, bundle)));
        mGmsClient = null;
    }

    public final void onPostInitComplete(int i, IBinder ibinder, Bundle bundle)
    {
        Preconditions.checkNotNull(mGmsClient, "onPostInitComplete can be called only once per call to getRemoteService");
        mGmsClient.onPostInitHandler(i, ibinder, bundle, mDisconnectCount);
        mGmsClient = null;
    }

    public nCallback(GmsClient gmsclient, int i)
    {
        mGmsClient = gmsclient;
        mDisconnectCount = i;
    }
}
