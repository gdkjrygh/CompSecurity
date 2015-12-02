// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts;

import com.facebook.common.time.a;
import com.facebook.contacts.g.g;
import com.facebook.contacts.server.w;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.contacts:
//            a, b

class ag extends d
{

    final com.facebook.contacts.a a;

    private ag(com.facebook.contacts.a a1)
    {
        a = a1;
        super();
    }

    ag(com.facebook.contacts.a a1, b b1)
    {
        this(a1);
    }

    public g a()
    {
        return new g((a)a(com/facebook/common/time/a), (w)a(com/facebook/contacts/server/w));
    }

    public Object b()
    {
        return a();
    }
}
