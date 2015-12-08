// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.vending.billing.IInAppBillingService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class anK
{
    final class a extends aor
    {

        private final aoo b;
        private anK c;

        public final void a(int i1, Exception exception)
        {
            aot aot1 = b.b;
            static final class _cls6
            {

                static final int a[];
                static final int b[];

                static 
                {
                    b = new int[aot.values().length];
                    try
                    {
                        b[aot.d.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        b[aot.e.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    a = new int[j.a().length];
                    try
                    {
                        a[2] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[5] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            _cls6.b[aot1.ordinal()];
            JVM INSTR tableswitch 1 2: default 40
        //                       1 47
        //                       2 72;
               goto _L1 _L2 _L3
_L1:
            super.a(i1, exception);
            return;
_L2:
            if (i1 == 7)
            {
                anK.d(c).a(aot.b.ordinal());
            }
            continue; /* Loop/switch isn't completed */
_L3:
            if (i1 == 8)
            {
                anK.d(c).a(aot.b.ordinal());
            }
            if (true) goto _L1; else goto _L4
_L4:
        }

        public final void a(Object obj)
        {
            aot aot1;
            Object obj1;
            obj1 = b.a();
            aot1 = b.b;
            if (obj1 == null) goto _L2; else goto _L1
_L1:
            anU anu;
            anO.a a1;
            a1 = new anO.a(obj, System.currentTimeMillis() + aot1.f);
            anu = anK.d(c);
            obj1 = aot1.a(((String) (obj1)));
            if (anu.a == null) goto _L2; else goto _L3
_L3:
            anu;
            JVM INSTR monitorenter ;
            if (anu.a.a(((anO.b) (obj1))) != null) goto _L5; else goto _L4
_L4:
            (new StringBuilder("Adding entry with key=")).append(obj1).append(" to the cache");
            anK.e();
            anu.a.a(((anO.b) (obj1)), a1);
_L8:
            anu;
            JVM INSTR monitorexit ;
_L2:
            _cls6.b[aot1.ordinal()];
            JVM INSTR tableswitch 1 2: default 148
        //                       1 185
        //                       2 185;
               goto _L6 _L7 _L7
_L6:
            super.a(obj);
            return;
_L5:
            (new StringBuilder("Entry with key=")).append(obj1).append(" is already in the cache, won't add");
            anK.e();
              goto _L8
            obj;
            anu;
            JVM INSTR monitorexit ;
            throw obj;
_L7:
            anK.d(c).a(aot.b.ordinal());
              goto _L6
        }

        public a(aoo aoo1, aoq aoq)
        {
            c = anK.this;
            super(aoq);
            anR.a(anK.d(anK.this).a(), "Cache must exist");
            b = aoo1;
        }
    }

    public static interface b
    {

        public abstract aob a(anS ans, Executor executor);

        public abstract String a();

        public abstract anO b();

        public abstract aom c();

        public abstract boolean d();
    }

    public static abstract class c
        implements b
    {

        public final aob a(anS ans, Executor executor)
        {
            return null;
        }

        public final anO b()
        {
            return anK.g();
        }

        public final aom c()
        {
            return anK.a(a());
        }

        public final boolean d()
        {
            return true;
        }

        public c()
        {
        }
    }

    final class d
        implements i
    {

        final anK a;
        private final ServiceConnection b;

        public final boolean a()
        {
            boolean flag;
            try
            {
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                intent.setPackage("com.android.vending");
                flag = anK.h(a).bindService(intent, b, 1);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                return false;
            }
            return flag;
        }

        public final void b()
        {
            anK.h(a).unbindService(b);
        }

        private d()
        {
            a = anK.this;
            super();
            b = new _cls1(this);
        }

        d(byte byte0)
        {
            this();
        }
    }

    static final class e
        implements aoq
    {

        public final void a(int i1, Exception exception)
        {
        }

        public final void a(Object obj)
        {
        }

        private e()
        {
        }

        e(byte byte0)
        {
            this();
        }
    }

    final class f
        implements aos
    {

        private aoo a;
        private anK b;

        public final boolean a()
        {
            obj = b();
            if (obj != null) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            if (!anK.d(b).a()) goto _L4; else goto _L3
_L3:
            Object obj1 = ((aoo) (obj)).a();
            if (obj1 == null) goto _L4; else goto _L5
_L5:
            obj1 = anK.d(b).a(((aoo) (obj)).b.a(((String) (obj1))));
            if (obj1 == null) goto _L4; else goto _L6
_L6:
            int i1;
            ((aoo) (obj)).a(((anO.a) (obj1)).a);
            i1 = 1;
_L7:
            if (i1 == 0)
            {
                IInAppBillingService iinappbillingservice;
                synchronized (anK.e(b))
                {
                    i1 = anK.f(b);
                    iinappbillingservice = anK.g(b);
                }
                if (i1 == 3)
                {
                    anR.a(iinappbillingservice);
                    try
                    {
                        ((aoo) (obj)).a(iinappbillingservice, anK.h(b).getPackageName());
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj2)
                    {
                        ((aoo) (obj)).a(((Exception) (obj2)));
                        return true;
                    }
                    catch (aop aop1)
                    {
                        ((aoo) (obj)).a(aop1);
                        return true;
                    }
                    catch (RuntimeException runtimeexception)
                    {
                        ((aoo) (obj)).a(runtimeexception);
                        return true;
                    }
                    return true;
                }
                break MISSING_BLOCK_LABEL_163;
            }
            if (true) goto _L1; else goto _L4
_L4:
            i1 = 0;
              goto _L7
            obj;
            obj2;
            JVM INSTR monitorexit ;
            throw obj;
            if (i1 != 6)
            {
                b.b();
                return false;
            } else
            {
                ((aoo) (obj)).a(10000);
                return true;
            }
        }

        public final aoo b()
        {
            this;
            JVM INSTR monitorenter ;
            aoo aoo1 = a;
            this;
            JVM INSTR monitorexit ;
            return aoo1;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void c()
        {
            this;
            JVM INSTR monitorenter ;
            if (a == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            (new StringBuilder("Cancelling request: ")).append(a);
            anK.f();
            synchronized (a)
            {
                if (aoo1.d != null)
                {
                    anK.a(aoo1.d);
                }
                aoo1.d = null;
            }
            a = null;
            this;
            JVM INSTR monitorexit ;
            return;
            exception1;
            aoo1;
            JVM INSTR monitorexit ;
            throw exception1;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final Object d()
        {
            this;
            JVM INSTR monitorenter ;
            Object obj;
            if (a == null)
            {
                break MISSING_BLOCK_LABEL_26;
            }
            obj = a.c;
_L1:
            this;
            JVM INSTR monitorexit ;
            return obj;
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
            obj = null;
              goto _L1
        }

        public final String toString()
        {
            return String.valueOf(a);
        }

        public f(aoo aoo1)
        {
            b = anK.this;
            super();
            a = aoo1;
        }
    }

    final class g
        implements anM
    {

        final Object a;
        final boolean b;
        final anK c;

        public final int a(aox aox1, String s, aok aok)
        {
            String s1 = aox1.a;
            aox1 = aox1.b;
            anR.a(s1);
            anR.a(aox1);
            return c.a(new aol(s1, aox1, s), a(((aoq) (aok))), a);
        }

        public final int a(String s, aoq aoq)
        {
            anR.a(s);
            aoq = new a(this, aoq);
            s = new anZ(s, anK.j(c));
            aoq.a = s;
            return c.a(s, a(aoq), a);
        }

        public final int a(String s, List list, aoq aoq)
        {
            anR.a(s);
            anR.a(list);
            return c.a(new aoa(s, list), a(aoq), a);
        }

        final aoq a(aoq aoq)
        {
            Object obj = aoq;
            if (b)
            {
                obj = new aoe(c.b, aoq);
            }
            return ((aoq) (obj));
        }

        public final int b(String s, aoq aoq)
        {
            anR.a(s);
            return c.a(new anV(s), a(aoq), a);
        }

        private g(Object obj, boolean flag)
        {
            c = anK.this;
            super();
            a = obj;
            b = flag;
        }

        g(Object obj, boolean flag, byte byte0)
        {
            this(obj, flag);
        }
    }

    final class g.a
        implements anQ
    {

        anZ a;
        private final aoq b;
        private final List c = new ArrayList();
        private g d;

        public final void a()
        {
            anK.a(b);
        }

        public final void a(int i1, Exception exception)
        {
            b.a(i1, exception);
        }

        public final void a(Object obj)
        {
            obj = (aon)obj;
            c.addAll(((aon) (obj)).b);
            if (((aon) (obj)).c != null)
            {
                a = new anZ(a, ((aon) (obj)).c);
                anK.a(d.c, a, d.a);
                return;
            } else
            {
                b.a(new aon(((aon) (obj)).a, c, null));
                return;
            }
        }

        public g.a(g g1, aoq aoq1)
        {
            d = g1;
            super();
            b = aoq1;
        }
    }

    public final class h
    {

        Boolean a;
        private Object b;
        private anK c;

        public final h a()
        {
            anR.b(a);
            a = Boolean.valueOf(true);
            return this;
        }

        public final h a(Object obj)
        {
            anR.b(b);
            b = obj;
            return this;
        }

        public final anM b()
        {
            anK ank = c;
            Object obj = b;
            boolean flag;
            if (a == null)
            {
                flag = true;
            } else
            {
                flag = a.booleanValue();
            }
            return ank. new g(obj, flag, (byte)0);
        }

        private h()
        {
            c = anK.this;
            super();
        }

        h(byte byte0)
        {
            this();
        }
    }

    static interface i
    {

        public abstract boolean a();

        public abstract void b();
    }

    static final class j extends Enum
    {

        private static final int a[] = {
            1, 2, 3, 4, 5, 6
        };

        public static int[] a()
        {
            return (int[])a.clone();
        }

    }

    static final class k
        implements b
    {

        private final b a;
        private final String b;

        public final aob a(anS ans, Executor executor)
        {
            return a.a(ans, executor);
        }

        public final String a()
        {
            return b;
        }

        public final anO b()
        {
            return a.b();
        }

        public final aom c()
        {
            return a.c();
        }

        public final boolean d()
        {
            return a.d();
        }

        private k(b b1)
        {
            a = b1;
            b = b1.a();
        }

        k(b b1, byte byte0)
        {
            this(b1);
        }
    }


    final Object a;
    anP b;
    final b c;
    final anU d;
    final anM e;
    aom f;
    volatile int g;
    private final Context h;
    private IInAppBillingService i;
    private volatile int j;
    private Executor k;
    private final aog l;
    private i m;

    public anK(Context context, b b1)
    {
        this(context, new Handler(), b1);
        anR.a();
    }

    private anK(Context context, Handler handler, b b1)
    {
        Object obj = null;
        super();
        j = 1;
        a = new Object();
        k = Executors.newSingleThreadExecutor(new ThreadFactory() {

            public final Thread newThread(Runnable runnable)
            {
                return new Thread(runnable, "RequestThread");
            }

        });
        l = new aog();
        h h1 = (new h((byte)0)).a(null);
        anR.b(h1.a);
        h1.a = Boolean.valueOf(false);
        e = h1.b();
        m = new d((byte)0);
        if (context instanceof Application)
        {
            h = context;
        } else
        {
            h = context.getApplicationContext();
        }
        b = new aod(handler);
        c = new k(b1, (byte)0);
        anR.a(c.a());
        context = b1.b();
        if (context == null)
        {
            context = obj;
        } else
        {
            context = new aou(context);
        }
        d = new anU(context);
        f = b1.c();
    }

    static int a(anK ank, aoo aoo1, Object obj)
    {
        return ank.a(aoo1, ((aoq) (null)), obj);
    }

    static aog a(anK ank)
    {
        return ank.l;
    }

    public static aom a(String s)
    {
        return new anX(s);
    }

    static void a()
    {
        try
        {
            Thread.sleep(100L);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            interruptedexception.getMessage();
        }
    }

    private void a(int i1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (j == i1) goto _L2; else goto _L1
_L1:
        j = i1;
        _cls6.a[j - 1];
        JVM INSTR tableswitch 1 2: default 87
    //                   1 55
    //                   2 67;
           goto _L3 _L4 _L5
_L3:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_67;
_L2:
        return;
_L4:
        i();
          goto _L2
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        b.execute(new Runnable() {

            private anK a;

            public final void run()
            {
                anK.a(a).a();
            }

            
            {
                a = anK.this;
                super();
            }
        });
          goto _L2
    }

    static void a(aoq aoq)
    {
        if (aoq instanceof anQ)
        {
            ((anQ)aoq).a();
        }
    }

    static void a(Exception exception)
    {
        exception.getMessage();
    }

    static void b(anK ank)
    {
        anR.a();
        if (!ank.m.a())
        {
            ank.a(6);
        }
    }

    static void c()
    {
    }

    static void c(anK ank)
    {
        anR.a();
        ank.m.b();
    }

    static anU d(anK ank)
    {
        return ank.d;
    }

    static void d()
    {
    }

    static Object e(anK ank)
    {
        return ank.a;
    }

    static void e()
    {
    }

    static int f(anK ank)
    {
        return ank.j;
    }

    static void f()
    {
    }

    public static anO g()
    {
        return new aof();
    }

    static IInAppBillingService g(anK ank)
    {
        return ank.i;
    }

    static Context h(anK ank)
    {
        return ank.h;
    }

    static anP i(anK ank)
    {
        return ank.b;
    }

    private void i()
    {
        k.execute(l);
    }

    static aom j(anK ank)
    {
        return ank.f;
    }

    final int a(aoo aoo1, aoq aoq, Object obj)
    {
        if (aoq == null) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj1 = aoq;
        if (d.a())
        {
            obj1 = new a(aoo1, aoq);
        }
        aoo1;
        JVM INSTR monitorenter ;
        anR.b(aoo1.d);
        aoo1.d = ((aoq) (obj1));
        aoo1;
        JVM INSTR monitorexit ;
_L2:
        if (obj != null)
        {
            aoo1.c = obj;
        }
        obj = l;
        f f1 = new f(aoo1);
        synchronized (((aog) (obj)).a)
        {
            (new StringBuilder("Adding pending request: ")).append(f1);
            ((aog) (obj)).a.add(f1);
        }
        b();
        return aoo1.a;
        aoq;
        aoo1;
        JVM INSTR monitorexit ;
        throw aoq;
        aoo1;
        aoq;
        JVM INSTR monitorexit ;
        throw aoo1;
    }

    final void a(IInAppBillingService iinappbillingservice, boolean flag)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (!flag) goto _L2; else goto _L1
_L1:
        if (j == 2) goto _L4; else goto _L3
_L3:
        obj;
        JVM INSTR monitorexit ;
        return;
_L8:
        byte byte0;
        i = iinappbillingservice;
        a(byte0);
        obj;
        JVM INSTR monitorexit ;
        return;
        iinappbillingservice;
        obj;
        JVM INSTR monitorexit ;
        throw iinappbillingservice;
_L6:
        byte0 = 3;
        continue; /* Loop/switch isn't completed */
_L2:
        if (j != 1)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        byte0 = 5;
        continue; /* Loop/switch isn't completed */
_L4:
        if (iinappbillingservice != null) goto _L6; else goto _L5
_L5:
        byte0 = 6;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void b()
    {
label0:
        {
            synchronized (a)
            {
                if (j != 3)
                {
                    break label0;
                }
                i();
            }
            return;
        }
        if (j != 2)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        int i1;
        if (c.d())
        {
            i1 = g;
        }
        a(2);
        b.execute(new Runnable() {

            private anK a;

            public final void run()
            {
                anK.b(a);
            }

            
            {
                a = anK.this;
                super();
            }
        });
        obj;
        JVM INSTR monitorexit ;
    }

    public final void h()
    {
        anR.a();
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        g = g - 1;
        if (g < 0)
        {
            g = 0;
        }
        if (g != 0 || !c.d()) goto _L2; else goto _L1
_L1:
        Object obj1 = a;
        obj1;
        JVM INSTR monitorenter ;
        if (j != 5 && j != 4 && j != 1) goto _L3; else goto _L2
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
_L3:
        Object obj3;
        a(4);
        b.execute(new Runnable() {

            private anK a;

            public final void run()
            {
                anK.c(a);
            }

            
            {
                a = anK.this;
                super();
            }
        });
        obj3 = l;
        Object obj2 = ((aog) (obj3)).a;
        obj2;
        JVM INSTR monitorenter ;
        for (obj3 = ((aog) (obj3)).a.iterator(); ((Iterator) (obj3)).hasNext(); ((Iterator) (obj3)).remove())
        {
            ((aos)((Iterator) (obj3)).next()).c();
        }

        break MISSING_BLOCK_LABEL_187;
        Exception exception;
        exception;
        obj2;
        JVM INSTR monitorexit ;
        throw exception;
        obj2;
        obj1;
        JVM INSTR monitorexit ;
        throw obj2;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj2;
        JVM INSTR monitorexit ;
        obj1;
        JVM INSTR monitorexit ;
          goto _L2
    }

    static 
    {
        new e((byte)0);
        new anW();
    }

    // Unreferenced inner class anK$5

/* anonymous class */
    final class _cls5 extends aor
    {

        private anK b;

        public final void a(Object obj)
        {
            obj = (aoi)obj;
            anK.d(b).a(aot.b.ordinal());
            super.a(obj);
        }

            
            {
                b = anK.this;
                super(aoq);
            }
    }


    // Unreferenced inner class anK$d$1

/* anonymous class */
    final class d._cls1
        implements ServiceConnection
    {

        private d a;

        public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            a.a.a(com.android.vending.billing.IInAppBillingService.Stub.a(ibinder), true);
        }

        public final void onServiceDisconnected(ComponentName componentname)
        {
            a.a.a(null, false);
        }

            
            {
                a = d1;
                super();
            }
    }

}
