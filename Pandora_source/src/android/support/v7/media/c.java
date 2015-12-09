// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package android.support.v7.media:
//            g, b, d

public abstract class android.support.v7.media.c
{
    public static abstract class a
    {

        public void a(android.support.v7.media.c c1, android.support.v7.media.d d1)
        {
        }

        public a()
        {
        }
    }

    private final class b extends Handler
    {

        final android.support.v7.media.c a;

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return;

            case 1: // '\001'
                android.support.v7.media.c.a(a);
                return;

            case 2: // '\002'
                android.support.v7.media.c.b(a);
                break;
            }
        }

        private b()
        {
            a = android.support.v7.media.c.this;
            super();
        }

    }

    public static final class c
    {

        private final ComponentName a;

        public String a()
        {
            return a.getPackageName();
        }

        public ComponentName b()
        {
            return a;
        }

        public String toString()
        {
            return (new StringBuilder()).append("ProviderMetadata{ componentName=").append(a.flattenToShortString()).append(" }").toString();
        }

        c(ComponentName componentname)
        {
            if (componentname == null)
            {
                throw new IllegalArgumentException("componentName must not be null");
            } else
            {
                a = componentname;
                return;
            }
        }
    }

    public static abstract class d
    {

        public void a()
        {
        }

        public void a(int i)
        {
        }

        public boolean a(Intent intent, g.c c1)
        {
            return false;
        }

        public void b()
        {
        }

        public void b(int i)
        {
        }

        public void c()
        {
        }

        public d()
        {
        }
    }


    private final Context a;
    private final c b;
    private final b c;
    private a d;
    private android.support.v7.media.b e;
    private boolean f;
    private android.support.v7.media.d g;
    private boolean h;

    public android.support.v7.media.c(Context context)
    {
        this(context, null);
    }

    android.support.v7.media.c(Context context, c c1)
    {
        c = new b();
        if (context == null)
        {
            throw new IllegalArgumentException("context must not be null");
        }
        a = context;
        if (c1 == null)
        {
            b = new c(new ComponentName(context, getClass()));
            return;
        } else
        {
            b = c1;
            return;
        }
    }

    static void a(android.support.v7.media.c c1)
    {
        c1.g();
    }

    static void b(android.support.v7.media.c c1)
    {
        c1.f();
    }

    private void f()
    {
        f = false;
        b(e);
    }

    private void g()
    {
        h = false;
        if (d != null)
        {
            d.a(this, g);
        }
    }

    public final Context a()
    {
        return a;
    }

    public d a(String s)
    {
        return null;
    }

    public final void a(android.support.v7.media.b b1)
    {
        android.support.v7.media.g.d();
        if (e != b1 && (e == null || !e.equals(b1)))
        {
            e = b1;
            if (!f)
            {
                f = true;
                c.sendEmptyMessage(2);
                return;
            }
        }
    }

    public final void a(a a1)
    {
        android.support.v7.media.g.d();
        d = a1;
    }

    public final void a(android.support.v7.media.d d1)
    {
        android.support.v7.media.g.d();
        if (g != d1)
        {
            g = d1;
            if (!h)
            {
                h = true;
                c.sendEmptyMessage(1);
            }
        }
    }

    public final Handler b()
    {
        return c;
    }

    public void b(android.support.v7.media.b b1)
    {
    }

    public final c c()
    {
        return b;
    }

    public final android.support.v7.media.b d()
    {
        return e;
    }

    public final android.support.v7.media.d e()
    {
        return g;
    }
}
