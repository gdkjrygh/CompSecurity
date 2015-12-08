// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class ovj
    implements ovr
{

    final ote a;
    final ovq b;
    private final ovk c = new ovk(this);
    private List d;

    public ovj(ote ote1)
    {
        a = (ote)p.a(ote1);
        b = new ovq(ote1);
    }

    public final ovg a(int i)
    {
        ovg ovg1;
        ovq ovq1;
        boolean flag1 = true;
        Exception exception;
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        if (i < a.g.length)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.a(flag);
        ovq1 = b;
        ovq1;
        JVM INSTR monitorenter ;
        ovg1 = b.a(i);
        if (ovg1 != null) goto _L2; else goto _L1
_L1:
        ovg1 = new ovg(c, i);
        if (b.a(ovg1) != null)
        {
            throw new AssertionError("An existing thumbnail was already stored");
        }
        break MISSING_BLOCK_LABEL_110;
        exception;
        ovq1;
        JVM INSTR monitorexit ;
        throw exception;
        Iterator iterator;
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        iterator = d.iterator();
_L4:
        ovq1;
        JVM INSTR monitorexit ;
          goto _L3
_L2:
        ovg1.d();
        iterator = null;
          goto _L4
_L3:
        if (iterator != null)
        {
            for (; iterator.hasNext(); ((ovs)iterator.next()).a(ovg1)) { }
        }
        return ovg1;
        iterator = null;
          goto _L4
    }

    public final ovg a(long l)
    {
        ovq ovq1 = b;
        ovq1;
        JVM INSTR monitorenter ;
        int i = a.a(l);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        ovg ovg1 = b.a(i);
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
        ovq ovq1 = b;
        ovq1;
        JVM INSTR monitorenter ;
        ovg ovg1 = b.a(l, flag);
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
        synchronized (b)
        {
            b.a.clear();
        }
        if (d != null)
        {
            d.clear();
        }
        return;
        exception;
        ovq1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(ovs ovs1)
    {
        if (d == null)
        {
            d = new CopyOnWriteArrayList();
        }
        d.add(ovs1);
    }

    public final int b()
    {
        ovq ovq1 = b;
        ovq1;
        JVM INSTR monitorenter ;
        int i = 0;
        Iterator iterator = b.iterator();
_L1:
        Bitmap bitmap;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_56;
            }
            bitmap = ((ovg)iterator.next()).c();
        } while (bitmap == null);
        i = bitmap.getByteCount() + i;
          goto _L1
        ovq1;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        ovq1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b(ovs ovs1)
    {
        if (d != null)
        {
            d.remove(ovs1);
        }
    }

    public final boolean g()
    {
label0:
        {
            synchronized (b)
            {
                Iterator iterator = b.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                } while (((ovg)iterator.next()).a() != ovi.a);
            }
            return false;
        }
        ovq1;
        JVM INSTR monitorexit ;
        return true;
        exception;
        ovq1;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
