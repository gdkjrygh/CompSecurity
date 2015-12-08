// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.caching;

import com.google.common.collect.Lists;
import java.util.List;

public class WobTailListByCategoryEvent
{

    private final boolean hasError;
    private final boolean moreToFetch;
    private final List wobs;

    public WobTailListByCategoryEvent(com.google.wallet.proto.NanoWalletObjects.WobInstance awobinstance[], boolean flag)
    {
        this(awobinstance, flag, false);
    }

    private WobTailListByCategoryEvent(com.google.wallet.proto.NanoWalletObjects.WobInstance awobinstance[], boolean flag, boolean flag1)
    {
        wobs = Lists.newArrayList(awobinstance);
        moreToFetch = flag;
        hasError = flag1;
    }

    public static WobTailListByCategoryEvent errorEvent()
    {
        return new WobTailListByCategoryEvent(new com.google.wallet.proto.NanoWalletObjects.WobInstance[0], false, true);
    }

    public final List getWobs()
    {
        return wobs;
    }

    public final boolean hasError()
    {
        return hasError;
    }

    public final boolean moreToFetch()
    {
        return moreToFetch;
    }
}
