// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.service;

import android.os.Bundle;
import com.facebook.analytics.a;
import com.facebook.contacts.data.i;
import com.facebook.contacts.data.k;
import com.facebook.contacts.data.l;
import com.facebook.contacts.data.m;
import com.facebook.contacts.data.o;
import com.facebook.contacts.database.AddressBookPeriodicRunner;
import com.facebook.contacts.g.f;
import com.facebook.contacts.g.h;
import com.facebook.contacts.g.j;
import com.facebook.contacts.server.BlockContactParams;
import com.facebook.contacts.server.CreateContactClaimParams;
import com.facebook.contacts.server.DeleteContactClaimParams;
import com.facebook.contacts.server.FetchAllContactsParams;
import com.facebook.contacts.server.FetchAllContactsResult;
import com.facebook.contacts.server.FetchContactParams;
import com.facebook.contacts.server.FetchContactResult;
import com.facebook.contacts.server.FetchDeltaContactsParams;
import com.facebook.contacts.server.FetchDeltaContactsResult;
import com.facebook.debug.log.b;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.OperationType;
import com.facebook.fbservice.service.ad;
import com.facebook.fbservice.service.e;
import com.facebook.fbservice.service.s;
import com.facebook.fbservice.service.t;
import com.facebook.http.protocol.ApiErrorResult;
import com.facebook.http.protocol.aq;
import com.facebook.http.protocol.d;
import com.facebook.user.UserKey;
import com.facebook.user.n;
import com.google.common.a.em;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.contacts.service:
//            a

