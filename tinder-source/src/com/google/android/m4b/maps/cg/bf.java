// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.aa.f;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.d;
import com.google.android.m4b.maps.ay.k;
import com.google.android.m4b.maps.ay.s;
import com.google.android.m4b.maps.ay.w;
import com.google.android.m4b.maps.cu.g;
import com.google.android.m4b.maps.e.a;
import com.google.android.m4b.maps.e.b;
import com.google.android.m4b.maps.e.c;
import com.google.android.m4b.maps.g.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            cb, ba, be, bg

public final class bf
    implements cb, Runnable
{
    static final class a
    {

        public final cb.a a;
        public final String b;

        public final boolean equals(Object obj)
        {
            return (obj instanceof a) && ((a)obj).a.ci.equals(a.ci) && ((a)obj).b.equals(b);
        }

        public final int hashCode()
        {
            String s1 = String.valueOf(a.ci);
            String s2 = String.valueOf(b);
            if (s2.length() != 0)
            {
                s1 = s1.concat(s2);
            } else
            {
                s1 = new String(s1);
            }
            return s1.hashCode();
        }

        public a(cb.a a1, String s1)
        {
            a = a1;
            b = s1;
        }
    }

    static final class b
    {

        final long a;
        public int b;

        public b(long l)
        {
            a = l;
            b = 0;
        }
    }

    static interface c
    {

        public abstract void a();

        public abstract void a(String s1, String s2);
    }

    static final class d
        implements com.google.android.m4b.maps.h.d.b, com.google.android.m4b.maps.h.d.d
    {

        public final void a(int j)
        {
            if (ab.a(com.google.android.m4b.maps.cg.bf.b(), 5))
            {
                Log.w(com.google.android.m4b.maps.cg.bf.b(), "Connection to Clearcut logger service is suspended.");
            }
        }

        public final void a(Bundle bundle)
        {
            if (ab.a(com.google.android.m4b.maps.cg.bf.b(), 4))
            {
                Log.i(com.google.android.m4b.maps.cg.bf.b(), "Connected to Clearcut logger service.");
            }
        }

        public final void a(com.google.android.m4b.maps.g.a a1)
        {
            if (ab.a(com.google.android.m4b.maps.cg.bf.b(), 5))
            {
                Log.w(com.google.android.m4b.maps.cg.bf.b(), "Connection to Clearcut logger service has failed.");
            }
        }

        private d()
        {
        }

        d(byte byte0)
        {
            this();
        }
    }


    private static final String a = com/google/android/m4b/maps/cg/bf.getSimpleName();
    private final Map b = ax.b();
    private long c;
    private final k d;
    private final Handler e;
    private final c f;
    private final Context g;
    private final String h;
    private final be i;

    private bf(Context context, Handler handler, k k1, c c1, String s1, be be1)
    {
        g = context;
        e = handler;
        d = k1;
        c = 0L;
        f = c1;
        h = s1;
        i = be1;
    }

    public static cb a(Context context, com.google.android.m4b.maps.ay.f f1, bg bg1, String s1)
    {
        c c1 = new c(f1) {

            private com.google.android.m4b.maps.ay.f a;

            public final void a()
            {
                a.a();
            }

            public final void a(String s2, String s3)
            {
                (new Thread(new com.google.android.m4b.maps.ay.f._cls1(a, s2, s3, k.b()))).start();
            }

            
            {
                a = f1;
                super();
            }
        };
        f1 = new d((byte)0);
        com.google.android.m4b.maps.h.d d1 = (new com.google.android.m4b.maps.h.d.a(context)).a(com.google.android.m4b.maps.e.a.b).a(f1).a(f1).b();
        Handler handler = new Handler(Looper.getMainLooper());
        k k1 = k.a();
        com.google.android.m4b.maps.ay.d d2 = new com.google.android.m4b.maps.ay.d(com.google.android.m4b.maps.cg.ba.b(handler), new Runnable(d1) {

            private com.google.android.m4b.maps.h.d a;

            public final void run()
            {
                synchronized (a)
                {
                    a.c();
                }
                return;
                exception;
                d3;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                a = d1;
                super();
            }
        }, k1);
        f1 = null;
        com.google.android.m4b.maps.g.d.a();
        if ((long)com.google.android.m4b.maps.g.d.a(context) >= 0x6f63a0L)
        {
            f1 = new com.google.android.m4b.maps.e.a(context, "MAPS_API");
            f1 = new be(new be.b(context, s1, bg1) {

                private Context a;
                private String b;
                private bg c;

                public final com.google.android.m4b.maps.f.a.a a()
                {
                    Context context1 = a;
                    String s2 = b;
                    bg bg2 = c;
                    com.google.android.m4b.maps.g.h.a();
                    com.google.android.m4b.maps.g.d.a();
                    return com.google.android.m4b.maps.cg.bf.a(context1, s2, bg2);
                }

            
            {
                a = context;
                b = s1;
                c = bg1;
                super();
            }
            }, new be.a(d1, d2, f1) {

                private com.google.android.m4b.maps.h.d a;
                private com.google.android.m4b.maps.ay.d b;
                private com.google.android.m4b.maps.e.a c;

                public final void a(List list)
                {
                    com.google.android.m4b.maps.cg.bf.a(list, a, b, c);
                }

            
            {
                a = d1;
                b = d2;
                c = a1;
                super();
            }
            }, Executors.newSingleThreadExecutor(), new be.c());
        }
        return new bf(context, handler, k1, c1, s1, f1);
    }

    static com.google.android.m4b.maps.f.a.a a(Context context, String s1, bg bg1)
    {
        com.google.android.m4b.maps.f.a.a a1;
        byte byte0;
        a1 = new com.google.android.m4b.maps.f.a.a();
        a1.b = "2.17.0";
        a1.a = 1;
        byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 3: default 60
    //                   71: 204
    //                   76: 174
    //                   77: 189;
           goto _L1 _L2 _L3 _L4
_L1:
        byte0;
        JVM INSTR tableswitch 0 2: default 88
    //                   0 219
    //                   1 227
    //                   2 235;
           goto _L5 _L6 _L7 _L8
_L5:
        a1.c = 0;
_L9:
        s1 = context.getPackageName();
        PackageInfo packageinfo = w.a(context, s1);
        a1.d = s1;
        a1.e = packageinfo.versionCode;
        a1.i = s.a(context, s1);
        if (w.j)
        {
            a1.j = 3;
        } else
        if (w.a)
        {
            a1.j = 2;
        } else
        {
            a1.j = 1;
        }
        a1.k = com.google.android.m4b.maps.g.h.a(context.getPackageManager(), s1);
        a1.h = true;
        a1.f = bg1.c;
        a1.g = com.google.android.m4b.maps.g.d.a(context);
        return a1;
_L3:
        if (s1.equals("L"))
        {
            byte0 = 0;
        }
          goto _L1
_L4:
        if (s1.equals("M"))
        {
            byte0 = 1;
        }
          goto _L1
_L2:
        if (s1.equals("G"))
        {
            byte0 = 2;
        }
          goto _L1
_L6:
        a1.c = 3;
          goto _L9
_L7:
        a1.c = 2;
          goto _L9
_L8:
        a1.c = 1;
          goto _L9
    }

    static void a(List list, com.google.android.m4b.maps.h.d d1, com.google.android.m4b.maps.ay.d d2, com.google.android.m4b.maps.e.a a1)
    {
        d1;
        JVM INSTR monitorenter ;
        d2.a();
        d1.b();
        list = list.iterator();
_L1:
        if (!list.hasNext())
        {
            break MISSING_BLOCK_LABEL_154;
        }
        d2 = new com.google.android.m4b.maps.e.a.a(a1, com.google.android.m4b.maps.cu.g.a((com.google.android.m4b.maps.f.a.a)list.next()), '\0');
        if (((com.google.android.m4b.maps.e.a.a) (d2)).g)
        {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        break MISSING_BLOCK_LABEL_73;
        list;
        d1;
        JVM INSTR monitorexit ;
        throw list;
        d2.g = true;
        com.google.android.m4b.maps.e.a.j(((com.google.android.m4b.maps.e.a.a) (d2)).h).a(d1, new com.google.android.m4b.maps.e.c(new com.google.android.m4b.maps.t.a(com.google.android.m4b.maps.e.a.h(((com.google.android.m4b.maps.e.a.a) (d2)).h), com.google.android.m4b.maps.e.a.i(((com.google.android.m4b.maps.e.a.a) (d2)).h), ((com.google.android.m4b.maps.e.a.a) (d2)).a, ((com.google.android.m4b.maps.e.a.a) (d2)).b, ((com.google.android.m4b.maps.e.a.a) (d2)).c, ((com.google.android.m4b.maps.e.a.a) (d2)).d, com.google.android.m4b.maps.e.a.g(((com.google.android.m4b.maps.e.a.a) (d2)).h)), ((com.google.android.m4b.maps.e.a.a) (d2)).f, ((com.google.android.m4b.maps.e.a.a) (d2)).e));
          goto _L1
        d1;
        JVM INSTR monitorexit ;
    }

    static String b()
    {
        return a;
    }

    private void c()
    {
        if (c != 0L || b.isEmpty())
        {
            return;
        }
        c = 0x7fffffffffffffffL;
        for (Iterator iterator = b.values().iterator(); iterator.hasNext();)
        {
            b b1 = (b)iterator.next();
            c = Math.min(c, b1.a);
        }

        e.removeCallbacks(this);
        e.postAtTime(this, c);
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        c c1;
        String s1;
        Object obj;
        int j;
        for (Iterator iterator = b.keySet().iterator(); iterator.hasNext(); c1.a(s1, (new StringBuilder(String.valueOf(obj).length() + 14)).append(((String) (obj))).append("|c=").append(j).toString()))
        {
            obj = (a)iterator.next();
            b b1 = (b)b.get(obj);
            c1 = f;
            s1 = ((a) (obj)).a.ci;
            obj = ((a) (obj)).b;
            j = b1.b;
        }

        break MISSING_BLOCK_LABEL_133;
        Exception exception;
        exception;
        throw exception;
        b.clear();
        f.a();
        e.removeCallbacks(this);
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(cb.a a1)
    {
        this;
        JVM INSTR monitorenter ;
        String s1;
        c c1;
        String s2;
        c1 = f;
        s2 = a1.ci;
        s1 = String.valueOf(h);
        if (s1.length() == 0)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        s1 = "r=".concat(s1);
_L1:
        c1.a(s2, s1);
        if (i != null)
        {
            i.a(a1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s1 = new String("r=");
          goto _L1
        a1;
        throw a1;
    }

    public final void b(cb.a a1)
    {
        this;
        JVM INSTR monitorenter ;
        if (ab.a(a, 3))
        {
            String s1 = a;
            String s2 = String.valueOf(a1);
            Log.d(s1, (new StringBuilder(String.valueOf(s2).length() + 13)).append("Added event: ").append(s2).toString());
        }
        if (com.google.android.m4b.maps.g.g.e(g)) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = String.valueOf(h);
        if (((String) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        obj = "r=".concat(((String) (obj)));
_L3:
        b b1;
        a a2;
        a2 = new a(a1, ((String) (obj)));
        b1 = (b)b.get(a2);
        obj = b1;
        if (b1 != null)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        obj = new b(k.c() + 10000L);
        b.put(a2, obj);
        obj.b = ((b) (obj)).b + 1;
        c();
_L2:
        if (i != null)
        {
            i.a(a1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        obj = new String("r=");
          goto _L3
        a1;
        throw a1;
    }

    public final void run()
    {
        this;
        JVM INSTR monitorenter ;
        c = 0L;
        long l = k.c();
        Iterator iterator = com.google.android.m4b.maps.aa.f.a(b.keySet()).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a a1 = (a)iterator.next();
            b b1 = (b)b.get(a1);
            if (l >= b1.a)
            {
                c c1 = f;
                String s1 = a1.a.ci;
                String s2 = a1.b;
                int j = b1.b;
                c1.a(s1, (new StringBuilder(String.valueOf(s2).length() + 14)).append(s2).append("|c=").append(j).toString());
                b.remove(a1);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_163;
        Exception exception;
        exception;
        throw exception;
        c();
        this;
        JVM INSTR monitorexit ;
    }

}
