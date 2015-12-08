// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class lang.Object
    implements lang.Object
{

    private qk a;

    private void b()
    {
        synchronized (qk.c(a))
        {
            qk.d(a);
            if (qk.e(a))
            {
                qk.f(a);
                a.d();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a()
    {
        b();
    }

    public final void a(Map map)
    {
        Map map1 = qk.b(a);
        map1;
        JVM INSTR monitorenter ;
        Timber.c("SnapStateStore", (new StringBuilder("Successfully flushed ")).append(map.size()).append(" snap state records to server").toString(), new Object[0]);
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            java.util.ntry ntry = (java.util.ntry)map.next();
            if (((SD)ntry.getValue()).equals(qk.b(a).get(ntry.getKey())))
            {
                qk.b(a).remove(ntry.getKey());
            }
        } while (true);
        break MISSING_BLOCK_LABEL_136;
        map;
        map1;
        JVM INSTR monitorexit ;
        throw map;
        map1;
        JVM INSTR monitorexit ;
        b();
        return;
    }

    >(qk qk1)
    {
        a = qk1;
        super();
    }
}
