// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.s;

import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p.ak.b;
import p.ap.d;
import p.l.i;
import p.q.e;
import p.q.g;
import p.r.c;

// Referenced classes of package p.s:
//            b, f, k

class p.s.a
{
    static interface a
    {

        public abstract p.u.a a();
    }

    static class b
    {

        public OutputStream a(File file)
            throws FileNotFoundException
        {
            return new BufferedOutputStream(new FileOutputStream(file));
        }

        b()
        {
        }
    }

    class c
        implements p.u.b
    {

        final p.s.a a;
        private final p.q.b b;
        private final Object c;

        public boolean a(File file)
        {
            File file1;
            File file2;
            boolean flag1;
            flag1 = false;
            file2 = null;
            file1 = null;
            file = p.s.a.a(a).a(file);
            file1 = file;
            file2 = file;
            boolean flag = b.a(c, file);
            flag1 = flag;
            if (file != null)
            {
                try
                {
                    file.close();
                }
                // Misplaced declaration of an exception variable
                catch (File file)
                {
                    return flag;
                }
                flag1 = flag;
            }
            return flag1;
            file;
            file2 = file1;
            if (!Log.isLoggable("DecodeJob", 3))
            {
                continue; /* Loop/switch isn't completed */
            }
            file2 = file1;
            Log.d("DecodeJob", "Failed to find file to write to disk cache", file);
            if (file1 == null) goto _L2; else goto _L1
_L1:
            break MISSING_BLOCK_LABEL_85;
_L2:
            break MISSING_BLOCK_LABEL_55;
            try
            {
                file1.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                return false;
            }
            return false;
            file;
            if (file2 != null)
            {
                try
                {
                    file2.close();
                }
                catch (IOException ioexception) { }
            }
            throw file;
        }

        public c(p.q.b b1, Object obj)
        {
            a = p.s.a.this;
            super();
            b = b1;
            c = obj;
        }
    }


    private static final b a = new b();
    private final f b;
    private final int c;
    private final int d;
    private final p.r.c e;
    private final p.ak.b f;
    private final g g;
    private final p.ah.d h;
    private final a i;
    private final p.s.b j;
    private final i k;
    private final b l;
    private volatile boolean m;

    public p.s.a(f f1, int i1, int j1, p.r.c c1, p.ak.b b1, g g1, p.ah.d d1, 
            a a1, p.s.b b2, i k1)
    {
        this(f1, i1, j1, c1, b1, g1, d1, a1, b2, k1, a);
    }

    p.s.a(f f1, int i1, int j1, p.r.c c1, p.ak.b b1, g g1, p.ah.d d1, 
            a a1, p.s.b b2, i k1, b b3)
    {
        b = f1;
        c = i1;
        d = j1;
        e = c1;
        f = b1;
        g = g1;
        h = d1;
        i = a1;
        j = b2;
        k = k1;
        l = b3;
    }

    static b a(p.s.a a1)
    {
        return a1.l;
    }

    private k a(Object obj)
        throws IOException
    {
        if (j.a())
        {
            obj = b(obj);
        } else
        {
            long l1 = p.ap.d.a();
            k k1 = f.b().a(obj, c, d);
            obj = k1;
            if (Log.isLoggable("DecodeJob", 2))
            {
                a("Decoded from source", l1);
                return k1;
            }
        }
        return ((k) (obj));
    }

    private k a(p.q.c c1)
        throws IOException
    {
        k k1;
        Object obj;
        k1 = null;
        obj = i.a().a(c1);
        if (obj != null) goto _L2; else goto _L1
_L1:
        return k1;
_L2:
        obj = f.a().a(obj, c, d);
        k1 = ((k) (obj));
        if (obj != null) goto _L1; else goto _L3
_L3:
        i.a().b(c1);
        return ((k) (obj));
        Exception exception;
        exception;
        if (true)
        {
            i.a().b(c1);
        }
        throw exception;
    }

    private k a(k k1)
    {
        long l1 = p.ap.d.a();
        k1 = c(k1);
        if (Log.isLoggable("DecodeJob", 2))
        {
            a("Transformed resource from source", l1);
        }
        b(k1);
        l1 = p.ap.d.a();
        k1 = d(k1);
        if (Log.isLoggable("DecodeJob", 2))
        {
            a("Transcoded transformed from source", l1);
        }
        return k1;
    }

    private void a(String s, long l1)
    {
        Log.v("DecodeJob", (new StringBuilder()).append(s).append(" in ").append(p.ap.d.a(l1)).append(", key: ").append(b).toString());
    }

    private k b(Object obj)
        throws IOException
    {
        long l1 = p.ap.d.a();
        obj = new c(f.c(), obj);
        i.a().a(b.a(), ((p.u.b) (obj)));
        if (Log.isLoggable("DecodeJob", 2))
        {
            a("Wrote source to cache", l1);
        }
        l1 = p.ap.d.a();
        obj = a(b.a());
        if (Log.isLoggable("DecodeJob", 2) && obj != null)
        {
            a("Decoded source from cache", l1);
        }
        return ((k) (obj));
    }

    private void b(k k1)
    {
        if (k1 != null && j.b())
        {
            long l1 = p.ap.d.a();
            k1 = new c(f.d(), k1);
            i.a().a(b, k1);
            if (Log.isLoggable("DecodeJob", 2))
            {
                a("Wrote transformed from source to cache", l1);
                return;
            }
        }
    }

    private k c(k k1)
    {
        k k2;
        if (k1 == null)
        {
            k2 = null;
        } else
        {
            k k3 = g.a(k1, c, d);
            k2 = k3;
            if (!k1.equals(k3))
            {
                k1.d();
                return k3;
            }
        }
        return k2;
    }

    private k d(k k1)
    {
        if (k1 == null)
        {
            return null;
        } else
        {
            return h.a(k1);
        }
    }

    private k e()
        throws Exception
    {
        Object obj;
        boolean flag;
        long l1 = p.ap.d.a();
        obj = e.b(k);
        if (Log.isLoggable("DecodeJob", 2))
        {
            a("Fetched data", l1);
        }
        flag = m;
        if (flag)
        {
            e.a();
            return null;
        }
        obj = a(obj);
        e.a();
        return ((k) (obj));
        Exception exception;
        exception;
        e.a();
        throw exception;
    }

    public k a()
        throws Exception
    {
        k k1;
        if (!j.b())
        {
            k1 = null;
        } else
        {
            long l1 = p.ap.d.a();
            k1 = a(((p.q.c) (b)));
            if (Log.isLoggable("DecodeJob", 2))
            {
                a("Decoded transformed from cache", l1);
            }
            l1 = p.ap.d.a();
            k k2 = d(k1);
            k1 = k2;
            if (Log.isLoggable("DecodeJob", 2))
            {
                a("Transcoded transformed from cache", l1);
                return k2;
            }
        }
        return k1;
    }

    public k b()
        throws Exception
    {
        if (!j.a())
        {
            return null;
        }
        long l1 = p.ap.d.a();
        k k1 = a(b.a());
        if (Log.isLoggable("DecodeJob", 2))
        {
            a("Decoded source from cache", l1);
        }
        return a(k1);
    }

    public k c()
        throws Exception
    {
        return a(e());
    }

    public void d()
    {
        m = true;
        e.c();
    }

}
