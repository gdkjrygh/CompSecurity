// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class drb
    implements ftt
{

    private glr a;
    private ehr b;

    drb(dqz dqz, glr glr1, ehr ehr)
    {
        a = glr1;
        b = ehr;
        super();
    }

    public final void a(List list)
    {
    }

    public final void a(List list, List list1)
    {
        for (list = list.iterator(); list.hasNext(); a.c(b, list1.intValue()))
        {
            list1 = (Integer)list.next();
        }

    }
}