public class c
    implements e
{

    private static final Class a = com/facebook/contacts/service/c;
    private final javax.inject.a b;
    private final f c;
    private final j d;
    private final h e;
    private final com.facebook.contacts.g.b f;
    private final com.facebook.contacts.g.a g;
    private final com.facebook.contacts.g.d h;
    private final com.facebook.contacts.g.e i;
    private final com.facebook.contacts.service.a j;
    private final AddressBookPeriodicRunner k;
    private final com.facebook.contacts.a.b l;
    private final l m;
    private final m n;
    private final com.facebook.contacts.data.b o;
    private final com.facebook.base.broadcast.a p;
    private final k q;
    private final com.facebook.common.time.a r;
    private final a s;

    public c(javax.inject.a a1, f f1, j j1, h h1, com.facebook.contacts.g.b b1, com.facebook.contacts.g.a a2, com.facebook.contacts.g.d d1, 
            com.facebook.contacts.g.e e1, AddressBookPeriodicRunner addressbookperiodicrunner, com.facebook.contacts.service.a a3, com.facebook.contacts.a.b b2, l l1, m m1, com.facebook.contacts.data.b b3, 
            com.facebook.base.broadcast.a a4, k k1, com.facebook.common.time.a a5, a a6)
    {
        b = a1;
        c = f1;
        d = j1;
        e = h1;
        f = b1;
        g = a2;
        h = d1;
        i = e1;
        k = addressbookperiodicrunner;
        j = a3;
        l = b2;
        m = l1;
        n = m1;
        o = b3;
        p = a4;
        q = k1;
        r = a5;
        s = a6;
    }

    private OperationResult a()
    {
        s.a("download_contacts", 1L);
        String s2 = b();
        long l1 = r.a();
        String s1;
        boolean flag;
        if (s2 == null)
        {
            s1 = c();
        } else
        {
            try
            {
                s1 = a(s2);
            }
            catch (com.facebook.http.protocol.e e1)
            {
                s.a("download_contacts_delta_failed", 1L);
                ApiErrorResult apierrorresult = e1.b();
                if (apierrorresult.d() == d.GRAPHQL_KERROR_DOMAIN && apierrorresult.a() == 0x19f871)
                {
                    com.facebook.debug.log.b.d(a, (new StringBuilder()).append("Delta sync cursor ").append(s2).append(" no longer valid, falling ").append("back to full sync.").toString());
                    e1 = c();
                } else
                {
                    throw e1;
                }
            }
        }
        if (s1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        q.b(i.a, l1);
        q.b(i.b, s1);
        return OperationResult.b();
    }

    private OperationResult a(UserKey userkey)
    {
        userkey = j.a(userkey);
        if (userkey == FetchContactResult.a)
        {
            return OperationResult.a(t.OTHER, "Contact not found in android db.");
        } else
        {
            return OperationResult.a(userkey);
        }
    }

    private String a(String s1)
    {
        s.a("download_contacts_delta", 1L);
        String s2;
        FetchDeltaContactsResult fetchdeltacontactsresult;
        do
        {
            com.facebook.debug.d.e.b(5L);
            com.facebook.debug.d.e e1 = com.facebook.debug.d.e.a((new StringBuilder()).append("syncContactsDelta (").append(50).append(" contacts)").toString());
            s.a("download_contacts_deta_next", 1L);
            s1 = new FetchDeltaContactsParams(50, s1);
            fetchdeltacontactsresult = (FetchDeltaContactsResult)((aq)b.b()).a(d, s1);
            s1 = fetchdeltacontactsresult.a();
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Inserting contacts: ").append(s1).toString());
            n.a(s1, o.INSERT);
            s1 = fetchdeltacontactsresult.b();
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Deleting contacts: ").append(s1).toString());
            n.a(s1);
            s2 = fetchdeltacontactsresult.c();
            p.a("com.facebook.orca.ACTION_FRIEND_SYNC_PROGRESS");
            e1.a();
            com.facebook.debug.d.e.a(a);
            s1 = s2;
        } while (fetchdeltacontactsresult.d());
        return s2;
    }

    private OperationResult b(ad ad1)
    {
        UserKey userkey = ((FetchContactParams)ad1.b().getParcelable("fetchContactParams")).a();
        if (userkey.a() == n.PHONE_NUMBER)
        {
            return a(userkey);
        }
        if (userkey.a() == n.FACEBOOK || userkey.a() == n.FACEBOOK_CONTACT)
        {
            return c(ad1);
        } else
        {
            throw new Exception("Unsupported UserKey type");
        }
    }

    private OperationResult b(UserKey userkey)
    {
        aq aq1 = (aq)b.b();
        userkey = new FetchContactParams(s.CHECK_SERVER_FOR_NEW_DATA, userkey);
        userkey = (FetchContactResult)aq1.a(e, userkey);
        n.a(userkey.a(), userkey.b());
        l.a(userkey.a(), userkey.b());
        return OperationResult.b();
    }

    private String b()
    {
        long l1 = q.a(i.a, -1L);
        if (l1 == -1L)
        {
            com.facebook.debug.log.b.b(a, "No last sync timestamp; forcing full sync.");
            return null;
        }
        l1 = r.a() - l1;
        if (l1 > 0x48190800L)
        {
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Last sync was ").append(l1 / 0x5265c00L).append(" days ago; forcing full sync.").toString());
            return null;
        }
        String s1 = q.a(i.b);
        if (s1 != null)
        {
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Doing delta sync, cursor: ").append(s1).toString());
            return s1;
        } else
        {
            com.facebook.debug.log.b.b(a, "No delta sync cursor; forcing full sync.");
            return s1;
        }
    }

    private OperationResult c(ad ad1)
    {
        ad1 = (FetchContactParams)ad1.b().getParcelable("fetchContactParams");
        Object obj = ad1.a();
        s s1 = ad1.b();
        if (s1 != s.CHECK_SERVER_FOR_NEW_DATA)
        {
            com.facebook.debug.log.b.c(a, (new StringBuilder()).append("Checking contacts cache: ").append(obj).toString());
            com.facebook.contacts.models.Contact contact = l.a(((UserKey) (obj)));
            com.facebook.contacts.models.ContactDetails contactdetails = l.b(((UserKey) (obj)));
            if (contact != null && contactdetails != null)
            {
                com.facebook.debug.log.b.c(a, (new StringBuilder()).append("Got cached contact: ").append(contact).toString());
                return OperationResult.a(new FetchContactResult(com.facebook.fbservice.c.b.FROM_CACHE_STALE, System.currentTimeMillis(), contact, contactdetails));
            }
        }
        if (s1 != s.CHECK_SERVER_FOR_NEW_DATA)
        {
            com.facebook.debug.log.b.c(a, (new StringBuilder()).append("Checking contacts DB: ").append(obj).toString());
            obj = m.a(((UserKey) (obj)));
            if (obj != FetchContactResult.a && ((FetchContactResult) (obj)).b() != null)
            {
                com.facebook.debug.log.b.c(a, (new StringBuilder()).append("Got DB contact: ").append(((FetchContactResult) (obj)).a()).toString());
                return OperationResult.a(((android.os.Parcelable) (obj)));
            }
        }
        com.facebook.debug.log.b.c(a, "Fetching contact from server");
        ad1 = (FetchContactResult)((aq)b.b()).a(e, ad1);
        com.facebook.debug.log.b.c(a, (new StringBuilder()).append("Got contact from server: ").append(ad1.a()).toString());
        n.a(ad1.a(), ad1.b());
        l.a(ad1.a(), ad1.b());
        return OperationResult.a(ad1);
    }

    private String c()
    {
        s.a("download_contacts_full", 1L);
        o o1 = o.REPLACE_ALL;
        String s1 = null;
        int i1 = 0;
        Object obj = "download_contacts_full_first";
        do
        {
            FetchAllContactsResult fetchallcontactsresult;
            com.facebook.debug.d.e e1;
            int j1;
            if (i1 == 0)
            {
                j1 = 20;
            } else
            {
                j1 = 50;
            }
            com.facebook.debug.d.e.b(5L);
            e1 = com.facebook.debug.d.e.a((new StringBuilder()).append("syncContactsFull (").append(j1).append(" contacts)").toString());
            s.a(((String) (obj)), 1L);
            obj = FetchAllContactsParams.a(j1, s1);
            fetchallcontactsresult = (FetchAllContactsResult)((aq)b.b()).a(c, obj);
            obj = fetchallcontactsresult.a();
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Inserting contacts: ").append(obj).toString());
            n.a(((em) (obj)), o1);
            s1 = fetchallcontactsresult.b();
            com.facebook.debug.log.b.c(a, (new StringBuilder()).append("Got ").append(((em) (obj)).size()).append(" contacts in batch").toString());
            j1 = i1 + ((em) (obj)).size();
            p.a("com.facebook.orca.ACTION_FRIEND_SYNC_PROGRESS");
            e1.a();
            com.facebook.debug.d.e.a(a);
            o1 = o.INSERT;
            obj = "download_contacts_full_next";
            i1 = j1;
        } while (fetchallcontactsresult.c());
        com.facebook.debug.log.b.c(a, (new StringBuilder()).append("Got ").append(j1).append(" contacts.").toString());
        return fetchallcontactsresult.d();
    }

    private OperationResult d()
    {
        ((aq)b.b()).a(f, null);
        o.c();
        k.d();
        return OperationResult.b();
    }

    private OperationResult d(ad ad1)
    {
        ad1 = (CreateContactClaimParams)ad1.b().getParcelable("createContactClaimParams");
        String s1 = (String)((aq)b.b()).a(h, ad1);
        b(new UserKey(n.FACEBOOK_CONTACT, ad1.a()));
        return OperationResult.a(s1);
    }

    private OperationResult e(ad ad1)
    {
        ad1 = (DeleteContactClaimParams)ad1.b().getParcelable("deleteContactClaimParams");
        ((aq)b.b()).a(i, ad1);
        return b(new UserKey(n.FACEBOOK_CONTACT, ad1.c()));
    }

    private OperationResult f(ad ad1)
    {
        ad1 = (BlockContactParams)ad1.b().getParcelable("blockContactParams");
        ((aq)b.b()).a(g, ad1);
        return OperationResult.b();
    }

    public OperationResult a(ad ad1)
    {
        OperationType operationtype = ad1.a();
        if (com.facebook.contacts.server.d.d.equals(operationtype))
        {
            return b(ad1);
        }
        if (com.facebook.contacts.server.d.a.equals(operationtype))
        {
            return a();
        }
        if (com.facebook.contacts.server.d.b.equals(operationtype))
        {
            return d(ad1);
        }
        if (com.facebook.contacts.server.d.c.equals(operationtype))
        {
            return e(ad1);
        }
        if (com.facebook.contacts.server.d.e.equals(operationtype))
        {
            return f(ad1);
        }
        if (com.facebook.contacts.server.d.f.equals(operationtype))
        {
            return d();
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown operation type: ").append(operationtype).toString());
        }
    }

}
