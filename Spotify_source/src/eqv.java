// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;

public final class eqv
{

    public final List a;
    public final List b;

    eqv(List list, List list1)
    {
        a = list;
        b = list1;
    }

    static List a(List list)
    {
        ctz.a(list);
        cuq cuq1 = ImmutableList.h();
        eqm eqm1;
        for (list = list.iterator(); list.hasNext(); cuq1.c(new eqw(eqm1.d.d(), eqm1.e.d())))
        {
            eqm1 = (eqm)list.next();
        }

        return cuq1.a();
    }
}
