// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.aa.f;
import com.google.android.m4b.maps.bo.k;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            al, j

final class <init>
    implements Runnable
{

    private al a;

    public final void run()
    {
        java.util.ArrayList arraylist;
        synchronized (al.a(a))
        {
            arraylist = f.a(al.b(a));
        }
        obj = com.google.android.m4b.maps.bk.f.a(arraylist, com.google.android.m4b.maps.bk.);
_L2:
        synchronized (al.a(a))
        {
            al.a(a, ((com.google.android.m4b.maps.bk.k) (obj)));
            al.d(a);
            al.e(a);
            if (com.google.android.m4b.maps.bx.al.f(a) != null)
            {
                com.google.android.m4b.maps.bx.al.f(a).a(true, false);
            }
        }
        return;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        com.google.android.m4b.maps.bk.> >;
        >;
        > = f.a(al.c(a));
        obj1 = >.iterator();
        int i = 0;
        while (((Iterator) (obj1)).hasNext()) 
        {
            i = ((k)((Iterator) (obj1)).next()).a.length / 3 + i;
        }
        if (i < 2000)
        {
            try
            {
                > = com.google.android.m4b.maps.bk.f.a(>, com.google.android.m4b.maps.bk.);
            }
            catch (com.google.android.m4b.maps.bk.> >1)
            {
                >1 = com.google.android.m4b.maps.bk.k.a();
            }
            continue; /* Loop/switch isn't completed */
        }
        > = com.google.android.m4b.maps.bk.k.a();
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private (al al1)
    {
        a = al1;
        super();
    }

    a(al al1, byte byte0)
    {
        this(al1);
    }
}
