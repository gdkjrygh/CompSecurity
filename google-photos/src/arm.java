// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.locks.Lock;

public final class arm
    implements ard
{

    private static arm a = null;
    private final arv b = new arv();
    private final File c;
    private final int d;
    private final arh e = new arh();
    private amm f;

    private arm(File file, int i)
    {
        c = file;
        d = i;
    }

    private amm a()
    {
        this;
        JVM INSTR monitorenter ;
        amm amm1;
        if (f == null)
        {
            f = amm.a(c, 1, 1, d);
        }
        amm1 = f;
        this;
        JVM INSTR monitorexit ;
        return amm1;
        Exception exception;
        exception;
        throw exception;
    }

    public static ard a(File file, int i)
    {
        arm;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new arm(file, i);
        }
        file = a;
        arm;
        JVM INSTR monitorexit ;
        return file;
        file;
        throw file;
    }

    public final File a(ane ane)
    {
        Object obj;
        Object obj1;
        obj1 = b.a(ane);
        if (Log.isLoggable("DiskLruCacheWrapper", 2))
        {
            ane = String.valueOf(ane);
            (new StringBuilder(String.valueOf(obj1).length() + 29 + String.valueOf(ane).length())).append("Get: Obtained: ").append(((String) (obj1))).append(" for for Key: ").append(ane);
        }
        obj = null;
        obj1 = a().a(((String) (obj1)));
        ane = obj;
        if (obj1 != null)
        {
            try
            {
                ane = ((amq) (obj1)).a[0];
            }
            catch (IOException ioexception)
            {
                ane = obj;
                if (Log.isLoggable("DiskLruCacheWrapper", 5))
                {
                    Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", ioexception);
                    return null;
                }
            }
        }
        return ane;
    }

    public final void a(ane ane, arf arf1)
    {
        Object obj2 = e;
        obj2;
        JVM INSTR monitorenter ;
        Object obj1 = (ari)((arh) (obj2)).a.get(ane);
        Object obj;
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        obj = ((arh) (obj2)).b.a();
        ((arh) (obj2)).a.put(ane, obj);
        obj.b = ((ari) (obj)).b + 1;
        obj2;
        JVM INSTR monitorexit ;
        ((ari) (obj)).a.lock();
        obj = b.a(ane);
        if (Log.isLoggable("DiskLruCacheWrapper", 2))
        {
            obj1 = String.valueOf(ane);
            (new StringBuilder(String.valueOf(obj).length() + 29 + String.valueOf(obj1).length())).append("Put: Obtained: ").append(((String) (obj))).append(" for for Key: ").append(((String) (obj1)));
        }
        obj1 = a();
        obj2 = ((amm) (obj1)).a(((String) (obj)));
        if (obj2 != null)
        {
            e.a(ane);
            return;
        }
        break MISSING_BLOCK_LABEL_181;
        ane;
        obj2;
        JVM INSTR monitorexit ;
        throw ane;
        obj1 = ((amm) (obj1)).a(((String) (obj)), -1L);
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        arf1 = String.valueOf(obj);
        if (arf1.length() == 0) goto _L4; else goto _L3
_L3:
        arf1 = "Had two simultaneous puts for: ".concat(arf1);
_L5:
        throw new IllegalStateException(arf1);
        arf1;
        if (Log.isLoggable("DiskLruCacheWrapper", 5))
        {
            Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", arf1);
        }
_L6:
        e.a(ane);
        return;
_L4:
        arf1 = new String("Had two simultaneous puts for: ");
          goto _L5
        arf1;
        e.a(ane);
        throw arf1;
_L2:
        if (arf1.a(((amo) (obj1)).a(0)))
        {
            amm.a(((amo) (obj1)).d, ((amo) (obj1)), true);
            obj1.c = true;
        }
        ((amo) (obj1)).b();
          goto _L6
        arf1;
        ((amo) (obj1)).b();
        throw arf1;
          goto _L5
    }

}
