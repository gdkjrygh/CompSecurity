// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl.handler;

import android.content.Context;
import com.digby.localpoint.sdk.core.ILPLocation;
import com.digby.localpoint.sdk.core.impl.LPError;
import com.digby.localpoint.sdk.core.util.LocationEventBroadcaster;
import com.digby.mm.android.library.events.IEventResponse;
import com.digby.mm.android.library.exception.DigbyException;
import com.digby.mm.android.library.exception.DisabledGeoFenceException;
import com.digby.mm.android.library.exception.InvalidEventTypeException;

public class CheckInEventResponseHandler extends com.digby.mm.android.library.events.impl.CheckInEventResponseHandler
{

    private static final int FAILED_CHECKIN = 440;
    private Context mContext;
    private final ILPLocation mLocation;

    public CheckInEventResponseHandler(Context context, ILPLocation ilplocation)
    {
        mContext = context;
        mLocation = ilplocation;
    }

    public void onError(DigbyException digbyexception)
    {
        char c;
        if (digbyexception instanceof DisabledGeoFenceException)
        {
            c = '\u0194';
        } else
        if (digbyexception instanceof InvalidEventTypeException)
        {
            c = '\u0196';
        } else
        {
            c = '\u01B8';
        }
        if (c == '\u0194')
        {
            digbyexception = "Geofence is disabled.";
        } else
        if (c == '\u0196')
        {
            digbyexception = "Check in disallowed.";
        } else
        {
            digbyexception = "Failed to check in.";
        }
        LocationEventBroadcaster.getInstance(mContext).broadcastCheckInFailure(mLocation, new LPError(c, digbyexception));
    }

    public void onResponse(IEventResponse ieventresponse)
    {
        LocationEventBroadcaster.getInstance(mContext).broadcastCheckInSuccess(mLocation);
    }
}
