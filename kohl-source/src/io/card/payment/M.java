// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            k, ao

public final class M
    implements k
{

    private static Map a = new HashMap();

    public M()
    {
        a.put(ao.a, "\u6B64\u61C9\u7528\u7A0B\u5F0F\u6C92\u6709\u6383\u63CF\u4FE1\u7528\u5361\u7684\u6388\u6B0A\u3002");
        a.put(ao.b, "\u53D6\u6D88");
        a.put(ao.c, "\u7F8E\u570B\u904B\u901A");
        a.put(ao.d, "Discover");
        a.put(ao.e, "JCB");
        a.put(ao.f, "MasterCard");
        a.put(ao.g, "Visa");
        a.put(ao.h, "\u5B8C\u6210");
        a.put(ao.i, "CVV");
        a.put(ao.j, "\u90F5\u905E\u5340\u865F");
        a.put(ao.k, "\u5230\u671F");
        a.put(ao.l, "\u865F\u78BC");
        a.put(ao.m, "\u4FE1\u7528\u5361");
        a.put(ao.n, "\u6708\uFF0F\u5E74");
        a.put(ao.o, "\u78BA\u5B9A");
        a.put(ao.p, "\u5C07\u4FE1\u7528\u5361\u7F6E\u65BC\u6B64\u8655\u3002\n\u88DD\u7F6E\u6703\u81EA\u52D5\u6383\u63CF\u3002");
        a.put(ao.q, "\u9375\u76E4\u2026");
        a.put(ao.r, "\u5361\u865F");
        a.put(ao.s, "\u4FE1\u7528\u5361\u8A73\u7D30\u8CC7\u6599");
        a.put(ao.t, "\u62B1\u6B49\uFF01");
        a.put(ao.u, "\u6B64\u88DD\u7F6E\u7121\u6CD5\u4F7F\u7528\u76F8\u6A5F\u8B80\u53D6\u4FE1\u7528\u5361\u5361\u865F\u3002");
        a.put(ao.v, "\u7121\u6CD5\u4F7F\u7528\u88DD\u7F6E\u7684\u76F8\u6A5F\u3002");
        a.put(ao.w, "\u6B64\u88DD\u7F6E\u555F\u52D5\u76F8\u6A5F\u6642\u767C\u751F\u610F\u5916\u932F\u8AA4\u3002");
    }

    public final String a()
    {
        return "zh-Hant_HK";
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
