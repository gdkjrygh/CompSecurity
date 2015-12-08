// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.util;

import java.util.concurrent.Callable;

// Referenced classes of package com.facebook.ads.internal.util:
//            n

class g
    implements Callable
{

    private final int a[];
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    public Void a()
    {
        n.a(a, b, c, d, e, f, g);
        return null;
    }

    public Object call()
    {
        return a();
    }

    public (int ai[], int i, int j, int k, int l, int i1, int j1)
    {
        a = ai;
        b = i;
        c = j;
        d = k;
        e = l;
        f = i1;
        g = j1;
    }
}
