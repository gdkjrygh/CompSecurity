// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.Set;

final class ikp
    implements ikj
{

    private final jdr a;

    ikp(jdr jdr)
    {
        a = jdr;
    }

    public final ekf a(int i, Object obj)
    {
        obj = (qgg)obj;
        if (b.a(((qgg) (obj))) == euv.c)
        {
            return jdy.a(((qgg) (obj)), a);
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
        return jdy;
    }
}
