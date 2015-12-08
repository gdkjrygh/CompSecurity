// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.ByteArrayOutputStream;

// Referenced classes of package b.a:
//            gj, gy, gp, fm, 
//            gn

public final class fs
{

    private final ByteArrayOutputStream a;
    private final gy b;
    private gn c;

    public fs()
    {
        this(((gp) (new gj())));
    }

    private fs(gp gp1)
    {
        a = new ByteArrayOutputStream();
        b = new gy(a);
        c = gp1.a(b);
    }

    public final byte[] a(fm fm1)
    {
        a.reset();
        fm1.b(c);
        return a.toByteArray();
    }
}
