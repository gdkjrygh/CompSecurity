// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class gpq
    implements omb, opp, opr, opv
{

    private final gpy a;
    private final ds b;
    private gpu c;

    public gpq(opd opd1, ds ds, gpy gpy)
    {
        b = ds;
        a = gpy;
        opd1.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = (gpu)olm1.a(gpu);
        c.a(b);
    }

    public final void al_()
    {
        gpu gpu1 = c;
        ds ds = b;
        gpy gpy = a;
        Set set = (Set)gpu1.a.get(ds);
        Object obj = set;
        if (set == null)
        {
            obj = new HashSet();
            gpu1.a.put(ds, obj);
        }
        ((Set) (obj)).add(gpy);
    }

    public final void am_()
    {
        gpu gpu1 = c;
        ds ds = b;
        gpy gpy = a;
        if (gpu1.c(ds))
        {
            ((Set)gpu1.a.get(ds)).remove(gpy);
        }
    }
}
