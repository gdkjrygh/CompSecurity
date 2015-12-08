// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import me.lyft.android.domain.location.Location;
import rx.Observable;

public interface IDestinySession
{

    public abstract Location getLocation();

    public abstract float getZoomLevel();

    public abstract boolean isDriverInDestinyMode();

    public abstract boolean isInDestinyEditMode();

    public abstract Observable observeLocationChanges();

    public abstract void restoreSession();

    public abstract void setInDestinyEditMode(boolean flag);

    public abstract void setLocation(Location location);

    public abstract void setZoomLevel(float f);
}
