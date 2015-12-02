// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.d;

import com.facebook.auth.protocol.h;
import com.facebook.auth.protocol.j;
import com.facebook.common.time.a;
import com.facebook.inject.d;
import com.facebook.user.ac;

// Referenced classes of package com.facebook.auth.d:
//            b, c

class g extends d
{

    final b a;

    private g(b b1)
    {
        a = b1;
        super();
    }

    g(b b1, c c)
    {
        this(b1);
    }

    public h a()
    {
        return new h((j)a(com/facebook/auth/protocol/j), (ac)a(com/facebook/user/ac), (a)a(com/facebook/common/time/a));
    }

    public Object b()
    {
        return a();
    }
}
