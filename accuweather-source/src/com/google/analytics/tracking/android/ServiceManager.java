// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;


public interface ServiceManager
{

    public abstract void dispatch();

    public abstract void setDispatchPeriod(int i);

    public abstract void updateConnectivityStatus(boolean flag);
}
