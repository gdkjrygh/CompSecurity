// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;

import com.nuance.dragon.toolkit.b.b;
import com.nuance.dragon.toolkit.b.c;
import com.nuance.dragon.toolkit.b.e;
import com.nuance.dragon.toolkit.d.a;
import org.json.JSONObject;

// Referenced classes of package com.nuance.dragon.toolkit.a:
//            x

public final class ao
    implements a
{

    private e a;
    private String b;
    private String c;
    private final String d;

    ao(x x1, com.nuance.a.a.a.c.a.c.a a1)
    {
        a = com.nuance.dragon.toolkit.b.a.a.a(a1);
        a1 = a;
        if (a1 == null) goto _L2; else goto _L1
_L1:
        a1 = a1.c("result_type");
        if (a1 == null || a1.a() != 193) goto _L2; else goto _L3
_L3:
        a1 = ((b)a1).a;
_L4:
        b = a1;
        a1 = a;
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        a1 = a1.c("result_format");
        if (a1 == null || a1.a() != 193)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        a1 = ((b)a1).a;
_L5:
        c = a1;
        d = x1.l();
        return;
_L2:
        a1 = "no_result_type";
          goto _L4
        a1 = "no_result_format";
          goto _L5
    }

    public final String a()
    {
        return d;
    }

    public final String b()
    {
        return b;
    }

    public final JSONObject c()
    {
        com.nuance.dragon.toolkit.d.a.a a1 = new com.nuance.dragon.toolkit.d.a.a();
        if (a != null)
        {
            a1.a("res", a.c());
        }
        a1.a("session", d);
        return a1;
    }

    public final e d()
    {
        return a;
    }

    public final boolean e()
    {
        com.nuance.dragon.toolkit.b.a a2 = a.c("final_response");
        com.nuance.dragon.toolkit.b.a a1 = a2;
        if (a2 == null)
        {
            e e1 = a.f("appserver_results");
            a1 = a2;
            if (e1 != null)
            {
                a1 = e1.c("final_response");
            }
        }
        if (a1 != null && (a1 instanceof c))
        {
            return ((c)a1).a == 1;
        } else
        {
            return true;
        }
    }
}
