// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.DeadObjectException;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.ag;
import com.google.android.gms.internal.am;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.api:
//            j, k, i, Status, 
//            l, h

public class b
{
    public static abstract class a
        implements d, i
    {

        protected final b a;
        private final Object b;
        private final CountDownLatch c;
        private final ArrayList d;
        private l e;
        private volatile k f;
        private volatile boolean g;
        private boolean h;
        private boolean i;
        private ag j;

        static void a(a a1)
        {
            a1.j();
        }

        private void b(k k1)
        {
            f = k1;
            j = null;
            c.countDown();
            k1 = f.a();
            if (e != null)
            {
        /* block-local class not found */
        class b {}

                a.a();
                if (!h)
                {
                    a.a(e, f());
                }
            }
            for (Iterator iterator = d.iterator(); iterator.hasNext(); ((i.a)iterator.next()).a(k1)) { }
            d.clear();
        }

        private k f()
        {
            Object obj = b;
            obj;
            JVM INSTR monitorenter ;
            k k1;
            Exception exception;
            boolean flag;
            if (!g)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            am.a(flag, "Result has already been consumed.");
            am.a(a(), "Result is not ready.");
            k1 = f;
            e();
            obj;
            JVM INSTR monitorexit ;
            return k1;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private void i()
        {
            synchronized (b)
            {
                if (!a())
                {
                    a(a(Status.b));
                    i = true;
                }
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private void j()
        {
            synchronized (b)
            {
                if (!a())
                {
                    a(a(Status.d));
                    i = true;
                }
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final k a(long l, TimeUnit timeunit)
        {
            boolean flag1 = true;
            boolean flag;
            if (l <= 0L || Looper.myLooper() != Looper.getMainLooper())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            am.a(flag, "await must not be called on the UI thread when time is greater than zero.");
            if (!g)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            am.a(flag, "Result has already been consumed.");
            try
            {
                if (!c.await(l, timeunit))
                {
                    j();
                }
            }
            // Misplaced declaration of an exception variable
            catch (TimeUnit timeunit)
            {
                i();
            }
            am.a(a(), "Result is not ready.");
            return f();
        }

        protected abstract k a(Status status);

        public final void a(i.a a1)
        {
            Object obj;
            boolean flag;
            if (!g)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            am.a(flag, "Result has already been consumed.");
            obj = b;
            obj;
            JVM INSTR monitorenter ;
            if (!a())
            {
                break MISSING_BLOCK_LABEL_47;
            }
            a1.a(f.a());
_L2:
            return;
            d.add(a1);
            if (true) goto _L2; else goto _L1
_L1:
            a1;
            obj;
            JVM INSTR monitorexit ;
            throw a1;
        }

        public final void a(k k1)
        {
            boolean flag1;
label0:
            {
                flag1 = true;
                synchronized (b)
                {
                    if (!i && !h)
                    {
                        break label0;
                    }
                    b.a(k1);
                }
                return;
            }
            boolean flag;
            if (!a())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            am.a(flag, "Results have already been set");
            if (!g)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            am.a(flag, "Result has already been consumed");
            b(k1);
            obj;
            JVM INSTR monitorexit ;
            return;
            k1;
            obj;
            JVM INSTR monitorexit ;
            throw k1;
        }

        public final void a(l l)
        {
label0:
            {
                boolean flag;
                if (!g)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                am.a(flag, "Result has already been consumed.");
                synchronized (b)
                {
                    if (!d())
                    {
                        break label0;
                    }
                }
                return;
            }
            if (!a())
            {
                break MISSING_BLOCK_LABEL_59;
            }
            a.a(l, f());
_L1:
            obj;
            JVM INSTR monitorexit ;
            return;
            l;
            obj;
            JVM INSTR monitorexit ;
            throw l;
            e = l;
              goto _L1
        }

        public final void a(l l, long l1, TimeUnit timeunit)
        {
label0:
            {
                boolean flag1 = true;
                boolean flag;
                if (!g)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                am.a(flag, "Result has already been consumed.");
                if (a != null)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                am.a(flag, "CallbackHandler has not been set before calling setResultCallback.");
                synchronized (b)
                {
                    if (!d())
                    {
                        break label0;
                    }
                }
                return;
            }
            if (!a())
            {
                break MISSING_BLOCK_LABEL_87;
            }
            a.a(l, f());
_L1:
            obj;
            JVM INSTR monitorexit ;
            return;
            l;
            obj;
            JVM INSTR monitorexit ;
            throw l;
            e = l;
            a.a(this, timeunit.toMillis(l1));
              goto _L1
        }

        protected final void a(ag ag1)
        {
            synchronized (b)
            {
                j = ag1;
            }
            return;
            ag1;
            obj;
            JVM INSTR monitorexit ;
            throw ag1;
        }

        public volatile void a(Object obj)
        {
            a((k)obj);
        }

        public final boolean a()
        {
            return c.getCount() == 0L;
        }

        public final k b()
        {
            boolean flag1 = true;
            boolean flag;
            if (Looper.myLooper() != Looper.getMainLooper())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            am.a(flag, "await must not be called on the UI thread");
            if (!g)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            am.a(flag, "Result has already been consumed");
            try
            {
                c.await();
            }
            catch (InterruptedException interruptedexception)
            {
                i();
            }
            am.a(a(), "Result is not ready.");
            return f();
        }

        public void c()
        {
label0:
            {
                synchronized (b)
                {
                    if (!h && !g)
                    {
                        break label0;
                    }
                }
                return;
            }
            ag ag1 = j;
            if (ag1 == null)
            {
                break MISSING_BLOCK_LABEL_42;
            }
            try
            {
                j.a();
            }
            catch (RemoteException remoteexception) { }
            b.a(f);
            e = null;
            h = true;
            b(a(Status.e));
            obj;
            JVM INSTR monitorexit ;
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public boolean d()
        {
            boolean flag;
            synchronized (b)
            {
                flag = h;
            }
            return flag;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected void e()
        {
            g = true;
            f = null;
            e = null;
        }

        protected a(Looper looper)
        {
            b = new Object();
            c = new CountDownLatch(1);
            d = new ArrayList();
            a = new b(looper);
        }

        protected a(b b1)
        {
            b = new Object();
            c = new CountDownLatch(1);
            d = new ArrayList();
            a = b1;
        }
    }

    public static abstract class c extends a
        implements p.d
    {

        private final a.d b;
        private final h c;
        private p.b d;

        private void a(RemoteException remoteexception)
        {
            b(new Status(8, remoteexception.getLocalizedMessage(), null));
        }

        public final void a(a.b b1)
            throws DeadObjectException
        {
            try
            {
                b(b1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (a.b b1)
            {
                a(((RemoteException) (b1)));
                throw b1;
            }
            // Misplaced declaration of an exception variable
            catch (a.b b1)
            {
                a(((RemoteException) (b1)));
            }
        }

        public void a(p.b b1)
        {
            d = b1;
        }

        public final void b(Status status)
        {
            boolean flag;
            if (!status.f())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            am.b(flag, "Failed result must not be success");
            a(a(status));
        }

        protected abstract void b(a.b b1)
            throws RemoteException;

        protected void e()
        {
            super.e();
            if (d != null)
            {
                d.a(this);
                d = null;
            }
        }

        public final c f()
        {
            am.a(c, "GoogleApiClient was not set.");
            c.b(this);
            return this;
        }

        public final a.d g()
        {
            return b;
        }

        public int h()
        {
            return 0;
        }

        protected c(a.d d1, h h1)
        {
            super(h1.a());
            b = (a.d)am.a(d1);
            c = h1;
        }
    }

    public static interface d
    {

        public abstract void a(Object obj);
    }


    public b()
    {
    }

    static void a(k k)
    {
        if (!(k instanceof j))
        {
            break MISSING_BLOCK_LABEL_16;
        }
        ((j)k).b();
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        Log.w("GoogleApi", (new StringBuilder()).append("Unable to release ").append(k).toString(), runtimeexception);
        return;
    }
}
