// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

// Referenced classes of package com.mopub.common:
//            g, DiskLruCache, f, DiskLruCacheUtil

public final class <init>
{

    final DiskLruCache a;
    private final g b;
    private final boolean c[];
    private boolean d;
    private boolean e;

    static g a(<init> <init>1)
    {
        return <init>1.b;
    }

    static boolean[] b(b b1)
    {
        return b1.c;
    }

    static boolean c(c c1)
    {
        c1.d = true;
        return true;
    }

    public final void abort()
    {
        DiskLruCache.a(a, this, false);
    }

    public final void abortUnlessCommitted()
    {
        if (e)
        {
            break MISSING_BLOCK_LABEL_11;
        }
        abort();
        return;
        IOException ioexception;
        ioexception;
    }

    public final void commit()
    {
        if (d)
        {
            DiskLruCache.a(a, this, false);
            a.remove(g.d(b));
        } else
        {
            DiskLruCache.a(a, this, true);
        }
        e = true;
    }

    public final String getString(int i)
    {
        InputStream inputstream = newInputStream(i);
        if (inputstream != null)
        {
            return DiskLruCache.a(inputstream);
        } else
        {
            return null;
        }
    }

    public final InputStream newInputStream(int i)
    {
        DiskLruCache disklrucache = a;
        disklrucache;
        JVM INSTR monitorenter ;
        if (g.b(b) != this)
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_31;
        Object obj;
        obj;
        disklrucache;
        JVM INSTR monitorexit ;
        throw obj;
        if (g.e(b))
        {
            break MISSING_BLOCK_LABEL_45;
        }
        disklrucache;
        JVM INSTR monitorexit ;
        return null;
        FileInputStream fileinputstream = new FileInputStream(b.getCleanFile(i));
        disklrucache;
        JVM INSTR monitorexit ;
        return fileinputstream;
        fileinputstream;
        disklrucache;
        JVM INSTR monitorexit ;
        return null;
    }

    public final OutputStream newOutputStream(int i)
    {
        DiskLruCache disklrucache = a;
        disklrucache;
        JVM INSTR monitorenter ;
        if (g.b(b) != this)
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_31;
        Object obj;
        obj;
        disklrucache;
        JVM INSTR monitorexit ;
        throw obj;
        File file;
        if (!g.e(b))
        {
            c[i] = true;
        }
        file = b.getDirtyFile(i);
        Object obj1 = new FileOutputStream(file);
_L1:
        obj1 = new f(this, ((OutputStream) (obj1)), (byte)0);
        disklrucache;
        JVM INSTR monitorexit ;
        return ((OutputStream) (obj1));
        obj1;
        DiskLruCache.g(a).mkdirs();
        obj1 = new FileOutputStream(file);
          goto _L1
        obj1;
        obj1 = DiskLruCache.a();
        disklrucache;
        JVM INSTR monitorexit ;
        return ((OutputStream) (obj1));
    }

    public final void set(int i, String s)
    {
        OutputStreamWriter outputstreamwriter = new OutputStreamWriter(newOutputStream(i), DiskLruCacheUtil.b);
        outputstreamwriter.write(s);
        DiskLruCacheUtil.a(outputstreamwriter);
        return;
        s;
        outputstreamwriter = null;
_L2:
        DiskLruCacheUtil.a(outputstreamwriter);
        throw s;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private (DiskLruCache disklrucache, g g1)
    {
        a = disklrucache;
        super();
        b = g1;
        if (g.e(g1))
        {
            disklrucache = null;
        } else
        {
            disklrucache = new boolean[DiskLruCache.f(disklrucache)];
        }
        c = disklrucache;
    }

    c(DiskLruCache disklrucache, g g1, byte byte0)
    {
        this(disklrucache, g1);
    }
}
