// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts;

import com.facebook.contacts.annotations.ForContactSummary;
import com.facebook.contacts.c.b;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.contacts:
//            a, b

class al extends d
{

    final a a;

    private al(a a1)
    {
        a = a1;
        super();
    }

    al(a a1, com.facebook.contacts.b b1)
    {
        this(a1);
    }

    public com.facebook.contacts.c.d a()
    {
        return new com.facebook.contacts.c.d((b)a(com/facebook/contacts/c/b, com/facebook/contacts/annotations/ForContactSummary), c(com/facebook/contacts/models/a/b));
    }

    public Object b()
    {
        return a();
    }
}
