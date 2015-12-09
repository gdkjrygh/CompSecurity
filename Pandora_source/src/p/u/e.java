// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.u;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p.m.a;
import p.q.c;

// Referenced classes of package p.u:
//            a, c, j

public class e
    implements p.u.a
{

    private static e a = null;
    private final p.u.c b = new p.u.c();
    private final j c = new j();
    private final File d;
    private final int e;
    private a f;

    protected e(File file, int i)
    {
        d = file;
        e = i;
    }

    private a a()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        a a1;
        if (f == null)
        {
            f = p.m.a.a(d, 1, 1, e);
        }
        a1 = f;
        this;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        throw exception;
    }

    public static p.u.a a(File file, int i)
    {
        p/u/e;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new e(file, i);
        }
        file = a;
        p/u/e;
        JVM INSTR monitorexit ;
        return file;
        file;
        throw file;
    }

    public File a(c c1)
    {
        Object obj;
        c1 = c.a(c1);
        obj = null;
        p.m.a.c c2 = a().a(c1);
        c1 = obj;
        if (c2 != null)
        {
            try
            {
                c1 = c2.a(0);
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

    public void a(c c1, a.b b1)
    {
        Object obj;
        obj = c.a(c1);
        b.a(c1);
        obj = a().b(((String) (obj)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        if (b1.a(((p.m.a.a) (obj)).a(0)))
        {
            ((p.m.a.a) (obj)).a();
        }
        ((p.m.a.a) (obj)).c();
        b.b(c1);
        return;
        b1;
        try
        {
            ((p.m.a.a) (obj)).c();
            throw b1;
        }
        // Misplaced declaration of an exception variable
        catch (a.b b1) { }
        finally
        {
            b.b(c1);
        }
        if (Log.isLoggable("DiskLruCacheWrapper", 5))
        {
            Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", b1);
        }
        b.b(c1);
        return;
        throw b1;
    }

    public void b(c c1)
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
