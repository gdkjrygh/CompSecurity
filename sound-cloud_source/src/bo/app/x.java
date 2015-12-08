// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.d;
import com.appboy.d.b.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            z, cm, ch, da, 
//            bz, ei, db, dm, 
//            bx, fa, cr

public final class x
    implements z
{

    private static final String c;
    public final LinkedBlockingQueue a = new LinkedBlockingQueue(1000);
    public bx b;
    private final bz d;
    private final ei e;
    private final ConcurrentHashMap f = new ConcurrentHashMap();

    public x(ei ei1, bz bz1)
    {
        e = ei1;
        d = bz1;
    }

    private dm b(dm dm1)
    {
        this;
        JVM INSTR monitorenter ;
        if (dm1 != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return ((dm) (obj));
_L2:
        ArrayList arraylist;
        obj = f.values();
        arraylist = new ArrayList();
        cm cm1;
        for (Iterator iterator = ((Collection) (obj)).iterator(); iterator.hasNext(); ((Collection) (obj)).remove(cm1))
        {
            cm1 = (cm)iterator.next();
            ch ch1 = cm1.f();
            ch1.b().toString();
            arraylist.add(ch1);
        }

        break MISSING_BLOCK_LABEL_100;
        dm1;
        throw dm1;
        dm1.a(new da(arraylist, d.b(), (db)e.b()));
        obj = dm1;
        if (d.c() == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        dm1.a(d.c().b());
        obj = dm1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final dm a()
    {
        dm dm1 = (dm)a.take();
        try
        {
            if (b != null)
            {
                b.b();
            }
        }
        catch (Exception exception) { }
        return b(dm1);
    }

    public final void a(cm cm1)
    {
        fa.a(cm1);
        f.putIfAbsent(cm1.d.toString(), cm1);
    }

    public final void a(dm dm1)
    {
        fa.a(dm1);
        String.format("Adding request to dispatcher with parameters: %s", new Object[] {
            String.valueOf(dm1.c())
        });
        a.add(dm1);
    }

    static 
    {
        c = String.format("%s.%s", new Object[] {
            d.a, bo/app/x.getName()
        });
    }
}
