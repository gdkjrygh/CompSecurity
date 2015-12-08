// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.b.a.a;
import com.b.a.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package b.a:
//            x, ff, eg, ap, 
//            du, df, k, hd, 
//            gg, ad, ia, b, 
//            et, hs, r, l, 
//            cb, bu

public final class hu
{

    private List a;
    private l b;
    private x c;
    private ap d;
    private df e;
    private Context f;

    public hu(Context context)
    {
        a = new ArrayList();
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        f = context;
    }

    private x b()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        c = new x();
        obj = f;
        c.a(com.b.a.a.a(((Context) (obj))));
        c.e(com.b.a.a.b(((Context) (obj))));
        if (a.a != null && a.b != null)
        {
            c.f(a.a);
            c.g(a.b);
        }
        c.c(ff.o(((Context) (obj))));
        c.a(b.a.eg.a);
        c.d("5.5.3");
        c.b(ff.b(((Context) (obj))));
        c.a(Integer.parseInt(b.a.ff.a(((Context) (obj)))));
        c.b(a.c);
        c.d(com.b.a.a.a());
_L1:
        obj = c;
        this;
        JVM INSTR monitorexit ;
        return ((x) (obj));
        Object obj1;
        obj1;
        ((Exception) (obj1)).printStackTrace();
          goto _L1
        obj1;
        throw obj1;
    }

    private ap c()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (d != null)
        {
            break MISSING_BLOCK_LABEL_210;
        }
        d = new ap();
        obj = f;
        int ai[];
        d.e(b.a.ff.a());
        d.a(ff.c(((Context) (obj))));
        d.b(ff.d(((Context) (obj))));
        d.c(ff.k(((Context) (obj))));
        d.d(Build.MODEL);
        d.f("Android");
        d.g(android.os.Build.VERSION.RELEASE);
        ai = ff.l(((Context) (obj)));
        if (ai == null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        d.a(new du(ai[1], ai[0]));
        if (a.e != null)
        {
            ai = a.d;
        }
        d.h(Build.BOARD);
        d.i(Build.BRAND);
        d.a(Build.TIME);
        d.j(Build.MANUFACTURER);
        d.k(Build.ID);
        d.l(Build.DEVICE);
_L1:
        ai = d;
        this;
        JVM INSTR monitorexit ;
        return ai;
        Object obj1;
        obj1;
        ((Exception) (obj1)).printStackTrace();
          goto _L1
        obj1;
        throw obj1;
    }

    private df d()
    {
        this;
        JVM INSTR monitorenter ;
        if (e != null) goto _L2; else goto _L1
_L1:
        Object obj;
        e = new df();
        obj = f;
        String as[] = ff.e(((Context) (obj)));
        if (!"Wi-Fi".equals(as[0])) goto _L4; else goto _L3
_L3:
        e.a(k.c);
_L5:
        if (!"".equals(as[1]))
        {
            e.d(as[1]);
        }
        e.c(ff.m(((Context) (obj))));
        as = ff.i(((Context) (obj)));
        e.b(as[0]);
        e.a(as[1]);
        e.a(ff.h(((Context) (obj))));
_L2:
        obj = e;
        this;
        JVM INSTR monitorexit ;
        return ((df) (obj));
_L4:
        if (!"2G/3G".equals(as[0]))
        {
            break MISSING_BLOCK_LABEL_172;
        }
        e.a(k.b);
          goto _L5
        Object obj1;
        obj1;
        ((Exception) (obj1)).printStackTrace();
          goto _L2
        obj1;
        throw obj1;
        e.a(b.a.k.a);
          goto _L5
    }

    private cb e()
    {
        cb cb;
        try
        {
            cb = b.a.hd.a(f).a();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return null;
        }
        return cb;
    }

    private bu f()
    {
        bu bu;
        try
        {
            bu = b.a.gg.a(f).b();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return null;
        }
        return bu;
    }

    private ad g()
    {
        ad ad1;
        try
        {
            SharedPreferences sharedpreferences = f.getSharedPreferences("umeng_general_config", 0);
            ad1 = new ad();
            ad1.b(sharedpreferences.getInt("failed_requests ", 0));
            ad1.c(sharedpreferences.getInt("last_request_spent_ms", 0));
            ad1.a(sharedpreferences.getInt("successful_request", 0));
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return new ad();
        }
        return ad1;
    }

    public final int a()
    {
        this;
        JVM INSTR monitorenter ;
        l l;
        int j;
        j = a.size();
        l = b;
        int i;
        i = j;
        if (l != null)
        {
            i = j + 1;
        }
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(et et1)
    {
        String s;
        s = ia.c(f);
        if (s == null)
        {
            return;
        }
        this;
        JVM INSTR monitorenter ;
        if (b != null && (new b(f)).a())
        {
            et1.a(b);
            b = null;
        }
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((hs)iterator.next()).a(et1, s)) { }
        break MISSING_BLOCK_LABEL_96;
        et1;
        throw et1;
        a.clear();
        this;
        JVM INSTR monitorexit ;
        et1.a(b());
        et1.a(c());
        et1.a(d());
        et1.a(g());
        et1.a(e());
        et1.a(f());
        String as[] = q.a(f);
        r r1;
        if (as != null && !TextUtils.isEmpty(as[0]) && !TextUtils.isEmpty(as[1]))
        {
            r1 = new r(as[0], as[1]);
        } else
        {
            r1 = null;
        }
        et1.a(r1);
        return;
    }

    public final void a(hs hs1)
    {
        this;
        JVM INSTR monitorenter ;
        a.add(hs1);
        this;
        JVM INSTR monitorexit ;
        return;
        hs1;
        throw hs1;
    }

    public final void a(l l)
    {
        this;
        JVM INSTR monitorenter ;
        b = l;
        this;
        JVM INSTR monitorexit ;
        return;
        l;
        throw l;
    }
}
