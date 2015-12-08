// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ConfigurationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.amobee.pulse3d.Pulse3DView;
import com.amobee.richmedia.view.AmobeeView;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.amobee.adsdk:
//            Parameters, Log, AmobeeAdSpace, IAmobeeListener, 
//            AmobeeAdPlaceholder, NetworkHelper

public final class AdManager
{
    static class ClearCacheOlderThanWrapper
    {

        public static void createPulse3DAdapterFunc(Context context1, int i)
        {
            Pulse3DView.clearCacheOlderThan(context1, 30);
        }

        ClearCacheOlderThanWrapper()
        {
        }
    }

    public static final class DebugLevel extends Enum
    {

        public static final DebugLevel DEBUG;
        private static final DebugLevel ENUM$VALUES[];
        public static final DebugLevel NODEBUG;

        public static DebugLevel valueOf(String s)
        {
            return (DebugLevel)Enum.valueOf(com/amobee/adsdk/AdManager$DebugLevel, s);
        }

        public static DebugLevel[] values()
        {
            DebugLevel adebuglevel[] = ENUM$VALUES;
            int i = adebuglevel.length;
            DebugLevel adebuglevel1[] = new DebugLevel[i];
            System.arraycopy(adebuglevel, 0, adebuglevel1, 0, i);
            return adebuglevel1;
        }

        static 
        {
            DEBUG = new DebugLevel("DEBUG", 0);
            NODEBUG = new DebugLevel("NODEBUG", 1);
            ENUM$VALUES = (new DebugLevel[] {
                DEBUG, NODEBUG
            });
        }

        private DebugLevel(String s, int i)
        {
            super(s, i);
        }
    }

    static final class SdkMode extends Enum
    {

        private static final SdkMode ENUM$VALUES[];
        public static final SdkMode MANUAL;
        public static final SdkMode TIMER;

        public static SdkMode valueOf(String s)
        {
            return (SdkMode)Enum.valueOf(com/amobee/adsdk/AdManager$SdkMode, s);
        }

        public static SdkMode[] values()
        {
            SdkMode asdkmode[] = ENUM$VALUES;
            int i = asdkmode.length;
            SdkMode asdkmode1[] = new SdkMode[i];
            System.arraycopy(asdkmode, 0, asdkmode1, 0, i);
            return asdkmode1;
        }

        static 
        {
            MANUAL = new SdkMode("MANUAL", 0);
            TIMER = new SdkMode("TIMER", 1);
            ENUM$VALUES = (new SdkMode[] {
                MANUAL, TIMER
            });
        }

        private SdkMode(String s, int i)
        {
            super(s, i);
        }
    }


    static final String ADMOB = "adMob";
    static final String ADMOB_PKG = "com.google.ads.AdView";
    static final String AMOBEE = "amobee";
    private static final double DEFAULT_DENSITY = 1.5D;
    private static final int DEFAULT_REFRESH_TIME = 30;
    static final String GMS_ADS_PKG = "com.google.android.gms.ads.AdView";
    private static int HONEYCOMB_MR2 = 0;
    static final String MILLENNIAL = "clMmi";
    static final String MILLENNIAL_PKG = "com.millennialmedia.android.MMAdView";
    private static final int MINIMUM_REFRESH_TIME = 10;
    private static final int MINI_TABLET_WIDTH = 530;
    static final String PACKAGE = "com.amobee.adsdk";
    private static long SESSION_ID = 0L;
    static boolean SHOULD_SEND_ANDROID_ID = false;
    static boolean SHOULD_SEND_IMEI = false;
    private static final int TABLET_WIDTH = 720;
    public static final String TAG = "[a\u2022mo\u2022bee]";
    static String amobeeIncFullScreenNW;
    public static DebugLevel debugLevel;
    static WindowManager mWindowManager;
    private static AdManager m_instance;
    static boolean pulse3dSupport = false;
    static String pulse3dVersionString = "2";
    static final Object sharedPreferanceLocker = new Object();
    String amobeeIncNW;
    private IAmobeeListener amobeeListener;
    private Context context;
    SdkMode currentMode;
    boolean isExpanded;
    private boolean isTimerActive;
    private String mPostitialAdSpace;
    private boolean mUserGestureRequiredToOpenAds;
    int m_lastRefreshTime;
    private Parameters m_parameters;
    private int m_secondsBetweenAdcalls;
    private Timer m_timer;
    private String notificationServerURL;
    private String passbackURL;
    private ArrayList placeholders;
    private String serverURL;

