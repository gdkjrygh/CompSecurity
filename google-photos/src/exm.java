// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

class exm
{

    private final Context a;
    private final Map b;
    private final Executor c;
    private final noz d;

    exm(Context context)
    {
        this(context, ((Executor) (new arw("date_headers"))));
    }

    private exm(Context context, Executor executor)
    {
        b = Collections.synchronizedMap(new HashMap());
        a = context;
        c = executor;
        d = noz.a(context, "DateHeaderManager", new String[0]);
    }

    private exh a(exn exn1, boolean flag)
    {
        Map map = b;
        map;
        JVM INSTR monitorenter ;
        exh exh1 = (exh)b.get(exn1);
        if (exh1 == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        map;
        JVM INSTR monitorexit ;
        return exh1;
        exh1 = new exh();
        b.put(exn1, exh1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        ekq ekq1 = exn1.a;
        ekw ekw = exn1.b;
        exn1 = Collections.singletonMap(exn1.c, exh1);
        exn1 = new exo(new exq(a, ekq1, ekw, exn1), d);
        c.execute(exn1);
        map;
        JVM INSTR monitorexit ;
        return exh1;
        exn1;
        map;
        JVM INSTR monitorexit ;
        throw exn1;
    }

    private Map b(ekq ekq1, ekw ekw)
    {
        HashMap hashmap = new HashMap();
        eyz aeyz[] = eyz.values();
        int j = aeyz.length;
        for (int i = 0; i < j; i++)
        {
            eyz eyz1 = aeyz[i];
            Object obj = new exn(ekq1, ekw, eyz1);
            obj = (exh)b.get(obj);
            if (obj != null)
            {
                hashmap.put(eyz1, obj);
            }
        }

        return hashmap;
    }

    final exh a(ekq ekq1, ekw ekw, eyz eyz1)
    {
        eyz1 = new exn(ekq1, ekw, eyz1);
        ekw = (exh)b.get(eyz1);
        ekq1 = ekw;
        if (ekw == null)
        {
            ekq1 = a(((exn) (eyz1)), true);
        }
        return ekq1;
    }

    final Runnable a(ekq ekq1, ekw ekw)
    {
        if (!((eyv)((eyw)olm.a(a, eyw)).a(ekq1.a())).a(ekq1, ekw, b(ekq1, ekw).keySet()))
        {
            return gke.b;
        } else
        {
            Map map = b(ekq1, ekw);
            return (new exq(a, ekq1, ekw, map)).a();
        }
    }
}
