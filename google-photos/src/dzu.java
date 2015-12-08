// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Set;

final class dzu
    implements eci
{

    dzu()
    {
    }

    public final pzx a(pzt pzt1)
    {
        Set set = dzv.a();
        pzt1 = pzt1.d;
        int j = pzt1.length;
        for (int i = 0; i < j; i++)
        {
            pzx pzx1 = pzt1[i];
            if (set.contains(Integer.valueOf(pzx1.a)))
            {
                return pzx1;
            }
        }

        return null;
    }
}
