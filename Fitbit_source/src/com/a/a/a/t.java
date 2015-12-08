// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;


// Referenced classes of package com.a.a.a:
//            b

public class t extends b
{

    public t()
    {
    }

    public int a(int i)
    {
        if (i == 0)
        {
            return 1;
        }
        if (i == 1)
        {
            return 2;
        }
        if (i == 2)
        {
            return 4;
        }
        if (i == 3)
        {
            return 8;
        }
        return i != 6 ? 0 : 16;
    }
}
