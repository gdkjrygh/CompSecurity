// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics;

import Bt;
import Gt;
import IJ;
import Io;
import Jd;
import Ll;
import android.os.Build;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.analytics.framework.EasyMetricManager;
import com.snapchat.android.analytics.framework.ErrorMetric;
import com.snapchat.android.camera.model.CameraModel;
import com.snapchat.android.util.StartupPath;
import dO;
import fT;
import gc;
import gd;
import ge;
import hm;
import hn;
import java.math.BigDecimal;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Iterator;
import rj;

public final class CameraEventAnalytics
{
    public static final class CameraContext extends Enum
    {

        private static final CameraContext $VALUES[];
        public static final CameraContext BACKGROUND;
        public static final CameraContext BACK_PRESSED;
        public static final CameraContext CAMERA_BUTTON;
        public static final CameraContext CANCEL_PREVIEW;
        public static final CameraContext DOUBLE_TAP;
        public static final CameraContext KILLED_STATE;
        public static final CameraContext SNAP_BUTTON;
        public static final CameraContext SWIPE;

        public static CameraContext valueOf(String s)
        {
            return (CameraContext)Enum.valueOf(com/snapchat/android/analytics/CameraEventAnalytics$CameraContext, s);
        }

        public static CameraContext[] values()
        {
            return (CameraContext[])$VALUES.clone();
        }

        static 
        {
            SWIPE = new CameraContext("SWIPE", 0);
            BACK_PRESSED = new CameraContext("BACK_PRESSED", 1);
            SNAP_BUTTON = new CameraContext("SNAP_BUTTON", 2);
            DOUBLE_TAP = new CameraContext("DOUBLE_TAP", 3);
            CAMERA_BUTTON = new CameraContext("CAMERA_BUTTON", 4);
            CANCEL_PREVIEW = new CameraContext("CANCEL_PREVIEW", 5);
            KILLED_STATE = new CameraContext("KILLED_STATE", 6);
            BACKGROUND = new CameraContext("BACKGROUND", 7);
            $VALUES = (new CameraContext[] {
                SWIPE, BACK_PRESSED, SNAP_BUTTON, DOUBLE_TAP, CAMERA_BUTTON, CANCEL_PREVIEW, KILLED_STATE, BACKGROUND
            });
        }

