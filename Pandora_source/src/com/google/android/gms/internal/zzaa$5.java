// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzaa, zzgd

class a
    implements Runnable
{

    final String a;
    final zzaa b;

    public void run()
    {
        zzaa.zza(b).loadUrl(a);
    }

    (zzaa zzaa1, String s)
    {
        b = zzaa1;
        a = s;
        super();
    }
}
