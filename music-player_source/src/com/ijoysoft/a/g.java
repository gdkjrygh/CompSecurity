// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.a;

import android.widget.LinearLayout;
import com.google.android.gms.ads.a;

// Referenced classes of package com.ijoysoft.a:
//            a

final class g extends a
{

    final com.ijoysoft.a.a a;
    private final LinearLayout b;

    g(com.ijoysoft.a.a a1, LinearLayout linearlayout)
    {
        a = a1;
        b = linearlayout;
        super();
    }

    public final void a(int i)
    {
        String s = null;
        i;
        JVM INSTR tableswitch 0 3: default 32
    //                   0 56
    //                   1 62
    //                   2 68
    //                   3 74;
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
        b.setVisibility(0);
    }
}
