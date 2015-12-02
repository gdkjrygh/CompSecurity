// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.data;

import android.content.Context;
import com.facebook.contacts.contactslist.f;
import com.facebook.contacts.e.c;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.contacts.data:
//            d, e

class g extends d
{

    final com.facebook.contacts.data.d a;

    private g(com.facebook.contacts.data.d d1)
    {
        a = d1;
        super();
    }

    g(com.facebook.contacts.data.d d1, e e)
    {
        this(d1);
    }

    public f a()
    {
        return new f((Context)a(android/content/Context), (c)a(com/facebook/contacts/e/c));
    }

    public Object b()
    {
        return a();
    }
}
