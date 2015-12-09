// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;


// Referenced classes of package com.a.a.a:
//            b

public class o extends b
{

    public o()
    {
    }

    public int a(int i)
    {
        int j = i % 100;
        int k = i % 10;
        if (i == 1)
        {
            return 2;
        }
        return k < 2 || k > 4 || j >= 12 && j <= 14 || j >= 22 && j <= 24 ? 0 : 8;
    }
}
