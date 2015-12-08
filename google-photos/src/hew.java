// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class hew
    implements iwj
{

    public hew()
    {
    }

    public final Object a(Object obj)
    {
        Object obj1 = (List)obj;
        obj = new ArrayList(((List) (obj1)).size());
        ekq ekq1;
        fux fux1;
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((List) (obj)).add(new heq(fux1.b, ((elj)fux1.a(elj)).a, ekq1, pwt.A)))
        {
            ekq1 = (ekq)((Iterator) (obj1)).next();
            fux1 = (fux)ekq1;
        }

        return obj;
    }
}
