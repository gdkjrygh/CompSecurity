// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

final class akf
    implements Runnable
{

    private ajx a;

    akf(ajx ajx1)
    {
        a = ajx1;
        super();
    }

    public final void run()
    {
        obj1 = a;
_L5:
        Object obj = ((ajx) (obj1)).d;
        obj;
        JVM INSTR monitorenter ;
        long l = ((ajx) (obj1)).f - System.currentTimeMillis();
        if (l > 0L) goto _L2; else goto _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        obj1 = a;
        obj = ((ajx) (obj1)).e;
        obj;
        JVM INSTR monitorenter ;
        synchronized (((ajx) (obj1)).d)
        {
            obj1.f = -1L;
        }
        Iterator iterator;
        obj2 = ((ajx) (obj1)).a.edit();
        iterator = ((ajx) (obj1)).c.iterator();
_L3:
        String s;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_177;
            }
            s = (String)iterator.next();
            if (!((ajx) (obj1)).b.containsKey(s))
            {
                break MISSING_BLOCK_LABEL_165;
            }
            ((android.content.SharedPreferences.Editor) (obj2)).putString(s, (String)((ajx) (obj1)).b.get(s));
        } while (true);
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
_L2:
        try
        {
            ((ajx) (obj1)).d.wait(l);
        }
        catch (InterruptedException interruptedexception) { }
        obj;
        JVM INSTR monitorexit ;
        continue; /* Loop/switch isn't completed */
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        obj2;
        JVM INSTR monitorexit ;
        throw obj1;
        ((android.content.SharedPreferences.Editor) (obj2)).remove(s);
          goto _L3
        ((android.content.SharedPreferences.Editor) (obj2)).commit();
        ((ajx) (obj1)).c.clear();
        obj;
        JVM INSTR monitorexit ;
        return;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
