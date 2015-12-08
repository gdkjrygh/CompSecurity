// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer;

import com.fitbit.data.domain.PedometerMinuteData;
import com.fitbit.e.a;
import com.fitbit.savedstate.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.pedometer:
//            j, k

public class f
{

    public static final String a = "PedometerDataCollector";
    private k.a b;
    private List c;
    private boolean d;
    private long e;
    private long f;

    public f(boolean flag)
    {
        b = new k.a();
        c = new ArrayList();
        e = s.i();
        f = 0L;
        c = s.d();
        d = flag;
    }

    public List a()
    {
        return c;
    }

    public List a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist1;
        com.fitbit.e.a.a("PedometerDataCollector", "=====>\nProcessing collected data...", new Object[0]);
        arraylist1 = new ArrayList();
        if (c.size() <= 1) goto _L2; else goto _L1
_L1:
        long l = ((j)c.get(0)).a();
        if (com.fitbit.pedometer.k.a(l, f)) goto _L4; else goto _L3
_L3:
        Object obj = new ArrayList();
        int i = 0;
_L10:
        if (i >= c.size() - 1) goto _L6; else goto _L5
_L5:
        j j1 = (j)c.get(i);
        j j2 = (j)c.get(i + 1);
        long l1 = j1.a();
        long l3 = j2.a();
        ((ArrayList) (obj)).add(j1);
        if (!com.fitbit.pedometer.k.a(l1, l3))
        {
            arraylist1.add(b.a(((List) (obj)), d));
            obj = new ArrayList();
        }
          goto _L7
_L6:
        long l2;
        ((ArrayList) (obj)).add(c.get(c.size() - 1));
        l2 = ((j)c.get(c.size() - 1)).a();
        ArrayList arraylist = ((ArrayList) (obj));
        if (com.fitbit.pedometer.k.a(f, l2))
        {
            break MISSING_BLOCK_LABEL_282;
        }
        arraylist = ((ArrayList) (obj));
        if (flag)
        {
            break MISSING_BLOCK_LABEL_282;
        }
        arraylist1.add(b.a(((List) (obj)), d));
        arraylist = new ArrayList();
        if (!com.fitbit.pedometer.k.a(l, f))
        {
            c = arraylist;
        }
_L4:
        if (!flag) goto _L2; else goto _L8
_L8:
        arraylist1.add(b.a(c, d));
        c = new ArrayList();
_L2:
        s.a(c);
        if (!arraylist1.isEmpty())
        {
            e = ((PedometerMinuteData)arraylist1.get(arraylist1.size() - 1)).a();
            s.a(e);
        }
        obj = arraylist1.iterator();
        i = 0;
        while (((Iterator) (obj)).hasNext()) 
        {
            i = ((PedometerMinuteData)((Iterator) (obj)).next()).b() + i;
        }
        com.fitbit.e.a.a("PedometerDataCollector", String.format("Remaining units [%d]\n Collected minutes [%d] => [%d] steps\n<=====", new Object[] {
            Integer.valueOf(c.size()), Integer.valueOf(arraylist1.size()), Integer.valueOf(i)
        }), new Object[0]);
        PedometerMinuteData pedometerminutedata;
        for (Iterator iterator = arraylist1.iterator(); iterator.hasNext(); com.fitbit.e.a.a("PedometerDataCollector", String.format("steps=%d, mets=%f, mode=%s metsFromUnits=%s", new Object[] {
    Integer.valueOf(pedometerminutedata.b()), Double.valueOf(pedometerminutedata.c()), pedometerminutedata.d().name(), Boolean.valueOf(d)
}), new Object[0]))
        {
            pedometerminutedata = (PedometerMinuteData)iterator.next();
        }

        break MISSING_BLOCK_LABEL_560;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
        return arraylist1;
_L7:
        i++;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void a(long l)
    {
        f = l;
    }

    public void a(j j1)
    {
        this;
        JVM INSTR monitorenter ;
        c.add(j1);
        this;
        JVM INSTR monitorexit ;
        return;
        j1;
        throw j1;
    }

    public void a(List list)
    {
        this;
        JVM INSTR monitorenter ;
        c.addAll(list);
        this;
        JVM INSTR monitorexit ;
        return;
        list;
        throw list;
    }

    public long b()
    {
        return f;
    }

    public long c()
    {
        return e;
    }
}
