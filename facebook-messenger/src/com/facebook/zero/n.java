// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero;

import com.facebook.inject.d;
import com.facebook.zero.rewrite.c;
import com.facebook.zero.rewrite.f;

// Referenced classes of package com.facebook.zero:
//            c, d

class n extends d
{

    final com.facebook.zero.c a;

    private n(com.facebook.zero.c c1)
    {
        a = c1;
        super();
    }

    n(com.facebook.zero.c c1, com.facebook.zero.d d1)
    {
        this(c1);
    }

    public c a()
    {
        return new c((f)a(com/facebook/zero/rewrite/f));
    }

    public Object b()
    {
        return a();
    }
}
