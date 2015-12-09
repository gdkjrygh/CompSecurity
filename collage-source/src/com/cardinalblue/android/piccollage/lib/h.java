// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.lib;


public class h
{

    public h()
    {
    }

    public static int a(int i, int j)
    {
        boolean flag1 = true;
        boolean flag = true;
        int k = ((flag1) ? 1 : 0);
        if (i > 0)
        {
            k = ((flag1) ? 1 : 0);
            if (j > 0)
            {
                int l = i / 2;
                i = ((flag) ? 1 : 0);
                do
                {
                    k = i;
                    if (l / i <= j)
                    {
                        break;
                    }
                    i *= 2;
                } while (true);
            }
        }
        return k;
    }
}
