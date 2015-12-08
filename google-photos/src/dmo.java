// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class dmo
    implements drx
{

    private final List a;

    dmo(List list)
    {
        a = list;
    }

    public final erm a(erm erm1)
    {
        Object obj = a;
        erm1.c(b.b(b.b("media", "_id"), ((List) (obj)).size()));
        Long long1;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); erm1.c.add(String.valueOf(long1)))
        {
            long1 = (Long)((Iterator) (obj)).next();
        }

        return erm1;
    }
}
