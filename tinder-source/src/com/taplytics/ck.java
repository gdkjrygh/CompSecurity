// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            he, gs, bd, ci, 
//            ch, j, gt, gw

public final class ck
    implements he
{

    final String a;
    final ci b;

    public ck(ci ci1, String s)
    {
        b = ci1;
        a = s;
        super();
    }

    public final void a(bd bd1, Exception exception)
    {
        if (exception == null) goto _L2; else goto _L1
_L1:
        gs.b("Reading TLProperties from disk", exception);
_L4:
        return;
_L2:
        if (bd1 == null) goto _L4; else goto _L3
_L3:
        exception = bd1.c;
        if (exception == null) goto _L6; else goto _L5
_L5:
        if (ci.a(b, ci.a(b))) goto _L4; else goto _L7
_L7:
        ch.a().a(ci.a(b));
        if (!exception.has("token")) goto _L6; else goto _L8
_L8:
        exception = exception.getString("token");
        if (exception == null) goto _L10; else goto _L9
_L9:
        if (!a.equals(exception)) goto _L11; else goto _L10
_L10:
        ci.b(b, bd1);
        b.b(false);
        ci.b(b);
        ci.a(b, ci.a(b).b);
_L6:
        ci.c(b).c();
        return;
_L11:
        try
        {
            bd1 = gt.a();
            if (gs.b())
            {
                gs.a("Delete TLProperties File from disk");
            }
            gt.a("TLProperties.json", new gw(bd1));
        }
        // Misplaced declaration of an exception variable
        catch (bd bd1)
        {
            gs.b("Getting token from disk TLProperties", bd1);
        }
        if (true) goto _L6; else goto _L12
_L12:
    }
}
