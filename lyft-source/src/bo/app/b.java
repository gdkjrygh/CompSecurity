// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.Appboy;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package bo.app:
//            ek, cs, o

public final class b
    implements Runnable
{

    final ek a;
    final o b;
    final Appboy c;

    public b(Appboy appboy, ek ek1, o o1)
    {
        c = appboy;
        a = ek1;
        b = o1;
        super();
    }

    public final void run()
    {
        Appboy.a();
        cs cs1;
        for (Iterator iterator = a.c().iterator(); iterator.hasNext(); b.a(cs1))
        {
            cs1 = (cs)iterator.next();
        }

        Appboy.a();
    }
}
