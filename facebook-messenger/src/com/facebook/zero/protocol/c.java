// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.protocol;

import android.os.Bundle;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.OperationType;
import com.facebook.fbservice.service.ad;
import com.facebook.fbservice.service.e;
import com.facebook.http.protocol.aq;
import com.facebook.http.protocol.l;
import com.facebook.http.protocol.m;
import com.facebook.prefs.shared.ae;
import com.facebook.zero.a.a;
import com.facebook.zero.b.d;
import com.facebook.zero.protocol.a.b;
import com.facebook.zero.server.FetchZeroTokenParams;
import com.facebook.zero.server.FetchZeroTokenResult;
import com.facebook.zero.ui.CarrierBottomBannerData;
import com.facebook.zero.ui.h;
import com.facebook.zero.ui.p;

public class c
    implements e
{

    private final aq a;
    private final d b;
    private final h c;
    private final p d;
    private final com.facebook.zero.rewrite.e e;
    private final b f;
    private final com.facebook.zero.protocol.a.a g;

    public c(aq aq1, d d1, h h1, p p1, com.facebook.zero.rewrite.e e1, b b1, com.facebook.zero.protocol.a.a a1)
    {
        a = aq1;
        b = d1;
        c = h1;
        d = p1;
        e = e1;
        f = b1;
        g = a1;
    }

    private OperationResult b(ad ad1)
    {
        l l1 = new l();
        l1.a(m.BOOTSTRAP);
        ad1 = (FetchZeroTokenParams)ad1.b().getParcelable("fetchZeroTokenParams");
        ad1 = (FetchZeroTokenResult)a.a(f, ad1, l1);
        b.b(a.b, d.a(ad1.d()));
        b.b(a.c, e.a(ad1.c()));
        return OperationResult.a(ad1);
    }

    private OperationResult c(ad ad1)
    {
        ad1 = ad1.b().getString(com.facebook.zero.a.c.f.a());
        ad1 = (CarrierBottomBannerData)a.a(g, ad1);
        b.b(a.a, c.a(ad1));
        return OperationResult.a(ad1);
    }

    public OperationResult a(ad ad1)
    {
        OperationType operationtype = ad1.a();
        if (operationtype.equals(com.facebook.zero.server.e.a))
        {
            return b(ad1);
        }
        if (operationtype.equals(com.facebook.zero.server.e.b))
        {
            return c(ad1);
        } else
        {
            throw new Exception((new StringBuilder()).append("Unknown type: ").append(operationtype).toString());
        }
    }
}
