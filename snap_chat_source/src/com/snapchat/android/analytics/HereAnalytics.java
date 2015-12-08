// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics;

import IF;
import Vt;
import android.os.SystemClock;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.analytics.framework.EasyMetric;
import hE;
import hF;
import hG;
import hH;

public final class HereAnalytics
    implements Vt
{
    public static final class OutgoingVideoState extends Enum
    {

        private static final OutgoingVideoState $VALUES[];
        public static final OutgoingVideoState CONNECTED;
        public static final OutgoingVideoState CONNECTING;
        public static final OutgoingVideoState DISCONNECTED;

        public static OutgoingVideoState valueOf(String s)
        {
            return (OutgoingVideoState)Enum.valueOf(com/snapchat/android/analytics/HereAnalytics$OutgoingVideoState, s);
        }

        public static OutgoingVideoState[] values()
        {
            return (OutgoingVideoState[])$VALUES.clone();
        }

        static 
        {
            DISCONNECTED = new OutgoingVideoState("DISCONNECTED", 0);
            CONNECTING = new OutgoingVideoState("CONNECTING", 1);
            CONNECTED = new OutgoingVideoState("CONNECTED", 2);
            $VALUES = (new OutgoingVideoState[] {
                DISCONNECTED, CONNECTING, CONNECTED
            });
        }

        private OutgoingVideoState(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class SetupPhase extends Enum
    {

        private static final SetupPhase $VALUES[];
        public static final SetupPhase HERE_ADL_CONNECTED;
        public static final SetupPhase HERE_ADL_REMOTE_PEER_JOINED;
        public static final SetupPhase HERE_AVAILABLE;
        public static final SetupPhase HERE_CONFIRMED;
        public static final SetupPhase HERE_PUBLISHED;

        public static SetupPhase valueOf(String s)
        {
            return (SetupPhase)Enum.valueOf(com/snapchat/android/analytics/HereAnalytics$SetupPhase, s);
        }

        public static SetupPhase[] values()
        {
            return (SetupPhase[])$VALUES.clone();
        }

        static 
        {
            HERE_AVAILABLE = new SetupPhase("HERE_AVAILABLE", 0);
            HERE_ADL_CONNECTED = new SetupPhase("HERE_ADL_CONNECTED", 1);
            HERE_ADL_REMOTE_PEER_JOINED = new SetupPhase("HERE_ADL_REMOTE_PEER_JOINED", 2);
            HERE_PUBLISHED = new SetupPhase("HERE_PUBLISHED", 3);
            HERE_CONFIRMED = new SetupPhase("HERE_CONFIRMED", 4);
            $VALUES = (new SetupPhase[] {
                HERE_AVAILABLE, HERE_ADL_CONNECTED, HERE_ADL_REMOTE_PEER_JOINED, HERE_PUBLISHED, HERE_CONFIRMED
            });
        }

        private SetupPhase(String s, int i)
        {
            super(s, i);
        }
    }


    private static final int BUCKET_CFG_HIGH_PRECISION_COUNT = 10;
    private static final int BUCKET_CFG_HIGH_PRECISION_SIZE = 1000;
    private static final int BUCKET_CFG_LOW_PRECISION_RANGE_END = 20;
    private static final int BUCKET_CFG_REPORTING_RANGE_END = 30;
    private static final String PUBLISH_LOCKED = "HERE_PUBLISH_LOCKED";
    private static final String PUBLISH_LOCKED_BOTTOM = "bottom";
    private static final String PUBLISH_LOCKED_POS_KEY = "position";
    private static final String PUBLISH_LOCKED_TOP = "top";
    protected static final long START_TIME_UNINITIALIZED = -1L;
    private static final String TIME_TO_EVENT_PARAM_NAME = "timeToEvent";
    private static final String TIME_TO_FIRST_PUBLISH_PARAM_NAME = "timeToFirstEvent";
    private boolean mAdlConnectedToScope;
    private BlizzardEventLogger mAnalyticsPlatform;
    private long mHereAvailableTimestamp;
    private boolean mIsVideoBidirectional;
    private boolean mIsVideoIncoming;
    private OutgoingVideoState mOutgoingVideoState;
    private long mPreviousSetupEventTimestamp;
    private long mStartOfVideoStream;
    private long mTimeStartCanStreamVideo;
    private long mVideoBidirectionalStart;
    private long mVideoIncomingStart;
    private long mVideoOutgoingStart;

    public HereAnalytics()
    {
        this(BlizzardEventLogger.a());
    }

    private HereAnalytics(BlizzardEventLogger blizzardeventlogger)
    {
        mOutgoingVideoState = OutgoingVideoState.DISCONNECTED;
        mTimeStartCanStreamVideo = -1L;
        mStartOfVideoStream = -1L;
        mPreviousSetupEventTimestamp = -1L;
        mHereAvailableTimestamp = -1L;
        mAnalyticsPlatform = blizzardeventlogger;
    }

    private static String a(long l)
    {
        if (l < 10000L)
        {
            return IF.b(l);
        }
        int i = (int)(l / 1000L);
        if (i < 20)
        {
            return String.format("%d - %d s", new Object[] {
                Integer.valueOf(10000), Integer.valueOf(20)
            });
        }
        if (i < 30)
        {
            return String.format("%d - %d s", new Object[] {
                Integer.valueOf(20), Integer.valueOf(30)
            });
        } else
        {
            return String.format("%d+ s", new Object[] {
                Integer.valueOf(30)
            });
        }
    }

    private void e(String s)
    {
        boolean flag;
        if (mOutgoingVideoState != OutgoingVideoState.DISCONNECTED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            return;
        }
        OutgoingVideoState outgoingvideostate = mOutgoingVideoState;
        mOutgoingVideoState = OutgoingVideoState.DISCONNECTED;
        long l = SystemClock.elapsedRealtime() - mVideoOutgoingStart;
        (new EasyMetric("HERE_END")).a(l).a("reason", s).e();
        if (outgoingvideostate == OutgoingVideoState.CONNECTING)
        {
            (new EasyMetric("HERE_CONNECTING_STATE_TERMINATED")).a(l).a("reason", s).e();
        } else
        {
            (new EasyMetric("HERE_CONNECTED_STATE_TERMINATED")).a(l).a("reason", s).e();
        }
        f(s);
    }

    private void f(String s)
    {
        boolean flag1 = true;
        boolean flag;
        if (mOutgoingVideoState != OutgoingVideoState.DISCONNECTED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!mIsVideoIncoming || !flag)
        {
            flag1 = false;
        }
        if (mIsVideoBidirectional == flag1)
        {
            return;
        }
        mIsVideoBidirectional = flag1;
        if (mIsVideoBidirectional)
        {
            (new EasyMetric("HERE_SESSION_START")).e();
            mAnalyticsPlatform.a(new hH());
            mVideoBidirectionalStart = SystemClock.elapsedRealtime();
            return;
        } else
        {
            long l = SystemClock.elapsedRealtime() - mVideoBidirectionalStart;
            hG hg = new hG();
            hg.view_time_sec = Double.valueOf((double)l / 1000D);
            mAnalyticsPlatform.a(hg);
            (new EasyMetric("HERE_SESSION_END")).a(l).a("reason", s).e();
            return;
        }
    }

    public final void a()
    {
        boolean flag;
        if (mOutgoingVideoState != OutgoingVideoState.DISCONNECTED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            mOutgoingVideoState = OutgoingVideoState.CONNECTING;
            EasyMetric easymetric;
            long l;
            boolean flag1;
            if (mTimeStartCanStreamVideo == -1L)
            {
                l = -1L;
            } else
            {
                l = SystemClock.elapsedRealtime() - mTimeStartCanStreamVideo;
            }
            flag1 = mAdlConnectedToScope;
            easymetric = new EasyMetric("HERE_OUTGOING_SESSION_START");
            if (l != -1L)
            {
                easymetric.a(l);
            }
            easymetric.a("is_connected_to_scope", Boolean.valueOf(flag1)).e();
            mVideoOutgoingStart = SystemClock.elapsedRealtime();
            mTimeStartCanStreamVideo = -1L;
            f("startHoldingToStream()");
        }
    }

    public final void a(String s)
    {
        e(s);
    }

    public final void a(boolean flag)
    {
        if (mIsVideoIncoming == flag)
        {
            return;
        }
        mIsVideoIncoming = flag;
        if (mIsVideoIncoming)
        {
            (new EasyMetric("HERE_INCOMING_SESSION_START")).e();
            mVideoIncomingStart = SystemClock.elapsedRealtime();
        } else
        {
            long l = SystemClock.elapsedRealtime() - mVideoIncomingStart;
            hE he = new hE();
            he.view_time_sec = Double.valueOf((double)l / 1000D);
            mAnalyticsPlatform.a(he);
            (new EasyMetric("HERE_INCOMING_SESSION_END")).a(l).a("reason", null).e();
        }
        f((new StringBuilder("setIncomingVideo(")).append(Boolean.toString(flag)).append(")").toString());
    }

    public final void b()
    {
        if (mOutgoingVideoState == OutgoingVideoState.CONNECTING)
        {
            mOutgoingVideoState = OutgoingVideoState.CONNECTED;
            long l = SystemClock.elapsedRealtime();
            long l1 = mVideoOutgoingStart;
            d(SetupPhase.HERE_CONFIRMED.name());
            (new EasyMetric("HERE_OUTGOING_ACKED")).a(l - l1).e();
        }
    }

    public final void b(String s)
    {
        e(s);
    }

    public final void b(boolean flag)
    {
        long l = -1L;
        boolean flag1;
        if (mTimeStartCanStreamVideo != -1L)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag == flag1)
        {
            return;
        }
        if (flag)
        {
            l = SystemClock.elapsedRealtime();
        }
        mTimeStartCanStreamVideo = l;
    }

    public final void c()
    {
        mAdlConnectedToScope = true;
    }

    public final void c(String s)
    {
        mAdlConnectedToScope = false;
        e(s);
    }

    public final void c(boolean flag)
    {
        EasyMetric easymetric = new EasyMetric("HERE_PUBLISH_LOCKED");
        String s;
        if (flag)
        {
            s = "bottom";
        } else
        {
            s = "top";
        }
        easymetric.a("position", s).e();
    }

    public final void d()
    {
        (new EasyMetric("HERE_INIT_FAILED")).a(false);
    }

    public final void d(String s)
    {
        EasyMetric easymetric = new EasyMetric(s);
        long l = SystemClock.elapsedRealtime();
        if (s.equalsIgnoreCase(SetupPhase.HERE_AVAILABLE.name()))
        {
            mHereAvailableTimestamp = l;
            mAnalyticsPlatform.a(new hF());
        } else
        {
            easymetric.a(l - mPreviousSetupEventTimestamp);
            easymetric.a("timeToEvent", a(l - mPreviousSetupEventTimestamp));
        }
        if (s.equalsIgnoreCase(SetupPhase.HERE_PUBLISHED.name()) && mHereAvailableTimestamp != -1L)
        {
            easymetric.a("timeToFirstEvent", a(l - mHereAvailableTimestamp));
            mHereAvailableTimestamp = -1L;
        }
        easymetric.e();
        mPreviousSetupEventTimestamp = l;
    }

    public final void e()
    {
        mStartOfVideoStream = SystemClock.elapsedRealtime();
    }
}
