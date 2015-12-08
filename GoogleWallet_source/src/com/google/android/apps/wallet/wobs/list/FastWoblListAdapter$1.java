// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.list;

import com.google.common.base.Function;

// Referenced classes of package com.google.android.apps.wallet.wobs.list:
//            FastWoblListAdapter

final class stItem
    implements Function
{

    private static Comparable apply(stItem stitem)
    {
        return stitem.sortKey;
    }

    public final volatile Object apply(Object obj)
    {
        return apply((stItem)obj);
    }

    stItem()
    {
    }
}
