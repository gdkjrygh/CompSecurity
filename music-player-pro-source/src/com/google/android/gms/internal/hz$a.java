// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

// Referenced classes of package com.google.android.gms.internal:
//            hz, hc, hx, hy, 
//            hr

private static final class DH
    implements com.google.android.gms.appindexing.dexApi.ActionResult
{

    private hz DE;
    private PendingResult DF;
    private Action DG;
    private String DH;

    public PendingResult end(GoogleApiClient googleapiclient)
    {
        Object obj = ((hx)googleapiclient.a(hc.CG)).getContext().getPackageName();
        long l = System.currentTimeMillis();
        obj = hy.a(DG, DH, l, ((String) (obj)), 3);
        return DE.a(googleapiclient, new hr[] {
            obj
        });
    }

    public PendingResult getPendingResult()
    {
        return DF;
    }

    tion(hz hz1, PendingResult pendingresult, Action action, String s)
    {
        DE = hz1;
        DF = pendingresult;
        DG = action;
        DH = s;
    }
}
