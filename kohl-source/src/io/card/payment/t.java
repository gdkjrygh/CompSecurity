// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            k, ao

public final class t
    implements k
{

    private static Map a = new HashMap();

    public t()
    {
        a.put(ao.a, "Thees eppleeceshun is nut oothureezed fur cerd scunneeng.");
        a.put(ao.b, "Cuncel");
        a.put(ao.c, "Emereecun Ixpress");
        a.put(ao.d, "Deescufer");
        a.put(ao.e, "JCB");
        a.put(ao.f, "MesterCerd");
        a.put(ao.g, "Feesa");
        a.put(ao.h, "B\366rk B\366rk B\366rk!");
        a.put(ao.i, "CFF");
        a.put(ao.j, "Pustel Cude");
        a.put(ao.k, "Expures");
        a.put(ao.l, "Noomber");
        a.put(ao.m, "Cerd");
        a.put(ao.n, "MM/YY");
        a.put(ao.o, "OK");
        a.put(ao.p, "Huld cerd here-a.\nIt veell scun ootumeteecelly.");
        a.put(ao.q, "Keybuerd\u2026");
        a.put(ao.r, "Cerd Noomber");
        a.put(ao.s, "Cerd Deteeels");
        a.put(ao.t, "Vhuups!");
        a.put(ao.u, "Thees defeece-a cunnut use-a zee cemera tu reed cerd noombers.");
        a.put(ao.v, "Device camera is unavailable.");
        a.put(ao.w, "Zee defeece-a hed un unexpected irrur oopeneeng zee cemera.");
    }

    public final String a()
    {
        return "en_SV";
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
