// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;


// Referenced classes of package com.a.a.a:
//            b

public class d extends b
{

    public d()
    {
    }

    public int a(int i)
    {
        int j = i % 100;
        i %= 10;
        if (i == 1 && j != 11)
        {
            return 2;
        }
        if (i >= 2 && i <= 4 && (j < 12 || j > 14))
        {
            return 8;
        }
        return i != 0 && (i < 5 || i > 9) && (j < 11 || j > 14) ? 0 : 16;
    }
}
