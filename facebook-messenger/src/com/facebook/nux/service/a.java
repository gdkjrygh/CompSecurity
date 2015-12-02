// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nux.service;

import android.os.Bundle;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.OperationType;
import com.facebook.fbservice.service.ad;
import com.facebook.fbservice.service.e;
import com.facebook.fbservice.service.t;
import com.facebook.http.protocol.aq;
import com.facebook.nux.status.FetchNuxStatusesParams;
import com.facebook.nux.status.FetchNuxStatusesResult;
import com.facebook.nux.status.UpdateNuxStatusParams;
import com.facebook.nux.status.j;
import com.facebook.nux.status.l;
import com.google.common.a.es;

public class a
    implements e
{

    public static final OperationType a = new OperationType("update_nux_status");
    public static final OperationType b = new OperationType("fetch_nux_status");
    private final javax.inject.a c;
    private final l d;
    private final com.facebook.nux.status.a e;
    private final j f;

    public a(javax.inject.a a1, l l, com.facebook.nux.status.a a2, j j1)
    {
        c = a1;
        d = l;
        e = a2;
        f = j1;
    }

    private FetchNuxStatusesResult a(FetchNuxStatusesParams fetchnuxstatusesparams)
    {
        fetchnuxstatusesparams = (FetchNuxStatusesResult)((aq)c.b()).a(e, fetchnuxstatusesparams);
        f.a(fetchnuxstatusesparams);
        return fetchnuxstatusesparams;
    }

    private OperationResult b(ad ad1)
    {
        ad1 = (UpdateNuxStatusParams)ad1.b().getParcelable("updateNuxStatusParams");
        if (!((Boolean)((aq)c.b()).a(d, ad1)).booleanValue())
        {
            return OperationResult.a(t.OTHER);
        } else
        {
            a(new FetchNuxStatusesParams(es.a(ad1.a())));
            return OperationResult.b();
        }
    }

    private OperationResult c(ad ad1)
    {
        return OperationResult.a(a((FetchNuxStatusesParams)ad1.b().getParcelable("fetchNuxStatusParams")));
    }

    public OperationResult a(ad ad1)
    {
        OperationType operationtype = ad1.a();
        if (a.equals(operationtype))
        {
            return b(ad1);
        }
        if (b.equals(operationtype))
        {
            return c(ad1);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown operation type: ").append(operationtype).toString());
        }
    }

}
