// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.facebook.LoggingBehavior;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

public final class apt
{

    static final String a = apt.getSimpleName();
    private static final AtomicLong b = new AtomicLong();
    private final String c;
    private final apx d;
    private final File e;
    private boolean f;
    private final Object g = new Object();
    private AtomicLong h;

    public apt(Context context, String s, apx apx1)
    {
        h = new AtomicLong(0L);
        c = s;
        d = apx1;
        e = new File(context.getCacheDir(), s);
        if (e.mkdirs() || e.isDirectory())
        {
            apu.a(e);
        }
    }

    static AtomicLong a(apt apt1)
    {
        return apt1.h;
    }

    static void a(apt apt1, String s, File file)
    {
        if (!file.renameTo(new File(apt1.e, arp.b(s))))
        {
            file.delete();
        }
        synchronized (apt1.g)
        {
            if (!apt1.f)
            {
                apt1.f = true;
                aph.c().execute(apt1. new Runnable() {

                    private apt a;

                    public final void run()
                    {
                        apt.b(a);
                    }

            
            {
                a = apt.this;
                super();
            }
                });
            }
        }
        return;
        apt1;
        s;
        JVM INSTR monitorexit ;
        throw apt1;
    }

    static AtomicLong b()
    {
        return b;
    }

    static void b(apt apt1)
    {
        synchronized (apt1.g)
        {
            apt1.f = false;
        }
        obj = LoggingBehavior.d;
        arb.a();
        obj = new PriorityQueue();
        long l;
        long l2;
        l = 0L;
        l2 = 0L;
        File afile[] = apt1.e.listFiles(apu.a());
        long l1;
        long l3;
        l1 = l2;
        l3 = l;
        if (afile == null) goto _L2; else goto _L1
_L1:
        int j = afile.length;
        int i = 0;
_L3:
        File file1;
        l1 = l2;
        l3 = l;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        file1 = afile[i];
        apy apy1 = new apy(file1);
        ((PriorityQueue) (obj)).add(apy1);
        LoggingBehavior loggingbehavior1 = LoggingBehavior.d;
        (new StringBuilder("  trim considering time=")).append(Long.valueOf(apy1.b)).append(" name=").append(apy1.a.getName());
        arb.a();
        l1 = file1.length();
        i++;
        l2 = 1L + l2;
        l = l1 + l;
        if (true) goto _L3; else goto _L2
        apt1;
        obj;
        JVM INSTR monitorexit ;
        throw apt1;
_L5:
        if (l3 <= (long)apt1.d.a && l <= (long)apt1.d.b)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        File file = ((apy)((PriorityQueue) (obj)).remove()).a;
        LoggingBehavior loggingbehavior = LoggingBehavior.d;
        (new StringBuilder("  trim removing ")).append(file.getName());
        arb.a();
        l3 -= file.length();
        file.delete();
        l--;
        continue; /* Loop/switch isn't completed */
        synchronized (apt1.g)
        {
            apt1.g.notifyAll();
        }
        return;
        apt1;
        obj1;
        JVM INSTR monitorexit ;
        throw apt1;
        Exception exception;
        exception;
        synchronized (apt1.g)
        {
            apt1.g.notifyAll();
        }
        throw exception;
        apt1;
        obj2;
        JVM INSTR monitorexit ;
        throw apt1;
_L2:
        l = l1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final InputStream a(String s, InputStream inputstream)
    {
        return new apw(inputstream, b(s, null));
    }

    public final InputStream a(String s, String s1)
    {
        File file = new File(e, arp.b(s));
        Object obj;
        JSONObject jsonobject;
        String s2;
        long l;
        boolean flag;
        try
        {
            obj = new FileInputStream(file);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        obj = new BufferedInputStream(((InputStream) (obj)), 8192);
        jsonobject = aqa.a(((InputStream) (obj)));
        if (jsonobject == null)
        {
            ((BufferedInputStream) (obj)).close();
            return null;
        }
        s2 = jsonobject.optString("key");
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        flag = s2.equals(s);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        ((BufferedInputStream) (obj)).close();
        return null;
        s = jsonobject.optString("tag", null);
        if (s1 == null && s != null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        flag = s1.equals(s);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        ((BufferedInputStream) (obj)).close();
        return null;
        l = (new Date()).getTime();
        s = LoggingBehavior.d;
        (new StringBuilder("Setting lastModified to ")).append(Long.valueOf(l)).append(" for ").append(file.getName());
        arb.a();
        file.setLastModified(l);
        return ((InputStream) (obj));
        s;
        ((BufferedInputStream) (obj)).close();
        throw s;
    }

    public final void a()
    {
        File afile[] = e.listFiles(apu.a());
        h.set(System.currentTimeMillis());
        if (afile != null)
        {
            aph.c().execute(new Runnable(afile) {

                private File a[];

                public final void run()
                {
                    File afile1[] = a;
                    int j = afile1.length;
                    for (int i = 0; i < j; i++)
                    {
                        afile1[i].delete();
                    }

                }

            
            {
                a = afile;
                super();
            }
            });
        }
    }

    public final OutputStream b(String s, String s1)
    {
        Object obj;
        obj = apu.b(e);
        ((File) (obj)).delete();
        if (!((File) (obj)).createNewFile())
        {
            throw new IOException((new StringBuilder("Could not create file at ")).append(((File) (obj)).getAbsolutePath()).toString());
        }
        Object obj1;
        try
        {
            obj1 = new FileOutputStream(((File) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s1 = LoggingBehavior.d;
            (new StringBuilder("Error creating buffer output stream: ")).append(s);
            arb.c();
            throw new IOException(s.getMessage());
        }
        obj = new BufferedOutputStream(new apv(((OutputStream) (obj1)), new apz(System.currentTimeMillis(), ((File) (obj)), s) {

            private long a;
            private File b;
            private String c;
            private apt d;

            public final void a()
            {
                if (a < apt.a(d).get())
                {
                    b.delete();
                    return;
                } else
                {
                    apt.a(d, c, b);
                    return;
                }
            }

            
            {
                d = apt.this;
                a = l;
                b = file;
                c = s;
                super();
            }
        }), 8192);
        obj1 = new JSONObject();
        ((JSONObject) (obj1)).put("key", s);
        if (!arp.a(s1))
        {
            ((JSONObject) (obj1)).put("tag", s1);
        }
        s = ((JSONObject) (obj1)).toString().getBytes();
        ((OutputStream) (obj)).write(0);
        ((OutputStream) (obj)).write(s.length >> 16 & 0xff);
        ((OutputStream) (obj)).write(s.length >> 8 & 0xff);
        ((OutputStream) (obj)).write(s.length & 0xff);
        ((OutputStream) (obj)).write(s);
        return ((OutputStream) (obj));
        s;
        s1 = LoggingBehavior.d;
        (new StringBuilder("Error creating JSON header for cache file: ")).append(s);
        arb.c();
        throw new IOException(s.getMessage());
        s;
        ((BufferedOutputStream) (obj)).close();
        throw s;
    }

    public final String toString()
    {
        return (new StringBuilder("{FileLruCache: tag:")).append(c).append(" file:").append(e.getName()).append("}").toString();
    }

}
