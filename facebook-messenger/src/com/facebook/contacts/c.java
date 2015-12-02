// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts;

import android.content.ContentResolver;
import com.facebook.contacts.service.a;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.contacts:
//            a, b

class c extends d
{

    final com.facebook.contacts.a a;

    private c(com.facebook.contacts.a a1)
    {
        a = a1;
        super();
    }

    c(com.facebook.contacts.a a1, b b1)
    {
        this(a1);
    }

    public a a()
    {
        return new a((ContentResolver)e().a(android/content/ContentResolver), (com.facebook.contacts.data.a)a(com/facebook/contacts/data/a));
    }

    public Object b()
    {
        return a();
    }
}
