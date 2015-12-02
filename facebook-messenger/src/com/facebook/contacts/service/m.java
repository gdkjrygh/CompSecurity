// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.service;

import android.os.Bundle;
import com.facebook.contacts.a.c;
import com.facebook.contacts.data.i;
import com.facebook.contacts.data.k;
import com.facebook.contacts.data.l;
import com.facebook.contacts.g.g;
import com.facebook.contacts.server.FetchChatContextParams;
import com.facebook.contacts.server.FetchChatContextResult;
import com.facebook.contacts.server.FetchLastActiveParams;
import com.facebook.contacts.server.FetchLastActiveResult;
import com.facebook.contacts.server.SyncToCacheParams;
import com.facebook.contacts.server.SyncToCacheResult;
import com.facebook.contacts.server.d;
import com.facebook.fbservice.c.b;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.OperationType;
import com.facebook.fbservice.service.ad;
import com.facebook.fbservice.service.e;
import com.facebook.fbservice.service.s;
import com.facebook.http.protocol.aq;
import com.facebook.user.User;
import com.google.common.a.es;
import java.util.Iterator;
import java.util.Set;
import javax.inject.a;

public class m
    implements e
{

    private static final Class a = com/facebook/contacts/service/m;
    private final com.facebook.contacts.data.m b;
    private final l c;
    private final a d;
    private final g e;
    private final com.facebook.contacts.g.a.d f;
    private final c g;
    private final Set h;
    private final a i;
    private final k j;

    public m(com.facebook.contacts.data.m m1, l l1, a a1, g g1, com.facebook.contacts.g.a.d d1, c c1, Set set, 
            a a2, k k1)
    {
        b = m1;
        c = l1;
        d = a1;
        e = g1;
        f = d1;
        g = c1;
        h = set;
        i = a2;
        j = k1;
    }

    private OperationResult b(ad ad1)
    {
        ad1 = (FetchChatContextParams)ad1.b().getParcelable("fetchChatContextParams");
        ad1 = (FetchChatContextResult)((aq)d.b()).a(e, ad1);
        g.a(ad1.a());
        return OperationResult.a(new SyncToCacheResult(ad1.e(), ad1.f()));
    }

    private FetchLastActiveResult c(ad ad1)
    {
        ad1 = (SyncToCacheParams)ad1.b().getParcelable("syncToCacheParams");
        long l1 = j.a(i.f, -1L);
        if (ad1.a() == s.DO_NOT_CHECK_SERVER)
        {
            ad1 = c.a();
            return new FetchLastActiveResult(b.FROM_CACHE_STALE, ad1, l1);
        }
        long l2 = System.currentTimeMillis();
        if (l1 != -1L && l2 - l1 < 0x1d4c0L)
        {
            return FetchLastActiveResult.a;
        }
        Iterator iterator;
        if (((Boolean)i.b()).booleanValue())
        {
            ad1 = FetchLastActiveParams.a();
        } else
        {
            ad1 = FetchLastActiveParams.a(15);
        }
        ad1 = (FetchLastActiveResult)((aq)d.b()).a(f, ad1);
        iterator = ad1.a().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            User user = (User)iterator.next();
            if (user.C() != null)
            {
                g.a(user.c(), user.C());
            }
        } while (true);
        b.a(ad1.a());
        for (Iterator iterator1 = h.iterator(); iterator1.hasNext(); ((com.facebook.contacts.a.a)iterator1.next()).a()) { }
        j.b(i.f, System.currentTimeMillis());
        com.facebook.debug.log.b.b(a, "last active data loaded");
        return ad1;
    }

    public OperationResult a(ad ad1)
    {
        OperationType operationtype = ad1.a();
        if (d.p.equals(operationtype))
        {
            return b(ad1);
        }
        if (d.o.equals(operationtype))
        {
            return OperationResult.a(c(ad1));
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown operation type: ").append(operationtype).toString());
        }
    }

}
