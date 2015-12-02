// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.data;

import android.content.Context;
import com.facebook.contacts.contactslist.e;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.contacts.data:
//            d, e

class f extends d
{

    final com.facebook.contacts.data.d a;

    private f(com.facebook.contacts.data.d d1)
    {
        a = d1;
        super();
    }

    f(com.facebook.contacts.data.d d1, com.facebook.contacts.data.e e1)
    {
        this(d1);
    }

    public e a()
    {
        return new e((Context)e().a(android/content/Context));
    }

    public Object b()
    {
        return a();
    }
}
