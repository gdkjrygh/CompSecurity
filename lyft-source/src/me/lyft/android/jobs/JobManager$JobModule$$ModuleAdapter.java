// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import dagger.internal.ModuleAdapter;

public final class INCLUDES extends ModuleAdapter
{

    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = {
        "members/me.lyft.android.jobs.CourierDriverRideUpdatedJob", "members/me.lyft.android.jobs.DriverCloseToCurrentStopJob", "members/me.lyft.android.jobs.RideAssignedJob", "members/me.lyft.android.jobs.RideStatusChangedJob", "members/me.lyft.android.jobs.RideTypesChangedJob", "members/me.lyft.android.jobs.UpdateGcmIdentifierJob", "members/me.lyft.android.jobs.UserModeChangeJob", "members/me.lyft.android.jobs.LyftTokenUpdateJob", "members/me.lyft.android.jobs.ThreatMetrixJob", "members/me.lyft.android.jobs.GoogleNowAuthorizationJob", 
        "members/me.lyft.android.jobs.PollingRateChangedJob", "members/me.lyft.android.jobs.ConfigureProxyJob", "members/me.lyft.android.jobs.RideRequestSessionUpdateJob", "members/me.lyft.android.jobs.CheckDriverDocumentsJob", "members/me.lyft.android.jobs.UpdateHotspotsJob", "members/me.lyft.android.jobs.InitFacebookSdkJob", "members/me.lyft.android.jobs.DriverRideUpdateJob", "members/me.lyft.android.jobs.PassengerRideUpdateJob", "members/me.lyft.android.jobs.AppInfoUpdateJob", "members/me.lyft.android.jobs.UserUpdateJob", 
        "members/me.lyft.android.jobs.UpdateFacebookTokenJob", "members/me.lyft.android.jobs.UpdateSystemJob", "members/me.lyft.android.jobs.UpdateRideFareJob", "members/me.lyft.android.jobs.UpdateSplitFareJob", "members/me.lyft.android.jobs.UpdateSplitFareStateJob", "members/me.lyft.android.jobs.DestinyUpdateJob", "members/me.lyft.android.jobs.DriverDailyTotalsJob", "members/me.lyft.android.jobs.EtaUpdateJob", "members/me.lyft.android.jobs.LoadAppInfoJob", "members/me.lyft.android.jobs.UpdatePreRideInfoJob", 
        "members/me.lyft.android.jobs.PrefillLocationJob"
    };
    private static final Class STATIC_INJECTIONS[] = new Class[0];


    public ()
    {
        super(me/lyft/android/jobs/JobManager$JobModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, true, false);
    }
}
