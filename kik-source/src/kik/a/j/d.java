// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.j;

import com.kik.g.p;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kik.a.d.ab;

// Referenced classes of package kik.a.j:
//            a

final class d
    implements Runnable
{

    final List a;
    final p b;
    final a c;

    d(a a1, List list, p p1)
    {
        c = a1;
        a = list;
        b = p1;
        super();
    }

    public final void run()
    {
        try
        {
            ab ab1;
            for (Iterator iterator = a.iterator(); iterator.hasNext(); kik.a.j.a.a(c, ab1.a(), ab1.b(), false))
            {
                ab1 = (ab)iterator.next();
            }

        }
        catch (IOException ioexception)
        {
            b.a(ioexception);
            return;
        }
        b.a(a);
        return;
    }
}
