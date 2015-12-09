// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.ConditionVariable;
import com.crittercism.app.CrittercismNDK;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package b.a:
//            ek, q, n, em, 
//            ct, be, ag, ab, 
//            ax, ef, dr, dp, 
//            ea, dt, aa, es, 
//            eu, en, l, et, 
//            eq, dl, er, bd, 
//            kl, ez, ap, ar, 
//            ew, cw, o

public final class ei extends ek
{

    public ConditionVariable a;
    public ax b;
    private ConditionVariable c;
    private ab d;
    private Context e;
    private n f;
    private o g;
    private l h;
    private List i;
    private boolean j;
    private boolean k;
    private Exception l;

    public ei(ab ab1, Context context, n n1, o o, l l1)
    {
        c = new ConditionVariable();
        a = new ConditionVariable();
        i = new ArrayList();
        j = false;
        b = null;
        l = null;
        d = ab1;
        e = context;
        f = n1;
        g = o;
        h = l1;
        k = false;
    }

    private void a(File file)
    {
        boolean flag = k;
        q q1 = q.A();
        if (q1.x)
        {
            return;
        }
        if (file != null && file.exists())
        {
            file.isFile();
        }
        Object obj = f;
        obj = f.s();
        be be1 = f.t();
        be be2 = f.u();
        be be3 = f.v();
        be be4 = f.q();
        if (file != null)
        {
            em.a = true;
            q1.f.open();
            be4.a(new ct(file, ((be) (obj)), be2, be1, be3));
            file.delete();
            f.w().a();
        } else
        {
            q1.f.open();
            ag.a(f);
        }
        be2.a();
        be1.a();
        be3.a();
        ((be) (obj)).a(be2);
    }

