// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class nue
{

    private final List a = new ArrayList();
    private final jw b = nwk.a();

    public nue()
    {
    }

    public final void a()
    {
        a.clear();
    }

    public final void a(Object obj)
    {
        List list = (List)b.a();
        list.addAll(a);
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            nug nug1 = (nug)list.get(i);
            if (a.contains(nug1))
            {
                nug1.b_(obj);
            }
        }

        b.a(list);
    }

    public final void a(nug nug1)
    {
        if (!a.contains(nug1))
        {
            a.add(nug1);
        }
    }

    public final void b(nug nug1)
    {
        a.remove(nug1);
    }
}
