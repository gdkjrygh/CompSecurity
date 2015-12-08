// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.internal:
//            b, u

class n extends b
{

    List p;

    n(List list)
    {
        p = list;
    }

    public b a(b b1)
    {
        ArrayList arraylist = new ArrayList(p);
        arraylist.add(u.a(b1));
        return new n(arraylist);
    }

    public boolean b(char c)
    {
        for (Iterator iterator = p.iterator(); iterator.hasNext();)
        {
            if (((b)iterator.next()).b(c))
            {
                return true;
            }
        }

        return false;
    }
}
