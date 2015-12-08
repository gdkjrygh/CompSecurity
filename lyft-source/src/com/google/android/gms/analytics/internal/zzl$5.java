// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzl, zzw

class b
    implements Runnable
{

    final zzw a;
    final long b;
    final zzl c;

    public void run()
    {
        c.a(a, b);
    }

    (zzl zzl1, zzw zzw, long l)
    {
        c = zzl1;
        a = zzw;
        b = l;
        super();
    }
}
