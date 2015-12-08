// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.internal:
//            j, bl

final class v extends j
{

    List p;

    v(List list)
    {
        p = list;
    }

    public final j a(j j1)
    {
        ArrayList arraylist = new ArrayList(p);
        arraylist.add(bl.a(j1));
        return new v(arraylist);
    }

    public final boolean a(char c)
    {
        for (Iterator iterator = p.iterator(); iterator.hasNext();)
        {
            if (((j)iterator.next()).a(c))
            {
                return true;
            }
        }

        return false;
    }
}
