// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class cxt
    implements cxu
{

    public cxt()
    {
    }

    public final cqj a(cxw cxw1)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = cxw1.a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            cnq cnq1 = cre.a(cqh.a((cqk)iterator.next()));
            if (cnq1.f.a() >= 0x16e360L && !cxw1.f.a(cnq1))
            {
                arraylist.add(cnq1);
            }
        } while (true);
        return new cqj(arraylist);
    }

    public final long b(cxw cxw1)
    {
        return 0L;
    }
}
