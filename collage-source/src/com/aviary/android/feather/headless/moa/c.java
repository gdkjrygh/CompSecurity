// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.headless.moa;


// Referenced classes of package com.aviary.android.feather.headless.moa:
//            b, d, i

public class c
{

    public c()
    {
    }

    public static b a(String s)
    {
        return new b(s);
    }

    public static d a()
    {
        return new d();
    }

    public static transient d a(String as[])
    {
        d d1 = new d();
        int k = as.length;
        for (int j = 0; j < k; j++)
        {
            d1.a(a(as[j]));
        }

        return d1;
    }

    public static i b()
    {
        return new i();
    }
}
