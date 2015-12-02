// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts;

import com.facebook.contacts.annotations.IsContactEventsUploadPermitted;
import com.facebook.contacts.b.a;
import com.facebook.contacts.data.m;
import com.facebook.contacts.e.e;
import com.facebook.contacts.g.i;
import com.facebook.contacts.g.k;
import com.facebook.contacts.upload.f;
import com.facebook.http.protocol.aq;
import com.facebook.inject.d;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

// Referenced classes of package com.facebook.contacts:
//            a, b

class u extends d
{

    final com.facebook.contacts.a a;

    private u(com.facebook.contacts.a a1)
    {
        a = a1;
        super();
    }

    u(com.facebook.contacts.a a1, b b1)
    {
        this(a1);
    }

    public f a()
    {
        return new f(b(com/facebook/contacts/e/e), b(com/facebook/http/protocol/aq), (k)a(com/facebook/contacts/g/k), (i)a(com/facebook/contacts/g/i), (m)a(com/facebook/contacts/data/m), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (com.facebook.contacts.data.k)a(com/facebook/contacts/data/k), (PhoneNumberUtil)a(com/facebook/phonenumbers/PhoneNumberUtil), (a)a(com/facebook/contacts/b/a), b(java/lang/Boolean, com/facebook/contacts/annotations/IsContactEventsUploadPermitted), (ObjectMapper)a(com/fasterxml/jackson/databind/ObjectMapper));
    }

    public Object b()
    {
        return a();
    }
}
