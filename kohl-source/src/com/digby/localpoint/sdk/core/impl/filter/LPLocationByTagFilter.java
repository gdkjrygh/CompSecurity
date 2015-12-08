// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl.filter;

import com.digby.localpoint.sdk.core.ILPFilter;
import com.digby.localpoint.sdk.core.ILPLocation;
import com.digby.localpoint.sdk.core.impl.LPTag;
import com.digby.mm.android.library.exception.LPArgumentException;
import java.util.Set;

public class LPLocationByTagFilter
    implements ILPFilter
{

    private final String mTag;

    public LPLocationByTagFilter(String s)
    {
        mTag = s;
    }

    public boolean accept(Object obj)
    {
        if (!(obj instanceof ILPLocation))
        {
            throw new LPArgumentException("Filter can only apply to objects of type ILPLocation");
        } else
        {
            return ((ILPLocation)obj).getTags().contains(new LPTag(mTag));
        }
    }
}
