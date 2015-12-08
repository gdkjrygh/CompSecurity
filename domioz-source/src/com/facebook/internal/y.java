// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import com.facebook.am;
import com.facebook.q;
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

// Referenced classes of package com.facebook.internal:
//            ac, aw, ab, ak, 
//            ah, ag, aj, aa, 
//            af, z

public final class y
{

    static final String a = com/facebook/internal/y.getSimpleName();
    private static final AtomicLong b = new AtomicLong();
    private final String c;
    private final ag d;
    private final File e;
    private boolean f;
    private boolean g;
    private final Object h = new Object();
    private AtomicLong i;

    public y(String s, ag ag1)
    {
        i = new AtomicLong(0L);
        c = s;
        d = ag1;
        e = new File(q.j(), s);
        if (e.mkdirs() || e.isDirectory())
        {
            ac.a(e);
        }
    }

    static AtomicLong a(y y1)
    {
        return y1.i;
    }

    static void a(y y1, String s, File file)
    {
        if (!file.renameTo(new File(y1.e, aw.b(s))))
        {
            file.delete();
        }
        synchronized (y1.h)
        {
            if (!y1.f)
            {
                y1.f = true;
                q.d().execute(new ab(y1));
            }
        }
        return;
        y1;
        s;
        JVM INSTR monitorexit ;
        throw y1;
    }

    static AtomicLong b()
    {
        return b;
    }

    static void b(y y1)
    {
        synchronized (y1.h)
        {
            y1.f = false;
            y1.g = true;
        }
        ak.a(am.d, a, "trim started");
        obj = new PriorityQueue();
        long l;
        long l2;
        l = 0L;
        l2 = 0L;
        File afile[] = y1.e.listFiles(ac.a());
        long l1;
        long l3;
        l1 = l2;
        l3 = l;
        if (afile == null) goto _L2; else goto _L1
_L1:
        int k = afile.length;
        int j = 0;
_L3:
        File file1;
        l1 = l2;
        l3 = l;
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        file1 = afile[j];
        ah ah1 = new ah(file1);
        ((PriorityQueue) (obj)).add(ah1);
        ak.a(am.d, a, (new StringBuilder("  trim considering time=")).append(Long.valueOf(ah1.b())).append(" name=").append(ah1.a().getName()).toString());
        l1 = file1.length();
        j++;
        l2 = 1L + l2;
        l = l1 + l;
        if (true) goto _L3; else goto _L2
        y1;
        obj;
        JVM INSTR monitorexit ;
        throw y1;
_L5:
        if (l3 <= (long)y1.d.a() && l <= (long)y1.d.b())
        {
            break MISSING_BLOCK_LABEL_282;
        }
        File file = ((ah)((PriorityQueue) (obj)).remove()).a();
        ak.a(am.d, a, (new StringBuilder("  trim removing ")).append(file.getName()).toString());
        l3 -= file.length();
        file.delete();
        l--;
        continue; /* Loop/switch isn't completed */
        synchronized (y1.h)
        {
            y1.g = false;
            y1.h.notifyAll();
        }
        return;
        y1;
        obj1;
        JVM INSTR monitorexit ;
        throw y1;
        Exception exception;
        exception;
        synchronized (y1.h)
        {
            y1.g = false;
            y1.h.notifyAll();
        }
        throw exception;
        y1;
        obj2;
        JVM INSTR monitorexit ;
        throw y1;
_L2:
        l = l1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final InputStream a(String s)
    {
        File file = new File(e, aw.b(s));
        Object obj;
        JSONObject jsonobject;
        String s1;
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
        jsonobject = aj.a(((InputStream) (obj)));
        if (jsonobject == null)
        {
            ((BufferedInputStream) (obj)).close();
            return null;
        }
        s1 = jsonobject.optString("key");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        flag = s1.equals(s);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        ((BufferedInputStream) (obj)).close();
        return null;
        s = jsonobject.optString("tag", null);
        if (s != null)
        {
            ((BufferedInputStream) (obj)).close();
            return null;
        }
        l = (new Date()).getTime();
        ak.a(am.d, a, (new StringBuilder("Setting lastModified to ")).append(Long.valueOf(l)).append(" for ").append(file.getName()).toString());
        file.setLastModified(l);
        return ((InputStream) (obj));
        s;
        ((BufferedInputStream) (obj)).close();
        throw s;
    }

    public final void a()
    {
        File afile[] = e.listFiles(ac.a());
        i.set(System.currentTimeMillis());
        if (afile != null)
        {
            q.d().execute(new aa(this, afile));
        }
    }

    public final OutputStream b(String s)
    {
        Object obj;
        obj = ac.b(e);
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
            ak.a(am.d, 5, a, (new StringBuilder("Error creating buffer output stream: ")).append(s).toString());
            throw new IOException(s.getMessage());
        }
        obj = new BufferedOutputStream(new af(((OutputStream) (obj1)), new z(this, System.currentTimeMillis(), ((File) (obj)), s)), 8192);
        obj1 = new JSONObject();
        ((JSONObject) (obj1)).put("key", s);
        if (!aw.a(null))
        {
            ((JSONObject) (obj1)).put("tag", null);
        }
        s = ((JSONObject) (obj1)).toString().getBytes();
        ((OutputStream) (obj)).write(0);
        ((OutputStream) (obj)).write(s.length >> 16 & 0xff);
        ((OutputStream) (obj)).write(s.length >> 8 & 0xff);
        ((OutputStream) (obj)).write(s.length >> 0 & 0xff);
        ((OutputStream) (obj)).write(s);
        return ((OutputStream) (obj));
        s;
        ak.a(am.d, 5, a, (new StringBuilder("Error creating JSON header for cache file: ")).append(s).toString());
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
