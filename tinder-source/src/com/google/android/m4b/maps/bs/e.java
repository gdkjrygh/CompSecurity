// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bs;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Log;
import com.google.android.m4b.maps.aa.af;
import com.google.android.m4b.maps.aa.f;
import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ac.c;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.ag;
import com.google.android.m4b.maps.ay.g;
import com.google.android.m4b.maps.ay.m;
import com.google.android.m4b.maps.ay.w;
import com.google.android.m4b.maps.ay.z;
import com.google.android.m4b.maps.cq.n;
import com.google.android.m4b.maps.y.j;
import com.google.android.m4b.maps.y.p;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.m4b.maps.bs:
//            b, d, g, a, 
//            f, c

public class e
{
    public static interface a
    {

        public abstract void a();
    }

    final class b extends com.google.android.m4b.maps.ay.n
    {

        final e a;
        private final String b;
        private final m c;

        static m a(b b1)
        {
            return b1.c;
        }

        static String b(b b1)
        {
            return b1.b;
        }

        public final void a(DataOutput dataoutput)
        {
            com.google.android.m4b.maps.ac.a a1 = new com.google.android.m4b.maps.ac.a(n.a);
            e e1 = a;
            e1;
            JVM INSTR monitorenter ;
            int j1 = com.google.android.m4b.maps.bs.e.a(a).j(1);
            int i1 = 0;
_L2:
            if (i1 >= j1)
            {
                break; /* Loop/switch isn't completed */
            }
            com.google.android.m4b.maps.ac.a a2;
            com.google.android.m4b.maps.ac.a a3;
            int k1;
            a2 = com.google.android.m4b.maps.bs.e.a(a).c(1, i1);
            a3 = new com.google.android.m4b.maps.ac.a(n.d);
            k1 = com.google.android.m4b.maps.ac.c.a(a2, 1, -1);
            if (k1 == -1)
            {
                break MISSING_BLOCK_LABEL_93;
            }
            a3.a(1, k1);
            if (a2.i(2))
            {
                a3.a(2, a2.e(2));
            }
            a1.a(1, a3);
            i1++;
            if (true) goto _L2; else goto _L1
_L1:
            e1;
            JVM INSTR monitorexit ;
            a.a(com.google.android.m4b.maps.bs.e.g(a), a1);
            a1.a((OutputStream)dataoutput, true);
            return;
            dataoutput;
            e1;
            JVM INSTR monitorexit ;
            throw dataoutput;
        }

        public final boolean a(DataInput datainput)
        {
            com.google.android.m4b.maps.ac.a a1;
            boolean flag;
            int j1;
            flag = false;
            a1 = com.google.android.m4b.maps.ac.c.a(n.c, datainput);
            j1 = a1.j(1);
            datainput = a;
            datainput;
            JVM INSTR monitorenter ;
            int i1 = 0;
_L4:
            if (i1 >= j1)
            {
                break MISSING_BLOCK_LABEL_84;
            }
            com.google.android.m4b.maps.ac.a a2 = a1.c(1, i1);
            boolean flag1 = flag;
            if (!a2.i(2))
            {
                break MISSING_BLOCK_LABEL_213;
            }
            flag1 = flag;
            if (!com.google.android.m4b.maps.bs.e.a(a, a2))
            {
                break MISSING_BLOCK_LABEL_213;
            }
            e.b(a, a2);
            flag1 = true;
            break MISSING_BLOCK_LABEL_213;
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_104;
            }
            com.google.android.m4b.maps.bs.e.a(com.google.android.m4b.maps.bs.e.a(a), b);
            e.b(a);
            datainput;
            JVM INSTR monitorexit ;
            com.google.android.m4b.maps.bs.e.c(a);
            datainput = ((DataInput) (e.d(a)));
            datainput;
            JVM INSTR monitorenter ;
            e.e(a);
            if (!com.google.android.m4b.maps.bs.e.f(a))
            {
                break MISSING_BLOCK_LABEL_173;
            }
            com.google.android.m4b.maps.bs.e.a(a, c, b);
_L2:
            return true;
            Exception exception;
            exception;
            datainput;
            JVM INSTR monitorexit ;
            throw exception;
            Runnable runnable = new Runnable(this) {

                private b a;

                public final void run()
                {
                    com.google.android.m4b.maps.bs.e.a(a.a, com.google.android.m4b.maps.bs.b.a(a), b.b(a));
                }

            
            {
                a = b1;
                super();
            }
            };
            com.google.android.m4b.maps.bs.e.a(a, com.google.android.m4b.maps.bs.e.a().schedule(runnable, 3L, TimeUnit.HOURS));
            if (true) goto _L2; else goto _L1
_L1:
            runnable;
            datainput;
            JVM INSTR monitorexit ;
            throw runnable;
            i1++;
            flag = flag1;
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final boolean c()
        {
            return false;
        }

