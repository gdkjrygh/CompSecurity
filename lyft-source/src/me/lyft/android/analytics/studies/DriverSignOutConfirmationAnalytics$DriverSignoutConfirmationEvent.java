// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.studies;

import me.lyft.android.analytics.Event;
import me.lyft.android.analytics.RedshiftTrackerExtra;
import me.lyft.android.analytics.definitions.EventName;
import me.lyft.android.analytics.definitions.Parameter;
import me.lyft.android.common.Objects;
import me.lyft.android.infrastructure.lyft.ride.DriverSignOutFrictionDTO;

public class addTracker extends Event
{

    public i(String s, long l, DriverSignOutFrictionDTO driversignoutfrictiondto)
    {
        super(EventName.DRIVER_SIGNOUT_CONFIRMATION_DISMISSED);
        putParameter(Parameter.ACTION, s);
        putParameter(Parameter.TIME_ON_SCREEN_MILLIS, Long.valueOf(l));
        putParameter(Parameter.TITLE, (String)Objects.firstNonNull(driversignoutfrictiondto.getTitleText(), ""));
        putParameter(Parameter.MESSAGE, (String)Objects.firstNonNull(driversignoutfrictiondto.getMessageText(), ""));
        putParameter(Parameter.SIGNOUT_BUTTON_TEXT, (String)Objects.firstNonNull(driversignoutfrictiondto.getSignOutButtonText(), ""));
        putParameter(Parameter.KEEP_DRIVING_BUTTON_TEXT, (String)Objects.firstNonNull(driversignoutfrictiondto.getKeepDrivingButtonText(), ""));
        addTracker(RedshiftTrackerExtra.create());
    }
}
