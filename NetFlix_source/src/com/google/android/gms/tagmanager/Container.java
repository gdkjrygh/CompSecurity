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

        final Container WQ;

        public Object b(String s, Map map)
        {
            FunctionCallMacroCallback functioncallmacrocallback = WQ.bn(s);
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
            WQ = Container.this;
            super();
        }

    }

    private class b
        implements s.a
    {

        final Container WQ;

        public Object b(String s, Map map)
        {
            FunctionCallTagCallback functioncalltagcallback = WQ.bo(s);
            if (functioncalltagcallback != null)
            {
                functioncalltagcallback.execute(s, map);
            }
            return dh.lS();
        }

        private b()
        {
            WQ = Container.this;
            super();
        }

    }


    private final String WJ;
    private final DataLayer WK;
    private cs WL;
    private Map WM;
    private Map WN;
    private volatile long WO;
    private volatile String WP;
    private final Context mContext;

    Container(Context context, DataLayer datalayer, String s, long l, com.google.android.gms.internal.c.j j)
    {
        WM = new HashMap();
        WN = new HashMap();
        WP = "";
        mContext = context;
        WK = datalayer;
        WJ = s;
        WO = l;
        a(j.fK);
        if (j.fJ != null)
        {
            a(j.fJ);
        }
    }

    Container(Context context, DataLayer datalayer, String s, long l, cq.c c)
    {
        WM = new HashMap();
        WN = new HashMap();
        WP = "";
        mContext = context;
        WK = datalayer;
        WJ = s;
        WO = l;
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
            bh.w((new StringBuilder()).append("Not loading resource: ").append(f).append(" because it is invalid: ").append(g.toString()).toString());
            return;
        }
        a(c);
    }

    private void a(cq.c c)
    {
        WP = c.getVersion();
        ag ag = bq(WP);
        a(new cs(mContext, c, WK, new a(), new b(), ag));
    }

    private void a(cs cs1)
    {
        this;
        JVM INSTR monitorenter ;
        WL = cs1;
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

        kd().e(arraylist);
    }

    private cs kd()
    {
        this;
        JVM INSTR monitorenter ;
        cs cs1 = WL;
        this;
        JVM INSTR monitorexit ;
        return cs1;
        Exception exception;
        exception;
        throw exception;
    }

    FunctionCallMacroCallback bn(String s)
    {
        synchronized (WM)
        {
            s = (FunctionCallMacroCallback)WM.get(s);
        }
        return s;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    FunctionCallTagCallback bo(String s)
    {
        synchronized (WN)
        {
            s = (FunctionCallTagCallback)WN.get(s);
        }
        return s;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    void bp(String s)
    {
        kd().bp(s);
    }

    ag bq(String s)
    {
        if (!cd.kT().kU().equals(cd.a.YV));
        return new bq();
    }

    public boolean getBoolean(String s)
    {
        cs cs1 = kd();
        if (cs1 == null)
        {
            bh.w("getBoolean called for closed container.");
            return dh.lQ().booleanValue();
        }
        boolean flag;
        try
        {
            flag = dh.n((com.google.android.gms.internal.d.a)cs1.bR(s).getObject()).booleanValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            bh.w((new StringBuilder()).append("Calling getBoolean() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return dh.lQ().booleanValue();
        }
        return flag;
    }

    public String getContainerId()
    {
        return WJ;
    }

    public double getDouble(String s)
    {
        cs cs1 = kd();
        if (cs1 == null)
        {
            bh.w("getDouble called for closed container.");
            return dh.lP().doubleValue();
        }
        double d;
        try
        {
            d = dh.m((com.google.android.gms.internal.d.a)cs1.bR(s).getObject()).doubleValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            bh.w((new StringBuilder()).append("Calling getDouble() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return dh.lP().doubleValue();
        }
        return d;
    }

    public long getLastRefreshTime()
    {
        return WO;
    }

    public long getLong(String s)
    {
        cs cs1 = kd();
        if (cs1 == null)
        {
            bh.w("getLong called for closed container.");
            return dh.lO().longValue();
        }
        long l;
        try
        {
            l = dh.l((com.google.android.gms.internal.d.a)cs1.bR(s).getObject()).longValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            bh.w((new StringBuilder()).append("Calling getLong() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return dh.lO().longValue();
        }
        return l;
    }

    public String getString(String s)
    {
        cs cs1 = kd();
        if (cs1 == null)
        {
            bh.w("getString called for closed container.");
            return dh.lS();
        }
        try
        {
            s = dh.j((com.google.android.gms.internal.d.a)cs1.bR(s).getObject());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            bh.w((new StringBuilder()).append("Calling getString() threw an exception: ").append(s.getMessage()).append(" Returning default value.").toString());
            return dh.lS();
        }
        return s;
    }

    public boolean isDefault()
    {
        return getLastRefreshTime() == 0L;
    }

    String kc()
    {
        return WP;
    }

    public void registerFunctionCallMacroCallback(String s, FunctionCallMacroCallback functioncallmacrocallback)
    {
        if (functioncallmacrocallback == null)
        {
            throw new NullPointerException("Macro handler must be non-null");
        }
        synchronized (WM)
        {
            WM.put(s, functioncallmacrocallback);
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
        synchronized (WN)
        {
            WN.put(s, functioncalltagcallback);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    void release()
    {
        WL = null;
    }

    public void unregisterFunctionCallMacroCallback(String s)
    {
        synchronized (WM)
        {
            WM.remove(s);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void unregisterFunctionCallTagCallback(String s)
    {
        synchronized (WN)
        {
            WN.remove(s);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }
}
