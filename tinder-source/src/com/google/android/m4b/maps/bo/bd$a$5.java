// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ac.a;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            bd, ah, aj

final class nit> extends nit>
{

    public final bd a(a a1)
    {
        if (com.google.android.m4b.maps.bo.ah.a(a1.d(1)) == ah.m)
        {
            nit> nit> = new nit>();
            if (a1.i(9))
            {
                nit>.nit> = com.google.android.m4b.maps.ak.a.a(a1.g(9));
            }
            int j = a1.j(12);
            for (int i = 0; i < j; i++)
            {
                int k = a1.b(12, i);
                nit>.nit>.add(Integer.valueOf(k));
            }

            a1 = nit>.nit>();
            if (a1.a(ah.m))
            {
                return a1;
            } else
            {
                return null;
            }
        } else
        {
            return null;
        }
    }

    (String s)
    {
        super(s, 4, (byte)0);
    }
}
