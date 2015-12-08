// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ac.a;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            bd, ah, br

final class nit> extends nit>
{

    public final bd a(a a1)
    {
        a a2;
label0:
        {
            Object obj = null;
            ah ah1 = com.google.android.m4b.maps.bo.ah.a(a1.d(1));
            if (ah1 != ah.x)
            {
                a2 = obj;
                if (ah1 != ah.w)
                {
                    break label0;
                }
            }
            a1 = new br(a1.f(29));
            a2 = obj;
            if (a1.a(ah1))
            {
                a2 = a1;
            }
        }
        return a2;
    }

    (String s)
    {
        super(s, 5, (byte)0);
    }
}
