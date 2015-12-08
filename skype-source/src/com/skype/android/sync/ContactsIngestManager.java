// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.sync;

import com.skype.Account;
import com.skype.PROPKEY;
import com.skype.SkyLib;
import com.skype.android.addressbook.IngestionCallback;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.AnalyticsParameter;
import com.skype.android.analytics.AnalyticsParameterContainer;
import com.skype.android.app.OnForegroundChanged;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.event.EventBus;
import com.skype.android.inject.EventSubscriberBinder;
import com.skype.android.util.AccountUtil;
import com.skype.android.wakeup.DreamKeeper;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.sync:
//            ContactsIngestTask

public class ContactsIngestManager
{

    private static final int CLEANUP_INTERVAL = 0x927c0;
    private static final int DELAYED_RUN = 0x493e0;
    private static final Logger log = Logger.getLogger("ContactsIngestManager");
    private Provider accountProvider;
    private Analytics analytics;
    private ScheduledFuture cleanupFuture;
    private EcsConfiguration configuration;
    private ContactsIngestTask contactsIngestTask;
    private final Provider contactsIngestTaskProvider;
    private long currentTime;
    private DreamKeeper dreamKeeper;
    private ScheduledExecutorService executorService;
    private ScheduledFuture hasChangesFuture;
    private volatile boolean isUploadRunning;
    private SkyLib lib;
    private volatile boolean notYetSynced;
    private Provider userPrefsProvider;

    public ContactsIngestManager(Provider provider, EcsConfiguration ecsconfiguration, SkyLib skylib, Provider provider1, Analytics analytics1, Provider provider2, DreamKeeper dreamkeeper, 
            EventBus eventbus)
    {
        hasChangesFuture = null;
        cleanupFuture = null;
        contactsIngestTaskProvider = provider2;
        analytics = analytics1;
        userPrefsProvider = provider;
        configuration = ecsconfiguration;
        lib = skylib;
        accountProvider = provider1;
        dreamKeeper = dreamkeeper;
        executorService = Executors.newSingleThreadScheduledExecutor();
        (new EventSubscriberBinder(eventbus, this)).bind();
    }

    private void cleanupContactsIngest()
    {
        getContactsIngestTask().cleanup();
    }

