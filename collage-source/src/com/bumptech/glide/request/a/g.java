// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.request.a;


// Referenced classes of package com.bumptech.glide.request.a:
//            d, e, f, c

public class g
    implements d
{

    private final f.a a;
    private c b;

    g(f.a a1)
    {
        a = a1;
    }

    public c a(boolean flag, boolean flag1)
    {
        if (flag || !flag1)
        {
            return e.b();
        }
        if (b == null)
        {
            b = new f(a);
        }
        return b;
    }
}
