// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.util.Arrays;

public final class cmh
    implements dcw
{

    private static final cwc a[] = new cwc[0];
    private static final cwa b[] = new cwa[0];

    public cmh()
    {
    }

    private static int a(cwb cwb1, def def1, qlp qlp1)
    {
        if (qlp1 != null)
        {
            int i = qlp1.a.remaining();
            def1.a(cwb1, qlp1);
            return i - qlp1.a.remaining();
        } else
        {
            return def1.a(cwb1);
        }
    }

    private int a(cwb cwb1, qlp qlp1, def def1)
    {
        String s;
        cwc acwc[];
        cwa acwa[];
        b.a(cwb1, "message", null);
        b.a(def1, "serializer", null);
        s = cwb1.a;
        acwc = cwb1.c;
        acwa = cwb1.d;
        int k;
        cwb1.d = b;
        a();
        k = ((acwc.length + 1800) - 1) / 1800;
        int i;
        int j;
        j = 0;
        i = 0;
_L2:
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        cwb1.c = (cwc[])Arrays.copyOfRange(acwc, j * 1800, Math.min((j + 1) * 1800, acwc.length));
        a();
        i += a(cwb1, def1, qlp1);
        cwb1.a = "";
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        cwb1.c = a;
        k = ((acwa.length + 5) - 1) / 5;
        j = 0;
_L4:
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        cwb1.d = (cwa[])Arrays.copyOfRange(acwa, j * 5, Math.min((j + 1) * 5, acwa.length));
        a();
        i += a(cwb1, def1, qlp1);
        cwb1.a = "";
        j++;
        if (true) goto _L4; else goto _L3
_L3:
        a();
        if (!cwb1.a.isEmpty())
        {
            i = a(cwb1, def1, qlp1) + i;
            cwb1.c = a;
            cwb1.d = b;
        }
        cwb1.a = s;
        cwb1.c = acwc;
        cwb1.d = acwa;
        return i;
        qlp1;
        cwb1.a = s;
        cwb1.c = acwc;
        cwb1.d = acwa;
        throw qlp1;
    }

    private static void a()
    {
        if (Thread.currentThread().isInterrupted())
        {
            throw new InterruptedException();
        } else
        {
            return;
        }
    }

    public final volatile int a(qlw qlw, qlp qlp1, def def1)
    {
        return a((cwb)qlw, qlp1, def1);
    }

}
