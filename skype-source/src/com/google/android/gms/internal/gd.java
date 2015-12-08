// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.purchase.i;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
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
//            gm, ge, gg, gc, 
//            gf, ay, ax, it, 
//            aj, ai, ak, fl, 
//            x, cu, az, bb

public final class gd
    implements gk.b
{

    private final Object a = new Object();
    private final String b = com.google.android.gms.internal.gm.b();
    private final ge c;
    private x d;
    private BigInteger e;
    private final HashSet f = new HashSet();
    private final HashMap g = new HashMap();
    private boolean h;
    private boolean i;
    private int j;
    private boolean k;
    private Context l;
    private VersionInfoParcel m;
    private bb n;
    private boolean o;
    private aj p;
    private ak q;
    private ai r;
    private final LinkedList s = new LinkedList();
    private final fl t = null;
    private Boolean u;
    private String v;
    private boolean w;

    public gd()
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
        c = new ge(b);
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

    public final Bundle a(Context context, gf gf1, String s1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        Bundle bundle;
        bundle = new Bundle();
        bundle.putBundle("app", c.a(context, s1));
        context = new Bundle();
        String s2;
        for (s1 = g.keySet().iterator(); s1.hasNext(); context.putBundle(s2, ((gg)g.get(s2)).a()))
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
        for (s1 = f.iterator(); s1.hasNext(); context.add(((gc)s1.next()).d())) { }
        bundle.putParcelableArrayList("ads", context);
        gf1.a(f);
        f.clear();
        obj;
        JVM INSTR monitorexit ;
        return bundle;
    }

    public final ak a(Context context)
    {
label0:
        {
            au au = ay.J;
            if (!((Boolean)com.google.android.gms.ads.internal.p.n().a(au)).booleanValue() || !it.c() || l())
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
        p = new aj((Application)context.getApplicationContext(), (Activity)context);
        if (r == null)
        {
            r = new ai();
        }
        if (q == null)
        {
            q = new ak(p, r, new fl(l, m, null, null));
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
        if (m.e)
        {
            resources = l.getResources();
        } else
        {
            resources = com.google.android.gms.common.e.e(l);
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
        context = (new gk._cls1(context, flag)).e();
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
        (new gk._cls2(context, this)).e();
        (new gk._cls4(context, this)).e();
        Object obj1 = Thread.currentThread();
        fl.a(l, ((Thread) (obj1)), m);
        v = com.google.android.gms.ads.internal.p.e().a(context, versioninfoparcel.b);
        versioninfoparcel = context.getApplicationContext();
        obj1 = m;
        context = context.getApplicationContext();
        VersionInfoParcel versioninfoparcel1 = m;
        au au = com.google.android.gms.internal.ay.b;
        d = new x(versioninfoparcel, ((VersionInfoParcel) (obj1)), new cu(context, versioninfoparcel1, (String)com.google.android.gms.ads.internal.p.n().a(au)));
        context = new az(l, m.b);
        com.google.android.gms.ads.internal.p.j();
        if (context.a()) goto _L4; else goto _L3
_L3:
        com.google.android.gms.ads.internal.util.client.b.a(2);
        context = null;
_L6:
        n = context;
_L5:
        com.google.android.gms.ads.internal.p.o().a(l);
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
            break MISSING_BLOCK_LABEL_243;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        finally { }
        com.google.android.gms.ads.internal.util.client.b.b("Cannot initialize CSI reporter.", context);
          goto _L5
        obj;
        JVM INSTR monitorexit ;
        throw context;
        if (TextUtils.isEmpty(context.d()))
        {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        context = new bb(context.c(), context.d(), context.b(), context.e());
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

    public final void a(gc gc1)
    {
        synchronized (a)
        {
            f.add(gc1);
        }
        return;
        gc1;
        obj;
        JVM INSTR monitorexit ;
        throw gc1;
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

    public final void a(String s1, gg gg1)
    {
        synchronized (a)
        {
            g.put(s1, gg1);
        }
        return;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void a(Throwable throwable, boolean flag)
    {
        (new fl(l, m, null, null)).a(throwable, flag);
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

    public final ge c()
    {
        ge ge1;
        synchronized (a)
        {
            ge1 = c;
        }
        return ge1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final bb d()
    {
        bb bb1;
        synchronized (a)
        {
            bb1 = n;
        }
        return bb1;
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

    public final x i()
    {
        return d;
    }

    public final boolean j()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        int i1 = j;
        au au = ay.X;
        if (i1 >= ((Integer)com.google.android.gms.ads.internal.p.n().a(au)).intValue())
        {
            break MISSING_BLOCK_LABEL_77;
        }
        au = ay.X;
        j = ((Integer)com.google.android.gms.ads.internal.p.n().a(au)).intValue();
        (new gk._cls3(l, j)).e();
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
