// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public final class deo
{

    public boolean a;
    private final String b;
    private final ArrayList c = new ArrayList();
    private final ArrayList d = new ArrayList();
    private final Map e = new TreeMap();
    private final boolean f;
    private String g;
    private int h;

    public deo(String s)
    {
        b = s;
        boolean flag;
        if (!Log.isLoggable(b, 2))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
    }

    private void a(String s, List list)
    {
        int i = list.size();
        double d1 = ddl.a(list);
        long l = ((Long)Collections.max(list)).longValue();
        double d2 = ddl.a(list, d1);
        String.format("%s: recordings = %d, mean = %.2f ms, max = %.2f ms, standard deviation = %.2f ms", new Object[] {
            s, Integer.valueOf(i), Double.valueOf(d1 / 1000000D), Double.valueOf((double)l / 1000000D), Double.valueOf(d2 / 1000000D)
        });
    }

    public final void a()
    {
        if (!f)
        {
            Iterator iterator = e.keySet().iterator();
            while (iterator.hasNext()) 
            {
                String s = (String)iterator.next();
                dep dep1 = (dep)e.get(s);
                String s1;
                for (Iterator iterator1 = dep1.a.keySet().iterator(); iterator1.hasNext(); a(s1, (List)dep1.a.get(s1)))
                {
                    s1 = (String)iterator1.next();
                }

                a(s, dep1.b);
            }
        }
    }

    public final void a(String s)
    {
        if (f)
        {
            return;
        } else
        {
            c.clear();
            d.clear();
            g = s;
            b(null);
            h = 0;
            a = true;
            return;
        }
    }

    public final void a(boolean flag)
    {
        if (!f)
        {
            long l = SystemClock.elapsedRealtimeNanos();
            long l1 = ((Long)c.get(0)).longValue();
            if (!e.containsKey(g))
            {
                e.put(g, new dep());
            }
            dep dep1 = (dep)e.get(g);
            for (int i = 1; i < c.size(); i++)
            {
                long l2 = ((Long)c.get(i)).longValue();
                String s = (String)d.get(i);
                long l3 = ((Long)c.get(i - 1)).longValue();
                Map map = dep1.a;
                l2 -= l3;
                if (!map.containsKey(s))
                {
                    map.put(s, new ArrayList());
                }
                ((List)map.get(s)).add(Long.valueOf(l2));
                if (flag)
                {
                    String.format("%s : %.2f ms", new Object[] {
                        s, Double.valueOf((double)l2 / 1000000D)
                    });
                }
            }

            l -= l1;
            dep1.b.add(Long.valueOf(l));
            if (flag)
            {
                String.format("%s total: %.2f ms", new Object[] {
                    g, Double.valueOf((double)l / 1000000D)
                });
                return;
            }
        }
    }

    public final void b(String s)
    {
        if (f)
        {
            return;
        } else
        {
            long l = SystemClock.elapsedRealtimeNanos();
            c.add(Long.valueOf(l));
            ArrayList arraylist = d;
            int i = h;
            h = i + 1;
            arraylist.add(String.format("%d. %s : %s", new Object[] {
                Integer.valueOf(i), g, s
            }));
            return;
        }
    }
}
