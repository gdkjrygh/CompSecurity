// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class kbl extends kbf
{

    private List b;

    kbl(List list)
    {
        b = list;
    }

    public final kbf a(kbf kbf1)
    {
        ArrayList arraylist = new ArrayList(b);
        arraylist.add(b.d(kbf1));
        return new kbl(arraylist);
    }

    public final boolean a(char c)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            if (((kbf)iterator.next()).a(c))
            {
                return true;
            }
        }

        return false;
    }
}
