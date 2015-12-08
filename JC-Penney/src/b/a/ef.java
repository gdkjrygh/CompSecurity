// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package b.a:
//            ek, be, dy, ej, 
//            eb, ei, l, dw

public final class ef
{

    private Context a;
    private List b;

    public ef(Context context)
    {
        a = context;
        b = new ArrayList();
    }

    public final void a()
    {
        Object obj = new ArrayList();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((ArrayList) (obj)).add(new Thread((ek)iterator.next()))) { }
        for (Iterator iterator1 = ((ArrayList) (obj)).iterator(); iterator1.hasNext(); ((Thread)iterator1.next()).start()) { }
        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((Thread)((Iterator) (obj)).next()).join()) { }
    }

    public final void a(be be1, dy dy1, String s, String s1, String s2, l l, dw dw)
    {
        this;
        JVM INSTR monitorenter ;
        if (be1.b() > 0)
        {
            be be2 = be1.a(a);
            dy1 = dy1.a(be2, be1, s2, a, l);
            be1 = new ej(be2, be1, l, (new eb(s, s1)).a(), dy1, dw);
            b.add(be1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        be1;
        throw be1;
    }

    public final void a(ei ei1, ExecutorService executorservice)
    {
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ek ek1 = (ek)iterator.next();
            if (!ei1.a(ek1))
            {
                executorservice.execute(ek1);
            }
        } while (true);
    }
}
