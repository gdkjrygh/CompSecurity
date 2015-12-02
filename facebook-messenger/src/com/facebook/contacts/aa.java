// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts;

import com.facebook.common.v.f;
import com.facebook.contacts.data.a;
import com.facebook.contacts.data.b;
import com.facebook.contacts.data.k;
import com.facebook.contacts.data.m;
import com.facebook.contacts.data.n;
import com.facebook.inject.d;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.facebook.user.a.l;
import com.facebook.user.ac;

// Referenced classes of package com.facebook.contacts:
//            a, b

class aa extends d
{

    final com.facebook.contacts.a a;

    private aa(com.facebook.contacts.a a1)
    {
        a = a1;
        super();
    }

    aa(com.facebook.contacts.a a1, com.facebook.contacts.b b1)
    {
        this(a1);
    }

    public m a()
    {
        return new m((b)a(com/facebook/contacts/data/b), (a)a(com/facebook/contacts/data/a), (ac)a(com/facebook/user/ac), b(com/facebook/contacts/data/n), (l)a(com/facebook/user/a/l), (com.facebook.user.a.n)a(com/facebook/user/a/n), (k)a(com/facebook/contacts/data/k), (PhoneNumberUtil)a(com/facebook/phonenumbers/PhoneNumberUtil), (com.facebook.contacts.data.a.b)a(com/facebook/contacts/data/a/b), (com.facebook.common.time.a)a(com/facebook/common/time/a), (f)a(com/facebook/common/v/f));
    }

    public Object b()
    {
        return a();
    }
}
