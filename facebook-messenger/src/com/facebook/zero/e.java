// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero;

import com.facebook.inject.d;
import com.facebook.zero.protocol.c;

// Referenced classes of package com.facebook.zero:
//            c, d

class e extends d
{

    final com.facebook.zero.c a;

    private e(com.facebook.zero.c c1)
    {
        a = c1;
        super();
    }

    e(com.facebook.zero.c c1, com.facebook.zero.d d1)
    {
        this(c1);
    }

    public com.facebook.fbservice.service.e a()
    {
        return (com.facebook.fbservice.service.e)a(com/facebook/zero/protocol/c);
    }

    public Object b()
    {
        return a();
    }
}
