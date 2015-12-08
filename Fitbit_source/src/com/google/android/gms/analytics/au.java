// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.internal.ha;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.gms.analytics:
//            af, p, w, v, 
//            aa, j, ag, aj, 
//            c, y, n

class au extends Thread
    implements af
{
    private class a
        implements Runnable
    {

        final au a;

        public void run()
        {
            au.d(a).a();
        }

        private a()
        {
            a = au.this;
            super();
        }

    }

    private class b
        implements Runnable
    {

        final au a;

        public void run()
        {
            au.d(a).c();
        }

        private b()
        {
            a = au.this;
            super();
        }

    }

    private class c
        implements Runnable
    {

        final au a;

        public void run()
        {
            au.d(a).b();
        }

        private c()
        {
            a = au.this;
            super();
        }

    }

    private class d
        implements Runnable
    {

        final au a;
        private final Map b;

        private String a(Map map)
        {
            if (map.containsKey("useSecure"))
            {
                if (aa.a((String)map.get("useSecure"), true))
                {
                    return "https:";
                } else
                {
                    return "http:";
                }
            } else
            {
                return "https:";
            }
        }

        private void b(Map map)
        {
            ao ao = j.a(au.a(a));
            aa.a(map, "&adid", ao);
            aa.a(map, "&ate", ao);
        }

        private void c(Map map)
        {
            ag ag1 = ag.a();
            aa.a(map, "&an", ag1);
            aa.a(map, "&av", ag1);
            aa.a(map, "&aid", ag1);
            aa.a(map, "&aiid", ag1);
            map.put("&v", "1");
        }

        private boolean d(Map map)
        {
            if (map.get("&sf") == null)
            {
                return false;
            }
            double d1 = aa.a((String)map.get("&sf"), 100D);
            if (d1 >= 100D)
            {
                return false;
            }
            if ((double)(au.a((String)map.get("&cid")) % 10000) >= d1 * 100D)
            {
                if (map.get("&t") == null)
                {
                    map = "unknown";
                } else
                {
                    map = (String)map.get("&t");
                }
                p.c(String.format("%s hit sampled out", new Object[] {
                    map
                }));
                return true;
            } else
            {
                return false;
            }
        }

        public void run()
        {
            b(b);
            if (TextUtils.isEmpty((CharSequence)b.get("&cid")))
            {
                b.put("&cid", aj.a().a("&cid"));
            }
            if (com.google.android.gms.analytics.c.a(au.a(a)).c() || d(b))
            {
                return;
            }
            if (!TextUtils.isEmpty(au.b(a)))
            {
                y.a().a(true);
                b.putAll((new d.d()).d(au.b(a)).a());
                y.a().a(false);
                au.a(a, null);
            }
            c(b);
            Map map = n.a(b);
            au.d(a).a(map, Long.valueOf((String)b.get("&ht")).longValue(), a(b), au.c(a));
        }

        d(Map map)
        {
            a = au.this;
            super();
            b = new HashMap(map);
            map = (String)map.get("&ht");
            au1 = map;
            if (map == null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            Long.valueOf(map);
            au1 = map;
_L2:
            if (au.this == null)
            {
                long l = System.currentTimeMillis();
                b.put("&ht", Long.toString(l));
            }
            return;
            au1;
            au1 = null;
            if (true) goto _L2; else goto _L1
_L1:
        }
    }


    private static au e;
    private final LinkedBlockingQueue a = new LinkedBlockingQueue();
    private volatile boolean b;
    private volatile boolean c;
    private volatile String d;
    private volatile v f;
    private final Context g;
    private final Lock h = new ReentrantLock();
    private final List i = new ArrayList();

    private au(Context context)
    {
        super("GAThread");
        b = false;
        c = false;
        if (context != null)
        {
            g = context.getApplicationContext();
        } else
        {
            g = context;
        }
        i.add(new ha("appendVersion", "&_v".substring(1), "ma4.0.4"));
        start();
    }

    static int a(String s)
    {
        int l = 1;
        if (!TextUtils.isEmpty(s))
        {
            int k = s.length();
            int j = 0;
            k--;
            do
            {
                l = j;
                if (k < 0)
                {
                    break;
                }
                l = s.charAt(k);
                l = (j << 6 & 0xfffffff) + l + (l << 14);
                int i1 = 0xfe00000 & l;
                j = l;
                if (i1 != 0)
                {
                    j = l ^ i1 >> 21;
                }
                k--;
            } while (true);
        }
        return l;
    }

    static Context a(au au1)
    {
        return au1.g;
    }

    static au a(Context context)
    {
        if (e == null)
        {
            e = new au(context);
        }
        return e;
    }

    static String a(au au1, String s)
    {
        au1.d = s;
        return s;
    }

    private String a(Throwable throwable)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        PrintStream printstream = new PrintStream(bytearrayoutputstream);
        throwable.printStackTrace(printstream);
        printstream.flush();
        return new String(bytearrayoutputstream.toByteArray());
    }

    private void a(Runnable runnable)
    {
        a.add(runnable);
    }

    static String b(Context context)
    {
        Object obj;
        byte abyte0[];
        int j;
        obj = context.openFileInput("gaInstallData");
        abyte0 = new byte[8192];
        j = ((FileInputStream) (obj)).read(abyte0, 0, 8192);
        if (((FileInputStream) (obj)).available() <= 0)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        p.a("Too much campaign data, ignoring it.");
        ((FileInputStream) (obj)).close();
        context.deleteFile("gaInstallData");
        return null;
        try
        {
            ((FileInputStream) (obj)).close();
            context.deleteFile("gaInstallData");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            p.b("No campaign data found.");
            return null;
        }
        catch (IOException ioexception)
        {
            p.a("Error reading campaign data.");
            context.deleteFile("gaInstallData");
            return null;
        }
        if (j > 0)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        p.d("Campaign file is empty.");
        return null;
        obj = new String(abyte0, 0, j);
        p.b((new StringBuilder()).append("Campaign found: ").append(((String) (obj))).toString());
        return ((String) (obj));
    }

    static String b(au au1)
    {
        return au1.d;
    }

    static List c(au au1)
    {
        return au1.i;
    }

    static v d(au au1)
    {
        return au1.f;
    }

    public void a()
    {
        a(((Runnable) (new b())));
    }

    public void a(Map map)
    {
        a(((Runnable) (new d(map))));
    }

    public void b()
    {
        a(new a());
    }

    public void c()
    {
        a(new c());
    }

    public LinkedBlockingQueue d()
    {
        return a;
    }

    public Thread e()
    {
        return this;
    }

    public void f()
    {
        Object obj;
        g();
        obj = new ArrayList();
        a.drainTo(((java.util.Collection) (obj)));
        h.lock();
        b = true;
        obj = ((List) (obj)).iterator();
_L1:
        Runnable runnable;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_98;
        }
        runnable = (Runnable)((Iterator) (obj)).next();
        runnable.run();
          goto _L1
        Object obj1;
        obj1;
        p.a((new StringBuilder()).append("Error dispatching all events on exit, giving up: ").append(a(((Throwable) (obj1)))).toString());
        h.unlock();
        return;
        obj1;
        h.unlock();
        throw obj1;
    }

    protected void g()
    {
        this;
        JVM INSTR monitorenter ;
        v v1 = f;
        if (v1 == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        f = new w(g, this);
        f.d();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void run()
    {
        Process.setThreadPriority(10);
        Runnable runnable;
        Object obj;
        try
        {
            Thread.sleep(5000L);
        }
        catch (InterruptedException interruptedexception)
        {
            p.d("sleep interrupted in GAThread initialize");
        }
        try
        {
            g();
            d = b(g);
            p.c("Initialized GA Thread");
        }
        catch (Throwable throwable)
        {
            p.a((new StringBuilder()).append("Error initializing the GAThread: ").append(a(throwable)).toString());
            p.a("Google Analytics will not start up.");
            b = true;
        }
        if (c)
        {
            break; /* Loop/switch isn't completed */
        }
        runnable = (Runnable)a.take();
        h.lock();
        if (!b)
        {
            runnable.run();
        }
        h.unlock();
        continue; /* Loop/switch isn't completed */
        obj;
        try
        {
            p.b(((InterruptedException) (obj)).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            p.a((new StringBuilder()).append("Error on GAThread: ").append(a(((Throwable) (obj)))).toString());
            p.a("Google Analytics is shutting down.");
            b = true;
        }
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_32;
        Exception exception;
        exception;
        h.unlock();
        throw exception;
_L1:
    }
}
