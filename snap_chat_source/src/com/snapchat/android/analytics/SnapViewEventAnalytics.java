// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics;

import com.snapchat.android.analytics.framework.EasyMetric;
import hn;

public final class SnapViewEventAnalytics
{
    public static final class EndReason extends Enum
    {

        private static final EndReason $VALUES[];
        public static final EndReason BACK_PRESSED;
        public static final EndReason ENTER_BACKGROUND;
        public static final EndReason ERROR;
        public static final EndReason FINISHED_VIEWING;
        public static final EndReason KICKED_OUT;
        public static final EndReason SWIPED_DOWN;
        public static final EndReason TAP_PAST_END;
        private final String mEventName;
        private final hn mExitEvent;

        public static EndReason valueOf(String s)
        {
            return (EndReason)Enum.valueOf(com/snapchat/android/analytics/SnapViewEventAnalytics$EndReason, s);
        }

        public static EndReason[] values()
        {
            return (EndReason[])$VALUES.clone();
        }

        public final String getEventName()
        {
            return mEventName;
        }

        public final hn getExitEvent()
        {
            return mExitEvent;
        }

        static 
        {
            FINISHED_VIEWING = new EndReason("FINISHED_VIEWING", 0, "finished_viewing", hn.AUTO_ADVANCE);
            TAP_PAST_END = new EndReason("TAP_PAST_END", 1, "finished_viewing", hn.TAP);
            SWIPED_DOWN = new EndReason("SWIPED_DOWN", 2, "user_exited", hn.SWIPE_DOWN);
            BACK_PRESSED = new EndReason("BACK_PRESSED", 3, "back_pressed", hn.BACK_PRESSED);
            KICKED_OUT = new EndReason("KICKED_OUT", 4, "kicked_out", hn.ERROR);
            ENTER_BACKGROUND = new EndReason("ENTER_BACKGROUND", 5, "enter_background", hn.ENTER_BACKGROUND);
            ERROR = new EndReason("ERROR", 6, "error", hn.ERROR);
            $VALUES = (new EndReason[] {
                FINISHED_VIEWING, TAP_PAST_END, SWIPED_DOWN, BACK_PRESSED, KICKED_OUT, ENTER_BACKGROUND, ERROR
            });
        }

        private EndReason(String s, int i, String s1, hn hn1)
        {
            super(s, i);
            mEventName = s1;
            mExitEvent = hn1;
        }
    }

    public static final class SnapViewEventSourceType extends Enum
    {

        private static final SnapViewEventSourceType $VALUES[];
        public static final SnapViewEventSourceType CHAT;
        public static final SnapViewEventSourceType FEED;
        public static final SnapViewEventSourceType STORY;

        public static SnapViewEventSourceType valueOf(String s)
        {
            return (SnapViewEventSourceType)Enum.valueOf(com/snapchat/android/analytics/SnapViewEventAnalytics$SnapViewEventSourceType, s);
        }

        public static SnapViewEventSourceType[] values()
        {
            return (SnapViewEventSourceType[])$VALUES.clone();
        }

        static 
        {
            STORY = new SnapViewEventSourceType("STORY", 0);
            FEED = new SnapViewEventSourceType("FEED", 1);
            CHAT = new SnapViewEventSourceType("CHAT", 2);
            $VALUES = (new SnapViewEventSourceType[] {
                STORY, FEED, CHAT
            });
        }

        private SnapViewEventSourceType(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String CONTEXT_PARAM = "context";
    public static final String HIDE_SNAP_EVENT = "HIDE_SNAP";
    private static SnapViewEventAnalytics INSTANCE = new SnapViewEventAnalytics();
    public static final String REASON_PARAM = "reason";
    public static final String SENDER_PARAM = "sender";
    public static final String SNAP_STACK_LOADING_EVENT = "SNAP_STACK_LOADING";
    public static final String SNAP_VIEW_FAILED_EVENT = "SNAP_VIEW_FAILED";
    public static final String SNAP_VIEW_SUCCESS_EVENT = "SNAP_VIEW_SUCCESS";
    public static final String STORY_VIEW_FAILED_EVENT = "STORY_VIEW_FAILED";
    public static final String TYPE_PARAM = "type";
    public static final String VIEW_NEXT_SNAP_EVENT = "VIEW_NEXT_SNAP";
    public static final String VIEW_SNAP_EVENT = "VIEW_SNAP";
    public static final String WAS_SKIPPED_PARAM = "wasSkipped";
    private final com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory mEasyMetricFactory;
    private EasyMetric mHideSnapMetric;
    private EasyMetric mViewNextSnapMetric;
    private EasyMetric mViewSnapMetric;

    private SnapViewEventAnalytics()
    {
        this(new com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory());
    }

    private SnapViewEventAnalytics(com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory easymetricfactory)
    {
        mEasyMetricFactory = easymetricfactory;
    }

    public static SnapViewEventAnalytics a()
    {
        return INSTANCE;
    }

    public final void a(SnapViewEventSourceType snapvieweventsourcetype)
    {
        snapvieweventsourcetype = snapvieweventsourcetype.toString().toLowerCase();
        mViewSnapMetric = com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.b("VIEW_SNAP").a("context", snapvieweventsourcetype).b();
    }

    public final void a(boolean flag)
    {
        mViewNextSnapMetric = com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.b("VIEW_NEXT_SNAP").a("wasSkipped", Boolean.valueOf(flag)).b();
    }

    public final void a(boolean flag, EndReason endreason)
    {
        String s;
        if (flag)
        {
            s = "video";
        } else
        {
            s = "image";
        }
        mHideSnapMetric = com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.b("HIDE_SNAP").a("type", s).a("reason", endreason.getEventName()).b();
    }

    public final void a(boolean flag, boolean flag1)
    {
        String s;
        if (flag)
        {
            s = "video";
        } else
        {
            s = "image";
        }
        if (mViewSnapMetric != null)
        {
            mViewSnapMetric.a("type", s).b(false);
            mViewSnapMetric = null;
        } else
        if (mViewNextSnapMetric != null)
        {
            String s1;
            if (flag1)
            {
                s1 = "story";
            } else
            {
                s1 = "feed";
            }
            mViewNextSnapMetric.a("type", s).a("context", s1).b(false);
            mViewNextSnapMetric = null;
            return;
        }
    }

    public final void b()
    {
        if (mHideSnapMetric != null)
        {
            mHideSnapMetric.b(false);
            mHideSnapMetric = null;
        }
    }

}
