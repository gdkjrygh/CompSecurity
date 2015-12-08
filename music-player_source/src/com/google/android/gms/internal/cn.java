// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.gms.common.g;
import org.json.JSONException;

// Referenced classes of package com.google.android.gms.internal:
//            dv, ct, eq, cf, 
//            cr, cd, ab, ek, 
//            kz, iv, db, cv, 
//            eh, co, aw, do, 
//            cp, cw, aq, an, 
//            cq, em, ea, ba, 
//            cm, cy

public final class cn extends dv
    implements ct, eq
{

    private final ba a;
    private final cm b;
    private final em c;
    private final Object d = new Object();
    private final Context e;
    private final Object f = new Object();
    private final cy g;
    private final kz h;
    private dv i;
    private cf j;
    private boolean k;
    private an l;
    private aq m;
    private aw n;

    public cn(Context context, cy cy, kz kz1, em em1, ba ba, cm cm)
    {
        k = false;
        a = ba;
        b = cm;
        c = em1;
        e = context;
        g = cy;
        h = kz1;
    }

    private ab a(cd cd1)
    {
        if (j.n == null)
        {
            throw new cr("The ad response must specify one of the supported ad sizes.", 0);
        }
        Object aobj[] = j.n.split("x");
        if (aobj.length != 2)
        {
            throw new cr((new StringBuilder("Could not parse the ad size from the ad response: ")).append(j.n).toString(), 0);
        }
        int l1;
        int i2;
        int j2;
        try
        {
            l1 = Integer.parseInt(aobj[0]);
            i2 = Integer.parseInt(aobj[1]);
        }
        // Misplaced declaration of an exception variable
        catch (cd cd1)
        {
            throw new cr((new StringBuilder("Could not parse the ad size from the ad response: ")).append(j.n).toString(), 0);
        }
        aobj = cd1.e.i;
        j2 = aobj.length;
        ab ab1;
        int j1;
        int k1;
        for (int i1 = 0; i1 < j2; i1++)
        {
            ab1 = aobj[i1];
            float f1 = e.getResources().getDisplayMetrics().density;
            if (ab1.g == -1)
            {
                j1 = (int)((float)ab1.h / f1);
            } else
            {
                j1 = ab1.g;
            }
            if (ab1.d == -2)
            {
                k1 = (int)((float)ab1.e / f1);
            } else
            {
                k1 = ab1.d;
            }
            if (l1 == j1 && i2 == k1)
            {
                return new ab(ab1, cd1.e.i);
            }
        }

        throw new cr((new StringBuilder("The ad size from the ad response was not one of the requested sizes: ")).append(j.n).toString(), 0);
    }

    static Object a(cn cn1)
    {
        return cn1.f;
    }

    private void a(long l1)
    {
        do
        {
            if (!b(l1))
            {
                throw new cr("Timed out waiting for WebView to finish loading.", 2);
            }
        } while (!k);
    }

    static cm b(cn cn1)
    {
        return cn1.b;
    }

    private boolean b(long l1)
    {
        l1 = 60000L - (SystemClock.elapsedRealtime() - l1);
        if (l1 <= 0L)
        {
            return false;
        }
        try
        {
            f.wait(l1);
        }
        catch (InterruptedException interruptedexception)
        {
            throw new cr("Ad request cancelled.", -1);
        }
        return true;
    }

    static cf c(cn cn1)
    {
        return cn1.j;
    }

    static em d(cn cn1)
    {
        return cn1.c;
    }

    public final void a()
    {
        Object obj5 = f;
        obj5;
        JVM INSTR monitorenter ;
        Object obj4;
        ek.a("AdLoaderBackgroundTask started.");
        String s = h.a().a(e);
        obj4 = new cd(g, s);
        Object obj1;
        Object obj2;
        Object obj3;
        int i1;
        long l1;
        long l2;
        obj3 = null;
        obj2 = null;
        i1 = -2;
        l2 = -1L;
        obj1 = obj2;
        l1 = l2;
        long l3 = SystemClock.elapsedRealtime();
        obj1 = obj2;
        l1 = l2;
        Object obj = e;
        obj1 = obj2;
        l1 = l2;
        if (!((cd) (obj4)).l.f) goto _L2; else goto _L1
_L1:
        obj1 = obj2;
        l1 = l2;
        ek.a("Fetching ad response from local ad request service.");
        obj1 = obj2;
        l1 = l2;
        obj = new cv(((Context) (obj)), ((cd) (obj4)), this);
        obj1 = obj2;
        l1 = l2;
        ((cv) (obj)).e();
_L14:
        obj1 = obj2;
        l1 = l2;
        Object obj6 = d;
        obj1 = obj2;
        l1 = l2;
        obj6;
        JVM INSTR monitorenter ;
        i = ((dv) (obj));
        if (i == null)
        {
            throw new cr("Could not start the ad request service.", 0);
        }
          goto _L3
        obj;
        obj1 = obj2;
        l1 = l2;
        obj6;
        JVM INSTR monitorexit ;
        obj1 = obj2;
        l1 = l2;
        em em1;
        java.util.List list;
        java.util.List list1;
        java.util.List list2;
        String s1;
        aq aq1;
        int j1;
        boolean flag;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally
        {
            obj5;
        }
        i1 = ((cr) (obj)).a();
        if (i1 != 3 && i1 != -1) goto _L5; else goto _L4
_L4:
        ek.b(((cr) (obj)).getMessage());
_L24:
        j = new cf(i1);
        eh.a.post(new co(this));
        obj = obj1;
_L23:
        obj6 = ((cd) (obj4)).d;
        em1 = c;
        list = j.e;
        list1 = j.g;
        list2 = j.k;
        j1 = j.m;
        l2 = j.l;
        s1 = ((cd) (obj4)).j;
        flag = j.i;
        if (n == null) goto _L7; else goto _L6
_L6:
        obj1 = n.b;
_L25:
        if (n == null) goto _L9; else goto _L8
_L8:
        obj2 = n.c;
_L26:
        if (n == null) goto _L11; else goto _L10
_L10:
        obj3 = n.d;
_L27:
        aq1 = m;
        if (n == null) goto _L13; else goto _L12
_L12:
        obj4 = n.e;
_L28:
        obj = new do(((z) (obj6)), em1, list, i1, list1, list2, j1, l2, s1, flag, ((ap) (obj1)), ((bd) (obj2)), ((String) (obj3)), aq1, ((at) (obj4)), j.j, ((ab) (obj)), j.h, l1, j.o);
        eh.a.post(new cp(this, ((do) (obj))));
        obj5;
        JVM INSTR monitorexit ;
        return;
_L2:
        obj1 = obj2;
        l1 = l2;
        ek.a("Fetching ad response from remote ad request service.");
        obj1 = obj2;
        l1 = l2;
        if (com.google.android.gms.common.g.a(((Context) (obj))) == 0)
        {
            break MISSING_BLOCK_LABEL_519;
        }
        obj1 = obj2;
        l1 = l2;
        ek.d("Failed to connect to remote ad request service.");
        obj = null;
          goto _L14
        obj1 = obj2;
        l1 = l2;
        obj = new cw(((Context) (obj)), ((cd) (obj4)), this);
        if (true) goto _L14; else goto _L15
_L15:
        JVM INSTR monitorexit ;
        throw obj;
_L3:
        obj6;
        JVM INSTR monitorexit ;
_L17:
        obj1 = obj2;
        l1 = l2;
        if (b(l3))
        {
            break MISSING_BLOCK_LABEL_582;
        }
        obj1 = obj2;
        l1 = l2;
        throw new cr("Timed out waiting for ad response.", 2);
        obj1 = obj2;
        l1 = l2;
        if (j == null) goto _L17; else goto _L16
_L16:
        obj1 = obj2;
        l1 = l2;
        obj = d;
        obj1 = obj2;
        l1 = l2;
        obj;
        JVM INSTR monitorenter ;
        i = null;
        obj;
        JVM INSTR monitorexit ;
        obj1 = obj2;
        l1 = l2;
        if (j.f == -2)
        {
            break MISSING_BLOCK_LABEL_720;
        }
        obj1 = obj2;
        l1 = l2;
        if (j.f == -3)
        {
            break MISSING_BLOCK_LABEL_720;
        }
        obj1 = obj2;
        l1 = l2;
        throw new cr((new StringBuilder("There was a problem getting an ad response. ErrorCode: ")).append(j.f).toString(), j.f);
        obj3;
        obj1 = obj2;
        l1 = l2;
        obj;
        JVM INSTR monitorexit ;
        obj1 = obj2;
        l1 = l2;
        throw obj3;
        obj1 = obj2;
        l1 = l2;
        l2 = SystemClock.elapsedRealtime();
        obj1 = obj2;
        l1 = l2;
        if (j.f == -3)
        {
            break MISSING_BLOCK_LABEL_830;
        }
        obj1 = obj2;
        l1 = l2;
        if (!TextUtils.isEmpty(j.d))
        {
            break MISSING_BLOCK_LABEL_786;
        }
        obj1 = obj2;
        l1 = l2;
        throw new cr("No fill from ad server.", 3);
        obj1 = obj2;
        l1 = l2;
        boolean flag1 = j.i;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_830;
        }
        obj1 = obj2;
        l1 = l2;
        m = new aq(j.d);
        obj1 = obj2;
        l1 = l2;
        obj = obj3;
        if (((cd) (obj4)).e.i == null)
        {
            break MISSING_BLOCK_LABEL_863;
        }
        obj1 = obj2;
        l1 = l2;
        obj = a(((cd) (obj4)));
        obj1 = obj;
        l1 = l2;
        if (!j.i) goto _L19; else goto _L18
_L18:
        obj1 = obj;
        l1 = l2;
        obj2 = d;
        obj1 = obj;
        l1 = l2;
        obj2;
        JVM INSTR monitorenter ;
        l = new an(e, ((cd) (obj4)), a, m);
        obj2;
        JVM INSTR monitorexit ;
        obj1 = obj;
        l1 = l2;
        n = l.a(l3);
        obj1 = obj;
        l1 = l2;
        n.a;
        JVM INSTR tableswitch 0 1: default 1166
    //                   0 1169
    //                   1 1076;
           goto _L20 _L21 _L22
_L20:
        obj1 = obj;
        l1 = l2;
        throw new cr((new StringBuilder("Unexpected mediation result: ")).append(n.a).toString(), 0);
        obj;
        obj1 = obj2;
        l1 = l2;
        throw new cr((new StringBuilder("Could not parse mediation config: ")).append(j.d).toString(), 0);
        obj3;
        obj1 = obj;
        l1 = l2;
        obj2;
        JVM INSTR monitorexit ;
        obj1 = obj;
        l1 = l2;
        throw obj3;
_L22:
        obj1 = obj;
        l1 = l2;
        throw new cr("No fill from any mediation ad networks.", 3);
_L19:
        obj1 = obj;
        l1 = l2;
        eh.a.post(new cq(this));
        obj1 = obj;
        l1 = l2;
        a(l3);
        l1 = l2;
          goto _L23
_L5:
        ek.d(((cr) (obj)).getMessage());
          goto _L24
_L7:
        obj1 = null;
          goto _L25
_L9:
        obj2 = null;
          goto _L26
_L11:
        obj3 = null;
          goto _L27
_L13:
        obj4 = null;
          goto _L28
_L21:
        l1 = l2;
          goto _L23
    }

    public final void a(cf cf1)
    {
        synchronized (f)
        {
            ek.a("Received ad response.");
            j = cf1;
            f.notify();
        }
    }

    public final void a(em em1)
    {
        synchronized (f)
        {
            ek.a("WebView finished loading.");
            k = true;
            f.notify();
        }
    }

    public final void b_()
    {
        synchronized (d)
        {
            if (i != null)
            {
                i.f();
            }
            c.stopLoading();
            ea.a(c);
            if (l != null)
            {
                l.a();
            }
        }
    }
}
