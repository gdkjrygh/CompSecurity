// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.a;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package a.a:
//            dd, bn, ki

public final class x
    implements Runnable
{

    final dd a;
    final ki b;
    final a c;

    public x(a a1, dd dd1, ki ki1)
    {
        c = a1;
        a = dd1;
        b = ki1;
        super();
    }

    public final void run()
    {
        com.appboy.a.i();
        bn bn1;
        for (Iterator iterator = a.c().iterator(); iterator.hasNext(); b.a(bn1))
        {
            bn1 = (bn)iterator.next();
        }

        com.appboy.a.i();
    }
}
