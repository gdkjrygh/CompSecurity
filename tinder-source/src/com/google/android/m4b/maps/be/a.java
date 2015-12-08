// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.be;

import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.aa.f;
import com.google.android.m4b.maps.al.b;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.k;
import com.google.android.m4b.maps.bs.e;
import com.google.android.m4b.maps.bx.o;
import com.google.android.m4b.maps.y.j;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.google.android.m4b.maps.be:
//            d

public final class com.google.android.m4b.maps.be.a
{
    static final class a extends Thread
    {

        private final int a;
        private final com.google.android.m4b.maps.be.a b;

        public final void run()
        {
            try
            {
                Process.setThreadPriority(o.c() + 1);
            }
            catch (SecurityException securityexception)
            {
                if (ab.a("DiskProtoBufCache", 6))
                {
                    Log.e("DiskProtoBufCache", "Could not set thread priority", securityexception);
                }
            }
            do
            {
                try
                {
                    sleep(a);
                }
                catch (InterruptedException interruptedexception)
                {
                    return;
                }
            } while (!com.google.android.m4b.maps.be.a.a(b));
        }

        a(String s, int j, com.google.android.m4b.maps.be.a a1)
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "CacheCommitter:".concat(s);
            } else
            {
                s = new String("CacheCommitter:");
            }
            super(s);
            a = j;
            b = a1;
            start();
        }
    }

    static final class b
    {

        final String a;
        final com.google.android.m4b.maps.ac.a b;
        final long c;

        b(String s, com.google.android.m4b.maps.ac.a a1, long l)
        {
            a = s;
            b = a1;
            c = l;
        }
    }

    public static final class c
    {

        public final com.google.android.m4b.maps.ac.a a;
        public final long b;

        c(com.google.android.m4b.maps.ac.a a1, long l)
        {
            a = (com.google.android.m4b.maps.ac.a)j.a(a1);
            b = l;
        }
    }


    private static final Locale a = new Locale("");
    private d b;
    private final String c;
    private final k d;
    private final Map e = Collections.synchronizedMap(ax.b());
    private final com.google.android.m4b.maps.ac.b f;
    private final int g = 3000;
    private final long h;
    private a i;

    public com.google.android.m4b.maps.be.a(k k1, String s, com.google.android.m4b.maps.ac.b b1, long l)
    {
        d = k1;
        c = s;
        f = b1;
        h = l;
    }

    private long a(long l)
    {
        if (h == 0L)
        {
            return -1L;
        } else
        {
            return h + l;
        }
    }

    private static List a(List list)
    {
        java.util.ArrayList arraylist;
        ByteArrayOutputStream bytearrayoutputstream;
        DataOutputStream dataoutputstream;
        arraylist = com.google.android.m4b.maps.aa.f.b(list.size());
        bytearrayoutputstream = new ByteArrayOutputStream();
        dataoutputstream = new DataOutputStream(bytearrayoutputstream);
        list = list.iterator();
_L2:
        String s;
        b b1;
        long l;
        if (!list.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        b1 = (b)list.next();
        l = com.google.android.m4b.maps.al.b.a(b1.a);
        s = b1.a;
        dataoutputstream.writeInt(-1);
        dataoutputstream.writeLong(b1.c);
        b1.b.a(dataoutputstream);
        dataoutputstream.flush();
        byte abyte0[] = bytearrayoutputstream.toByteArray();
        bytearrayoutputstream.reset();
        arraylist.add(com.google.android.m4b.maps.be.d.a(l, s, abyte0));
        if (true) goto _L2; else goto _L1
        list;
        if (ab.a("DiskProtoBufCache", 6))
        {
            Log.e("DiskProtoBufCache", "Error writing on the stream", list);
        }
_L1:
        return arraylist;
    }

    static boolean a(com.google.android.m4b.maps.be.a a1)
    {
        return a1.b();
    }

    private boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj1 = e;
        obj1;
        JVM INSTR monitorenter ;
        if (!e.isEmpty()) goto _L2; else goto _L1
_L1:
        i = null;
        boolean flag = true;
_L6:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        Object obj = com.google.android.m4b.maps.aa.f.a(e.values());
        obj1;
        JVM INSTR monitorexit ;
        int j;
        obj1 = a(((List) (obj)));
        SystemClock.uptimeMillis();
        j = ((List) (obj1)).size();
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        b.a(((java.util.Collection) (obj1)));
_L4:
        SystemClock.uptimeMillis();
        obj1 = e;
        obj1;
        JVM INSTR monitorenter ;
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            b b1 = (b)((Iterator) (obj)).next();
            if (b1 == e.get(b1.a))
            {
                e.remove(b1.a);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_191;
        Exception exception;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        obj1;
        if (!ab.a("DiskProtoBufCache", 6)) goto _L4; else goto _L3
_L3:
        Log.e("DiskProtoBufCache", "writeToDisk error: ", ((Throwable) (obj1)));
          goto _L4
        if (!e.isEmpty())
        {
            break MISSING_BLOCK_LABEL_216;
        }
        i = null;
        obj1;
        JVM INSTR monitorexit ;
        flag = true;
        continue; /* Loop/switch isn't completed */
        obj1;
        JVM INSTR monitorexit ;
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final c a(String s)
    {
        if (b == null)
        {
            return null;
        }
        b b1 = (b)e.get(s);
        if (b1 != null)
        {
            return new c(b1.b, a(b1.c));
        }
        long l = com.google.android.m4b.maps.al.b.a(s);
        s = b.a(l, s);
        if (s == null)
        {
            return null;
        }
        s = new DataInputStream(new ByteArrayInputStream(s));
        try
        {
            s.readInt();
            long l1 = s.readLong();
            com.google.android.m4b.maps.ac.a a1 = new com.google.android.m4b.maps.ac.a(f);
            a1.a(s, s.readInt());
            s = new c(a1, a(l1));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (ab.a("DiskProtoBufCache", 6))
            {
                Log.e("DiskProtoBufCache", "Error reading in the disk cache", s);
            }
            return null;
        }
        return s;
    }

    public final void a(String s, com.google.android.m4b.maps.ac.a a1)
    {
        if (b == null)
        {
            return;
        }
        synchronized (e)
        {
            if (e.size() < 128)
            {
                e.put(s, new b(s, a1, k.b()));
            }
            if (i == null)
            {
                i = new a(c, g, this);
            }
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final boolean a()
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        d d1 = b;
        if (d1 != null) goto _L2; else goto _L1
_L1:
        boolean flag = flag1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        b.a(b.a.f, b.a.h);
        e.clear();
        flag = true;
        continue; /* Loop/switch isn't completed */
        Object obj;
        obj;
        flag = flag1;
        if (!ab.a("DiskProtoBufCache", 6))
        {
            continue; /* Loop/switch isn't completed */
        }
        Log.e("DiskProtoBufCache", "Error clearing value in the cache", ((Throwable) (obj)));
        flag = flag1;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        throw obj;
    }

    public final boolean a(File file, e e1)
    {
        com.google.android.m4b.maps.au.a a1;
        long l1;
        a1 = new com.google.android.m4b.maps.au.a(file);
        l1 = SystemClock.uptimeMillis();
        file = com.google.android.m4b.maps.be.d.a(c, a1, null, e1);
_L2:
        long l2 = SystemClock.uptimeMillis();
        b = file;
        if (ab.a("DiskProtoBufCache", 3))
        {
            file = c;
            int j = b.a();
            int l = b.a.f;
            e1 = String.valueOf(b.a.h);
            Log.d("DiskProtoBufCache", (new StringBuilder(String.valueOf(file).length() + 100 + String.valueOf(e1).length())).append("Loaded cache: ").append(file).append(" with ").append(j).append(" entries, data version: ").append(l).append(", locale: ").append(e1).append(", ").append(l2 - l1).append("ms").toString());
        }
        return true;
        file;
        try
        {
            file = com.google.android.m4b.maps.be.d.a(c, 4090, -1, a, a1, null, e1);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            if (ab.a("DiskProtoBufCache", 6))
            {
                Log.e("DiskProtoBufCache", "Error creating the disk cache", file);
            }
            return false;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final boolean a(Locale locale)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        d d1 = b;
        if (d1 != null) goto _L2; else goto _L1
_L1:
        boolean flag = flag1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = b.a.h.equals(locale);
        if (flag)
        {
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
        b.a(b.a.f, locale);
        e.clear();
        flag = true;
        continue; /* Loop/switch isn't completed */
        locale;
        flag = flag1;
        if (!ab.a("DiskProtoBufCache", 6))
        {
            continue; /* Loop/switch isn't completed */
        }
        Log.e("DiskProtoBufCache", "Error clearing value in the cache", locale);
        flag = flag1;
        if (true) goto _L4; else goto _L3
_L3:
        locale;
        throw locale;
    }

}