    private AdManager(Context context1)
    {
        currentMode = SdkMode.MANUAL;
        isExpanded = false;
        m_lastRefreshTime = 0;
        m_secondsBetweenAdcalls = 0;
        isTimerActive = false;
        mUserGestureRequiredToOpenAds = false;
        amobeeListener = new IAmobeeListener() {

            final AdManager this$0;

            public void amobeeOnAdFailed(AmobeeAdPlaceholder amobeeadplaceholder)
            {
            }

            public void amobeeOnAdRecieved(AmobeeAdPlaceholder amobeeadplaceholder)
            {
            }

            public void amobeeOnError()
            {
            }

            public void amobeeOnLeavingApplication(AmobeeAdPlaceholder amobeeadplaceholder)
            {
            }

            public void amobeeOnOverlay(AmobeeAdPlaceholder amobeeadplaceholder)
            {
            }

            public void amobeeOnOverlayDismissed(AmobeeAdPlaceholder amobeeadplaceholder)
            {
            }

            
            {
                this$0 = AdManager.this;
                super();
            }
        };
        context = context1;
        includePulse3D();
        m_parameters = new Parameters(context1);
        placeholders = new ArrayList();
        includeNetworks();
        SESSION_ID = System.currentTimeMillis();
    }

    static void clearCacheOlderThan(Context context1, int i)
    {
        ClearCacheOlderThanWrapper.createPulse3DAdapterFunc(context1, i);
    }

