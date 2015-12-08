// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.pref;

import com.google.android.libraries.translate.offline.OfflinePackage;
import com.google.android.libraries.translate.offline.PackageType;
import com.google.android.libraries.translate.offline.a.h;
import com.google.android.libraries.translate.offline.am;
import java.util.List;

// Referenced classes of package com.google.android.apps.translate.pref:
//            i

final class q extends h
    implements Comparable
{

    final i a;
    private final int g;

    public q(i j, String s, int k, OfflinePackage offlinepackage)
    {
        a = j;
        super(s, k, offlinepackage);
        String s1 = offlinepackage.a;
        s = s1;
        if (offlinepackage.b == PackageType.WORD_LENS)
        {
            offlinepackage = am.c(offlinepackage.a);
            s = s1;
            if (offlinepackage != null)
            {
                s = offlinepackage[0];
            }
        }
        g = i.b(j).indexOf(s);
    }

    public final int compareTo(Object obj)
    {
        obj = (q)obj;
        return g - ((q) (obj)).g;
    }
}
