// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            g

public final class xn
{

    public static g a(g g1)
    {
        g g2 = new g();
        g2.a = g1.a;
        g2.k = (int[])g1.k.clone();
        if (g1.l)
        {
            g2.l = g1.l;
        }
        return g2;
    }
}
