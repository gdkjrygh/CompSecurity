// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class mpl
    implements mqc
{

    private mpk a;

    mpl(mpk mpk1)
    {
        a = mpk1;
        super();
    }

    public final void a(int i, int j)
    {
        List list = (List)mpk.a(a).c.a.remove(Integer.valueOf(j));
        Object obj = list;
        if (list == null)
        {
            obj = Collections.emptyList();
        }
        if (!((List) (obj)).isEmpty())
        {
            mph mph1;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); mpk.a(a, i, mph1))
            {
                mph1 = (mph)((Iterator) (obj)).next();
            }

        }
    }
}
