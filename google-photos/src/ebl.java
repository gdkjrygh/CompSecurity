// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.Set;

final class ebl
    implements ebn
{

    ebl()
    {
    }

    public final ekf a(int i, Object obj)
    {
        obj = (qgg)obj;
        if (obj != null)
        {
            obj = b.d(((qgg) (obj)));
            if (((fzw) (obj)).e != null && ((fzw) (obj)).d != null)
            {
                return new gag(((fzw) (obj)).d.longValue(), ((fzw) (obj)).e.longValue());
            }
        }
        return null;
    }

    public final Set a()
    {
        return Collections.emptySet();
    }

    public final Class b()
    {
        return gaf;
    }
}
