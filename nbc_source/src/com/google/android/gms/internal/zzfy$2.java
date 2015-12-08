// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzm;

// Referenced classes of package com.google.android.gms.internal:
//            zzfy, zzkw, zzhs

class zzBQ
    implements Runnable
{

    final zzfy zzBO;
    final zzhs zzBP;
    final String zzBQ;

    public void run()
    {
        zzBP.zzf(zzfy.zza(zzBO).zzbo().get(zzBQ));
    }

    (zzfy zzfy1, zzhs zzhs1, String s)
    {
        zzBO = zzfy1;
        zzBP = zzhs1;
        zzBQ = s;
        super();
    }
}
