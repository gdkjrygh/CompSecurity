// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;

import java.util.Comparator;

// Referenced classes of package com.google.android.libraries.translate.offline:
//            j, ac

final class v
    implements Comparator
{

    v()
    {
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (j)obj;
        obj1 = (j)obj1;
        boolean flag = ((j) (obj)).a.c(((j) (obj)));
        if (flag == ((j) (obj1)).a.c(((j) (obj1))))
        {
            return (int)(((j) (obj)).k - ((j) (obj1)).k);
        }
        byte byte0;
        if (flag)
        {
            byte0 = -1;
        } else
        {
            byte0 = 1;
        }
        return byte0 * 0x7fffffff;
    }
}
