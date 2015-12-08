// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.clearcut.internal;

import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.clearcut.internal:
//            ClearcutLoggerApiImpl

final class seClearcutLoggerApiMethodImpl
    implements Runnable
{

    final ClearcutLoggerApiImpl this$0;
    final GoogleApiClient val$apiClient;
    final seClearcutLoggerApiMethodImpl val$pendingResult;

    public final void run()
    {
        val$apiClient.enqueue(val$pendingResult);
    }

    seClearcutLoggerApiMethodImpl()
    {
        this$0 = final_clearcutloggerapiimpl;
        val$apiClient = googleapiclient;
        val$pendingResult = seClearcutLoggerApiMethodImpl.this;
        super();
    }
}
