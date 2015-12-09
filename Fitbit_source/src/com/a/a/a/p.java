// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;


// Referenced classes of package com.a.a.a:
//            b

public class p extends b
{

    public p()
    {
    }

    public int a(int i)
    {
        int j = i % 100;
        if (i == 1)
        {
            return 2;
        }
        return i != 0 && (j < 1 || j > 19) ? 0 : 8;
    }
}
