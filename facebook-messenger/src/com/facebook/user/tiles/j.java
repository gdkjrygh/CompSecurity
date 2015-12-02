// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user.tiles;

import com.facebook.http.c.i;
import com.facebook.inject.d;
import com.facebook.user.p;

// Referenced classes of package com.facebook.user.tiles:
//            c, g, h

class j extends d
{

    final g a;

    private j(g g)
    {
        a = g;
        super();
    }

    j(g g, h h)
    {
        this(g);
    }

    public c a()
    {
        return new c(b(com/facebook/user/p), b(com/facebook/http/c/i));
    }

    public Object b()
    {
        return a();
    }
}