    static boolean doesClassExist(String s)
    {
        try
        {
            Class.forName(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return true;
    }

    public static float getDensity(Context context1)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((WindowManager)context1.getSystemService("window")).getDefaultDisplay().getMetrics(displaymetrics);
        return displaymetrics.density;
    }

    public static int getDensityDpi(Context context1)
    {
        int i = 160;
        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((WindowManager)context1.getSystemService("window")).getDefaultDisplay().getMetrics(displaymetrics);
        if (displaymetrics != null)
        {
            i = displaymetrics.densityDpi;
        }
        return i;
    }

    static AdManager getInstance()
    {
        com/amobee/adsdk/AdManager;
        JVM INSTR monitorenter ;
        AdManager admanager = m_instance;
        com/amobee/adsdk/AdManager;
        JVM INSTR monitorexit ;
        return admanager;
        Exception exception;
        exception;
        throw exception;
    }

    public static AdManager getInstance(Context context1)
    {
        com/amobee/adsdk/AdManager;
        JVM INSTR monitorenter ;
        if (m_instance == null)
        {
            m_instance = new AdManager(context1);
        }
        if (context1 == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        m_instance.context = context1;
        context1 = m_instance;
        com/amobee/adsdk/AdManager;
        JVM INSTR monitorexit ;
        return context1;
        context1;
        throw context1;
    }

    static int getOrientation(Context context1)
    {
        if (context1 == null) goto _L2; else goto _L1
_L1:
        mWindowManager = (WindowManager)context1.getSystemService("window");
        mWindowManager.getDefaultDisplay().getOrientation();
        JVM INSTR tableswitch 0 3: default 56
    //                   0 58
    //                   1 60
    //                   2 63
    //                   3 67;
           goto _L2 _L3 _L4 _L5 _L6
_L2:
        return -1;
_L3:
        return 0;
_L4:
        return 90;
_L5:
        return 180;
_L6:
        return 270;
    }

    static Point getScreenSize(Context context1)
    {
        mWindowManager = (WindowManager)context1.getSystemService("window");
        context1 = mWindowManager.getDefaultDisplay();
        Point point = new Point();
        point.x = context1.getWidth();
        point.y = context1.getHeight();
        return point;
    }

    public static int getStatusBarHeight(Context context1)
    {
        if (!(context1 instanceof Activity))
        {
            return 0;
        }
        boolean flag;
        if ((((Activity)context1).getWindow().getAttributes().flags & 0x400) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return 0;
        } else
        {
            Rect rect = new Rect();
            ((Activity)context1).getWindow().findViewById(0x1020002).getWindowVisibleDisplayFrame(rect);
            return rect.top;
        }
    }

    private void includeNetworks()
    {
        amobeeIncNW = "";
        if (doesClassExist("com.millennialmedia.android.MMAdView"))
        {
            amobeeIncNW = (new StringBuilder(String.valueOf(amobeeIncNW))).append("clMmi").toString();
        }
        if (doesClassExist("com.google.android.gms.ads.AdView"))
        {
            amobeeIncNW = (new StringBuilder(String.valueOf(amobeeIncNW))).append(",").append("adMob").toString();
        }
    }

    private void includePulse3D()
    {
        ConfigurationInfo configurationinfo = ((ActivityManager)context.getSystemService("activity")).getDeviceConfigurationInfo();
        boolean flag = doesClassExist("com.amobee.pulse3d.Pulse3DView");
        Log.d("[a\u2022mo\u2022bee]", (new StringBuilder("pulse3dClass: ")).append(flag).toString());
        if (android.os.Build.VERSION.SDK_INT >= 14 && configurationinfo.reqGlEsVersion >= 0x20000 && flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        pulse3dSupport = flag;
        if (pulse3dSupport)
        {
            clearCacheOlderThan(context, 30);
        }
    }

    private void killTimer()
    {
        this;
        JVM INSTR monitorenter ;
        if (m_timer != null)
        {
            isTimerActive = false;
            m_timer.purge();
            m_timer.cancel();
            m_timer = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void toCallAsynchronous(boolean flag, final ArrayList placeholderList)
    {
        int i = 0;
        if (m_timer != null)
        {
            m_timer.cancel();
        }
        m_timer = new Timer();
        isTimerActive = true;
        placeholderList = new TimerTask() {

            final AdManager this$0;
            private final ArrayList val$placeholderList;

            public void run()
            {
                if (placeholderList.size() > 0) goto _L2; else goto _L1
_L1:
                Log.d("[a\u2022mo\u2022bee]", "No placeholder has been defined, if you want ads, please define a placeholder");
_L4:
                return;
_L2:
                if (!isExpanded)
                {
                    int j = 0;
                    while (j < placeholderList.size()) 
                    {
                        if (placeholderList.get(j) != null)
                        {
                            NetworkHelper.doRequest((AmobeeAdPlaceholder)placeholderList.get(j));
                        }
                        j++;
                    }
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$0 = AdManager.this;
                placeholderList = arraylist;
                super();
            }
        };
        if (m_secondsBetweenAdcalls == 0)
        {
            if (m_lastRefreshTime > 0)
            {
                m_secondsBetweenAdcalls = m_lastRefreshTime;
                m_lastRefreshTime = 0;
            } else
            {
                m_secondsBetweenAdcalls = 30;
            }
        }
        if (flag)
        {
            i = m_secondsBetweenAdcalls * 1000;
        }
        m_timer.schedule(placeholderList, i, m_secondsBetweenAdcalls * 1000);
    }

    void addPlaceholder(AmobeeAdPlaceholder amobeeadplaceholder)
    {
        if (placeholders.contains(amobeeadplaceholder))
        {
            return;
        } else
        {
            placeholders.add(0, amobeeadplaceholder);
            return;
        }
    }

    public boolean cappingBlocksRequest(String s)
    {
        AmobeeAdSpace amobeeadspace = getAdSpace(s);
        if (amobeeadspace != null)
        {
            if (amobeeadspace.sessionId != SESSION_ID && amobeeadspace.session == 1)
            {
                removeAdSpace(s);
            } else
            {
                long l = amobeeadspace.getLastImpression();
                if (-1L != l)
                {
                    l = (System.currentTimeMillis() - l) / 60000L;
                    if (-1 != amobeeadspace.getCappingMinutes() && (long)amobeeadspace.getCappingMinutes() > l)
                    {
                        Log.d("[a\u2022mo\u2022bee]", "Can't get an ad because of the capping time.");
                        return true;
                    }
                }
            }
        }
        return false;
    }

    void fireOnOverlay(boolean flag, final AmobeeAdPlaceholder placeholder)
    {
        if (flag)
        {
            if (placeholder == null)
            {
                getAmobeeListener().amobeeOnOverlay(placeholder);
            } else
            {
                placeholder.post(new Runnable() {

                    final AdManager this$0;
                    private final AmobeeAdPlaceholder val$placeholder;

                    public void run()
                    {
                        getAmobeeListener().amobeeOnOverlay(placeholder);
                    }

            
            {
                this$0 = AdManager.this;
                placeholder = amobeeadplaceholder;
                super();
            }
                });
            }
            if (isTimerActive() && isExpanded)
            {
                setRefreshIntervalExpand(0);
                Log.d("[a\u2022mo\u2022bee]", "in onExpand/onResize");
            }
        } else
        {
            if (placeholder == null)
            {
                getAmobeeListener().amobeeOnOverlayDismissed(placeholder);
            } else
            {
                placeholder.post(new Runnable() {

                    final AdManager this$0;
                    private final AmobeeAdPlaceholder val$placeholder;

                    public void run()
                    {
                        getAmobeeListener().amobeeOnOverlayDismissed(placeholder);
                    }

            
            {
                this$0 = AdManager.this;
                placeholder = amobeeadplaceholder;
                super();
            }
                });
            }
            if (getLastRefreshInterval() >= 0)
            {
                setRefreshInterval(m_lastRefreshTime);
                setlastRefreshTime(0);
                Log.d("[a\u2022mo\u2022bee]", "in onExpandClose/onResizeClose");
                return;
            }
        }
    }

    public void getAd()
    {
        getAd(false, placeholders);
    }

    public void getAd(final AmobeeAdPlaceholder placeholder)
    {
        if (placeholder == null)
        {
            return;
        }
        if (placeholder.getWindowVisibility() == 8 && !placeholder.firstRequest)
        {
            placeholder.firstRequest = false;
            return;
        } else
        {
            (new Thread(new Runnable() {

                final AdManager this$0;
                private final AmobeeAdPlaceholder val$placeholder;

                public void run()
                {
                    NetworkHelper.doRequest(placeholder);
                }

            
            {
                this$0 = AdManager.this;
                placeholder = amobeeadplaceholder;
                super();
            }
            })).start();
            return;
        }
    }

    void getAd(boolean flag, final ArrayList placeholderList)
    {
        this;
        JVM INSTR monitorenter ;
        Log.d("[a\u2022mo\u2022bee]", "getAd()");
        if (!isTimerActive()) goto _L2; else goto _L1
_L1:
        Log.d("[a\u2022mo\u2022bee]", "timer is active - doing nothing on getAd()");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (isExpanded) goto _L4; else goto _L3
_L3:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        if (currentMode != SdkMode.MANUAL)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        Log.d("[a\u2022mo\u2022bee]", "after expand/resize close we don't refresh the ad in manual mode");
          goto _L4
        placeholderList;
        throw placeholderList;
        if (currentMode != SdkMode.MANUAL) goto _L6; else goto _L5
_L5:
        if (placeholderList.size() > 0)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        Log.d("[a\u2022mo\u2022bee]", "No placeholder has been defined ,if you want ads, pls define a placeholder");
          goto _L4
_L8:
        final int index;
        if (index >= placeholderList.size()) goto _L4; else goto _L7
_L7:
        (new Thread(new Runnable() {

            final AdManager this$0;
            private final int val$index;
            private final ArrayList val$placeholderList;

            public void run()
            {
                NetworkHelper.doRequest((AmobeeAdPlaceholder)placeholderList.get(index));
            }

            
            {
                this$0 = AdManager.this;
                placeholderList = arraylist;
                index = i;
                super();
            }
        })).start();
        index++;
          goto _L8
_L6:
        if (currentMode != SdkMode.TIMER) goto _L4; else goto _L9
_L9:
        toCallAsynchronous(flag, placeholderList);
          goto _L4
        index = 0;
          goto _L8
    }

    AmobeeAdSpace getAdSpace(String s)
    {
        Object obj = null;
        AmobeeAdSpace amobeeadspace = obj;
        if (s != null)
        {
            amobeeadspace = obj;
            if (!s.equals(""))
            {
                amobeeadspace = obj;
                if (context != null)
                {
                    String s1 = context.getSharedPreferences("com.amobee.adsdk", 0).getString(s, null);
                    amobeeadspace = obj;
                    if (s1 != null)
                    {
                        amobeeadspace = new AmobeeAdSpace(s);
                        amobeeadspace.setPropertiesFromString(s1);
                    }
                }
            }
        }
        return amobeeadspace;
    }

    public IAmobeeListener getAmobeeListener()
    {
        return amobeeListener;
    }

    Context getContext()
    {
        return context;
    }

    double getDensity()
    {
        float f = context.getResources().getDisplayMetrics().density;
        double d = f;
        if (d != 0.0D)
        {
            return d;
        }
        break MISSING_BLOCK_LABEL_27;
        Exception exception;
        exception;
        return 1.5D;
    }

    int getLastRefreshInterval()
    {
        return m_lastRefreshTime;
    }

    String getNotificationServerURL()
    {
        return notificationServerURL;
    }

    int getOrientation()
    {
        return getOrientation(context);
    }

    String getPassbackURL()
    {
        return passbackURL;
    }

    ArrayList getPlaceholders()
    {
        return placeholders;
    }

    public int getRefreshInterval()
    {
        return m_secondsBetweenAdcalls;
    }

    Point getScreenSize()
    {
        return getScreenSize(context);
    }

    public String getServerURL()
    {
        return serverURL;
    }

    public boolean getUserGestureRequiredToOpenAds()
    {
        return mUserGestureRequiredToOpenAds;
    }

    public boolean isExpanded()
    {
        return isExpanded;
    }

    boolean isMiniTablet(Context context1)
    {
        float f = (float)getDensity();
        for (f = Math.min((float)getScreenSize().x / f, (float)getScreenSize().y / f); f > 720F || f <= 530F;)
        {
            return false;
        }

        return true;
    }

    boolean isTablet(Context context1)
    {
        return (context1.getResources().getConfiguration().screenLayout & 0xf) >= 3;
    }

    boolean isTimerActive()
    {
        return isTimerActive;
    }

    public Parameters parameters()
    {
        return m_parameters;
    }

    void removeAdSpace(String s)
    {
        if (context != null)
        {
            android.content.SharedPreferences.Editor editor = context.getSharedPreferences("com.amobee.adsdk", 0).edit();
            synchronized (sharedPreferanceLocker)
            {
                editor.remove(s);
                editor.commit();
            }
            return;
        } else
        {
            return;
        }
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    void removePlaceholder(AmobeeAdPlaceholder amobeeadplaceholder)
    {
        placeholders.remove(amobeeadplaceholder);
        if (placeholders.size() < 1)
        {
            Log.d("[a\u2022mo\u2022bee]", "No placeholders left, killing timer, cleaning up.");
            isExpanded = false;
            killTimer();
        }
    }

    void saveAdSpace(AmobeeAdSpace amobeeadspace)
    {
        amobeeadspace.setSessionId(SESSION_ID);
        if (context != null)
        {
            android.content.SharedPreferences.Editor editor = context.getSharedPreferences("com.amobee.adsdk", 0).edit();
            synchronized (sharedPreferanceLocker)
            {
                editor.putString(amobeeadspace.getAdspace(), amobeeadspace.toString());
                editor.commit();
            }
            return;
        } else
        {
            return;
        }
        amobeeadspace;
        obj;
        JVM INSTR monitorexit ;
        throw amobeeadspace;
    }

    public void setAmobeeListener(IAmobeeListener iamobeelistener)
    {
        if (iamobeelistener == null)
        {
            amobeeListener = new IAmobeeListener() {

                final AdManager this$0;

                public void amobeeOnAdFailed(AmobeeAdPlaceholder amobeeadplaceholder)
                {
                }

                public void amobeeOnAdRecieved(AmobeeAdPlaceholder amobeeadplaceholder)
                {
                }

                public void amobeeOnError()
                {
                }

                public void amobeeOnLeavingApplication(AmobeeAdPlaceholder amobeeadplaceholder)
                {
                }

                public void amobeeOnOverlay(AmobeeAdPlaceholder amobeeadplaceholder)
                {
                }

                public void amobeeOnOverlayDismissed(AmobeeAdPlaceholder amobeeadplaceholder)
                {
                }

            
            {
                this$0 = AdManager.this;
                super();
            }
            };
            return;
        } else
        {
            amobeeListener = iamobeelistener;
            return;
        }
    }

    void setImpression(String s)
    {
        s = getAdSpace(s);
        if (s != null)
        {
            s.setLastImpression(System.currentTimeMillis());
            saveAdSpace(s);
        }
    }

    void setIsExpanded(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        isExpanded = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void setNotificationServerURL(String s)
    {
        notificationServerURL = s;
        Log.d("[a\u2022mo\u2022bee]", (new StringBuilder("setNotificationServerURL")).append(s).toString());
    }

    void setPassbackURL(String s)
    {
        passbackURL = s;
    }

    public void setRefreshInterval(int i)
    {
        int j;
        if (i >= 10)
        {
            Log.d("[a\u2022mo\u2022bee]", (new StringBuilder("refresh interval set to ")).append(i).toString());
        } else
        if (i > 0 && i < 10)
        {
            i = 10;
        } else
        if (i == 0)
        {
            Log.d("[a\u2022mo\u2022bee]", "refresh interval set to 0 - killing timer - stopping ads");
            killTimer();
            currentMode = SdkMode.MANUAL;
        } else
        {
            i = 30;
        }
        if (i > 0)
        {
            currentMode = SdkMode.TIMER;
        }
        j = m_secondsBetweenAdcalls;
        m_secondsBetweenAdcalls = i;
        m_lastRefreshTime = i;
        if (i > 0 && j != i && isTimerActive())
        {
            toCallAsynchronous(false, placeholders);
        }
    }

    void setRefreshIntervalExpand(int i)
    {
        if (i == 0)
        {
            m_lastRefreshTime = m_secondsBetweenAdcalls;
            m_secondsBetweenAdcalls = 0;
            killTimer();
        }
    }

    public void setServerURL(String s)
    {
        serverURL = s;
    }

    public void setUseInternalBrowser()
    {
        AmobeeView.useInternalBrowser = true;
    }

    public void setUserGestureRequiredToOpenAds(boolean flag)
    {
        mUserGestureRequiredToOpenAds = flag;
    }

    void setlastRefreshTime(int i)
    {
        m_lastRefreshTime = i;
    }

    static 
    {
        SHOULD_SEND_IMEI = true;
        SHOULD_SEND_ANDROID_ID = true;
        debugLevel = DebugLevel.NODEBUG;
        HONEYCOMB_MR2 = 13;
    }
}
