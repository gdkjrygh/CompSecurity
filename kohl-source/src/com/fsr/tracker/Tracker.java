// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker;

import com.fsr.tracker.domain.Configuration;
import com.fsr.tracker.domain.MeasureConfiguration;
import com.fsr.tracker.domain.SignificantEvent;
import com.fsr.tracker.service.Callback;
import com.fsr.tracker.service.ITrackerServiceClient;
import com.fsr.tracker.state.ExitSurveyDetailsPresented;
import com.fsr.tracker.state.ExitSurveyInvited;
import com.fsr.tracker.state.ITrackerState;
import com.fsr.tracker.state.ITrackerStateContext;
import com.fsr.tracker.state.InviteDeclinedState;
import com.fsr.tracker.state.InvitedState;
import com.fsr.tracker.state.PendingExitSurvey;
import com.fsr.tracker.state.PendingExitSurveyNotification;
import com.fsr.tracker.state.PendingReinviteState;
import com.fsr.tracker.state.PendingRepeatState;
import com.fsr.tracker.state.SurveyAbortedState;
import com.fsr.tracker.state.SurveyCompletedState;
import com.fsr.tracker.state.SurveyPresentedState;
import com.fsr.tracker.state.TrackingState;
import com.fsr.tracker.state.TrackingStates;
import fs.org.slf4j.Logger;
import fs.org.slf4j.LoggerFactory;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.UUID;

// Referenced classes of package com.fsr.tracker:
//            ITracker, PersistedState, TrackerEventListener, PersistenceProvider, 
//            TrackerViewPresenter, LogEvent, ITrackerLogger, SurveyUrlBuilder, 
//            StringsProvider, NotificationService, FsrSettingsProvider

