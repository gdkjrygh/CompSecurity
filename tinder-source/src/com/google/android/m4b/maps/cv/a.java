// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cv;

import android.util.Log;
import com.google.android.m4b.maps.cu.g;
import com.google.android.m4b.maps.e.b;
import com.google.android.m4b.maps.e.c;
import com.google.android.m4b.maps.h.d;
import com.google.android.m4b.maps.h.k;
import com.google.android.m4b.maps.h.l;
import com.google.android.m4b.maps.h.q;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.m4b.maps.cv:
//            b, d

public final class com.google.android.m4b.maps.cv.a
    implements com.google.android.m4b.maps.e.b
{
    static abstract class a extends com.google.android.m4b.maps.h.c.a
    {

        public a(d d)
        {
            super(com.google.android.m4b.maps.e.a.a, d);
        }
    }

    final class b extends a
    {

        private final com.google.android.m4b.maps.e.c b;
        private com.google.android.m4b.maps.cv.a c;

        protected final l a(q q)
        {
            return q;
        }

        protected final void a(com.google.android.m4b.maps.h.b.a a1)
        {
            a1 = (com.google.android.m4b.maps.cv.b)a1;
            c.a a2 = new c.a(this) {

                private b a;

                public final void a(q q)
                {
                    a.a(q);
                }

            
            {
                a = b1;
                super();
            }
            };
            com.google.android.m4b.maps.e.c c1;
            try
            {
                com.google.android.m4b.maps.cv.a.a(b);
            }
            catch (Throwable throwable)
            {
                a1 = String.valueOf(b.e.toString());
                String s = String.valueOf(throwable.toString());
                Log.e("ClearcutLoggerApiImpl", (new StringBuilder(String.valueOf(a1).length() + 28 + String.valueOf(s).length())).append("MessageNanoProducer ").append(a1).append(" threw: ").append(s).toString());
                return;
            }
            c1 = b;
            ((com.google.android.m4b.maps.cv.d)a1.l()).a(a2, c1);
        }

        public final boolean equals(Object obj)
        {
            if (!(obj instanceof b))
            {
                return false;
            } else
            {
                obj = (b)obj;
                return b.equals(((b) (obj)).b);
            }
        }

        public final String toString()
        {
            String s = String.valueOf(b);
            return (new StringBuilder(String.valueOf(s).length() + 12)).append("MethodImpl(").append(s).append(")").toString();
        }

        b(com.google.android.m4b.maps.e.c c1, d d1)
        {
            c = com.google.android.m4b.maps.cv.a.this;
            super(d1);
            b = c1;
        }
    }

    static final class c
    {

        private int a;

        public final void a()
        {
            this;
            JVM INSTR monitorenter ;
            a = a + 1;
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public final void b()
        {
            this;
            JVM INSTR monitorenter ;
            if (a == 0)
            {
                throw new RuntimeException("too many decrements");
            }
            break MISSING_BLOCK_LABEL_24;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
            a = a - 1;
            if (a == 0)
            {
                notifyAll();
            }
            this;
            JVM INSTR monitorexit ;
        }

        private c()
        {
            a = 0;
        }

        c(byte byte0)
        {
            this();
        }
    }


    private static final Object a = new Object();
    private static final c b = new c((byte)0);
    private static ExecutorService c;

    public com.google.android.m4b.maps.cv.a()
    {
    }

    static c a()
    {
        return b;
    }

    private final k a(d d, a a1)
    {
        synchronized (a)
        {
            if (c == null)
            {
                c = Executors.newSingleThreadExecutor();
            }
        }
        c.execute(new Runnable(d, a1) {

            private d a;
            private a b;
            private com.google.android.m4b.maps.cv.a c;

            public final void run()
            {
                a.a(b);
            }

            
            {
                c = com.google.android.m4b.maps.cv.a.this;
                a = d1;
                b = a2;
                super();
            }
        });
        return a1;
        d;
        obj;
        JVM INSTR monitorexit ;
        throw d;
    }

    static void a(com.google.android.m4b.maps.e.c c1)
    {
        if (c1.e != null && c1.d.b.length == 0)
        {
            c1.d.b = c1.e.a();
        }
        c1.c = g.a(c1.d);
    }

    public final k a(d d, com.google.android.m4b.maps.e.c c1)
    {
        b.a();
        c1 = new b(c1, d);
        c1.a(new com.google.android.m4b.maps.h.k.a() {

            private com.google.android.m4b.maps.cv.a a;

            public final void a()
            {
                com.google.android.m4b.maps.cv.a.a().b();
            }

            
            {
                a = com.google.android.m4b.maps.cv.a.this;
                super();
            }
        });
        return a(d, ((a) (c1)));
    }

}
