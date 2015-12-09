// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Type;

public final class ahu
{

    public static aht[] a(aha aha, Type type, int i)
    {
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        int j = 0;
        if (type.equals(ahc))
        {
            afu afu1 = (afu)aha;
            type = new ahc[i];
            do
            {
                aha = type;
                if (j >= i)
                {
                    break;
                }
                type[j] = new afy(afu1, j);
                j++;
            } while (true);
        } else
        if (type.equals(ahb))
        {
            afu afu2 = (afu)aha;
            type = new ahb[i];
            int k = ((flag) ? 1 : 0);
            do
            {
                aha = type;
                if (k >= i)
                {
                    break;
                }
                type[k] = new afx(afu2, k);
                k++;
            } while (true);
        } else
        if (type.equals(agz))
        {
            afu afu3 = (afu)aha;
            type = new agz[i];
            int l = ((flag1) ? 1 : 0);
            do
            {
                aha = type;
                if (l >= i)
                {
                    break;
                }
                type[l] = new afw(afu3, l);
                l++;
            } while (true);
        } else
        if (type.equals(ahd))
        {
            afu afu4 = (afu)aha;
            type = new ahd[i];
            int i1 = ((flag2) ? 1 : 0);
            do
            {
                aha = type;
                if (i1 >= i)
                {
                    break;
                }
                type[i1] = new afz(afu4, i1);
                i1++;
            } while (true);
        } else
        {
            aha = null;
        }
        return aha;
    }
}
