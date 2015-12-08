// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.j;

import com.kik.g.p;
import java.io.IOException;

// Referenced classes of package kik.a.j:
//            a

final class l
    implements Runnable
{

    final String a;
    final String b;
    final byte c[];
    final p d;
    final a e;

    l(a a1, String s, String s1, byte abyte0[], p p1)
    {
        e = a1;
        a = s;
        b = s1;
        c = abyte0;
        d = p1;
        super();
    }

    public final void run()
    {
        try
        {
            kik.a.d.ab ab = kik.a.j.a.a(e, a, b, c);
            d.a(ab);
            return;
        }
        catch (IOException ioexception)
        {
            d.a(ioexception);
        }
    }
}
