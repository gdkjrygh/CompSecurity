// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.ads.internal.purchase.zzi;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.e;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            gw, go, gq, gm, 
//            gp, ay, au, jc, 
//            ak, aj, zzbk, fk, 
//            gu, y, cw, az, 
//            bb, ba

public class gn
    implements gu.b
{

    private final Object a = new Object();
    private final String b;
    private final go c;
    private y d;
    private BigInteger e;
    private final HashSet f = new HashSet();
    private final HashMap g = new HashMap();
    private boolean h;
    private boolean i;
    private int j;
    private boolean k;
    private Context l;
    private VersionInfoParcel m;
    private ba n;
    private boolean o;
    private ak p;
    private zzbk q;
    private aj r;
    private final LinkedList s = new LinkedList();
    private final fk t = null;
    private Boolean u;
    private String v;
    private boolean w;

    public gn(gw gw1)
    {
        e = BigInteger.ONE;
        h = false;
        i = true;
        j = 0;
        k = false;
        n = null;
        o = true;
        p = null;
        q = null;
        r = null;
        u = null;
        w = false;
        b = gw1.c();
        c = new go(b);
    }

    public Bundle a(Context context, gp gp1, String s1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        Bundle bundle;
        bundle = new Bundle();
        bundle.putBundle("app", c.a(context, s1));
        context = new Bundle();
        String s2;
        for (s1 = g.keySet().iterator(); s1.hasNext(); context.putBundle(s2, ((gq)g.get(s2)).a()))
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
        for (s1 = f.iterator(); s1.hasNext(); context.add(((gm)s1.next()).d())) { }
        bundle.putParcelableArrayList("ads", context);
        gp1.zza(f);
        f.clear();
        obj;
        JVM INSTR monitorexit ;
        return bundle;
    }

    public zzbk a(Context context)
    {
label0:
        {
            if (!((Boolean)ay.J.c()).booleanValue() || !jc.c() || b())
            {
                return null;
            }
            synchronized (a)
            {
                if (p != null)
                {
                    break MISSING_BLOCK_LABEL_77;
                }
                if (context instanceof Activity)
                {
                    break label0;
                }
            }
            return null;
        }
        p = new ak((Application)context.getApplicationContext(), (Activity)context);
        if (r == null)
        {
            r = new aj();
        }
        if (q == null)
        {
            q = new zzbk(p, r, new fk(l, m, null, null));
        }
        q.a();
        context = q;
        obj;
        JVM INSTR monitorexit ;
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public String a()
    {
        return b;
    }

    public String a(int i1, String s1)
    {
        Resources resources;
        if (m.zzIC)
        {
            resources = l.getResources();
        } else
        {
            resources = com.google.android.gms.common.e.d(l);
        }
        if (resources == null)
        {
            return s1;
        } else
        {
            return resources.getString(i1);
        }
    }

    public Future a(Context context, boolean flag)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (flag == i)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        i = flag;
        context = gu.a(context, flag);
        return context;
        obj;
        JVM INSTR monitorexit ;
        return null;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void a(Context context, VersionInfoParcel versioninfoparcel)
    {
        synchronized (a)
        {
            if (!k)
            {
                l = context.getApplicationContext();
                m = versioninfoparcel;
                gu.a(context, this);
                gu.b(context, this);
                a(Thread.currentThread());
                v = zzp.zzbx().a(context, versioninfoparcel.zzIz);
                d = new y(context.getApplicationContext(), m, new cw(context.getApplicationContext(), m, (String)ay.b.c()));
                m();
                zzp.zzbH().zzy(l);
                k = true;
            }
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void a(Bundle bundle)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (!bundle.containsKey("use_https")) goto _L2; else goto _L1
_L1:
        boolean flag = bundle.getBoolean("use_https");
_L5:
        i = flag;
        if (!bundle.containsKey("webview_cache_version")) goto _L4; else goto _L3
_L3:
        int i1 = bundle.getInt("webview_cache_version");
_L6:
        j = i1;
        return;
_L2:
        flag = i;
          goto _L5
_L4:
        i1 = j;
          goto _L6
        bundle;
        obj;
        JVM INSTR monitorexit ;
        throw bundle;
          goto _L5
    }

    public void a(gm gm1)
    {
        synchronized (a)
        {
            f.add(gm1);
        }
        return;
        gm1;
        obj;
        JVM INSTR monitorexit ;
        throw gm1;
    }

    public void a(Boolean boolean1)
    {
        synchronized (a)
        {
            u = boolean1;
        }
        return;
        boolean1;
        obj;
        JVM INSTR monitorexit ;
        throw boolean1;
    }

    public void a(String s1, gq gq1)
    {
        synchronized (a)
        {
            g.put(s1, gq1);
        }
        return;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public void a(Thread thread)
    {
        fk.a(l, thread, m);
    }

    public void a(Throwable throwable, boolean flag)
    {
        (new fk(l, m, null, null)).a(throwable, flag);
    }

    public void a(HashSet hashset)
    {
        synchronized (a)
        {
            f.addAll(hashset);
        }
        return;
        hashset;
        obj;
        JVM INSTR monitorexit ;
        throw hashset;
    }

    public void a(boolean flag)
    {
        synchronized (a)
        {
            o = flag;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b(boolean flag)
    {
        synchronized (a)
        {
            w = flag;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean b()
    {
        boolean flag;
        synchronized (a)
        {
            flag = o;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String c()
    {
        String s1;
        synchronized (a)
        {
            s1 = e.toString();
            e = e.add(BigInteger.ONE);
        }
        return s1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public go d()
    {
        go go1;
        synchronized (a)
        {
            go1 = c;
        }
        return go1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public ba e()
    {
        ba ba;
        synchronized (a)
        {
            ba = n;
        }
        return ba;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean f()
    {
        boolean flag;
        synchronized (a)
        {
            flag = h;
            h = true;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean g()
    {
        boolean flag;
        synchronized (a)
        {
            flag = i;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String h()
    {
        String s1;
        synchronized (a)
        {
            s1 = v;
        }
        return s1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Boolean i()
    {
        Boolean boolean1;
        synchronized (a)
        {
            boolean1 = u;
        }
        return boolean1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public y j()
    {
        return d;
    }

    public boolean k()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (j >= ((Integer)ay.X.c()).intValue())
        {
            break MISSING_BLOCK_LABEL_58;
        }
        j = ((Integer)ay.X.c()).intValue();
        gu.a(l, j);
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

    public boolean l()
    {
        boolean flag;
        synchronized (a)
        {
            flag = w;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void m()
    {
        az az1 = new az(l, m.zzIz);
        try
        {
            n = zzp.zzbC().a(az1);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            zzb.zzd("Cannot initialize CSI reporter.", illegalargumentexception);
        }
    }
}
