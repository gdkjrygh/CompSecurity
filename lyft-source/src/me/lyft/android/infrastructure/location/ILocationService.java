// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.location;

import me.lyft.android.domain.location.Location;
import rx.Observable;

public interface ILocationService
{

    public abstract Location getLastCachedLocation();

    public abstract Observable getLastLocation();

    public abstract Observable observeBackgroundLocationUpdates();

    public abstract Observable observeLocationUpdates();

    public abstract Observable observePassiveLocationUpdates();
}
