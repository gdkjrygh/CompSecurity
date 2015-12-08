// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics;

import BD;
import BF;
import Cl;
import android.text.TextUtils;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.model.chat.ChatMedia;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class ChatPerformanceAnalytics
{
    public static final class ChatMediaType extends Enum
    {

        private static final ChatMediaType $VALUES[];
        public static final ChatMediaType CHAT_MEDIA;
        public static final ChatMediaType DISCOVER_SHARE_IMAGE;
        public static final ChatMediaType DISCOVER_SHARE_VIDEO;
        public static final ChatMediaType MEDIA_CARD;
        public static final ChatMediaType STORY_REPLY_IMAGE;
        public static final ChatMediaType STORY_REPLY_VIDEO;

        public static ChatMediaType valueOf(String s)
        {
            return (ChatMediaType)Enum.valueOf(com/snapchat/android/analytics/ChatPerformanceAnalytics$ChatMediaType, s);
        }

        public static ChatMediaType[] values()
        {
            return (ChatMediaType[])$VALUES.clone();
        }

        static 
        {
            CHAT_MEDIA = new ChatMediaType("CHAT_MEDIA", 0);
            MEDIA_CARD = new ChatMediaType("MEDIA_CARD", 1);
            DISCOVER_SHARE_IMAGE = new ChatMediaType("DISCOVER_SHARE_IMAGE", 2);
            DISCOVER_SHARE_VIDEO = new ChatMediaType("DISCOVER_SHARE_VIDEO", 3);
            STORY_REPLY_IMAGE = new ChatMediaType("STORY_REPLY_IMAGE", 4);
            STORY_REPLY_VIDEO = new ChatMediaType("STORY_REPLY_VIDEO", 5);
            $VALUES = (new ChatMediaType[] {
                CHAT_MEDIA, MEDIA_CARD, DISCOVER_SHARE_IMAGE, DISCOVER_SHARE_VIDEO, STORY_REPLY_IMAGE, STORY_REPLY_VIDEO
            });
        }

        private ChatMediaType(String s, int i)
        {
            super(s, i);
        }
    }


    protected static final String CHAT_MEDIA_DOWNLOAD_METRIC_NAME = "CHAT_MEDIA_DOWNLOAD";
    protected static final String CHAT_STORY_REPLY_FULL_SCREEN_VIDEO_LOAD = "CHAT_STORY_REPLY_FULL_SCREEN_VIDEO_LOAD";
    protected static final String CHAT_STORY_REPLY_THUMBNAIL_VIDEO_LOAD = "CHAT_STORY_REPLY_THUMBNAIL_VIDEO_LOAD";
    protected static final String DISCOVER_SHARE_BAR_ICON_LOAD_METRIC_NAME = "DISCOVER_SHARE_BAR_ICON_LOAD";
    protected static final String DISCOVER_SHARE_FULL_SCREEN_VIDEO_LOAD = "DISCOVER_SHARE_FULL_SCREEN_VIDEO_LOAD";
    protected static final String DISCOVER_SHARE_LINK_VALIDATION_METRIC_NAME = "DISCOVER_SHARE_LINK_VALIDATION";
    protected static final String DISCOVER_SHARE_THUMBNAIL_VIDEO_LOAD = "DISCOVER_SHARE_THUMBNAIL_VIDEO_LOAD";
    private static final ChatPerformanceAnalytics INSTANCE = new ChatPerformanceAnalytics();
    protected static final String LINK_STATUS_KEY = "link_status";
    protected static final String REACHABILITY_KEY = "reachability";
    protected static final String SIZE_KEY = "size";
    protected static final String STATUS_KEY = "status";
    protected static final String TYPE_KEY = "type";
    protected static final String VIDEO_ERROR_KEY = "video_error";
    private final com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory mEasyMetricFactory;
    public final Cl mNetworkStatusManager;
    private final Set mReportedFullscreenVideoLoadMetricIds;
    private final Set mReportedInlineVideoLoadMetricIds;
    private final ConcurrentHashMap mTimedMetricsMap;

    private ChatPerformanceAnalytics()
    {
        this(new com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory(), Cl.a());
    }

    private ChatPerformanceAnalytics(com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory easymetricfactory, Cl cl)
    {
        mReportedInlineVideoLoadMetricIds = new HashSet();
        mReportedFullscreenVideoLoadMetricIds = new HashSet();
        mEasyMetricFactory = easymetricfactory;
        mNetworkStatusManager = cl;
        mTimedMetricsMap = new ConcurrentHashMap();
    }

    public static ChatPerformanceAnalytics a()
    {
        return INSTANCE;
    }

    public static void a(EasyMetric easymetric, int i)
    {
        if (!TextUtils.equals("CHAT_MEDIA_DOWNLOAD", easymetric.a()))
        {
            throw new RuntimeException((new StringBuilder("Attempted to log end for CHAT_MEDIA_DOWNLOAD metric with metric named ")).append(easymetric.a()).toString());
        } else
        {
            easymetric.a("size", Integer.valueOf(i)).b(false);
            return;
        }
    }

    private static String b(ChatMedia chatmedia, boolean flag)
    {
        if (chatmedia instanceof BF)
        {
            if (flag)
            {
                return "CHAT_STORY_REPLY_THUMBNAIL_VIDEO_LOAD";
            } else
            {
                return "CHAT_STORY_REPLY_FULL_SCREEN_VIDEO_LOAD";
            }
        }
        if (chatmedia instanceof BD)
        {
            if (flag)
            {
                return "DISCOVER_SHARE_THUMBNAIL_VIDEO_LOAD";
            } else
            {
                return "DISCOVER_SHARE_FULL_SCREEN_VIDEO_LOAD";
            }
        } else
        {
            throw new RuntimeException((new StringBuilder("Unsupported chat media ")).append(chatmedia.toString()).toString());
        }
    }

    public final EasyMetric a(ChatMediaType chatmediatype)
    {
        return com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.a("CHAT_MEDIA_DOWNLOAD").a("type", chatmediatype.name()).a("reachability", mNetworkStatusManager.f()).b();
    }

    public final EasyMetric a(String s, String s1)
    {
        ConcurrentHashMap concurrenthashmap = mTimedMetricsMap;
        concurrenthashmap;
        JVM INSTR monitorenter ;
        s = (Map)mTimedMetricsMap.get(s);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        concurrenthashmap;
        JVM INSTR monitorexit ;
        return null;
        s = (EasyMetric)s.get(s1);
        concurrenthashmap;
        JVM INSTR monitorexit ;
        return s;
        s;
        concurrenthashmap;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void a(ChatMedia chatmedia, boolean flag)
    {
        String s = b(chatmedia, flag);
        chatmedia = chatmedia.d();
        if (a(s, ((String) (chatmedia))) == null)
        {
            a(s, ((String) (chatmedia)), com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.a(s).a("reachability", mNetworkStatusManager.f()).b());
        }
    }

    public final void a(ChatMedia chatmedia, boolean flag, boolean flag1)
    {
        Object obj = b(chatmedia, flag);
        String s = chatmedia.d();
        if (flag)
        {
            chatmedia = mReportedInlineVideoLoadMetricIds;
        } else
        {
            chatmedia = mReportedFullscreenVideoLoadMetricIds;
        }
        chatmedia;
        JVM INSTR monitorenter ;
        if (chatmedia.contains(s))
        {
            break MISSING_BLOCK_LABEL_74;
        }
        obj = a(((String) (obj)), s);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        ((EasyMetric) (obj)).a("video_error", Boolean.valueOf(flag1)).b(false);
        chatmedia.add(s);
        chatmedia;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        chatmedia;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(String s, String s1, EasyMetric easymetric)
    {
        ConcurrentHashMap concurrenthashmap = mTimedMetricsMap;
        concurrenthashmap;
        JVM INSTR monitorenter ;
        Map map = (Map)mTimedMetricsMap.get(s);
        Object obj;
        obj = map;
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        obj = new HashMap();
        mTimedMetricsMap.put(s, obj);
        ((Map) (obj)).put(s1, easymetric);
        concurrenthashmap;
        JVM INSTR monitorexit ;
        return;
        s;
        concurrenthashmap;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void a(String s, boolean flag, boolean flag1)
    {
label0:
        {
            if (flag1 && flag)
            {
                throw new RuntimeException("Logging DISCOVER_SHARE_BAR_ICON_LOAD cannot be both successful and canceled!");
            }
            s = a("DISCOVER_SHARE_BAR_ICON_LOAD", s);
            if (s != null)
            {
                if (!flag1)
                {
                    break label0;
                }
                s.a("status", "CANCELED").b(false);
            }
            return;
        }
        if (flag)
        {
            s.a("status", "SUCCESS").b(false);
            return;
        } else
        {
            s.a("status", "FAILED").b(false);
            return;
        }
    }

}
