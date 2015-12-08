// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dm;

import p.ds.f;

public class o
{

    public static int a(String s)
    {
        if (s == null)
        {
            return 0;
        } else
        {
            return (int)(Long.parseLong(s) >> 32 & 0xffffffffL);
        }
    }

    public static String a(int i, f af[])
    {
        for (int j = 0; j < af.length; j++)
        {
            if (i == af[j].b())
            {
                return af[j].c();
            }
        }

        return null;
    }
}
