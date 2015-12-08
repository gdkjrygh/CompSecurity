// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.af;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.UUID;
import p.aa.a;
import p.an.h;
import p.l.e;
import p.l.g;
import p.l.j;
import p.s.b;
import p.t.c;

// Referenced classes of package p.af:
//            h, g

class f
{
    static class a extends h
    {

        private final Handler a;
        private final int b;
        private final long c;
        private Bitmap d;

        static int a(a a1)
        {
            return a1.b;
        }

        public void a(Bitmap bitmap, p.am.c c1)
        {
            d = bitmap;
            bitmap = a.obtainMessage(1, this);
            a.sendMessageAtTime(bitmap, c);
        }

        public volatile void a(Object obj, p.am.c c1)
        {
            a((Bitmap)obj, c1);
        }

        public Bitmap c_()
        {
            return d;
        }

        public a(Handler handler, int i, long l)
        {
            a = handler;
            b = i;
            c = l;
        }
    }

    public static interface b
    {

        public abstract void b(int i);
    }

    private class c
        implements android.os.Handler.Callback
    {

        final f a;

        public boolean handleMessage(Message message)
        {
            if (message.what == 1)
            {
                message = (a)message.obj;
                a.a(message);
                return true;
            }
            if (message.what == 2)
            {
                p.l.g.a((a)message.obj);
            }
            return false;
        }

        private c()
        {
            a = f.this;
            super();
        }

    }

    static class d
        implements p.q.c
    {

        private final UUID a;

        public void a(MessageDigest messagedigest)
            throws UnsupportedEncodingException
        {
            throw new UnsupportedOperationException("Not implemented");
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof d)
            {
                return ((d)obj).a.equals(a);
            } else
            {
                return false;
            }
        }

        public int hashCode()
        {
            return a.hashCode();
        }

        public d()
        {
            this(UUID.randomUUID());
        }

        d(UUID uuid)
        {
            a = uuid;
        }
    }


    private final b a;
    private final p.n.a b;
    private final Handler c;
    private boolean d;
    private boolean e;
    private e f;
    private a g;
    private boolean h;

    public f(Context context, b b1, p.n.a a1, int i, int k)
    {
        this(b1, a1, null, a(context, a1, i, k, p.l.g.a(context).a()));
    }

    f(b b1, p.n.a a1, Handler handler, e e1)
    {
        d = false;
        e = false;
        Handler handler1 = handler;
        if (handler == null)
        {
            handler1 = new Handler(Looper.getMainLooper(), new c());
        }
        a = b1;
        b = a1;
        c = handler1;
        f = e1;
    }

    private static e a(Context context, p.n.a a1, int i, int k, p.t.c c1)
    {
        c1 = new p.af.h(c1);
        p.af.g g1 = new p.af.g();
        p.q.b b1 = p.aa.a.b();
        return p.l.g.b(context).a(g1, p/n/a).a(a1).a(android/graphics/Bitmap).b(b1).b(c1).b(true).b(p.s.b.b).b(i, k);
    }

    private void e()
    {
        if (!d || e)
        {
            return;
        } else
        {
            e = true;
            b.a();
            long l = SystemClock.uptimeMillis();
            long l1 = b.b();
            a a1 = new a(c, b.d(), l + l1);
            f.b(new d()).a(a1);
            return;
        }
    }

    public void a()
    {
        if (d)
        {
            return;
        } else
        {
            d = true;
            h = false;
            e();
            return;
        }
    }

    void a(a a1)
    {
        if (h)
        {
            c.obtainMessage(2, a1).sendToTarget();
            return;
        }
        a a2 = g;
        g = a1;
        a.b(p.af.a.a(a1));
        if (a2 != null)
        {
            c.obtainMessage(2, a2).sendToTarget();
        }
        e = false;
        e();
    }

    public void a(p.q.g g1)
    {
        if (g1 == null)
        {
            throw new NullPointerException("Transformation must not be null");
        } else
        {
            f = f.b(new p.q.g[] {
                g1
            });
            return;
        }
    }

    public void b()
    {
        d = false;
    }

    public void c()
    {
        b();
        if (g != null)
        {
            p.l.g.a(g);
            g = null;
        }
        h = true;
    }

    public Bitmap d()
    {
        if (g != null)
        {
            return g.c_();
        } else
        {
            return null;
        }
    }
}
