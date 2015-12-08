// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.e.b;
import com.bumptech.glide.g.d;
import com.bumptech.glide.i;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.resource.e.c;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.bumptech.glide.load.engine:
//            b, f, j

class com.bumptech.glide.load.engine.a
{
    static interface a
    {

        public abstract com.bumptech.glide.load.engine.b.a a();
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
        implements com.bumptech.glide.load.engine.b.b
    {

        final com.bumptech.glide.load.engine.a a;
        private final com.bumptech.glide.load.b b;
        private final Object c;

        public boolean a(File file)
        {
            File file1;
            File file2;
            boolean flag1;
            flag1 = false;
            file2 = null;
            file1 = null;
            file = com.bumptech.glide.load.engine.a.a(a).a(file);
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

        public c(com.bumptech.glide.load.b b1, Object obj)
        {
            a = com.bumptech.glide.load.engine.a.this;
            super();
            b = b1;
            c = obj;
        }
    }


    private static final b a = new b();
    private final f b;
    private final int c;
    private final int d;
    private final com.bumptech.glide.load.a.c e;
    private final com.bumptech.glide.e.b f;
    private final g g;
    private final com.bumptech.glide.load.resource.e.c h;
    private final a i;
    private final com.bumptech.glide.load.engine.b j;
    private final i k;
    private final b l;
    private volatile boolean m;

    public com.bumptech.glide.load.engine.a(f f1, int i1, int j1, com.bumptech.glide.load.a.c c1, com.bumptech.glide.e.b b1, g g1, com.bumptech.glide.load.resource.e.c c2, 
            a a1, com.bumptech.glide.load.engine.b b2, i k1)
    {
        this(f1, i1, j1, c1, b1, g1, c2, a1, b2, k1, a);
    }

    com.bumptech.glide.load.engine.a(f f1, int i1, int j1, com.bumptech.glide.load.a.c c1, com.bumptech.glide.e.b b1, g g1, com.bumptech.glide.load.resource.e.c c2, 
            a a1, com.bumptech.glide.load.engine.b b2, i k1, b b3)
    {
        b = f1;
        c = i1;
        d = j1;
        e = c1;
        f = b1;
        g = g1;
        h = c2;
        i = a1;
        j = b2;
        k = k1;
        l = b3;
    }

    static b a(com.bumptech.glide.load.engine.a a1)
    {
        return a1.l;
    }

    private j a(com.bumptech.glide.load.c c1)
        throws IOException
    {
        j j1;
        Object obj;
        j1 = null;
        obj = i.a().a(c1);
        if (obj != null) goto _L2; else goto _L1
_L1:
        return j1;
_L2:
        obj = f.a().a(obj, c, d);
        j1 = ((j) (obj));
        if (obj != null) goto _L1; else goto _L3
_L3:
        i.a().b(c1);
        return ((j) (obj));
        Exception exception;
        exception;
        if (true)
        {
            i.a().b(c1);
        }
        throw exception;
    }

    private j a(j j1)
    {
        long l1 = com.bumptech.glide.g.d.a();
        j1 = c(j1);
        if (Log.isLoggable("DecodeJob", 2))
        {
            a("Transformed resource from source", l1);
        }
        b(j1);
        l1 = com.bumptech.glide.g.d.a();
        j1 = d(j1);
        if (Log.isLoggable("DecodeJob", 2))
        {
            a("Transcoded transformed from source", l1);
        }
        return j1;
    }

    private j a(Object obj)
        throws IOException
    {
        if (j.a())
        {
            obj = b(obj);
        } else
        {
            long l1 = com.bumptech.glide.g.d.a();
            j j1 = f.b().a(obj, c, d);
            obj = j1;
            if (Log.isLoggable("DecodeJob", 2))
            {
                a("Decoded from source", l1);
                return j1;
            }
        }
        return ((j) (obj));
    }

    private void a(String s, long l1)
    {
        Log.v("DecodeJob", (new StringBuilder()).append(s).append(" in ").append(com.bumptech.glide.g.d.a(l1)).append(", key: ").append(b).toString());
    }

    private j b(Object obj)
        throws IOException
    {
        long l1 = com.bumptech.glide.g.d.a();
        obj = new c(f.c(), obj);
        i.a().a(b.a(), ((com.bumptech.glide.load.engine.b.b) (obj)));
        if (Log.isLoggable("DecodeJob", 2))
        {
            a("Wrote source to cache", l1);
        }
        l1 = com.bumptech.glide.g.d.a();
        obj = a(b.a());
        if (Log.isLoggable("DecodeJob", 2) && obj != null)
        {
            a("Decoded source from cache", l1);
        }
        return ((j) (obj));
    }

    private void b(j j1)
    {
        if (j1 != null && j.b())
        {
            long l1 = com.bumptech.glide.g.d.a();
            j1 = new c(f.d(), j1);
            i.a().a(b, j1);
            if (Log.isLoggable("DecodeJob", 2))
            {
                a("Wrote transformed from source to cache", l1);
                return;
            }
        }
    }

    private j c(j j1)
    {
        j j2;
        if (j1 == null)
        {
            j2 = null;
        } else
        {
            j j3 = g.a(j1, c, d);
            j2 = j3;
            if (!j1.equals(j3))
            {
                j1.d();
                return j3;
            }
        }
        return j2;
    }

    private j d(j j1)
    {
        if (j1 == null)
        {
            return null;
        } else
        {
            return h.a(j1);
        }
    }

    private j e()
        throws Exception
    {
        Object obj;
        boolean flag;
        long l1 = com.bumptech.glide.g.d.a();
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
        return ((j) (obj));
        Exception exception;
        exception;
        e.a();
        throw exception;
    }

    public j a()
        throws Exception
    {
        j j1;
        if (!j.b())
        {
            j1 = null;
        } else
        {
            long l1 = com.bumptech.glide.g.d.a();
            j1 = a(((com.bumptech.glide.load.c) (b)));
            if (Log.isLoggable("DecodeJob", 2))
            {
                a("Decoded transformed from cache", l1);
            }
            l1 = com.bumptech.glide.g.d.a();
            j j2 = d(j1);
            j1 = j2;
            if (Log.isLoggable("DecodeJob", 2))
            {
                a("Transcoded transformed from cache", l1);
                return j2;
            }
        }
        return j1;
    }

    public j b()
        throws Exception
    {
        if (!j.a())
        {
            return null;
        }
        long l1 = com.bumptech.glide.g.d.a();
        j j1 = a(b.a());
        if (Log.isLoggable("DecodeJob", 2))
        {
            a("Decoded source from cache", l1);
        }
        return a(j1);
    }

    public j c()
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
