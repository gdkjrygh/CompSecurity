// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;

import android.content.Context;
import java.util.Comparator;

// Referenced classes of package com.google.android.libraries.translate.offline:
//            OfflinePackage

public final class n
    implements Comparator
{

    private Context a;

    public n(Context context)
    {
        a = context;
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (OfflinePackage)obj;
        obj1 = (OfflinePackage)obj1;
        boolean flag = ((OfflinePackage) (obj)).f;
        if (flag != ((OfflinePackage) (obj1)).f)
        {
            return !flag ? 1 : -1;
        } else
        {
            return ((OfflinePackage) (obj)).a(a, false).compareTo(((OfflinePackage) (obj1)).a(a, false));
        }
    }
}
