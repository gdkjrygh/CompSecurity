// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzmq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbg, bl, DataLayer, zzdf, 
//            as, ax, al, g

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

    private class a
        implements zzt.zza
    {

        final Container a;

        public Object zzc(String s, Map map)
        {
            FunctionCallMacroCallback functioncallmacrocallback = a.zzdx(s);
            if (functioncallmacrocallback == null)
            {
                return null;
            } else
            {
                return functioncallmacrocallback.getValue(s, map);
            }
        }

        private a()
        {
            a = Container.this;
            super();
        }

    }

    private class b
        implements zzt.zza
    {

        final Container a;

        public Object zzc(String s, Map map)
        {
            FunctionCallTagCallback functioncalltagcallback = a.zzdy(s);
            if (functioncalltagcallback != null)
            {
                functioncalltagcallback.execute(s, map);
            }
            return zzdf.zzxV();
        }

        private b()
        {
            a = Container.this;
            super();
        }

    }


    private final Context mContext;
    private final String zzaCk;
    private final DataLayer zzaCl;
    private bl zzaCm;
    private Map zzaCn;
    private Map zzaCo;
    private volatile long zzaCp;
    private volatile String zzaCq;

    Container(Context context, DataLayer datalayer, String s, long l, com.google.android.gms.internal.zzc.zzj zzj)
    {
        zzaCn = new HashMap();
        zzaCo = new HashMap();
        zzaCq = "";
        mContext = context;
        zzaCl = datalayer;
        zzaCk = s;
        zzaCp = l;
        zza(zzj.zzhh);
        if (zzj.zzhg != null)
        {
            zza(zzj.zzhg);
        }
    }

    Container(Context context, DataLayer datalayer, String s, long l, com.google.android.gms.internal.zzmq.zzc zzc)
    {
        zzaCn = new HashMap();
        zzaCo = new HashMap();
        zzaCq = "";
        mContext = context;
        zzaCl = datalayer;
        zzaCk = s;
        zzaCp = l;
        zza(zzc);
    }

    private void zza(com.google.android.gms.internal.zzc.zzf zzf)
    {
        if (zzf == null)
        {
            throw new NullPointerException();
        }
        com.google.android.gms.internal.zzmq.zzc zzc;
        try
        {
            zzc = zzmq.zzb(zzf);
        }
        catch (com.google.android.gms.internal.zzmq.zzg zzg)
        {
            zzbg.zzak((new StringBuilder()).append("Not loading resource: ").append(zzf).append(" because it is invalid: ").append(zzg.toString()).toString());
            return;
        }
        zza(zzc);
    }

    private void zza(com.google.android.gms.internal.zzmq.zzc zzc)
    {
        zzaCq = zzc.getVersion();
        g g = zzdA(zzaCq);
        zza(new bl(mContext, zzc, zzaCl, new a(), new b(), g));
        if (getBoolean("_gtm.loadEventEnabled"))
        {
            zzaCl.pushEvent("gtm.load", DataLayer.mapOf(new Object[] {
                "gtm.id", zzaCk
            }));
        }
    }

    private void zza(bl bl1)
    {
        this;
        JVM INSTR monitorenter ;
        zzaCm = bl1;
        this;
        JVM INSTR monitorexit ;
        return;
        bl1;
        throw bl1;
    }

    private void zza(com.google.android.gms.internal.zzc.zzi azzi[])
    {
        ArrayList arraylist = new ArrayList();
        int j = azzi.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(azzi[i]);
        }

        zzwt().a(arraylist);
    }

    private bl zzwt()
    {
        this;
        JVM INSTR monitorenter ;
        bl bl1 = zzaCm;
        this;
        JVM INSTR monitorexit ;
        return bl1;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean getBoolean(String s)
    {
        bl bl1 = zzwt();
        if (bl1 == null)
        {
            zzbg.zzak("getBoolean called for closed container.");
            return zzdf.zzxT().booleanValue();
        }
        boolean flag;
        try
        {
            flag = zzdf.zzk((com.google.android.gms.internal.zzd.zza)bl1.b(s).a()).booleanValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbg.zzak((new StringBuilder()).append("Calling getBoolean() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return zzdf.zzxT().booleanValue();
        }
        return flag;
    }

    public String getContainerId()
    {
        return zzaCk;
    }

    public double getDouble(String s)
    {
        bl bl1 = zzwt();
        if (bl1 == null)
        {
            zzbg.zzak("getDouble called for closed container.");
            return zzdf.zzxS().doubleValue();
        }
        double d;
        try
        {
            d = zzdf.zzj((com.google.android.gms.internal.zzd.zza)bl1.b(s).a()).doubleValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbg.zzak((new StringBuilder()).append("Calling getDouble() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return zzdf.zzxS().doubleValue();
        }
        return d;
    }

    public long getLastRefreshTime()
    {
        return zzaCp;
    }

    public long getLong(String s)
    {
        bl bl1 = zzwt();
        if (bl1 == null)
        {
            zzbg.zzak("getLong called for closed container.");
            return zzdf.zzxR().longValue();
        }
        long l;
        try
        {
            l = zzdf.zzi((com.google.android.gms.internal.zzd.zza)bl1.b(s).a()).longValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbg.zzak((new StringBuilder()).append("Calling getLong() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return zzdf.zzxR().longValue();
        }
        return l;
    }

    public String getString(String s)
    {
        bl bl1 = zzwt();
        if (bl1 == null)
        {
            zzbg.zzak("getString called for closed container.");
            return zzdf.zzxV();
        }
        try
        {
            s = zzdf.zzg((com.google.android.gms.internal.zzd.zza)bl1.b(s).a());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzbg.zzak((new StringBuilder()).append("Calling getString() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return zzdf.zzxV();
        }
        return s;
    }

    public boolean isDefault()
    {
        return getLastRefreshTime() == 0L;
    }

    public void registerFunctionCallMacroCallback(String s, FunctionCallMacroCallback functioncallmacrocallback)
    {
        if (functioncallmacrocallback == null)
        {
            throw new NullPointerException("Macro handler must be non-null");
        }
        synchronized (zzaCn)
        {
            zzaCn.put(s, functioncallmacrocallback);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void registerFunctionCallTagCallback(String s, FunctionCallTagCallback functioncalltagcallback)
    {
        if (functioncalltagcallback == null)
        {
            throw new NullPointerException("Tag callback must be non-null");
        }
        synchronized (zzaCo)
        {
            zzaCo.put(s, functioncalltagcallback);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    void release()
    {
        zzaCm = null;
    }

    public void unregisterFunctionCallMacroCallback(String s)
    {
        synchronized (zzaCn)
        {
            zzaCn.remove(s);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void unregisterFunctionCallTagCallback(String s)
    {
        synchronized (zzaCo)
        {
            zzaCo.remove(s);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    g zzdA(String s)
    {
        if (!ax.a().b().equals(ax.a.c));
        return new al();
    }

    FunctionCallMacroCallback zzdx(String s)
    {
        synchronized (zzaCn)
        {
            s = (FunctionCallMacroCallback)zzaCn.get(s);
        }
        return s;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    FunctionCallTagCallback zzdy(String s)
    {
        synchronized (zzaCo)
        {
            s = (FunctionCallTagCallback)zzaCo.get(s);
        }
        return s;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    void zzdz(String s)
    {
        zzwt().a(s);
    }

    String zzws()
    {
        return zzaCq;
    }
}
