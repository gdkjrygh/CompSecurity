// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import com.google.android.gms.internal.zzra;
import com.google.android.gms.internal.zzrf;

// Referenced classes of package com.google.android.gms.analytics:
//            zzq

class zzg
    implements zzq
{

    protected String zzBa;
    protected String zzBb;
    protected String zzBc;
    protected String zzBd;

    zzg(zzra zzra1)
    {
        zzra1 = zzra1.zzqU();
        zzBc = zzra1.zznE();
        zzBd = zzra1.zzra();
        zzBa = zzra1.zzga();
        zzBb = zzra1.zzgc();
    }

    public String getValue(String s)
    {
        if (s != null)
        {
            if (s.equals("&an"))
            {
                return zzBa;
            }
            if (s.equals("&av"))
            {
                return zzBb;
            }
            if (s.equals("&aid"))
            {
                return zzBc;
            }
            if (s.equals("&aiid"))
            {
                return zzBd;
            }
        }
        return null;
    }
}
