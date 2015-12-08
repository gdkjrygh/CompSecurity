// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import java.util.Collection;
import java.util.Map;

interface AnalyticsStore
{

    public abstract void clearHits(long l);

    public abstract void close();

    public abstract void dispatch();

    public abstract void putHit(Map map, long l, String s, Collection collection);

    public abstract void setDispatch(boolean flag);
}
