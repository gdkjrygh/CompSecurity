// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            k, ao

public final class z
    implements k
{

    private static Map a = new HashMap();

    public z()
    {
        a.put(ao.a, "\u3053\u306E\u30A2\u30D7\u30EA\u3067\u306F\u30AB\u30FC\u30C9\u30B9\u30AD\u30E3\u30F3\u306E\u4F7F\u7528\u304C\u8A31\u53EF\u3055\u308C\u3066\u3044\u307E\u305B\u3093\u3002");
        a.put(ao.b, "\u30AD\u30E3\u30F3\u30BB\u30EB");
        a.put(ao.c, "American Express");
        a.put(ao.d, "Discover");
        a.put(ao.e, "JCB");
        a.put(ao.f, "MasterCard");
        a.put(ao.g, "Visa");
        a.put(ao.h, "\u5B8C\u4E86");
        a.put(ao.i, "CVV");
        a.put(ao.j, "\u90F5\u4FBF\u756A\u53F7");
        a.put(ao.k, "\u6709\u52B9\u671F\u9650");
        a.put(ao.l, "\u756A\u53F7");
        a.put(ao.m, "\u30AB\u30FC\u30C9");
        a.put(ao.n, "MM/YY");
        a.put(ao.o, "OK");
        a.put(ao.p, "\u3053\u3053\u3067\u30AB\u30FC\u30C9\u3092\u304A\u6301\u3061\u304F\u3060\u3055\u3044\u3002\n\u81EA\u52D5\u7684\u306B\u30B9\u30AD\u30E3\u30F3\u3055\u308C\u307E\u3059\u3002");
        a.put(ao.q, "\u30AD\u30FC\u30DC\u30FC\u30C9\u2026");
        a.put(ao.r, "\u30AB\u30FC\u30C9\u756A\u53F7");
        a.put(ao.s, "\u30AB\u30FC\u30C9\u306E\u8A73\u7D30");
        a.put(ao.t, "\u7533\u3057\u8A33\u3042\u308A\u307E\u305B\u3093\u3002");
        a.put(ao.u, "\u3053\u306E\u7AEF\u672B\u3067\u306F\u30AB\u30FC\u30C9\u756A\u53F7\u306E\u8AAD\u8FBC\u306B\u30AB\u30E1\u30E9\u3092\u4F7F\u3048\u307E\u305B\u3093\u3002");
        a.put(ao.v, "\u7AEF\u672B\u306E\u30AB\u30E1\u30E9\u3092\u4F7F\u7528\u3067\u304D\u307E\u305B\u3093\u3002");
        a.put(ao.w, "\u30AB\u30E1\u30E9\u3092\u8D77\u52D5\u4E2D\u306B\u4E88\u671F\u3057\u306A\u3044\u30A8\u30E9\u30FC\u304C\u767A\u751F\u3057\u307E\u3057\u305F\u3002");
    }

    public final String a()
    {
        return "ja";
    }

    public final String a(Enum enum)
    {
        enum = (ao)enum;
        return (String)a.get(enum);
    }

    static 
    {
        new HashMap();
    }
}
