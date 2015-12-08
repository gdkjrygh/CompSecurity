// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import com.google.common.base.Function;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            WobListAdapter

final class bListItem
    implements Function
{

    private static String apply(bListItem blistitem)
    {
        return blistitem.wobInstance.sortKey;
    }

    public final volatile Object apply(Object obj)
    {
        return apply((bListItem)obj);
    }

    bListItem()
    {
    }
}
