// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.caching;

import java.util.Collections;
import java.util.List;

public class WobHeadListByCategoryEvent
{

    private final boolean hasError;
    private final boolean isHeadUpdated;
    private final boolean moreToFetch;
    private final List wobs;

    public WobHeadListByCategoryEvent(List list, boolean flag, boolean flag1)
    {
        this(list, flag, flag1, false);
    }

    private WobHeadListByCategoryEvent(List list, boolean flag, boolean flag1, boolean flag2)
    {
        wobs = list;
        isHeadUpdated = flag;
        moreToFetch = flag1;
        hasError = flag2;
    }

    public static WobHeadListByCategoryEvent errorEvent()
    {
        return new WobHeadListByCategoryEvent(Collections.EMPTY_LIST, false, false, true);
    }

    public final List getWobs()
    {
        return wobs;
    }

    public final boolean hasError()
    {
        return hasError;
    }

    public final boolean isHeadUpdated()
    {
        return isHeadUpdated;
    }

    public final boolean moreToFetch()
    {
        return moreToFetch;
    }
}
