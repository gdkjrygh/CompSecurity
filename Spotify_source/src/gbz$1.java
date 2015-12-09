// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;

final class ang.Object
    implements Runnable
{

    private gbz a;

    public final void run()
    {
        EnumSet enumset;
        EnumSet enumset1;
        synchronized (a.d)
        {
            enumset1 = a.a.clone();
            enumset = a.b;
            a.a = a.b;
            a.b = null;
        }
        EnumSet enumset2 = enumset1.clone();
        enumset2.retainAll(enumset);
        obj = enumset1.clone();
        ((EnumSet) (obj)).addAll(enumset);
        ((EnumSet) (obj)).removeAll(enumset2);
        if (!((EnumSet) (obj)).isEmpty())
        {
            Iterator iterator = a.c.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                gca gca1 = (gca)iterator.next();
                EnumSet enumset3 = gca1.a;
                if (enumset3 == null || EnumSet.complementOf(enumset3).addAll(((java.util.Collection) (obj))))
                {
                    gca1.a(enumset, ((EnumSet) (obj)));
                }
            } while (true);
        }
        break MISSING_BLOCK_LABEL_161;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (gbz gbz1)
    {
        a = gbz1;
        super();
    }
}
