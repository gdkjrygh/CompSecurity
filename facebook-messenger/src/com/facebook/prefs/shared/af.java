// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.prefs.shared;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;

// Referenced classes of package com.facebook.prefs.shared:
//            ae

public class af
{

    public af()
    {
    }

    public static SortedMap a(SortedMap sortedmap, ae ae1)
    {
        sortedmap = sortedmap.tailMap(ae1);
        for (Iterator iterator = sortedmap.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (!((ae)entry.getKey()).a(ae1))
            {
                return sortedmap.headMap(entry.getKey());
            }
        }

        return sortedmap;
    }
}
