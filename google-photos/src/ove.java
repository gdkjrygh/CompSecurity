// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ove extends ovd
    implements ovr
{

    final out c;
    private final ovq d;
    private final AtomicBoolean e;
    private final List f;
    private final ote g;
    private ovg h;

    public ove(int ai[], ouq ouq1, ovj ovj1, String s, int i)
    {
        super(s, i);
        e = new AtomicBoolean(false);
        f = new CopyOnWriteArrayList();
        int j;
        boolean flag;
        if (ai.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        p.a(ouq1);
        g = ovj1.a;
        d = new ovq(g);
        i = 0;
        j = 0;
        while (i < ai.length) 
        {
            int l = ai[i];
            int k = j;
            if (g.a(l))
            {
                k = j + 1;
            }
            ovg ovg1 = ovj1.a(l);
            if (ovg1.a() != ovi.c)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.b(flag);
            d.a(ovg1);
            i++;
            j = k;
        }
        orw.c(String.format("ExtractorTask(%s) for %d thumbnails (%d keyframes)", new Object[] {
            s, Integer.valueOf(ai.length), Integer.valueOf(j)
        }));
        c = ouq1.a(ai, g);
        h = h();
    }

    public ove(int ai[], ovj ovj1, String s, int i)
    {
        this(ai, ouq.a, ovj1, s, i);
    }

    private ovg h()
    {
        if (!super.b) goto _L2; else goto _L1
_L1:
        ovg ovg1 = null;
_L4:
        return ovg1;
_L2:
label0:
        do
        {
label1:
            {
                if (!c.hasNext())
                {
                    break label1;
                }
                int i = ((Integer)p.a(c.next())).intValue();
                ovg ovg2 = (ovg)p.a(d.a(i));
                ovg1 = ovg2;
                if (ovg2.a() == ovi.a)
                {
                    break label0;
                }
                if (ovg2.a() == ovi.b)
                {
                    Iterator iterator = f.iterator();
                    while (iterator.hasNext()) 
                    {
                        ((ovs)iterator.next()).a(ovg2);
                    }
                }
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return null;
    }

    public final ovg a(long l)
    {
        ovq ovq1 = d;
        ovq1;
        JVM INSTR monitorenter ;
        int i = g.a(l);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        ovg ovg1 = d.a(i);
        if (ovg1 == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        ovg1 = ovg1.d();
        ovq1;
        JVM INSTR monitorexit ;
        return ovg1;
        ovq1;
        JVM INSTR monitorexit ;
        return null;
        Exception exception;
        exception;
        ovq1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final ovg a(long l, boolean flag)
    {
        ovq ovq1 = d;
        ovq1;
        JVM INSTR monitorenter ;
        ovg ovg1 = d.a(l, flag);
        if (ovg1 == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        ovg1 = ovg1.d();
        ovq1;
        JVM INSTR monitorexit ;
        return ovg1;
        ovq1;
        JVM INSTR monitorexit ;
        return null;
        Exception exception;
        exception;
        ovq1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a()
    {
        super.a();
        ovq ovq1 = d;
        ovq1;
        JVM INSTR monitorenter ;
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((ovg)iterator.next()).e()) { }
        break MISSING_BLOCK_LABEL_48;
        Exception exception;
        exception;
        ovq1;
        JVM INSTR monitorexit ;
        throw exception;
        d.a.clear();
        h = null;
        ovq1;
        JVM INSTR monitorexit ;
        f.clear();
        return;
    }

    public final void a(int i, Bitmap bitmap)
    {
        boolean flag;
        if (h != null && h.a == i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        h.a(bitmap);
        for (bitmap = f.iterator(); bitmap.hasNext(); ((ovs)bitmap.next()).a(h)) { }
    }

    public final void a(Exception exception)
    {
        List list = f;
        list;
        JVM INSTR monitorenter ;
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((ovs)iterator.next()).a(exception)) { }
        break MISSING_BLOCK_LABEL_49;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        list;
        JVM INSTR monitorexit ;
    }

    public final void a(ovs ovs1)
    {
        p.a(ovs1);
        boolean flag;
        synchronized (e)
        {
            f.add(ovs1);
            flag = e.get();
        }
        if (flag)
        {
            ovs1.a(this);
        }
        return;
        ovs1;
        atomicboolean;
        JVM INSTR monitorexit ;
        throw ovs1;
    }

    public final boolean a(int i)
    {
        boolean flag = false;
        if (h != null)
        {
            if (h.a == i)
            {
                flag = true;
            }
            return flag;
        } else
        {
            orw.b("Thumbnails are being extracted even though all requests are already completed");
            return false;
        }
    }

    public final int b()
    {
        if (h != null)
        {
            return h.a;
        } else
        {
            return -1;
        }
    }

    public final void b(ovs ovs1)
    {
        f.remove(ovs1);
    }

    public final int c()
    {
        if (h != null && h.a() == ovi.b)
        {
            h = h();
        }
        if (h != null)
        {
            return h.a;
        } else
        {
            return -1;
        }
    }

    public final void d()
    {
        Iterator iterator;
        synchronized (e)
        {
            e.set(true);
            iterator = f.iterator();
        }
        for (; iterator.hasNext(); ((ovs)iterator.next()).a(this)) { }
        break MISSING_BLOCK_LABEL_59;
        exception;
        atomicboolean;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final ovg e()
    {
        ovq ovq1 = d;
        ovq1;
        JVM INSTR monitorenter ;
        Object obj = d.a.firstEntry();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        obj = (ovg)((java.util.Map.Entry) (obj)).getValue();
_L1:
        obj = ((ovg) (obj)).d();
        ovq1;
        JVM INSTR monitorexit ;
        return ((ovg) (obj));
        obj;
        ovq1;
        JVM INSTR monitorexit ;
        throw obj;
        obj = null;
          goto _L1
    }

    public final ovg f()
    {
        ovq ovq1 = d;
        ovq1;
        JVM INSTR monitorenter ;
        Object obj = d.a.lastEntry();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        obj = (ovg)((java.util.Map.Entry) (obj)).getValue();
_L1:
        obj = ((ovg) (obj)).d();
        ovq1;
        JVM INSTR monitorexit ;
        return ((ovg) (obj));
        obj;
        ovq1;
        JVM INSTR monitorexit ;
        throw obj;
        obj = null;
          goto _L1
    }

    public final boolean g()
    {
        return e.get();
    }
}
