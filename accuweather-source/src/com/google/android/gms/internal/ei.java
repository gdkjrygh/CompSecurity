// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            ep, ej, el, eh, 
//            ek

public class ei
{

    private static final ei rM;
    public static final String rN;
    private final Object lq = new Object();
    public final String rO = ep.bO();
    private final ej rP;
    private BigInteger rQ;
    private final HashSet rR = new HashSet();
    private final HashMap rS = new HashMap();
    private boolean rT;

    private ei()
    {
        rQ = BigInteger.ONE;
        rT = false;
        rP = new ej(rO);
    }

    public static Bundle a(Context context, ek ek1, String s)
    {
        return rM.b(context, ek1, s);
    }

    public static void b(HashSet hashset)
    {
        rM.c(hashset);
    }

    public static ei bC()
    {
        return rM;
    }

    public static String bD()
    {
        return rM.bE();
    }

    public static ej bF()
    {
        return rM.bG();
    }

    public static boolean bH()
    {
        return rM.bI();
    }

    public void a(eh eh1)
    {
        synchronized (lq)
        {
            rR.add(eh1);
        }
        return;
        eh1;
        obj;
        JVM INSTR monitorexit ;
        throw eh1;
    }

    public void a(String s, el el1)
    {
        synchronized (lq)
        {
            rS.put(s, el1);
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public Bundle b(Context context, ek ek1, String s)
    {
        Object obj = lq;
        obj;
        JVM INSTR monitorenter ;
        Bundle bundle;
        bundle = new Bundle();
        bundle.putBundle("app", rP.b(context, s));
        context = new Bundle();
        String s1;
        for (s = rS.keySet().iterator(); s.hasNext(); context.putBundle(s1, ((el)rS.get(s1)).toBundle()))
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
        for (s = rR.iterator(); s.hasNext(); context.add(((eh)s.next()).toBundle())) { }
        bundle.putParcelableArrayList("ads", context);
        ek1.a(rR);
        rR.clear();
        obj;
        JVM INSTR monitorexit ;
        return bundle;
    }

    public String bE()
    {
        String s;
        synchronized (lq)
        {
            s = rQ.toString();
            rQ = rQ.add(BigInteger.ONE);
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public ej bG()
    {
        ej ej1;
        synchronized (lq)
        {
            ej1 = rP;
        }
        return ej1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean bI()
    {
        boolean flag;
        synchronized (lq)
        {
            flag = rT;
            rT = true;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void c(HashSet hashset)
    {
        synchronized (lq)
        {
            rR.addAll(hashset);
        }
        return;
        hashset;
        obj;
        JVM INSTR monitorexit ;
        throw hashset;
    }

    static 
    {
        rM = new ei();
        rN = rM.rO;
    }
}
