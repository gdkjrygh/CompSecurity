// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;


// Referenced classes of package com.a.a.a:
//            b

public class i extends b
{

    public i()
    {
    }

    public int a(int j)
    {
        if (j == 0)
        {
            return 1;
        }
        return j % 10 != 1 || j % 100 == 11 ? 0 : 2;
    }
}
