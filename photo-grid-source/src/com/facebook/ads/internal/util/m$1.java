// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.util;


// Referenced classes of package com.facebook.ads.internal.util:
//            l

final class b
    implements l
{

    final int a[];
    final l b;

    public final void a()
    {
        int ai[] = a;
        ai[0] = ai[0] - 1;
        if (a[0] == 0 && b != null)
        {
            b.a();
        }
    }

    (int ai[], l l1)
    {
        a = ai;
        b = l1;
        super();
    }
}
