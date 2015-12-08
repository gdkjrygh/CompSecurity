// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            an, bh

class as
    implements Runnable
{

    final bh a;
    final long b;
    final an c;

    as(an an1, bh bh, long l)
    {
        c = an1;
        a = bh;
        b = l;
        super();
    }

    public void run()
    {
        c.a(a, b);
    }
}
