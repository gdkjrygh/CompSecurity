// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.a;

import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.a;

// Referenced classes of package com.ijoysoft.a:
//            a

final class b extends a
{

    final com.ijoysoft.a.a a;
    private final AdView b;

    b(com.ijoysoft.a.a a1, AdView adview)
    {
        a = a1;
        b = adview;
        super();
    }

    public final void a(int i)
    {
        String s;
        super.a(i);
        s = null;
        i;
        JVM INSTR tableswitch 0 3: default 40
    //                   0 64
    //                   1 70
    //                   2 76
    //                   3 82;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        com.ijoysoft.a.a.a(a, (new StringBuilder("loadBannerAD:onAdFailedToLoad:")).append(s).toString());
        return;
_L2:
        s = "CODE_INTERNAL_ERROR";
        continue; /* Loop/switch isn't completed */
_L3:
        s = "CODE_INVALID_REQUEST";
        continue; /* Loop/switch isn't completed */
_L4:
        s = "CODE_NETWORK_ERROR";
        continue; /* Loop/switch isn't completed */
_L5:
        s = "CODE_NO_FILL";
        if (true) goto _L1; else goto _L6
_L6:
    }

    public final void c()
    {
        com.ijoysoft.a.a.a(a, b);
    }
}
