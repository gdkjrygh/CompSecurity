// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.state;

import com.fsr.tracker.domain.MeasureConfiguration;
import java.util.Date;
import java.util.SortedSet;

// Referenced classes of package com.fsr.tracker.state:
//            ITrackerState

public interface ITrackerStateContext
{
    public static interface EligibleMeasuresCallback
    {

        public abstract void onComplete(SortedSet sortedset);

        public abstract void onFailure(Throwable throwable);

        public abstract void onReturnedNoEligibleMeasures();
    }


    public abstract void abortSurvey(MeasureConfiguration measureconfiguration);

    public abstract void acceptInvitation(MeasureConfiguration measureconfiguration);

    public abstract void completeSurvey(MeasureConfiguration measureconfiguration);

    public abstract void declineInvitation(MeasureConfiguration measureconfiguration);

    public abstract Void getEligibleMeasures(EligibleMeasuresCallback eligiblemeasurescallback);

    public abstract MeasureConfiguration getMeasureConfiguration(String s);

    public abstract void invitationPresented(MeasureConfiguration measureconfiguration);

    public abstract boolean isPastOnExitTimeout();

    public abstract boolean isPastReminderDate();

    public abstract boolean isPastRepeatDate();

    public abstract boolean isReinviteEnabled();

    public abstract void launchExitInvitation(MeasureConfiguration measureconfiguration);

    public abstract void launchInvitation(MeasureConfiguration measureconfiguration);

    public abstract void launchSurvey(MeasureConfiguration measureconfiguration);

    public abstract void logInviteAccepted(MeasureConfiguration measureconfiguration);

    public abstract void logInviteDeclined(MeasureConfiguration measureconfiguration);

    public abstract void logInviteShown(MeasureConfiguration measureconfiguration);

    public abstract boolean networkConnectionAvaliable();

    public abstract void resetCounters();

    public abstract void sendLocalNotification(MeasureConfiguration measureconfiguration);

    public abstract void setDeclineDate(Date date);

    public abstract void setExitNotificationDate(Date date);

    public abstract void setState(ITrackerState itrackerstate);

    public abstract boolean shouldInviteOnExit();

    public abstract boolean shouldUseLocalNotification();
}
