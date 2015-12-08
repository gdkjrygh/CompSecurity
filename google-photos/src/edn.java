// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

final class edn
    implements dzt
{

    edn()
    {
    }

    public final ekq a(int i, String s, pzx pzx1, qgg aqgg[])
    {
        pzs pzs1;
        if (pzx1.b == null || pzx1.b.h == null)
        {
            return null;
        }
        pzs1 = pzx1.b.h;
        if (pzs1.a != null && !TextUtils.isEmpty(pzs1.a.a)) goto _L2; else goto _L1
_L1:
        pzx1 = null;
_L4:
        aqgg = new eky();
        aqgg.d = pzs1.b.longValue();
        aqgg.e = pzs1.c.longValue();
        aqgg = aqgg.a();
        return new ecj(i, pzx1, b.a(i, null), aqgg, s);
_L2:
        String s1 = pzs1.a.a;
        int k = aqgg.length;
        for (int j = 0; j < k; j++)
        {
            qgg qgg1 = aqgg[j];
            pzx1 = qgg1;
            if (s1.equals(qgg1.b.a))
            {
                continue; /* Loop/switch isn't completed */
            }
        }

        pzx1 = null;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
