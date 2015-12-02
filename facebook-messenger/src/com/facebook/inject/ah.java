// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import com.google.common.a.kl;
import com.google.inject.a;
import com.google.inject.a.g;
import com.google.inject.f;
import java.lang.reflect.Type;
import java.util.Set;

// Referenced classes of package com.facebook.inject:
//            ai, t

public class ah
{

    private final t a;
    private final a b;
    private final Set c = kl.b();

    public ah(t t, a a1)
    {
        a = t;
        b = a1;
    }

    static Set a(ah ah1)
    {
        return ah1.c;
    }

    static t b(ah ah1)
    {
        return ah1.a;
    }

    javax.inject.a a()
    {
        return new ai(this);
    }

    public void a(a a1)
    {
        c.add(a1);
    }

    a b()
    {
        g g1 = new g(null, java/util/Set, new Type[] {
            b.a().b()
        });
        if (b.c() != null)
        {
            return com.google.inject.a.a(g1, b.c());
        }
        if (b.b() != null)
        {
            return com.google.inject.a.a(g1, b.b());
        } else
        {
            return com.google.inject.a.a(g1);
        }
    }
}