    private void clearContactsIngestTask()
    {
        this;
        JVM INSTR monitorenter ;
        contactsIngestTask = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void contactsIngestProgress(int i, int j, int k)
    {
        log.info((new StringBuilder("Contacts ingest progress: updated=")).append(i).append(", queried=").append(j).append(", resolved=").append(k).toString());
        if (k > 0 && notYetSynced)
        {
            log.info("Forcing EAS contact sync now");
            lib.forceEasContactsSync();
            notYetSynced = false;
        }
    }

    private void contactsIngestTaskComplete(int i, int j, int k)
    {
        String s;
        com.skype.android.addressbook.ContactIngestionJNI.ERROR_CODE error_code;
        isUploadRunning = false;
        s = "USER_MSA";
        if (AccountUtil.b((Account)accountProvider.get()))
        {
            s = "USER_SKYPE";
        }
        error_code = com.skype.android.addressbook.ContactIngestionJNI.ERROR_CODE.fromInt(i);
        static final class _cls6
        {

            static final int $SwitchMap$com$skype$android$addressbook$ContactIngestionJNI$ERROR_CODE[];

            static 
            {
                $SwitchMap$com$skype$android$addressbook$ContactIngestionJNI$ERROR_CODE = new int[com.skype.android.addressbook.ContactIngestionJNI.ERROR_CODE.values().length];
                try
                {
                    $SwitchMap$com$skype$android$addressbook$ContactIngestionJNI$ERROR_CODE[com.skype.android.addressbook.ContactIngestionJNI.ERROR_CODE.OK.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$android$addressbook$ContactIngestionJNI$ERROR_CODE[com.skype.android.addressbook.ContactIngestionJNI.ERROR_CODE.IN_PROGRESS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$addressbook$ContactIngestionJNI$ERROR_CODE[com.skype.android.addressbook.ContactIngestionJNI.ERROR_CODE.LOOKUP_NOT_RECOMMENDED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls6..SwitchMap.com.skype.android.addressbook.ContactIngestionJNI.ERROR_CODE[error_code.ordinal()];
        JVM INSTR tableswitch 1 3: default 72
    //                   1 166
    //                   2 232
    //                   3 243;
           goto _L1 _L2 _L3 _L4
_L1:
        log.severe((new StringBuilder("Contact upload task failed: ")).append(i).append(" = ").append(error_code.toString()).toString());
        shortCircuitCompleteFail(s, error_code.toString(), j, k, AnalyticsEvent.bC);
_L6:
        removePendingCleanup();
        updateContactsScrapeLastRun();
        log.info((new StringBuilder("Contacts ingest completed. Elapsed time: ")).append(getContactsIngestTask().getElapsedTime()).toString());
        clearContactsIngestTask();
        return;
_L2:
        if (k > 0)
        {
            log.info("Forcing EAS contact sync now");
            lib.forceEasContactsSync();
        }
        log.info((new StringBuilder("Contact upload task completed successfully - numQueried: ")).append(j).append(", numResolved: ").append(k).toString());
        shortCircuitCompleteSuccess(s, j, k, AnalyticsEvent.bB);
        continue; /* Loop/switch isn't completed */
_L3:
        log.info("Contact upload task successful - upload activity will continue in the background");
        continue; /* Loop/switch isn't completed */
_L4:
        log.info("Contact upload task completed successfully - no new matchable data found");
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void enableShortCircuitOnServer()
    {
        log.info((new StringBuilder("Before ACCOUNT_SHORTCIRCUIT_SYNC: ")).append(getShortCircuitOnServer()).toString());
        ((Account)accountProvider.get()).setServersideIntProperty(PROPKEY.ACCOUNT_SHORTCIRCUIT_SYNC, 1);
        log.info((new StringBuilder("After ACCOUNT_SHORTCIRCUIT_SYNC: ")).append(getShortCircuitOnServer()).toString());
    }

    private ContactsIngestTask getContactsIngestTask()
    {
        this;
        JVM INSTR monitorenter ;
        ContactsIngestTask contactsingesttask;
        if (contactsIngestTask == null)
        {
            contactsIngestTask = (ContactsIngestTask)contactsIngestTaskProvider.get();
            contactsIngestTask.setExecutorService(executorService);
            contactsIngestTask.setIngestionCallback(new IngestionCallback() {

                final ContactsIngestManager this$0;

                public final void onBatchDone(int i, int j, int k)
                {
                    contactsIngestProgress(i, j, k);
                }

                public final void onLookupDone(int i, int j, int k)
                {
                    contactsIngestTaskComplete(i, j, k);
                }

            
            {
                this$0 = ContactsIngestManager.this;
                super();
            }
            });
        }
        contactsingesttask = contactsIngestTask;
        this;
        JVM INSTR monitorexit ;
        return contactsingesttask;
        Exception exception;
        exception;
        throw exception;
    }

    private long getContactsScrapeLastRun()
    {
        return getUserPreferences().getContactsScrapeLastRun();
    }

    private int getShortCircuitOnServer()
    {
        return ((Account)accountProvider.get()).getIntProperty(PROPKEY.ACCOUNT_SHORTCIRCUIT_SYNC);
    }

    private boolean isLoggedIn()
    {
        com.skype.Account.STATUS status = ((Account)accountProvider.get()).getStatusProp();
        return status == com.skype.Account.STATUS.LOGGED_IN || status == com.skype.Account.STATUS.LOGGED_IN_PARTIALLY;
    }

    private boolean isTimeToExecute()
    {
        currentTime = System.currentTimeMillis();
        return currentTime >= getContactsScrapeLastRun() + 0x5265c00L;
    }

    private void removePendingCleanup()
    {
        if (cleanupFuture != null && !cleanupFuture.isDone())
        {
            cleanupFuture.cancel(true);
        }
    }

    private void resetContactsScrapeLastRun()
    {
        getUserPreferences().updateContactsScrapeLastRun(0L);
    }

    private void runContactsScrape()
    {
        if (isUploadRunning)
        {
            log.info("ContactsIngest in progress.");
            return;
        }
        if (dreamKeeper.f())
        {
            log.info("ContactsIngest triggered while Skype is in background. Deferred until we are in foreground.");
            resetContactsScrapeLastRun();
            return;
        }
        if (isLoggedIn())
        {
            if (configuration.isShortCircuitEnabled() && getUserPreferences().isMnvCompleted())
            {
                isUploadRunning = true;
                notYetSynced = true;
                enableShortCircuitOnServer();
                scheduleOrphanCleanup();
                getContactsIngestTask().run();
                return;
            } else
            {
                log.info("User's phone number is not verified, not running contacts ingest task.");
                return;
            }
        } else
        {
            log.info("Not logged in, cannot run contacts ingest task.");
            return;
        }
    }

    private void scheduleOrphanCleanup()
    {
        removePendingCleanup();
        cleanupFuture = executorService.schedule(new Runnable() {

            final ContactsIngestManager this$0;

            public final void run()
            {
                cleanupContactsIngest();
            }

            
            {
                this$0 = ContactsIngestManager.this;
                super();
            }
        }, 0x927c0L, TimeUnit.MILLISECONDS);
    }

    private void shortCircuitCompleteFail(String s, String s1, int i, int j, AnalyticsEvent analyticsevent)
    {
        AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
        analyticsparametercontainer.a(AnalyticsParameter.w, s);
        analyticsparametercontainer.a(AnalyticsParameter.q, s1);
        analyticsparametercontainer.a(AnalyticsParameter.x, Integer.valueOf(i));
        analyticsparametercontainer.a(AnalyticsParameter.y, Integer.valueOf(j));
        analytics.a(analyticsevent, analyticsparametercontainer);
    }

    private void shortCircuitCompleteSuccess(String s, int i, int j, AnalyticsEvent analyticsevent)
    {
        AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
        analyticsparametercontainer.a(AnalyticsParameter.w, s);
        analyticsparametercontainer.a(AnalyticsParameter.x, Integer.valueOf(i));
        analyticsparametercontainer.a(AnalyticsParameter.y, Integer.valueOf(j));
        analytics.a(analyticsevent, analyticsparametercontainer);
    }

    private void updateContactsScrapeLastRun()
    {
        getUserPreferences().updateContactsScrapeLastRun(currentTime);
    }

    public void debugContactsScrape()
    {
        runNow();
    }

    public UserPreferences getUserPreferences()
    {
        return (UserPreferences)userPrefsProvider.get();
    }

    public boolean isRunning()
    {
        return isUploadRunning;
    }

    public void onEvent(OnForegroundChanged onforegroundchanged)
    {
        log.info((new StringBuilder("changed background mode: ")).append(onforegroundchanged.isForegrounded()).toString());
        if (onforegroundchanged.isForegrounded() && isTimeToExecute())
        {
            executorService.schedule(new Runnable() {

                final ContactsIngestManager this$0;

                public final void run()
                {
                    runNow();
                }

            
            {
                this$0 = ContactsIngestManager.this;
                super();
            }
            }, 0L, TimeUnit.MILLISECONDS);
        }
    }

    public void runDelayed()
    {
        if (hasChangesFuture != null && !hasChangesFuture.isDone())
        {
            hasChangesFuture.cancel(true);
        }
        hasChangesFuture = executorService.schedule(new Runnable() {

            final ContactsIngestManager this$0;

            public final void run()
            {
                runContactsScrape();
            }

            
            {
                this$0 = ContactsIngestManager.this;
                super();
            }
        }, 0x493e0L, TimeUnit.MILLISECONDS);
    }

    public void runNow()
    {
        log.info("runNow() -> submit()");
        executorService.submit(new Runnable() {

            final ContactsIngestManager this$0;

            public final void run()
            {
                runContactsScrape();
            }

            
            {
                this$0 = ContactsIngestManager.this;
                super();
            }
        });
    }





}
