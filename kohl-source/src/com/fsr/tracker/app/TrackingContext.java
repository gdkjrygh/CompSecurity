// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.app;

import android.app.Activity;
import android.app.Application;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Pair;
import android.view.Display;
import android.view.WindowManager;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.android.LogcatAppender;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import com.fsr.tracker.ITracker;
import com.fsr.tracker.ITrackerLogger;
import com.fsr.tracker.PersistedState;
import com.fsr.tracker.PersistenceProvider;
import com.fsr.tracker.StringsProvider;
import com.fsr.tracker.Tracker;
import com.fsr.tracker.TrackerEventListener;
import com.fsr.tracker.domain.Configuration;
import com.fsr.tracker.services.NotificationServiceImpl;
import com.fsr.tracker.services.TrackerServiceClient;
import com.fsr.tracker.util.FsrSettings;
import fs.org.slf4j.LoggerFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

// Referenced classes of package com.fsr.tracker.app:
//            TrackerLoader, DefaultTrackerViewPresenter, DefaultStringsProvider, DefaultTrackerLogger, 
//            EventPublisher

public class TrackingContext
    implements PersistenceProvider
{

    private static TrackingContext instance;
    private String apiKey;
    private ContextWrapper appContext;
    private Configuration configuration;
    private StringsProvider stringsProvider;
    private ITracker tracker;

    private TrackingContext()
    {
    }

    public static TrackingContext Instance()
    {
        if (instance == null)
        {
            Log.e("FORESEE_TRIGGER", "Tracking context has not been initialized. Please call TrackingContext.start() to initialize the TrackingContext");
            throw new RuntimeException("Tracking context has not been initialized. Please call TrackingContext.start() to initialize the TrackingContext before calling TrackingContext.Instance()");
        } else
        {
            return instance;
        }
    }

    private Pair getPhysicalScreenSize(DisplayMetrics displaymetrics)
    {
        return new Pair(Integer.valueOf((int)Math.round((double)((float)displaymetrics.widthPixels / displaymetrics.xdpi) * 2.54D * 10D)), Integer.valueOf((int)Math.round((double)((float)displaymetrics.heightPixels / displaymetrics.ydpi) * 2.54D * 10D)));
    }

    private void privateInitialize(ContextWrapper contextwrapper, Configuration configuration1, ITrackerLogger itrackerlogger, StringsProvider stringsprovider)
    {
        appContext = contextwrapper;
        configuration = configuration1;
        apiKey = configuration1.getClientId();
        stringsProvider = stringsprovider;
        Object obj;
        Object obj1;
        Pair pair;
        try
        {
            stringsprovider = TrackerLoader.LoadState(appContext.getSharedPreferences("TrackingState", 0));
        }
        // Misplaced declaration of an exception variable
        catch (ContextWrapper contextwrapper)
        {
            throw new RuntimeException(contextwrapper);
        }
        obj1 = new DisplayMetrics();
        obj = ((WindowManager)contextwrapper.getSystemService("window")).getDefaultDisplay();
        ((Display) (obj)).getMetrics(((DisplayMetrics) (obj1)));
        pair = getPhysicalScreenSize(((DisplayMetrics) (obj1)));
        obj1 = new FsrSettings();
        configuration1.addQueryStringParam("device", "android").addQueryStringParam("appRevision", ((FsrSettings) (obj1)).getAppRevision()).addCpp("trigger_version", ((FsrSettings) (obj1)).getTriggerVersion()).addCpp("os", "android").addCpp("os_version", android.os.Build.VERSION.RELEASE).addCpp("model_name", Build.MODEL).addCpp("brand_name", Build.MANUFACTURER).addCpp("resolution_width", Integer.valueOf(((Display) (obj)).getWidth())).addCpp("resolution_height", Integer.valueOf(((Display) (obj)).getHeight())).addCpp("screen_width", (Integer)pair.first).addCpp("screen_height", (Integer)pair.second);
        obj = (ConnectivityManager)contextwrapper.getSystemService("connectivity");
        tracker = new Tracker(stringsprovider, configuration1, this, itrackerlogger, new TrackerServiceClient(apiKey, configuration1.getServiceUrl(), ((ConnectivityManager) (obj))), stringsProvider, ((com.fsr.tracker.FsrSettingsProvider) (obj1)));
        tracker.initializeWithState(stringsprovider);
        tracker.setViewPresenter(new DefaultTrackerViewPresenter(contextwrapper));
        tracker.setNotificationService(new NotificationServiceImpl(contextwrapper));
    }

    private void showErrorDialog(final Activity activity, String s, String s1)
    {
        (new android.app.AlertDialog.Builder(activity)).setMessage(s1).setIcon(0x1080027).setTitle(s).setNeutralButton(stringsProvider.getAlertButtonText(), new android.content.DialogInterface.OnClickListener() {

            final TrackingContext this$0;
            final Activity val$activity;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
                activity.finish();
            }

            
            {
                this$0 = TrackingContext.this;
                activity = activity1;
                super();
            }
        }).show();
    }

    public static TrackingContext start(Application application, Configuration configuration1)
    {
        return start(application, configuration1, ((StringsProvider) (new DefaultStringsProvider())));
    }

    public static TrackingContext start(Application application, Configuration configuration1, StringsProvider stringsprovider)
    {
        if (instance == null)
        {
            instance = new TrackingContext();
            instance.privateInitialize(application, configuration1, new DefaultTrackerLogger(configuration1.getClientId(), configuration1.getLoggingUrl()), stringsprovider);
        } else
        {
            Log.w("FORESEE_TRIGGER", "An instance of TrackingContext has already been started. Please use TrackingContext.Instance() to obtain a reference to the TrackingContext.");
        }
        return instance;
    }

    public static void stop()
    {
        instance = null;
    }

    public void abortSurvey()
    {
        tracker.abortSurvey();
    }

    public void acceptInvitation()
    {
        tracker.acceptInvitation();
    }

    public void applicationExited()
    {
        tracker.applicationExited();
    }

    public void applicationLaunched()
    {
        tracker.applicationLaunched();
    }

    public void checkState()
    {
        tracker.checkState();
    }

    public void completeSurvey()
    {
        tracker.completeSurvey();
    }

    public void declineInvitation()
    {
        tracker.declineInvitation();
    }

    public String getApiKey()
    {
        return apiKey;
    }

    public Configuration getConfiguration()
    {
        return configuration;
    }

    public String getRespondentId()
    {
        return tracker.getRespondentId();
    }

    public PersistedState getState()
    {
        return tracker.getState();
    }

    public StringsProvider getStringsProvider()
    {
        return stringsProvider;
    }

    public String getSurveyUrlBase()
    {
        return configuration.getSurveyUrlBase();
    }

    public String getVersion()
    {
        Object obj = new Properties();
        InputStream inputstream;
        try
        {
            inputstream = getClass().getClassLoader().getResourceAsStream("version.properties");
        }
        catch (IOException ioexception)
        {
            return "n/a";
        }
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        ((Properties) (obj)).load(inputstream);
        inputstream.close();
        obj = ((Properties) (obj)).getProperty("triggerVersion");
        return ((String) (obj));
        return null;
    }

    public void incrementSignificantEventsCountWithKey(String s)
    {
        tracker.incrementSignificantEventsCountWithKey(s);
    }

    public void initLogging(Application application)
    {
        Log.d("ForeSee Trigger Code", "Initializing debug logging");
        final EventPublisher publisher = new EventPublisher(application);
        application = (LoggerContext)LoggerFactory.getILoggerFactory();
        application.reset();
        PatternLayoutEncoder patternlayoutencoder = new PatternLayoutEncoder();
        patternlayoutencoder.setContext(application);
        patternlayoutencoder.setPattern("[%thread] %msg%n");
        patternlayoutencoder.start();
        publisher = new LogcatAppender() {

            final TrackingContext this$0;
            final EventPublisher val$publisher;

            public void append(ILoggingEvent iloggingevent)
            {
                super.append(iloggingevent);
                if (iloggingevent.getLevel().isGreaterOrEqual(Level.DEBUG))
                {
                    iloggingevent = new EventPublisher.LifeCycleEvent(EventPublisher.LifeCycleEvent.EventType.DEBUG, iloggingevent.getFormattedMessage());
                    publisher.publishEvent(iloggingevent);
                }
            }

            public volatile void append(Object obj)
            {
                append((ILoggingEvent)obj);
            }

            
            {
                this$0 = TrackingContext.this;
                publisher = eventpublisher;
                super();
            }
        };
        publisher.setContext(application);
        publisher.setEncoder(patternlayoutencoder);
        publisher.start();
        ((Logger)LoggerFactory.getLogger("ROOT")).addAppender(publisher);
    }

    public void initialize(ContextWrapper contextwrapper, Configuration configuration1)
    {
        privateInitialize(contextwrapper, configuration1, new DefaultTrackerLogger(configuration1.getClientId(), configuration1.getLoggingUrl()), new DefaultStringsProvider());
    }

    public void initialize(ContextWrapper contextwrapper, Configuration configuration1, StringsProvider stringsprovider)
    {
        privateInitialize(contextwrapper, configuration1, new DefaultTrackerLogger(configuration1.getClientId(), configuration1.getLoggingUrl()), stringsprovider);
    }

    public void onNetworkDisconnected(Activity activity)
    {
        tracker.onNetworkDisconnected();
        showErrorDialog(activity, stringsProvider.getStringByKey("couldNotLoadSurveyTitle"), stringsProvider.getStringByKey("surveyRequestNotSent"));
    }

    public void persistState(PersistedState persistedstate)
    {
        try
        {
            TrackerLoader.SaveState(appContext.getSharedPreferences("TrackingState", 0), persistedstate);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PersistedState persistedstate)
        {
            Log.e(getClass().getName(), persistedstate.getMessage());
        }
        throw new RuntimeException();
    }

    public void resetAll()
    {
        tracker.reset();
    }

    public void resetState()
    {
        tracker.resetCounters();
    }

    public void setDeclineDate(Date date)
    {
        tracker.setDeclineDate(date);
    }

    public void setLaunchDate(Date date)
    {
        tracker.setLaunchDate(date);
    }

    public void setRespondentId(String s)
    {
        tracker.setRespondentId(s);
    }

    public void setStringsProvider(StringsProvider stringsprovider)
    {
        stringsProvider = stringsprovider;
    }

    public void setTrackerEventListener(TrackerEventListener trackereventlistener)
    {
        tracker.setTrackerEventListener(trackereventlistener);
    }

    public void triggerInvitation(String s)
    {
        tracker.triggerInvitation(s);
    }

    public void triggerSurvey(String s)
    {
        tracker.triggerSurvey(s);
    }
}
