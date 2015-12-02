// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts;

import com.facebook.contacts.data.b;
import com.facebook.contacts.data.n;
import com.facebook.inject.d;
import com.facebook.user.a.l;

// Referenced classes of package com.facebook.contacts:
//            a, b

class z extends d
{

    final a a;

    private z(a a1)
    {
        a = a1;
        super();
    }

    z(a a1, com.facebook.contacts.b b1)
    {
        this(a1);
    }

    public n a()
    {
        return new n((b)a(com/facebook/contacts/data/b), (l)a(com/facebook/user/a/l), (com.facebook.user.a.n)a(com/facebook/user/a/n));
    }

    public Object b()
    {
        return a();
    }
}
