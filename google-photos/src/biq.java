// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.renderscript.RenderScript;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

final class biq
    implements Runnable
{

    private bip a;

    biq(bip bip1)
    {
        a = bip1;
        super();
    }

    public final void run()
    {
        Object obj;
        bip.a(a).a();
        obj = bip.b(a);
        ajt ajt1 = ((ajr) (obj)).e;
        ajt1;
        JVM INSTR monitorenter ;
        if (((ajr) (obj)).e.a == 3)
        {
            break MISSING_BLOCK_LABEL_395;
        }
        if (((ajr) (obj)).d != null)
        {
            ((ajr) (obj)).d.b.a(3, true);
            ((ajr) (obj)).d.b.a(7, true);
        }
        if (android.os.Build.VERSION.SDK_INT >= 11 && ((ajr) (obj)).i != null)
        {
            ((ajr) (obj)).i.destroy();
            obj.i = null;
        }
        Object obj1 = ((ajr) (obj)).c;
        obj1;
        JVM INSTR monitorenter ;
        for (Iterator iterator2 = ((ajr) (obj)).c.iterator(); iterator2.hasNext(); ((aiw)iterator2.next()).c()) { }
        break MISSING_BLOCK_LABEL_151;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        ajt1;
        JVM INSTR monitorexit ;
        throw obj;
        for (Iterator iterator3 = ((ajr) (obj)).c.iterator(); iterator3.hasNext(); ((aiw)iterator3.next()).g.a(aiw.a)) { }
        obj1;
        JVM INSTR monitorexit ;
        for (obj1 = ((ajr) (obj)).c.iterator(); ((Iterator) (obj1)).hasNext(); ((aiw)((Iterator) (obj1)).next()).b()) { }
        HashSet hashset = new HashSet();
        obj1 = ((ajr) (obj)).b;
        obj1;
        JVM INSTR monitorenter ;
        Iterator iterator4 = ((ajr) (obj)).b.iterator();
_L2:
        ahq ahq1;
        if (!iterator4.hasNext())
        {
            break MISSING_BLOCK_LABEL_319;
        }
        ahq1 = (ahq)iterator4.next();
        boolean flag;
        if (ahq1.g != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        hashset.add(ahq1);
          goto _L2
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        obj1;
        JVM INSTR monitorexit ;
        for (Iterator iterator = hashset.iterator(); iterator.hasNext(); ((ahq)iterator.next()).a()) { }
        for (Iterator iterator1 = ((ajr) (obj)).c.iterator(); iterator1.hasNext(); ((aiw)iterator1.next()).h()) { }
        ((ajr) (obj)).e.a = 3;
        ajt1;
        JVM INSTR monitorexit ;
    }
}
