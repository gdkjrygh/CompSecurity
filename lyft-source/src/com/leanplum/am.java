// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.leanplum:
//            an, aI

final class am
{

    Map a;

    am()
    {
        a = new HashMap();
    }

    public static am a(String s)
    {
        am am1;
        int i;
        int j;
        int k;
        am1 = new am();
        s = s.toLowerCase().split("-");
        k = s.length;
        j = 0;
        i = 0;
_L2:
        if (j >= k)
        {
            return am1;
        }
        String s1 = s[j];
        boolean flag = false;
        do
        {
label0:
            {
                if (!flag && i < an.values().length)
                {
                    break label0;
                }
                j++;
            }
            if (true)
            {
                continue;
            }
            an an1 = an.values()[i];
            Object obj = an1.a().a(s1);
            if (obj != null)
            {
                am1.a.put(an1, obj);
                flag = true;
            }
            i++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }
}
