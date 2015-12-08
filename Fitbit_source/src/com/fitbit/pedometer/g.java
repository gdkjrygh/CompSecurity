// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer;

import com.fitbit.data.bl.am;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.p;
import com.fitbit.e.a;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.pedometer:
//            j

public class g
{
    static interface a
    {

        public abstract double a(List list);
    }


    public static final String a = "PedometerLiveDataCollector";
    private List b;
    private int c;
    private double d;
    private Length e;
    private int f;
    private Date g;

    public g()
    {
        b = new ArrayList();
        d();
    }

    private static List a(List list, Date date)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            j j1 = (j)list.next();
            if (date.getTime() <= j1.a())
            {
                arraylist.add(j1);
            }
        } while (true);
        return arraylist;
    }

    private void b(List list)
    {
        ArrayList arraylist = new ArrayList();
        long l1 = ((j)list.get(0)).a();
        long l2 = ((j)list.get(list.size() - 1)).a();
        long l;
        if (b.isEmpty())
        {
            l = 0L;
        } else
        {
            l = ((j)b.get(b.size() - 1)).a();
        }
        if (l < l1)
        {
            arraylist.addAll(b);
            arraylist.addAll(list);
        } else
        {
            Iterator iterator = b.iterator();
            boolean flag = true;
            while (iterator.hasNext()) 
            {
                j j1 = (j)iterator.next();
                if (j1.a() < l1)
                {
                    arraylist.add(j1);
                } else
                if (flag)
                {
                    arraylist.addAll(list);
                    flag = false;
                } else
                if (l2 < j1.a())
                {
                    arraylist.add(j1);
                } else
                {
                    com.fitbit.e.a.a("PedometerLiveDataCollector", "Dropped unit time stamp=%s newUnitsFirstTimeStamp=%s newUnitsLastTimeStamp=%s oldUnitsLastTimeStamp=%s", new Object[] {
                        Long.valueOf(j1.a()), Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l)
                    });
                }
            }
        }
        b = arraylist;
    }

    private void d()
    {
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a("PedometerLiveDataCollector", "---->", new Object[0]);
        Object obj = new Date();
        obj = am.a().b(((Date) (obj)));
        c = ((p) (obj)).getSteps();
        d = ((p) (obj)).getCalories();
        g = ((p) (obj)).getDate();
        e = ((p) (obj)).getDistance();
        com.fitbit.e.a.a("PedometerLiveDataCollector", String.format("Storage steps:[%d] calories:[%f] distance:[%s] timeStamp:[%s]", new Object[] {
            Integer.valueOf(c), Double.valueOf(d), e.toString(), g.toString()
        }), new Object[0]);
        f = 0;
        obj = new Date((g.getTime() + 60000L) - 1L);
        b = a(b, ((Date) (obj)));
        if (b == null || b.isEmpty())
        {
            break MISSING_BLOCK_LABEL_352;
        }
        f = b.size();
        com.fitbit.e.a.a("PedometerLiveDataCollector", String.format("Live steps:[%d] count:[%d] startDate:[%s] endDate:[%s]", new Object[] {
            Integer.valueOf(f), Integer.valueOf(b.size()), (new Date(((j)b.get(0)).a())).toString(), (new Date(((j)b.get(b.size() - 1)).a())).toString()
        }), new Object[0]);
_L1:
        com.fitbit.e.a.a("PedometerLiveDataCollector", String.format("Result steps:[%d] calories:[%f]", new Object[] {
            Integer.valueOf(a()), Double.valueOf(b())
        }), new Object[0]);
        com.fitbit.e.a.a("PedometerLiveDataCollector", "<----", new Object[0]);
        this;
        JVM INSTR monitorexit ;
        return;
        com.fitbit.e.a.a("PedometerLiveDataCollector", String.format("Live count:[0]", new Object[0]), new Object[0]);
          goto _L1
        Exception exception;
        exception;
        com.fitbit.e.a.a("PedometerLiveDataCollector", "<----", new Object[0]);
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int a()
    {
        return c + f;
    }

    public void a(List list)
    {
        this;
        JVM INSTR monitorenter ;
        if (!list.isEmpty())
        {
            b(list);
        }
        d();
        this;
        JVM INSTR monitorexit ;
        return;
        list;
        throw list;
    }

    public double b()
    {
        return d;
    }

    public Length c()
    {
        return e;
    }
}
