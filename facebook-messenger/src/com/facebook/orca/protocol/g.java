// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol;

import com.facebook.auth.protocol.e;
import com.facebook.config.a.c;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.orca.protocol:
//            d, e

class g extends d
{

    final com.facebook.orca.protocol.d a;

    private g(com.facebook.orca.protocol.d d1)
    {
        a = d1;
        super();
    }

    g(com.facebook.orca.protocol.d d1, com.facebook.orca.protocol.e e1)
    {
        this(d1);
    }

    public e a()
    {
        return new e((c)a(com/facebook/config/a/c));
    }

    public Object b()
    {
        return a();
    }
}
