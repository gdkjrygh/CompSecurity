// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.e;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            am, ab, ac, ai

public abstract class aa
    implements com.google.android.gms.common.api.a.b, ab.b
{
    final class a extends Handler
    {

        final aa a;

        public void handleMessage(Message message)
        {
            if (message.what == 1 && !a.f())
            {
                message = (b)message.obj;
                message.a();
                message.c();
                return;
            }
            if (message.what == 3)
            {
                aa.a(a).a(new com.google.android.gms.common.b(((Integer)message.obj).intValue(), null));
                return;
            }
            if (message.what == 4)
            {
                aa.a(a, 4, null);
                aa.a(a).a(((Integer)message.obj).intValue());
                aa.a(a, 4, 1, null);
                return;
            }
            if (message.what == 2 && !a.c())
            {
                message = (b)message.obj;
                message.a();
                message.c();
                return;
            }
            if (message.what == 2 || message.what == 1)
            {
                ((b)message.obj).b();
                return;
            } else
            {
                Log.wtf("GmsClient", "Don't know how to handle this message.");
                return;
            }
        }

        public a(Looper looper)
        {
            a = aa.this;
            super(looper);
        }
    }

    protected abstract class b
    {

        final aa a;
        private Object b;
        private boolean c;

        protected abstract void a();

        protected abstract void a(Object obj);

        public void b()
        {
            this;
            JVM INSTR monitorenter ;
            Object obj;
            obj = b;
            if (c)
            {
                Log.w("GmsClient", (new StringBuilder()).append("Callback proxy ").append(this).append(" being reused. This is not safe.").toString());
            }
            this;
            JVM INSTR monitorexit ;
            Object obj1;
            if (obj != null)
            {
                try
                {
                    a(obj);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    a();
                    throw obj1;
                }
            } else
            {
                a();
            }
            this;
            JVM INSTR monitorenter ;
            c = true;
            this;
            JVM INSTR monitorexit ;
            c();
            return;
            obj1;
            this;
            JVM INSTR monitorexit ;
            throw obj1;
            obj1;
            this;
            JVM INSTR monitorexit ;
            throw obj1;
        }

        public void c()
        {
            d();
            synchronized (aa.b(a))
            {
                aa.b(a).remove(this);
            }
            return;
            exception;
            arraylist;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void d()
        {
            this;
            JVM INSTR monitorenter ;
            b = null;
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public b(Object obj)
        {
            a = aa.this;
            super();
            b = obj;
            c = false;
        }
    }

    public static final class c
        implements com.google.android.gms.common.api.h.b
    {

        private final com.google.android.gms.common.d.a a;

        public void a(int i1)
        {
            a.a();
        }

        public void a(Bundle bundle)
        {
            a.a(bundle);
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof c)
            {
                return a.equals(((c)obj).a);
            } else
            {
                return a.equals(obj);
            }
        }

        public c(com.google.android.gms.common.d.a a1)
        {
            a = a1;
        }
    }

    public abstract class d extends b
    {

        final aa b;
        private final DataHolder c;

        protected void a()
        {
            if (c != null)
            {
                c.i();
            }
        }

        protected final void a(Object obj)
        {
            a(obj, c);
        }

        protected abstract void a(Object obj, DataHolder dataholder);

        public volatile void b()
        {
            super.b();
        }

        public volatile void c()
        {
            super.c();
        }

        public volatile void d()
        {
            super.d();
        }

        public d(Object obj, DataHolder dataholder)
        {
            b = aa.this;
            super(obj);
            c = dataholder;
        }
    }

    public static final class e extends ah.a
    {

        private aa a;

        public void a(int i1, IBinder ibinder, Bundle bundle)
        {
            am.a("onPostInitComplete can be called only once per call to getServiceFromBroker", a);
            a.a(i1, ibinder, bundle);
            a = null;
        }

        public e(aa aa1)
        {
            a = aa1;
        }
    }

    public final class f
        implements ServiceConnection
    {

        final aa a;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            a.b(ibinder);
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            a.a.sendMessage(a.a.obtainMessage(4, Integer.valueOf(1)));
        }

        public f()
        {
            a = aa.this;
            super();
        }
    }

    public static final class g
        implements com.google.android.gms.common.api.h.c
    {

        private final com.google.android.gms.common.d.b a;

        public void a(com.google.android.gms.common.b b1)
        {
            a.a(b1);
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof g)
            {
                return a.equals(((g)obj).a);
            } else
            {
                return a.equals(obj);
            }
        }

        public g(com.google.android.gms.common.d.b b1)
        {
            a = b1;
        }
    }

    protected final class h extends b
    {

        public final int b;
        public final Bundle c;
        public final IBinder d;
        final aa e;

        protected void a()
        {
        }

        protected void a(Boolean boolean1)
        {
            if (boolean1 == null)
            {
                aa.a(e, 1, null);
                return;
            }
            b;
            JVM INSTR lookupswitch 2: default 44
        //                       0: 142
        //                       10: 269;
               goto _L1 _L2 _L3
_L1:
            if (c != null)
            {
                boolean1 = (PendingIntent)c.getParcelable("pendingIntent");
            } else
            {
                boolean1 = null;
            }
            if (aa.c(e) != null)
            {
                ac.a(aa.d(e)).b(e.d(), aa.c(e));
                aa.a(e, null);
            }
            aa.a(e, 1, null);
            aa.a(e).a(new com.google.android.gms.common.b(b, boolean1));
            return;
_L2:
            boolean1 = d.getInterfaceDescriptor();
            if (!e.e().equals(boolean1)) goto _L5; else goto _L4
_L4:
            boolean1 = e.a(d);
            if (boolean1 != null)
            {
                try
                {
                    aa.a(e, 3, boolean1);
                    aa.a(e).a();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Boolean boolean1) { }
            }
_L5:
            ac.a(aa.d(e)).b(e.d(), aa.c(e));
            aa.a(e, null);
            aa.a(e, 1, null);
            aa.a(e).a(new com.google.android.gms.common.b(8, null));
            return;
_L3:
            aa.a(e, 1, null);
            throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
        }

        protected void a(Object obj)
        {
            a((Boolean)obj);
        }

        public h(int i1, IBinder ibinder, Bundle bundle)
        {
            e = aa.this;
            super(Boolean.valueOf(true));
            b = i1;
            d = ibinder;
            c = bundle;
        }
    }


    public static final String c[] = {
        "service_esmobile", "service_googleme"
    };
    final Handler a;
    boolean b;
    private final Context d;
    private final Looper e;
    private final Object f;
    private IInterface g;
    private final ArrayList h;
    private f i;
    private int j;
    private final String k[];
    private final ab l;

    protected transient aa(Context context, Looper looper, com.google.android.gms.common.api.h.b b1, com.google.android.gms.common.api.h.c c1, String as[])
    {
        f = new Object();
        h = new ArrayList();
        j = 1;
        b = false;
        d = (Context)am.a(context);
        e = (Looper)am.a(looper, "Looper must not be null");
        l = new ab(context, looper, this);
        a = new a(looper);
        a(as);
        k = as;
        a((com.google.android.gms.common.api.h.b)am.a(b1));
        a((com.google.android.gms.common.api.h.c)am.a(c1));
    }

    protected transient aa(Context context, com.google.android.gms.common.d.a a1, com.google.android.gms.common.d.b b1, String as[])
    {
        this(context, context.getMainLooper(), ((com.google.android.gms.common.api.h.b) (new c(a1))), ((com.google.android.gms.common.api.h.c) (new g(b1))), as);
    }

    static f a(aa aa1, f f1)
    {
        aa1.i = f1;
        return f1;
    }

    static ab a(aa aa1)
    {
        return aa1.l;
    }

    private void a(int i1, IInterface iinterface)
    {
        boolean flag2 = true;
        boolean flag;
        boolean flag1;
        if (i1 == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (iinterface != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag != flag1)
        {
            flag2 = false;
        }
        am.b(flag2);
        synchronized (f)
        {
            j = i1;
            g = iinterface;
        }
        return;
        iinterface;
        obj;
        JVM INSTR monitorexit ;
        throw iinterface;
    }

    static void a(aa aa1, int i1, IInterface iinterface)
    {
        aa1.a(i1, iinterface);
    }

    private boolean a(int i1, int j1, IInterface iinterface)
    {
label0:
        {
            synchronized (f)
            {
                if (j == i1)
                {
                    break label0;
                }
            }
            return false;
        }
        a(j1, iinterface);
        obj;
        JVM INSTR monitorexit ;
        return true;
        iinterface;
        obj;
        JVM INSTR monitorexit ;
        throw iinterface;
    }

    static boolean a(aa aa1, int i1, int j1, IInterface iinterface)
    {
        return aa1.a(i1, j1, iinterface);
    }

    static ArrayList b(aa aa1)
    {
        return aa1.h;
    }

    static f c(aa aa1)
    {
        return aa1.i;
    }

    static Context d(aa aa1)
    {
        return aa1.d;
    }

    public Bundle X_()
    {
        return null;
    }

    public boolean Y_()
    {
        return b;
    }

    protected abstract IInterface a(IBinder ibinder);

    public void a()
    {
        b = true;
        a(2, ((IInterface) (null)));
        int i1 = com.google.android.gms.common.e.a(d);
        if (i1 != 0)
        {
            a(1, ((IInterface) (null)));
            a.sendMessage(a.obtainMessage(3, Integer.valueOf(i1)));
        } else
        {
            if (i != null)
            {
                Log.e("GmsClient", (new StringBuilder()).append("Calling connect() while still connected, missing disconnect() for ").append(d()).toString());
                ac.a(d).b(d(), i);
            }
            i = new f();
            if (!ac.a(d).a(d(), i))
            {
                Log.e("GmsClient", (new StringBuilder()).append("unable to connect to service: ").append(d()).toString());
                a.sendMessage(a.obtainMessage(3, Integer.valueOf(9)));
                return;
            }
        }
    }

    public void a(int i1)
    {
        a.sendMessage(a.obtainMessage(4, Integer.valueOf(i1)));
    }

    protected void a(int i1, IBinder ibinder, Bundle bundle)
    {
        a.sendMessage(a.obtainMessage(1, new h(i1, ibinder, bundle)));
    }

    public void a(com.google.android.gms.common.api.h.b b1)
    {
        l.a(b1);
    }

    public void a(com.google.android.gms.common.api.h.c c1)
    {
        l.a(c1);
    }

    public void a(com.google.android.gms.common.d.a a1)
    {
        l.a(new c(a1));
    }

    public void a(com.google.android.gms.common.d.b b1)
    {
        l.a(b1);
    }

    public final void a(b b1)
    {
        synchronized (h)
        {
            h.add(b1);
        }
        a.sendMessage(a.obtainMessage(2, b1));
        return;
        b1;
        arraylist;
        JVM INSTR monitorexit ;
        throw b1;
    }

    protected abstract void a(ai ai, e e1)
        throws RemoteException;

    protected transient void a(String as[])
    {
    }

    public void b()
    {
        b = false;
        ArrayList arraylist = h;
        arraylist;
        JVM INSTR monitorenter ;
        int j1 = h.size();
        int i1 = 0;
_L2:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        ((b)h.get(i1)).d();
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        h.clear();
        arraylist;
        JVM INSTR monitorexit ;
        a(1, ((IInterface) (null)));
        if (i != null)
        {
            ac.a(d).b(d(), i);
            i = null;
        }
        return;
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void b(IBinder ibinder)
    {
        try
        {
            a(ai.a.a(ibinder), new e(this));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IBinder ibinder)
        {
            Log.w("GmsClient", "service died");
            a(1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IBinder ibinder)
        {
            Log.w("GmsClient", "Remote exception occurred", ibinder);
        }
    }

    public boolean b(com.google.android.gms.common.d.a a1)
    {
        return l.b(new c(a1));
    }

    public boolean b(com.google.android.gms.common.d.b b1)
    {
        return l.b(b1);
    }

    public void c(com.google.android.gms.common.d.a a1)
    {
        l.c(new c(a1));
    }

    public void c(com.google.android.gms.common.d.b b1)
    {
        l.c(b1);
    }

    public boolean c()
    {
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (j == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected abstract String d();

    protected abstract String e();

    public boolean f()
    {
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (j == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Context g()
    {
        return d;
    }

    public final Looper h()
    {
        return e;
    }

    public final String[] i()
    {
        return k;
    }

    protected final void j()
    {
        if (!c())
        {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        } else
        {
            return;
        }
    }

    public final IInterface k()
        throws DeadObjectException
    {
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        if (j == 4)
        {
            throw new DeadObjectException();
        }
        break MISSING_BLOCK_LABEL_28;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        j();
        IInterface iinterface;
        boolean flag;
        if (g != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        am.a(flag, "Client is connected but service is null");
        iinterface = g;
        obj;
        JVM INSTR monitorexit ;
        return iinterface;
    }

}
