// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package bo.app:
//            hx, ia, ie

public abstract class hz extends hx
{

    final AtomicInteger b = new AtomicInteger();
    final Map c = Collections.synchronizedMap(new HashMap());
    private final int d;

    public hz(File file, ie ie, int i)
    {
        super(file, ie);
        d = i;
        (new Thread(new ia(this))).start();
    }

    private int a()
    {
        Object obj = null;
        if (!c.isEmpty()) goto _L2; else goto _L1
_L1:
        int i = -1;
_L5:
        return i;
_L2:
        Object obj1 = c.entrySet();
        Map map = c;
        map;
        JVM INSTR monitorenter ;
        Iterator iterator = ((Set) (obj1)).iterator();
        obj1 = null;
_L3:
        java.util.Map.Entry entry;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_139;
        }
        entry = (java.util.Map.Entry)iterator.next();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        obj = (File)entry.getKey();
        obj1 = (Long)entry.getValue();
          goto _L3
        Long long1;
        long1 = (Long)entry.getValue();
        if (long1.longValue() >= ((Long) (obj1)).longValue())
        {
            break MISSING_BLOCK_LABEL_207;
        }
        obj1 = (File)entry.getKey();
        obj = long1;
        break MISSING_BLOCK_LABEL_213;
        map;
        JVM INSTR monitorexit ;
        i = 0;
        if (obj == null) goto _L5; else goto _L4
_L4:
        int j;
        if (!((File) (obj)).exists())
        {
            break MISSING_BLOCK_LABEL_194;
        }
        j = b(((File) (obj)));
        i = j;
        if (!((File) (obj)).delete()) goto _L5; else goto _L6
_L6:
        c.remove(obj);
        return j;
        obj;
        throw obj;
        c.remove(obj);
        return 0;
        Object obj2 = obj;
        obj = obj1;
        obj1 = obj2;
        Object obj3 = obj;
        obj = obj1;
        obj1 = obj3;
          goto _L3
    }

    public final File a(String s)
    {
        s = super.a(s);
        Long long1 = Long.valueOf(System.currentTimeMillis());
        s.setLastModified(long1.longValue());
        c.put(s, long1);
        return s;
    }

    public final void a(File file)
    {
        int j = b(file);
        int i = b.get();
        do
        {
            if (i + j <= d)
            {
                break;
            }
            i = a();
            if (i == -1)
            {
                break;
            }
            i = b.addAndGet(-i);
        } while (true);
        b.addAndGet(j);
        Long long1 = Long.valueOf(System.currentTimeMillis());
        file.setLastModified(long1.longValue());
        c.put(file, long1);
    }

    public abstract int b(File file);
}
