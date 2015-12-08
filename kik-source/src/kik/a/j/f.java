// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.j;

import com.kik.g.p;
import java.io.IOException;

// Referenced classes of package kik.a.j:
//            a

final class f
    implements Runnable
{

    final String a;
    final String b;
    final p c;
    final a d;

    f(a a1, String s, String s1, p p1)
    {
        d = a1;
        a = s;
        b = s1;
        c = p1;
        super();
    }

    public final void run()
    {
        try
        {
            kik.a.d.ab ab = kik.a.j.a.a(d, a, b);
            c.a(ab);
            return;
        }
        catch (IOException ioexception)
        {
            c.a(ioexception);
        }
    }
}
