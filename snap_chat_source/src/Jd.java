// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Process;
import android.os.SystemClock;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.util.StartupPath;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class Jd
{
    public static final class a extends Enum
    {

        private static final int $VALUES$25e79240[];
        public static final int ACTIVITY_CREATE_CHECKPOINT$6dad94c5;
        public static final int ACTIVITY_RESTART_CHECKPOINT$6dad94c5;
        public static final int APPLICATION_CREATE_CHECKPOINT$6dad94c5;

        public static int[] a()
        {
            return (int[])$VALUES$25e79240.clone();
        }

        static 
        {
            APPLICATION_CREATE_CHECKPOINT$6dad94c5 = 1;
            ACTIVITY_CREATE_CHECKPOINT$6dad94c5 = 2;
            ACTIVITY_RESTART_CHECKPOINT$6dad94c5 = 3;
            $VALUES$25e79240 = (new int[] {
                APPLICATION_CREATE_CHECKPOINT$6dad94c5, ACTIVITY_CREATE_CHECKPOINT$6dad94c5, ACTIVITY_RESTART_CHECKPOINT$6dad94c5
            });
        }
    }


    protected static final String APP_CREATION_TIMED_METRIC = "APP_CREATION_TIMED";
    private static final String ELAPSED_TIME_SINCE_APP_ONCREATE_PARAM = "ELAPSED_TIME_SINCE_APP_ONCREATE";
    private static final String PROCESS_START_TIME_PARAM = "PROCESS_START_TIME";
    private static final String TAG = "StartupContext";
    private static StartupPath mStartupPath;
    private static Jd sStartupContext = new Jd();
    private boolean isAppStart;
    Long mAppCreationTime;
    private final com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory mEasyMetricFactory;
    long mProcessStartTime;

    private Jd()
    {
        this(new com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory());
    }

    private Jd(com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory easymetricfactory)
    {
        isAppStart = false;
        mProcessStartTime = 0L;
        mAppCreationTime = null;
        mEasyMetricFactory = easymetricfactory;
    }

    public static Jd a()
    {
        return sStartupContext;
    }

    public static StartupPath b()
    {
        return mStartupPath;
    }

    public static boolean c()
    {
        return mStartupPath == StartupPath.FROM_KILLED_STATE;
    }

    static long d()
    {
        long l;
        try
        {
            int i = Class.forName("libcore.io.OsConstants").getField("_SC_CLK_TCK").getInt(null);
            Object obj = Class.forName("libcore.io.Libcore").getField("os").get(null);
            l = ((Long)obj.getClass().getMethod("sysconf", new Class[] {
                Integer.TYPE
            }).invoke(obj, new Object[] {
                Integer.valueOf(i)
            })).longValue();
        }
        catch (Exception exception)
        {
            Timber.d("StartupContext", "Failed to get the clock tick per second, using default value: 100", new Object[0]);
            return 100L;
        }
        return l;
    }

    static Long e()
    {
        Object obj1;
        int i = Process.myPid();
        obj1 = new BufferedReader(new FileReader((new StringBuilder("/proc/")).append(i).append("/stat").toString()));
        Object obj = obj1;
        Object obj2 = ((BufferedReader) (obj1)).readLine();
        obj = obj1;
        long l = Long.parseLong(((String) (obj2)).substring(((String) (obj2)).lastIndexOf(") ")).split(" ")[20]);
        Pf.a(((java.io.Closeable) (obj1)));
        return Long.valueOf(l);
        Object obj3;
        obj3;
        obj1 = null;
_L4:
        obj = obj1;
        Timber.d("StartupContext", "Failed to get process running time: %s", new Object[] {
            obj3
        });
        Pf.a(((java.io.Closeable) (obj1)));
        return null;
        obj;
        obj3 = null;
        obj1 = obj;
_L2:
        Pf.a(((java.io.Closeable) (obj3)));
        throw obj1;
        obj1;
        obj3 = obj;
        if (true) goto _L2; else goto _L1
_L1:
        obj3;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(int i)
    {
        static final class _cls2
        {

            static final int $SwitchMap$com$snapchat$android$util$StartupContext$Checkpoint[];

            static 
            {
                $SwitchMap$com$snapchat$android$util$StartupContext$Checkpoint = new int[a.a().length];
                try
                {
                    $SwitchMap$com$snapchat$android$util$StartupContext$Checkpoint[a.APPLICATION_CREATE_CHECKPOINT._fld6dad94c5 - 1] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$StartupContext$Checkpoint[a.ACTIVITY_CREATE_CHECKPOINT._fld6dad94c5 - 1] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$snapchat$android$util$StartupContext$Checkpoint[a.ACTIVITY_RESTART_CHECKPOINT._fld6dad94c5 - 1] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2..SwitchMap.com.snapchat.android.util.StartupContext.Checkpoint[i - 1])
        {
        default:
            mStartupPath = StartupPath.UNKNOWN;
            return;

        case 1: // '\001'
            mStartupPath = StartupPath.FROM_KILLED_STATE;
            isAppStart = true;
            return;

        case 2: // '\002'
            if (!isAppStart)
            {
                mStartupPath = StartupPath.FROM_DESTROYED_STATE;
            } else
            if (mAppCreationTime != null)
            {
                long l = SystemClock.elapsedRealtime() - mProcessStartTime - mAppCreationTime.longValue();
                Timber.c("StartupContext", "AppCreationTime: %d ProcessStartTime %d ElapsedTimeSinceAppOncreate %d", new Object[] {
                    mAppCreationTime, Long.valueOf(mProcessStartTime), Long.valueOf(l)
                });
                com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.a("APP_CREATION_TIMED").a(mAppCreationTime.longValue()).a("PROCESS_START_TIME", Long.valueOf(mProcessStartTime)).a("ELAPSED_TIME_SINCE_APP_ONCREATE", Long.valueOf(l)).b(false);
            }
            isAppStart = false;
            return;

        case 3: // '\003'
            mStartupPath = StartupPath.FROM_BACKGROUNDED_STATE;
            return;
        }
    }

    static 
    {
        mStartupPath = StartupPath.UNKNOWN;
    }

    // Unreferenced inner class Jd$1

/* anonymous class */
    public final class _cls1
        implements Runnable
    {

        final Jd this$0;

        public final void run()
        {
            Jd jd = Jd.this;
            Long long1 = Jd.e();
            if (long1 != null)
            {
                Timber.c("StartupContext", "Application#Oncreate finished", new Object[0]);
                jd.mProcessStartTime = (long1.longValue() * 1000L) / Jd.d();
                jd.mAppCreationTime = Long.valueOf(SystemClock.elapsedRealtime() - jd.mProcessStartTime);
                return;
            } else
            {
                jd.mAppCreationTime = null;
                return;
            }
        }

            public 
            {
                this$0 = Jd.this;
                super();
            }
    }

}
