// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.filter;

import com.digby.localpoint.sdk.core.ILPFilter;

public interface ILPLocationFilterFactory
{

    public abstract ILPFilter getAllFilter();

    public abstract ILPFilter getAllowsCheckInFilter();

    public abstract ILPFilter getDeviceIsInFilter();

    public abstract ILPFilter getHasTagFilter(String s);

    public abstract ILPFilter getWithinDistanceFilter(int i);
}
