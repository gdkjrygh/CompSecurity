// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicBoolean;

final class ajf
    implements aji
{

    private LinkedList a;

    ajf()
    {
    }

    public final void a(ahn aahn[], ajh ajh1)
    {
label0:
        {
            ajh1.b = aiw.o();
            ahn ahn1;
label1:
            do
            {
                for (aahn = a.listIterator(); aahn.hasNext();)
                {
                    ahn1 = (ahn)aahn.next();
                    if (!ahn1.mIsSleeping.get())
                    {
                        continue label1;
                    }
                    ajh1.a = ahn1;
                    ajh1.b = aiw.n();
                }

                break label0;
            } while (!ahn1.k());
            ajh1.a = ahn1;
            ajh1.b = 100L;
            aahn.remove();
            a.add(ahn1);
        }
    }

    public final ahn[] a(ahn aahn[])
    {
        a = new LinkedList(Arrays.asList(aahn));
        return aahn;
    }

    public final void i()
    {
    }
}
