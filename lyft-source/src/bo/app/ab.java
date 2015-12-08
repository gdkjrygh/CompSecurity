// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.Constants;
import com.appboy.models.outgoing.Environment;
import com.appboy.support.AppboyLogger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            ad, cs, cn, dg, 
//            cf, eo, dh, ds, 
//            ff, cx, cd

public final class ab
    implements ad
{

    private static final String c;
    final ConcurrentHashMap a = new ConcurrentHashMap();
    public cd b;
    private final cf d;
    private final eo e;
    private final LinkedBlockingQueue f = new LinkedBlockingQueue(1000);

    public ab(eo eo1, cf cf1)
    {
        e = eo1;
        d = cf1;
    }

    private ds b(ds ds1)
    {
        this;
        JVM INSTR monitorenter ;
        if (ds1 != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return ((ds) (obj));
_L2:
        ArrayList arraylist;
        obj = c;
        obj = a.values();
        arraylist = new ArrayList();
        cs cs1;
        for (Iterator iterator = ((Collection) (obj)).iterator(); iterator.hasNext(); ((Collection) (obj)).remove(cs1))
        {
            cs1 = (cs)iterator.next();
            cn cn1 = cs1.f();
            String s = c;
            cn1.b().toString();
            arraylist.add(cn1);
        }

        break MISSING_BLOCK_LABEL_109;
        ds1;
        throw ds1;
        ds1.a(new dg(arraylist, d.b(), (dh)e.b()));
        obj = ds1;
        if (d.c() == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ds1.a(d.c().dispatch());
        obj = ds1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(cs cs1)
    {
        ff.a(cs1);
        a.putIfAbsent(cs1.d.toString(), cs1);
    }

    public final void a(ds ds1)
    {
        ff.a(ds1);
        AppboyLogger.i(c, String.format("Adding request to dispatcher with parameters: %s", new Object[] {
            String.valueOf(ds1.c())
        }));
        f.add(ds1);
    }

    public final boolean a()
    {
        return !f.isEmpty();
    }

    public final ds b()
    {
        ds ds1 = (ds)f.take();
        String s;
        try
        {
            if (b != null)
            {
                b.b();
            }
        }
        catch (Exception exception)
        {
            s = c;
        }
        return b(ds1);
    }

    static 
    {
        c = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/ab.getName()
        });
    }
}
