// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.Future;

public final class cix
    implements cjh
{

    public final Object a = new Object();
    public final String b = cjj.a();
    public bzv c;
    public final HashSet d = new HashSet();
    public final HashMap e = new HashMap();
    public boolean f;
    Boolean g;
    public boolean h;
    private final ciy i;
    private BigInteger j;
    private boolean k;
    private boolean l;
    private int m;
    private boolean n;
    private Context o;
    private VersionInfoParcel p;
    private cbe q;
    private caj r;
    private cak s;
    private cai t;
    private String u;
    private boolean v;

    public cix()
    {
        j = BigInteger.ONE;
        k = false;
        l = true;
        m = 0;
        n = false;
        q = null;
        f = true;
        r = null;
        s = null;
        t = null;
        new LinkedList();
        g = null;
        h = false;
        v = false;
        i = new ciy(b);
    }

    private boolean j()
    {
        boolean flag;
        synchronized (a)
        {
            flag = f;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Bundle a(Context context, ciz ciz1, String s1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        Bundle bundle;
        bundle = new Bundle();
        bundle.putBundle("app", i.a(context, s1));
        context = new Bundle();
        String s2;
        for (s1 = e.keySet().iterator(); s1.hasNext(); context.putBundle(s2, ((cja)e.get(s2)).a()))
        {
            s2 = (String)s1.next();
        }

        break MISSING_BLOCK_LABEL_105;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        bundle.putBundle("slots", context);
        context = new ArrayList();
        for (s1 = d.iterator(); s1.hasNext(); context.add(((civ)s1.next()).a())) { }
        bundle.putParcelableArrayList("ads", context);
        ciz1.a(d);
        d.clear();
        obj;
        JVM INSTR monitorexit ;
        return bundle;
    }

    public final cak a(Context context)
    {
label0:
        {
            cax cax = cbb.x;
            if (!((Boolean)bkv.n().a(cax)).booleanValue() || !cnv.a(14) || j())
            {
                return null;
            }
            synchronized (a)
            {
                if (r != null)
                {
                    break MISSING_BLOCK_LABEL_84;
                }
                if (context instanceof Activity)
                {
                    break label0;
                }
            }
            return null;
        }
        r = new caj((Application)context.getApplicationContext(), (Activity)context);
        if (t == null)
        {
            t = new cai();
        }
        if (s == null)
        {
            s = new cak(r, t, new cic(o, p, null, null));
        }
        s.a();
        context = s;
        obj;
        JVM INSTR monitorexit ;
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public final String a()
    {
        String s1;
        synchronized (a)
        {
            s1 = j.toString();
            j = j.add(BigInteger.ONE);
        }
        return s1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final String a(int i1, String s1)
    {
        Resources resources;
        if (p.e)
        {
            resources = o.getResources();
        } else
        {
            resources = GooglePlayServicesUtil.getRemoteResource(o);
        }
        if (resources == null)
        {
            return s1;
        } else
        {
            return resources.getString(i1);
        }
    }

    public final Future a(Context context, boolean flag)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (flag == l)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        l = flag;
        context = (new cjf._cls1(context, flag)).e();
        return context;
        obj;
        JVM INSTR monitorexit ;
        return null;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public final void a(Context context, VersionInfoParcel versioninfoparcel)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (n) goto _L2; else goto _L1
_L1:
        o = context.getApplicationContext();
        p = versioninfoparcel;
        (new cjf._cls2(context, this)).e();
        (new cjf._cls4(context, this)).e();
        Object obj1 = Thread.currentThread();
        cic.a(o, ((Thread) (obj1)), p);
        u = bkv.e().a(context, versioninfoparcel.b);
        if (cnv.a(23) && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted())
        {
            v = true;
        }
        versioninfoparcel = context.getApplicationContext();
        obj1 = p;
        context = context.getApplicationContext();
        VersionInfoParcel versioninfoparcel1 = p;
        cax cax = cbb.a;
        c = new bzv(versioninfoparcel, ((VersionInfoParcel) (obj1)), new ced(context, versioninfoparcel1, (String)bkv.n().a(cax)));
        context = new cbc(o, p.b);
        bkv.j();
        if (((cbc) (context)).a) goto _L4; else goto _L3
_L3:
        bka.d("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
        context = null;
_L6:
        q = context;
_L5:
        bkv.o();
        context = o;
        versioninfoparcel = new bim._cls1(context);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        context.bindService(intent, versioninfoparcel, 1);
        n = true;
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
_L4:
        try
        {
            if (((cbc) (context)).d == null)
            {
                throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
            }
            break MISSING_BLOCK_LABEL_304;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        finally { }
        bka.c("Cannot initialize CSI reporter.", context);
          goto _L5
        obj;
        JVM INSTR monitorexit ;
        throw context;
        if (TextUtils.isEmpty(((cbc) (context)).e))
        {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        context = new cbe(((cbc) (context)).d, ((cbc) (context)).e, ((cbc) (context)).b, ((cbc) (context)).c);
          goto _L6
    }

    public final void a(Bundle bundle)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (!bundle.containsKey("use_https")) goto _L2; else goto _L1
_L1:
        boolean flag = bundle.getBoolean("use_https");
_L5:
        l = flag;
        if (!bundle.containsKey("webview_cache_version")) goto _L4; else goto _L3
_L3:
        int i1 = bundle.getInt("webview_cache_version");
_L6:
        m = i1;
        return;
_L2:
        flag = l;
          goto _L5
_L4:
        i1 = m;
          goto _L6
        bundle;
        obj;
        JVM INSTR monitorexit ;
        throw bundle;
          goto _L5
    }

    public final void a(civ civ1)
    {
        synchronized (a)
        {
            d.add(civ1);
        }
        return;
        civ1;
        obj;
        JVM INSTR monitorexit ;
        throw civ1;
    }

    public final void a(Throwable throwable, boolean flag)
    {
        (new cic(o, p, null, null)).a(throwable, flag);
    }

    public final ciy b()
    {
        ciy ciy1;
        synchronized (a)
        {
            ciy1 = i;
        }
        return ciy1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final cbe c()
    {
        cbe cbe1;
        synchronized (a)
        {
            cbe1 = q;
        }
        return cbe1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean d()
    {
        boolean flag;
        synchronized (a)
        {
            flag = k;
            k = true;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean e()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (l || v)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final String f()
    {
        String s1;
        synchronized (a)
        {
            s1 = u;
        }
        return s1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Boolean g()
    {
        Boolean boolean1;
        synchronized (a)
        {
            boolean1 = g;
        }
        return boolean1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean h()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        int i1 = m;
        cax cax = cbb.I;
        if (i1 >= ((Integer)bkv.n().a(cax)).intValue())
        {
            break MISSING_BLOCK_LABEL_77;
        }
        cax = cbb.I;
        m = ((Integer)bkv.n().a(cax)).intValue();
        (new cjf._cls3(o, m)).e();
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean i()
    {
        boolean flag;
        synchronized (a)
        {
            flag = h;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
