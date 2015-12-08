// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.settings;

import me.lyft.android.domain.location.Location;
import rx.Observable;

public interface ITrainingRideService
{

    public abstract Observable startTrainingRide(Location location);
}
