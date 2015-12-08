// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.d.b.b;
import com.appboy.f;
import com.appboy.f.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONObject;

// Referenced classes of package a.a:
//            e, bn, bi, cc, 
//            ba, dh, cd, ck, 
//            du, bs

public final class c
    implements e
{

    private static final String b;
    final ConcurrentHashMap a = new ConcurrentHashMap();
    private final ba c;
    private final dh d;
    private final LinkedBlockingQueue e = new LinkedBlockingQueue(1000);

    public c(dh dh1, ba ba1)
    {
        d = dh1;
        c = ba1;
    }

    private ck b(ck ck1)
    {
        this;
        JVM INSTR monitorenter ;
        if (ck1 != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return ((ck) (obj));
_L2:
        ArrayList arraylist;
        obj = a.values();
        arraylist = new ArrayList();
        bn bn1;
        for (Iterator iterator = ((Collection) (obj)).iterator(); iterator.hasNext(); ((Collection) (obj)).remove(bn1))
        {
            bn1 = (bn)iterator.next();
            bi bi1 = bn1.f();
            bi1.c().toString();
            arraylist.add(bi1);
        }

        break MISSING_BLOCK_LABEL_100;
        ck1;
        throw ck1;
        ck1.a(new cc(arraylist, c.b(), (cd)d.b()));
        obj = ck1;
        if (c.c() == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ck1.a(c.c().b());
        obj = ck1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(bn bn1)
    {
        a.a.du.a(bn1);
        a.putIfAbsent(bn1.d.toString(), bn1);
    }

    public final void a(ck ck1)
    {
        a.a.du.a(ck1);
        com.appboy.f.a.b(b, String.format("Adding request to dispatcher with parameters: %s", new Object[] {
            String.valueOf(ck1.c())
        }));
        e.add(ck1);
    }

    public final boolean a()
    {
        return !e.isEmpty();
    }

    public final ck b()
    {
        return b((ck)e.take());
    }

    static 
    {
        b = String.format("%s.%s", new Object[] {
            f.a, a/a/c.getName()
        });
    }
}
