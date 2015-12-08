// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzaa, zzgd

class b
    implements Runnable
{

    final String a;
    final String b;
    final zzaa c;

    public void run()
    {
        zzaa.zza(c).zzb(a, b);
    }

    (zzaa zzaa1, String s, String s1)
    {
        c = zzaa1;
        a = s;
        b = s1;
        super();
    }
}
