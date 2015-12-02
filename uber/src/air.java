// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.Future;

public final class air
    implements aja
{

    private final Object a = new Object();
    private final String b = ajc.b();
    private final ais c;
    private aqi d;
    private BigInteger e;
    private final HashSet f = new HashSet();
    private final HashMap g = new HashMap();
    private boolean h;
    private boolean i;
    private int j;
    private boolean k;
    private Context l;
    private VersionInfoParcel m;
    private abp n;
    private boolean o;
    private aau p;
    private aav q;
    private aat r;
    private final LinkedList s = new LinkedList();
    private final ahm t = null;
    private Boolean u;
    private String v;

    public air()
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
        c = new ais(b);
    }

    private void a(Thread thread)
    {
        ahm.a(l, thread, m);
    }

    private boolean k()
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

    private void l()
    {
        abo abo1 = new abo();
        abo1.a(l, m.b);
        try
        {
            n = ot.j().a(abo1);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            of.d("Cannot initialize CSI reporter.", illegalargumentexception);
        }
    }

    public final aav a(Context context)
    {
label0:
        {
            if (!((Boolean)abn.A.c()).booleanValue() || !alv.c() || k())
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
        p = new aau((Application)context.getApplicationContext(), (Activity)context);
        if (r == null)
        {
            r = new aat();
        }
        if (q == null)
        {
            q = new aav(p, r, new ahm(l, m, null, null));
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

    public final Bundle a(Context context, ait ait1, String s1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        Bundle bundle;
        bundle = new Bundle();
        bundle.putBundle("app", c.a(context, s1));
        context = new Bundle();
        String s2;
        for (s1 = g.keySet().iterator(); s1.hasNext(); context.putBundle(s2, ((aiu)g.get(s2)).a()))
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
        for (s1 = f.iterator(); s1.hasNext(); context.add(((aip)s1.next()).d())) { }
        bundle.putParcelableArrayList("ads", context);
        ait1.a(f);
        f.clear();
        obj;
        JVM INSTR monitorexit ;
        return bundle;
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
            resources = rz.d(l);
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
            break MISSING_BLOCK_LABEL_30;
        }
        i = flag;
        context = aiy.a(context, flag);
        return context;
        obj;
        JVM INSTR monitorexit ;
        return null;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public final void a(aip aip1)
    {
        synchronized (a)
        {
            f.add(aip1);
        }
        return;
        aip1;
        obj;
        JVM INSTR monitorexit ;
        throw aip1;
    }

    public final void a(Context context, VersionInfoParcel versioninfoparcel)
    {
        synchronized (a)
        {
            if (!k)
            {
                l = context.getApplicationContext();
                m = versioninfoparcel;
                aiy.a(context, this);
                aiy.b(context, this);
                a(Thread.currentThread());
                v = ot.e().a(context, versioninfoparcel.b);
                d = new aqi(context.getApplicationContext(), m, new adv(context.getApplicationContext(), m, (String)abn.b.c()));
                l();
                k = true;
            }
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
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

    public final void a(String s1, aiu aiu1)
    {
        synchronized (a)
        {
            g.put(s1, aiu1);
        }
        return;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void a(Throwable throwable, boolean flag)
    {
        (new ahm(l, m, null, null)).a(throwable, flag);
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

    public final ais c()
    {
        ais ais1;
        synchronized (a)
        {
            ais1 = c;
        }
        return ais1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final abp d()
    {
        abp abp;
        synchronized (a)
        {
            abp = n;
        }
        return abp;
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

    public final aqi i()
    {
        return d;
    }

    public final boolean j()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (j >= ((Integer)abn.M.c()).intValue())
        {
            break MISSING_BLOCK_LABEL_58;
        }
        j = ((Integer)abn.M.c()).intValue();
        aiy.a(l, j);
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
}
