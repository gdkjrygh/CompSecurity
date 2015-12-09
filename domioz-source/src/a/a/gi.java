// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.util.Iterator;

// Referenced classes of package a.a:
//            fh, fb, gf, gh, 
//            gs, fe

final class gi extends fh
{

    final gh a;

    private gi(gh gh1)
    {
        a = gh1;
        super();
    }

    gi(gh gh1, byte byte0)
    {
        this(gh1);
    }

    public final gs a()
    {
        return b_().a();
    }

    final fe d()
    {
        return a;
    }

    final fb f()
    {
        return new gf(this, gh.a(a));
    }

    public final Iterator iterator()
    {
        return b_().a();
    }
}
