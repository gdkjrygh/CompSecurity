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
//            bn, gj, gc, ey, 
//            ge, ga, gd, gh, 
//            iv, cf, gt, kc, 
//            am, al, an

public class gb
    implements cf.b
{

    private static final gb vJ;
    public static final String vK;
    private Context mContext;
    private final Object mw = new Object();
    private am nu;
    private al nv;
    private ey nw;
    private gt qs;
    private boolean uH;
    private boolean uI;
    public final String vL = gj._mthdo();
    private final gc vM;
    private BigInteger vN;
    private final HashSet vO = new HashSet();
    private final HashMap vP = new HashMap();
    private boolean vQ;
    private boolean vR;
    private an vS;
    private LinkedList vT;
    private boolean vU;
    private Bundle vV;
    private String vW;

    private gb()
    {
        vN = BigInteger.ONE;
        vQ = false;
        uH = true;
        vR = false;
        uI = true;
        nu = null;
        vS = null;
        nv = null;
        vT = new LinkedList();
        vU = false;
        vV = bn.bs();
        nw = null;
        vM = new gc(vL);
    }

    public static Bundle a(Context context, gd gd1, String s)
    {
        return vJ.b(context, gd1, s);
    }

    public static void a(Context context, gt gt1)
    {
        vJ.b(context, gt1);
    }

    public static void a(Context context, boolean flag)
    {
        vJ.b(context, flag);
    }

    public static void b(HashSet hashset)
    {
        vJ.c(hashset);
    }

    public static Bundle bD()
    {
        return vJ.dg();
    }

    public static String c(int i, String s)
    {
        return vJ.d(i, s);
    }

    public static gb cU()
    {
        return vJ;
    }

    public static String cW()
    {
        return vJ.cX();
    }

    public static gc cY()
    {
        return vJ.cZ();
    }

    public static boolean da()
    {
        return vJ.db();
    }

    public static boolean dc()
    {
        return vJ.dd();
    }

    public static String de()
    {
        return vJ.df();
    }

    public static void e(Throwable throwable)
    {
        vJ.f(throwable);
    }

    public void a(Bundle bundle)
    {
        Object obj = mw;
        obj;
        JVM INSTR monitorenter ;
        vU = true;
        vV = bundle;
        for (; !vT.isEmpty(); ey.a(mContext, (Thread)vT.remove(0), qs)) { }
        break MISSING_BLOCK_LABEL_58;
        bundle;
        obj;
        JVM INSTR monitorexit ;
        throw bundle;
        obj;
        JVM INSTR monitorexit ;
    }

    public void a(ga ga1)
    {
        synchronized (mw)
        {
            vO.add(ga1);
        }
        return;
        ga1;
        obj;
        JVM INSTR monitorexit ;
        throw ga1;
    }

    public void a(String s, ge ge1)
    {
        synchronized (mw)
        {
            vP.put(s, ge1);
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void a(Thread thread)
    {
        Object obj = mw;
        obj;
        JVM INSTR monitorenter ;
        if (!vU)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        ey.a(mContext, thread, qs);
_L2:
        return;
        vT.add(thread);
        if (true) goto _L2; else goto _L1
_L1:
        thread;
        obj;
        JVM INSTR monitorexit ;
        throw thread;
    }

    public Bundle b(Context context, gd gd1, String s)
    {
        Object obj = mw;
        obj;
        JVM INSTR monitorenter ;
        Bundle bundle;
        bundle = new Bundle();
        bundle.putBundle("app", vM.b(context, s));
        context = new Bundle();
        String s1;
        for (s = vP.keySet().iterator(); s.hasNext(); context.putBundle(s1, ((ge)vP.get(s1)).toBundle()))
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
        for (s = vO.iterator(); s.hasNext(); context.add(((ga)s.next()).toBundle())) { }
        bundle.putParcelableArrayList("ads", context);
        gd1.a(vO);
        vO.clear();
        obj;
        JVM INSTR monitorexit ;
        return bundle;
    }

    public void b(Context context, gt gt1)
    {
        synchronized (mw)
        {
            if (!vR)
            {
                mContext = context.getApplicationContext();
                qs = gt1;
                uH = gh.o(context);
                iv.H(context);
                cf.a(context, this);
                a(Thread.currentThread());
                vW = gj.c(context, gt1.wD);
                vR = true;
            }
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void b(Context context, boolean flag)
    {
        synchronized (mw)
        {
            if (flag != uH)
            {
                uH = flag;
                gh.a(context, flag);
            }
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void c(HashSet hashset)
    {
        synchronized (mw)
        {
            vO.addAll(hashset);
        }
        return;
        hashset;
        obj;
        JVM INSTR monitorexit ;
        throw hashset;
    }

    public boolean cV()
    {
        boolean flag;
        synchronized (mw)
        {
            flag = uI;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String cX()
    {
        String s;
        synchronized (mw)
        {
            s = vN.toString();
            vN = vN.add(BigInteger.ONE);
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public gc cZ()
    {
        gc gc1;
        synchronized (mw)
        {
            gc1 = vM;
        }
        return gc1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String d(int i, String s)
    {
        Resources resources;
        if (qs.wG)
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

    public boolean db()
    {
        boolean flag;
        synchronized (mw)
        {
            flag = vQ;
            vQ = true;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean dd()
    {
        boolean flag;
        synchronized (mw)
        {
            flag = uH;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String df()
    {
        String s;
        synchronized (mw)
        {
            s = vW;
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Bundle dg()
    {
        Bundle bundle;
        synchronized (mw)
        {
            bundle = vV;
        }
        return bundle;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void f(Throwable throwable)
    {
        if (vR)
        {
            (new ey(mContext, qs, null, null)).b(throwable);
        }
    }

    public an l(Context context)
    {
        if (!bD().getBoolean(bn.pd.getKey(), false) || !kc.hE() || cV())
        {
            return null;
        }
        synchronized (mw)
        {
            if (nu != null)
            {
                break MISSING_BLOCK_LABEL_83;
            }
            if (context instanceof Activity)
            {
                break MISSING_BLOCK_LABEL_61;
            }
        }
        return null;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        nu = new am((Application)context.getApplicationContext(), (Activity)context);
        if (nv == null)
        {
            nv = new al();
        }
        if (vS == null)
        {
            vS = new an(nu, nv, vV, new ey(mContext, qs, null, null));
        }
        vS.aV();
        context = vS;
        obj;
        JVM INSTR monitorexit ;
        return context;
    }

    public void v(boolean flag)
    {
        synchronized (mw)
        {
            uI = flag;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        vJ = new gb();
        vK = vJ.vL;
    }
}
