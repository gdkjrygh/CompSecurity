// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cz;

import android.content.Context;
import android.os.Handler;
import p.al.f;
import p.an.k;
import p.cx.c;
import p.dm.m;
import p.do.a;
import p.l.d;
import p.l.g;
import p.l.j;

public class b extends p.do.a
{
    private class a
        implements f
    {

        final b a;
        private final int b;
        private final p.l.a c;

        public volatile boolean a(Exception exception, Object obj, k k, boolean flag)
        {
            return a(exception, (String)obj, k, flag);
        }

        public boolean a(Exception exception, String s, k k, boolean flag)
        {
            a.a((new StringBuilder()).append("Failed to get station art for stationId=").append(b).toString(), exception);
            return false;
        }

        public volatile boolean a(Object obj, Object obj1, k k, boolean flag, boolean flag1)
        {
            return a((byte[])obj, (String)obj1, k, flag, flag1);
        }

        public boolean a(byte abyte0[], String s, k k, boolean flag, boolean flag1)
        {
            a.a((new StringBuilder()).append("Got station art for statinId=").append(b).append(", placing in ready queue to send segments. ").append("(dataLength=").append(abyte0.length).append(")").toString());
            c.a(null);
            p.cz.b.a(a, new p.do.a.a(a, b, abyte0.length, c));
            return false;
        }

        public a(int i, p.l.a a1)
        {
            a = b.this;
            super();
            b = i;
            c = a1;
        }
    }


    private p.cw.c g;

    public b(m m1, p.cw.c c1)
    {
        super(m1);
        g = c1;
    }

    static void a(b b1)
    {
        b1.e();
    }

    static void a(b b1, p.do.a.a a1)
    {
        b1.a(a1);
    }

    private void e()
    {
        int ai[] = a;
        int k = ai.length;
        for (int i = 0; i < k; i++)
        {
            int l = ai[i];
            a((new StringBuilder()).append("Fetching station art for stationId=").append(l).toString());
            Object obj = ((c)d).d(l);
            obj = p.l.g.b(g.s()).a(((String) (obj))).h().g().a().a(com.pandora.radio.art.b.a(d.bs)).a(true).a(p.s.b.a);
            ((p.l.a) (obj)).a(new a(l, ((p.l.a) (obj))));
            ((p.l.a) (obj)).a(p.an.g.a(d.bu, d.bu));
        }

    }

    public void a()
    {
        (new Handler(g.s().getMainLooper())).post(new Runnable() {

            final b a;

            public void run()
            {
                p.cz.b.a(a);
            }

            
            {
                a = b.this;
                super();
            }
        });
    }
}
