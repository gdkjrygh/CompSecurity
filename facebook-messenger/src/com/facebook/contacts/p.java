// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts;

import android.content.Context;
import com.facebook.common.executors.a;
import com.facebook.contacts.data.b;
import com.facebook.contacts.data.c;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.contacts:
//            a, b

class p extends d
{

    final com.facebook.contacts.a a;

    private p(com.facebook.contacts.a a1)
    {
        a = a1;
        super();
    }

    p(com.facebook.contacts.a a1, com.facebook.contacts.b b1)
    {
        this(a1);
    }

    public b a()
    {
        return new b((Context)e().a(android/content/Context), (a)a(com/facebook/common/executors/a), (com.facebook.d.b.a)a(com/facebook/d/b/a), (c)a(com/facebook/contacts/data/c));
    }

    public Object b()
    {
        return a();
    }
}
