// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.Set;

final class ijp
    implements ikj
{

    private final iiv a;

    public ijp(iiv iiv1)
    {
        a = iiv1;
    }

    public final ekf a(int i, Object obj)
    {
        obj = ((qgg)obj).c.b.a;
        obj = a.a(i, ((String) (obj)));
        if (obj == null)
        {
            return null;
        } else
        {
            return new hkh(((diy) (obj)));
        }
    }

    public final Set a()
    {
        return Collections.emptySet();
    }

    public final Class b()
    {
        return hkh;
    }
}
