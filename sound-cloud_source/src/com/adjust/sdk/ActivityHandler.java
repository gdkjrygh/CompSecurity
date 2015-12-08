// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.adjust.sdk:
//            IActivityHandler, AdjustFactory, AdjustAttribution, PackageBuilder, 
//            ILogger, ActivityState, IAttributionHandler, AdjustEvent, 
//            IPackageHandler, AdjustConfig, DeviceInfo, LogLevel, 
//            Util, TimerCycle, ActivityPackage

public class ActivityHandler extends HandlerThread
    implements IActivityHandler
{
    private class ReferrerClickTime
    {

        long clickTime;
        String referrer;
        final ActivityHandler this$0;

        ReferrerClickTime(String s, long l)
        {
            this$0 = ActivityHandler.this;
            super();
            referrer = s;
            clickTime = l;
        }
    }

    private static final class SessionHandler extends Handler
    {

        private static final int BASE_ADDRESS = 0x11bb6;
        private static final int DEEP_LINK = 0x11bbc;
        private static final int END = 0x11bb9;
        private static final int EVENT = 0x11bba;
        private static final int FINISH_TRACKING = 0x11bbb;
        private static final int INIT = 0x11bb7;
        private static final int SEND_REFERRER = 0x11bbd;
        private static final int START = 0x11bb8;
        private static final int TIMER_FIRED = 0x11bbf;
        private static final int UPDATE_STATUS = 0x11bbe;
        private final WeakReference sessionHandlerReference;

        public final void handleMessage(Message message)
        {
            super.handleMessage(message);
            ActivityHandler activityhandler = (ActivityHandler)sessionHandlerReference.get();
            if (activityhandler == null)
            {
                return;
            }
            switch (message.arg1)
            {
            default:
                return;

            case 72631: 
                activityhandler.initInternal();
                return;

            case 72632: 
                activityhandler.startInternal();
                return;

            case 72633: 
                activityhandler.endInternal();
                return;

            case 72634: 
                activityhandler.trackEventInternal((AdjustEvent)message.obj);
                return;

            case 72635: 
                activityhandler.finishedTrackingActivityInternal((JSONObject)message.obj);
                return;

            case 72636: 
                message = (UrlClickTime)message.obj;
                activityhandler.readOpenUrlInternal(((UrlClickTime) (message)).url, ((UrlClickTime) (message)).clickTime);
                return;

            case 72637: 
                message = (ReferrerClickTime)message.obj;
                activityhandler.sendReferrerInternal(((ReferrerClickTime) (message)).referrer, ((ReferrerClickTime) (message)).clickTime);
                return;

            case 72638: 
                activityhandler.updateStatusInternal();
                return;

            case 72639: 
                activityhandler.timerFiredInternal();
                break;
            }
        }

        protected SessionHandler(Looper looper, ActivityHandler activityhandler)
        {
            super(looper);
            sessionHandlerReference = new WeakReference(activityhandler);
        }
    }

    private class UrlClickTime
    {

        long clickTime;
        final ActivityHandler this$0;
        Uri url;

        UrlClickTime(Uri uri, long l)
        {
            this$0 = ActivityHandler.this;
            super();
            url = uri;
            clickTime = l;
        }
    }


    private static final String ACTIVITY_STATE_NAME = "Activity state";
    private static final String ADJUST_PREFIX = "adjust_";
    private static final String ATTRIBUTION_NAME = "Attribution";
    private static long SESSION_INTERVAL = 0L;
    private static long SUBSESSION_INTERVAL = 0L;
    private static long TIMER_INTERVAL = 0L;
    private static long TIMER_START = 0L;
    private static final String TIME_TRAVEL = "Time travel!";
    private ActivityState activityState;
    private AdjustConfig adjustConfig;
    private AdjustAttribution attribution;
    private IAttributionHandler attributionHandler;
    private DeviceInfo deviceInfo;
    private boolean enabled;
    private ILogger logger;
    private boolean offline;
    private IPackageHandler packageHandler;
    private SessionHandler sessionHandler;
    private TimerCycle timer;

    private ActivityHandler(AdjustConfig adjustconfig)
    {
        super("Adjust", 1);
        setDaemon(true);
        start();
        logger = AdjustFactory.getLogger();
        sessionHandler = new SessionHandler(getLooper(), this);
        enabled = true;
        init(adjustconfig);
        adjustconfig = Message.obtain();
        adjustconfig.arg1 = 0x11bb7;
        sessionHandler.sendMessage(adjustconfig);
    }

    private ActivityPackage buildQueryStringClickPackage(String s, String s1, long l)
    {
        boolean flag = false;
        if (s == null)
        {
            return null;
        }
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        AdjustAttribution adjustattribution = new AdjustAttribution();
        String as[] = s.split("&");
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            if (readQueryString(as[i], linkedhashmap, adjustattribution))
            {
                flag = true;
            }
        }

        if (!flag)
        {
            return null;
        }
        String s2 = (String)linkedhashmap.remove("reftag");
        long l1 = System.currentTimeMillis();
        PackageBuilder packagebuilder = new PackageBuilder(adjustConfig, deviceInfo, activityState, l1);
        packagebuilder.extraParameters = linkedhashmap;
        packagebuilder.attribution = adjustattribution;
        packagebuilder.reftag = s2;
        if (s1 == "reftag")
        {
            packagebuilder.referrer = s;
        }
        return packagebuilder.buildClickPackage(s1, l);
    }

    private boolean checkActivityState(ActivityState activitystate)
    {
        if (activitystate == null)
        {
            logger.error("Missing activity state.", new Object[0]);
            return false;
        } else
        {
            return true;
        }
    }

    private void checkAttributionState()
    {
        while (!checkActivityState(activityState) || activityState.subsessionCount <= 1 || attribution != null && !activityState.askingAttribution) 
        {
            return;
        }
        attributionHandler.getAttribution();
    }

    private boolean checkEvent(AdjustEvent adjustevent)
    {
        if (adjustevent == null)
        {
            logger.error("Event missing", new Object[0]);
            return false;
        }
        if (!adjustevent.isValid())
        {
            logger.error("Event not initialized correctly", new Object[0]);
            return false;
        } else
        {
            return true;
        }
    }

    public static boolean deleteActivityState(Context context)
    {
        return context.deleteFile("AdjustIoActivityState");
    }

    public static boolean deleteAttribution(Context context)
    {
        return context.deleteFile("AdjustAttribution");
    }

    private void endInternal()
    {
        packageHandler.pauseSending();
        attributionHandler.pauseSending();
        stopTimer();
        if (updateActivityState(System.currentTimeMillis()))
        {
            writeActivityState();
        }
    }

    private void finishedTrackingActivityInternal(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            return;
        } else
        {
            launchDeeplinkMain(jsonobject.optString("deeplink", null));
            attributionHandler.checkAttribution(jsonobject);
            return;
        }
    }

    public static ActivityHandler getInstance(AdjustConfig adjustconfig)
    {
label0:
        {
            if (adjustconfig == null)
            {
                AdjustFactory.getLogger().error("AdjustConfig missing", new Object[0]);
                return null;
            }
            if (!adjustconfig.isValid())
            {
                AdjustFactory.getLogger().error("AdjustConfig not initialized correctly", new Object[0]);
                return null;
            }
            if (adjustconfig.processName == null)
            {
                break label0;
            }
            int i = Process.myPid();
            Object obj = (ActivityManager)adjustconfig.context.getSystemService("activity");
            if (obj == null)
            {
                return null;
            }
            obj = ((ActivityManager) (obj)).getRunningAppProcesses().iterator();
            android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
            } while (runningappprocessinfo.pid != i);
            if (!runningappprocessinfo.processName.equalsIgnoreCase(adjustconfig.processName))
            {
                AdjustFactory.getLogger().info("Skipping initialization in background process (%s)", new Object[] {
                    runningappprocessinfo.processName
                });
                return null;
            }
        }
        return new ActivityHandler(adjustconfig);
    }

    private boolean hasChangedState(boolean flag, boolean flag1, String s, String s1)
    {
        if (flag != flag1)
        {
            return true;
        }
        if (flag)
        {
            logger.debug(s, new Object[0]);
            return false;
        } else
        {
            logger.debug(s1, new Object[0]);
            return false;
        }
    }

    private void initInternal()
    {
        TIMER_INTERVAL = AdjustFactory.getTimerInterval();
        TIMER_START = AdjustFactory.getTimerStart();
        SESSION_INTERVAL = AdjustFactory.getSessionInterval();
        SUBSESSION_INTERVAL = AdjustFactory.getSubsessionInterval();
        deviceInfo = new DeviceInfo(adjustConfig.context, adjustConfig.sdkPrefix);
        if ("production".equals(adjustConfig.environment))
        {
            logger.setLogLevel(LogLevel.ASSERT);
        } else
        {
            logger.setLogLevel(adjustConfig.logLevel);
        }
        if (adjustConfig.eventBufferingEnabled.booleanValue())
        {
            logger.info("Event buffering is enabled", new Object[0]);
        }
        if (Util.getPlayAdId(adjustConfig.context) == null)
        {
            logger.info("Unable to get Google Play Services Advertising ID at start time", new Object[0]);
        }
        if (adjustConfig.defaultTracker != null)
        {
            logger.info("Default tracker: '%s'", new Object[] {
                adjustConfig.defaultTracker
            });
        }
        if (adjustConfig.referrer != null)
        {
            sendReferrer(adjustConfig.referrer, adjustConfig.referrerClickTime);
        }
        readAttribution();
        readActivityState();
        packageHandler = AdjustFactory.getPackageHandler(this, adjustConfig.context, paused());
        attributionHandler = AdjustFactory.getAttributionHandler(this, getAttributionPackage(), paused(), adjustConfig.hasListener());
        timer = new TimerCycle(new _cls2(), TIMER_START, TIMER_INTERVAL);
    }

    private void launchAttributionListener()
    {
        if (adjustConfig.onAttributionChangedListener == null)
        {
            return;
        } else
        {
            (new Handler(adjustConfig.context.getMainLooper())).post(new _cls1());
            return;
        }
    }

    private void launchDeeplinkMain(String s)
    {
        if (s == null)
        {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(s));
        intent.setFlags(0x10000000);
        boolean flag;
        if (adjustConfig.context.getPackageManager().queryIntentActivities(intent, 0).size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            logger.error("Unable to open deep link (%s)", new Object[] {
                s
            });
            return;
        } else
        {
            logger.info("Open deep link (%s)", new Object[] {
                s
            });
            adjustConfig.context.startActivity(intent);
            return;
        }
    }

    private boolean paused()
    {
        return offline || !isEnabled();
    }

    private void processSession()
    {
        long l = System.currentTimeMillis();
        if (activityState == null)
        {
            activityState = new ActivityState();
            activityState.sessionCount = 1;
            transferSessionPackage(l);
            activityState.resetSessionAttributes(l);
            activityState.enabled = enabled;
            writeActivityState();
        } else
        {
            long l1 = l - activityState.lastActivity;
            if (l1 < 0L)
            {
                logger.error("Time travel!", new Object[0]);
                activityState.lastActivity = l;
                writeActivityState();
                return;
            }
            if (l1 > SESSION_INTERVAL)
            {
                ActivityState activitystate = activityState;
                activitystate.sessionCount = activitystate.sessionCount + 1;
                activityState.lastInterval = l1;
                transferSessionPackage(l);
                activityState.resetSessionAttributes(l);
                writeActivityState();
                return;
            }
            if (l1 > SUBSESSION_INTERVAL)
            {
                ActivityState activitystate1 = activityState;
                activitystate1.subsessionCount = activitystate1.subsessionCount + 1;
                activitystate1 = activityState;
                activitystate1.sessionLength = l1 + activitystate1.sessionLength;
                activityState.lastActivity = l;
                writeActivityState();
                logger.info("Started subsession %d of session %d", new Object[] {
                    Integer.valueOf(activityState.subsessionCount), Integer.valueOf(activityState.sessionCount)
                });
                return;
            }
        }
    }

    private void readActivityState()
    {
        activityState = (ActivityState)Util.readObject(adjustConfig.context, "AdjustIoActivityState", "Activity state");
    }

    private void readAttribution()
    {
        attribution = (AdjustAttribution)Util.readObject(adjustConfig.context, "AdjustAttribution", "Attribution");
    }

    private void readOpenUrlInternal(Uri uri, long l)
    {
        if (uri != null)
        {
            if ((uri = buildQueryStringClickPackage(uri.getQuery(), "deeplink", l)) != null)
            {
                packageHandler.addPackage(uri);
                return;
            }
        }
    }

    private boolean readQueryString(String s, Map map, AdjustAttribution adjustattribution)
    {
        String as[] = s.split("=");
        String s1;
        if (as.length == 2)
        {
            if ((s = as[0]).startsWith("adjust_") && (s1 = as[1]).length() != 0 && (s = s.substring(7)).length() != 0)
            {
                if (!trySetAttribution(adjustattribution, s, s1))
                {
                    map.put(s, s1);
                }
                return true;
            }
        }
        return false;
    }

    private void saveAttribution(AdjustAttribution adjustattribution)
    {
        attribution = adjustattribution;
        writeAttribution();
    }

    private void sendReferrerInternal(String s, long l)
    {
        s = buildQueryStringClickPackage(s, "reftag", l);
        if (s == null)
        {
            return;
        } else
        {
            packageHandler.addPackage(s);
            return;
        }
    }

    private void startInternal()
    {
        if (activityState != null && !activityState.enabled)
        {
            return;
        } else
        {
            updateStatusInternal();
            processSession();
            checkAttributionState();
            startTimer();
            return;
        }
    }

    private void startTimer()
    {
        if (paused())
        {
            return;
        } else
        {
            timer.start();
            return;
        }
    }

    private void stopTimer()
    {
        timer.suspend();
    }

    private void timerFired()
    {
        Message message = Message.obtain();
        message.arg1 = 0x11bbf;
        sessionHandler.sendMessage(message);
    }

    private void timerFiredInternal()
    {
        if (paused())
        {
            stopTimer();
        } else
        {
            logger.debug("Session timer fired", new Object[0]);
            packageHandler.sendFirstPackage();
            if (updateActivityState(System.currentTimeMillis()))
            {
                writeActivityState();
                return;
            }
        }
    }

    private void trackEventInternal(AdjustEvent adjustevent)
    {
        while (!checkActivityState(activityState) || !isEnabled() || !checkEvent(adjustevent)) 
        {
            return;
        }
        long l = System.currentTimeMillis();
        ActivityState activitystate = activityState;
        activitystate.eventCount = activitystate.eventCount + 1;
        updateActivityState(l);
        adjustevent = (new PackageBuilder(adjustConfig, deviceInfo, activityState, l)).buildEventPackage(adjustevent);
        packageHandler.addPackage(adjustevent);
        if (adjustConfig.eventBufferingEnabled.booleanValue())
        {
            logger.info("Buffered event %s", new Object[] {
                adjustevent.getSuffix()
            });
        } else
        {
            packageHandler.sendFirstPackage();
        }
        writeActivityState();
    }

    private void transferSessionPackage(long l)
    {
        ActivityPackage activitypackage = (new PackageBuilder(adjustConfig, deviceInfo, activityState, l)).buildSessionPackage();
        packageHandler.addPackage(activitypackage);
        packageHandler.sendFirstPackage();
    }

    private boolean trySetAttribution(AdjustAttribution adjustattribution, String s, String s1)
    {
        if (s.equals("tracker"))
        {
            adjustattribution.trackerName = s1;
            return true;
        }
        if (s.equals("campaign"))
        {
            adjustattribution.campaign = s1;
            return true;
        }
        if (s.equals("adgroup"))
        {
            adjustattribution.adgroup = s1;
            return true;
        }
        if (s.equals("creative"))
        {
            adjustattribution.creative = s1;
            return true;
        } else
        {
            return false;
        }
    }

    private boolean updateActivityState(long l)
    {
        long l1;
        if (checkActivityState(activityState))
        {
            if ((l1 = l - activityState.lastActivity) <= SESSION_INTERVAL)
            {
                activityState.lastActivity = l;
                if (l1 < 0L)
                {
                    logger.error("Time travel!", new Object[0]);
                } else
                {
                    ActivityState activitystate = activityState;
                    activitystate.sessionLength = activitystate.sessionLength + l1;
                    activitystate = activityState;
                    activitystate.timeSpent = l1 + activitystate.timeSpent;
                }
                return true;
            }
        }
        return false;
    }

    private void updateAttributionHandlerStatus()
    {
        if (paused())
        {
            attributionHandler.pauseSending();
            return;
        } else
        {
            attributionHandler.resumeSending();
            return;
        }
    }

    private void updatePackageHandlerStatus()
    {
        if (paused())
        {
            packageHandler.pauseSending();
            return;
        } else
        {
            packageHandler.resumeSending();
            return;
        }
    }

    private void updateStatus()
    {
        Message message = Message.obtain();
        message.arg1 = 0x11bbe;
        sessionHandler.sendMessage(message);
    }

    private void updateStatus(boolean flag, String s, String s1, String s2)
    {
        if (flag)
        {
            logger.info(s, new Object[0]);
            trackSubsessionEnd();
            return;
        }
        if (paused())
        {
            logger.info(s1, new Object[0]);
            return;
        } else
        {
            logger.info(s2, new Object[0]);
            trackSubsessionStart();
            return;
        }
    }

    private void updateStatusInternal()
    {
        updateAttributionHandlerStatus();
        updatePackageHandlerStatus();
    }

    private void writeActivityState()
    {
        this;
        JVM INSTR monitorenter ;
        Util.writeObject(activityState, adjustConfig.context, "AdjustIoActivityState", "Activity state");
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void writeAttribution()
    {
        Util.writeObject(attribution, adjustConfig.context, "AdjustAttribution", "Attribution");
    }

    public void finishedTrackingActivity(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            return;
        } else
        {
            Message message = Message.obtain();
            message.arg1 = 0x11bbb;
            message.obj = jsonobject;
            sessionHandler.sendMessage(message);
            return;
        }
    }

    public ActivityPackage getAttributionPackage()
    {
        long l = System.currentTimeMillis();
        return (new PackageBuilder(adjustConfig, deviceInfo, activityState, l)).buildAttributionPackage();
    }

    public void init(AdjustConfig adjustconfig)
    {
        adjustConfig = adjustconfig;
    }

    public boolean isEnabled()
    {
        if (activityState != null)
        {
            return activityState.enabled;
        } else
        {
            return enabled;
        }
    }

    public void readOpenUrl(Uri uri, long l)
    {
        Message message = Message.obtain();
        message.arg1 = 0x11bbc;
        message.obj = new UrlClickTime(uri, l);
        sessionHandler.sendMessage(message);
    }

    public void sendReferrer(String s, long l)
    {
        Message message = Message.obtain();
        message.arg1 = 0x11bbd;
        message.obj = new ReferrerClickTime(s, l);
        sessionHandler.sendMessage(message);
    }

    public void setAskingAttribution(boolean flag)
    {
        activityState.askingAttribution = flag;
        writeActivityState();
    }

    public void setEnabled(boolean flag)
    {
        if (!hasChangedState(isEnabled(), flag, "Adjust already enabled", "Adjust already disabled"))
        {
            return;
        }
        enabled = flag;
        if (activityState == null)
        {
            trackSubsessionStart();
        } else
        {
            activityState.enabled = flag;
            writeActivityState();
        }
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        updateStatus(flag, "Pausing package handler and attribution handler to disable the SDK", "Package and attribution handler remain paused due to the SDK is offline", "Resuming package handler and attribution handler to enabled the SDK");
    }

    public void setOfflineMode(boolean flag)
    {
        if (!hasChangedState(offline, flag, "Adjust already in offline mode", "Adjust already in online mode"))
        {
            return;
        }
        offline = flag;
        if (activityState == null)
        {
            trackSubsessionStart();
        }
        updateStatus(flag, "Pausing package and attribution handler to put in offline mode", "Package and attribution handler remain paused because the SDK is disabled", "Resuming package handler and attribution handler to put in online mode");
    }

    public void trackEvent(AdjustEvent adjustevent)
    {
        if (activityState == null)
        {
            trackSubsessionStart();
        }
        Message message = Message.obtain();
        message.arg1 = 0x11bba;
        message.obj = adjustevent;
        sessionHandler.sendMessage(message);
    }

    public void trackSubsessionEnd()
    {
        Message message = Message.obtain();
        message.arg1 = 0x11bb9;
        sessionHandler.sendMessage(message);
    }

    public void trackSubsessionStart()
    {
        Message message = Message.obtain();
        message.arg1 = 0x11bb8;
        sessionHandler.sendMessage(message);
    }

    public boolean tryUpdateAttribution(AdjustAttribution adjustattribution)
    {
        while (adjustattribution == null || adjustattribution.equals(attribution)) 
        {
            return false;
        }
        saveAttribution(adjustattribution);
        launchAttributionListener();
        return true;
    }













    private class _cls2
        implements Runnable
    {

        final ActivityHandler this$0;

        public void run()
        {
            timerFired();
        }

        _cls2()
        {
            this$0 = ActivityHandler.this;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final ActivityHandler this$0;

        public void run()
        {
            adjustConfig.onAttributionChangedListener.onAttributionChanged(attribution);
        }

        _cls1()
        {
            this$0 = ActivityHandler.this;
            super();
        }
    }

}
