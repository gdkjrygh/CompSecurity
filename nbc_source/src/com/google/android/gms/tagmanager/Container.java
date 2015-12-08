// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcp, DataLayer, zzbg, zzdf, 
//            zzbw, zzcb, zzbo, zzah

public class Container
{
    public static interface FunctionCallMacroCallback
    {

        public abstract Object getValue(String s, Map map);
    }

    public static interface FunctionCallTagCallback
    {

        public abstract void execute(String s, Map map);
    }

    private class zza
        implements zzt.zza
    {

        final Container zzaKF;

        public Object zzd(String s, Map map)
        {
            FunctionCallMacroCallback functioncallmacrocallback = zzaKF.zzef(s);
            if (functioncallmacrocallback == null)
            {
                return null;
            } else
            {
                return functioncallmacrocallback.getValue(s, map);
            }
        }

        private zza()
        {
            zzaKF = Container.this;
            super();
        }

    }

    private class zzb
        implements zzt.zza
    {

        final Container zzaKF;

        public Object zzd(String s, Map map)
        {
            FunctionCallTagCallback functioncalltagcallback = zzaKF.zzeg(s);
            if (functioncalltagcallback != null)
            {
                functioncalltagcallback.execute(s, map);
            }
            return zzdf.zzzP();
        }

        private zzb()
        {
            zzaKF = Container.this;
            super();
        }

    }


    private final Context mContext;
    private zzcp zzaKA;
    private Map zzaKB;
    private Map zzaKC;
    private volatile long zzaKD;
    private volatile String zzaKE;
    private final String zzaKy;
    private final DataLayer zzaKz;

    Container(Context context, DataLayer datalayer, String s, long l, com.google.android.gms.internal.zzqf.zzc zzc)
    {
        zzaKB = new HashMap();
        zzaKC = new HashMap();
        zzaKE = "";
        mContext = context;
        zzaKz = datalayer;
        zzaKy = s;
        zzaKD = l;
        zza(zzc);
    }

    private void zza(com.google.android.gms.internal.zzqf.zzc zzc)
    {
        zzaKE = zzc.getVersion();
        zzah zzah = zzei(zzaKE);
        zza(new zzcp(mContext, zzc, zzaKz, new zza(), new zzb(), zzah));
        if (getBoolean("_gtm.loadEventEnabled"))
        {
            zzaKz.pushEvent("gtm.load", DataLayer.mapOf(new Object[] {
                "gtm.id", zzaKy
            }));
        }
    }

    private void zza(zzcp zzcp1)
    {
        this;
        JVM INSTR monitorenter ;
        zzaKA = zzcp1;
        this;
        JVM INSTR monitorexit ;
        return;
        zzcp1;
        throw zzcp1;
    }

    private zzcp zzyn()
    {
        this;
        JVM INSTR monitorenter ;
        zzcp zzcp1 = zzaKA;
        this;
        JVM INSTR monitorexit ;
        return zzcp1;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean getBoolean(String s)
    {
        zzcp zzcp1 = zzyn();
        if (zzcp1 == null)
        {
            zzbg.zzaz("getBoolean called for closed container.");
            return zzdf.zzzN().booleanValue();
        }
        boolean flag;
        try
        {
            flag = zzdf.zzk((com.google.android.gms.internal.zzag.zza)zzcp1.zzeD(s).getObject()).booleanValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbg.zzaz((new StringBuilder()).append("Calling getBoolean() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return zzdf.zzzN().booleanValue();
        }
        return flag;
    }

    public long getLastRefreshTime()
    {
        return zzaKD;
    }

    public String getString(String s)
    {
        zzcp zzcp1 = zzyn();
        if (zzcp1 == null)
        {
            zzbg.zzaz("getString called for closed container.");
            return zzdf.zzzP();
        }
        try
        {
            s = zzdf.zzg((com.google.android.gms.internal.zzag.zza)zzcp1.zzeD(s).getObject());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbg.zzaz((new StringBuilder()).append("Calling getString() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return zzdf.zzzP();
        }
        return s;
    }

    public boolean isDefault()
    {
        return getLastRefreshTime() == 0L;
    }

    void release()
    {
        zzaKA = null;
    }

    FunctionCallMacroCallback zzef(String s)
    {
        synchronized (zzaKB)
        {
            s = (FunctionCallMacroCallback)zzaKB.get(s);
        }
        return s;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    FunctionCallTagCallback zzeg(String s)
    {
        synchronized (zzaKC)
        {
            s = (FunctionCallTagCallback)zzaKC.get(s);
        }
        return s;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    void zzeh(String s)
    {
        zzyn().zzeh(s);
    }

    zzah zzei(String s)
    {
        if (!zzcb.zzzf().zzzg().equals(zzcb.zza.zzaMK));
        return new zzbo();
    }
}
