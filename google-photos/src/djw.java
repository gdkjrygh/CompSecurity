// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class djw
    implements eyt
{

    private final List a;

    djw(Context context)
    {
        a = Collections.unmodifiableList(Arrays.asList(new djx[] {
            new dkz(context), new dmg(context)
        }));
    }

    public final Class a()
    {
        return dke;
    }

    public final Map a(ekq ekq, ekw ekw, Set set)
    {
        ekq = (dke)ekq;
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            djx djx1 = (djx)iterator.next();
            if (djx1.a(ekq, ekw, set))
            {
                return (Map)p.a(djx1.b(ekq, ekw, set));
            }
        }

        ekq = String.valueOf(ekq);
        ekw = String.valueOf(ekw);
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekq).length() + 27 + String.valueOf(ekw).length())).append("Found no handlers for ").append(ekq).append(" and ").append(ekw).toString());
    }

    public final boolean b(ekq ekq, ekw ekw, Set set)
    {
        ekq = (dke)ekq;
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            if (((djx)iterator.next()).a(ekq, ekw, set))
            {
                return true;
            }
        }

        return false;
    }
}
