// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Collection;
import java.util.List;

public final class dmj
    implements emd
{

    private dox a;

    dmj(Context context)
    {
        a = (dox)olm.a(context, dox);
    }

    public final ekq a(ekq ekq, elm elm)
    {
        return new dmh(((dmh)ekq).a, elm);
    }

    public final elm a(ekq ekq, ekk ekk1)
    {
        boolean flag = true;
        int i = 0;
        dmh dmh1 = (dmh)ekq;
        int ai[];
        if (ekk1.a().size() != 1)
        {
            flag = false;
        }
        p.a(flag);
        p.a(ekk1.a().contains(dov));
        ekq = new elq();
        ekk1 = a.b(dmh1.a).b();
        for (ai = new int[ekk1.size()]; i < ai.length; i++)
        {
            ai[i] = ((Integer)ekk1.get(i)).intValue();
        }

        ekq.a(dov, new dov(ai));
        return ekq;
    }

    public final Class a()
    {
        return dmh;
    }
}
