// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts;

import com.facebook.contacts.a.c;
import com.facebook.contacts.data.b;
import com.facebook.contacts.data.l;
import com.facebook.inject.d;
import com.facebook.user.ac;
import com.fasterxml.jackson.databind.ObjectMapper;

// Referenced classes of package com.facebook.contacts:
//            a, b

class y extends d
{

    final a a;

    private y(a a1)
    {
        a = a1;
        super();
    }

    y(a a1, com.facebook.contacts.b b1)
    {
        this(a1);
    }

    public l a()
    {
        return new l((b)a(com/facebook/contacts/data/b), (ObjectMapper)a(com/fasterxml/jackson/databind/ObjectMapper), (ac)a(com/facebook/user/ac), (c)a(com/facebook/contacts/a/c));
    }

    public Object b()
    {
        return a();
    }
}
