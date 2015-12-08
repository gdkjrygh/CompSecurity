// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.parse;

import com.tinder.model.ProductGroup;
import com.tinder.utils.r;
import java.util.Comparator;

// Referenced classes of package com.tinder.parse:
//            f

static final class uctGroup
    implements Comparator
{

    public final int compare(Object obj, Object obj1)
    {
        obj = (ProductGroup)obj;
        obj1 = (ProductGroup)obj1;
        obj = ((ProductGroup) (obj)).key;
        obj1 = ((ProductGroup) (obj1)).key;
        int i = r.b(((String) (obj)));
        int j = r.b(((String) (obj1)));
        if (i > j)
        {
            return -1;
        }
        return i == j || j <= i ? 0 : 1;
    }

    uctGroup()
    {
    }
}
