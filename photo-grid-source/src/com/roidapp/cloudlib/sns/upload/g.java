// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.upload;

import java.util.Comparator;

// Referenced classes of package com.roidapp.cloudlib.sns.upload:
//            i, e

final class g
    implements Comparator
{

    final e a;

    g(e e)
    {
        a = e;
        super();
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        obj = (i)obj;
        obj1 = (i)obj1;
        if (((i) (obj)).e < ((i) (obj1)).e)
        {
            return -1;
        }
        return ((i) (obj)).e != ((i) (obj1)).e ? 1 : 0;
    }
}
