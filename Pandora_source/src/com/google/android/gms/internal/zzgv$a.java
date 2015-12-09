// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

// Referenced classes of package com.google.android.gms.internal:
//            zzgv, zzgu

private static final class c
    implements com.google.android.gms.appindexing.xApi.ActionResult
{

    private zzgv a;
    private PendingResult b;
    private Action c;

    public PendingResult end(GoogleApiClient googleapiclient)
    {
        Object obj = googleapiclient.getContext().getPackageName();
        long l = System.currentTimeMillis();
        obj = zzgu.zza(c, l, ((String) (obj)), 2);
        return a.zza(googleapiclient, new UsageInfo[] {
            obj
        });
    }

    public PendingResult getPendingResult()
    {
        return b;
    }

    on(zzgv zzgv1, PendingResult pendingresult, Action action)
    {
        a = zzgv1;
        b = pendingresult;
        c = action;
    }
}
