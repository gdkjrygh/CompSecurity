// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;


// Referenced classes of package com.a.a.a:
//            b

public class j extends b
{

    public j()
    {
    }

    public int a(int i)
    {
        int k = i % 100;
        i %= 10;
        if (i == 1 && (k < 11 || k > 19))
        {
            return 2;
        }
        return i < 2 || i > 9 || k >= 11 && k <= 19 ? 0 : 8;
    }
}
