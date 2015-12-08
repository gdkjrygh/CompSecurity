// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class brx extends brw
{

    private List b;

    brx(List list)
    {
        b = list;
    }

    public final brw a(brw brw1)
    {
        ArrayList arraylist = new ArrayList(b);
        arraylist.add(btl.a(brw1));
        return new brx(arraylist);
    }

    public final boolean a(char c)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            if (((brw)iterator.next()).a(c))
            {
                return true;
            }
        }

        return false;
    }
}
