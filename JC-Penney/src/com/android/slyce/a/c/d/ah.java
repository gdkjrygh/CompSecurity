// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;

import com.android.slyce.a.a.e;
import com.android.slyce.a.aj;
import com.android.slyce.a.am;
import java.io.IOException;
import java.net.ProtocolException;
import java.nio.ByteOrder;

// Referenced classes of package com.android.slyce.a.c.d:
//            ad, j

class ah
    implements e
{

    final ad a;

    ah(ad ad1)
    {
        a = ad1;
        super();
    }

    public void a(am am, aj aj1)
    {
        int k;
        aj1.a(ByteOrder.BIG_ENDIAN);
        int i = (a.a & 0x7fff0000) >>> 16;
        k = a.a;
        if (i != 3)
        {
            try
            {
                throw new ProtocolException((new StringBuilder()).append("version != 3: ").append(i).toString());
            }
            // Misplaced declaration of an exception variable
            catch (am am)
            {
                com.android.slyce.a.c.d.ad.e(a).a(am);
            }
            return;
        }
        k & 0xffff;
        JVM INSTR tableswitch 1 9: default 132
    //                   1 144
    //                   2 169
    //                   3 194
    //                   4 219
    //                   5 132
    //                   6 244
    //                   7 269
    //                   8 294
    //                   9 319;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_319;
_L1:
        aj1.m();
_L10:
        ad.f(a);
        return;
_L2:
        ad.a(a, aj1, a.c, a.d);
          goto _L10
_L3:
        ad.b(a, aj1, a.c, a.d);
          goto _L10
_L4:
        ad.c(a, aj1, a.c, a.d);
          goto _L10
_L5:
        ad.d(a, aj1, a.c, a.d);
          goto _L10
_L6:
        com.android.slyce.a.c.d.ad.e(a, aj1, a.c, a.d);
          goto _L10
_L7:
        ad.f(a, aj1, a.c, a.d);
          goto _L10
_L8:
        ad.g(a, aj1, a.c, a.d);
          goto _L10
        ad.h(a, aj1, a.c, a.d);
          goto _L10
    }
}
