// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker;

import com.fsr.tracker.state.TrackingStates;

// Referenced classes of package com.fsr.tracker:
//            Tracker

static class 
{

    static final int $SwitchMap$com$fsr$tracker$domain$Configuration$LocalNotificationSurvey[];
    static final int $SwitchMap$com$fsr$tracker$state$TrackingStates[];

    static 
    {
        $SwitchMap$com$fsr$tracker$domain$Configuration$LocalNotificationSurvey = new int[com.fsr.tracker.domain.ion.LocalNotificationSurvey.values().length];
        try
        {
            $SwitchMap$com$fsr$tracker$domain$Configuration$LocalNotificationSurvey[com.fsr.tracker.domain.ion.LocalNotificationSurvey.IN_BROWSER.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            $SwitchMap$com$fsr$tracker$domain$Configuration$LocalNotificationSurvey[com.fsr.tracker.domain.ion.LocalNotificationSurvey.IN_APP.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        $SwitchMap$com$fsr$tracker$state$TrackingStates = new int[TrackingStates.values().length];
        try
        {
            $SwitchMap$com$fsr$tracker$state$TrackingStates[TrackingStates.TRACKING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            $SwitchMap$com$fsr$tracker$state$TrackingStates[TrackingStates.INVITED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$com$fsr$tracker$state$TrackingStates[TrackingStates.ON_EXIT_INVITED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$fsr$tracker$state$TrackingStates[TrackingStates.ON_EXIT_DETAILS_PRESENTED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$fsr$tracker$state$TrackingStates[TrackingStates.PENDING_EXIT_SURVEY_NOTIFICATION.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$fsr$tracker$state$TrackingStates[TrackingStates.INVITE_DECLINED.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$fsr$tracker$state$TrackingStates[TrackingStates.SURVEY_PRESENTED.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$fsr$tracker$state$TrackingStates[TrackingStates.SURVEY_COMPLETED.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$fsr$tracker$state$TrackingStates[TrackingStates.SURVEY_ABORTED.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$fsr$tracker$state$TrackingStates[TrackingStates.PENDING_REPEAT.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$fsr$tracker$state$TrackingStates[TrackingStates.PENDING_REINVITE.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$fsr$tracker$state$TrackingStates[TrackingStates.PENDING_EXIT_SURVEY.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
