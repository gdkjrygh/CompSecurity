// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;

import java.util.Comparator;

// Referenced classes of package com.google.android.libraries.translate.offline:
//            LocationProfileProf

public final class i
    implements Comparator
{

    public i()
    {
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (LocationProfileProf)obj;
        obj1 = (LocationProfileProf)obj1;
        if (((LocationProfileProf) (obj)).c != ((LocationProfileProf) (obj1)).c)
        {
            return ((LocationProfileProf) (obj1)).c - ((LocationProfileProf) (obj)).c;
        }
        if (((LocationProfileProf) (obj)).d != ((LocationProfileProf) (obj1)).d)
        {
            return ((LocationProfileProf) (obj1)).d - ((LocationProfileProf) (obj)).d;
        } else
        {
            return 0;
        }
    }
}
