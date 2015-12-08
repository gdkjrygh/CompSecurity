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

        final Container aex;

        public Object b(String s, Map map)
        {
            FunctionCallMacroCallback functioncallmacrocallback = aex.bF(s);
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
            aex = Container.this;
            super();
        }

    }

    private class b
        implements s.a
    {

        final Container aex;

        public Object b(String s, Map map)
        {
            FunctionCallTagCallback functioncalltagcallback = aex.bG(s);
            if (functioncalltagcallback != null)
            {
                functioncalltagcallback.execute(s, map);
            }
            return dh.mX();
        }

        private b()
        {
            aex = Container.this;
            super();
        }

    }


    private final String aeq;
    private final DataLayer aer;
    private cs aes;
    private Map aet;
    private Map aeu;
    private volatile long aev;
    private volatile String aew;
    private final Context mContext;

    Container(Context context, DataLayer datalayer, String s, long l, com.google.android.gms.internal.c.j j)
    {
        aet = new HashMap();
        aeu = new HashMap();
        aew = "";
        mContext = context;
        aer = datalayer;
        aeq = s;
        aev = l;
        a(j.fK);
        if (j.fJ != null)
        {
            a(j.fJ);
        }
    }

    Container(Context context, DataLayer datalayer, String s, long l, cq.c c)
    {
        aet = new HashMap();
        aeu = new HashMap();
        aew = "";
        mContext = context;
        aer = datalayer;
        aeq = s;
        aev = l;
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
        aew = c.getVersion();
        ag ag = bI(aew);
        a(new cs(mContext, c, aer, new a(), new b(), ag));
    }

    private void a(cs cs1)
    {
        this;
        JVM INSTR monitorenter ;
        aes = cs1;
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

        li().h(arraylist);
    }

    private cs li()
    {
        this;
        JVM INSTR monitorenter ;
        cs cs1 = aes;
        this;
        JVM INSTR monitorexit ;
        return cs1;
        Exception exception;
        exception;
        throw exception;
    }

    FunctionCallMacroCallback bF(String s)
    {
        synchronized (aet)
        {
            s = (FunctionCallMacroCallback)aet.get(s);
        }
        return s;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    FunctionCallTagCallback bG(String s)
    {
        synchronized (aeu)
        {
            s = (FunctionCallTagCallback)aeu.get(s);
        }
        return s;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    void bH(String s)
    {
        li().bH(s);
    }

    ag bI(String s)
    {
        if (!cd.lY().lZ().equals(cd.a.agA));
        return new bq();
    }

    public boolean getBoolean(String s)
    {
        cs cs1 = li();
        if (cs1 == null)
        {
            bh.A("getBoolean called for closed container.");
            return dh.mV().booleanValue();
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
            return dh.mV().booleanValue();
        }
        return flag;
    }

    public String getContainerId()
    {
        return aeq;
    }

    public double getDouble(String s)
    {
        cs cs1 = li();
        if (cs1 == null)
        {
            bh.A("getDouble called for closed container.");
            return dh.mU().doubleValue();
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
            return dh.mU().doubleValue();
        }
        return d;
    }

    public long getLastRefreshTime()
    {
        return aev;
    }

    public long getLong(String s)
    {
        cs cs1 = li();
        if (cs1 == null)
        {
            bh.A("getLong called for closed container.");
            return dh.mT().longValue();
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
            return dh.mT().longValue();
        }
        return l;
    }

    public String getString(String s)
    {
        cs cs1 = li();
        if (cs1 == null)
        {
            bh.A("getString called for closed container.");
            return dh.mX();
        }
        try
        {
            s = dh.j((com.google.android.gms.internal.d.a)cs1.cj(s).getObject());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            bh.A((new StringBuilder()).append("Calling getString() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return dh.mX();
        }
        return s;
    }

    public boolean isDefault()
    {
        return getLastRefreshTime() == 0L;
    }

    String lh()
    {
        return aew;
    }

    public void registerFunctionCallMacroCallback(String s, FunctionCallMacroCallback functioncallmacrocallback)
    {
        if (functioncallmacrocallback == null)
        {
            throw new NullPointerException("Macro handler must be non-null");
        }
        synchronized (aet)
        {
            aet.put(s, functioncallmacrocallback);
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
        synchronized (aeu)
        {
            aeu.put(s, functioncalltagcallback);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    void release()
    {
        aes = null;
    }

    public void unregisterFunctionCallMacroCallback(String s)
    {
        synchronized (aet)
        {
            aet.remove(s);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void unregisterFunctionCallTagCallback(String s)
    {
        synchronized (aeu)
        {
            aeu.remove(s);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }
}
