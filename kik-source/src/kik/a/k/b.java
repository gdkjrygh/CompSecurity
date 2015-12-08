// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.k;

import com.c.b.as;
import com.c.b.av;
import com.c.b.bk;
import com.kik.g.p;
import com.kik.g.s;
import kik.a.e.f;

// Referenced classes of package kik.a.k:
//            d, c

public final class b
{

    private final String a;
    private final String b;
    private final as c;
    private final bk d;

    b(String s1, String s2, as as, bk bk1)
    {
        a = s1;
        b = s2;
        c = as;
        d = bk1;
    }

    public final p a(f f1)
    {
        if (f1 == null)
        {
            return s.a(new IllegalArgumentException("No communicator to execute on!"));
        }
        f1 = f1.a(kik.a.k.d.a(this));
        p p1 = new p();
        if (f1 != null)
        {
            f1.a(new c(this, p1));
            return p1;
        } else
        {
            p1.a(new IllegalArgumentException("Nothing to wrap"));
            return p1;
        }
    }

    public final Object a(byte abyte0[])
    {
        if (d == null)
        {
            return null;
        }
        try
        {
            abyte0 = ((byte []) (d.a(abyte0)));
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return null;
        }
        return abyte0;
    }

    public final String a()
    {
        return a;
    }

    public final String b()
    {
        return b;
    }

    public final as c()
    {
        return c;
    }
}
