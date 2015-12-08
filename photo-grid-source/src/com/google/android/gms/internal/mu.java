// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            mt, mo, pa

final class mu
    implements Runnable
{

    final pa a;
    final mt b;

    mu(mt mt1, pa pa)
    {
        b = mt1;
        a = pa;
        super();
    }

    public final void run()
    {
        mt.a(b).zzb(a);
    }
}
