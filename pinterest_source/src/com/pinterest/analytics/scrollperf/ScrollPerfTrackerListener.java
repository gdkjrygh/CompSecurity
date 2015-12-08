// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.analytics.scrollperf;


interface ScrollPerfTrackerListener
{

    public abstract void updateDurationAndDropEvents(long l, double d, double d1);

    public abstract void updateStackTrace(String s);
}
