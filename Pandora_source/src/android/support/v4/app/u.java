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
//            s, ab, t, ad, 
//            y, z, aa

public class u
{
    public static class a extends x.a
    {

        public static final x.a.a d = new x.a.a() {

        };
        public int a;
        public CharSequence b;
        public PendingIntent c;
        private final Bundle e;
        private final ad f[];

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

        public ad[] e()
        {
            return f;
        }

        public af.a[] f()
        {
            return e();
        }

    }

    public static class b extends o
    {

        Bitmap a;
        Bitmap b;
        boolean c;

        public b()
        {
        }
    }

    public static class c extends o
    {

        CharSequence a;

        public c a(CharSequence charsequence)
        {
            a = d.e(charsequence);
            return this;
        }

        public c()
        {
        }
    }

    public static class d
    {

        Notification A;
        Notification B;
        public ArrayList C;
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
        boolean l;
        o m;
        CharSequence n;
        int o;
        int p;
        boolean q;
        String r;
        boolean s;
        String t;
        ArrayList u;
        boolean v;
        String w;
        Bundle x;
        int y;
        int z;

        private void a(int i1, boolean flag)
        {
            if (flag)
            {
                Notification notification = B;
                notification.flags = notification.flags | i1;
                return;
            } else
            {
                Notification notification1 = B;
                notification1.flags = notification1.flags & ~i1;
                return;
            }
        }

        protected static CharSequence e(CharSequence charsequence)
        {
            while (charsequence == null || charsequence.length() <= 5120) 
            {
                return charsequence;
            }
            return charsequence.subSequence(0, 5120);
        }

        public Notification a()
        {
            return u.a().a(this);
        }

        public d a(int i1)
        {
            B.icon = i1;
            return this;
        }

        public d a(long l1)
        {
            B.when = l1;
            return this;
        }

        public d a(PendingIntent pendingintent)
        {
            d = pendingintent;
            return this;
        }

        public d a(Bitmap bitmap)
        {
            g = bitmap;
            return this;
        }

        public d a(o o1)
        {
            if (m != o1)
            {
                m = o1;
                if (m != null)
                {
                    m.a(this);
                }
            }
            return this;
        }

        public d a(CharSequence charsequence)
        {
            b = e(charsequence);
            return this;
        }

        public d a(boolean flag)
        {
            a(8, flag);
            return this;
        }

        public d b(PendingIntent pendingintent)
        {
            B.deleteIntent = pendingintent;
            return this;
        }

        public d b(CharSequence charsequence)
        {
            c = e(charsequence);
            return this;
        }

        public d b(boolean flag)
        {
            a(16, flag);
            return this;
        }

        public d c(CharSequence charsequence)
        {
            n = e(charsequence);
            return this;
        }

        public d d(CharSequence charsequence)
        {
            B.tickerText = e(charsequence);
            return this;
        }

        public d(Context context)
        {
            k = true;
            u = new ArrayList();
            v = false;
            y = 0;
            z = 0;
            B = new Notification();
            a = context;
            B.when = System.currentTimeMillis();
            B.audioStreamType = -1;
            j = 0;
            C = new ArrayList();
        }
    }

