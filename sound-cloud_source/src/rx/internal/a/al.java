// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.ArrayList;
import rx.X;
import rx.b.a;

final class al
    implements a
{

    final ak.a a;

    al(ak.a a1)
    {
        a = a1;
        super();
    }

    public final void call()
    {
label0:
        {
            synchronized (a)
            {
                if (!a1.d)
                {
                    break label0;
                }
            }
            return;
        }
        java.util.List list;
        list = a1.c;
        a1.c = new ArrayList();
        a1;
        JVM INSTR monitorexit ;
        try
        {
            a1.a.onNext(list);
            return;
        }
        catch (Throwable throwable)
        {
            a1.onError(throwable);
        }
        return;
        exception;
        a1;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
