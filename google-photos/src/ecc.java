// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.Set;

final class ecc
    implements ebh
{

    private final eci a;

    ecc(eci eci1)
    {
        a = eci1;
    }

    public final ekf a(int i, Object obj)
    {
        obj = ((ozs)obj).b;
        obj = a.a(((pzt) (obj)));
        if (obj != null && ((pzx) (obj)).b.f != null)
        {
            return new gsp(((pzx) (obj)).b.f.a);
        } else
        {
            return null;
        }
    }

    public final Set a()
    {
        return Collections.emptySet();
    }

    public final Class b()
    {
        return gsp;
    }
}
