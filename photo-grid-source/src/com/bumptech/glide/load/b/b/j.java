// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b.b;

import android.util.Log;
import com.bumptech.glide.a.a;
import com.bumptech.glide.a.c;
import com.bumptech.glide.a.e;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.bumptech.glide.load.b.b:
//            a, e, s, c

public final class j
    implements com.bumptech.glide.load.b.b.a
{

    private static j a = null;
    private final com.bumptech.glide.load.b.b.e b = new com.bumptech.glide.load.b.b.e();
    private final s c = new s();
    private final File d;
    private final int e;
    private a f;

    private j(File file, int i)
    {
        d = file;
        e = i;
    }

    private a a()
    {
        this;
        JVM INSTR monitorenter ;
        a a1;
        if (f == null)
        {
            f = com.bumptech.glide.a.a.a(d, e);
        }
        a1 = f;
        this;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        throw exception;
    }

    public static com.bumptech.glide.load.b.b.a a(File file, int i)
    {
        com/bumptech/glide/load/b/b/j;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new j(file, i);
        }
        file = a;
        com/bumptech/glide/load/b/b/j;
        JVM INSTR monitorexit ;
        return file;
        file;
        throw file;
    }

    public final File a(com.bumptech.glide.load.c c1)
    {
        Object obj;
        c1 = c.a(c1);
        obj = null;
        e e1 = a().a(c1);
        c1 = obj;
        if (e1 != null)
        {
            try
            {
                c1 = e1.a();
            }
            catch (IOException ioexception)
            {
                c1 = obj;
                if (Log.isLoggable("DiskLruCacheWrapper", 5))
                {
                    Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", ioexception);
                    return null;
                }
            }
        }
        return c1;
    }

    public final void a(com.bumptech.glide.load.c c1, com.bumptech.glide.load.b.b.c c2)
    {
        Object obj;
        obj = c.a(c1);
        b.a(c1);
        obj = a().b(((String) (obj)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        if (c2.a(((c) (obj)).a()))
        {
            ((c) (obj)).b();
        }
        ((c) (obj)).d();
        b.b(c1);
        return;
        c2;
        try
        {
            ((c) (obj)).d();
            throw c2;
        }
        // Misplaced declaration of an exception variable
        catch (com.bumptech.glide.load.b.b.c c2) { }
        finally
        {
            b.b(c1);
        }
        if (Log.isLoggable("DiskLruCacheWrapper", 5))
        {
            Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", c2);
        }
        b.b(c1);
        return;
        throw c2;
    }

    public final void b(com.bumptech.glide.load.c c1)
    {
        c1 = c.a(c1);
        a().c(c1);
_L1:
        return;
        c1;
        if (Log.isLoggable("DiskLruCacheWrapper", 5))
        {
            Log.w("DiskLruCacheWrapper", "Unable to delete from disk cache", c1);
            return;
        }
          goto _L1
    }

}
