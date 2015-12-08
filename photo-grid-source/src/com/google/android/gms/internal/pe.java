// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.purchase.zzi;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            pt, qa, pf, ph, 
//            pc, pg, cy, cx, 
//            wn, bx, bw, by, 
//            ng, po, pp, pr, 
//            as, ha, cz, dc, 
//            pq

public final class pe
    implements pt
{

    private final Object a = new Object();
    private final String b = qa.b();
    private final pf c;
    private as d;
    private BigInteger e;
    private final HashSet f = new HashSet();
    private final HashMap g = new HashMap();
    private boolean h;
    private boolean i;
    private int j;
    private boolean k;
    private Context l;
    private VersionInfoParcel m;
    private dc n;
    private boolean o;
    private bx p;
    private by q;
    private bw r;
    private final LinkedList s = new LinkedList();
    private final ng t = null;
    private Boolean u;
    private String v;
    private boolean w;
    private boolean x;

    public pe()
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
        x = false;
        c = new pf(b);
    }

    private boolean l()
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

    public final Bundle a(Context context, pg pg1, String s1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        Bundle bundle;
        bundle = new Bundle();
        bundle.putBundle("app", c.a(context, s1));
        context = new Bundle();
        String s2;
        for (s1 = g.keySet().iterator(); s1.hasNext(); context.putBundle(s2, ((ph)g.get(s2)).a()))
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
        for (s1 = f.iterator(); s1.hasNext(); context.add(((pc)s1.next()).d())) { }
        bundle.putParcelableArrayList("ads", context);
        pg1.zza(f);
        f.clear();
        obj;
        JVM INSTR monitorexit ;
        return bundle;
    }

    public final by a(Context context)
    {
label0:
        {
            cq cq = cy.J;
            if (!((Boolean)zzp.zzbE().a(cq)).booleanValue() || !wn.c() || l())
            {
                return null;
            }
            synchronized (a)
            {
                if (p != null)
                {
                    break MISSING_BLOCK_LABEL_82;
                }
                if (context instanceof Activity)
                {
                    break label0;
                }
            }
            return null;
        }
        p = new bx((Application)context.getApplicationContext(), (Activity)context);
        if (r == null)
        {
            r = new bw();
        }
        if (q == null)
        {
            q = new by(p, r, new ng(l, m, null, null));
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

    public final String a()
    {
        return b;
    }

    public final String a(int i1, String s1)
    {
        Resources resources;
        if (m.zzJx)
        {
            resources = l.getResources();
        } else
        {
            resources = GooglePlayServicesUtil.getRemoteResource(l);
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
        if (flag == i)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        i = flag;
        context = (new po(context, flag)).zzgz();
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
        if (k) goto _L2; else goto _L1
_L1:
        l = context.getApplicationContext();
        m = versioninfoparcel;
        (new pp(context, this)).zzgz();
        (new pr(context, this)).zzgz();
        Object obj1 = Thread.currentThread();
        ng.a(l, ((Thread) (obj1)), m);
        v = zzp.zzbv().a(context, versioninfoparcel.zzJu);
        if (wn.k() && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted())
        {
            x = true;
        }
        versioninfoparcel = context.getApplicationContext();
        obj1 = m;
        context = context.getApplicationContext();
        VersionInfoParcel versioninfoparcel1 = m;
        cq cq = cy.b;
        d = new as(versioninfoparcel, ((VersionInfoParcel) (obj1)), new ha(context, versioninfoparcel1, (String)zzp.zzbE().a(cq)));
        context = new cz(l, m.zzJu);
        zzp.zzbA();
        if (context.a()) goto _L4; else goto _L3
_L3:
        zzb.v("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
        context = null;
_L6:
        n = context;
_L5:
        zzp.zzbF().zzx(l);
        k = true;
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
_L4:
        try
        {
            if (context.c() == null)
            {
                throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
            }
            break MISSING_BLOCK_LABEL_264;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        finally { }
        zzb.zzd("Cannot initialize CSI reporter.", context);
          goto _L5
        obj;
        JVM INSTR monitorexit ;
        throw context;
        if (TextUtils.isEmpty(context.d()))
        {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        context = new dc(context.c(), context.d(), context.b(), context.e());
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

    public final void a(pc pc1)
    {
        synchronized (a)
        {
            f.add(pc1);
        }
        return;
        pc1;
        obj;
        JVM INSTR monitorexit ;
        throw pc1;
    }

    public final void a(Boolean boolean1)
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

    public final void a(String s1, ph ph1)
    {
        synchronized (a)
        {
            g.put(s1, ph1);
        }
        return;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void a(Throwable throwable, boolean flag)
    {
        (new ng(l, m, null, null)).a(throwable, flag);
    }

    public final void a(HashSet hashset)
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

    public final void a(boolean flag)
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

    public final String b()
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

    public final void b(boolean flag)
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

    public final pf c()
    {
        pf pf1;
        synchronized (a)
        {
            pf1 = c;
        }
        return pf1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final dc d()
    {
        dc dc1;
        synchronized (a)
        {
            dc1 = n;
        }
        return dc1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean e()
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

    public final boolean f()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (i || x)
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

    public final String g()
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

    public final Boolean h()
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

    public final as i()
    {
        return d;
    }

    public final boolean j()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        int i1 = j;
        cq cq = cy.X;
        if (i1 >= ((Integer)zzp.zzbE().a(cq)).intValue())
        {
            break MISSING_BLOCK_LABEL_77;
        }
        cq = cy.X;
        j = ((Integer)zzp.zzbE().a(cq)).intValue();
        (new pq(l, j)).zzgz();
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

    public final boolean k()
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
}
