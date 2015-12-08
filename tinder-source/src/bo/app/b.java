// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.Appboy;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package bo.app:
//            ee, cm, o

public final class b
    implements Runnable
{

    final ee a;
    final o b;
    final Appboy c;

    public b(Appboy appboy, ee ee1, o o1)
    {
        c = appboy;
        a = ee1;
        b = o1;
        super();
    }

    public final void run()
    {
        Appboy.a();
        cm cm1;
        for (Iterator iterator = a.c().iterator(); iterator.hasNext(); b.a(cm1))
        {
            cm1 = (cm)iterator.next();
        }

        Appboy.a();
    }
}