        private CameraContext(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class ExitEventContext extends Enum
    {

        private static final ExitEventContext $VALUES[];
        public static final ExitEventContext BACKGROUND;
        public static final ExitEventContext DEEP_LINK;
        public static final ExitEventContext OTHERS;
        public static final ExitEventContext PROFILE;
        private final String name;

        public static ExitEventContext valueOf(String s)
        {
            return (ExitEventContext)Enum.valueOf(com/snapchat/android/analytics/CameraEventAnalytics$ExitEventContext, s);
        }

        public static ExitEventContext[] values()
        {
            return (ExitEventContext[])$VALUES.clone();
        }

        public final String toString()
        {
            return name;
        }

        static 
        {
            PROFILE = new ExitEventContext("PROFILE", 0, "PROFILE");
            BACKGROUND = new ExitEventContext("BACKGROUND", 1, "BACKGROUND");
            DEEP_LINK = new ExitEventContext("DEEP_LINK", 2, "DEEPLINK");
            OTHERS = new ExitEventContext("OTHERS", 3, "");
            $VALUES = (new ExitEventContext[] {
                PROFILE, BACKGROUND, DEEP_LINK, OTHERS
            });
        }

        private ExitEventContext(String s, int i, String s1)
        {
            super(s, i);
            name = s1;
        }
    }

    public static final class SaveSnapContext extends Enum
    {

        private static final SaveSnapContext $VALUES[];
        public static final SaveSnapContext DISCOVER;
        public static final SaveSnapContext PREVIEW;
        public static final SaveSnapContext STORY;

        public static SaveSnapContext valueOf(String s)
        {
            return (SaveSnapContext)Enum.valueOf(com/snapchat/android/analytics/CameraEventAnalytics$SaveSnapContext, s);
        }

        public static SaveSnapContext[] values()
        {
            return (SaveSnapContext[])$VALUES.clone();
        }

        static 
        {
            PREVIEW = new SaveSnapContext("PREVIEW", 0);
            STORY = new SaveSnapContext("STORY", 1);
            DISCOVER = new SaveSnapContext("DISCOVER", 2);
            $VALUES = (new SaveSnapContext[] {
                PREVIEW, STORY, DISCOVER
            });
        }

        private SaveSnapContext(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String AVG_FPS_PARAM = "avg_fps";
    public static final String BACK_FACING_CAMERA = "back_facing_camera";
    protected static final String CAMERA_BUTTON_PRESSED_EVENT = "CAMERA_BUTTON_PRESSED";
    protected static final String CAMERA_DELAY_EVENT = "CAMERA_DELAY";
    protected static final String CAMERA_FPS_EVENT = "CAMERA_FPS";
    protected static final String CAMERA_PAGE_VIEW_EVENT = "CAMERA_PAGE_VIEW";
    protected static int CAMERA_PAGE_VIEW_SAMPLE_THRESHOLD = 0;
    protected static final String CAMERA_READY_EVENT = "CAMERA_READY";
    protected static final String CAMERA_RUNNING_PARAM = "camera_running";
    protected static final String CAMERA_SWITCH_EVENT = "CAMERA_SWITCH";
    protected static final String CONTEXT_PARAM = "context";
    protected static final String EXIT_EVENT_PARAM = "exit_event";
    public static final String FPS_LIST_SIZE_PARAM = "fps_list_size";
    public static final String FRONT_FACING_CAMERA = "front_facing_camera";
    public static final String LENSES_UI_ENABLED_PARAM = "lenses_ui_enabled";
    public static final String LENS_ID_PARAM = "lens_id";
    public static final int MAX_FPS_SAMPLES = 20;
    public static final int MIN_FPS_SAMPLES = 5;
    protected static final String RECORDING_DELAY_EVENT = "RECORDING_DELAY";
    protected static final String SAVE_SNAP_FAILED_EVENT = "SAVE_SNAP_FAILED";
    protected static final String SAVE_SNAP_SUCCESS_EVENT = "SAVE_SNAP_SUCCESS";
    protected static final String START_VIDEO_RECORDING_EVENT = "START_VIDEO_RECORDING";
    protected static final String TIME_SPAN_PARAM = "time_span";
    protected static final String TYPE_PARAM = "type";
    protected static final String VIDEO_RECORDING_ERROR_EVENT = "VIDEO_RECORDING_ERROR";
    protected static final String VIDEO_RECORDING_SUCCESS_EVENT = "VIDEO_RECORDING_SUCCESS";
    protected static final String WITH_GEOLOCATION_PARAM = "with_geolocation";
    private static final CameraEventAnalytics sInstance = new CameraEventAnalytics();
    public final BlizzardEventLogger mBlizzardEventLogger;
    private boolean mCameraAlreadyReady;
    public EasyMetric mCameraFpsMetric;
    public CameraModel mCameraModel;
    public final EasyMetricManager mEasyMetricManager;
    public rj mFlashModel;
    public Collection mFpsList;
    public Gt mLensesAdapter;
    private final com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory mMetricFactory;
    private final Jd mStartupContext;

    private CameraEventAnalytics()
    {
        this(Jd.a(), new com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory(), BlizzardEventLogger.a());
    }

    private CameraEventAnalytics(Jd jd, com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory easymetricfactory, BlizzardEventLogger blizzardeventlogger)
    {
        mFpsList = dO.a(20);
        mCameraAlreadyReady = false;
        SnapchatApplication.getDIComponent().a(this);
        mStartupContext = jd;
        mEasyMetricManager = new EasyMetricManager((byte)0);
        mMetricFactory = easymetricfactory;
        mBlizzardEventLogger = blizzardeventlogger;
    }

    public static CameraEventAnalytics a()
    {
        return sInstance;
    }

    public static gc a(double d1, long l, long l1, long l2, 
            long l3)
    {
        gc gc1 = new gc();
        gc1.actionName = fT.TAP_AND_HOLD;
        gc1.pageName = gd.CAMERA_BACK;
        gc1.deviceModel = Build.MODEL;
        gc1.viewTimeSec = Double.valueOf(d1);
        gc1.tapXStart = Long.valueOf(l);
        gc1.tapYStart = Long.valueOf(l1);
        gc1.tapXEnd = Long.valueOf(l2);
        gc1.tapYEnd = Long.valueOf(l3);
        return gc1;
    }

    public static void a(int i, int j, long l, int k, com.snapchat.android.camera.transcoding.TranscodingPreferencesWrapper.TranscodingEnabled transcodingenabled)
    {
        (new EasyMetric("START_VIDEO_RECORDING")).a("video_width", Integer.valueOf(i)).a("video_height", Integer.valueOf(j)).a("max_file_size", Long.valueOf(l)).a("bit_rate", Integer.valueOf(k)).a("transcoding_status", Integer.valueOf(transcodingenabled.getValue())).b(false);
    }

    public static void a(com.snapchat.android.camera.videocamera.VideoCameraHandler.VideoFailureType videofailuretype)
    {
        (new ErrorMetric("VIDEO_RECORDING_ERROR")).a("error_code", Integer.valueOf(videofailuretype.getValue())).b(false);
    }

    public static void a(boolean flag, SaveSnapContext savesnapcontext)
    {
        (new EasyMetric("SAVE_SNAP_SUCCESS")).a("video_type", Boolean.valueOf(flag)).a("context", savesnapcontext.toString().toLowerCase()).b(false);
    }

    public static void b(boolean flag, SaveSnapContext savesnapcontext)
    {
        (new EasyMetric("SAVE_SNAP_FAILED")).a("video_type", Boolean.valueOf(flag)).a("context", savesnapcontext.toString().toLowerCase()).b(false);
    }

    public static void g()
    {
        (new EasyMetric("VIDEO_RECORDING_SUCCESS")).b(false);
    }

    public final void a(int i, int j)
    {
        if (j != 1) goto _L2; else goto _L1
_L1:
        if (i == 2)
        {
            a(((hn) (null)));
        }
_L4:
        return;
_L2:
        if (j != 3)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i != 2) goto _L4; else goto _L3
_L3:
        a(((hn) (null)));
        return;
        if (j != 0 || i != 2) goto _L4; else goto _L5
_L5:
        a(((hn) (null)));
        return;
    }

    public final void a(CameraContext cameracontext)
    {
        if (mCameraModel.b()) goto _L2; else goto _L1
_L1:
        mCameraAlreadyReady = true;
_L4:
        if (!mEasyMetricManager.c("CAMERA_DELAY", ""))
        {
            mEasyMetricManager.a("CAMERA_DELAY").a("context", Io.a(cameracontext)).b();
        }
        return;
_L2:
        mCameraAlreadyReady = false;
        if (!mEasyMetricManager.c("CAMERA_DELAY", ""))
        {
            mEasyMetricManager.a("CAMERA_DELAY").a("camera_running", Boolean.valueOf(false)).a("context", cameracontext).b();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(hn hn1)
    {
        if (!mEasyMetricManager.c("CAMERA_PAGE_VIEW", "")) goto _L2; else goto _L1
_L1:
        Object obj;
        Long long1;
        EasyMetric easymetric;
        if ((new SecureRandom()).nextInt(100) >= CAMERA_PAGE_VIEW_SAMPLE_THRESHOLD)
        {
            break MISSING_BLOCK_LABEL_387;
        }
        easymetric = mEasyMetricManager.a("CAMERA_PAGE_VIEW", "");
        long1 = Long.valueOf(easymetric.c());
        obj = ExitEventContext.OTHERS;
        if (hn1 == null) goto _L4; else goto _L3
_L3:
        static final class _cls1
        {

            static final int $SwitchMap$com$snapchat$analytics$types$ExitEvent[];

            static 
            {
                $SwitchMap$com$snapchat$analytics$types$ExitEvent = new int[hn.values().length];
                try
                {
                    $SwitchMap$com$snapchat$analytics$types$ExitEvent[hn.ENTER_BACKGROUND.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$snapchat$analytics$types$ExitEvent[hn.TAPPED_THUMBNAIL.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$snapchat$analytics$types$ExitEvent[hn.SWIPE_DOWN.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.snapchat.analytics.types.ExitEvent[hn1.ordinal()];
        JVM INSTR tableswitch 1 3: default 100
    //                   1 339
    //                   2 346
    //                   3 353;
           goto _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_353;
_L5:
        obj = ExitEventContext.OTHERS;
_L4:
        EasyMetric easymetric1 = easymetric.a("time_span", long1);
        Bt.a();
        easymetric1.a("with_geolocation", Boolean.valueOf(Bt.bB())).a("exit_event", ((ExitEventContext) (obj)).toString());
        if (mCameraModel.a())
        {
            easymetric.a("type", gd.CAMERA_FRONT.toString());
        } else
        {
            easymetric.a("type", gd.CAMERA_BACK.toString());
        }
        mEasyMetricManager.b("CAMERA_PAGE_VIEW");
        if (mBlizzardEventLogger != null)
        {
            obj = new ge();
            if (mCameraModel.a())
            {
                obj.pageName = gd.CAMERA_FRONT;
            } else
            {
                obj.pageName = gd.CAMERA_BACK;
            }
            Bt.a();
            obj.withGeolocation = Boolean.valueOf(Bt.bB());
            obj.deviceModel = Build.MODEL;
            if (mLensesAdapter != null)
            {
                long l = mLensesAdapter.getCount() - 1;
                long l1 = mLensesAdapter.b;
                long l2 = mLensesAdapter.c;
                obj.filterLensCount = Long.valueOf(l);
                obj.filterGeolensCount = Long.valueOf(l1);
                obj.filterLensStoreCount = Long.valueOf(l2);
            }
            obj.viewTimeSec = Double.valueOf((new BigDecimal((double)long1.longValue() / 1000D)).setScale(1, 4).doubleValue());
            obj.exitEvent = hn1;
            mBlizzardEventLogger.a(((kl) (obj)));
        }
_L2:
        return;
_L6:
        obj = ExitEventContext.BACKGROUND;
          goto _L4
_L7:
        obj = ExitEventContext.DEEP_LINK;
          goto _L4
        obj = ExitEventContext.PROFILE;
          goto _L4
        mEasyMetricManager.b("CAMERA_PAGE_VIEW", "");
        return;
    }

    public final void a(boolean flag)
    {
        if (mEasyMetricManager.c("RECORDING_DELAY", ""))
        {
            String s;
            if (flag)
            {
                s = "video";
            } else
            {
                s = "image";
            }
            mEasyMetricManager.a("RECORDING_DELAY", "").a("type", s);
            mEasyMetricManager.b("RECORDING_DELAY");
        }
    }

    public final void a(boolean flag, String s)
    {
        boolean flag1 = mCameraModel.a();
        boolean flag2 = mFlashModel.a;
        a(((hn) (null)));
        mEasyMetricManager.a("CAMERA_BUTTON_PRESSED", "", false).a("front_facing", Boolean.valueOf(flag1)).a("flash", Boolean.valueOf(flag2)).b();
        mEasyMetricManager.b("CAMERA_BUTTON_PRESSED");
        mEasyMetricManager.a("RECORDING_DELAY").a("lenses_ui_enabled", Boolean.valueOf(flag)).b();
        if (s != null)
        {
            mEasyMetricManager.a("RECORDING_DELAY", "").a("lens_id", s);
        }
    }

    public final void b()
    {
        if (mCameraAlreadyReady && !mCameraModel.b())
        {
            if (!mEasyMetricManager.c("CAMERA_DELAY", ""))
            {
                mEasyMetricManager.a("CAMERA_DELAY");
            }
            mEasyMetricManager.a("CAMERA_DELAY", "").a("camera_running", Boolean.valueOf(true)).b();
            d();
        } else
        if (mCameraModel.b() && !mEasyMetricManager.c("CAMERA_DELAY", ""))
        {
            StartupPath startuppath = Jd.b();
            if (startuppath == StartupPath.FROM_BACKGROUNDED_STATE)
            {
                a(CameraContext.BACKGROUND);
                return;
            }
            if (startuppath == StartupPath.FROM_KILLED_STATE || startuppath == StartupPath.FROM_DESTROYED_STATE)
            {
                a(CameraContext.KILLED_STATE);
                return;
            }
        }
    }

    public final void c()
    {
        mEasyMetricManager.a("CAMERA_PAGE_VIEW").b();
    }

    public final void d()
    {
        boolean flag = false;
        mCameraAlreadyReady = false;
        mEasyMetricManager.b("CAMERA_DELAY");
        mEasyMetricManager.b("CAMERA_SWITCH");
        if (mEasyMetricManager.c("CAMERA_READY", ""))
        {
            EasyMetric easymetric = mEasyMetricManager.a("CAMERA_READY", "").a("type", Jd.b());
            if (Jd.b() == StartupPath.FROM_BACKGROUNDED_STATE)
            {
                flag = true;
            }
            easymetric.a("from_background", Boolean.valueOf(flag));
            mEasyMetricManager.b("CAMERA_READY");
        }
    }

    public final void e()
    {
        a(hn.SWIPE_DOWN);
    }

    public final void f()
    {
        a(hn.TAPPED_THUMBNAIL);
    }

    public final void h()
    {
        this;
        JVM INSTR monitorenter ;
        if (mCameraFpsMetric == null || mFpsList.size() < 5) goto _L2; else goto _L1
_L1:
        EasyMetric easymetric;
        Collection collection;
        easymetric = mCameraFpsMetric;
        collection = mFpsList;
        if (collection == null) goto _L4; else goto _L3
_L3:
        Iterator iterator = collection.iterator();
        double d1 = 0.0D;
        while (iterator.hasNext()) 
        {
            d1 += IJ.a((Double)iterator.next());
        }
_L10:
        if (collection == null) goto _L6; else goto _L5
_L5:
        if (collection.size() <= 0) goto _L6; else goto _L7
_L7:
        d1 /= collection.size();
_L8:
        easymetric.a("avg_fps", Double.valueOf(d1));
        mCameraFpsMetric.a("fps_list_size", Integer.valueOf(mFpsList.size()));
        mCameraFpsMetric.b(false);
        mCameraFpsMetric = null;
        mFpsList.clear();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L6:
        d1 = 0.0D;
          goto _L8
        Exception exception;
        exception;
        throw exception;
_L4:
        d1 = 0.0D;
        if (true) goto _L10; else goto _L9
_L9:
    }

    static 
    {
        CAMERA_PAGE_VIEW_SAMPLE_THRESHOLD = 10;
    }
}
