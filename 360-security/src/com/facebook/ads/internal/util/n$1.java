// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.util;


// Referenced classes of package com.facebook.ads.internal.util:
//            m, n

static final class b
    implements m
{

    final int a[];
    final m b;

    public void a()
    {
        int ai[] = a;
        ai[0] = ai[0] - 1;
        if (a[0] == 0 && b != null)
        {
            b.a();
        }
    }

    (int ai[], m m1)
    {
        a = ai;
        b = m1;
        super();
    }
}
