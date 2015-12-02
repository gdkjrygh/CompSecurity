// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts;

import android.content.ContentResolver;
import com.facebook.contacts.data.a;
import com.facebook.contacts.data.x;
import com.facebook.contacts.e.c;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.contacts:
//            a, b

class w extends d
{

    final com.facebook.contacts.a a;

    private w(com.facebook.contacts.a a1)
    {
        a = a1;
        super();
    }

    w(com.facebook.contacts.a a1, b b1)
    {
        this(a1);
    }

    public c a()
    {
        return new c((ContentResolver)a(android/content/ContentResolver), (a)a(com/facebook/contacts/data/a), (x)a(com/facebook/contacts/data/x));
    }

    public Object b()
    {
        return a();
    }
}
