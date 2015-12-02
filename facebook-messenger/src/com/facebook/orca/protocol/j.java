// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol;

import com.facebook.contacts.server.w;
import com.facebook.inject.d;
import com.facebook.user.ac;

// Referenced classes of package com.facebook.orca.protocol:
//            d, e

class j extends d
{

    final com.facebook.orca.protocol.d a;

    private j(com.facebook.orca.protocol.d d1)
    {
        a = d1;
        super();
    }

    j(com.facebook.orca.protocol.d d1, e e)
    {
        this(d1);
    }

    public com.facebook.contacts.g.a.d a()
    {
        return new com.facebook.contacts.g.a.d((ac)a(com/facebook/user/ac), (w)a(com/facebook/contacts/server/w));
    }

    public Object b()
    {
        return a();
    }
}
