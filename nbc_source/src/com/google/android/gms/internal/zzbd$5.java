// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzbd, zzid

class zzqY
    implements Runnable
{

    final String zzqY;
    final zzbd zzrd;

    public void run()
    {
        zzbd.zza(zzrd).loadUrl(zzqY);
    }

    (zzbd zzbd1, String s)
    {
        zzrd = zzbd1;
        zzqY = s;
        super();
    }
}
