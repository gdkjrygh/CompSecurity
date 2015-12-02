// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.service;

import android.os.Bundle;
import com.facebook.contacts.a.d;
import com.facebook.contacts.data.i;
import com.facebook.contacts.data.k;
import com.facebook.contacts.data.m;
import com.facebook.contacts.g.a.f;
import com.facebook.contacts.g.a.g;
import com.facebook.contacts.g.a.h;
import com.facebook.contacts.g.a.j;
import com.facebook.contacts.server.FetchMessagingFavoritesResult;
import com.facebook.contacts.server.FetchMobileAppDataResult;
import com.facebook.contacts.server.FetchVoipInfoParams;
import com.facebook.contacts.server.FetchVoipInfoResult;
import com.facebook.contacts.server.UpdateFavoriteContactsParams;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.OperationType;
import com.facebook.fbservice.service.ad;
import com.facebook.fbservice.service.e;
import com.facebook.http.protocol.aq;
import com.facebook.user.User;
import com.google.common.a.es;
import javax.inject.a;

public class b
    implements e
{

    private static final Class a = com/facebook/contacts/service/b;
    private final a b;
    private final j c;
    private final com.facebook.contacts.g.a.e d;
    private final f e;
    private final g f;
    private final m g;
    private final d h;
    private final com.facebook.contacts.a.e i;
    private final k j;
    private final com.facebook.base.broadcast.a k;
    private final a l;
    private final h m;
    private final com.facebook.contacts.g.a.a n;

    public b(a a1, j j1, com.facebook.contacts.g.a.e e1, f f1, g g1, h h1, com.facebook.contacts.g.a.a a2, 
            m m1, d d1, com.facebook.contacts.a.e e2, k k1, com.facebook.base.broadcast.a a3, a a4)
    {
        b = a1;
        c = j1;
        d = e1;
        e = f1;
        f = g1;
        m = h1;
        n = a2;
        g = m1;
        h = d1;
        i = e2;
        j = k1;
        k = a3;
        l = a4;
    }

    private void a(es es1)
    {
        h.a();
        g.a(es1);
    }

    private FetchMobileAppDataResult b()
    {
        es es1 = es.d();
        if (!((Boolean)l.b()).booleanValue())
        {
            return new FetchMobileAppDataResult(com.facebook.fbservice.c.b.NO_DATA, es1, System.currentTimeMillis());
        }
        long l1 = j.a(i.g, -1L);
        long l2 = System.currentTimeMillis();
        if (l1 != -1L && l2 - l1 < 0x5265c00L)
        {
            es es2 = i.a();
            com.facebook.fbservice.c.b b1 = com.facebook.fbservice.c.b.FROM_CACHE_UP_TO_DATE;
            if (es2 != null)
            {
                es1 = es2;
            }
            return new FetchMobileAppDataResult(b1, es1, l1);
        } else
        {
            FetchMobileAppDataResult fetchmobileappdataresult = (FetchMobileAppDataResult)((aq)b.b()).a(e, Integer.valueOf(50));
            i.a(fetchmobileappdataresult.a());
            g.b(fetchmobileappdataresult.a());
            j.b(i.g, System.currentTimeMillis());
            com.facebook.debug.log.b.b(a, "mobile app data loaded");
            return fetchmobileappdataresult;
        }
    }

    private FetchVoipInfoResult b(ad ad1)
    {
        ad1 = (FetchVoipInfoParams)ad1.b().getParcelable("fetchVoipInfoParams");
        return (FetchVoipInfoResult)((aq)b.b()).a(f, ad1);
    }

    private OperationResult c(ad ad1)
    {
        ad1 = (UpdateFavoriteContactsParams)ad1.b().getParcelable("favorites");
        ((aq)b.b()).a(c, ad1);
        a(ad1.a());
        return OperationResult.b();
    }

    private void c()
    {
        long l1 = j.a(i.d, -1L);
        if (l1 != -1L && System.currentTimeMillis() - l1 < 0xa4cb80L)
        {
            return;
        } else
        {
            a(a().a());
            k.a("com.facebook.orca.FAVORITE_CONTACT_SYNC_PROGRESS");
            return;
        }
    }

    private User d(ad ad1)
    {
        ad1 = ad1.b().getString("phone_number");
        return (User)((aq)b.b()).a(m, new com.facebook.contacts.g.a.i(ad1));
    }

    private void e(ad ad1)
    {
        ad1 = ad1.b().getString("fbid");
        ((aq)b.b()).a(n, new com.facebook.contacts.g.a.b(ad1));
    }

    protected FetchMessagingFavoritesResult a()
    {
        return (FetchMessagingFavoritesResult)((aq)b.b()).a(d, null);
    }

    public OperationResult a(ad ad1)
    {
        OperationType operationtype = ad1.a();
        if (com.facebook.contacts.server.d.g.equals(operationtype))
        {
            c();
            return OperationResult.b();
        }
        if (com.facebook.contacts.server.d.h.equals(operationtype))
        {
            return c(ad1);
        }
        if (com.facebook.contacts.server.d.i.equals(operationtype))
        {
            return OperationResult.a(d(ad1));
        }
        if (com.facebook.contacts.server.d.j.equals(operationtype))
        {
            e(ad1);
            return OperationResult.b();
        }
        if (com.facebook.contacts.server.d.k.equals(operationtype))
        {
            return OperationResult.a(b());
        }
        if (com.facebook.contacts.server.d.l.equals(operationtype))
        {
            return OperationResult.a(b(ad1));
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown operation type: ").append(operationtype).toString());
        }
    }

}
