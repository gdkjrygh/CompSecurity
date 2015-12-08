// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl.filter;

import android.content.Context;
import com.digby.localpoint.sdk.core.ILPFilter;
import com.digby.localpoint.sdk.core.ILPID;
import com.digby.localpoint.sdk.core.ILPLocation;
import com.digby.mm.android.library.db.impl.DigbyDBHelper;
import com.digby.mm.android.library.db.impl.GeoFenceDBHelper;
import com.digby.mm.android.library.events.impl.CheckInEvent;
import com.digby.mm.android.library.exception.LPArgumentException;
import com.digby.mm.android.library.geofence.IGeoFence;

public class LPLocationAllowsCheckInFilter
    implements ILPFilter
{

    private final Context mContext;

    public LPLocationAllowsCheckInFilter(Context context)
    {
        mContext = context;
    }

    public boolean accept(Object obj)
    {
        if (!(obj instanceof ILPLocation))
        {
            throw new LPArgumentException("Filter can only apply to objects of type ILPLocation");
        }
        obj = (ILPLocation)obj;
        obj = getGeofenceDBHelper().getGeoFence(Long.parseLong(((ILPLocation) (obj)).getID().getValue()));
        if (obj != null)
        {
            return ((IGeoFence) (obj)).isValidEventType(com/digby/mm/android/library/events/impl/CheckInEvent);
        } else
        {
            return false;
        }
    }

    public GeoFenceDBHelper getGeofenceDBHelper()
    {
        return new GeoFenceDBHelper(new DigbyDBHelper(mContext));
    }
}
