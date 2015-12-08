// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import me.lyft.android.domain.ride.RideFare;

public interface IRideFareRepository
{

    public abstract RideFare getFare();

    public abstract void update(RideFare ridefare);
}
