// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import com.facebook.auth.protocol.e;
import com.facebook.config.a.c;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.auth.login:
//            ap, aq

class av extends d
{

    final ap a;

    private av(ap ap)
    {
        a = ap;
        super();
    }

    av(ap ap, aq aq)
    {
        this(ap);
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
