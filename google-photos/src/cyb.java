// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class cyb
{

    public final List a = new ArrayList();

    public cyb()
    {
    }

    public final List a(int i)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            cyc cyc1 = (cyc)iterator.next();
            if ((cyc1.b & 0xc) != 0)
            {
                arraylist.add(cyc1.a);
            }
        } while (true);
        return arraylist;
    }

    public final List a(int i, int j)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            cyc cyc1 = (cyc)iterator.next();
            if ((cyc1.b & i) == i && (cyc1.b & j) == 0)
            {
                arraylist.add(cyc1.a);
            }
        } while (true);
        return arraylist;
    }

    public final void a(int i, List list)
    {
        cxy.a(a(i, 0), list);
    }
}
