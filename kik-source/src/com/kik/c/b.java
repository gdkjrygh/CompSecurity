// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.c;

import com.c.a.h.a.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kik.a.h.j;
import org.c.c;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.c:
//            d, c

public final class com.kik.c.b
{
    private final class a
        implements Runnable
    {

        final com.kik.c.b a;

        public final void run()
        {
            synchronized (com.kik.c.b.a(a))
            {
                if (com.kik.c.b.b(a) != null)
                {
                    com.kik.c.b.b(a).cancel(false);
                    com.kik.c.b.c(a);
                }
                com.kik.c.b.d(a);
                obj = com.kik.c.b.e(a).listFiles();
            }
            if (obj == null)
            {
                return;
            }
            break MISSING_BLOCK_LABEL_73;
            obj;
            scheduledexecutorservice;
            JVM INSTR monitorexit ;
            throw obj;
            Arrays.sort(((Object []) (obj)), a. new b((byte)0));
            if (obj.length > 20)
            {
                for (int i1 = 0; i1 < obj.length - 20; i1++)
                {
                    if (!obj[i1].delete())
                    {
                        com.kik.c.b.b().b("Failed to delete file {}", obj[i1]);
                    }
                }

            }
            int j1 = obj.length;
            int l1 = obj.length;
            for (int k1 = 0; k1 < l1; k1++)
            {
                File file = obj[k1];
                com.kik.c.b.a(a).submit(a. new c(file, (byte)0));
            }

            return;
        }

        private a()
        {
            a = com.kik.c.b.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    private final class b
        implements Comparator
    {

        final com.kik.c.b a;

        public final int compare(Object obj, Object obj1)
        {
            obj = (File)obj;
            obj1 = (File)obj1;
            obj = ((File) (obj)).getName().split("\\.");
            obj1 = ((File) (obj1)).getName().split("\\.");
            int i1 = Long.decode(obj[0]).compareTo(Long.decode(obj1[0]));
            if (i1 != 0)
            {
                return i1;
            } else
            {
                return Long.decode(obj[1]).compareTo(Long.decode(obj1[1]));
            }
        }

        private b()
        {
            a = com.kik.c.b.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }

    private final class c
        implements Runnable
    {

        final com.kik.c.b a;
        private final File b;

        private void a()
        {
            if (!b.delete())
            {
                com.kik.c.b.b().b("Failed to delete file: {}", b);
            }
        }

        private int b()
        {
            Object obj2;
            Object obj3;
            obj2 = null;
            obj3 = null;
            Object obj = new FileInputStream(b);
            Object obj1 = (HttpURLConnection)(new URL(com.kik.c.b.g(a))).openConnection();
            int i1;
            ((HttpURLConnection) (obj1)).setRequestMethod("POST");
            ((HttpURLConnection) (obj1)).setRequestProperty("Content-Type", "application/json");
            ((HttpURLConnection) (obj1)).setDoOutput(true);
            ((HttpURLConnection) (obj1)).connect();
            org.a.a.a.c.a(((java.io.InputStream) (obj)), ((HttpURLConnection) (obj1)).getOutputStream());
            i1 = ((HttpURLConnection) (obj1)).getResponseCode();
            if (i1 == 200)
            {
                break MISSING_BLOCK_LABEL_118;
            }
            com.kik.c.b.b().b("Upload failed {} {}", Integer.toString(i1), ((HttpURLConnection) (obj1)).getResponseMessage());
            if (((HttpURLConnection) (obj1)).getErrorStream() != null)
            {
                org.a.a.a.c.c(((HttpURLConnection) (obj1)).getErrorStream());
            }
            int j1;
            org.a.a.a.c.a(((java.io.InputStream) (obj)));
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_216;
            }
            ((HttpURLConnection) (obj1)).disconnect();
            j1 = i1;
_L2:
            return j1;
            obj;
            obj1 = null;
            i1 = -1;
            obj = obj3;
_L5:
            org.a.a.a.c.a(((java.io.InputStream) (obj)));
            j1 = i1;
            if (obj1 == null) goto _L2; else goto _L1
_L1:
            ((HttpURLConnection) (obj1)).disconnect();
            return i1;
            obj1;
            obj = null;
_L4:
            org.a.a.a.c.a(((java.io.InputStream) (obj)));
            if (obj2 != null)
            {
                ((HttpURLConnection) (obj2)).disconnect();
            }
            throw obj1;
            obj1;
            continue; /* Loop/switch isn't completed */
            Exception exception;
            exception;
            obj2 = obj1;
            obj1 = exception;
            if (true) goto _L4; else goto _L3
_L3:
            IOException ioexception;
            ioexception;
            i1 = -1;
            ioexception = null;
              goto _L5
            IOException ioexception1;
            ioexception1;
            i1 = -1;
              goto _L5
            ioexception1;
              goto _L5
            return i1;
        }

        public final void run()
        {
            if (!b.exists())
            {
                com.kik.c.b.b().b("Can't upload, file doesn't exist: {}", b);
            } else
            if (a.b.get() <= System.currentTimeMillis())
            {
                String s = b.getName().split("\\.")[0];
                long l1;
                try
                {
                    l1 = Long.parseLong(s);
                }
                catch (NumberFormatException numberformatexception)
                {
                    com.kik.c.b.b().c("failed to parse timestamp from file name: {}", b);
                    return;
                }
                if (System.currentTimeMillis() - l1 > 0xf731400L)
                {
                    com.kik.c.b.b().b("File too old, deleting: {}", b);
                    a();
                    return;
                }
                if (a.a.a(b) >= 5L)
                {
                    com.kik.c.b.b().b("Retry limit exceeded, deleting: {}", b);
                    a();
                    return;
                }
                a.a.b(b);
                int i1 = b();
                if (i1 == 200)
                {
                    a();
                    return;
                }
                if (i1 == 403 || i1 == 404 || i1 == 405)
                {
                    com.kik.c.b.b().b("Upload failed with code {}", Integer.valueOf(i1));
                    return;
                }
                if (i1 >= 400 && i1 < 500)
                {
                    com.kik.c.b.b().b("Error uploading, code {}, deleting {}", Integer.valueOf(i1), b);
                    a();
                    return;
                }
                if (i1 == 503)
                {
                    com.kik.c.b.b().a("Upload failed with 503, setting backoff");
                    a.b.set(System.currentTimeMillis() + com.kik.c.b.f(a));
                    return;
                } else
                {
                    com.kik.c.b.b().b("Upload failed with code {}", Integer.valueOf(i1));
                    return;
                }
            }
        }

        private c(File file)
        {
            a = com.kik.c.b.this;
            super();
            b = file;
        }

        c(File file, byte byte0)
        {
            this(file);
        }
    }


    private static org.c.b f = org.c.c.a("Augmentum");
    com.c.a.h.a.a a;
    AtomicLong b;
    AtomicLong c;
    private volatile long d;
    private volatile long e;
    private final d g;
    private final File h;
    private final SimpleDateFormat i;
    private final String j;
    private File k;
    private int l;
    private final ExecutorService m;
    private final ScheduledExecutorService n;
    private ScheduledFuture o;

    public com.kik.c.b(d d1, File file)
    {
        this(d1, file, "https://clientmetrics-augmentum.kik.com/clientmetrics/augmentum/v1/data?flattened=true");
    }

    private com.kik.c.b(d d1, File file, String s)
    {
        d = 20000L;
        e = 10000L;
        k = null;
        l = 0;
        m = Executors.newSingleThreadExecutor();
        n = Executors.newSingleThreadScheduledExecutor();
        a = com.c.a.h.a.a.a();
        b = new AtomicLong(0L);
        c = new AtomicLong(0L);
        g = d1;
        h = file;
        j = s;
        i = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        d1 = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        d1.setGregorianChange(new Date(0x8000000000000000L));
        i.setCalendar(d1);
    }

    static ScheduledExecutorService a(com.kik.c.b b1)
    {
        return b1.n;
    }

    static void a(com.kik.c.b b1, JSONObject jsonobject)
    {
        boolean flag = true;
        if (b1.h.isDirectory() || b1.h.mkdirs()) goto _L2; else goto _L1
_L1:
        f.b("Could not create metrics directory");
_L4:
        return;
_L2:
        ScheduledExecutorService scheduledexecutorservice = b1.n;
        scheduledexecutorservice;
        JVM INSTR monitorenter ;
        if (b1.k == null || b1.l >= 50)
        {
            b1.k = new File(b1.h, (new StringBuilder()).append(Long.toString(System.currentTimeMillis())).append(".").append(b1.c.incrementAndGet()).append(".met").toString());
            b1.l = 0;
        }
        b1.l = b1.l + 1;
        FileOutputStream fileoutputstream = new FileOutputStream(b1.k, true);
        Object obj = fileoutputstream;
        fileoutputstream.write((new StringBuilder()).append(jsonobject.toString()).append("\n").toString().getBytes(Charset.forName("UTF-8")));
        fileoutputstream.close();
_L5:
        scheduledexecutorservice;
        JVM INSTR monitorexit ;
        if (!flag) goto _L4; else goto _L3
_L3:
        jsonobject.toString();
        long l2 = b1.e;
        long l3 = System.currentTimeMillis();
        long l4 = b1.b.get();
        long l1 = l2;
        if (l4 > l3)
        {
            l1 = l2;
            if (l4 - l3 > l2)
            {
                l1 = (l4 - l3) + 1L;
            }
        }
        synchronized (b1.n)
        {
            if (b1.o == null)
            {
                b1.o = b1.n.schedule(b1. new a((byte)0), l1, TimeUnit.MILLISECONDS);
            }
        }
        return;
        b1;
        jsonobject;
        JVM INSTR monitorexit ;
        throw b1;
        obj;
        f.a("Failed to close file", ((Throwable) (obj)));
          goto _L5
        b1;
        scheduledexecutorservice;
        JVM INSTR monitorexit ;
        throw b1;
        IOException ioexception;
        ioexception;
        fileoutputstream = null;
_L9:
        obj = fileoutputstream;
        f.b("Failed to write to metrics log", ioexception);
        obj = fileoutputstream;
        b1.k = null;
        if (fileoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_353;
        }
        fileoutputstream.close();
        flag = false;
          goto _L5
        obj;
        f.a("Failed to close file", ((Throwable) (obj)));
        flag = false;
          goto _L5
        b1;
        obj = null;
_L8:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_388;
        }
        ((FileOutputStream) (obj)).close();
_L6:
        throw b1;
        jsonobject;
        f.a("Failed to close file", jsonobject);
          goto _L6
        b1;
        if (true) goto _L8; else goto _L7
_L7:
        ioexception;
          goto _L9
    }

    static ScheduledFuture b(com.kik.c.b b1)
    {
        return b1.o;
    }

    static org.c.b b()
    {
        return f;
    }

    static ScheduledFuture c(com.kik.c.b b1)
    {
        b1.o = null;
        return null;
    }

    static File d(com.kik.c.b b1)
    {
        b1.k = null;
        return null;
    }

    static File e(com.kik.c.b b1)
    {
        return b1.h;
    }

    static long f(com.kik.c.b b1)
    {
        return b1.d;
    }

    static String g(com.kik.c.b b1)
    {
        return b1.j;
    }

    public final void a()
    {
        n.submit(new a((byte)0));
    }

    public final void a(com.kik.android.a.f f1, JSONObject jsonobject)
    {
        JSONObject jsonobject1;
        Object obj = f1.d();
        f1 = f1.f();
        String s1;
        try
        {
            jsonobject1 = new JSONObject();
            jsonobject1.put("event:origin", "mobile");
            jsonobject1.put("event:name", obj);
            jsonobject1.put("instanceId", UUID.randomUUID().toString());
            jsonobject1.put("timestamp", i.format(new Date(System.currentTimeMillis())));
            if (kik.a.h.j.a() != 0L)
            {
                jsonobject1.put("commonData:Server Time", i.format(new Date(kik.a.h.j.b())));
            }
            obj = g.d();
        }
        // Misplaced declaration of an exception variable
        catch (com.kik.android.a.f f1)
        {
            f.c("Error constructing augmentum event: {}", f1.getMessage());
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        jsonobject1.put("userJid", ((kik.a.d.j) (obj)).c());
        jsonobject1.put("deviceId", g.a());
        jsonobject1.put("clientVersion", g.c());
        jsonobject1.put("devicePrefix", "CAN");
        for (obj = jsonobject.keys(); ((Iterator) (obj)).hasNext(); jsonobject1.put((new StringBuilder("commonData:")).append(s1).toString(), jsonobject.get(s1)))
        {
            s1 = (String)((Iterator) (obj)).next();
        }

        jsonobject1.put("commonData:Android Id", g.b());
        String s;
        for (jsonobject = f1.keys(); jsonobject.hasNext(); jsonobject1.put((new StringBuilder("eventData:")).append(s).toString(), f1.get(s)))
        {
            s = (String)jsonobject.next();
        }

        m.submit(new com.kik.c.c(this, jsonobject1));
        return;
    }

}
