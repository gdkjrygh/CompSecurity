// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.c;


// Referenced classes of package com.roidapp.baselib.c:
//            r

public final class q
{

    private static q b;
    private r a;

    private q(r r)
    {
        a = r;
    }

    public static void a(r r)
    {
        if (b == null)
        {
            b = new q(r);
        }
    }
}
