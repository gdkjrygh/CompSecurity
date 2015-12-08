// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class dmk
    implements eyt
{

    private final dps a;

    dmk(Context context)
    {
        a = (dps)olm.a(context, dps);
    }

    public final Class a()
    {
        return dmh;
    }

    public final Map a(ekq ekq, ekw ekw, Set set)
    {
        ekq = (dmh)ekq;
        ekw = new HashMap(set.size());
        eyz eyz1;
        dpr dpr1;
        for (set = set.iterator(); set.hasNext(); ekw.put(eyz1, dpr1.b().b(((dmh) (ekq)).a)))
        {
            eyz1 = (eyz)set.next();
            dpr1 = (dpr)a.a(eyz1);
            if (dpr1 == null)
            {
                ekq = String.valueOf(eyz1);
                throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekq).length() + 26)).append("no loader for given type: ").append(ekq).toString());
            }
        }

        return ekw;
    }

    public final boolean b(ekq ekq, ekw ekw, Set set)
    {
        for (ekq = set.iterator(); ekq.hasNext();)
        {
            ekw = (eyz)ekq.next();
            if (a.a(ekw) == null)
            {
                return false;
            }
        }

        return true;
    }
}
