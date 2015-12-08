// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzb, e

class a
    implements Runnable
{

    final boolean a;
    final zzb b;

    public void run()
    {
        zzb.zza(b).a(a);
    }

    (zzb zzb1, boolean flag)
    {
        b = zzb1;
        a = flag;
        super();
    }
}