        public final boolean d()
        {
            return true;
        }

        public final int g()
        {
            return 75;
        }

        public b(String s1, m m1)
        {
            a = e.this;
            super();
            b = s1;
            c = m1;
        }
    }


    private static final String i = com/google/android/m4b/maps/bs/e.getSimpleName();
    private static final ScheduledExecutorService j = Executors.newSingleThreadScheduledExecutor();
    private static final Map t = af.e().a(Integer.valueOf(2), Integer.valueOf(4)).a(Integer.valueOf(3), Integer.valueOf(5)).a(Integer.valueOf(6), Integer.valueOf(8)).a(Integer.valueOf(8), Integer.valueOf(10)).a(Integer.valueOf(12), Integer.valueOf(14)).a(Integer.valueOf(13), Integer.valueOf(15)).a(Integer.valueOf(37), Integer.valueOf(39)).a(Integer.valueOf(45), Integer.valueOf(47)).a();
    public volatile com.google.android.m4b.maps.bs.b a;
    public volatile d b;
    public volatile com.google.android.m4b.maps.bs.g c;
    public volatile com.google.android.m4b.maps.bs.a d;
    public volatile com.google.android.m4b.maps.ac.a e;
    public boolean f;
    public boolean g;
    public final List h = new ArrayList();
    private volatile com.google.android.m4b.maps.ac.a k;
    private volatile com.google.android.m4b.maps.bs.f l;
    private volatile com.google.android.m4b.maps.bs.c m;
    private volatile ScheduledFuture n;
    private volatile boolean o;
    private volatile boolean p;
    private final Object q = new Object();
    private final Context r;
    private final m s;
    private final com.google.android.m4b.maps.ac.a u;

