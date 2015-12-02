// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts;

import com.facebook.contacts.annotations.ForContactSummary;
import com.facebook.contacts.c.a;
import com.facebook.contacts.g.j;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.contacts:
//            a, b

class aj extends d
{

    final com.facebook.contacts.a a;

    private aj(com.facebook.contacts.a a1)
    {
        a = a1;
        super();
    }

    aj(com.facebook.contacts.a a1, b b1)
    {
        this(a1);
    }

    public j a()
    {
        return new j((com.facebook.contacts.c.d)a(com/facebook/contacts/c/d, com/facebook/contacts/annotations/ForContactSummary), (a)a(com/facebook/contacts/c/a));
    }

    public Object b()
    {
        return a();
    }
}
