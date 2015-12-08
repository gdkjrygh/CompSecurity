// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.tinder.e.u;
import com.tinder.enums.RateType;
import java.util.Map;

// Referenced classes of package com.tinder.managers:
//            ab

final class b
    implements com.android.volley.
{

    final String a;
    final u b;
    final ab c;

    public final void a(VolleyError volleyerror)
    {
        (new StringBuilder("Pass on ")).append(a).append(" FAILED ").append(volleyerror.getMessage());
        c.c.remove(a);
        if (b == null || volleyerror == null || volleyerror.a == null) goto _L2; else goto _L1
_L1:
        volleyerror.a.a;
        JVM INSTR tableswitch 401 403: default 96
    //                   401 111
    //                   402 96
    //                   403 123;
           goto _L2 _L3 _L2 _L4
_L2:
        ab.a(c, a, RateType.PASS);
        return;
_L3:
        b.d();
        continue; /* Loop/switch isn't completed */
_L4:
        b.c();
        if (true) goto _L2; else goto _L5
_L5:
    }

    rror(ab ab1, String s, u u1)
    {
        c = ab1;
        a = s;
        b = u1;
        super();
    }
}
