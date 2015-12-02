// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.ops;

import android.app.Activity;
import android.app.ActivityGroup;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.facebook.auth.viewercontext.e;
import com.facebook.base.activity.h;
import com.facebook.common.executors.a;
import com.facebook.common.process.c;
import com.facebook.common.process.d;
import com.facebook.debug.log.b;
import com.facebook.debug.log.l;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.OperationType;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.fbservice.service.p;
import com.facebook.fbservice.service.t;
import com.facebook.fbservice.service.w;
import com.google.common.a.ik;
import com.google.common.base.Preconditions;
import java.util.Map;

// Referenced classes of package com.facebook.fbservice.ops:
//            m, y, x, z, 
//            s, w, l, u, 
//            ab, t, n

class r
    implements m
{

    public static final Map a = ik.c();
    private static final Class b = com/facebook/fbservice/ops/m;
    private static final l c = new l();
    private OperationType d;
    private Bundle e;
    private final Context f;
    private final x g = new x(this, null);
    private final p h;
    private final a i;
    private final e j;
    private final Context k;
    private final z l = new z(this, null);
    private Handler m;
    private w n;
    private boolean o;
    private ab p;
    private y q;
    private String r;
    private boolean s;
    private boolean t;
    private com.facebook.common.d.e u;

    public r(OperationType operationtype, Bundle bundle, Context context, p p1, a a1, e e1, d d1)
    {
        q = y.INIT;
        d = operationtype;
        e = new Bundle(bundle);
        f = context;
        h = p1;
        i = a1;
        j = e1;
        k = a(context);
        u = new s(this);
        if (!e.containsKey("overridden_viewer_context"))
        {
            operationtype = j.a();
            if (operationtype != null)
            {
                e.putParcelable("overridden_viewer_context", operationtype);
            }
        }
        e.putString("calling_process_name", d1.b().b());
    }

    private Context a(Context context)
    {
        Object obj = context;
        if (context instanceof Activity)
        {
            Activity activity = (Activity)context;
            obj = context;
            if (activity.getParent() instanceof ActivityGroup)
            {
                obj = activity.getParent();
            }
        }
        return ((Context) (obj));
    }

    static com.facebook.common.d.e a(r r1)
    {
        return r1.u;
    }

    static w a(r r1, w w1)
    {
        r1.n = w1;
        return w1;
    }

    static void a(r r1, OperationResult operationresult)
    {
        r1.c(operationresult);
    }

    static void a(r r1, Runnable runnable)
    {
        r1.a(runnable);
    }

    private void a(OperationResult operationresult)
    {
        if (o)
        {
            d();
            return;
        } else
        {
            a(((Runnable) (new com.facebook.fbservice.ops.w(this, operationresult))));
            return;
        }
    }

    private void a(ServiceException serviceexception)
    {
        q = y.COMPLETED;
        r = null;
        k();
        boolean flag = false;
        if (f instanceof h)
        {
            flag = ((h)f).a(serviceexception);
        }
        if (!flag)
        {
            l.a_(serviceexception);
        }
        d();
    }

    private void a(Runnable runnable)
    {
        if (m != null)
        {
            m.post(runnable);
            return;
        } else
        {
            i.c(runnable);
            return;
        }
    }

    static boolean a(r r1, boolean flag)
    {
        r1.t = flag;
        return flag;
    }

    static Handler b(r r1)
    {
        return r1.m;
    }

    static void b(r r1, OperationResult operationresult)
    {
        r1.a(operationresult);
    }

    private void b(OperationResult operationresult)
    {
        if (operationresult.c())
        {
            d(operationresult);
            return;
        } else
        {
            a(new ServiceException(operationresult));
            return;
        }
    }

    static void c(r r1)
    {
        r1.h();
    }

    static void c(r r1, OperationResult operationresult)
    {
        r1.b(operationresult);
    }

    private void c(OperationResult operationresult)
    {
        if (!l.isDone())
        {
            com.facebook.fbservice.ops.l l1 = l.a();
            if (l1 != null)
            {
                l1.a(operationresult);
            }
        }
    }

    static void d(r r1)
    {
        r1.f();
    }

    private void d(OperationResult operationresult)
    {
        q = y.COMPLETED;
        r = null;
        k();
        l.a(operationresult);
        d();
    }

    static void e(r r1)
    {
        r1.k();
    }

    static z f(r r1)
    {
        return r1.l;
    }

    private void f()
    {
        if (s)
        {
            try
            {
                k.unbindService(g);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                com.facebook.debug.log.b.a(c, b, (new StringBuilder()).append("Exception unbinding: ").append(d).toString(), illegalargumentexception);
            }
            s = false;
        }
    }

    private void g()
    {
        if (n != null)
        {
            h();
        } else
        if (!s)
        {
            android.content.Intent intent = h.c(d);
            if (intent == null)
            {
                a(OperationResult.a(t.ORCA_SERVICE_IPC_FAILURE, (new StringBuilder()).append("Unknown operation type: ").append(d).toString()));
                return;
            }
            if (k.bindService(intent, g, 1))
            {
                s = true;
                return;
            } else
            {
                a(OperationResult.a(t.ORCA_SERVICE_IPC_FAILURE, "Bind to BlueService failed"));
                return;
            }
        }
    }

    static void g(r r1)
    {
        r1.g();
    }

    private void h()
    {
        boolean flag;
        boolean flag1;
        flag = true;
        flag1 = true;
        if (q != y.READY_TO_QUEUE) goto _L2; else goto _L1
_L1:
        RemoteException remoteexception;
        if (d != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Null operation type");
        if (r == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Non-null operation id");
        if (!t)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Registered for completion and haven't yet sent");
        r = n.a(d, e);
        if (n == null)
        {
            throw new RemoteException();
        }
          goto _L3
_L5:
        return;
_L3:
        try
        {
            i();
            q = y.OPERATION_QUEUED;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RemoteException remoteexception)
        {
            a(OperationResult.a(t.ORCA_SERVICE_IPC_FAILURE, "BlueService.<method> or registerCompletionHandler failed"));
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        if (q == y.OPERATION_QUEUED)
        {
            if (r == null)
            {
                flag = false;
            }
            Preconditions.checkState(flag, "null operation id");
            if (!t)
            {
                try
                {
                    i();
                    return;
                }
                catch (RemoteException remoteexception1)
                {
                    a(OperationResult.a(t.ORCA_SERVICE_IPC_FAILURE, "BlueService.registerCompletionHandler failed"));
                }
                return;
            }
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    static boolean h(r r1)
    {
        return r1.o;
    }

    private void i()
    {
        if (n.a(r, new u(this)))
        {
            t = true;
            return;
        } else
        {
            a(OperationResult.a(t.ORCA_SERVICE_IPC_FAILURE, (new StringBuilder()).append("Unknown operation: ").append(r).toString()));
            return;
        }
    }

    private void j()
    {
        if (p != null)
        {
            p.a();
        }
    }

    private void k()
    {
        if (p != null)
        {
            p.b();
        }
    }

    public m a(ab ab1)
    {
        if (q == y.READY_TO_QUEUE || q == y.OPERATION_QUEUED)
        {
            k();
        }
        p = ab1;
        if (q == y.READY_TO_QUEUE || q == y.OPERATION_QUEUED)
        {
            j();
        }
        return this;
    }

    public m a(boolean flag)
    {
        o = flag;
        return this;
    }

    public n a()
    {
        boolean flag;
        if (q == y.INIT)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Incorrect operation state");
        q = y.READY_TO_QUEUE;
        if (Looper.myLooper() != null)
        {
            m = new Handler();
        }
        j();
        g();
        return l;
    }

    public n b()
    {
        boolean flag;
        if (q == y.INIT)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Incorrect operation state");
        q = y.READY_TO_QUEUE;
        m = new Handler(Looper.getMainLooper());
        j();
        a(new com.facebook.fbservice.ops.t(this));
        return l;
    }

    public boolean c()
    {
        return q != y.INIT && q != y.COMPLETED;
    }

    public void d()
    {
        u.a();
    }

    public boolean e()
    {
        return u.c();
    }

}
