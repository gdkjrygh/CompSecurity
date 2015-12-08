// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzh;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            zzfl, zzfd, zzff, zzfb, 
//            zzfe, zzfj, zzen, zzv, 
//            zzcf, zzat, zzap, zzau, 
//            zzaw, zzic, zzad, zzac, 
//            zzae, zzav

public class zzfc
    implements zzfj.zzb
{

    private Context mContext;
    private boolean zzAN;
    private boolean zzAO;
    private final String zzBL;
    private final zzfd zzBM;
    private BigInteger zzBN;
    private final HashSet zzBO = new HashSet();
    private final HashMap zzBP = new HashMap();
    private boolean zzBQ;
    private int zzBR;
    private zzav zzBS;
    private zzae zzBT;
    private final LinkedList zzBU = new LinkedList();
    private Boolean zzBV;
    private String zzBW;
    private zzv zzmy;
    private boolean zznz;
    private final Object zzoe = new Object();
    private VersionInfoParcel zzoi;
    private zzad zzpi;
    private zzac zzpj;
    private final zzen zzpk = null;

    public zzfc(zzfl zzfl1)
    {
        zzBN = BigInteger.ONE;
        zzBQ = false;
        zzAN = true;
        zzBR = 0;
        zznz = false;
        zzBS = null;
        zzAO = true;
        zzpi = null;
        zzBT = null;
        zzpj = null;
        zzBV = null;
        zzBL = zzfl1.zzfb();
        zzBM = new zzfd(zzBL);
    }

    public String getSessionId()
    {
        return zzBL;
    }

    public void zzA(boolean flag)
    {
        synchronized (zzoe)
        {
            zzAO = flag;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Bundle zza(Context context, zzfe zzfe1, String s)
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        Bundle bundle;
        bundle = new Bundle();
        bundle.putBundle("app", zzBM.zzd(context, s));
        context = new Bundle();
        String s1;
        for (s = zzBP.keySet().iterator(); s.hasNext(); context.putBundle(s1, ((zzff)zzBP.get(s1)).toBundle()))
        {
            s1 = (String)s.next();
        }

        break MISSING_BLOCK_LABEL_105;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        bundle.putBundle("slots", context);
        context = new ArrayList();
        for (s = zzBO.iterator(); s.hasNext(); context.add(((zzfb)s.next()).toBundle())) { }
        bundle.putParcelableArrayList("ads", context);
        zzfe1.zza(zzBO);
        zzBO.clear();
        obj;
        JVM INSTR monitorexit ;
        return bundle;
    }

    public Future zza(Context context, boolean flag)
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        if (flag == zzAN)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        zzAN = flag;
        context = zzfj.zza(context, flag);
        return context;
        obj;
        JVM INSTR monitorexit ;
        return null;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void zza(zzfb zzfb1)
    {
        synchronized (zzoe)
        {
            zzBO.add(zzfb1);
        }
        return;
        zzfb1;
        obj;
        JVM INSTR monitorexit ;
        throw zzfb1;
    }

    public void zza(String s, zzff zzff1)
    {
        synchronized (zzoe)
        {
            zzBP.put(s, zzff1);
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void zza(Thread thread)
    {
        zzen.zza(mContext, thread, zzoi);
    }

    public void zzb(Context context, VersionInfoParcel versioninfoparcel)
    {
        synchronized (zzoe)
        {
            if (!zznz)
            {
                mContext = context.getApplicationContext();
                zzoi = versioninfoparcel;
                zzfj.zza(context, this);
                com.google.android.gms.internal.zzfj.zzb(context, this);
                zza(Thread.currentThread());
                zzBW = zzh.zzaQ().zzf(context, versioninfoparcel.zzCI);
                zzmy = new zzv(context.getApplicationContext(), zzoi, new zzcf(context.getApplicationContext(), zzoi, (String)zzat.zzrh.get()));
                zzeT();
                zznz = true;
            }
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void zzb(Boolean boolean1)
    {
        synchronized (zzoe)
        {
            zzBV = boolean1;
        }
        return;
        boolean1;
        obj;
        JVM INSTR monitorexit ;
        throw boolean1;
    }

    public void zzb(HashSet hashset)
    {
        synchronized (zzoe)
        {
            zzBO.addAll(hashset);
        }
        return;
        hashset;
        obj;
        JVM INSTR monitorexit ;
        throw hashset;
    }

    public String zzc(int i, String s)
    {
        Resources resources;
        if (zzoi.zzCL)
        {
            resources = mContext.getResources();
        } else
        {
            resources = GooglePlayServicesUtil.getRemoteResource(mContext);
        }
        if (resources == null)
        {
            return s;
        } else
        {
            return resources.getString(i);
        }
    }

    public void zzc(Bundle bundle)
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        if (!bundle.containsKey("use_https")) goto _L2; else goto _L1
_L1:
        boolean flag = bundle.getBoolean("use_https");
_L5:
        zzAN = flag;
        if (!bundle.containsKey("webview_cache_version")) goto _L4; else goto _L3
_L3:
        int i = bundle.getInt("webview_cache_version");
_L6:
        zzBR = i;
        return;
_L2:
        flag = zzAN;
          goto _L5
_L4:
        i = zzBR;
          goto _L6
        bundle;
        obj;
        JVM INSTR monitorexit ;
        throw bundle;
          goto _L5
    }

    public void zzc(Throwable throwable, boolean flag)
    {
        (new zzen(mContext, zzoi, null, null)).zza(throwable, flag);
    }

    public boolean zzeJ()
    {
        boolean flag;
        synchronized (zzoe)
        {
            flag = zzAO;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String zzeK()
    {
        String s;
        synchronized (zzoe)
        {
            s = zzBN.toString();
            zzBN = zzBN.add(BigInteger.ONE);
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public zzfd zzeL()
    {
        zzfd zzfd1;
        synchronized (zzoe)
        {
            zzfd1 = zzBM;
        }
        return zzfd1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public zzav zzeM()
    {
        zzav zzav;
        synchronized (zzoe)
        {
            zzav = zzBS;
        }
        return zzav;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean zzeN()
    {
        boolean flag;
        synchronized (zzoe)
        {
            flag = zzBQ;
            zzBQ = true;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean zzeO()
    {
        boolean flag;
        synchronized (zzoe)
        {
            flag = zzAN;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String zzeP()
    {
        String s;
        synchronized (zzoe)
        {
            s = zzBW;
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Boolean zzeQ()
    {
        Boolean boolean1;
        synchronized (zzoe)
        {
            boolean1 = zzBV;
        }
        return boolean1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public zzv zzeR()
    {
        return zzmy;
    }

    public boolean zzeS()
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        if (zzBR >= ((Integer)zzat.zzrS.get()).intValue())
        {
            break MISSING_BLOCK_LABEL_58;
        }
        zzBR = ((Integer)zzat.zzrS.get()).intValue();
        zzfj.zza(mContext, zzBR);
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void zzeT()
    {
        zzau zzau1 = new zzau();
        zzau1.zzb(mContext, zzoi.zzCI);
        try
        {
            zzBS = zzh.zzaV().zza(zzau1);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Cannot initialize CSI reporter.", illegalargumentexception);
        }
    }

    public zzae zzs(Context context)
    {
label0:
        {
            if (!((Boolean)zzat.zzrG.get()).booleanValue() || !zzic.zznh() || zzeJ())
            {
                return null;
            }
            synchronized (zzoe)
            {
                if (zzpi != null)
                {
                    break MISSING_BLOCK_LABEL_77;
                }
                if (context instanceof Activity)
                {
                    break label0;
                }
            }
            return null;
        }
        zzpi = new zzad((Application)context.getApplicationContext(), (Activity)context);
        if (zzpj == null)
        {
            zzpj = new zzac();
        }
        if (zzBT == null)
        {
            zzBT = new zzae(zzpi, zzpj, new zzen(mContext, zzoi, null, null));
        }
        zzBT.zzbz();
        context = zzBT;
        obj;
        JVM INSTR monitorexit ;
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }
}
