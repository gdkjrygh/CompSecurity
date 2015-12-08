// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.extension.advertising;

import android.content.Context;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.Manager;
import com.google.android.gms.ads.a.a;
import com.google.android.gms.ads.a.b;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import java.io.IOException;

public class AdvertisingManager extends Manager
{

    public static final String TAG = com/dominos/android/sdk/extension/advertising/AdvertisingManager.getSimpleName();
    private String mAdvertisingId;
    private Context mContext;

    public AdvertisingManager(Context context)
    {
        mContext = context;
    }

    public String getAdvertisingId()
    {
        return mAdvertisingId;
    }

    public String getName()
    {
        return "advertising_manager";
    }

    public boolean initializeAdId()
    {
        mAdvertisingId = a.a(mContext).a();
        return true;
        Object obj;
        obj;
        LogUtil.e(TAG, "%s", new Object[] {
            "Unrecoverable error connecting to Google Play services", ((IOException) (obj)).getMessage()
        });
_L2:
        return false;
        obj;
        LogUtil.e(TAG, "%s", new Object[] {
            "Google Play services is not available entirely.", ((c) (obj)).getMessage()
        });
        continue; /* Loop/switch isn't completed */
        obj;
        LogUtil.e(TAG, "%s", new Object[] {
            ((d) (obj)).getMessage()
        });
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected void onSessionSet()
    {
    }

}
