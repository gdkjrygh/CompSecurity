// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzaj, zzic

class zznU
    implements Runnable
{

    final zzaj zznS;
    final String zznU;

    public void run()
    {
        zzaj.zza(zznS).loadData(zznU, "text/html", "UTF-8");
    }

    (zzaj zzaj1, String s)
    {
        zznS = zzaj1;
        zznU = s;
        super();
    }
}
