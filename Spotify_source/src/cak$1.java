// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.List;

final class ang.Object
    implements Runnable
{

    private View a;
    private cak b;

    public final void run()
    {
        cak cak1;
        Object obj;
        cak1 = b;
        obj = a;
        cah cah1;
        cah1 = new cah(cak1.e, cak1.f, cak1.g, cak1.h);
        obj = cak1.a(((View) (obj)), cah1);
        cah1.c();
        if (((cal) (obj)).a == 0 && ((cal) (obj)).b == 0)
        {
            return;
        }
        cai cai1;
        if (((cal) (obj)).b == 0 && cah1.b == 0 || ((cal) (obj)).b == 0 && cak1.c.a(cah1))
        {
            break MISSING_BLOCK_LABEL_219;
        }
        cai1 = cak1.c;
        synchronized (cai1.a)
        {
            if (cai1.c.size() >= 10)
            {
                bka.a((new StringBuilder("Queue is full, current size = ")).append(cai1.c.size()).toString());
                cai1.c.remove(0);
            }
            int i = cai1.b;
            cai1.b = i + 1;
            cah1.c = i;
            cai1.c.add(cah1);
        }
        return;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (Exception exception1)
        {
            bka.b("Exception in fetchContentOnUIThread", exception1);
            cak1.d.a(exception1, true);
        }
    }

    (cak cak1, View view)
    {
        b = cak1;
        a = view;
        super();
    }
}
