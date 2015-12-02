// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.protocol;

import com.facebook.http.b.ap;
import com.facebook.http.c.i;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.inject.a;

// Referenced classes of package com.facebook.http.protocol:
//            am, ap, s, q, 
//            j

public class an
    implements am
{

    private static final Class a = com/facebook/http/protocol/an;
    private final a b;
    private final i c;
    private final i d;
    private final ap e;
    private final a f;
    private final a g;
    private final a h;
    private final a i;
    private final a j;
    private final JsonFactory k;
    private final ObjectMapper l;
    private final s m;
    private final q n;

    public an(a a1, i i1, i j1, ap ap1, a a2, a a3, a a4, 
            a a5, a a6, JsonFactory jsonfactory, ObjectMapper objectmapper, s s, q q)
    {
        b = a1;
        c = i1;
        d = j1;
        e = ap1;
        f = a2;
        g = a3;
        h = a4;
        i = a5;
        j = a6;
        k = jsonfactory;
        l = objectmapper;
        m = s;
        n = q;
    }

    static q a(an an1)
    {
        return an1.n;
    }

    static Class b()
    {
        return a;
    }

    static a b(an an1)
    {
        return an1.h;
    }

    static a c(an an1)
    {
        return an1.f;
    }

    static a d(an an1)
    {
        return an1.i;
    }

    static a e(an an1)
    {
        return an1.j;
    }

    static a f(an an1)
    {
        return an1.g;
    }

    static i g(an an1)
    {
        return an1.c;
    }

    static i h(an an1)
    {
        return an1.d;
    }

    static a i(an an1)
    {
        return an1.b;
    }

    static ap j(an an1)
    {
        return an1.e;
    }

    static s k(an an1)
    {
        return an1.m;
    }

    static JsonFactory l(an an1)
    {
        return an1.k;
    }

    static ObjectMapper m(an an1)
    {
        return an1.l;
    }

    public j a()
    {
        return new com.facebook.http.protocol.ap(this, null);
    }

}
