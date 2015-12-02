// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero;

import com.facebook.inject.d;
import com.facebook.zero.protocol.a.b;
import com.facebook.zero.rewrite.e;
import com.facebook.zero.ui.p;

// Referenced classes of package com.facebook.zero:
//            c, d

class k extends d
{

    final c a;

    private k(c c)
    {
        a = c;
        super();
    }

    k(c c, com.facebook.zero.d d1)
    {
        this(c);
    }

    public b a()
    {
        return new b((p)a(com/facebook/zero/ui/p), (e)a(com/facebook/zero/rewrite/e));
    }

    public Object b()
    {
        return a();
    }
}
