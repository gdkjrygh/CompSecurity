// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public final class ajc
    implements Runnable
{

    public ajj a;
    final boolean b;
    LinkedBlockingQueue c;
    public Stack d;
    public ConditionVariable e;
    private ajv f;
    private Exception g;
    private boolean h;
    private Stack i;
    private Set j;
    private Map k;
    private long l;
    private long m;
    private final ajh n = new ajh();
    private aiw o;

    public ajc(aiw aiw1, boolean flag)
    {
        o = aiw1;
        super();
        a = new ajj();
        f = null;
        c = new LinkedBlockingQueue();
        g = null;
        h = true;
        i = new Stack();
        d = new Stack();
        j = new HashSet();
        k = new HashMap();
        e = new ConditionVariable(true);
        b = flag;
    }

    private aiz a()
    {
        aiz aiz1;
        try
        {
            aiz1 = (aiz)c.take();
        }
        catch (InterruptedException interruptedexception)
        {
            Log.w("GraphRunner", "Event queue processing was interrupted.");
            return null;
        }
        return aiz1;
    }

    private void a(String s, ajb ajb1, ajb ajb2)
    {
        String.format("%dms %.4f%% real, %dms %.4f%% thread (%.4f%%) (x%d) - %s", new Object[] {
            Long.valueOf(ajb1.b), Float.valueOf(((float)ajb1.b * 100F) / (float)ajb2.b), Long.valueOf(ajb1.a), Float.valueOf(((float)ajb1.a * 100F) / (float)ajb2.a), Float.valueOf(((float)ajb1.a * 100F) / (float)ajb1.b), Integer.valueOf(ajb1.c), s
        });
        aiw.j();
    }

    private void b()
    {
        aiw.a(o).b();
        if (f != null)
        {
            f.f();
            f = null;
        }
    }

    private void b(ahq ahq1)
    {
        if (a.a() == 1)
        {
            for (Iterator iterator = ahq1.e.iterator(); iterator.hasNext(); b((ahq)iterator.next())) { }
            ahq1 = ahq1.c;
            int j1 = ahq1.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                ahq1[i1].s();
            }

        }
    }

    private void c()
    {
        if (a.b(4))
        {
            if (o.e())
            {
                long l1 = SystemClock.elapsedRealtime() - l;
                long l2 = SystemClock.currentThreadTimeMillis() - m;
                HashMap hashmap = new HashMap();
                ArrayList arraylist1 = new ArrayList();
                ArrayList arraylist = new ArrayList();
                ajb ajb2 = new ajb();
                for (Iterator iterator3 = k.entrySet().iterator(); iterator3.hasNext();)
                {
                    Object obj = (java.util.Map.Entry)iterator3.next();
                    ahn ahn1 = (ahn)((java.util.Map.Entry) (obj)).getKey();
                    ajb ajb3 = (ajb)((java.util.Map.Entry) (obj)).getValue();
                    arraylist1.add(new Pair(ahn1, ajb3));
                    ajb ajb1 = (ajb)hashmap.get(ahn1.getClass());
                    obj = ajb1;
                    if (ajb1 == null)
                    {
                        obj = new ajb();
                        hashmap.put(ahn1.getClass(), obj);
                    }
                    obj.a = ((ajb) (obj)).a + ajb3.a;
                    obj.b = ((ajb) (obj)).b + ajb3.b;
                    obj.c = ((ajb) (obj)).c + ajb3.c;
                    ajb2.a = ajb2.a + ajb3.a;
                    ajb2.b = ajb2.b + ajb3.b;
                    int i1 = ajb2.c;
                    ajb2.c = ajb3.c + i1;
                }

                java.util.Map.Entry entry;
                for (Iterator iterator = hashmap.entrySet().iterator(); iterator.hasNext(); arraylist.add(new Pair(entry.getKey(), entry.getValue())))
                {
                    entry = (java.util.Map.Entry)iterator.next();
                }

                ajd ajd1 = new ajd(this);
                Collections.sort(arraylist1, ajd1);
                Collections.sort(arraylist, ajd1);
                aiw.j();
                String.format("Graph time: %dms real, %dms thread (%.4f%%)", new Object[] {
                    Long.valueOf(l1), Long.valueOf(l2), Float.valueOf(((float)l2 * 100F) / (float)l1)
                });
                aiw.j();
                String.format("Filter totals: %dms real (%.4f%%), %dms thread (%.4f%%)", new Object[] {
                    Long.valueOf(ajb2.b), Float.valueOf(((float)ajb2.b * 100F) / (float)l1), Long.valueOf(ajb2.a), Float.valueOf(((float)ajb2.a * 100F) / (float)l2)
                });
                aiw.j();
                aiw.j();
                Pair pair;
                for (Iterator iterator1 = arraylist1.iterator(); iterator1.hasNext(); a(pair.first.toString(), (ajb)pair.second, ajb2))
                {
                    pair = (Pair)iterator1.next();
                }

                aiw.j();
                Pair pair1;
                for (Iterator iterator2 = arraylist.iterator(); iterator2.hasNext(); a(pair1.first.toString(), (ajb)pair1.second, ajb2))
                {
                    pair1 = (Pair)iterator2.next();
                }

                k.clear();
            }
            if (!a.b(16))
            {
                f();
            }
            d();
        }
    }

    private void c(ahq ahq1)
    {
        if (a.b(4))
        {
            throw new IllegalStateException("Attempting to teardown graph while running!");
        }
        if (ahq1.c != null)
        {
            ahn aahn[] = ahq1.c;
            int j1 = aahn.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                aahn[i1].v();
            }

            synchronized (ahq1.f)
            {
                ahq1.e.clear();
            }
            ajr ajr1 = ahq1.a;
            synchronized (ajr1.b)
            {
                ajr1.b.remove(ahq1);
            }
            ahq1.c = null;
            ahq1.b = null;
            ahq1.g = null;
        }
        aiw.b(o).remove(ahq1);
        return;
        ahq1;
        obj;
        JVM INSTR monitorexit ;
        throw ahq1;
        ahq1;
        obj;
        JVM INSTR monitorexit ;
        throw ahq1;
    }

    private void d()
    {
        a.a(1);
        if (o.g())
        {
            e();
        }
        aiw.c(o).i();
        j.clear();
        i.clear();
        aiw.a(o, g, h);
        e.open();
    }

    private void e()
    {
        if (a.b(16) || a.b(1))
        {
            for (Iterator iterator = j.iterator(); iterator.hasNext();)
            {
                Iterator iterator1 = ((ahq)iterator.next()).b.values().iterator();
                while (iterator1.hasNext()) 
                {
                    ahn ahn1 = (ahn)iterator1.next();
                    ajo aajo[] = ahn1.mConnectedInputPortArray;
                    int k1 = aajo.length;
                    for (int i1 = 0; i1 < k1; i1++)
                    {
                        ajo ajo1 = aajo[i1];
                        if (ajo1.e != null)
                        {
                            ajo1.e.a();
                        }
                    }

                    aju aaju[] = ahn1.mConnectedOutputPortArray;
                    k1 = aaju.length;
                    int j1 = 0;
                    while (j1 < k1) 
                    {
                        aju aju1 = aaju[j1];
                        if (aju1.e != null)
                        {
                            aju1.e.a();
                        }
                        j1++;
                    }
                }
            }

        }
    }

    private void f()
    {
        for (Iterator iterator = j.iterator(); iterator.hasNext();)
        {
            ahn aahn[] = ((ahq)iterator.next()).c;
            boolean flag = o.e();
            int i1 = 0;
            while (i1 < aahn.length) 
            {
                if (flag)
                {
                    String s = String.valueOf(aahn[i1]);
                    (new StringBuilder(String.valueOf(s).length() + 16)).append("Closing Filter ").append(s).append("!");
                }
                aahn[i1].u();
                i1++;
            }
        }

    }

    public final void a(int i1, Object obj)
    {
        c.offer(new aiz(i1, obj));
    }

    public void a(ahq ahq1)
    {
        ahn aahn[] = ahq1.c;
        i.push(aahn);
        j.add(ahq1);
        i.push(aiw.c(o).a((ahn[])i.pop()));
        a(aiw.m());
    }

    public final void a(aiz aiz1)
    {
        c.offer(aiz1);
    }

    public final boolean a(int i1)
    {
        return a.b(i1);
    }

    public final void run()
    {
        Object obj;
        boolean flag;
        try
        {
            aiw.l().set(o);
            if (o.e.h)
            {
                f = ajv.a(1, 1);
                f.b();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            g = ((Exception) (obj));
            h = true;
            Log.w("GraphRunner", "exception running graph", ((Throwable) (obj)));
            d();
            b();
            return;
        }
        flag = false;
_L18:
        if (flag) goto _L2; else goto _L1
_L1:
        obj = a();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        ((aiz) (obj)).a;
        JVM INSTR tableswitch 1 14: default 978
    //                   1 132
    //                   2 234
    //                   3 291
    //                   4 640
    //                   5 978
    //                   6 647
    //                   7 660
    //                   8 690
    //                   9 723
    //                   10 756
    //                   11 763
    //                   12 777
    //                   13 866
    //                   14 277;
           goto _L3 _L4 _L5 _L6 _L7 _L3 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L3:
        break MISSING_BLOCK_LABEL_42;
_L4:
        obj = (ahq)((aiz) (obj)).b;
        if (a.a() == 1)
        {
            a.a(2);
            g = null;
            a(((ahq) (obj)));
        }
        break MISSING_BLOCK_LABEL_42;
_L5:
        if (a.a() != 2) goto _L18; else goto _L17
_L17:
        l = SystemClock.elapsedRealtime();
        m = SystemClock.currentThreadTimeMillis();
        a.a(4);
        a(aiw.k());
          goto _L18
_L16:
        ajb ajb1;
        ahn ahn1;
        long l1;
        long l2;
        long l3;
        long l4;
        try
        {
            b((ahq)((aiz) (obj)).b);
        }
        catch (Exception exception)
        {
            if (g == null)
            {
                g = ((Exception) (obj));
                h = true;
                ((Exception) (obj)).printStackTrace();
                a(aiw.i());
            } else
            {
                h = false;
                c.clear();
                d();
            }
        }
          goto _L18
_L6:
        aln.a("GraphRunner.onStep()");
        if (a.a() != 4) goto _L20; else goto _L19
_L19:
        aiw.c(o).a((ahn[])i.peek(), n);
        if (n.b == (long)aiw.n()) goto _L22; else goto _L21
_L21:
        if (n.b != (long)aiw.o()) goto _L24; else goto _L23
_L23:
        i.pop();
        if (!i.empty()) goto _L26; else goto _L25
_L25:
        c();
_L22:
        aln.a();
          goto _L18
_L26:
        obj = (ajk)d.pop();
        if (obj == null) goto _L28; else goto _L27
_L27:
        ((ajk) (obj)).a();
_L28:
        i.push(aiw.c(o).a((ahn[])i.pop()));
        a(aiw.k());
          goto _L22
_L24:
        ahn1 = n.a;
        if (!o.e()) goto _L30; else goto _L29
_L29:
        l2 = SystemClock.elapsedRealtime();
        l1 = SystemClock.currentThreadTimeMillis();
_L39:
        ahn1.t();
        if (!o.e()) goto _L32; else goto _L31
_L31:
        l3 = SystemClock.elapsedRealtime();
        l4 = SystemClock.currentThreadTimeMillis();
        ajb1 = (ajb)k.get(ahn1);
        obj = ajb1;
        if (ajb1 != null) goto _L34; else goto _L33
_L33:
        obj = new ajb();
        k.put(ahn1, obj);
_L34:
        obj.b = (l3 - l2) + ((ajb) (obj)).b;
        obj.a = (l4 - l1) + ((ajb) (obj)).a;
        obj.c = ((ajb) (obj)).c + 1;
_L32:
        a(aiw.k());
          goto _L22
_L20:
        int i1 = a.a();
        Log.w("GraphRunner", (new StringBuilder(35)).append("State is not running! (").append(i1).append(")").toString());
          goto _L22
_L7:
        c();
          goto _L18
_L8:
        a.c(8);
          goto _L18
_L9:
        if (!a.c(16) || !a.b(4)) goto _L18; else goto _L35
_L35:
        f();
          goto _L18
_L10:
        if (!a.d(8) || a.a() != 4) goto _L18; else goto _L36
_L36:
        a(aiw.k());
          goto _L18
_L11:
        if (!a.d(16) || a.a() != 4) goto _L18; else goto _L37
_L37:
        a(aiw.k());
          goto _L18
_L12:
        e();
          goto _L18
_L13:
        c((ahq)((aiz) (obj)).b);
          goto _L18
_L14:
        obj = aiw.b(o);
        obj;
        JVM INSTR monitorenter ;
        if (!aiw.b(o).isEmpty())
        {
            int j1 = aiw.b(o).size();
            throw new IllegalStateException((new StringBuilder(70)).append("Attempting to tear down runner with ").append(j1).append(" graphs still attached!").toString());
        }
          goto _L38
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L38:
        obj;
        JVM INSTR monitorexit ;
        flag = true;
          goto _L18
_L15:
        if (!aiw.b(o).isEmpty())
        {
            int k1 = aiw.b(o).size();
            throw new IllegalStateException((new StringBuilder(68)).append("Attempting to release frames with ").append(k1).append(" graphs still attached!").toString());
        }
        aiw.a(o).b();
          goto _L18
_L2:
        b();
        return;
_L30:
        l2 = 0L;
        l1 = 0L;
          goto _L39
    }
}