    private void c()
    {
        this;
        JVM INSTR monitorenter ;
        j = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private boolean d()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = j;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    private File e()
    {
        Object obj;
        int i1;
        i1 = 0;
        obj = new File((new StringBuilder()).append(e.getFilesDir().getAbsolutePath()).append("/").append(d.p()).toString());
        if (((File) (obj)).exists() && ((File) (obj)).isDirectory()) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        if ((obj = ((File) (obj)).listFiles()) != null)
        {
            if (obj.length != 1)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = obj[0];
            ((File) (obj)).isFile();
            if (((File) (obj)).isFile())
            {
                return ((File) (obj));
            }
        }
        continue; /* Loop/switch isn't completed */
        if (obj.length <= 1) goto _L1; else goto _L3
_L3:
        int j1 = obj.length;
        while (i1 < j1) 
        {
            File file = obj[i1];
            file.isFile();
            file.delete();
            i1++;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void f()
    {
        if (!q.A().x)
        {
            boolean flag = k;
            be be1 = f.n();
            be be2 = f.o();
            be be3 = f.p();
            be be4 = f.q();
            be be5 = f.r();
            es es1 = f.y();
            d.k();
            b = new ax(h);
            if (!d.d())
            {
                be1.a(b);
                ef ef1 = new ef(e);
                ef1.a(be1, new dr(), d.n(), "/v0/appload", d.k(), h, new dp());
                ef1.a(be2, new ea(), d.k(), "/android_v2/handle_exceptions", null, h, new dt());
                ef1.a(be4, new ea(), d.k(), "/android_v2/handle_ndk_crashes", null, h, new dt());
                ef1.a(be5, new ea(), d.k(), "/android_v2/handle_crashes", null, h, new dt());
                ef1.a(be3, new ea(), d.k(), "/android_v2/handle_exceptions", null, new aa(h, d), new dt());
                ef1.a();
            }
            if (es1.b())
            {
                q.A().E();
                return;
            }
        }
    }

    public final void a()
    {
        Object obj;
        eu.b();
        obj = new File((new StringBuilder()).append(e.getFilesDir().getAbsolutePath()).append("/com.crittercism/pending").toString());
        if (!((File) (obj)).exists() || ((File) (obj)).isDirectory()) goto _L2; else goto _L1
_L1:
        eu.b();
_L9:
        Object obj1;
        obj1 = q.A();
        ((q) (obj1)).B.a();
        obj = h.l();
        ((q) (obj1)).e.open();
        obj1 = g;
        Context context = e;
        ((et) (obj)).a(((o) (obj1)));
        em.a = em.a(e).booleanValue();
        em.a(e, false);
        if (!((et) (obj)).b())
        {
            obj1 = new eq(e);
            int i1 = ((eq) (obj1)).a();
            ((eq) (obj1)).a.edit().putInt("numAppLoads", i1 + 1).commit();
            q.A().F = ((eq) (obj1));
            ((et) (obj)).a().a(g, dl.j.a(), dl.j.b());
        }
        k = ((et) (obj)).b();
        obj1 = e();
        if (!k) goto _L4; else goto _L3
_L3:
        boolean flag = k;
        a.open();
        if (q.A().x) goto _L6; else goto _L5
_L5:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_261;
        }
        if (((File) (obj1)).exists())
        {
            ((File) (obj1)).isFile();
        }
        (new be(e, bd.a)).a();
        (new be(e, bd.b)).a();
        (new be(e, bd.c)).a();
        (new be(e, bd.d)).a();
        (new be(e, bd.e)).a();
        (new be(e, bd.f)).a();
        (new be(e, bd.h)).a();
        (new be(e, bd.g)).a();
        (new be(e, bd.k)).a();
        if (obj1 == null) goto _L6; else goto _L7
_L7:
        ((File) (obj1)).delete();
_L6:
        kl.b(e);
_L16:
        c();
        for (obj = i.iterator(); ((Iterator) (obj)).hasNext(); ((Runnable)((Iterator) (obj)).next()).run()) { }
          goto _L8
        obj;
        (new StringBuilder("Exception in run(): ")).append(((Exception) (obj)).getMessage());
        eu.b();
        eu.c();
        l = ((Exception) (obj));
        a.open();
        c.open();
        return;
_L2:
        ez.a(((File) (obj)));
          goto _L9
        Exception exception;
        exception;
        a.open();
        c.open();
        throw exception;
_L4:
        Object obj2;
        obj2 = e;
        exception = new kl(((Context) (obj2)));
        obj2 = ((Context) (obj2)).getSharedPreferences("com.crittercism.optmz.config", 0);
        if (!((SharedPreferences) (obj2)).contains("interval")) goto _L11; else goto _L10
_L10:
        exception.d = ((SharedPreferences) (obj2)).getInt("interval", 10);
        if (!((SharedPreferences) (obj2)).contains("kill")) goto _L13; else goto _L12
_L12:
        exception.c = ((SharedPreferences) (obj2)).getBoolean("kill", false);
        if (!((SharedPreferences) (obj2)).contains("persist"))
        {
            break MISSING_BLOCK_LABEL_978;
        }
        exception.b = ((SharedPreferences) (obj2)).getBoolean("persist", false);
        if (!((SharedPreferences) (obj2)).contains("enabled"))
        {
            break MISSING_BLOCK_LABEL_983;
        }
        exception.a = ((SharedPreferences) (obj2)).getBoolean("enabled", false);
_L18:
        Object obj3;
        Object obj4;
        be be1;
        be be2;
        URL url;
        boolean flag1;
        for (; exception == null; exception = null)
        {
            break MISSING_BLOCK_LABEL_678;
        }

        q.A().a(exception);
        flag1 = k;
        f.z();
        if (q.A().x)
        {
            break MISSING_BLOCK_LABEL_844;
        }
        exception = ap.a(e);
        obj3 = f.x();
        obj4 = f.s();
        be1 = f.t();
        be2 = f.v();
        url = new URL((new StringBuilder()).append(d.m()).append("/api/v1/transactions").toString());
        obj3 = new ar(e, h, ((be) (obj3)), ((be) (obj4)), be1, be2, url);
        obj4 = q.A();
        obj4.D = ((ar) (obj3));
        (new ew(((Runnable) (obj3)), "TXN Thread")).start();
        ((q) (obj4)).a(exception);
_L17:
        a(((File) (obj1)));
        ag.d();
        a.open();
        f.s().a(cw.a);
        if (q.A().x || !d.f()) goto _L15; else goto _L14
_L14:
        eu.b();
        CrittercismNDK.a(e, d.p());
_L15:
        f();
          goto _L16
        exception;
        eu.a();
          goto _L17
        exception;
        (new StringBuilder("Exception installing ndk library: ")).append(exception.getClass().getName());
        eu.b();
          goto _L15
_L8:
        a.open();
        c.open();
        return;
_L11:
        exception = null;
          goto _L18
_L13:
        exception = null;
          goto _L18
        exception = null;
          goto _L18
    }

    public final boolean a(Runnable runnable)
    {
        this;
        JVM INSTR monitorenter ;
        if (d()) goto _L2; else goto _L1
_L1:
        i.add(runnable);
        boolean flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        runnable;
        throw runnable;
    }

    public final void b()
    {
        c.block();
    }
}
