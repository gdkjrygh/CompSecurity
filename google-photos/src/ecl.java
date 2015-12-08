// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.Set;

final class ecl
    implements ebh
{

    private final eci a;

    ecl(eci eci1)
    {
        a = eci1;
    }

    public final ekf a(int i, Object obj)
    {
        obj = ((ozs)obj).b;
        obj = a.a(((pzt) (obj)));
        if (obj != null && ((pzx) (obj)).b.h != null)
        {
            return new ivu(((pzx) (obj)).b.h.b.longValue(), ((pzx) (obj)).b.h.c.longValue());
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
        return ivu;
    }
}
