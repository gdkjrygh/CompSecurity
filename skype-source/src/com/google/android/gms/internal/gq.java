// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            d, ie, ha, ia, 
//            gs, lk, iw, kp, 
//            gx, c, a

public final class gq
{
    public static interface a
    {

        public abstract Object a();

        public abstract Object a(InputStream inputstream);
    }

    private static final class b extends ia
    {

        private final a a;
        private final iw.b b;

        protected final iw a(gs gs1)
        {
            return iw.a(new ByteArrayInputStream(gs1.b), lk.a(gs1));
        }

        protected final void a(Object obj)
        {
            obj = (InputStream)obj;
            b.a(a.a(((InputStream) (obj))));
        }

        public b(String s, a a1, iw.b b1)
        {
            super(s, new _cls1(b1, a1));
            a = a1;
            b = b1;
        }
    }

    private final class c extends gx
        implements iw.b
    {

        final gq a;

        public final void a(Object obj)
        {
            super.b(obj);
        }

        private c()
        {
            a = gq.this;
            super();
        }

        c(byte byte0)
        {
            this();
        }
    }


    public static final a a = new a() {

        public final Object a()
        {
            return null;
        }

        public final Object a(InputStream inputstream)
        {
            return null;
        }

    };
    private static ie b;
    private static final Object c = new Object();

    public gq(Context context)
    {
        b = a(context);
    }

    private static ie a(Context context)
    {
        synchronized (c)
        {
            if (b == null)
            {
                b = d.a(context.getApplicationContext());
            }
            context = b;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public final ha a(String s, a a1)
    {
        c c1 = new c((byte)0);
        b.a(new b(s, a1, c1));
        return c1;
    }

    public final ha a(String s, Map map)
    {
        c c1 = new c((byte)0);
        s = new com.google.android.gms.internal.c(s, c1, new iw.a(s, c1) {

            final String a;
            final c b;
            final gq c;

            public final void a(kp kp1)
            {
                com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("Failed to load URL: ")).append(a).append("\n").append(kp1.toString()).toString());
                b.a(null);
            }

            
            {
                c = gq.this;
                a = s;
                b = c1;
                super();
            }
        }, map) {

            final Map a;
            final gq b;

            public final Map a()
                throws com.google.android.gms.internal.a
            {
                if (a == null)
                {
                    return super.a();
                } else
                {
                    return a;
                }
            }

            
            {
                b = gq.this;
                a = map;
                super(s, b1, a1, (byte)0);
            }
        };
        b.a(s);
        return c1;
    }


    // Unreferenced inner class com/google/android/gms/internal/gq$b$1

/* anonymous class */
    final class b._cls1
        implements iw.a
    {

        final iw.b a;
        final a b;

        public final void a(kp kp)
        {
            a.a(b.a());
        }

            
            {
                a = b1;
                b = a1;
                super();
            }
    }

}
