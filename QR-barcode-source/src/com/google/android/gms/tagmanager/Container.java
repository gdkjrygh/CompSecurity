// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cr, bh, ct, ce, 
//            br, di, bz, DataLayer, 
//            ag

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
        implements s.a
    {

        final Container aoj;

        public Object b(String s, Map map)
        {
            FunctionCallMacroCallback functioncallmacrocallback = aoj.cn(s);
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
            aoj = Container.this;
            super();
        }

    }

    private class b
        implements s.a
    {

        final Container aoj;

        public Object b(String s, Map map)
        {
            FunctionCallTagCallback functioncalltagcallback = aoj.co(s);
            if (functioncalltagcallback != null)
            {
                functioncalltagcallback.execute(s, map);
            }
            return di.pJ();
        }

        private b()
        {
            aoj = Container.this;
            super();
        }

    }


    private final String aoc;
    private final DataLayer aod;
    private ct aoe;
    private Map aof;
    private Map aog;
    private volatile long aoh;
    private volatile String aoi;
    private final Context mContext;

    Container(Context context, DataLayer datalayer, String s, long l, com.google.android.gms.internal.c.j j)
    {
        aof = new HashMap();
        aog = new HashMap();
        aoi = "";
        mContext = context;
        aod = datalayer;
        aoc = s;
        aoh = l;
        a(j.gs);
        if (j.gr != null)
        {
            a(j.gr);
        }
    }

    Container(Context context, DataLayer datalayer, String s, long l, cr.c c)
    {
        aof = new HashMap();
        aog = new HashMap();
        aoi = "";
        mContext = context;
        aod = datalayer;
        aoc = s;
        aoh = l;
        a(c);
    }

    private void a(com.google.android.gms.internal.c.f f)
    {
        if (f == null)
        {
            throw new NullPointerException();
        }
        cr.c c;
        try
        {
            c = cr.b(f);
        }
        catch (cr.g g)
        {
            bh.T((new StringBuilder()).append("Not loading resource: ").append(f).append(" because it is invalid: ").append(g.toString()).toString());
            return;
        }
        a(c);
    }

    private void a(cr.c c)
    {
        aoi = c.getVersion();
        ag ag = cq(aoi);
        a(new ct(mContext, c, aod, new a(), new b(), ag));
    }

    private void a(ct ct1)
    {
        this;
        JVM INSTR monitorenter ;
        aoe = ct1;
        this;
        JVM INSTR monitorexit ;
        return;
        ct1;
        throw ct1;
    }

    private void a(com.google.android.gms.internal.c.i ai[])
    {
        ArrayList arraylist = new ArrayList();
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(ai[i]);
        }

        nT().k(arraylist);
    }

    private ct nT()
    {
        this;
        JVM INSTR monitorenter ;
        ct ct1 = aoe;
        this;
        JVM INSTR monitorexit ;
        return ct1;
        Exception exception;
        exception;
        throw exception;
    }

    FunctionCallMacroCallback cn(String s)
    {
        synchronized (aof)
        {
            s = (FunctionCallMacroCallback)aof.get(s);
        }
        return s;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    FunctionCallTagCallback co(String s)
    {
        synchronized (aog)
        {
            s = (FunctionCallTagCallback)aog.get(s);
        }
        return s;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    void cp(String s)
    {
        nT().cp(s);
    }

    ag cq(String s)
    {
        if (!ce.oJ().oK().equals(ce.a.aqj));
        return new br();
    }

    public boolean getBoolean(String s)
    {
        ct ct1 = nT();
        if (ct1 == null)
        {
            bh.T("getBoolean called for closed container.");
            return di.pH().booleanValue();
        }
        boolean flag;
        try
        {
            flag = di.n((com.google.android.gms.internal.d.a)ct1.cR(s).getObject()).booleanValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            bh.T((new StringBuilder()).append("Calling getBoolean() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return di.pH().booleanValue();
        }
        return flag;
    }

    public String getContainerId()
    {
        return aoc;
    }

    public double getDouble(String s)
    {
        ct ct1 = nT();
        if (ct1 == null)
        {
            bh.T("getDouble called for closed container.");
            return di.pG().doubleValue();
        }
        double d;
        try
        {
            d = di.m((com.google.android.gms.internal.d.a)ct1.cR(s).getObject()).doubleValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            bh.T((new StringBuilder()).append("Calling getDouble() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return di.pG().doubleValue();
        }
        return d;
    }

    public long getLastRefreshTime()
    {
        return aoh;
    }

    public long getLong(String s)
    {
        ct ct1 = nT();
        if (ct1 == null)
        {
            bh.T("getLong called for closed container.");
            return di.pF().longValue();
        }
        long l;
        try
        {
            l = di.l((com.google.android.gms.internal.d.a)ct1.cR(s).getObject()).longValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            bh.T((new StringBuilder()).append("Calling getLong() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return di.pF().longValue();
        }
        return l;
    }

    public String getString(String s)
    {
        ct ct1 = nT();
        if (ct1 == null)
        {
            bh.T("getString called for closed container.");
            return di.pJ();
        }
        try
        {
            s = di.j((com.google.android.gms.internal.d.a)ct1.cR(s).getObject());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            bh.T((new StringBuilder()).append("Calling getString() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return di.pJ();
        }
        return s;
    }

    public boolean isDefault()
    {
        return getLastRefreshTime() == 0L;
    }

    String nS()
    {
        return aoi;
    }

    public void registerFunctionCallMacroCallback(String s, FunctionCallMacroCallback functioncallmacrocallback)
    {
        if (functioncallmacrocallback == null)
        {
            throw new NullPointerException("Macro handler must be non-null");
        }
        synchronized (aof)
        {
            aof.put(s, functioncallmacrocallback);
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
        synchronized (aog)
        {
            aog.put(s, functioncalltagcallback);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    void release()
    {
        aoe = null;
    }

    public void unregisterFunctionCallMacroCallback(String s)
    {
        synchronized (aof)
        {
            aof.remove(s);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void unregisterFunctionCallTagCallback(String s)
    {
        synchronized (aog)
        {
            aog.remove(s);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }
}