    public static class e extends o
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
    }

    static class g extends n
    {

        public Notification a(d d1)
        {
            v.a a1 = new v.a(d1.a, d1.B, d1.b, d1.c, d1.h, d1.f, d1.i, d1.d, d1.e, d1.g, d1.o, d1.p, d1.q, d1.k, d1.l, d1.j, d1.n, d1.v, d1.C, d1.x, d1.r, d1.s, d1.t);
            u.a(a1, d1.u);
            u.a(a1, d1.m);
            return a1.b();
        }

        g()
        {
        }
    }

    static class h extends g
    {

        public Notification a(d d1)
        {
            w.a a1 = new w.a(d1.a, d1.B, d1.b, d1.c, d1.h, d1.f, d1.i, d1.d, d1.e, d1.g, d1.o, d1.p, d1.q, d1.k, d1.l, d1.j, d1.n, d1.v, d1.w, d1.C, d1.x, d1.y, d1.z, d1.A, d1.r, d1.s, d1.t);
            u.a(a1, d1.u);
            u.a(a1, d1.m);
            return a1.b();
        }

        h()
        {
        }
    }

    static class i
        implements f
    {

        public Notification a(d d1)
        {
            Notification notification = d1.B;
            notification.setLatestEventInfo(d1.a, d1.b, d1.c, d1.d);
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

    static class j extends i
    {

        public Notification a(d d1)
        {
            Notification notification = d1.B;
            notification.setLatestEventInfo(d1.a, d1.b, d1.c, d1.d);
            notification = y.a(notification, d1.a, d1.b, d1.c, d1.d, d1.e);
            if (d1.j > 0)
            {
                notification.flags = notification.flags | 0x80;
            }
            return notification;
        }

        j()
        {
        }
    }

    static class k extends i
    {

        public Notification a(d d1)
        {
            return z.a(d1.a, d1.B, d1.b, d1.c, d1.h, d1.f, d1.i, d1.d, d1.e, d1.g);
        }

        k()
        {
        }
    }

    static class l extends i
    {

        public Notification a(d d1)
        {
            return aa.a(d1.a, d1.B, d1.b, d1.c, d1.h, d1.f, d1.i, d1.d, d1.e, d1.g, d1.o, d1.p, d1.q);
        }

        l()
        {
        }
    }

    static class m extends i
    {

        public Notification a(d d1)
        {
            ab.a a1 = new ab.a(d1.a, d1.B, d1.b, d1.c, d1.h, d1.f, d1.i, d1.d, d1.e, d1.g, d1.o, d1.p, d1.q, d1.l, d1.j, d1.n, d1.v, d1.x, d1.r, d1.s, d1.t);
            u.a(a1, d1.u);
            u.a(a1, d1.m);
            return a1.b();
        }

        m()
        {
        }
    }

    static class n extends m
    {

        public Notification a(d d1)
        {
            ac.a a1 = new ac.a(d1.a, d1.B, d1.b, d1.c, d1.h, d1.f, d1.i, d1.d, d1.e, d1.g, d1.o, d1.p, d1.q, d1.k, d1.l, d1.j, d1.n, d1.v, d1.C, d1.x, d1.r, d1.s, d1.t);
            u.a(a1, d1.u);
            u.a(a1, d1.m);
            return a1.b();
        }

        n()
        {
        }
    }

    public static abstract class o
    {

        d d;
        CharSequence e;
        CharSequence f;
        boolean g;

        public void a(d d1)
        {
            if (d != d1)
            {
                d = d1;
                if (d != null)
                {
                    d.a(this);
                }
            }
        }

        public o()
        {
            g = false;
        }
    }


    private static final f a;

    static f a()
    {
        return a;
    }

    static void a(s s1, ArrayList arraylist)
    {
        b(s1, arraylist);
    }

    static void a(t t, o o1)
    {
        b(t, o1);
    }

    private static void b(s s1, ArrayList arraylist)
    {
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); s1.a((a)arraylist.next())) { }
    }

    private static void b(t t, o o1)
    {
        if (o1 != null)
        {
            if (o1 instanceof c)
            {
                o1 = (c)o1;
                ab.a(t, ((c) (o1)).e, ((c) (o1)).g, ((c) (o1)).f, ((c) (o1)).a);
            } else
            {
                if (o1 instanceof e)
                {
                    o1 = (e)o1;
                    ab.a(t, ((e) (o1)).e, ((e) (o1)).g, ((e) (o1)).f, ((e) (o1)).a);
                    return;
                }
                if (o1 instanceof b)
                {
                    o1 = (b)o1;
                    ab.a(t, ((b) (o1)).e, ((b) (o1)).g, ((b) (o1)).f, ((b) (o1)).a, ((b) (o1)).b, ((b) (o1)).c);
                    return;
                }
            }
        }
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new h();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 20)
        {
            a = new g();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            a = new n();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new m();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new l();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new k();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            a = new j();
        } else
        {
            a = new i();
        }
    }
}
