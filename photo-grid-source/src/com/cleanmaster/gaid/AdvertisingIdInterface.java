// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.gaid;

import android.os.IInterface;

public interface AdvertisingIdInterface
    extends IInterface
{

    public abstract String getId();

    public abstract boolean isLimitAdTrackingEnabled(boolean flag);
}
