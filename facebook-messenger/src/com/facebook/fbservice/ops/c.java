// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.ops;

import android.app.Activity;
import android.app.ActivityGroup;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.facebook.auth.viewercontext.e;
import com.facebook.base.activity.h;
import com.facebook.common.executors.a;
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
//            j, g, f, h, 
//            i, d, ab

public class c
{

    public static final Map a = ik.c();
    private static final Class b = com/facebook/fbservice/ops/c;
    private static final l c = new l();
    private final Context d;
    private final p e;
    private final g f = new g(this, null);
    private final a g;
    private final e h;
    private final Context i;
    private final d j;
    private Handler k;
    private w l;
    private com.facebook.fbservice.ops.h m;
    private i n;
    private boolean o;
    private boolean p;
    private boolean q;
    private ab r;
    private j s;
    private OperationType t;
    private Bundle u;
    private String v;
    private boolean w;
    private boolean x;
    private boolean y;

    public c(Context context, p p1, a a1, e e1, d d1)
    {
        s = j.INIT;
        d = context;
        e = p1;
        g = a1;
        h = e1;
        i = a(context);
        j = d1;
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

    static w a(c c1, w w1)
    {
        c1.l = w1;
        return w1;
    }

    static void a(c c1, OperationResult operationresult)
    {
        c1.b(operationresult);
    }

    static void a(c c1, Runnable runnable)
    {
        c1.a(runnable);
    }

    private void a(OperationResult operationresult)
    {
        if (q)
        {
            a();
            return;
        } else
        {
            a(((Runnable) (new f(this, operationresult))));
            return;
        }
    }

    private void a(ServiceException serviceexception)
    {
        s = j.COMPLETED;
        v = null;
        j();
        boolean flag = false;
        if (d instanceof h)
        {
            flag = ((h)d).a(serviceexception);
        }
        if (o)
        {
            d();
        }
        if (!flag && m != null)
        {
            m.a(serviceexception);
        }
        if (p)
        {
            a();
        }
    }

    private void a(Runnable runnable)
    {
        if (k != null)
        {
            k.post(runnable);
            return;
        } else
        {
            g.c(runnable);
            return;
        }
    }

    static boolean a(c c1)
    {
        return c1.y;
    }

    static boolean a(c c1, boolean flag)
    {
        c1.x = flag;
        return flag;
    }

    static void b(c c1)
    {
        c1.g();
    }

    static void b(c c1, OperationResult operationresult)
    {
        c1.a(operationresult);
    }

    private void b(OperationResult operationresult)
    {
        if (n != null)
        {
            n.a(operationresult);
        }
    }

    static void c(c c1, OperationResult operationresult)
    {
        c1.c(operationresult);
    }

    private void c(OperationResult operationresult)
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

    static boolean c(c c1)
    {
        return c1.q;
    }

    private void d(OperationResult operationresult)
    {
        s = j.COMPLETED;
        v = null;
        j();
        if (o)
        {
            d();
        }
        if (m != null)
        {
            m.a(operationresult);
        }
        if (p)
        {
            a();
        }
    }

    private void e()
    {
        if (w)
        {
            try
            {
                i.unbindService(f);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                com.facebook.debug.log.b.a(c, b, (new StringBuilder()).append("Exception unbinding ").append(t).toString(), illegalargumentexception);
            }
            w = false;
        }
    }

    private void f()
    {
        if (l != null)
        {
            g();
        } else
        if (!w)
        {
            Object obj = e.d(t);
            if (obj == null)
            {
                a(OperationResult.a(t.ORCA_SERVICE_IPC_FAILURE, "Unknown operation type"));
                return;
            }
            obj = new Intent(d, ((Class) (obj)));
            if (i.bindService(((Intent) (obj)), f, 1))
            {
                w = true;
                return;
            } else
            {
                a(OperationResult.a(t.ORCA_SERVICE_IPC_FAILURE, "Bind to BlueService failed"));
                return;
            }
        }
    }

    private void g()
    {
        boolean flag;
        boolean flag1;
        flag = true;
        flag1 = true;
        if (s != j.READY_TO_QUEUE) goto _L2; else goto _L1
_L1:
        RemoteException remoteexception;
        if (t != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Null operation type");
        if (v == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Non-null operation id");
        if (!x)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Registered for completion and haven't yet sent");
        v = l.a(t, u);
        if (l == null)
        {
            throw new RemoteException();
        }
          goto _L3
_L5:
        return;
_L3:
        try
        {
            h();
            s = j.OPERATION_QUEUED;
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
        if (s == j.OPERATION_QUEUED)
        {
            if (v == null)
            {
                flag = false;
            }
            Preconditions.checkState(flag, "null operation id");
            if (!x)
            {
                try
                {
                    h();
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

    private void h()
    {
        if (l.a(v, new com.facebook.fbservice.ops.d(this)))
        {
            x = true;
            return;
        } else
        {
            a(OperationResult.a(t.ORCA_SERVICE_IPC_FAILURE, (new StringBuilder()).append("Unknown operation: ").append(v).toString()));
            return;
        }
    }

    private void i()
    {
        if (r != null)
        {
            r.a();
        }
    }

    private void j()
    {
        if (r != null)
        {
            r.b();
        }
    }

    public void a()
    {
        y = true;
        e();
        l = null;
        n = null;
        m = null;
        j();
    }

    public void a(Bundle bundle)
    {
        bundle.putSerializable("operationState", s);
        bundle.putParcelable("type", t);
        bundle.putParcelable("param", u);
        bundle.putString("operationId", v);
    }

    public void a(ab ab1)
    {
        if (s == j.READY_TO_QUEUE || s == j.OPERATION_QUEUED)
        {
            j();
        }
        r = ab1;
        if (s == j.READY_TO_QUEUE || s == j.OPERATION_QUEUED)
        {
            i();
        }
    }

    public void a(com.facebook.fbservice.ops.h h1)
    {
        m = h1;
    }

    public void a(i i1)
    {
        n = i1;
    }

    public void a(OperationType operationtype, Bundle bundle)
    {
        boolean flag1 = true;
        boolean flag;
        if (s == j.INIT)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Incorrect operation state");
        if (t == null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Initially operationType should be null");
        Preconditions.checkNotNull(operationtype, "non-null operationType");
        s = j.READY_TO_QUEUE;
        t = operationtype;
        u = new Bundle(bundle);
        if (Looper.myLooper() != null)
        {
            k = new Handler();
        }
        if (!u.containsKey("overridden_viewer_context"))
        {
            operationtype = h.a();
            if (operationtype != null)
            {
                u.putParcelable("overridden_viewer_context", operationtype);
            }
        }
        u.putString("calling_process_name", j.b().b());
        i();
        f();
    }

    public void a(boolean flag)
    {
        o = flag;
    }

    public void b(Bundle bundle)
    {
        s = (j)bundle.getSerializable("operationState");
        u = (Bundle)bundle.getParcelable("param");
        t = (OperationType)bundle.getParcelable("type");
        v = bundle.getString("operationId");
        if (Looper.myLooper() != null)
        {
            k = new Handler();
        }
        if (s != j.INIT)
        {
            if (s == j.READY_TO_QUEUE)
            {
                i();
                f();
                return;
            }
            if (s == j.OPERATION_QUEUED)
            {
                i();
                f();
                return;
            }
            if (s == j.COMPLETED)
            {
                return;
            }
        }
    }

    public void b(boolean flag)
    {
        q = flag;
    }

    public boolean b()
    {
        return s != j.INIT && s != j.COMPLETED;
    }

    public j c()
    {
        return s;
    }

    public void d()
    {
        boolean flag;
        if (s == j.INIT || s == j.COMPLETED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        s = j.INIT;
        t = null;
        u = null;
        v = null;
        x = false;
        e();
        l = null;
    }

}
