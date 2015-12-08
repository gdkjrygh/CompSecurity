// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;


// Referenced classes of package com.a.a.a:
//            b

public class q extends b
{

    public q()
    {
    }

    public int a(int i)
    {
        i %= 100;
        if (i == 1)
        {
            return 2;
        }
        if (i == 2)
        {
            return 4;
        }
        return i < 3 || i > 4 ? 0 : 8;
    }
}
