// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.bj;
import com.google.android.gms.internal.iu;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            zzh, zza

public class zzf extends com.google.android.gms.internal.br.a
    implements zzh.zza
{

    private final Object zzpc = new Object();
    private final zza zzvS;
    private zzh zzvT;
    private final String zzvW;
    private final iu zzvX;
    private final iu zzvY;

    public zzf(String s, iu iu1, iu iu2, zza zza1)
    {
        zzvW = s;
        zzvX = iu1;
        zzvY = iu2;
        zzvS = zza1;
    }

    public List getAvailableAssetNames()
    {
        boolean flag = false;
        String as[] = new String[zzvX.size() + zzvY.size()];
        int j = 0;
        int i = 0;
        int k;
        int l;
        do
        {
            k = ((flag) ? 1 : 0);
            l = i;
            if (j >= zzvX.size())
            {
                break;
            }
            as[i] = (String)zzvX.b(j);
            i++;
            j++;
        } while (true);
        while (k < zzvY.size()) 
        {
            as[l] = (String)zzvY.b(k);
            k++;
            l++;
        }
        return Arrays.asList(as);
    }

    public String getCustomTemplateId()
    {
        return zzvW;
    }

    public void performClick(String s)
    {
label0:
        {
            synchronized (zzpc)
            {
                if (zzvT != null)
                {
                    break label0;
                }
                zzb.e("Attempt to call performClick before ad initialized.");
            }
            return;
        }
        zzvT.performClick(s);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void recordImpression()
    {
label0:
        {
            synchronized (zzpc)
            {
                if (zzvT != null)
                {
                    break label0;
                }
                zzb.e("Attempt to perform recordImpression before ad initialized.");
            }
            return;
        }
        zzvT.recordImpression();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String zzS(String s)
    {
        return (String)zzvY.get(s);
    }

    public bj zzT(String s)
    {
        return (bj)zzvX.get(s);
    }

    public void zza(zzh zzh1)
    {
        synchronized (zzpc)
        {
            zzvT = zzh1;
        }
        return;
        zzh1;
        obj;
        JVM INSTR monitorexit ;
        throw zzh1;
    }

    public String zzdu()
    {
        return "3";
    }

    public zza zzdv()
    {
        return zzvS;
    }
}
