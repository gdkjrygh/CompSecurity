// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.integration.volley;

import com.android.volley.g;
import com.android.volley.k;
import com.android.volley.l;
import com.android.volley.m;
import com.android.volley.toolbox.e;
import com.bumptech.glide.i;
import com.bumptech.glide.load.b.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;

// Referenced classes of package com.bumptech.glide.integration.volley:
//            b, a

public class c
    implements com.bumptech.glide.load.a.c
{
    private static class a extends k
    {

        private final b a;
        private final com.android.volley.k.a b;
        private final Map c;

        protected m a(g g1)
        {
            return m.a(g1.b, com.android.volley.toolbox.e.a(g1));
        }

        protected void a(byte abyte0[])
        {
            a.a(new ByteArrayInputStream(abyte0));
        }

        protected void b(Object obj)
        {
            a((byte[])obj);
        }

        public Map k()
            throws com.android.volley.a
        {
            return c;
        }

        public com.android.volley.k.a u()
        {
            return b;
        }

        public a(String s, b b1, com.android.volley.k.a a1, Map map)
        {
            super(0, s, b1);
            a = b1;
            b = a1;
            c = map;
        }
    }


    public static final com.bumptech.glide.integration.volley.a a = new com.bumptech.glide.integration.volley.a() {

        public k a(String s, b b1, com.android.volley.k.a a1, Map map)
        {
            return new a(s, b1, a1, map);
        }

    };
    private final l b;
    private final com.bumptech.glide.integration.volley.a c;
    private final d d;
    private b e;

    public c(l l1, d d1, b b1, com.bumptech.glide.integration.volley.a a1)
    {
        b = l1;
        d = d1;
        c = a1;
        e = b1;
        if (b1 == null)
        {
            e = com.bumptech.glide.integration.volley.b.a();
        }
    }

    private static com.android.volley.k.a c(i j)
    {
        static class _cls2
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

        switch (_cls2.a[j.ordinal()])
        {
        default:
            return com.android.volley.k.a.b;

        case 1: // '\001'
            return com.android.volley.k.a.a;

        case 2: // '\002'
            return com.android.volley.k.a.c;

        case 3: // '\003'
            return com.android.volley.k.a.d;
        }
    }

    public InputStream a(i j)
        throws Exception
    {
        String s = d.b();
        j = c.a(s, e, c(j), d.c());
        e.a(b.a(j));
        return (InputStream)e.get();
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
        return d.d();
    }

    public void c()
    {
        b b1 = e;
        if (b1 != null)
        {
            b1.cancel(true);
        }
    }

}
