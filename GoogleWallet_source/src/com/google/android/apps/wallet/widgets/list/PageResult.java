// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.list;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import java.util.List;

public final class PageResult
{

    private final ImmutableList mItems;
    private final Optional mNextPageToken;

    public PageResult(Iterable iterable, String s)
    {
        Preconditions.checkNotNull(iterable);
        if (Strings.isNullOrEmpty(s))
        {
            s = Optional.absent();
        } else
        {
            s = Optional.of(s);
        }
        mNextPageToken = s;
        mItems = ImmutableList.copyOf(iterable);
    }

    public final List getItems()
    {
        return mItems;
    }

    public final Optional getNextPageToken()
    {
        return mNextPageToken;
    }
}
