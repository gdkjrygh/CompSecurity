// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;

final class cuf
    implements cvg
{

    private cue a;

    cuf(cue cue1)
    {
        a = cue1;
        super();
    }

    public final void a()
    {
        cue.a(a);
    }

    public final void b()
    {
        cue cue1;
label0:
        {
            cue1 = a;
            synchronized (cue1.b)
            {
                Iterator iterator = cue1.a.iterator();
                cul cul1;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    cul1 = (cul)iterator.next();
                } while (cul1.a != cuk.d && cul1.a != cuk.e);
            }
            return;
        }
        cue1.a.add(cul.a(cuk.e));
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
