// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.media:
//            c, d, a, e, 
//            b

final class k extends android.support.v7.media.c
    implements ServiceConnection
{
    private final class a
        implements android.os.IBinder.DeathRecipient
    {

        final k a;
        private final Messenger b;
        private final d c = new d(this);
        private final Messenger d;
        private int e;
        private int f;
        private int g;
        private int h;
        private final SparseArray i = new SparseArray();

        static void a(a a1)
        {
            a1.c();
        }

        private boolean a(int i1, int j1, int k1, Object obj, Bundle bundle)
        {
            Message message;
            message = Message.obtain();
            message.what = i1;
            message.arg1 = j1;
            message.arg2 = k1;
            message.obj = obj;
            message.setData(bundle);
            message.replyTo = d;
            b.send(message);
            return true;
            obj;
            if (i1 != 2)
            {
                Log.e("MediaRouteProviderProxy", "Could not send message to service.", ((Throwable) (obj)));
            }
_L2:
            return false;
            obj;
            if (true) goto _L2; else goto _L1
_L1:
        }

        private void c()
        {
            for (int i1 = 0; i1 < i.size(); i1++)
            {
                ((g.c)i.valueAt(i1)).a(null, null);
            }

            i.clear();
        }

        public int a(String s)
        {
            int i1 = f;
            f = i1 + 1;
            Bundle bundle = new Bundle();
            bundle.putString("routeId", s);
            int j1 = e;
            e = j1 + 1;
            a(3, j1, i1, null, bundle);
            return i1;
        }

        public void a(int i1, int j1)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", j1);
            j1 = e;
            e = j1 + 1;
            a(7, j1, i1, null, bundle);
        }

        public void a(android.support.v7.media.b b1)
        {
            int i1 = e;
            e = i1 + 1;
            if (b1 != null)
            {
                b1 = b1.d();
            } else
            {
                b1 = null;
            }
            a(10, i1, 0, b1, null);
        }

        public boolean a()
        {
            int i1 = e;
            e = i1 + 1;
            h = i1;
            if (!a(1, h, 1, null, null))
            {
                return false;
            }
            try
            {
                b.getBinder().linkToDeath(this, 0);
            }
            catch (RemoteException remoteexception)
            {
                binderDied();
                return false;
            }
            return true;
        }

        public boolean a(int i1)
        {
            if (i1 == h)
            {
                h = 0;
                k.a(a, this, "Registation failed");
            }
            g.c c1 = (g.c)i.get(i1);
            if (c1 != null)
            {
                i.remove(i1);
                c1.a(null, null);
            }
            return true;
        }

        public boolean a(int i1, int j1, Bundle bundle)
        {
            if (g == 0 && i1 == h && j1 >= 1)
            {
                h = 0;
                g = j1;
                k.a(a, this, android.support.v7.media.d.a(bundle));
                k.a(a, this);
                return true;
            } else
            {
                return false;
            }
        }

        public boolean a(int i1, Intent intent, g.c c1)
        {
            int j1 = e;
            e = j1 + 1;
            if (a(9, j1, i1, intent, null))
            {
                if (c1 != null)
                {
                    i.put(j1, c1);
                }
                return true;
            } else
            {
                return false;
            }
        }

        public boolean a(int i1, Bundle bundle)
        {
            g.c c1 = (g.c)i.get(i1);
            if (c1 != null)
            {
                i.remove(i1);
                c1.a(bundle);
                return true;
            } else
            {
                return false;
            }
        }

        public boolean a(int i1, String s, Bundle bundle)
        {
            g.c c1 = (g.c)i.get(i1);
            if (c1 != null)
            {
                i.remove(i1);
                c1.a(s, bundle);
                return true;
            } else
            {
                return false;
            }
        }

        public boolean a(Bundle bundle)
        {
            if (g != 0)
            {
                k.a(a, this, android.support.v7.media.d.a(bundle));
                return true;
            } else
            {
                return false;
            }
        }

        public void b()
        {
            a(2, 0, 0, null, null);
            c.a();
            b.getBinder().unlinkToDeath(this, 0);
            k.a(a).post(new Runnable(this) {

                final a a;

                public void run()
                {
                    a.a(a);
                }

            
            {
                a = a1;
                super();
            }
            });
        }

        public void b(int i1, int j1)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", j1);
            j1 = e;
            e = j1 + 1;
            a(8, j1, i1, null, bundle);
        }

        public boolean b(int i1)
        {
            return true;
        }

        public void binderDied()
        {
            k.a(a).post(new Runnable(this) {

                final a a;

                public void run()
                {
                    k.b(a.a, a);
                }

            
            {
                a = a1;
                super();
            }
            });
        }

        public void c(int i1)
        {
            int j1 = e;
            e = j1 + 1;
            a(4, j1, i1, null, null);
        }

        public void d(int i1)
        {
            int j1 = e;
            e = j1 + 1;
            a(5, j1, i1, null, null);
        }

        public void e(int i1)
        {
            int j1 = e;
            e = j1 + 1;
            a(6, j1, i1, null, null);
        }

        public a(Messenger messenger)
        {
            a = k.this;
            super();
            e = 1;
            f = 1;
            b = messenger;
            d = new Messenger(c);
        }
    }

    private final class b extends c.d
    {

        final k a;
        private final String b;
        private boolean c;
        private int d;
        private int e;
        private a f;
        private int g;

        public void a()
        {
            k.a(a, this);
        }

        public void a(int i1)
        {
            if (f != null)
            {
                f.a(g, i1);
                return;
            } else
            {
                d = i1;
                e = 0;
                return;
            }
        }

        public void a(a a1)
        {
            f = a1;
            g = a1.a(b);
            if (c)
            {
                a1.d(g);
                if (d >= 0)
                {
                    a1.a(g, d);
                    d = -1;
                }
                if (e != 0)
                {
                    a1.b(g, e);
                    e = 0;
                }
            }
        }

        public boolean a(Intent intent, g.c c1)
        {
            if (f != null)
            {
                return f.a(g, intent, c1);
            } else
            {
                return false;
            }
        }

        public void b()
        {
            c = true;
            if (f != null)
            {
                f.d(g);
            }
        }

        public void b(int i1)
        {
            if (f != null)
            {
                f.b(g, i1);
                return;
            } else
            {
                e = e + i1;
                return;
            }
        }

        public void c()
        {
            c = false;
            if (f != null)
            {
                f.e(g);
            }
        }

        public void d()
        {
            if (f != null)
            {
                f.c(g);
                f = null;
                g = 0;
            }
        }

        public b(String s)
        {
            a = k.this;
            super();
            d = -1;
            b = s;
        }
    }

    private final class c extends Handler
    {

        final k a;

        private c()
        {
            a = k.this;
            super();
        }

    }

    private static final class d extends Handler
    {

        private final WeakReference a;

        private boolean a(a a1, int i1, int j1, int k1, Object obj, Bundle bundle)
        {
            i1;
            JVM INSTR tableswitch 0 5: default 40
        //                       0 42
        //                       1 50
        //                       2 58
        //                       3 107
        //                       4 131
        //                       5 84;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
            return false;
_L2:
            a1.a(j1);
            return true;
_L3:
            a1.b(j1);
            return true;
_L4:
            if (obj == null || (obj instanceof Bundle))
            {
                return a1.a(j1, k1, (Bundle)obj);
            }
            continue; /* Loop/switch isn't completed */
_L7:
            if (obj == null || (obj instanceof Bundle))
            {
                return a1.a((Bundle)obj);
            }
            continue; /* Loop/switch isn't completed */
_L5:
            if (obj == null || (obj instanceof Bundle))
            {
                return a1.a(j1, (Bundle)obj);
            }
            continue; /* Loop/switch isn't completed */
_L6:
            if (obj == null || (obj instanceof Bundle))
            {
                if (bundle == null)
                {
                    bundle = null;
                } else
                {
                    bundle = bundle.getString("error");
                }
                return a1.a(j1, bundle, (Bundle)obj);
            }
            if (true) goto _L1; else goto _L8
_L8:
        }

        public void a()
        {
            a.clear();
        }

        public void handleMessage(Message message)
        {
            a a1 = (a)a.get();
            if (a1 != null && !a(a1, message.what, message.arg1, message.arg2, message.obj, message.peekData()) && k.i())
            {
                Log.d("MediaRouteProviderProxy", (new StringBuilder()).append("Unhandled message from server: ").append(message).toString());
            }
        }

        public d(a a1)
        {
            a = new WeakReference(a1);
        }
    }


    private static final boolean a = Log.isLoggable("MediaRouteProviderProxy", 3);
    private final ComponentName b;
    private final c c = new c();
    private final ArrayList d = new ArrayList();
    private boolean e;
    private boolean f;
    private a g;
    private boolean h;

    public k(Context context, ComponentName componentname)
    {
        super(context, new c.c(componentname));
        b = componentname;
    }

    static c a(k k1)
    {
        return k1.c;
    }

    private void a(a a1)
    {
        if (g == a1)
        {
            h = true;
            o();
            a1 = d();
            if (a1 != null)
            {
                g.a(a1);
            }
        }
    }

    private void a(a a1, android.support.v7.media.d d1)
    {
        if (g == a1)
        {
            if (a)
            {
                Log.d("MediaRouteProviderProxy", (new StringBuilder()).append(this).append(": Descriptor changed, descriptor=").append(d1).toString());
            }
            a(d1);
        }
    }

    private void a(a a1, String s)
    {
        if (g == a1)
        {
            if (a)
            {
                Log.d("MediaRouteProviderProxy", (new StringBuilder()).append(this).append(": Service connection error - ").append(s).toString());
            }
            m();
        }
    }

    private void a(b b1)
    {
        d.remove(b1);
        b1.d();
        j();
    }

    static void a(k k1, a a1)
    {
        k1.a(a1);
    }

    static void a(k k1, a a1, android.support.v7.media.d d1)
    {
        k1.a(a1, d1);
    }

    static void a(k k1, a a1, String s)
    {
        k1.a(a1, s);
    }

    static void a(k k1, b b1)
    {
        k1.a(b1);
    }

    private void b(a a1)
    {
        if (g == a1)
        {
            if (a)
            {
                Log.d("MediaRouteProviderProxy", (new StringBuilder()).append(this).append(": Service connection died").toString());
            }
            n();
        }
    }

    static void b(k k1, a a1)
    {
        k1.b(a1);
    }

    static boolean i()
    {
        return a;
    }

    private void j()
    {
        if (k())
        {
            l();
            return;
        } else
        {
            m();
            return;
        }
    }

    private boolean k()
    {
        while (e && (d() != null || !d.isEmpty())) 
        {
            return true;
        }
        return false;
    }

    private void l()
    {
        Intent intent;
        if (f)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        if (a)
        {
            Log.d("MediaRouteProviderProxy", (new StringBuilder()).append(this).append(": Binding").toString());
        }
        intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(b);
        f = a().bindService(intent, this, 1);
        if (!f && a)
        {
            Log.d("MediaRouteProviderProxy", (new StringBuilder()).append(this).append(": Bind failed").toString());
        }
_L1:
        return;
        SecurityException securityexception;
        securityexception;
        if (a)
        {
            Log.d("MediaRouteProviderProxy", (new StringBuilder()).append(this).append(": Bind failed").toString(), securityexception);
            return;
        }
          goto _L1
    }

    private void m()
    {
        if (f)
        {
            if (a)
            {
                Log.d("MediaRouteProviderProxy", (new StringBuilder()).append(this).append(": Unbinding").toString());
            }
            f = false;
            n();
            a().unbindService(this);
        }
    }

    private void n()
    {
        if (g != null)
        {
            a(((android.support.v7.media.d) (null)));
            h = false;
            p();
            g.b();
            g = null;
        }
    }

    private void o()
    {
        int j1 = d.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((b)d.get(i1)).a(g);
        }

    }

    private void p()
    {
        int j1 = d.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((b)d.get(i1)).d();
        }

    }

    public c.d a(String s)
    {
        Object obj = e();
        if (obj != null)
        {
            obj = ((android.support.v7.media.d) (obj)).a();
            int j1 = ((List) (obj)).size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                if (((android.support.v7.media.a)((List) (obj)).get(i1)).a().equals(s))
                {
                    s = new b(s);
                    d.add(s);
                    if (h)
                    {
                        s.a(g);
                    }
                    j();
                    return s;
                }
            }

        }
        return null;
    }

    public boolean a(String s, String s1)
    {
        return b.getPackageName().equals(s) && b.getClassName().equals(s1);
    }

    public void b(android.support.v7.media.b b1)
    {
        if (h)
        {
            g.a(b1);
        }
        j();
    }

    public void f()
    {
        if (!e)
        {
            if (a)
            {
                Log.d("MediaRouteProviderProxy", (new StringBuilder()).append(this).append(": Starting").toString());
            }
            e = true;
            j();
        }
    }

    public void g()
    {
        if (e)
        {
            if (a)
            {
                Log.d("MediaRouteProviderProxy", (new StringBuilder()).append(this).append(": Stopping").toString());
            }
            e = false;
            j();
        }
    }

    public void h()
    {
        if (g == null && k())
        {
            m();
            l();
        }
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        if (a)
        {
            Log.d("MediaRouteProviderProxy", (new StringBuilder()).append(this).append(": Connected").toString());
        }
        if (!f) goto _L2; else goto _L1
_L1:
        n();
        if (ibinder != null)
        {
            componentname = new Messenger(ibinder);
        } else
        {
            componentname = null;
        }
        if (!android.support.v7.media.e.a(componentname))
        {
            break MISSING_BLOCK_LABEL_123;
        }
        componentname = new a(componentname);
        if (!componentname.a()) goto _L4; else goto _L3
_L3:
        g = componentname;
_L2:
        return;
_L4:
        if (!a) goto _L2; else goto _L5
_L5:
        Log.d("MediaRouteProviderProxy", (new StringBuilder()).append(this).append(": Registration failed").toString());
        return;
        Log.e("MediaRouteProviderProxy", (new StringBuilder()).append(this).append(": Service returned invalid messenger binder").toString());
        return;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        if (a)
        {
            Log.d("MediaRouteProviderProxy", (new StringBuilder()).append(this).append(": Service disconnected").toString());
        }
        n();
    }

    public String toString()
    {
        return (new StringBuilder()).append("Service connection ").append(b.flattenToShortString()).toString();
    }

}
