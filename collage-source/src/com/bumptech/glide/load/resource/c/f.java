// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.e;
import com.bumptech.glide.g;
import com.bumptech.glide.j;
import com.bumptech.glide.load.engine.a.c;
import com.bumptech.glide.load.engine.b;
import com.bumptech.glide.load.resource.a;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.UUID;

// Referenced classes of package com.bumptech.glide.load.resource.c:
//            h, g

class f
{
    static class a extends com.bumptech.glide.request.b.g
    {

        private final Handler a;
        private final int b;
        private final long c;
        private Bitmap d;

        static int a(a a1)
        {
            return a1.b;
        }

        public void a(Bitmap bitmap, com.bumptech.glide.request.a.c c1)
        {
            d = bitmap;
            bitmap = a.obtainMessage(1, this);
            a.sendMessageAtTime(bitmap, c);
        }

        public volatile void a(Object obj, com.bumptech.glide.request.a.c c1)
        {
            a((Bitmap)obj, c1);
        }

        public Bitmap d_()
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
                com.bumptech.glide.g.a((a)message.obj);
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
        implements com.bumptech.glide.load.c
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
    private final com.bumptech.glide.b.a b;
    private final Handler c;
    private boolean d;
    private boolean e;
    private e f;
    private a g;
    private boolean h;

    public f(Context context, b b1, com.bumptech.glide.b.a a1, int i, int k)
    {
        this(b1, a1, null, a(context, a1, i, k, com.bumptech.glide.g.a(context).a()));
    }

    f(b b1, com.bumptech.glide.b.a a1, Handler handler, e e1)
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

    private static e a(Context context, com.bumptech.glide.b.a a1, int i, int k, com.bumptech.glide.load.engine.a.c c1)
    {
        c1 = new h(c1);
        com.bumptech.glide.load.resource.c.g g1 = new com.bumptech.glide.load.resource.c.g();
        com.bumptech.glide.load.b b1 = com.bumptech.glide.load.resource.a.b();
        return com.bumptech.glide.g.b(context).a(g1, com/bumptech/glide/b/a).a(a1).a(android/graphics/Bitmap).b(b1).b(c1).b(true).b(com.bumptech.glide.load.engine.b.b).b(i, k);
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

    public void a(com.bumptech.glide.load.g g1)
    {
        if (g1 == null)
        {
            throw new NullPointerException("Transformation must not be null");
        } else
        {
            f = f.b(new com.bumptech.glide.load.g[] {
                g1
            });
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
        a.b(com.bumptech.glide.load.resource.c.a.a(a1));
        if (a2 != null)
        {
            c.obtainMessage(2, a2).sendToTarget();
        }
        e = false;
        e();
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
            com.bumptech.glide.g.a(g);
            g = null;
        }
        h = true;
    }

    public Bitmap d()
    {
        if (g != null)
        {
            return g.d_();
        } else
        {
            return null;
        }
    }
}
