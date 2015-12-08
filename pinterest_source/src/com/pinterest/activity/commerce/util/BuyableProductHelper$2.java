// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.util;

import java.util.Comparator;
import java.util.List;

// Referenced classes of package com.pinterest.activity.commerce.util:
//            BuyableProductHelper

final class A
    implements Comparator
{

    public final volatile int compare(Object obj, Object obj1)
    {
        return compare((String)obj, (String)obj1);
    }

    public final int compare(String s, String s1)
    {
        if (BuyableProductHelper.access$000().indexOf(s) < BuyableProductHelper.access$000().indexOf(s1))
        {
            return -1;
        }
        if (BuyableProductHelper.access$000().indexOf(s) > BuyableProductHelper.access$000().indexOf(s1))
        {
            return 1;
        } else
        {
            throw new IllegalStateException("There shouldn't be duplicate attributes");
        }
    }

    A()
    {
    }
}
