// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts;

import com.facebook.contacts.annotations.ForContactSummary;
import com.facebook.contacts.c.a;
import com.facebook.contacts.c.b;
import com.facebook.contacts.g.h;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.contacts:
//            a, b

class ah extends d
{

    final com.facebook.contacts.a a;

    private ah(com.facebook.contacts.a a1)
    {
        a = a1;
        super();
    }

    ah(com.facebook.contacts.a a1, com.facebook.contacts.b b1)
    {
        this(a1);
    }

    public h a()
    {
        return new h((a)a(com/facebook/contacts/c/a), (b)a(com/facebook/contacts/c/b, com/facebook/contacts/annotations/ForContactSummary));
    }

    public Object b()
    {
        return a();
    }
}
