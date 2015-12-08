// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl.filter;

import com.digby.localpoint.sdk.core.ILPFilter;

public class LPAllFilter
    implements ILPFilter
{

    public LPAllFilter()
    {
    }

    public boolean accept(Object obj)
    {
        return true;
    }
}
