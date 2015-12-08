// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.j;

import com.kik.g.p;
import java.io.IOException;
import kik.a.d.ab;

// Referenced classes of package kik.a.j:
//            a

final class c
    implements Runnable
{

    final String a;
    final p b;
    final a c;

    c(a a1, String s, p p1)
    {
        c = a1;
        a = s;
        b = p1;
        super();
    }

    public final void run()
    {
        try
        {
            kik.a.j.a.a(c, a, null, true);
            b.a(new ab(a, null, null));
            return;
        }
        catch (IOException ioexception)
        {
            b.a(ioexception);
        }
    }
}
