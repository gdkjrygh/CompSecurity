// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts;

import com.facebook.contacts.data.k;
import com.facebook.contacts.data.l;
import com.facebook.contacts.data.m;
import com.facebook.contacts.database.AddressBookPeriodicRunner;
import com.facebook.contacts.g.a;
import com.facebook.contacts.g.b;
import com.facebook.contacts.g.e;
import com.facebook.contacts.g.f;
import com.facebook.contacts.g.h;
import com.facebook.contacts.g.j;
import com.facebook.contacts.service.c;
import com.facebook.http.protocol.aq;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.contacts:
//            a, b

class s extends d
{

    final com.facebook.contacts.a a;

    private s(com.facebook.contacts.a a1)
    {
        a = a1;
        super();
    }

    s(com.facebook.contacts.a a1, com.facebook.contacts.b b1)
    {
        this(a1);
    }

    public c a()
    {
        return new c(b(com/facebook/http/protocol/aq), (f)a(com/facebook/contacts/g/f), (j)a(com/facebook/contacts/g/j), (h)a(com/facebook/contacts/g/h), (b)a(com/facebook/contacts/g/b), (a)a(com/facebook/contacts/g/a), (com.facebook.contacts.g.d)a(com/facebook/contacts/g/d), (e)a(com/facebook/contacts/g/e), (AddressBookPeriodicRunner)a(com/facebook/contacts/database/AddressBookPeriodicRunner), (com.facebook.contacts.service.a)a(com/facebook/contacts/service/a), (com.facebook.contacts.a.b)a(com/facebook/contacts/a/b), (l)a(com/facebook/contacts/data/l), (m)a(com/facebook/contacts/data/m), (com.facebook.contacts.data.b)a(com/facebook/contacts/data/b), (com.facebook.base.broadcast.a)a(com/facebook/base/broadcast/a), (k)a(com/facebook/contacts/data/k), (com.facebook.common.time.a)a(com/facebook/common/time/a), (com.facebook.analytics.a)a(com/facebook/analytics/a));
    }

    public Object b()
    {
        return a();
    }
}
