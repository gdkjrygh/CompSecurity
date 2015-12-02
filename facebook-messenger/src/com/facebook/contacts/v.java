// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts;

import android.content.ContentResolver;
import com.facebook.contacts.data.x;
import com.facebook.contacts.database.g;
import com.facebook.contacts.e.a;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.contacts:
//            a, b

class v extends d
{

    final com.facebook.contacts.a a;

    private v(com.facebook.contacts.a a1)
    {
        a = a1;
        super();
    }

    v(com.facebook.contacts.a a1, b b1)
    {
        this(a1);
    }

    public a a()
    {
        return new a((g)a(com/facebook/contacts/database/g), (ContentResolver)a(android/content/ContentResolver), (x)a(com/facebook/contacts/data/x));
    }

    public Object b()
    {
        return a();
    }
}
