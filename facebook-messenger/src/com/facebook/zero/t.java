// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero;

import com.facebook.http.protocol.aq;
import com.facebook.inject.d;
import com.facebook.zero.protocol.a.a;
import com.facebook.zero.protocol.a.b;
import com.facebook.zero.protocol.c;
import com.facebook.zero.rewrite.e;
import com.facebook.zero.ui.h;
import com.facebook.zero.ui.p;

// Referenced classes of package com.facebook.zero:
//            c, d

class t extends d
{

    final com.facebook.zero.c a;

    private t(com.facebook.zero.c c1)
    {
        a = c1;
        super();
    }

    t(com.facebook.zero.c c1, com.facebook.zero.d d1)
    {
        this(c1);
    }

    public c a()
    {
        return new c((aq)a(com/facebook/http/protocol/aq), (com.facebook.zero.b.d)a(com/facebook/zero/b/d), (h)a(com/facebook/zero/ui/h), (p)a(com/facebook/zero/ui/p), (e)a(com/facebook/zero/rewrite/e), (b)a(com/facebook/zero/protocol/a/b), (a)a(com/facebook/zero/protocol/a/a));
    }

    public Object b()
    {
        return a();
    }
}
