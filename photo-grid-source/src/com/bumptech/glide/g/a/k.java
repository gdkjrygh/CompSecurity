// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.g.a;


// Referenced classes of package com.bumptech.glide.g.a:
//            f, g, i, j, 
//            d

public final class k
    implements f
{

    private final j a;
    private d b;

    k(j j)
    {
        a = j;
    }

    public final d a(boolean flag, boolean flag1)
    {
        if (flag || !flag1)
        {
            return g.b();
        }
        if (b == null)
        {
            b = new i(a);
        }
        return b;
    }
}
