// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzb;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzaj, zzde

public abstract class zzbz extends zzaj
{

    private static final String zzayC;
    private static final String zzazv;

    public zzbz(String s)
    {
        super(s, new String[] {
            zzayC, zzazv
        });
    }

    public com.google.android.gms.internal.zzd.zza zzH(Map map)
    {
        for (Iterator iterator = map.values().iterator(); iterator.hasNext();)
        {
            if ((com.google.android.gms.internal.zzd.zza)iterator.next() == zzde.zzuf())
            {
                return zzde.zzx(Boolean.valueOf(false));
            }
        }

        com.google.android.gms.internal.zzd.zza zza1 = (com.google.android.gms.internal.zzd.zza)map.get(zzayC);
        com.google.android.gms.internal.zzd.zza zza2 = (com.google.android.gms.internal.zzd.zza)map.get(zzazv);
        boolean flag;
        if (zza1 == null || zza2 == null)
        {
            flag = false;
        } else
        {
            flag = zza(zza1, zza2, map);
        }
        return zzde.zzx(Boolean.valueOf(flag));
    }

    protected abstract boolean zza(com.google.android.gms.internal.zzd.zza zza1, com.google.android.gms.internal.zzd.zza zza2, Map map);

    public boolean zzsD()
    {
        return true;
    }

    public volatile String zzth()
    {
        return super.zzth();
    }

    public volatile Set zzti()
    {
        return super.zzti();
    }

    static 
    {
        zzayC = zzb.zzbw.toString();
        zzazv = zzb.zzbx.toString();
    }
}
