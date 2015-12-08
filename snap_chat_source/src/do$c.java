// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

static final class d extends do
{

    private final char c[];
    private final char d[];

    public final boolean a(char c1)
    {
        int i = Arrays.binarySearch(c, c1);
        if (i < 0)
        {
            if ((i = ~i - 1) < 0 || c1 > d[i])
            {
                return false;
            }
        }
        return true;
    }

    public final volatile boolean a(Object obj)
    {
        return super.a((Character)obj);
    }

    >(String s, char ac[], char ac1[])
    {
        super(s);
        c = ac;
        d = ac1;
        int i;
        boolean flag;
        if (ac.length == ac1.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dv.a(flag);
        i = 0;
        while (i < ac.length) 
        {
            if (ac[i] <= ac1[i])
            {
                flag = true;
            } else
            {
                flag = false;
            }
            dv.a(flag);
            if (i + 1 < ac.length)
            {
                if (ac1[i] < ac[i + 1])
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                dv.a(flag);
            }
            i++;
        }
    }
}
