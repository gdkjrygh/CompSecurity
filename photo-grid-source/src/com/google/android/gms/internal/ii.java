// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            ih, ig

final class ii
    implements Runnable
{

    final ig a;
    final ih b;

    ii(ih ih1, ig ig1)
    {
        b = ih1;
        a = ig1;
        super();
    }

    public final void run()
    {
label0:
        {
            synchronized (ih.a(b))
            {
                if (ih.b(b) == -2)
                {
                    break label0;
                }
            }
            return;
        }
        ih.a(b, ih.c(b));
        if (ih.d(b) != null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        b.a(4);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        a.a(b);
        ih.a(b, a);
        obj;
        JVM INSTR monitorexit ;
    }
}
