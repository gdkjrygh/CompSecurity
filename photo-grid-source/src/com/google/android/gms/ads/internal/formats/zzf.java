// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.dw;
import com.google.android.gms.internal.ep;
import com.google.android.gms.internal.wb;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            zzh, zza

public class zzf extends ep
    implements zzh.zza
{

    private final zza a;
    private final String b;
    private final wb c;
    private final wb d;
    private final Object e = new Object();
    private zzh f;

    public zzf(String s, wb wb1, wb wb2, zza zza1)
    {
        b = s;
        c = wb1;
        d = wb2;
        a = zza1;
    }

    public List getAvailableAssetNames()
    {
        boolean flag = false;
        String as[] = new String[c.size() + d.size()];
        int j = 0;
        int i = 0;
        int k;
        int l;
        do
        {
            k = ((flag) ? 1 : 0);
            l = i;
            if (j >= c.size())
            {
                break;
            }
            as[i] = (String)c.b(j);
            i++;
            j++;
        } while (true);
        while (k < d.size()) 
        {
            as[l] = (String)d.b(k);
            k++;
            l++;
        }
        return Arrays.asList(as);
    }

    public String getCustomTemplateId()
    {
        return b;
    }

    public void performClick(String s)
    {
label0:
        {
            synchronized (e)
            {
                if (f != null)
                {
                    break label0;
                }
                zzb.e("Attempt to call performClick before ad initialized.");
            }
            return;
        }
        f.zza(s, null, null);
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
            synchronized (e)
            {
                if (f != null)
                {
                    break label0;
                }
                zzb.e("Attempt to perform recordImpression before ad initialized.");
            }
            return;
        }
        f.recordImpression();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String zzU(String s)
    {
        return (String)d.get(s);
    }

    public dw zzV(String s)
    {
        return (dw)c.get(s);
    }

    public void zza(zzh zzh1)
    {
        synchronized (e)
        {
            f = zzh1;
        }
        return;
        zzh1;
        obj;
        JVM INSTR monitorexit ;
        throw zzh1;
    }

    public String zzdy()
    {
        return "3";
    }

    public zza zzdz()
    {
        return a;
    }
}
