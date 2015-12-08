// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            zzai, zzah, zzhy, zzhq

class zznN
    implements Runnable
{

    final Context zznK;
    final zzhy zznL;
    final zzhq zznM;
    final String zznN;
    final zzai zznO;

    public void run()
    {
        zznO.zza(zznK, zznL, zznM).zzg(zznN);
    }

    (zzai zzai1, Context context, zzhy zzhy, zzhq zzhq, String s)
    {
        zznO = zzai1;
        zznK = context;
        zznL = zzhy;
        zznM = zzhq;
        zznN = s;
        super();
    }
}
