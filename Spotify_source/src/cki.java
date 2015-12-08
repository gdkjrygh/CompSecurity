// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

public final class cki
{

    public static ckk a(List list)
    {
        ckg ckg1 = new ckg();
        int i = list.size();
        AtomicInteger atomicinteger = new AtomicInteger(0);
        for (Iterator iterator = list.iterator(); iterator.hasNext(); ((ckk)iterator.next()).a(new Runnable(atomicinteger, i, ckg1, list) {

        private AtomicInteger a;
        private int b;
        private ckg c;
        private List d;

        public final void run()
        {
            if (a.incrementAndGet() < b) goto _L2; else goto _L1
_L1:
            Object obj;
            ArrayList arraylist;
            Object obj1;
            obj = c;
            obj1 = d;
            arraylist = new ArrayList();
            obj1 = ((List) (obj1)).iterator();
_L6:
            if (!((Iterator) (obj1)).hasNext()) goto _L4; else goto _L3
_L3:
            Object obj2 = ((ckk)((Iterator) (obj1)).next()).get();
            if (obj2 == null) goto _L6; else goto _L5
_L5:
            arraylist.add(obj2);
              goto _L6
_L8:
            bka.c("Unable to convert list of futures to a future of list", ((Throwable) (obj)));
_L2:
            return;
_L4:
            try
            {
                ((ckg) (obj)).b(arraylist);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            if (true) goto _L8; else goto _L7
_L7:
        }

            
            {
                a = atomicinteger;
                b = i;
                c = ckg1;
                d = list;
                super();
            }
    })) { }
        return ckg1;
    }

    // Unreferenced inner class cki$1

/* anonymous class */
    final class _cls1
        implements Runnable
    {

        private ckg a;
        private ckj b;
        private ckk c;

        public final void run()
        {
            try
            {
                a.b(b.a(c.get()));
                return;
            }
            catch (CancellationException cancellationexception) { }
            catch (InterruptedException interruptedexception) { }
            catch (ExecutionException executionexception) { }
            a.cancel(true);
        }

            
            {
                a = ckg1;
                b = ckj1;
                c = ckk1;
                super();
            }
    }

}
