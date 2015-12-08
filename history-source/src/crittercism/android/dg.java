// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.ConditionVariable;
import com.crittercism.app.CrittercismNDK;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package crittercism.android:
//            di, bb, az, aw, 
//            bm, br, df, ba, 
//            dv, dx, dr, au, 
//            dw, dq, dt, cq, 
//            du, bq, h, eb, 
//            bh, bi, dy, cc, 
//            ce, bg, ax

public final class dg extends di
{

    public ConditionVariable a;
    private ConditionVariable b;
    private bb c;
    private Context d;
    private aw e;
    private ax f;
    private au g;
    private List h;
    private boolean i;
    private boolean j;
    private Exception k;

    public dg(bb bb1, Context context, aw aw1, ax ax, au au1)
    {
        b = new ConditionVariable();
        a = new ConditionVariable();
        h = new ArrayList();
        i = false;
        k = null;
        c = bb1;
        d = context;
        e = aw1;
        f = ax;
        g = au1;
        j = false;
    }

    private void c()
    {
        this;
        JVM INSTR monitorenter ;
        i = true;
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
        boolean flag = i;
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
        int l;
        l = 0;
        obj = new File((new StringBuilder()).append(d.getFilesDir().getAbsolutePath()).append("/").append(c.g()).toString());
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
        int i1 = obj.length;
        while (l < i1) 
        {
            File file = obj[l];
            file.isFile();
            file.delete();
            l++;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void f()
    {
        if (!az.A().u)
        {
            boolean flag = j;
            br br1 = e.n();
            br br2 = e.o();
            br br3 = e.p();
            br br4 = e.q();
            br br5 = e.r();
            dv dv1 = e.y();
            c.b();
            br1.a(new bm(g));
            if (!c.delaySendingAppLoad())
            {
                df df1 = new df(d);
                df1.a(br1, new ct.a(), c.e(), "/v0/appload/", c.b(), g, new cs.b());
                df1.a(br2, new da.a(), c.b(), "/android_v2/handle_exceptions", null, g, new cu.a());
                df1.a(br4, new da.a(), c.b(), "/android_v2/handle_ndk_crashes", null, g, new cu.a());
                df1.a(br5, new da.a(), c.b(), "/android_v2/handle_crashes", null, g, new cu.a());
                df1.a(br3, new da.a(), c.b(), "/android_v2/handle_exceptions", null, new ba(g, c), new cu.a());
                df1.a();
            }
            if (dv1.b())
            {
                az.A().E();
                return;
            }
        }
    }

    public final void a()
    {
        Object obj;
        dx.b();
        obj = new File((new StringBuilder()).append(d.getFilesDir().getAbsolutePath()).append("/com.crittercism/pending").toString());
        if (!((File) (obj)).exists() || ((File) (obj)).isDirectory()) goto _L2; else goto _L1
_L1:
        dx.b();
_L9:
        Object obj1;
        obj1 = az.A();
        ((az) (obj1)).x.a();
        obj = g.l();
        ((az) (obj1)).d.open();
        obj1 = f;
        Context context = d;
        ((dw) (obj)).a(((ax) (obj1)));
        dq.a = dq.a(d).booleanValue();
        dq.a(d, false);
        if (!((dw) (obj)).b())
        {
            obj1 = new dt(d);
            int l = ((dt) (obj1)).a();
            ((dt) (obj1)).a.edit().putInt("numAppLoads", l + 1).commit();
            az.A().B = ((dt) (obj1));
            ((dw) (obj)).a().a(f, cq.j.a(), cq.j.b());
        }
        j = ((dw) (obj)).b();
        obj1 = e();
        if (!j) goto _L4; else goto _L3
_L3:
        boolean flag = j;
        if (az.A().u) goto _L6; else goto _L5
_L5:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        if (((File) (obj1)).exists())
        {
            ((File) (obj1)).isFile();
        }
        (new br(d, bq.a)).a();
        (new br(d, bq.b)).a();
        (new br(d, bq.c)).a();
        (new br(d, bq.d)).a();
        (new br(d, bq.e)).a();
        (new br(d, bq.f)).a();
        (new br(d, bq.h)).a();
        (new br(d, bq.g)).a();
        (new br(d, bq.k)).a();
        if (obj1 == null) goto _L6; else goto _L7
_L7:
        ((File) (obj1)).delete();
_L6:
        crittercism.android.h.b(d);
_L20:
        c();
        for (obj = h.iterator(); ((Iterator) (obj)).hasNext(); ((Runnable)((Iterator) (obj)).next()).run()) { }
          goto _L8
        obj;
        (new StringBuilder("Exception in run(): ")).append(((Exception) (obj)).getMessage());
        dx.b();
        dx.c();
        k = ((Exception) (obj));
        b.open();
        return;
_L2:
        eb.a(((File) (obj)));
          goto _L9
        Exception exception;
        exception;
        b.open();
        throw exception;
_L4:
        Object obj2;
        obj2 = d;
        exception = new h(((Context) (obj2)));
        obj2 = ((Context) (obj2)).getSharedPreferences("com.crittercism.optmz.config", 0);
        if (!((SharedPreferences) (obj2)).contains("interval")) goto _L11; else goto _L10
_L10:
        exception.d = ((SharedPreferences) (obj2)).getInt("interval", 10);
        if (!((SharedPreferences) (obj2)).contains("kill")) goto _L13; else goto _L12
_L12:
        exception.c = ((SharedPreferences) (obj2)).getBoolean("kill", false);
        if (!((SharedPreferences) (obj2)).contains("persist"))
        {
            break MISSING_BLOCK_LABEL_1088;
        }
        exception.b = ((SharedPreferences) (obj2)).getBoolean("persist", false);
        if (!((SharedPreferences) (obj2)).contains("enabled"))
        {
            break MISSING_BLOCK_LABEL_1093;
        }
        exception.a = ((SharedPreferences) (obj2)).getBoolean("enabled", false);
_L22:
        Object obj3;
        Object obj4;
        br br1;
        br br2;
        br br3;
        boolean flag1;
        for (; exception == null; exception = null)
        {
            break MISSING_BLOCK_LABEL_657;
        }

        az.A().a(exception);
        flag1 = j;
        e.z();
        if (!az.A().u)
        {
            exception = bh.a(d);
            obj3 = e.x();
            obj4 = e.s();
            br1 = e.t();
            br2 = e.v();
            obj3 = new bi(d, g, ((br) (obj3)), ((br) (obj4)), br1, br2, c.d());
            obj4 = az.A();
            obj4.z = ((bi) (obj3));
            (new dy(((Runnable) (obj3)), "TXN Thread")).start();
            ((az) (obj4)).a(exception);
        }
        flag1 = j;
        exception = az.A();
        if (((az) (exception)).u) goto _L15; else goto _L14
_L14:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_826;
        }
        if (((File) (obj1)).exists())
        {
            ((File) (obj1)).isFile();
        }
        obj3 = e;
        obj3 = e.s();
        obj4 = e.t();
        br1 = e.u();
        br2 = e.v();
        br3 = e.q();
        if (obj1 == null) goto _L17; else goto _L16
_L16:
        dq.a = true;
        ((az) (exception)).e.open();
        br3.a(new cc(((File) (obj1)), ((br) (obj3)), br1, ((br) (obj4)), br2));
        ((File) (obj1)).delete();
        e.w().a();
_L21:
        br1.a();
        ((br) (obj4)).a();
        br2.a();
        ((br) (obj3)).b(br1);
_L15:
        a.open();
        e.s().a(ce.a);
        if (az.A().u || !c.isNdkCrashReportingEnabled()) goto _L19; else goto _L18
_L18:
        dx.b();
        CrittercismNDK.installNdkLib(d, c.g());
_L19:
        f();
          goto _L20
_L17:
        ((az) (exception)).e.open();
        bg.a(e);
          goto _L21
        exception;
        (new StringBuilder("Exception installing ndk library: ")).append(exception.getClass().getName());
        dx.b();
          goto _L19
_L8:
        b.open();
        return;
_L11:
        exception = null;
          goto _L22
_L13:
        exception = null;
          goto _L22
        exception = null;
          goto _L22
    }

    public final boolean a(Runnable runnable)
    {
        this;
        JVM INSTR monitorenter ;
        if (d()) goto _L2; else goto _L1
_L1:
        h.add(runnable);
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
        b.block();
    }
}
