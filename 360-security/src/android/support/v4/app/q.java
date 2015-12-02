// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//            o, w, p, aa, 
//            x, t, u, v

public class q
{
    public static class a extends s.a
    {

        public static final s.a.a d = new s.a.a() {

        };
        public int a;
        public CharSequence b;
        public PendingIntent c;
        private final Bundle e;
        private final aa f[];

        protected int a()
        {
            return a;
        }

        protected CharSequence b()
        {
            return b;
        }

        protected PendingIntent c()
        {
            return c;
        }

        public Bundle d()
        {
            return e;
        }

        public aa[] e()
        {
            return f;
        }

        public ac.a[] f()
        {
            return e();
        }

    }

    public static class b extends n
    {

        Bitmap a;
        Bitmap b;
        boolean c;

        public b()
        {
        }
    }

    public static class c extends n
    {

        CharSequence a;

        public c()
        {
        }
    }

    public static class d
    {

        Context a;
        CharSequence b;
        CharSequence c;
        PendingIntent d;
        PendingIntent e;
        RemoteViews f;
        Bitmap g;
        CharSequence h;
        int i;
        int j;
        boolean k;
        n l;
        CharSequence m;
        int n;
        int o;
        boolean p;
        String q;
        boolean r;
        String s;
        ArrayList t;
        boolean u;
        Bundle v;
        Notification w;

        private void a(int i1, boolean flag)
        {
            if (flag)
            {
                Notification notification = w;
                notification.flags = notification.flags | i1;
                return;
            } else
            {
                Notification notification1 = w;
                notification1.flags = notification1.flags & ~i1;
                return;
            }
        }

        public Notification a()
        {
            return q.a().a(this);
        }

        public d a(int i1)
        {
            w.icon = i1;
            return this;
        }

        public d a(long l1)
        {
            w.when = l1;
            return this;
        }

        public d a(CharSequence charsequence)
        {
            w.tickerText = charsequence;
            return this;
        }

        public d a(String s1)
        {
            s = s1;
            return this;
        }

        public d a(boolean flag)
        {
            a(2, flag);
            return this;
        }

        public d b(int i1)
        {
            j = i1;
            return this;
        }

        public d(Context context)
        {
            t = new ArrayList();
            u = false;
            w = new Notification();
            a = context;
            w.when = System.currentTimeMillis();
            w.audioStreamType = -1;
            j = 0;
        }
    }

    public static class e extends n
    {

        ArrayList a;

        public e()
        {
            a = new ArrayList();
        }
    }

    static interface f
    {

        public abstract Notification a(d d1);

        public abstract Bundle a(Notification notification);
    }

    static class g extends m
    {

        public Notification a(d d1)
        {
            r.a a1 = new r.a(d1.a, d1.w, d1.b, d1.c, d1.h, d1.f, d1.i, d1.d, d1.e, d1.g, d1.n, d1.o, d1.p, d1.k, d1.j, d1.m, d1.u, d1.v, d1.q, d1.r, d1.s);
            q.a(a1, d1.t);
            q.a(a1, d1.l);
            return a1.b();
        }

        g()
        {
        }
    }

    static class h
        implements f
    {

        public Notification a(d d1)
        {
            Notification notification = d1.w;
            notification.setLatestEventInfo(d1.a, d1.b, d1.c, d1.d);
            if (d1.j > 0)
            {
                notification.flags = notification.flags | 0x80;
            }
            return notification;
        }

        public Bundle a(Notification notification)
        {
            return null;
        }

        h()
        {
        }
    }

    static class i extends h
    {

        public Notification a(d d1)
        {
            Notification notification = d1.w;
            notification.setLatestEventInfo(d1.a, d1.b, d1.c, d1.d);
            notification = t.a(notification, d1.a, d1.b, d1.c, d1.d, d1.e);
            if (d1.j > 0)
            {
                notification.flags = notification.flags | 0x80;
            }
            return notification;
        }

        i()
        {
        }
    }

    static class j extends h
    {

        public Notification a(d d1)
        {
            return u.a(d1.a, d1.w, d1.b, d1.c, d1.h, d1.f, d1.i, d1.d, d1.e, d1.g);
        }

        j()
        {
        }
    }

    static class k extends h
    {

        public Notification a(d d1)
        {
            return v.a(d1.a, d1.w, d1.b, d1.c, d1.h, d1.f, d1.i, d1.d, d1.e, d1.g, d1.n, d1.o, d1.p);
        }

        k()
        {
        }
    }

    static class l extends h
    {

        public Notification a(d d1)
        {
            w.a a1 = new w.a(d1.a, d1.w, d1.b, d1.c, d1.h, d1.f, d1.i, d1.d, d1.e, d1.g, d1.n, d1.o, d1.p, d1.k, d1.j, d1.m, d1.u, d1.v, d1.q, d1.r, d1.s);
            q.a(a1, d1.t);
            q.a(a1, d1.l);
            return a1.b();
        }

        public Bundle a(Notification notification)
        {
            return w.a(notification);
        }

        l()
        {
        }
    }

    static class m extends l
    {

        public Notification a(d d1)
        {
            x.a a1 = new x.a(d1.a, d1.w, d1.b, d1.c, d1.h, d1.f, d1.i, d1.d, d1.e, d1.g, d1.n, d1.o, d1.p, d1.k, d1.j, d1.m, d1.u, d1.v, d1.q, d1.r, d1.s);
            q.a(a1, d1.t);
            q.a(a1, d1.l);
            return a1.b();
        }

        public Bundle a(Notification notification)
        {
            return x.a(notification);
        }

        m()
        {
        }
    }

    public static abstract class n
    {

        CharSequence d;
        CharSequence e;
        boolean f;

        public n()
        {
            f = false;
        }
    }


    private static final f a;

    public static Bundle a(Notification notification)
    {
        return a.a(notification);
    }

    static f a()
    {
        return a;
    }

    static void a(o o1, ArrayList arraylist)
    {
        b(o1, arraylist);
    }

    static void a(p p, n n1)
    {
        b(p, n1);
    }

    private static void b(o o1, ArrayList arraylist)
    {
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); o1.a((a)arraylist.next())) { }
    }

    private static void b(p p, n n1)
    {
        if (n1 != null)
        {
            if (n1 instanceof c)
            {
                n1 = (c)n1;
                w.a(p, ((c) (n1)).d, ((c) (n1)).f, ((c) (n1)).e, ((c) (n1)).a);
            } else
            {
                if (n1 instanceof e)
                {
                    n1 = (e)n1;
                    w.a(p, ((e) (n1)).d, ((e) (n1)).f, ((e) (n1)).e, ((e) (n1)).a);
                    return;
                }
                if (n1 instanceof b)
                {
                    n1 = (b)n1;
                    w.a(p, ((b) (n1)).d, ((b) (n1)).f, ((b) (n1)).e, ((b) (n1)).a, ((b) (n1)).b, ((b) (n1)).c);
                    return;
                }
            }
        }
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 20)
        {
            a = new g();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            a = new m();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new l();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new k();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new j();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            a = new i();
        } else
        {
            a = new h();
        }
    }
}
