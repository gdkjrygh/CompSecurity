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
//            bn, gi, gb, ex, 
//            gd, fz, gc, gg, 
//            iy, ck, gs, lf, 
//            ll, am, al, an, 
//            ld

public class ga
    implements ck.b
{

    private static final ga vX;
    public static final String vY;
    private Context mContext;
    private final Object mH = new Object();
    private am nE;
    private al nF;
    private ex nG;
    private gs qJ;
    private boolean uV;
    private boolean uW;
    public final String vZ = gi.dx();
    private final gb wa;
    private ld wb;
    private BigInteger wc;
    private final HashSet wd = new HashSet();
    private final HashMap we = new HashMap();
    private boolean wf;
    private boolean wg;
    private an wh;
    private LinkedList wi;
    private boolean wj;
    private Bundle wk;
    private String wl;

    private ga()
    {
        wc = BigInteger.ONE;
        wf = false;
        uV = true;
        wg = false;
        uW = true;
        nE = null;
        wh = null;
        nF = null;
        wi = new LinkedList();
        wj = false;
        wk = bn.by();
        nG = null;
        wa = new gb(vZ);
    }

    public static Bundle a(Context context, gc gc1, String s)
    {
        return vX.b(context, gc1, s);
    }

    public static void a(Context context, gs gs1)
    {
        vX.b(context, gs1);
    }

    public static void a(Context context, boolean flag)
    {
        vX.b(context, flag);
    }

    public static void b(HashSet hashset)
    {
        vX.c(hashset);
    }

    public static Bundle bN()
    {
        return vX.dp();
    }

    public static String c(int i, String s)
    {
        return vX.d(i, s);
    }

    public static ga dc()
    {
        return vX;
    }

    public static String df()
    {
        return vX.dg();
    }

    public static gb dh()
    {
        return vX.di();
    }

    public static boolean dj()
    {
        return vX.dk();
    }

    public static boolean dl()
    {
        return vX.dm();
    }

    public static String dn()
    {
        return vX._mthdo();
    }

    public static void e(Throwable throwable)
    {
        vX.f(throwable);
    }

    public void a(Bundle bundle)
    {
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        wj = true;
        wk = bundle;
        for (; !wi.isEmpty(); ex.a(mContext, (Thread)wi.remove(0), qJ)) { }
        break MISSING_BLOCK_LABEL_58;
        bundle;
        obj;
        JVM INSTR monitorexit ;
        throw bundle;
        obj;
        JVM INSTR monitorexit ;
    }

    public void a(fz fz1)
    {
        synchronized (mH)
        {
            wd.add(fz1);
        }
        return;
        fz1;
        obj;
        JVM INSTR monitorexit ;
        throw fz1;
    }

    public void a(String s, gd gd1)
    {
        synchronized (mH)
        {
            we.put(s, gd1);
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void a(Thread thread)
    {
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        if (!wj)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        ex.a(mContext, thread, qJ);
_L2:
        return;
        wi.add(thread);
        if (true) goto _L2; else goto _L1
_L1:
        thread;
        obj;
        JVM INSTR monitorexit ;
        throw thread;
    }

    public Bundle b(Context context, gc gc1, String s)
    {
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        Bundle bundle;
        bundle = new Bundle();
        bundle.putBundle("app", wa.b(context, s));
        context = new Bundle();
        String s1;
        for (s = we.keySet().iterator(); s.hasNext(); context.putBundle(s1, ((gd)we.get(s1)).toBundle()))
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
        for (s = wd.iterator(); s.hasNext(); context.add(((fz)s.next()).toBundle())) { }
        bundle.putParcelableArrayList("ads", context);
        gc1.a(wd);
        wd.clear();
        obj;
        JVM INSTR monitorexit ;
        return bundle;
    }

    public void b(Context context, gs gs1)
    {
        synchronized (mH)
        {
            if (!wg)
            {
                mContext = context.getApplicationContext();
                qJ = gs1;
                uV = gg.o(context);
                iy.H(context);
                ck.a(context, this);
                a(Thread.currentThread());
                wl = gi.c(context, gs1.wS);
                wb = new lf();
                wg = true;
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
        synchronized (mH)
        {
            if (flag != uV)
            {
                uV = flag;
                gg.a(context, flag);
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
        synchronized (mH)
        {
            wd.addAll(hashset);
        }
        return;
        hashset;
        obj;
        JVM INSTR monitorexit ;
        throw hashset;
    }

    public String d(int i, String s)
    {
        Resources resources;
        if (qJ.wV)
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

    public ld dd()
    {
        ld ld;
        synchronized (mH)
        {
            ld = wb;
        }
        return ld;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean de()
    {
        boolean flag;
        synchronized (mH)
        {
            flag = uW;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String dg()
    {
        String s;
        synchronized (mH)
        {
            s = wc.toString();
            wc = wc.add(BigInteger.ONE);
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public gb di()
    {
        gb gb1;
        synchronized (mH)
        {
            gb1 = wa;
        }
        return gb1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean dk()
    {
        boolean flag;
        synchronized (mH)
        {
            flag = wf;
            wf = true;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean dm()
    {
        boolean flag;
        synchronized (mH)
        {
            flag = uV;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String _mthdo()
    {
        String s;
        synchronized (mH)
        {
            s = wl;
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Bundle dp()
    {
        Bundle bundle;
        synchronized (mH)
        {
            bundle = wk;
        }
        return bundle;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void f(Throwable throwable)
    {
        if (wg)
        {
            (new ex(mContext, qJ, null, null)).b(throwable);
        }
    }

    public an l(Context context)
    {
        if (!bN().getBoolean(bn.pp.getKey(), false) || !ll.ij() || de())
        {
            return null;
        }
        synchronized (mH)
        {
            if (nE != null)
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
        nE = new am((Application)context.getApplicationContext(), (Activity)context);
        if (nF == null)
        {
            nF = new al();
        }
        if (wh == null)
        {
            wh = new an(nE, nF, wk, new ex(mContext, qJ, null, null));
        }
        wh.ba();
        context = wh;
        obj;
        JVM INSTR monitorexit ;
        return context;
    }

    public void x(boolean flag)
    {
        synchronized (mH)
        {
            uW = flag;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        vX = new ga();
        vY = vX.vZ;
    }
}
