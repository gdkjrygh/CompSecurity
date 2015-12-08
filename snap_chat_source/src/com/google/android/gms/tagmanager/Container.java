// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzco, zzbf, zzde, zzbv, 
//            zzca, zzbn, DataLayer, zzag

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

    class zza
        implements zzs.zza
    {

        final Container zzaxD;

        public Object zzc(String s, Map map)
        {
            FunctionCallMacroCallback functioncallmacrocallback = zzaxD.zzcM(s);
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
            zzaxD = Container.this;
            super();
        }

    }

    class zzb
        implements zzs.zza
    {

        final Container zzaxD;

        public Object zzc(String s, Map map)
        {
            FunctionCallTagCallback functioncalltagcallback = zzaxD.zzcN(s);
            if (functioncalltagcallback != null)
            {
                functioncalltagcallback.execute(s, map);
            }
            return zzde.zzue();
        }

        private zzb()
        {
            zzaxD = Container.this;
            super();
        }

    }


    private final Context mContext;
    private Map zzaxA;
    private volatile long zzaxB;
    private volatile String zzaxC;
    private final String zzaxw;
    private final DataLayer zzaxx;
    private zzco zzaxy;
    private Map zzaxz;

    Container(Context context, DataLayer datalayer, String s, long l, com.google.android.gms.internal.zzvl.zzc zzc)
    {
        zzaxz = new HashMap();
        zzaxA = new HashMap();
        zzaxC = "";
        mContext = context;
        zzaxx = datalayer;
        zzaxw = s;
        zzaxB = l;
        zza(zzc);
    }

    private void zza(com.google.android.gms.internal.zzvl.zzc zzc)
    {
        zzaxC = zzc.getVersion();
        zzag zzag = zzcP(zzaxC);
        zza(new zzco(mContext, zzc, zzaxx, new zza(), new zzb(), zzag));
    }

    private void zza(zzco zzco1)
    {
        this;
        JVM INSTR monitorenter ;
        zzaxy = zzco1;
        this;
        JVM INSTR monitorexit ;
        return;
        zzco1;
        throw zzco1;
    }

    private zzco zzsJ()
    {
        this;
        JVM INSTR monitorenter ;
        zzco zzco1 = zzaxy;
        this;
        JVM INSTR monitorexit ;
        return zzco1;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean getBoolean(String s)
    {
        zzco zzco1 = zzsJ();
        if (zzco1 == null)
        {
            zzbf.zzZ("getBoolean called for closed container.");
            return zzde.zzuc().booleanValue();
        }
        boolean flag;
        try
        {
            flag = zzde.zzk((com.google.android.gms.internal.zzd.zza)zzco1.zzdi(s).getObject()).booleanValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbf.zzZ((new StringBuilder("Calling getBoolean() threw an exception: ")).append(s.getMessage()).append(" Returning default value.").toString());
            return zzde.zzuc().booleanValue();
        }
        return flag;
    }

    public String getContainerId()
    {
        return zzaxw;
    }

    public long getLastRefreshTime()
    {
        return zzaxB;
    }

    public String getString(String s)
    {
        zzco zzco1 = zzsJ();
        if (zzco1 == null)
        {
            zzbf.zzZ("getString called for closed container.");
            return zzde.zzue();
        }
        try
        {
            s = zzde.zzg((com.google.android.gms.internal.zzd.zza)zzco1.zzdi(s).getObject());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbf.zzZ((new StringBuilder("Calling getString() threw an exception: ")).append(s.getMessage()).append(" Returning default value.").toString());
            return zzde.zzue();
        }
        return s;
    }

    public boolean isDefault()
    {
        return getLastRefreshTime() == 0L;
    }

    void release()
    {
        zzaxy = null;
    }

    FunctionCallMacroCallback zzcM(String s)
    {
        synchronized (zzaxz)
        {
            s = (FunctionCallMacroCallback)zzaxz.get(s);
        }
        return s;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    FunctionCallTagCallback zzcN(String s)
    {
        synchronized (zzaxA)
        {
            s = (FunctionCallTagCallback)zzaxA.get(s);
        }
        return s;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    void zzcO(String s)
    {
        zzsJ().zzcO(s);
    }

    zzag zzcP(String s)
    {
        zzca.zztx().zzty().equals(zzca.zza.zzazD);
        return new zzbn();
    }
}
