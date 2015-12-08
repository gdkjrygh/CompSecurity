// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            e, zzv

class b
    implements Runnable
{

    final zzv a;
    final long b;
    final e c;

    public void run()
    {
        c.a(a, b);
    }

    (e e1, zzv zzv, long l)
    {
        c = e1;
        a = zzv;
        b = l;
        super();
    }
}
