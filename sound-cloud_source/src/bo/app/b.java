// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.a;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package bo.app:
//            ee, cm, o

public final class b
    implements Runnable
{

    final ee a;
    final o b;
    final a c;

    public b(a a1, ee ee1, o o1)
    {
        c = a1;
        a = ee1;
        b = o1;
        super();
    }

    public final void run()
    {
        com.appboy.a.h();
        cm cm1;
        for (Iterator iterator = a.c().iterator(); iterator.hasNext(); b.a(cm1))
        {
            cm1 = (cm)iterator.next();
        }

        com.appboy.a.h();
    }
}
