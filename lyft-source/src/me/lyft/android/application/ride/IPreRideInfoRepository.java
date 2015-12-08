// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import java.util.List;
import me.lyft.android.domain.ride.PickupOffset;
import me.lyft.android.domain.ride.PreRideInfo;
import rx.Observable;

public interface IPreRideInfoRepository
{

    public abstract PickupOffset getDefaultPickupOffset();

    public abstract List getPickupOffsets();

    public abstract PreRideInfo getPreRideInfo();

    public abstract Observable observePreRideInfo();

    public abstract void update(PreRideInfo prerideinfo);
}
