// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts;

import com.facebook.common.hardware.PhoneIsoCountryCode;
import com.facebook.contacts.d.a;
import com.facebook.contacts.data.k;
import com.facebook.contacts.e.e;
import com.facebook.http.protocol.aq;
import com.facebook.inject.d;
import com.fasterxml.jackson.databind.ObjectMapper;

// Referenced classes of package com.facebook.contacts:
//            a, b

class r extends d
{

    final com.facebook.contacts.a a;

    private r(com.facebook.contacts.a a1)
    {
        a = a1;
        super();
    }

    r(com.facebook.contacts.a a1, b b1)
    {
        this(a1);
    }

    public a a()
    {
        return new a(b(com/facebook/contacts/e/e), b(com/facebook/http/protocol/aq), b(java/lang/String, com/facebook/common/hardware/PhoneIsoCountryCode), (k)a(com/facebook/contacts/data/k), (com.facebook.contacts.g.a.k)a(com/facebook/contacts/g/a/k), (ObjectMapper)a(com/fasterxml/jackson/databind/ObjectMapper));
    }

    public Object b()
    {
        return a();
    }
}
