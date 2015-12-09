// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            z, ak

class b
    implements Runnable
{

    final ak a;
    final long b;
    final z c;

    public void run()
    {
        c.a(a, b);
    }

    (z z1, ak ak, long l)
    {
        c = z1;
        a = ak;
        b = l;
        super();
    }
}