    public e(Context context, String s1, m m1)
    {
        n = null;
        o = false;
        p = false;
        f = false;
        g = false;
        r = context;
        s = m1;
        com.google.android.m4b.maps.ac.a a1 = new com.google.android.m4b.maps.ac.a(com.google.android.m4b.maps.by.e.a);
        Object obj = w.h.a;
        com.google.android.m4b.maps.y.j.a(obj);
        Object obj1 = new Locale(com.google.android.m4b.maps.y.p.a(z.d(((String) (obj)))), com.google.android.m4b.maps.y.p.a(z.e(((String) (obj)))));
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            obj = (new StringBuilder()).append(((Locale) (obj1)).getLanguage());
            String s2 = ((Locale) (obj1)).getCountry();
            if (!s2.isEmpty())
            {
                ((StringBuilder) (obj)).append('-').append(s2);
            }
            obj1 = ((Locale) (obj1)).getVariant();
            if (!((String) (obj1)).isEmpty())
            {
                ((StringBuilder) (obj)).append('-').append(((String) (obj1)));
            }
            obj = ((StringBuilder) (obj)).toString();
        } else
        {
            obj = ((Locale) (obj1)).toLanguageTag();
        }
        a1.b(1, obj);
        a1.b(2, w.c());
        a1.b(4, com.google.android.m4b.maps.ay.g.b(context));
        a1.b(5, String.valueOf(android.os.Build.VERSION.SDK_INT));
        a1.b(6, s1);
        a1.b(12, String.valueOf(w.a(context, s1).versionCode));
        a1.b(13, "2.17.0");
        context = z.e(w.h.a);
        obj = s.a("LegalCountry");
        if (!com.google.android.m4b.maps.y.p.b(((String) (obj))))
        {
            context = ((Context) (obj));
        }
        a1.b(8, context);
        a1.a(9, (float)(double)w.e);
        a1.a(11, w.a);
        u = a1;
        context = String.valueOf("ServerControlledParametersManager.data.");
        s1 = String.valueOf(s1);
        if (s1.length() != 0)
        {
            context = context.concat(s1);
        } else
        {
            context = new String(context);
        }
        b(m1, context);
    }

    static com.google.android.m4b.maps.ac.a a(e e1)
    {
        return e1.k;
    }

    static ScheduledExecutorService a()
    {
        return j;
    }

    static ScheduledFuture a(e e1, ScheduledFuture scheduledfuture)
    {
        e1.n = scheduledfuture;
        return scheduledfuture;
    }

    private void a(m m1, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        if (m1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Object obj = q;
        obj;
        JVM INSTR monitorenter ;
        if (n != null)
        {
            n.cancel(false);
            n = null;
        }
        if (!p)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        o = true;
          goto _L1
        m1;
        obj;
        JVM INSTR monitorexit ;
        throw m1;
        m1;
        this;
        JVM INSTR monitorexit ;
        throw m1;
        p = true;
        o = false;
        m1.c(new b(s1, m1));
          goto _L1
    }

    static void a(e e1, m m1, String s1)
    {
        e1.a(m1, s1);
    }

    private boolean a(com.google.android.m4b.maps.ac.a a1)
    {
        int i1 = com.google.android.m4b.maps.ac.c.a(a1, 1, -1);
        if (!t.containsKey(Integer.valueOf(i1)))
        {
            if (ab.a(i, 3))
            {
                Log.d(i, (new StringBuilder(58)).append("ParameterGroupProto with type ").append(i1).append(" is not supported").toString());
            }
            return false;
        }
        int j1 = ((Integer)t.get(Integer.valueOf(i1))).intValue();
        if (a1.i(j1))
        {
            a1 = a1.f(j1);
            switch (i1)
            {
            default:
                if (ab.a(i, 3))
                {
                    Log.d(i, (new StringBuilder(57)).append("ParameterGroupProto with type ").append(i1).append(" isn't supported").toString());
                }
                return false;

            case 2: // '\002'
                if (a != null)
                {
                    a.a(a1);
                } else
                {
                    a = new com.google.android.m4b.maps.bs.b(a1);
                }
                return true;

            case 6: // '\006'
                b = new d(a1);
                return true;

            case 8: // '\b'
                c = new com.google.android.m4b.maps.bs.g(a1);
                return true;

            case 12: // '\f'
                d = new com.google.android.m4b.maps.bs.a(a1);
                return true;

            case 37: // '%'
                try
                {
                    e = com.google.android.m4b.maps.ac.c.a(a1);
                }
                // Misplaced declaration of an exception variable
                catch (com.google.android.m4b.maps.ac.a a1)
                {
                    return false;
                }
                return true;

            case 3: // '\003'
                l = new com.google.android.m4b.maps.bs.f(a1);
                return true;

            case 45: // '-'
                m = new com.google.android.m4b.maps.bs.c(a1);
                return true;
            }
        }
        if (ab.a(i, 3))
        {
            Log.d(i, (new StringBuilder(56)).append("ParameterGroupProto with type ").append(i1).append(" is not updated").toString());
        }
        return false;
    }

    static boolean a(com.google.android.m4b.maps.ac.a a1, String s1)
    {
        return b(a1, s1);
    }

    static boolean a(e e1, com.google.android.m4b.maps.ac.a a1)
    {
        return e1.a(a1);
    }

    private void b()
    {
        new ArrayList();
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = com.google.android.m4b.maps.aa.f.a(h);
        h.clear();
        this;
        JVM INSTR monitorexit ;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((a)((Iterator) (obj)).next()).a()) { }
        break MISSING_BLOCK_LABEL_67;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void b(com.google.android.m4b.maps.ac.a a1)
    {
        int j1 = a1.d(1);
        if (!t.containsKey(Integer.valueOf(j1)))
        {
            return;
        }
        int k1 = k.j(1);
        int i1 = 0;
        do
        {
label0:
            {
                if (i1 < k1)
                {
                    if (j1 != k.c(1, i1).d(1))
                    {
                        break label0;
                    }
                    k.e(1, i1);
                }
                k.a(1, a1);
                return;
            }
            i1++;
        } while (true);
    }

    private void b(m m1, String s1)
    {
        com.google.android.m4b.maps.ac.a a2;
        Iterator iterator;
        if (k != null)
        {
            return;
        }
        a2 = new com.google.android.m4b.maps.ac.a(n.c);
        iterator = t.entrySet().iterator();
_L19:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        com.google.android.m4b.maps.ac.a a1;
        int i1;
        int k1;
        java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
        a1 = new com.google.android.m4b.maps.ac.a(n.d);
        i1 = ((Integer)entry.getKey()).intValue();
        k1 = ((Integer)entry.getValue()).intValue();
        a1.a(1, i1);
        i1;
        JVM INSTR lookupswitch 9: default 192
    //                   2: 208
    //                   3: 228
    //                   6: 248
    //                   8: 268
    //                   11: 288
    //                   12: 308
    //                   13: 328
    //                   37: 348
    //                   45: 368;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L3:
        a1 = null;
_L13:
        if (a1 != null)
        {
            a2.a(1, a1);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        a1.b(k1, new com.google.android.m4b.maps.ac.a(n.e));
        continue; /* Loop/switch isn't completed */
_L5:
        a1.b(k1, new com.google.android.m4b.maps.ac.a(n.j));
        continue; /* Loop/switch isn't completed */
_L6:
        a1.b(k1, new com.google.android.m4b.maps.ac.a(n.k));
        continue; /* Loop/switch isn't completed */
_L7:
        a1.b(k1, new com.google.android.m4b.maps.ac.a(n.l));
        continue; /* Loop/switch isn't completed */
_L8:
        a1.b(k1, new com.google.android.m4b.maps.ac.a(n.f));
        continue; /* Loop/switch isn't completed */
_L9:
        a1.b(k1, new com.google.android.m4b.maps.ac.a(n.g));
        continue; /* Loop/switch isn't completed */
_L10:
        a1.b(k1, new com.google.android.m4b.maps.ac.a(n.h));
        continue; /* Loop/switch isn't completed */
_L11:
        a1.b(k1, new com.google.android.m4b.maps.ac.a(com.google.android.m4b.maps.by.e.b));
        continue; /* Loop/switch isn't completed */
_L12:
        a1.b(k1, new com.google.android.m4b.maps.ac.a(n.i));
        if (true) goto _L13; else goto _L2
_L2:
        k = a2;
        byte abyte0[] = w.i.b(s1);
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_479;
        }
        a2 = new com.google.android.m4b.maps.ac.a(n.c);
        a2.a(abyte0);
        k1 = a2.j(1);
        this;
        JVM INSTR monitorenter ;
        i1 = 0;
_L15:
        if (i1 >= k1)
        {
            break; /* Loop/switch isn't completed */
        }
        b(a2.c(1, i1));
        i1++;
        if (true) goto _L15; else goto _L14
_L14:
        g = true;
        this;
        JVM INSTR monitorexit ;
        b();
_L17:
        int l1 = k.j(1);
        for (int j1 = 0; j1 < l1; j1++)
        {
            a(k.c(1, j1));
        }

        break; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (IOException ioexception)
        {
            if (ab.a(i, 3))
            {
                String s2 = i;
                String s3 = String.valueOf(ioexception);
                Log.d(s2, (new StringBuilder(String.valueOf(s3).length() + 70)).append("Can't parse the CLIENT_PARAMETERS_RESPONSE_PROTO read from the cache: ").append(s3).toString());
            }
        }
        if (true) goto _L17; else goto _L16
_L16:
        a(m1, s1);
        return;
        if (true) goto _L19; else goto _L18
_L18:
    }

    static void b(e e1, com.google.android.m4b.maps.ac.a a1)
    {
        e1.b(a1);
    }

    private static boolean b(com.google.android.m4b.maps.ac.a a1, String s1)
    {
        try
        {
            w.i.a(a1.c(), s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            if (ab.a(i, 3))
            {
                a1 = i;
                s1 = String.valueOf(s1);
                Log.d(a1, (new StringBuilder(String.valueOf(s1).length() + 63)).append("Can't write the CLIENT_PARAMETERS_RESPONSE_PROTO to the cache: ").append(s1).toString());
            }
            return false;
        }
        return true;
    }

    static boolean b(e e1)
    {
        e1.f = true;
        return true;
    }

    static void c(e e1)
    {
        e1.b();
    }

    static Object d(e e1)
    {
        return e1.q;
    }

    static boolean e(e e1)
    {
        e1.p = false;
        return false;
    }

    static boolean f(e e1)
    {
        return e1.o;
    }

    static Context g(e e1)
    {
        return e1.r;
    }

    public final void a(Context context, com.google.android.m4b.maps.ac.a a1)
    {
        boolean flag1 = true;
        com.google.android.m4b.maps.ac.a a2 = new com.google.android.m4b.maps.ac.a(n.b);
        a2.a(1, true);
        boolean flag = flag1;
        if (!ag.a(context))
        {
            if (ag.a())
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        a2.a(2, flag);
        a2.b(4, u);
        a1.a(2, a2);
    }

}
