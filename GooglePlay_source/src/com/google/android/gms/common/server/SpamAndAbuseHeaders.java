// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server;

import android.content.Context;
import com.google.android.gms.common.util.AndroidUtils;

public final class SpamAndAbuseHeaders
{

    private static SpamAndAbuseHeaders sInstance;
    private String mNetworkId;

    private SpamAndAbuseHeaders()
    {
    }

    public static SpamAndAbuseHeaders getInstance()
    {
        com/google/android/gms/common/server/SpamAndAbuseHeaders;
        JVM INSTR monitorenter ;
        SpamAndAbuseHeaders spamandabuseheaders;
        if (sInstance == null)
        {
            sInstance = new SpamAndAbuseHeaders();
        }
        spamandabuseheaders = sInstance;
        com/google/android/gms/common/server/SpamAndAbuseHeaders;
        JVM INSTR monitorexit ;
        return spamandabuseheaders;
        Exception exception;
        exception;
        com/google/android/gms/common/server/SpamAndAbuseHeaders;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final String getNetworkId(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        if (mNetworkId == null)
        {
            mNetworkId = AndroidUtils.getNetworkId(context);
        }
        context = mNetworkId;
        this;
        JVM INSTR monitorexit ;
        return context;
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
    }
}
