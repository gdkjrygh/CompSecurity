// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.snapchat.android.Timber;
import com.squareup.otto.Bus;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class rb
{
    final class a
        implements ri.a
    {

        private final BQ a;
        private final long b;
        private final boolean c;
        private int d;
        private rb e;

        public final BQ a()
        {
            return a;
        }

        public final long b()
        {
            return b;
        }

        public final boolean c()
        {
            return c;
        }

        public final void d()
        {
            Timber.i("LensPrepareResourcesRequest", "Resources ready %s", new Object[] {
                a
            });
            a.mIsLoading = false;
            e.b.a(new Nc(a));
        }

        public final void e()
        {
            int i = d;
            d = i - 1;
            if (i > 0)
            {
                e.a.a(this);
                return;
            } else
            {
                a.mIsLoading = false;
                e.b.a(new Nd(a));
                Timber.i("LensPrepareResourcesRequest", "Could not prepare lens. Max attempts reached %s", new Object[] {
                    a
                });
                return;
            }
        }

        public a(BQ bq, boolean flag, long l)
        {
            e = rb.this;
            super();
            d = 5;
            a = bq;
            c = flag;
            b = l;
        }
    }


    final ri a;
    protected final Bus b;
    final JY c;
    protected final Object d = new Object();
    protected Map e;
    protected volatile boolean f;
    private final LB g;
    private final Gson h = (new GsonBuilder()).registerTypeAdapter(alF, new AG()).registerTypeAdapter(als, new AC()).create();

    protected rb(JY jy, LB lb, ri ri1, Bus bus)
    {
        e = new HashMap();
        f = false;
        a = ri1;
        b = bus;
        c = jy;
        g = lb;
        b.c(this);
        c.a(new JY.a() {

            private rb a;

            public final void a()
            {
                PG.b(a. new Runnable() {

                    private rb a;

                    public final void run()
                    {
                        synchronized (a.d)
                        {
                            a.a(a.a(a.c));
                            a.b();
                        }
                        return;
                        exception;
                        obj;
                        JVM INSTR monitorexit ;
                        throw exception;
                    }

            
            {
                a = rb.this;
                super();
            }
                });
            }

            
            {
                a = rb.this;
                super();
            }
        });
    }

    protected final Map a(JY jy)
    {
        HashMap hashmap;
        Iterator iterator;
        hashmap = new HashMap(jy.c() << 1);
        iterator = jy.d().iterator();
_L7:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        String s = (String)((java.util.Map.Entry)iterator.next()).getKey();
        Object obj = jy.b(s);
        if (obj != null) goto _L4; else goto _L3
_L3:
        jy.e(s);
        continue; /* Loop/switch isn't completed */
        obj;
_L5:
        Timber.i("BaseRemoteLensesDataSource", ((Exception) (obj)).getMessage(), new Object[0]);
        jy.e(s);
        continue; /* Loop/switch isn't completed */
_L4:
        obj = new String(((byte []) (obj)), "UTF-8");
        hashmap.put(s, (BQ)h.fromJson(((String) (obj)), d()));
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L5; else goto _L2
_L2:
        return hashmap;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void a()
    {
        if (!f)
        {
            return;
        }
        synchronized (d)
        {
            e.clear();
        }
        c.b();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(BQ bq)
    {
        PG.b();
        if (!f)
        {
            return;
        }
        synchronized (d)
        {
            if (!e.containsKey(bq.mLensId))
            {
                break MISSING_BLOCK_LABEL_42;
            }
        }
        return;
        bq;
        obj;
        JVM INSTR monitorexit ;
        throw bq;
        e.put(bq.mLensId, bq);
        obj;
        JVM INSTR monitorexit ;
        PG.b();
        Object obj1 = h.toJson(bq, d());
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        if (((String) (obj1)).length() != 0) goto _L3; else goto _L2
_L2:
        obj1 = (new StringBuilder("Could not serialize lens ")).append(bq.mLensId).toString();
        Timber.i("BaseRemoteLensesDataSource", ((String) (obj1)), new Object[0]);
        g.a(new lM(((String) (obj1))));
_L5:
        a(bq, true);
        return;
_L3:
        obj1 = ((String) (obj1)).getBytes(Charset.forName("UTF-8"));
        if (obj1.length == 0)
        {
            obj1 = (new StringBuilder("Could not getBytes for ")).append(bq.mLensId).toString();
            Timber.i("BaseRemoteLensesDataSource", ((String) (obj1)), new Object[0]);
            g.a(new lM(((String) (obj1))));
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            c.a(bq.mLensId, ((byte []) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            Timber.i("BaseRemoteLensesDataSource", ((Kd) (obj1)).getMessage(), new Object[0]);
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected final void a(BQ bq, boolean flag)
    {
        PG.b();
        bq.mIsLoading = true;
        b.a(new Ne(bq));
        a.a(new a(bq, flag, c()));
    }

    protected void a(Map map)
    {
        synchronized (d)
        {
            e = map;
            f = true;
        }
        return;
        map;
        obj;
        JVM INSTR monitorexit ;
        throw map;
    }

    protected final void b()
    {
        PG.b();
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = e.entrySet().iterator(); iterator.hasNext(); a((BQ)((java.util.Map.Entry)iterator.next()).getValue(), true)) { }
        break MISSING_BLOCK_LABEL_64;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
    }

    protected abstract long c();

    protected abstract Class d();
}
