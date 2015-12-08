// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.e;

import android.util.Log;
import com.nuance.b.a.z;
import com.nuance.b.b.aq;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.nuance.b.e:
//            ac, ad, c

final class ab
{

    private ExecutorService a;
    private Collection b;
    private ac c;
    private ad d;

    public ab(z z1, c c1)
    {
        if (z1 == null)
        {
            throw new NullPointerException("Parameter 'conversationManager' must not be null");
        } else
        {
            c = new ac(this, z1, c1);
            b = new HashSet();
            a = Executors.newSingleThreadExecutor();
            return;
        }
    }

    public final Future a(aq aq, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = c;
        obj = new ad(((ac) (obj)).a, ((ac) (obj)).b, ((ac) (obj)).c);
        if (aq != null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        throw new NullPointerException("Interpretation must not be null");
        aq;
        this;
        JVM INSTR monitorexit ;
        throw aq;
        obj.e = aq;
        obj.f = flag;
        obj.g = false;
        ((ad) (obj)).a.set(false);
        aq = a.submit(((Runnable) (obj)));
        b.add(aq);
        this;
        JVM INSTR monitorexit ;
        return aq;
    }

    final void a()
    {
        this;
        JVM INSTR monitorenter ;
        d = null;
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Future future = (Future)iterator.next();
            if (!future.isDone())
            {
                continue;
            }
            b.remove(future);
            break;
        } while (true);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final void a(ad ad1)
    {
        this;
        JVM INSTR monitorenter ;
        if (d == null) goto _L2; else goto _L1
_L1:
        Log.e("NinaInterpretationHandler", "Called startedHandlingInterpretation before previous one finished.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        d = ad1;
        if (true) goto _L4; else goto _L3
_L3:
        ad1;
        throw ad1;
    }

    public final void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        Log.i("NinaInterpretationHandler", "Cancelling....");
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((Future)iterator.next()).cancel(false))
            {
                iterator.remove();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_61;
        Exception exception;
        exception;
        throw exception;
        ad ad1 = d;
        if (ad1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        ad1.a.getAndSet(true);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        Iterator iterator1 = b.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            if (((Future)iterator1.next()).cancel(true))
            {
                iterator1.remove();
            }
        } while (true);
        this;
        JVM INSTR monitorexit ;
    }

    public final void b()
    {
        ad ad1 = d;
        if (ad1 != null)
        {
            ad1.g = true;
        }
    }

    public final void c()
    {
        Object obj = a.shutdownNow();
        if (((List) (obj)).size() > 0)
        {
            Log.w("NinaInterpretationHandler", (new StringBuilder("InterpretationHandler tasks remaining when destroyed: ")).append(((List) (obj)).size()).toString());
        }
        obj = c;
        ((ac) (obj)).b.d();
        obj.a = null;
        obj.b = null;
        obj.c = null;
    }
}
