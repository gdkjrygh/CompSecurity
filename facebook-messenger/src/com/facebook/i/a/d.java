// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.i.a;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.facebook.auth.c.c;
import com.facebook.base.broadcast.j;
import com.facebook.base.broadcast.k;
import com.facebook.base.broadcast.l;
import com.facebook.common.e.h;
import com.facebook.debug.log.b;
import com.google.common.a.ik;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import javax.inject.a;

// Referenced classes of package com.facebook.i.a:
//            b, e, a, s, 
//            r, k, g, q, 
//            h, m, f, i, 
//            j

public class d
    implements com.facebook.i.a.b
{

    private final String a;
    private final j b;
    private final a c;
    private final com.facebook.common.process.d d;
    private final h e;
    private final com.facebook.i.a.a f;
    private final HandlerThread g;
    private Handler h;
    private Messenger i;
    private l j;
    private final ConcurrentMap k = ik.c();
    private final ConcurrentMap l = ik.c();
    private final ConcurrentMap m = ik.c();
    private final com.facebook.auth.c.b n;
    private final a o;
    private final boolean p;
    private volatile c q;
    private Intent r;
    private final Runnable s = new e(this);

    public d(String s1, j j1, a a1, com.facebook.common.process.d d1, h h1, com.facebook.auth.c.b b1, HandlerThread handlerthread, 
            a a2, boolean flag)
    {
        a = s1;
        b = j1;
        c = a1;
        d = d1;
        e = h1;
        n = b1;
        g = handlerthread;
        o = a2;
        p = flag;
        f = new com.facebook.i.a.a(null, ((Integer)c.b()).intValue(), d.b());
    }

    static Intent a(d d1)
    {
        return d1.r;
    }

    static com.facebook.i.a.a a(d d1, Message message)
    {
        return d1.b(message);
    }

    private void a(Context context, Intent intent, com.facebook.c.c c1)
    {
        if (!a.equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        if (p)
        {
            context = (String)o.b();
            break MISSING_BLOCK_LABEL_34;
        }
_L4:
        context = intent.getBundleExtra("peer_info");
        if (context == null)
        {
            e.a(com/facebook/i/a/b.getSimpleName(), (new StringBuilder()).append("Peer info bundle should be in the broadcast intent with action ").append(a).toString());
            return;
        }
        try
        {
            context = com.facebook.i.a.a.a(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            e.a(com/facebook/i/a/b.getSimpleName(), (new StringBuilder()).append("Peer info bundle in the broadcast intent with action ").append(a).append(" was malformed").toString());
            return;
        }
        intent = b();
        if (((com.facebook.i.a.a) (context)).b != ((com.facebook.i.a.a) (intent)).b)
        {
            if (k.containsKey(Integer.valueOf(((com.facebook.i.a.a) (context)).b)))
            {
                com.facebook.debug.log.b.b(com/facebook/i/a/d, "%s received peer connecting broadcast from process %s but it has already been connected.", new Object[] {
                    ((com.facebook.i.a.a) (intent)).c, ((com.facebook.i.a.a) (context)).c
                });
                return;
            }
            Preconditions.checkNotNull(((com.facebook.i.a.a) (intent)).a, "The mMessenger member should have been set in init()");
            c1 = Message.obtain(null, 0);
            c1.setData(intent.a());
            try
            {
                ((com.facebook.i.a.a) (context)).a.send(c1);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
            a(((com.facebook.i.a.a) (context)), s.Incoming);
            return;
        }
        if (true) goto _L2; else goto _L3
_L2:
        do
        {
            return;
        } while (context == null || !Objects.equal(context, intent.getStringExtra("__KEY_LOGGED_USER_ID__")));
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(com.facebook.i.a.a a1)
    {
        if (k.remove(Integer.valueOf(a1.b)) != null)
        {
            for (Iterator iterator = l.keySet().iterator(); iterator.hasNext(); ((r)iterator.next()).a(a1)) { }
        }
    }

    private void a(com.facebook.i.a.a a1, s s1)
    {
        k.put(Integer.valueOf(a1.b), a1);
        for (Iterator iterator = l.keySet().iterator(); iterator.hasNext(); ((r)iterator.next()).a(a1, s1)) { }
        if (!b(a1))
        {
            a(a1);
        }
    }

    static void a(d d1, Context context, Intent intent, com.facebook.c.c c1)
    {
        d1.a(context, intent, c1);
    }

    static void a(d d1, com.facebook.i.a.a a1)
    {
        d1.a(a1);
    }

    static void a(d d1, com.facebook.i.a.a a1, s s1)
    {
        d1.a(a1, s1);
    }

    static Handler b(d d1)
    {
        return d1.h;
    }

    private com.facebook.i.a.a b(Message message)
    {
        int i1 = message.arg1;
        com.facebook.i.a.a a1 = (com.facebook.i.a.a)k.get(Integer.valueOf(i1));
        if (a1 == null)
        {
            e.a(com/facebook/i/a/b.getSimpleName(), (new StringBuilder()).append("Message from unknown process: ").append(i1).append(", probably the message's arg1 is not set to the pid of source process. ").append("Message details: ").append(message).append(", peer infos: ").append(k).toString());
        }
        return a1;
    }

    static void b(d d1, Message message)
    {
        d1.c(message);
    }

    private boolean b(com.facebook.i.a.a a1)
    {
        try
        {
            Preconditions.checkNotNull(a1);
            a1.a.getBinder().linkToDeath(new com.facebook.i.a.k(this, a1), 0);
        }
        // Misplaced declaration of an exception variable
        catch (com.facebook.i.a.a a1)
        {
            return false;
        }
        return true;
    }

    static j c(d d1)
    {
        return d1.b;
    }

    private void c()
    {
        h.post(new g(this));
    }

    private void c(Message message)
    {
        q q1;
        synchronized (m)
        {
            q1 = (q)m.get(Integer.valueOf(message.what));
        }
        if (q1 != null)
        {
            obj = b(message);
            if (obj != null)
            {
                break MISSING_BLOCK_LABEL_49;
            }
        }
        return;
        message;
        obj;
        JVM INSTR monitorexit ;
        throw message;
        q1.a(((com.facebook.i.a.a) (obj)), message);
        return;
    }

    static Runnable d(d d1)
    {
        return d1.s;
    }

    private String e()
    {
        String s1 = (String)o.b();
        if (s1 != null)
        {
            r.putExtra("__KEY_LOGGED_USER_ID__", s1);
            g();
        }
        return s1;
    }

    static boolean e(d d1)
    {
        return d1.p;
    }

    private void f()
    {
        if (q == null)
        {
            q = new com.facebook.i.a.h(this);
        }
        n.a(q);
    }

    static void f(d d1)
    {
        d1.g();
    }

    static String g(d d1)
    {
        return d1.e();
    }

    private void g()
    {
        b.a(r);
        h.postDelayed(s, 1000L);
    }

    static void h(d d1)
    {
        d1.f();
    }

    static c i(d d1)
    {
        return d1.q;
    }

    static com.facebook.auth.c.b j(d d1)
    {
        return d1.n;
    }

    static h k(d d1)
    {
        return d1.e;
    }

    static ConcurrentMap l(d d1)
    {
        return d1.k;
    }

    public void a()
    {
        i = new Messenger(new m(this, g.getLooper(), null));
        h = new Handler(g.getLooper());
        f.a = i;
        j = b.a().a(a, new f(this)).a(h).a();
        j.b();
        r = new Intent(a);
        r.putExtra("peer_info", f.a());
        c();
    }

    public void a(int i1, q q1)
    {
        Preconditions.checkNotNull(q1);
        if (m.containsKey(Integer.valueOf(i1)))
        {
            throw new IllegalStateException((new StringBuilder()).append("The listener for message type ").append(i1).append(" has already registered").toString());
        } else
        {
            m.put(Integer.valueOf(i1), q1);
            return;
        }
    }

    public void a(Message message)
    {
        if (k.isEmpty())
        {
            return;
        } else
        {
            message.arg1 = b().b;
            h.post(new i(this, message));
            return;
        }
    }

    public void a(com.facebook.i.a.a a1, Message message)
    {
        message.arg1 = b().b;
        h.post(new com.facebook.i.a.j(this, a1, message));
    }

    public void a(r r1)
    {
        Preconditions.checkNotNull(r1);
        l.put(r1, Boolean.valueOf(true));
    }

    public com.facebook.i.a.a b()
    {
        return f;
    }

    public void d()
    {
        if (p)
        {
            a(Message.obtain(null, 1));
            k.clear();
            c();
        }
    }
}
