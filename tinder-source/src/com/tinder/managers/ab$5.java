// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.tinder.e.l;
import com.tinder.enums.RateType;

// Referenced classes of package com.tinder.managers:
//            ab

final class b
    implements com.android.volley.
{

    final l a;
    final String b;
    final ab c;

    public final void a(VolleyError volleyerror)
    {
        if (volleyerror == null)
        {
            return;
        }
        (new StringBuilder("Like on ")).append(b).append(" FAILED ").append(volleyerror.getMessage());
        if (volleyerror.a == null) goto _L2; else goto _L1
_L1:
        volleyerror.a.a;
        JVM INSTR tableswitch 401 403: default 76
    //                   401 91
    //                   402 76
    //                   403 103;
           goto _L2 _L3 _L2 _L4
_L2:
        ab.a(c, b, RateType.LIKE);
        return;
_L3:
        a.d();
        continue; /* Loop/switch isn't completed */
_L4:
        a.c();
        if (true) goto _L2; else goto _L5
_L5:
    }

    Error(ab ab1, l l1, String s)
    {
        c = ab1;
        a = l1;
        b = s;
        super();
    }
}
