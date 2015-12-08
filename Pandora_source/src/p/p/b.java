// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.p;

import com.android.volley.toolbox.e;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URL;
import p.k.l;
import p.k.m;
import p.k.n;
import p.l.i;
import p.r.c;
import p.x.d;

// Referenced classes of package p.p:
//            a

public class b
    implements c
{
    private static class a extends l
    {

        private final p.p.a a;
        private p.k.l.a b;

        protected n a(p.k.i j)
        {
            return n.a(j.b, e.a(j));
        }

        protected volatile void a(Object obj)
        {
            a((byte[])obj);
        }

        protected void a(byte abyte0[])
        {
            a.a(new ByteArrayInputStream(abyte0));
        }

        public p.k.l.a s()
        {
            return b;
        }

        public a(String s1, p.p.a a1, p.k.l.a a2)
        {
            super(0, s1, a1);
            a = a1;
            b = a2;
        }
    }


    private final m a;
    private final d b;
    private p.p.a c;

    public b(m m1, d d1, p.p.a a1)
    {
        a = m1;
        b = d1;
        c = a1;
        if (a1 == null)
        {
            c = p.p.a.a();
        }
    }

    private static p.k.l.a c(i j)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[i.values().length];
                try
                {
                    a[i.d.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[i.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[i.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[j.ordinal()])
        {
        default:
            return p.k.l.a.b;

        case 1: // '\001'
            return p.k.l.a.a;

        case 2: // '\002'
            return p.k.l.a.c;

        case 3: // '\003'
            return p.k.l.a.d;
        }
    }

    public InputStream a(i j)
        throws Exception
    {
        j = new a(b.a().toString(), c, c(j));
        c.a(a.a(j));
        return (InputStream)c.get();
    }

    public void a()
    {
    }

    public Object b(i j)
        throws Exception
    {
        return a(j);
    }

    public String b()
    {
        return b.toString();
    }

    public void c()
    {
        p.p.a a1 = c;
        if (a1 != null)
        {
            a1.cancel(true);
        }
    }
}
