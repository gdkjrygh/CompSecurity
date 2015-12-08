// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.internal:
//            h, z

private static class p extends h
{

    List p;

    public h a(h h1)
    {
        ArrayList arraylist = new ArrayList(p);
        arraylist.add(z.a(h1));
        return new <init>(arraylist);
    }

    public boolean b(char c)
    {
        for (Iterator iterator = p.iterator(); iterator.hasNext();)
        {
            if (((h)iterator.next()).b(c))
            {
                return true;
            }
        }

        return false;
    }

    (List list)
    {
        p = list;
    }
}