public class Tracker
    implements ITracker, ITrackerStateContext
{

    private Configuration configuration;
    private TrackerEventListener eventListener;
    private ITrackerLogger fsEventLogger;
    private final Logger logger;
    private NotificationService notificationService;
    private PersistedState persistedState;
    private PersistenceProvider persistenceProvider;
    private ITrackerServiceClient serviceClient;
    private FsrSettingsProvider settings;
    private ITrackerState state;
    private StringsProvider stringsProvider;
    private TrackerViewPresenter viewPresenter;

    public Tracker(PersistedState persistedstate, Configuration configuration1, PersistenceProvider persistenceprovider, ITrackerLogger itrackerlogger, ITrackerServiceClient itrackerserviceclient, StringsProvider stringsprovider, FsrSettingsProvider fsrsettingsprovider)
    {
        logger = LoggerFactory.getLogger("ForeSee Trigger Code");
        persistedState = persistedstate;
        configuration = configuration1;
        fsEventLogger = itrackerlogger;
        persistenceProvider = persistenceprovider;
        serviceClient = itrackerserviceclient;
        stringsProvider = stringsprovider;
        settings = fsrsettingsprovider;
    }

    public Tracker(Configuration configuration1, PersistenceProvider persistenceprovider, ITrackerLogger itrackerlogger, ITrackerServiceClient itrackerserviceclient, StringsProvider stringsprovider, FsrSettingsProvider fsrsettingsprovider)
    {
        this(new PersistedState(), configuration1, persistenceprovider, itrackerlogger, itrackerserviceclient, stringsprovider, fsrsettingsprovider);
    }

    private void initializeTrackerState()
    {
        logger.info("Initializing state to {}", persistedState.getState());
        static class _cls2
        {

            static final int $SwitchMap$com$fsr$tracker$domain$Configuration$LocalNotificationSurvey[];
            static final int $SwitchMap$com$fsr$tracker$state$TrackingStates[];

            static 
            {
                $SwitchMap$com$fsr$tracker$domain$Configuration$LocalNotificationSurvey = new int[com.fsr.tracker.domain.Configuration.LocalNotificationSurvey.values().length];
                try
                {
                    $SwitchMap$com$fsr$tracker$domain$Configuration$LocalNotificationSurvey[com.fsr.tracker.domain.Configuration.LocalNotificationSurvey.IN_BROWSER.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$fsr$tracker$domain$Configuration$LocalNotificationSurvey[com.fsr.tracker.domain.Configuration.LocalNotificationSurvey.IN_APP.ordinal()] = 2;
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

        switch (_cls2..SwitchMap.com.fsr.tracker.state.TrackingStates[persistedState.getState().ordinal()])
        {
        default:
            state = null;
            return;

        case 1: // '\001'
            state = new TrackingState();
            return;

        case 2: // '\002'
            state = new InvitedState(getMeasureConfiguration(persistedState.getTriggeredMeasure()));
            return;

        case 3: // '\003'
            state = new ExitSurveyInvited(getMeasureConfiguration(persistedState.getTriggeredMeasure()));
            return;

        case 4: // '\004'
            state = new ExitSurveyDetailsPresented(getMeasureConfiguration(persistedState.getTriggeredMeasure()));
            return;

        case 5: // '\005'
            state = new PendingExitSurveyNotification(getMeasureConfiguration(persistedState.getTriggeredMeasure()));
            return;

        case 6: // '\006'
            state = new InviteDeclinedState();
            return;

        case 7: // '\007'
            state = new SurveyPresentedState(getMeasureConfiguration(persistedState.getTriggeredMeasure()));
            return;

        case 8: // '\b'
            state = new SurveyCompletedState();
            return;

        case 9: // '\t'
            state = new SurveyAbortedState();
            return;

        case 10: // '\n'
            state = new PendingRepeatState();
            return;

        case 11: // '\013'
            state = new PendingReinviteState();
            return;

        case 12: // '\f'
            state = new PendingExitSurvey();
            break;
        }
    }

    private void updatePersistedState()
    {
        persistedState.setState(state.getStateId());
    }

    public void abortSurvey()
    {
        state.onSurveyAborted(this);
        logger.info("Survey aborted");
    }

    public void abortSurvey(MeasureConfiguration measureconfiguration)
    {
        if (eventListener != null)
        {
            eventListener.onSurveyAborted(measureconfiguration);
        }
    }

    public void acceptInvitation()
    {
        state.onInvitationAccepted(this);
        persistenceProvider.persistState(persistedState);
        logger.info("Invitation accepted");
    }

    public void acceptInvitation(MeasureConfiguration measureconfiguration)
    {
        if (eventListener != null)
        {
            eventListener.onInviteAccepted(measureconfiguration);
        }
    }

    public void applicationExited()
    {
        logger.info("Exiting application");
        state.onApplicationExit(this);
    }

    public void applicationLaunched()
    {
        int i = persistedState.getLaunchCount();
        if (i == 0)
        {
            persistedState.setFirstLaunchDate(new Date());
            String s = UUID.randomUUID().toString();
            persistedState.setRespondentId(s);
        }
        persistedState.setLaunchCount(i + 1);
        persistenceProvider.persistState(persistedState);
        logger.info("Application launched, launch count = {}", Integer.valueOf(persistedState.getLaunchCount()));
    }

    public void checkState()
    {
        state.checkState(this);
    }

    public void completeSurvey()
    {
        persistedState.setSurveyCompletedDate(new Date());
        persistedState.setSurveyCompleted(true);
        persistenceProvider.persistState(persistedState);
        state.onSurveyCompleted(this);
        logger.info("Survey completed");
    }

    public void completeSurvey(MeasureConfiguration measureconfiguration)
    {
        if (eventListener != null)
        {
            eventListener.onSurveyCompleted(measureconfiguration);
        }
    }

    public void declineInvitation()
    {
        state.onInvitationDeclined(this);
        logger.info("Invitation declined");
    }

    public void declineInvitation(MeasureConfiguration measureconfiguration)
    {
        if (eventListener != null)
        {
            eventListener.onInviteDeclined(measureconfiguration);
        }
    }

    public Void getEligibleMeasures(final com.fsr.tracker.state.ITrackerStateContext.EligibleMeasuresCallback callback)
    {
        final TreeSet result = new TreeSet();
        ArrayList arraylist = new ArrayList();
        Iterator iterator = configuration.getMeasureConfigs().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            MeasureConfiguration measureconfiguration = (MeasureConfiguration)iterator.next();
            if (measureconfiguration.isEligible(persistedState.getLaunchCount(), persistedState.getFirstLaunchDate(), persistedState.getSignificantEvents()))
            {
                arraylist.add(measureconfiguration);
            }
        } while (true);
        if (arraylist.isEmpty())
        {
            callback.onComplete(null);
            return null;
        }
        if (!configuration.isDebug())
        {
            serviceClient.checkShouldInvite(new Callback() {

                final Tracker this$0;
                final com.fsr.tracker.state.ITrackerStateContext.EligibleMeasuresCallback val$callback;
                final SortedSet val$result;

                public volatile void onComplete(Object obj)
                {
                    onComplete((SortedMap)obj);
                }

                public void onComplete(SortedMap sortedmap)
                {
                    sortedmap = sortedmap.entrySet().iterator();
                    do
                    {
                        if (!sortedmap.hasNext())
                        {
                            break;
                        }
                        Object obj = (java.util.Map.Entry)sortedmap.next();
                        MeasureConfiguration measureconfiguration1 = (MeasureConfiguration)((java.util.Map.Entry) (obj)).getKey();
                        obj = (Boolean)((java.util.Map.Entry) (obj)).getValue();
                        if (eventListener != null)
                        {
                            eventListener.onSamplingCheckCompleted(measureconfiguration1, ((Boolean) (obj)).booleanValue());
                        }
                        if (((Boolean) (obj)).booleanValue())
                        {
                            result.add(measureconfiguration1);
                        }
                    } while (true);
                    if (result.size() == 0)
                    {
                        callback.onReturnedNoEligibleMeasures();
                        return;
                    } else
                    {
                        callback.onComplete(result);
                        return;
                    }
                }

                public void onFailure(Throwable throwable)
                {
                    logger.error("ForeSee Trigger Code", throwable.getMessage(), throwable);
                    callback.onFailure(throwable);
                }

            
            {
                this$0 = Tracker.this;
                result = sortedset;
                callback = eligiblemeasurescallback;
                super();
            }
            }, arraylist);
            return null;
        } else
        {
            result.addAll(arraylist);
            callback.onComplete(result);
            return null;
        }
    }

    public MeasureConfiguration getMeasureConfiguration(String s)
    {
        return configuration.findMeasureByName(s);
    }

    public String getRespondentId()
    {
        return persistedState.getRespondentId();
    }

    public PersistedState getState()
    {
        return persistedState;
    }

    public PersistedState getTrackerState()
    {
        return persistedState;
    }

    public TrackerViewPresenter getViewPresenter()
    {
        return viewPresenter;
    }

    public void incrementSignificantEventsCountWithKey(String s)
    {
        SignificantEvent significantevent = (SignificantEvent)persistedState.getSignificantEvents().get(s);
        if (significantevent == null)
        {
            significantevent = new SignificantEvent(s);
            significantevent.incrementCount();
            persistedState.getSignificantEvents().put(s, significantevent);
        } else
        {
            significantevent.incrementCount();
        }
        persistenceProvider.persistState(persistedState);
        logger.info("Significant event ({}) count incremented. Count = {}", s, persistedState.getSignificantEvents().get(s));
    }

    public void initialize()
    {
    }

    public void initializeWithState(PersistedState persistedstate)
    {
        persistedState = persistedstate;
        initialize();
        initializeTrackerState();
    }

    public void invitationPresented(MeasureConfiguration measureconfiguration)
    {
        if (eventListener != null)
        {
            eventListener.onInvitePresented(measureconfiguration);
        }
    }

    public boolean isPastOnExitTimeout()
    {
        com.fsr.util.Date date = new com.fsr.util.Date(persistedState.getExitNotificationDate());
        date.addMinutes(configuration.resolveExitExpiryMinutes());
        return (new com.fsr.util.Date()).isAfter(date);
    }

    public boolean isPastReminderDate()
    {
        Date date = persistedState.getSurveyDeclinedDate();
        if (date != null)
        {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(12, configuration.resolveInviteRepeatMinutes());
            if (!(new com.fsr.util.Date()).after(calendar.getTime()))
            {
                return false;
            }
        }
        return true;
    }

    public boolean isPastRepeatDate()
    {
        if (persistedState.getSurveyCompletedDate() != null)
        {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(persistedState.getSurveyCompletedDate());
            calendar.add(12, configuration.resolveSurveyRepeatMinutes());
            if ((new com.fsr.util.Date()).after(calendar.getTime()))
            {
                return true;
            }
        }
        return false;
    }

    public boolean isReinviteEnabled()
    {
        return configuration.supportsReinvite();
    }

    public void launchExitInvitation(MeasureConfiguration measureconfiguration)
    {
        persistedState.setTriggeredMeasure(measureconfiguration.getName());
        persistenceProvider.persistState(persistedState);
        if (serviceClient.connectionAvailable())
        {
            viewPresenter.ShowOnExitInvite(measureconfiguration);
            fsEventLogger.transmitLogEvent(LogEvent.inviteShown(persistedState.getRespondentId(), measureconfiguration));
        }
    }

    public void launchInvitation(MeasureConfiguration measureconfiguration)
    {
        persistedState.setTriggeredMeasure(measureconfiguration.getName());
        persistenceProvider.persistState(persistedState);
        if (serviceClient.connectionAvailable())
        {
            viewPresenter.ShowInvite(measureconfiguration);
            fsEventLogger.transmitLogEvent(LogEvent.inviteShown(persistedState.getRespondentId(), measureconfiguration));
        }
    }

    public void launchSurvey(MeasureConfiguration measureconfiguration)
    {
        persistedState.setTriggeredMeasure(measureconfiguration.getName());
        persistenceProvider.persistState(persistedState);
        viewPresenter.ShowSurvey(measureconfiguration);
    }

    public void logInviteAccepted(MeasureConfiguration measureconfiguration)
    {
        fsEventLogger.transmitLogEvent(LogEvent.inviteAccepted(persistedState.getRespondentId(), measureconfiguration));
    }

    public void logInviteDeclined(MeasureConfiguration measureconfiguration)
    {
        fsEventLogger.transmitLogEvent(LogEvent.inviteDeclined(persistedState.getRespondentId(), measureconfiguration));
    }

    public void logInviteShown(MeasureConfiguration measureconfiguration)
    {
        throw new RuntimeException("not implemented");
    }

    public boolean networkConnectionAvaliable()
    {
        return serviceClient.connectionAvailable();
    }

    public void onNetworkDisconnected()
    {
        state.onNetworkDisconnected(this);
    }

    public void reset()
    {
        persistedState.reset();
        persistenceProvider.persistState(persistedState);
        initializeWithState(persistedState);
    }

    public void resetCounters()
    {
        persistedState.resetCounters();
        persistenceProvider.persistState(persistedState);
        initializeWithState(persistedState);
    }

    public void sendLocalNotification(MeasureConfiguration measureconfiguration)
    {
        if (notificationService == null) goto _L2; else goto _L1
_L1:
        String s = configuration.getSurveyUrlBase();
        s = SurveyUrlBuilder.buildSurveyUrl(s, configuration.getClientId(), measureconfiguration.getSurveyId(), configuration.getCpps(), configuration.getQueryStringParams());
        _cls2..SwitchMap.com.fsr.tracker.domain.Configuration.LocalNotificationSurvey[configuration.getLocalNotificationSurvey().ordinal()];
        JVM INSTR tableswitch 1 2: default 172
    //                   1 80
    //                   2 129;
           goto _L2 _L3 _L4
_L3:
        notificationService.notifyInBrowser(stringsProvider.getOnExitNotificationTitle(), stringsProvider.getOnExitNotificationText(), s, configuration.getNotificationIconName(), configuration.getNotificationLayoutName());
        return;
_L4:
        try
        {
            notificationService.notifyInApp(stringsProvider.getOnExitNotificationTitle(), stringsProvider.getOnExitNotificationText(), measureconfiguration, configuration.getNotificationIconName(), configuration.getNotificationLayoutName());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MeasureConfiguration measureconfiguration)
        {
            measureconfiguration.printStackTrace();
            return;
        }
_L2:
    }

    public void setDeclineDate(Date date)
    {
        persistedState.setSurveyDeclinedDate(date);
        persistedState.setSurveyDeclined(true);
        persistenceProvider.persistState(persistedState);
    }

    public void setExitNotificationDate(Date date)
    {
        persistedState.setExitNotificationDate(date);
        persistenceProvider.persistState(persistedState);
    }

    public void setFsEventLogger(ITrackerLogger itrackerlogger)
    {
        fsEventLogger = itrackerlogger;
    }

    public void setLaunchDate(Date date)
    {
        persistedState.setFirstLaunchDate(date);
        persistenceProvider.persistState(persistedState);
    }

    public void setNotificationService(NotificationService notificationservice)
    {
        notificationService = notificationservice;
    }

    public void setRespondentId(String s)
    {
        persistedState.setRespondentId(s);
        persistenceProvider.persistState(persistedState);
    }

    public void setState(ITrackerState itrackerstate)
    {
        ITrackerState itrackerstate1 = state;
        state = itrackerstate;
        updatePersistedState();
        if (itrackerstate1 != state)
        {
            logger.info("Entering state: {} from {}", state.getClass().getName(), itrackerstate1.getClass().getName());
            state.checkState(this);
            persistedState.setState(state.getStateId());
            if (state.shouldPersist())
            {
                persistenceProvider.persistState(persistedState);
            }
        }
    }

    public void setTrackerEventListener(TrackerEventListener trackereventlistener)
    {
        eventListener = trackereventlistener;
    }

    public void setViewPresenter(TrackerViewPresenter trackerviewpresenter)
    {
        viewPresenter = trackerviewpresenter;
    }

    public boolean shouldInviteOnExit()
    {
        return configuration.shouldInviteOnExit();
    }

    public boolean shouldUseLocalNotification()
    {
        return configuration.shouldUseLocalNotification();
    }

    public void triggerInvitation(String s)
    {
        state.triggerInvitation(s, this);
    }

    public void triggerSurvey(String s)
    {
        state.triggerSurvey(s, this);
    }


}
