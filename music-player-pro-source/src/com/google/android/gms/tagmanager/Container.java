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

        final Container aqt;

        public Object b(String s, Map map)
        {
            FunctionCallMacroCallback functioncallmacrocallback = aqt.cp(s);
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
            aqt = Container.this;
            super();
        }

    }

    private class b
        implements s.a
    {

        final Container aqt;

        public Object b(String s, Map map)
        {
            FunctionCallTagCallback functioncalltagcallback = aqt.cq(s);
            if (functioncalltagcallback != null)
            {
                functioncalltagcallback.execute(s, map);
            }
            return di.ra();
        }

        private b()
        {
            aqt = Container.this;
            super();
        }

    }


    private final String aqm;
    private final DataLayer aqn;
    private ct aqo;
    private Map aqp;
    private Map aqq;
    private volatile long aqr;
    private volatile String aqs;
    private final Context mContext;

    Container(Context context, DataLayer datalayer, String s, long l, com.google.android.gms.internal.c.j j)
    {
        aqp = new HashMap();
        aqq = new HashMap();
        aqs = "";
        mContext = context;
        aqn = datalayer;
        aqm = s;
        aqr = l;
        a(j.gs);
        if (j.gr != null)
        {
            a(j.gr);
        }
    }

    Container(Context context, DataLayer datalayer, String s, long l, cr.c c)
    {
        aqp = new HashMap();
        aqq = new HashMap();
        aqs = "";
        mContext = context;
        aqn = datalayer;
        aqm = s;
        aqr = l;
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
            c = com.google.android.gms.tagmanager.cr.b(f);
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
        aqs = c.getVersion();
        ag ag = cs(aqs);
        a(new ct(mContext, c, aqn, new a(), new b(), ag));
    }

    private void a(ct ct1)
    {
        this;
        JVM INSTR monitorenter ;
        aqo = ct1;
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

        pk().l(arraylist);
    }

    private ct pk()
    {
        this;
        JVM INSTR monitorenter ;
        ct ct1 = aqo;
        this;
        JVM INSTR monitorexit ;
        return ct1;
        Exception exception;
        exception;
        throw exception;
    }

    FunctionCallMacroCallback cp(String s)
    {
        synchronized (aqp)
        {
            s = (FunctionCallMacroCallback)aqp.get(s);
        }
        return s;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    FunctionCallTagCallback cq(String s)
    {
        synchronized (aqq)
        {
            s = (FunctionCallTagCallback)aqq.get(s);
        }
        return s;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    void cr(String s)
    {
        pk().cr(s);
    }

    ag cs(String s)
    {
        if (!ce.qa().qb().equals(ce.a.ass));
        return new br();
    }

    public boolean getBoolean(String s)
    {
        ct ct1 = pk();
        if (ct1 == null)
        {
            bh.T("getBoolean called for closed container.");
            return di.qY().booleanValue();
        }
        boolean flag;
        try
        {
            flag = di.n((com.google.android.gms.internal.d.a)ct1.cT(s).getObject()).booleanValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            bh.T((new StringBuilder()).append("Calling getBoolean() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return di.qY().booleanValue();
        }
        return flag;
    }

    public String getContainerId()
    {
        return aqm;
    }

    public double getDouble(String s)
    {
        ct ct1 = pk();
        if (ct1 == null)
        {
            bh.T("getDouble called for closed container.");
            return di.qX().doubleValue();
        }
        double d;
        try
        {
            d = di.m((com.google.android.gms.internal.d.a)ct1.cT(s).getObject()).doubleValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            bh.T((new StringBuilder()).append("Calling getDouble() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return di.qX().doubleValue();
        }
        return d;
    }

    public long getLastRefreshTime()
    {
        return aqr;
    }

    public long getLong(String s)
    {
        ct ct1 = pk();
        if (ct1 == null)
        {
            bh.T("getLong called for closed container.");
            return di.qW().longValue();
        }
        long l;
        try
        {
            l = di.l((com.google.android.gms.internal.d.a)ct1.cT(s).getObject()).longValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            bh.T((new StringBuilder()).append("Calling getLong() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return di.qW().longValue();
        }
        return l;
    }

    public String getString(String s)
    {
        ct ct1 = pk();
        if (ct1 == null)
        {
            bh.T("getString called for closed container.");
            return di.ra();
        }
        try
        {
            s = di.j((com.google.android.gms.internal.d.a)ct1.cT(s).getObject());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            bh.T((new StringBuilder()).append("Calling getString() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return di.ra();
        }
        return s;
    }

    public boolean isDefault()
    {
        return getLastRefreshTime() == 0L;
    }

    String pj()
    {
        return aqs;
    }

    public void registerFunctionCallMacroCallback(String s, FunctionCallMacroCallback functioncallmacrocallback)
    {
        if (functioncallmacrocallback == null)
        {
            throw new NullPointerException("Macro handler must be non-null");
        }
        synchronized (aqp)
        {
            aqp.put(s, functioncallmacrocallback);
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
        synchronized (aqq)
        {
            aqq.put(s, functioncalltagcallback);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    void release()
    {
        aqo = null;
    }

    public void unregisterFunctionCallMacroCallback(String s)
    {
        synchronized (aqp)
        {
            aqp.remove(s);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void unregisterFunctionCallTagCallback(String s)
    {
        synchronized (aqq)
        {
            aqq.remove(s);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }
}
