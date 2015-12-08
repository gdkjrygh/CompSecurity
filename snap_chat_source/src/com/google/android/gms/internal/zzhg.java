// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzho, zzhh, zzhj, zzhf, 
//            zzhi, zzhm, zzca, zzab, 
//            zzhy, zzae, zzdf, zzbx, 
//            zzgh, zzme, zzam, zzal, 
//            zzan, zzcc, zzcb, zzcd, 
//            zzhx

public class zzhg
{

    private Context mContext;
    private zzae zzlG;
    private boolean zzmE;
    private final Object zznh = new Object();
    private zzhy zznl;
    private zzam zzol;
    private zzal zzom;
    private final zzgh zzon = null;
    private boolean zzxO;
    private boolean zzxP;
    private final String zzyL;
    private final zzhh zzyM;
    private BigInteger zzyN;
    private final HashSet zzyO = new HashSet();
    private final HashMap zzyP = new HashMap();
    private boolean zzyQ;
    private int zzyR;
    private zzcc zzyS;
    private zzan zzyT;
    private final LinkedList zzyU = new LinkedList();
    private Boolean zzyV;
    private String zzyW;

    public zzhg(zzho zzho1)
    {
        zzyN = BigInteger.ONE;
        zzyQ = false;
        zzxO = true;
        zzyR = 0;
        zzmE = false;
        zzyS = null;
        zzxP = true;
        zzol = null;
        zzyT = null;
        zzom = null;
        zzyV = null;
        zzyL = zzho1.zzeu();
        zzyM = new zzhh(zzyL);
    }

    static Context zza(zzhg zzhg1)
    {
        return zzhg1.mContext;
    }

    static zzcc zza(zzhg zzhg1, zzcc zzcc)
    {
        zzhg1.zzyS = zzcc;
        return zzcc;
    }

    static zzhy zzb(zzhg zzhg1)
    {
        return zzhg1.zznl;
    }

    public String getSessionId()
    {
        return zzyL;
    }

    public Bundle zza(Context context, zzhi zzhi1, String s)
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        Bundle bundle;
        bundle = new Bundle();
        bundle.putBundle("app", zzyM.zzc(context, s));
        context = new Bundle();
        String s1;
        for (s = zzyP.keySet().iterator(); s.hasNext(); context.putBundle(s1, ((zzhj)zzyP.get(s1)).toBundle()))
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
        for (s = zzyO.iterator(); s.hasNext(); context.add(((zzhf)s.next()).toBundle())) { }
        bundle.putParcelableArrayList("ads", context);
        zzhi1.zza(zzyO);
        zzyO.clear();
        obj;
        JVM INSTR monitorexit ;
        return bundle;
    }

    public void zza(Context context, boolean flag)
    {
        synchronized (zznh)
        {
            if (flag != zzxO)
            {
                zzxO = flag;
                zzhm.zza(context, flag);
            }
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void zza(zzhf zzhf1)
    {
        synchronized (zznh)
        {
            zzyO.add(zzhf1);
        }
        return;
        zzhf1;
        obj;
        JVM INSTR monitorexit ;
        throw zzhf1;
    }

    public void zza(String s, zzhj zzhj1)
    {
        synchronized (zznh)
        {
            zzyP.put(s, zzhj1);
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void zza(Thread thread)
    {
        zzca.zza(new Runnable(thread) {

            final Thread zzyX;
            final zzhg zzyY;

            public void run()
            {
                zzgh.zza(zzhg.zza(zzyY), zzyX, zzhg.zzb(zzyY));
            }

            
            {
                zzyY = zzhg.this;
                zzyX = thread;
                super();
            }
        });
    }

    public void zzb(Context context, zzhy zzhy1)
    {
        synchronized (zznh)
        {
            if (!zzmE)
            {
                mContext = context.getApplicationContext();
                zznl = zzhy1;
                zzxO = zzhm.zzr(context);
                zzyR = zzhm.zzs(context);
                zza(Thread.currentThread());
                zzyW = zzab.zzaM().zze(context, zzhy1.zzzH);
                zzlG = new zzae(context.getApplicationContext(), zznl, new zzdf(context.getApplicationContext(), zznl, (String)zzca.zzql.get()));
                zzen();
                zzmE = true;
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
        synchronized (zznh)
        {
            zzyV = boolean1;
        }
        return;
        boolean1;
        obj;
        JVM INSTR monitorexit ;
        throw boolean1;
    }

    public void zzb(HashSet hashset)
    {
        synchronized (zznh)
        {
            zzyO.addAll(hashset);
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
        if (zznl.zzzK)
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

    public void zze(Throwable throwable)
    {
        (new zzgh(mContext, zznl, null, null)).zzb(throwable);
    }

    public boolean zzed()
    {
        boolean flag;
        synchronized (zznh)
        {
            flag = zzxP;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String zzee()
    {
        String s;
        synchronized (zznh)
        {
            s = zzyN.toString();
            zzyN = zzyN.add(BigInteger.ONE);
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public zzhh zzef()
    {
        zzhh zzhh1;
        synchronized (zznh)
        {
            zzhh1 = zzyM;
        }
        return zzhh1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public zzcc zzeg()
    {
        zzcc zzcc;
        synchronized (zznh)
        {
            zzcc = zzyS;
        }
        return zzcc;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean zzeh()
    {
        boolean flag;
        synchronized (zznh)
        {
            flag = zzyQ;
            zzyQ = true;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean zzei()
    {
        boolean flag;
        synchronized (zznh)
        {
            flag = zzxO;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String zzej()
    {
        String s;
        synchronized (zznh)
        {
            s = zzyW;
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Boolean zzek()
    {
        Boolean boolean1;
        synchronized (zznh)
        {
            boolean1 = zzyV;
        }
        return boolean1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public zzae zzel()
    {
        return zzlG;
    }

    public boolean zzem()
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        if (zzyR >= ((Integer)zzca.zzqN.get()).intValue())
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzyR = ((Integer)zzca.zzqN.get()).intValue();
        zzhm.zza(mContext, zzyR);
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

    void zzen()
    {
        zzca.zza(new Runnable() {

            final zzhg zzyY;

            public void run()
            {
                zzcb zzcb1 = new zzcb();
                zzcb1.zzb(zzhg.zza(zzyY), zzhg.zzb(zzyY).zzzH);
                try
                {
                    zzhg.zza(zzyY, zzab.zzaR().zza(zzcb1));
                    return;
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    zzhx.zzac((new StringBuilder("Cannot initialize CSI reporter.")).append(illegalargumentexception.getMessage()).toString());
                }
            }

            
            {
                zzyY = zzhg.this;
                super();
            }
        });
    }

    public zzan zzo(Context context)
    {
label0:
        {
            if (!((Boolean)zzca.zzqB.get()).booleanValue() || !zzme.zzkg() || zzed())
            {
                return null;
            }
            synchronized (zznh)
            {
                if (zzol != null)
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
        zzol = new zzam((Application)context.getApplicationContext(), (Activity)context);
        if (zzom == null)
        {
            zzom = new zzal();
        }
        if (zzyT == null)
        {
            zzyT = new zzan(zzol, zzom, new zzgh(mContext, zznl, null, null));
        }
        zzyT.zzbt();
        context = zzyT;
        obj;
        JVM INSTR monitorexit ;
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void zzz(boolean flag)
    {
        synchronized (zznh)
        {
            zzxP = flag;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
