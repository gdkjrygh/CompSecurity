// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;

import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.libraries.translate.offline:
//            j, ac, OfflinePackage

public final class a
{

    public static long a(Set set, j j1)
    {
        if (!set.contains(j1.b))
        {
            set.add(j1.b);
            set = j1.e;
            if (set != OfflinePackage.Status.DOWNLOADED && set != OfflinePackage.Status.DOWNLOADED_POST_PROCESSED && set != OfflinePackage.Status.INPROGRESS && set != OfflinePackage.Status.PAUSED)
            {
                set = Long.valueOf(j1.a.b(j1));
                if (set != null && set.longValue() >= 0L)
                {
                    return set.longValue();
                }
            }
        }
        return 0L;
    }

    public static transient long a(Set set, OfflinePackage aofflinepackage[])
    {
        long l = 0L;
        for (int i = 0; i <= 0; i++)
        {
            for (Iterator iterator = aofflinepackage[0].d.iterator(); iterator.hasNext();)
            {
                l = a(set, (j)iterator.next()) + l;
            }

        }

        return l;
    }
}
