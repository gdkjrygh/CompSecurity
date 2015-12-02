// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero;

import com.facebook.auth.a.c;
import com.facebook.config.background.k;
import com.facebook.http.protocol.v;
import com.facebook.zero.b.d;
import com.facebook.zero.protocol.a.b;
import com.facebook.zero.rewrite.e;
import com.facebook.zero.ui.p;

// Referenced classes of package com.facebook.zero:
//            b

public class a
    implements c, k
{

    private static final Class a = com/facebook/zero/a;
    private final d b;
    private final com.facebook.zero.d.a c;
    private final com.facebook.zero.server.d d;
    private final b e;
    private final p f;
    private final e g;
    private final javax.inject.a h;

    public a(d d1, com.facebook.zero.d.a a1, com.facebook.zero.server.d d2, b b1, p p, e e1, javax.inject.a a2)
    {
        b = d1;
        c = a1;
        d = d2;
        e = b1;
        f = p;
        g = e1;
        h = a2;
    }

    static Class a()
    {
        return a;
    }

    static javax.inject.a a(a a1)
    {
        return a1.h;
    }

    static com.facebook.zero.server.d b(a a1)
    {
        return a1.d;
    }

    static b c(a a1)
    {
        return a1.e;
    }

    static p d(a a1)
    {
        return a1.f;
    }

    static d e(a a1)
    {
        return a1.b;
    }

    static e f(a a1)
    {
        return a1.g;
    }

    static com.facebook.zero.d.a g(a a1)
    {
        return a1.c;
    }

    public v b()
    {
        return new com.facebook.zero.b(this, false);
    }

    public v c()
    {
        if (((Boolean)h.b()).booleanValue())
        {
            return new com.facebook.zero.b(this, true);
        } else
        {
            return null;
        }
    }

}
