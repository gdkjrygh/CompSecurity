// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            n, F, X

final class r
    implements Runnable
{

    final X a;
    final n b;

    r(n n1, X x)
    {
        b = n1;
        a = x;
        super();
    }

    public final void run()
    {
        b.a.a(a);
    }
}
