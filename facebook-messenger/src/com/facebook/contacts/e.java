// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts;

import com.facebook.contacts.annotations.IsMobileAppDataEnabled;
import com.facebook.contacts.data.k;
import com.facebook.contacts.data.m;
import com.facebook.contacts.g.a.a;
import com.facebook.contacts.g.a.f;
import com.facebook.contacts.g.a.g;
import com.facebook.contacts.g.a.h;
import com.facebook.contacts.g.a.j;
import com.facebook.contacts.service.b;
import com.facebook.http.protocol.aq;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.contacts:
//            a, b

class e extends d
{

    final com.facebook.contacts.a a;

    private e(com.facebook.contacts.a a1)
    {
        a = a1;
        super();
    }

    e(com.facebook.contacts.a a1, com.facebook.contacts.b b1)
    {
        this(a1);
    }

    public b a()
    {
        return new b(b(com/facebook/http/protocol/aq), (j)a(com/facebook/contacts/g/a/j), (com.facebook.contacts.g.a.e)a(com/facebook/contacts/g/a/e), (f)a(com/facebook/contacts/g/a/f), (g)a(com/facebook/contacts/g/a/g), (h)a(com/facebook/contacts/g/a/h), (a)a(com/facebook/contacts/g/a/a), (m)a(com/facebook/contacts/data/m), (com.facebook.contacts.a.d)a(com/facebook/contacts/a/d), (com.facebook.contacts.a.e)a(com/facebook/contacts/a/e), (k)a(com/facebook/contacts/data/k), (com.facebook.base.broadcast.a)a(com/facebook/base/broadcast/a), b(java/lang/Boolean, com/facebook/contacts/annotations/IsMobileAppDataEnabled));
    }

    public Object b()
    {
        return a();
    }
}
