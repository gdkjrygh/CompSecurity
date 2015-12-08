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
//            cq, bh, cs, cd, 
//            bq, dh, by, DataLayer, 
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

        final Container aeA;

        public Object b(String s, Map map)
        {
            FunctionCallMacroCallback functioncallmacrocallback = aeA.bF(s);
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
            aeA = Container.this;
            super();
        }

    }

    private class b
        implements s.a
    {

        final Container aeA;

        public Object b(String s, Map map)
        {
            FunctionCallTagCallback functioncalltagcallback = aeA.bG(s);
            if (functioncalltagcallback != null)
            {
                functioncalltagcallback.execute(s, map);
            }
            return dh.nc();
        }

        private b()
        {
            aeA = Container.this;
            super();
        }

    }


    private final String aet;
    private final DataLayer aeu;
    private cs aev;
    private Map aew;
    private Map aex;
    private volatile long aey;
    private volatile String aez;
    private final Context mContext;

    Container(Context context, DataLayer datalayer, String s, long l, com.google.android.gms.internal.c.j j)
    {
        aew = new HashMap();
        aex = new HashMap();
        aez = "";
        mContext = context;
        aeu = datalayer;
        aet = s;
        aey = l;
        a(j.fK);
        if (j.fJ != null)
        {
            a(j.fJ);
        }
    }

    Container(Context context, DataLayer datalayer, String s, long l, cq.c c)
    {
        aew = new HashMap();
        aex = new HashMap();
        aez = "";
        mContext = context;
        aeu = datalayer;
        aet = s;
        aey = l;
        a(c);
    }

    private void a(com.google.android.gms.internal.c.f f)
    {
        if (f == null)
        {
            throw new NullPointerException();
        }
        cq.c c;
        try
        {
            c = cq.b(f);
        }
        catch (cq.g g)
        {
            bh.A((new StringBuilder()).append("Not loading resource: ").append(f).append(" because it is invalid: ").append(g.toString()).toString());
            return;
        }
        a(c);
    }

    private void a(cq.c c)
    {
        aez = c.getVersion();
        ag ag = bI(aez);
        a(new cs(mContext, c, aeu, new a(), new b(), ag));
    }

    private void a(cs cs1)
    {
        this;
        JVM INSTR monitorenter ;
        aev = cs1;
        this;
        JVM INSTR monitorexit ;
        return;
        cs1;
        throw cs1;
    }

    private void a(com.google.android.gms.internal.c.i ai[])
    {
        ArrayList arraylist = new ArrayList();
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(ai[i]);
        }

        ln().h(arraylist);
    }

    private cs ln()
    {
        this;
        JVM INSTR monitorenter ;
        cs cs1 = aev;
        this;
        JVM INSTR monitorexit ;
        return cs1;
        Exception exception;
        exception;
        throw exception;
    }

    FunctionCallMacroCallback bF(String s)
    {
        synchronized (aew)
        {
            s = (FunctionCallMacroCallback)aew.get(s);
        }
        return s;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    FunctionCallTagCallback bG(String s)
    {
        synchronized (aex)
        {
            s = (FunctionCallTagCallback)aex.get(s);
        }
        return s;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    void bH(String s)
    {
        ln().bH(s);
    }

    ag bI(String s)
    {
        if (!cd.md().me().equals(cd.a.agD));
        return new bq();
    }

    public boolean getBoolean(String s)
    {
        cs cs1 = ln();
        if (cs1 == null)
        {
            bh.A("getBoolean called for closed container.");
            return dh.na().booleanValue();
        }
        boolean flag;
        try
        {
            flag = dh.n((com.google.android.gms.internal.d.a)cs1.cj(s).getObject()).booleanValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            bh.A((new StringBuilder()).append("Calling getBoolean() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return dh.na().booleanValue();
        }
        return flag;
    }

    public String getContainerId()
    {
        return aet;
    }

    public double getDouble(String s)
    {
        cs cs1 = ln();
        if (cs1 == null)
        {
            bh.A("getDouble called for closed container.");
            return dh.mZ().doubleValue();
        }
        double d;
        try
        {
            d = dh.m((com.google.android.gms.internal.d.a)cs1.cj(s).getObject()).doubleValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            bh.A((new StringBuilder()).append("Calling getDouble() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return dh.mZ().doubleValue();
        }
        return d;
    }

    public long getLastRefreshTime()
    {
        return aey;
    }

    public long getLong(String s)
    {
        cs cs1 = ln();
        if (cs1 == null)
        {
            bh.A("getLong called for closed container.");
            return dh.mY().longValue();
        }
        long l;
        try
        {
            l = dh.l((com.google.android.gms.internal.d.a)cs1.cj(s).getObject()).longValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            bh.A((new StringBuilder()).append("Calling getLong() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return dh.mY().longValue();
        }
        return l;
    }

    public String getString(String s)
    {
        cs cs1 = ln();
        if (cs1 == null)
        {
            bh.A("getString called for closed container.");
            return dh.nc();
        }
        try
        {
            s = dh.j((com.google.android.gms.internal.d.a)cs1.cj(s).getObject());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            bh.A((new StringBuilder()).append("Calling getString() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return dh.nc();
        }
        return s;
    }

    public boolean isDefault()
    {
        return getLastRefreshTime() == 0L;
    }

    String lm()
    {
        return aez;
    }

    public void registerFunctionCallMacroCallback(String s, FunctionCallMacroCallback functioncallmacrocallback)
    {
        if (functioncallmacrocallback == null)
        {
            throw new NullPointerException("Macro handler must be non-null");
        }
        synchronized (aew)
        {
            aew.put(s, functioncallmacrocallback);
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
        synchronized (aex)
        {
            aex.put(s, functioncalltagcallback);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    void release()
    {
        aev = null;
    }

    public void unregisterFunctionCallMacroCallback(String s)
    {
        synchronized (aew)
        {
            aew.remove(s);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void unregisterFunctionCallTagCallback(String s)
    {
        synchronized (aex)
        {
            aex.remove(s);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }
}
