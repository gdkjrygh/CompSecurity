// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics;

import Io;
import Iw;
import Sr;
import com.snapchat.android.analytics.framework.EasyMetric;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public final class NetworkAnalytics
{
    public static final class PageContext extends Enum
    {

        private static final PageContext $VALUES[];
        public static final PageContext FEED;
        public static final PageContext STORY;

        public static PageContext valueOf(String s)
        {
            return (PageContext)Enum.valueOf(com/snapchat/android/analytics/NetworkAnalytics$PageContext, s);
        }

        public static PageContext[] values()
        {
            return (PageContext[])$VALUES.clone();
        }

        static 
        {
            FEED = new PageContext("FEED", 0);
            STORY = new PageContext("STORY", 1);
            $VALUES = (new PageContext[] {
                FEED, STORY
            });
        }

        private PageContext(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String CLIENT_ID_PARAM = "client_id";
    public static final String CONTENT_LOADED_EVENT = "CONTENT_LOADED";
    public static final String CONTENT_READY_EVENT = "CONTENT_READY";
    public static final String CONTEXT_PARAM = "context";
    public static final String FIRST_ITEM_READY_EVENT = "FIRST_ITEM_READY";
    public static final String FROM_NOTIFICATION_PARAM = "from_notification";
    public static final String IS_DOUBLE_POST_PARAM = "is_double_post";
    public static final String IS_FULL_RESPONSE_PARAM = "is_full_response";
    public static final String MEDIA_DURATION_PARAM = "media_duration";
    public static final String MEDIA_SIZE_PARAM = "media_size";
    public static final String PATH_PARAM = "path";
    public static final String PREVIEW_SCREEN_CONTEXT = "preview_screen";
    public static final String PULL_TO_REFRESH_EVENT = "PULL_TO_REFRESH";
    public static final String REACHABILITY_PARAM = "reachability";
    public static final String RECEIVED_BYTES_PARAM = "return_size_bytes";
    public static final String RESPONSE_CHECKSUM_PARAM = "response_checksum";
    public static final String RESPONSE_COMPARE_RESULTS_DICT_PARAM = "response_compare_results_dict";
    public static final String RESPONSE_COMPARE_RESULT_PARAM = "response_compare_result";
    public static final String RETRY_POST_FAILED_STORY_CONTEXT = "retry_post_failed_story";
    public static final String RETRY_SEND_FAILED_SNAP_CONTEXT = "retry_send_failed_snap";
    public static final String SEND_TO_SCREEN_CONTEXT = "send_to_screen";
    public static final String SERVER_INFO_PARAM = "server_info";
    public static final String SERVER_LATENCY_PARAM = "server_latency";
    public static final String SNAP_SENT_DELAY_EVENT = "SNAP_SENT_DELAY";
    public static final String SNAP_SENT_FAILED_EVENT = "SNAP_SENT_FAILED";
    protected static final String SNAP_SENT_SNAP_DUMMY_EVENT = "SNAP_SENT_SNAP_DUMMY";
    protected static final String SNAP_SENT_STORY_DUMMY_EVENT = "SNAP_SENT_STORY_DUMMY";
    public static final String SNAP_SENT_SUCCESS_EVENT = "SNAP_SENT_SUCCESS";
    public static final String STATUS_CODE_PARAM = "status_code";
    public static final String STORY_POST_DELAY_EVENT = "STORY_POST_DELAY";
    public static final String SUCCESS_PARAM = "success";
    public static final String TYPE_PARAM = "type";
    public static final String USED_UPLOAD_URL_PARAM = "used_upload_url";
    public static final String WITH_MEDIA_PARAM = "with_media";
    private static final NetworkAnalytics sInstance = new NetworkAnalytics();
    private EasyMetric mContentReadyMetric;
    public EasyMetric mFeedContentLoadedMetric;
    private EasyMetric mFirstItemReadyMetric;
    public boolean mFromNotification;
    private final com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory mMetricFactory;
    private final Map mRequestTaskResponseMap;
    public EasyMetric mStoryContentLoadedMetric;
    private final Map mTimedMetricsMap;

    private NetworkAnalytics()
    {
        this(new com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory());
    }

    private NetworkAnalytics(com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory easymetricfactory)
    {
        mFromNotification = false;
        mMetricFactory = easymetricfactory;
        mTimedMetricsMap = new ConcurrentHashMap();
        mRequestTaskResponseMap = new ConcurrentHashMap();
    }

    public static NetworkAnalytics a()
    {
        return sInstance;
    }

    private EasyMetric a(String s, String s1)
    {
        Map map = mTimedMetricsMap;
        map;
        JVM INSTR monitorenter ;
        s = (Map)mTimedMetricsMap.get(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        s = (EasyMetric)s.remove(s1);
        map;
        JVM INSTR monitorexit ;
        return s;
        map;
        JVM INSTR monitorexit ;
        return null;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    private void a(EasyMetric easymetric, PageContext pagecontext, UUID uuid)
    {
        if (easymetric != null)
        {
            if (uuid != null)
            {
                a(easymetric, uuid);
            }
            easymetric.a("context", Io.a(pagecontext));
            easymetric.b(false);
        }
    }

    private void a(EasyMetric easymetric, UUID uuid)
    {
        if (uuid != null)
        {
            if ((uuid = (Map)mRequestTaskResponseMap.remove(uuid)) != null)
            {
                easymetric.a("reachability", uuid.get("reachability"));
                easymetric.a("success", Boolean.valueOf(Iw.a(((Integer)uuid.get("status_code")).intValue())));
                easymetric.a("return_size_bytes", uuid.get("return_size_bytes"));
                if (uuid.containsKey("server_info"))
                {
                    uuid = (Sr)uuid.get("server_info");
                    boolean flag;
                    if (Sr.a.EQUAL != uuid.e())
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    easymetric.a("is_full_response", Boolean.valueOf(flag));
                    easymetric.a("server_latency", uuid.a());
                    easymetric.a("response_checksum", uuid.b());
                    easymetric.a("response_compare_result", uuid.d());
                    easymetric.a("response_compare_results_dict", uuid.f());
                    return;
                }
            }
        }
    }

    private void a(String s, String s1, EasyMetric easymetric)
    {
        Map map1 = mTimedMetricsMap;
        map1;
        JVM INSTR monitorenter ;
        Map map = (Map)mTimedMetricsMap.get(s);
        Object obj;
        obj = map;
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        obj = new HashMap();
        ((Map) (obj)).put(s1, easymetric);
        mTimedMetricsMap.put(s, obj);
        map1;
        JVM INSTR monitorexit ;
        return;
        s;
        map1;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void a(PageContext pagecontext)
    {
        static final class _cls1
        {

            static final int $SwitchMap$com$snapchat$android$analytics$NetworkAnalytics$PageContext[];

            static 
            {
                $SwitchMap$com$snapchat$android$analytics$NetworkAnalytics$PageContext = new int[PageContext.values().length];
                try
                {
                    $SwitchMap$com$snapchat$android$analytics$NetworkAnalytics$PageContext[PageContext.FEED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$snapchat$android$analytics$NetworkAnalytics$PageContext[PageContext.STORY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.snapchat.android.analytics.NetworkAnalytics.PageContext[pagecontext.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            a(mFeedContentLoadedMetric, pagecontext, ((UUID) (null)));
            mFeedContentLoadedMetric = null;
            return;

        case 2: // '\002'
            a(mStoryContentLoadedMetric, pagecontext, ((UUID) (null)));
            break;
        }
        mStoryContentLoadedMetric = null;
    }

    public final void a(PageContext pagecontext, UUID uuid)
    {
        a(mContentReadyMetric, pagecontext, uuid);
    }

    public final void a(String s, String s1, int i, long l, String s2, Sr sr, 
            boolean flag)
    {
        EasyMetric easymetric = a(s, s1);
        if (easymetric != null)
        {
            easymetric.a("status_code", Integer.valueOf(i)).a("return_size_bytes", Long.valueOf(l)).a("reachability", s2);
            if (sr != null)
            {
                boolean flag1;
                if (Sr.a.EQUAL != sr.e())
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                easymetric.a("server_info", sr).a("is_full_response", Boolean.valueOf(flag1));
            }
            easymetric.a("is_double_post", Boolean.valueOf(flag));
            a(s, s1, easymetric);
        }
    }

    public final void a(String s, String s1, String s2)
    {
        a(s, s1, com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.b(s).a("context", s2).a("with_media", Boolean.valueOf(false)).a("media_size", Double.valueOf(0.0D)).b());
    }

    public final void a(String s, String s1, String s2, int i, String s3, long l)
    {
        EasyMetric easymetric1 = a(s, s1);
        EasyMetric easymetric = easymetric1;
        if (easymetric1 == null)
        {
            easymetric = com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.a(s).a("path", s2);
        }
        easymetric.a("reachability", s3).a("status_code", Integer.valueOf(i)).a("client_id", s1).a(l);
        a(s, s1, easymetric);
    }

    public final void a(String s, String s1, String s2, String s3, long l)
    {
        EasyMetric easymetric = a(s, s2);
        if (easymetric != null)
        {
            easymetric.a("media_size", Long.valueOf(l)).a("with_media", Boolean.valueOf(true));
            a(s, s2, easymetric);
        }
        easymetric = a(s1, s2);
        s = easymetric;
        if (easymetric == null)
        {
            s = com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.a(s1);
        }
        s.a("path", s3);
        a(s1, s2, ((EasyMetric) (s)));
    }

    public final void a(String s, String s1, String s2, boolean flag, double d, boolean flag1, 
            boolean flag2)
    {
        s = a(s, s2);
        if (s != null)
        {
            EasyMetric easymetric = s.a("success", Boolean.valueOf(flag2));
            if (flag)
            {
                s = "video";
            } else
            {
                s = "image";
            }
            easymetric.a("type", s).a("media_duration", Double.valueOf(d)).a("used_upload_url", Boolean.valueOf(flag1)).b(false);
        }
        s1 = a(s1, s2);
        if (s1 != null)
        {
            if (flag2)
            {
                s = "SNAP_SENT_SUCCESS";
            } else
            {
                s = "SNAP_SENT_FAILED";
            }
            s1 = s1.a(s);
            if (flag)
            {
                s = "video";
            } else
            {
                s = "image";
            }
            s1.a("type", s).b(false);
        }
    }

    public final void a(UUID uuid)
    {
        EasyMetric easymetric = a("PULL_TO_REFRESH", "PULL_TO_REFRESH");
        if (easymetric != null)
        {
            a(easymetric, uuid);
            easymetric.b(false);
        }
    }

    public final void a(UUID uuid, int i, long l, String s, Sr sr)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("status_code", Integer.valueOf(i));
        hashmap.put("reachability", s);
        hashmap.put("return_size_bytes", Long.valueOf(l));
        if (sr != null)
        {
            hashmap.put("server_info", sr);
        }
        mRequestTaskResponseMap.put(uuid, hashmap);
    }

    public final void b()
    {
        mFirstItemReadyMetric = com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.b("FIRST_ITEM_READY").a("from_notification", Boolean.valueOf(mFromNotification)).b();
        mContentReadyMetric = com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.b("CONTENT_READY").a("from_notification", Boolean.valueOf(mFromNotification)).b();
        mFromNotification = false;
    }

    public final void b(PageContext pagecontext)
    {
        a("PULL_TO_REFRESH", "PULL_TO_REFRESH", com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.b("PULL_TO_REFRESH").a("context", Io.a(pagecontext)).b());
    }

    public final void b(PageContext pagecontext, UUID uuid)
    {
        a(mFirstItemReadyMetric, pagecontext, uuid);
    }

}
