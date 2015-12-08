// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics;

import AA;
import AB;
import AS;
import AT;
import BD;
import BF;
import Bk;
import Br;
import Bt;
import Bw;
import Cl;
import Fx;
import IY;
import Io;
import Ke;
import Pg;
import android.os.Build;
import android.text.TextUtils;
import com.flurry.android.FlurryAgent;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.camera.transcoding.TranscodingPreferencesWrapper;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendAction;
import com.snapchat.android.model.FriendManager;
import com.snapchat.android.model.Mediabryo;
import com.snapchat.android.model.chat.Chat;
import com.snapchat.android.model.chat.ChatFeedItem;
import com.snapchat.android.model.chat.ChatMedia;
import com.snapchat.android.util.debug.ReleaseManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import lU;
import le;
import rt;

public abstract class AnalyticsEvents
{
    public static final class AddFriendSourceType extends Enum
    {

        private static final AddFriendSourceType $VALUES[];
        public static final AddFriendSourceType ADDED_BY_NEARBY;
        public static final AddFriendSourceType ADDED_BY_SUGGESTED;
        public static final AddFriendSourceType ADDED_ME_BACK;
        public static final AddFriendSourceType CONTACTS;
        public static final AddFriendSourceType OFFICIAL_STORY_SEARCH;
        public static final AddFriendSourceType QR_CODE;
        public static final AddFriendSourceType USERNAME;
        private final com.snapchat.android.model.Friend.AddSourceType mAddSourceType;

        public static AddFriendSourceType valueOf(String s1)
        {
            return (AddFriendSourceType)Enum.valueOf(com/snapchat/android/analytics/AnalyticsEvents$AddFriendSourceType, s1);
        }

        public static AddFriendSourceType[] values()
        {
            return (AddFriendSourceType[])$VALUES.clone();
        }

        public final com.snapchat.android.model.Friend.AddSourceType getAddSourceType()
        {
            return mAddSourceType;
        }

        static 
        {
            CONTACTS = new AddFriendSourceType("CONTACTS", 0, com.snapchat.android.model.Friend.AddSourceType.ADDED_BY_PHONE);
            USERNAME = new AddFriendSourceType("USERNAME", 1, com.snapchat.android.model.Friend.AddSourceType.ADDED_BY_USERNAME);
            QR_CODE = new AddFriendSourceType("QR_CODE", 2, com.snapchat.android.model.Friend.AddSourceType.ADDED_BY_QR_CODE);
            ADDED_ME_BACK = new AddFriendSourceType("ADDED_ME_BACK", 3, com.snapchat.android.model.Friend.AddSourceType.ADDED_BY_ADDED_ME_BACK);
            ADDED_BY_NEARBY = new AddFriendSourceType("ADDED_BY_NEARBY", 4, com.snapchat.android.model.Friend.AddSourceType.ADDED_BY_NEARBY);
            ADDED_BY_SUGGESTED = new AddFriendSourceType("ADDED_BY_SUGGESTED", 5, com.snapchat.android.model.Friend.AddSourceType.ADDED_BY_SUGGESTED);
            OFFICIAL_STORY_SEARCH = new AddFriendSourceType("OFFICIAL_STORY_SEARCH", 6, com.snapchat.android.model.Friend.AddSourceType.ADDED_BY_OFFICIAL_STORY_SEARCH);
            $VALUES = (new AddFriendSourceType[] {
                CONTACTS, USERNAME, QR_CODE, ADDED_ME_BACK, ADDED_BY_NEARBY, ADDED_BY_SUGGESTED, OFFICIAL_STORY_SEARCH
            });
        }

        private AddFriendSourceType(String s1, int i1, com.snapchat.android.model.Friend.AddSourceType addsourcetype)
        {
            super(s1, i1);
            mAddSourceType = addsourcetype;
        }
    }

    public static final class AnalyticsContext extends Enum
    {

        private static final AnalyticsContext $VALUES[];
        public static final AnalyticsContext CAMERA_PAGE;
        public static final AnalyticsContext CONTACTS;
        public static final AnalyticsContext FEED;
        public static final AnalyticsContext HELP_PAGE;
        public static final AnalyticsContext MY_FRIENDS_POPUP;
        public static final AnalyticsContext NEW_USER_CONTACT_BOOK_PAGE;
        public static final AnalyticsContext PROFILE_ADDED_ME_PAGE;
        public static final AnalyticsContext PROFILE_ADD_FRIENDS_BY_CONTACTS_PAGE;
        public static final AnalyticsContext PROFILE_ADD_FRIENDS_BY_USERNAME_PAGE;
        public static final AnalyticsContext PROFILE_ADD_FRIENDS_MENU_PAGE;
        public static final AnalyticsContext PROFILE_ADD_NEARBY_FRIENDS_PAGE;
        public static final AnalyticsContext PROFILE_MAIN_PAGE;
        public static final AnalyticsContext PROFILE_MY_CONTACTS_PAGE;
        public static final AnalyticsContext PROFILE_MY_FRIENDS_PAGE;
        public static final AnalyticsContext PROFILE_PICTURES_PAGE_VIEW;
        public static final AnalyticsContext REQUESTS;
        public static final AnalyticsContext SEARCH;
        public static final AnalyticsContext SEND;
        public static final AnalyticsContext SETTINGS;
        public static final AnalyticsContext SETTINGS_DISPLAYNAME_CHANGE;
        public static final AnalyticsContext SNAPCODE_PAGE;
        public static final AnalyticsContext STORIES;
        public static final AnalyticsContext TROPHY;
        public static final AnalyticsContext UNKNOWN;

        public static AnalyticsContext valueOf(String s1)
        {
            return (AnalyticsContext)Enum.valueOf(com/snapchat/android/analytics/AnalyticsEvents$AnalyticsContext, s1);
        }

        public static AnalyticsContext[] values()
        {
            return (AnalyticsContext[])$VALUES.clone();
        }

        static 
        {
            MY_FRIENDS_POPUP = new AnalyticsContext("MY_FRIENDS_POPUP", 0);
            REQUESTS = new AnalyticsContext("REQUESTS", 1);
            SEARCH = new AnalyticsContext("SEARCH", 2);
            CONTACTS = new AnalyticsContext("CONTACTS", 3);
            SEND = new AnalyticsContext("SEND", 4);
            STORIES = new AnalyticsContext("STORIES", 5);
            FEED = new AnalyticsContext("FEED", 6);
            PROFILE_MAIN_PAGE = new AnalyticsContext("PROFILE_MAIN_PAGE", 7);
            PROFILE_ADDED_ME_PAGE = new AnalyticsContext("PROFILE_ADDED_ME_PAGE", 8);
            PROFILE_ADD_FRIENDS_MENU_PAGE = new AnalyticsContext("PROFILE_ADD_FRIENDS_MENU_PAGE", 9);
            PROFILE_ADD_FRIENDS_BY_USERNAME_PAGE = new AnalyticsContext("PROFILE_ADD_FRIENDS_BY_USERNAME_PAGE", 10);
            PROFILE_ADD_NEARBY_FRIENDS_PAGE = new AnalyticsContext("PROFILE_ADD_NEARBY_FRIENDS_PAGE", 11);
            PROFILE_ADD_FRIENDS_BY_CONTACTS_PAGE = new AnalyticsContext("PROFILE_ADD_FRIENDS_BY_CONTACTS_PAGE", 12);
            PROFILE_MY_CONTACTS_PAGE = new AnalyticsContext("PROFILE_MY_CONTACTS_PAGE", 13);
            PROFILE_MY_FRIENDS_PAGE = new AnalyticsContext("PROFILE_MY_FRIENDS_PAGE", 14);
            PROFILE_PICTURES_PAGE_VIEW = new AnalyticsContext("PROFILE_PICTURES_PAGE_VIEW", 15);
            NEW_USER_CONTACT_BOOK_PAGE = new AnalyticsContext("NEW_USER_CONTACT_BOOK_PAGE", 16);
            SETTINGS = new AnalyticsContext("SETTINGS", 17);
            SETTINGS_DISPLAYNAME_CHANGE = new AnalyticsContext("SETTINGS_DISPLAYNAME_CHANGE", 18);
            CAMERA_PAGE = new AnalyticsContext("CAMERA_PAGE", 19);
            HELP_PAGE = new AnalyticsContext("HELP_PAGE", 20);
            SNAPCODE_PAGE = new AnalyticsContext("SNAPCODE_PAGE", 21);
            TROPHY = new AnalyticsContext("TROPHY", 22);
            UNKNOWN = new AnalyticsContext("UNKNOWN", 23);
            $VALUES = (new AnalyticsContext[] {
                MY_FRIENDS_POPUP, REQUESTS, SEARCH, CONTACTS, SEND, STORIES, FEED, PROFILE_MAIN_PAGE, PROFILE_ADDED_ME_PAGE, PROFILE_ADD_FRIENDS_MENU_PAGE, 
                PROFILE_ADD_FRIENDS_BY_USERNAME_PAGE, PROFILE_ADD_NEARBY_FRIENDS_PAGE, PROFILE_ADD_FRIENDS_BY_CONTACTS_PAGE, PROFILE_MY_CONTACTS_PAGE, PROFILE_MY_FRIENDS_PAGE, PROFILE_PICTURES_PAGE_VIEW, NEW_USER_CONTACT_BOOK_PAGE, SETTINGS, SETTINGS_DISPLAYNAME_CHANGE, CAMERA_PAGE, 
                HELP_PAGE, SNAPCODE_PAGE, TROPHY, UNKNOWN
            });
        }

        private AnalyticsContext(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static final class AnalyticsParent extends Enum
    {

        private static final AnalyticsParent $VALUES[];
        public static final AnalyticsParent ADD_FRIENDS;
        public static final AnalyticsParent REGISTER_ADD_FRIENDS;
        public static final AnalyticsParent SEND;
        public static final AnalyticsParent STORIES;
        public static final AnalyticsParent UNKNOWN;

        public static AnalyticsParent valueOf(String s1)
        {
            return (AnalyticsParent)Enum.valueOf(com/snapchat/android/analytics/AnalyticsEvents$AnalyticsParent, s1);
        }

        public static AnalyticsParent[] values()
        {
            return (AnalyticsParent[])$VALUES.clone();
        }

        static 
        {
            REGISTER_ADD_FRIENDS = new AnalyticsParent("REGISTER_ADD_FRIENDS", 0);
            ADD_FRIENDS = new AnalyticsParent("ADD_FRIENDS", 1);
            SEND = new AnalyticsParent("SEND", 2);
            STORIES = new AnalyticsParent("STORIES", 3);
            UNKNOWN = new AnalyticsParent("UNKNOWN", 4);
            $VALUES = (new AnalyticsParent[] {
                REGISTER_ADD_FRIENDS, ADD_FRIENDS, SEND, STORIES, UNKNOWN
            });
        }

        private AnalyticsParent(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static final class AnalyticsSendSnapSource extends Enum
    {

        private static final AnalyticsSendSnapSource $VALUES[];
        public static final AnalyticsSendSnapSource CAMERA;
        public static final AnalyticsSendSnapSource DOUBLE_TAP_DISCOVER;
        public static final AnalyticsSendSnapSource DOUBLE_TAP_FEED;
        public static final AnalyticsSendSnapSource DOUBLE_TAP_FRIENDS;
        public static final AnalyticsSendSnapSource IN_CHAT;
        public static final AnalyticsSendSnapSource QUICK_SNAP;

        public static AnalyticsSendSnapSource valueOf(String s1)
        {
            return (AnalyticsSendSnapSource)Enum.valueOf(com/snapchat/android/analytics/AnalyticsEvents$AnalyticsSendSnapSource, s1);
        }

        public static AnalyticsSendSnapSource[] values()
        {
            return (AnalyticsSendSnapSource[])$VALUES.clone();
        }

        static 
        {
            CAMERA = new AnalyticsSendSnapSource("CAMERA", 0);
            DOUBLE_TAP_FEED = new AnalyticsSendSnapSource("DOUBLE_TAP_FEED", 1);
            DOUBLE_TAP_FRIENDS = new AnalyticsSendSnapSource("DOUBLE_TAP_FRIENDS", 2);
            IN_CHAT = new AnalyticsSendSnapSource("IN_CHAT", 3);
            QUICK_SNAP = new AnalyticsSendSnapSource("QUICK_SNAP", 4);
            DOUBLE_TAP_DISCOVER = new AnalyticsSendSnapSource("DOUBLE_TAP_DISCOVER", 5);
            $VALUES = (new AnalyticsSendSnapSource[] {
                CAMERA, DOUBLE_TAP_FEED, DOUBLE_TAP_FRIENDS, IN_CHAT, QUICK_SNAP, DOUBLE_TAP_DISCOVER
            });
        }

        private AnalyticsSendSnapSource(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static final class LogoutReason extends Enum
    {

        private static final LogoutReason $VALUES[];
        public static final LogoutReason AUTHENTICATION_ERROR;
        public static final LogoutReason NO_USERNAME;
        public static final LogoutReason USER_INITIATED;

        public static LogoutReason valueOf(String s1)
        {
            return (LogoutReason)Enum.valueOf(com/snapchat/android/analytics/AnalyticsEvents$LogoutReason, s1);
        }

        public static LogoutReason[] values()
        {
            return (LogoutReason[])$VALUES.clone();
        }

        static 
        {
            USER_INITIATED = new LogoutReason("USER_INITIATED", 0);
            AUTHENTICATION_ERROR = new LogoutReason("AUTHENTICATION_ERROR", 1);
            NO_USERNAME = new LogoutReason("NO_USERNAME", 2);
            $VALUES = (new LogoutReason[] {
                USER_INITIATED, AUTHENTICATION_ERROR, NO_USERNAME
            });
        }

        private LogoutReason(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    static final class a
        implements Comparator
    {

        public final int compare(Object obj, Object obj1)
        {
            obj = (ChatFeedItem)obj;
            return (int)((((ChatFeedItem)obj1).W() - ((ChatFeedItem) (obj)).W()) % 0x7fffffffL);
        }

        a()
        {
        }
    }


    public static final String ADDITIONAL_SETTING_FILTERS = "TOGGLE_SETTING_FILTERS";
    public static final String ADDITIONAL_SETTING_FLASH = "TOGGLE_SETTING_FLASH";
    public static final String ADDITIONAL_SETTING_REPLAY = "TOGGLE_SETTING_REPLAY";
    public static final String ADDITIONAL_SETTING_TRAVEL_MODE = "TOGGLE_SETTING_TRAVEL_MODE";
    private static final float FULLVIEW_EPSILON = 0.1F;
    private static final String TAG = "AnalyticsEvents";
    private static Map sEventsTimer = new HashMap();
    private static com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory sMetricFactory = new com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory();
    private static Cl sNetworkStatusManager = Cl.a();

    public static void A()
    {
        (new EasyMetric("CHAT_DISCONNECTED")).b(true);
    }

    public static void B()
    {
        (new EasyMetric("MISSING_CHAT_OPENED_FROM_PUSH_NOTIF")).b(true);
    }

    public static void C()
    {
        (new EasyMetric("READ_CHAT_OPENED_FROM_PUSH_NOTIF")).b(true);
    }

    private static void D()
    {
        (new EasyMetric("CHAT_ACTIVE")).b(true);
    }

    public static void a()
    {
        boolean flag = Bt.al();
        EasyMetric easymetric;
        if (flag)
        {
            (new EasyMetric("SESSION_WITH_FILTERS_ENABLED")).b(true);
        } else
        {
            (new EasyMetric("SESSION_WITH_FILTERS_DISABLED")).b(true);
        }
        easymetric = new EasyMetric("ON_RESUME", 0.10000000000000001D);
        easymetric.a("DEVICE", Build.DEVICE);
        easymetric.a("MODEL", Build.MODEL);
        easymetric.a("SDK_INT", Integer.toString(android.os.Build.VERSION.SDK_INT));
        easymetric.a("SDK_RELEASE", android.os.Build.VERSION.RELEASE);
        easymetric.a("CPU_ABI", Build.CPU_ABI);
        easymetric.a("CPU_ABI2", Build.CPU_ABI2);
        easymetric.a("FILTERS_ENABLED", Boolean.toString(flag));
        easymetric.b(true);
    }

    public static void a(int i1)
    {
        (new EasyMetric("DRAW")).a("num_strokes", Integer.valueOf(i1)).b(true);
    }

    public static void a(int i1, int j1)
    {
        EasyMetric easymetric = com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.a("PAGE_CHANGED", 0.10000000000000001D);
        easymetric.a("Previous page", e(i1));
        easymetric.a("New page", e(j1));
        easymetric.b(false);
    }

    public static void a(long l1)
    {
        EasyMetric easymetric = new EasyMetric("CHAT_SESSION_END");
        String s1;
        if (l1 < 5000L)
        {
            s1 = "0-4 s";
        } else
        if (l1 < 10000L)
        {
            s1 = "5-9 s";
        } else
        if (l1 < 15000L)
        {
            s1 = "10-14 s";
        } else
        if (l1 < 20000L)
        {
            s1 = "15-19 s";
        } else
        if (l1 < 25000L)
        {
            s1 = "20-24 s";
        } else
        if (l1 < 30000L)
        {
            s1 = "25-29 s";
        } else
        if (l1 < 35000L)
        {
            s1 = "30-34 s";
        } else
        if (l1 < 40000L)
        {
            s1 = "35-39 s";
        } else
        if (l1 < 45000L)
        {
            s1 = "40-44 s";
        } else
        if (l1 < 50000L)
        {
            s1 = "45-49 s";
        } else
        if (l1 < 55000L)
        {
            s1 = "50-54 s";
        } else
        if (l1 < 60000L)
        {
            s1 = "55-59 s";
        } else
        {
            s1 = "60+ s";
        }
        easymetric.a("session_length_bucket", s1).a("session_length", Double.toString((double)l1 / 1000D)).b(true);
    }

    public static void a(long l1, int i1)
    {
        String s1 = sNetworkStatusManager.f();
        (new EasyMetric("CHAT_CONNECTED")).b(true);
        (new EasyMetric("CHAT_CONNECT_LATENCY")).a(l1).b(true);
        (new EasyMetric("CHAT_CONNECTED_AFTER_ATTEMPTS")).a("count", Integer.valueOf(i1)).a("reachability", s1).b(false);
    }

    public static void a(long l1, String s1, String s2)
    {
        EasyMetric easymetric = (new EasyMetric("MINI_PROFILE_VIEW")).a("user_last_taken_ts", Long.toString(l1));
        Object obj = s1;
        if (s1 == null)
        {
            obj = "";
        }
        obj = easymetric.a("mini_profile_page", ((String) (obj)));
        s1 = s2;
        if (s2 == null)
        {
            s1 = "";
        }
        ((EasyMetric) (obj)).a("friend", s1);
    }

    public static void a(long l1, String s1, String s2, String s3)
    {
        EasyMetric easymetric = (new EasyMetric("MINI_PROFILE_EXIT")).a("user_last_taken_ts", Long.toString(l1));
        Object obj = s1;
        if (s1 == null)
        {
            obj = "";
        }
        obj = easymetric.a("mini_profile_page", ((String) (obj)));
        s1 = s2;
        if (s2 == null)
        {
            s1 = "";
        }
        s2 = ((EasyMetric) (obj)).a("friend", s1);
        s1 = s3;
        if (s3 == null)
        {
            s1 = "";
        }
        s2.a("friend_has_picture", s1);
    }

    private static void a(AA aa)
    {
        int i1 = aa.mSwipeFilterNumSingleSwipes;
        int j1 = aa.mSwipeFilterNumDoubleSwipes;
        int k1 = i1 + j1;
        if (k1 > 0)
        {
            HashMap hashmap = new HashMap();
            String s1;
            if (aa.i() == 0)
            {
                s1 = "IMAGE";
            } else
            {
                s1 = "VIDEO";
            }
            hashmap.put("type", s1);
            new le();
            le.a(aa, hashmap);
            if (aa.mBaseFilter != null)
            {
                hashmap.put("filter", aa.mBaseFilter.a);
            }
            hashmap.put("number_of_filter_changes", Integer.toString(k1));
            hashmap.put("single_swipe_filter_changes", Integer.toString(i1));
            hashmap.put("double_swipe_filter_changes", Integer.toString(j1));
            (new EasyMetric("SWIPE_FILTER_SENT")).a(hashmap).b(true);
        }
    }

    public static void a(AA aa, AnalyticsSendSnapSource analyticssendsnapsource, boolean flag, boolean flag1, boolean flag2, int i1)
    {
        HashMap hashmap1 = new HashMap();
        HashMap hashmap = new HashMap();
        hashmap.put("sender", Bt.q());
        Object obj;
        if (aa.i() == 0)
        {
            hashmap1.put("type", "IMAGE");
        } else
        {
            hashmap1.put("type", "VIDEO");
            if (aa.i() == 1)
            {
                hashmap1.put("videoType", "SOUND");
            } else
            {
                hashmap1.put("videoType", "NO_SOUND");
            }
            if (aa instanceof Bw)
            {
                obj = (Bw)aa;
                HashMap hashmap2 = new HashMap();
                TranscodingPreferencesWrapper.a();
                hashmap2.put("transcodingEnabled", TranscodingPreferencesWrapper.b().name());
                hashmap2.put("recordedVideoFileSize", String.valueOf(((Bw) (obj)).q()));
                new Ke();
                hashmap2.put("transcodedVideoFileSize", String.valueOf(Ke.a(((Bw) (obj)).mTranscodingState.b())));
                hashmap2.putAll(hashmap1);
                (new EasyMetric("VIDEO_SNAP_SENT")).a(hashmap2).b(hashmap).a(false);
            } else
            {
                throw new IllegalStateException("Reporting metrics may be wrong, snapybryo is expected to be a VideoSnapbryo");
            }
        }
        hashmap1.put("recipientCount", Integer.toString(i1));
        if (i1 == 1)
        {
            hashmap1.put("recipientCountBucket", "1 recipient");
        } else
        if (i1 > 1 && i1 <= 5)
        {
            hashmap1.put("recipientCountBucket", "2-5 recipients");
        } else
        if (i1 > 5 && i1 <= 10)
        {
            hashmap1.put("recipientCountBucket", "6-10 recipients");
        } else
        if (i1 > 10)
        {
            hashmap1.put("recipientCountBucket", ">10 recipients");
        }
        hashmap1.put("friendCount", Integer.toString(FriendManager.e().o() - 2));
        if (aa.mHasDrawing)
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        hashmap1.put("drawing", obj);
        hashmap1.put("caption", aa.mCaptionStyleDescription);
        hashmap1.put("orientation", String.valueOf(((Mediabryo) (aa)).mSnapOrientation));
        new le();
        le.a(aa, hashmap1);
        if (aa.mBaseFilter != null)
        {
            hashmap1.put("filter", aa.mBaseFilter.a);
        }
        if (flag)
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        hashmap1.put("with_story", obj);
        if (flag2)
        {
            if (analyticssendsnapsource == AnalyticsSendSnapSource.IN_CHAT)
            {
                hashmap1.put("source", "chat_story_reply");
            } else
            if (analyticssendsnapsource == AnalyticsSendSnapSource.QUICK_SNAP)
            {
                hashmap1.put("source", "chat_story_quick_snap_reply");
            }
        } else
        {
            StringBuilder stringbuilder = (new StringBuilder()).append(Io.a(analyticssendsnapsource));
            if (flag1)
            {
                analyticssendsnapsource = "_from_preview";
            } else
            {
                analyticssendsnapsource = "";
            }
            hashmap1.put("source", stringbuilder.append(analyticssendsnapsource).toString());
        }
        (new EasyMetric("SNAP_SENT")).a(hashmap1).b(hashmap).b(true);
        analyticssendsnapsource = aa.mCaptionAnalyticData;
        if (analyticssendsnapsource != null)
        {
            (new EasyMetric("CAPTION_DETAIL")).a(analyticssendsnapsource.a()).b(hashmap).b(true);
        }
        analyticssendsnapsource = new TreeMap();
        analyticssendsnapsource.put("filter_impressions", String.valueOf(aa.mGeofilterImpressions));
        if (aa.d())
        {
            (new EasyMetric("SEND_SNAP_GEOFILTER")).a(analyticssendsnapsource).b(true);
        } else
        if (aa.mGeofilterImpressions > 0)
        {
            (new EasyMetric("SEND_SNAP_WITHOUT_GEOFILTER")).a(analyticssendsnapsource).b(true);
        }
        a(aa);
    }

    public static void a(AA aa, boolean flag, boolean flag1, String s1)
    {
        HashMap hashmap = new HashMap();
        Object obj;
        if (aa.i() == 0)
        {
            hashmap.put("type", "IMAGE");
        } else
        {
            hashmap.put("type", "VIDEO");
            if (aa.i() == 1)
            {
                hashmap.put("videoType", "SOUND");
            } else
            {
                hashmap.put("videoType", "NO_SOUND");
            }
        }
        if (aa.mHasDrawing)
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        hashmap.put("drawing", obj);
        hashmap.put("caption", aa.mCaptionStyleDescription);
        hashmap.put("orientation", String.valueOf(((Mediabryo) (aa)).mSnapOrientation));
        new le();
        le.a(aa, hashmap);
        if (aa.mBaseFilter != null)
        {
            hashmap.put("filter", aa.mBaseFilter.a);
        }
        if (flag)
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        hashmap.put("reply", obj);
        if (flag1)
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        hashmap.put("with_snap", obj);
        hashmap.put("context", s1);
        s1 = new HashMap();
        s1.put("sender", Bt.q());
        (new EasyMetric("POST_STORY")).a(hashmap).b(s1).b(true);
        obj = aa.mCaptionAnalyticData;
        if (obj != null)
        {
            (new EasyMetric("CAPTION_DETAIL")).a(((Fx) (obj)).a()).b(s1).b(true);
        }
        s1 = new TreeMap();
        s1.put("filter_impressions", String.valueOf(aa.mGeofilterImpressions));
        if (!aa.d()) goto _L2; else goto _L1
_L1:
        (new EasyMetric("SEND_STORY_GEOFILTER")).a(s1).b(true);
_L4:
        a(aa);
        return;
_L2:
        if (aa.mGeofilterImpressions > 0)
        {
            (new EasyMetric("SEND_STORY_WITHOUT_GEOFILTER")).a(s1).b(true);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(AT at)
    {
        HashMap hashmap = new HashMap(4);
        hashmap.put("time", Integer.toString((int)at.G()));
        hashmap.put("friendCount", Integer.toString(FriendManager.e().o() - 2));
        HashMap hashmap1;
        if (at.am() == 0)
        {
            hashmap.put("type", "IMAGE");
        } else
        {
            hashmap.put("type", "VIDEO");
            if (at.am() == 1)
            {
                hashmap.put("videoType", "SOUND");
            } else
            {
                hashmap.put("videoType", "NO_SOUND");
            }
        }
        hashmap1 = new HashMap(2);
        hashmap1.put("id", at.d());
        hashmap1.put("sender", at.j());
        if (at instanceof AB)
        {
            hashmap.put("url", ((AB)at).mActionUrl);
            (new EasyMetric("BROADCAST_SNAP_OPENED")).a(hashmap).b(hashmap1).b(true);
        } else
        if (at.getClass().equals(AT))
        {
            (new EasyMetric("SNAP_VIEW")).a(hashmap).b(hashmap1).b(true);
            if (!TextUtils.isEmpty(at.H()))
            {
                (new EasyMetric("VIEW_SNAP_GEOFILTER")).a("filter_id", at.H()).b(true);
                return;
            }
        }
    }

    public static void a(Bk bk)
    {
        (new EasyMetric("SAVE_STORY")).a("id", bk.d()).b(true);
    }

    public static void a(Bk bk, boolean flag, Br br)
    {
        if (bk == null)
        {
            throw new NullPointerException();
        }
        if (br == null)
        {
            throw new NullPointerException();
        }
        TreeMap treemap = new TreeMap();
        if (flag)
        {
            br = "0";
        } else
        {
            br = "1";
        }
        treemap.put("type", br);
        br = new TreeMap();
        br.put("username", Bt.q());
        if (TextUtils.equals(bk.mUsername, Bt.q()))
        {
            (new EasyMetric("VIEW_MY_STORIES")).b(true);
            return;
        } else
        {
            (new EasyMetric("VIEW_STORIES")).a(treemap).b(br).b(true);
            return;
        }
    }

    public static void a(Sk.a a1, List list, long l1)
    {
        if (Sk.a.DELETE.equals(a1))
        {
            a1 = Bt.q();
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                ChatFeedItem chatfeeditem = (ChatFeedItem)list.next();
                if ((chatfeeditem instanceof Chat) && !((Chat)chatfeeditem).f() && !chatfeeditem.j().equals(a1) && ((Chat)chatfeeditem).u())
                {
                    long l2 = ((Chat)chatfeeditem).B();
                    (new EasyMetric("RECEIVED_CHAT_LIFETIME")).a(l1 - l2).b(true);
                }
            } while (true);
        }
    }

    public static void a(LogoutReason logoutreason)
    {
        (new EasyMetric("LOGOUT")).a("REASON", logoutreason.name()).b(true);
    }

    public static void a(FriendAction friendaction, AnalyticsContext analyticscontext, Friend friend)
    {
        a(friendaction, analyticscontext.name(), friend, null, null);
    }

    public static void a(FriendAction friendaction, String s1, Friend friend, AddFriendSourceType addfriendsourcetype, String s2)
    {
        friend = friend.g();
        HashMap hashmap = new HashMap();
        if (s1 != null)
        {
            hashmap.put("context", s1);
        }
        if (addfriendsourcetype != null)
        {
            hashmap.put("type", addfriendsourcetype.name());
        }
        if (s2 != null)
        {
            hashmap.put("parent", s2);
        }
        s1 = new HashMap();
        s1.put("name", friend);
        (new EasyMetric(friendaction.name())).a(hashmap).b(s1).b(true);
    }

    public static void a(Mediabryo mediabryo)
    {
        EasyMetric easymetric = new EasyMetric("SWIPE_FILTER_SWIPED");
        if (IY.a(mediabryo))
        {
            mediabryo = "VIDEO";
        } else
        {
            mediabryo = "IMAGE";
        }
        easymetric.a("type", mediabryo).b(true);
    }

    public static void a(ChatMedia chatmedia)
    {
        (new EasyMetric("CHAT_MEDIA_TAPPED_FOR_EXPANSION")).a("type", c(chatmedia).name()).a(false);
        c("CHAT_MEDIA_DISPLAYED_FULL_SCREEN", chatmedia.d());
    }

    public static void a(com.snapchat.android.ui.CashSwiperView.SwipeActivationMethod swipeactivationmethod)
    {
        (new EasyMetric("SNAPCASH_SWIPE_TO_SEND_INITIATED")).a("method", swipeactivationmethod.name()).b(true);
    }

    public static void a(com.snapchat.android.util.chat.SecureChatSession.ConnectingState connectingstate, long l1)
    {
        (new EasyMetric((new StringBuilder("CHAT_CONNECT_")).append(connectingstate.name()).append("_LATENCY").toString())).a(l1).b(false);
    }

    public static void a(com.snapchat.android.util.chat.SecureChatSession.ConnectingState connectingstate, com.snapchat.android.util.chat.SecureChatSession.ConnectingFailureReason connectingfailurereason)
    {
        String s1 = sNetworkStatusManager.f();
        (new EasyMetric((new StringBuilder("CHAT_CONNECT_")).append(connectingstate.name()).append("_").append(connectingfailurereason.name()).toString())).a("reachability", s1).b(false);
    }

    public static void a(Integer integer)
    {
        (new EasyMetric("TROPHY_CASE_PAGE_VIEW")).a("number_of_trophies", integer).b(true);
    }

    public static void a(String s1)
    {
        (new EasyMetric("DELETE_STORY")).a("id", s1).b(true);
    }

    public static void a(String s1, int i1)
    {
        (new EasyMetric("SNAPCASH_PAYMENT_SEND_FAILED")).a("reason", s1).a("statusCode", Integer.valueOf(i1)).b(true);
    }

    public static void a(String s1, String s2)
    {
        EasyMetric easymetric = new EasyMetric("SNAP_PRIVACY_CHANGED");
        easymetric.a("old_privacy", s1);
        easymetric.a("new_privacy", s2);
        easymetric.b(true);
    }

    public static void a(String s1, String s2, Map map)
    {
        Map map1;
        if (sEventsTimer.containsKey(s1))
        {
            if ((map1 = (Map)sEventsTimer.get(s1)).containsKey(s2))
            {
                s1 = new EasyMetric(s1);
                String s3;
                for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); s1.a(s3, map.get(s3)))
                {
                    s3 = (String)iterator.next();
                }

                s1.a("time", Long.valueOf(System.currentTimeMillis() - ((Long)map1.get(s2)).longValue()));
                s1.a(false);
                return;
            }
        }
    }

    public static void a(String s1, boolean flag)
    {
        (new EasyMetric(s1)).a("value", Boolean.toString(flag)).b(true);
    }

    public static void a(String s1, boolean flag, boolean flag1, String s2)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("filter", s1);
        if (flag1)
        {
            s1 = "IMAGE";
        } else
        {
            s1 = "VIDEO";
        }
        hashmap.put("type", s1);
        if (flag)
        {
            hashmap.put("filter_id", s2);
        } else
        {
            hashmap.put("filter_id", "None");
        }
        (new EasyMetric("SWIPE_FILTER_PASSED")).a(hashmap).b(true);
    }

    public static void a(boolean flag)
    {
        EasyMetric easymetric = new EasyMetric("SEARCHABLE_BY_PHONE_NUMBER_CHANGED");
        String s1;
        if (flag)
        {
            s1 = "true";
        } else
        {
            s1 = "false";
        }
        easymetric.a("value", s1).b(true);
    }

    public static void a(boolean flag, long l1)
    {
        com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.a("CHAT_RECEIVED", 0.10000000000000001D).a("from_tcp", Boolean.valueOf(flag)).a("milliseconds_since_chat_created", Long.valueOf(l1)).b(false);
    }

    public static void a(boolean flag, AT at)
    {
        TreeMap treemap = new TreeMap();
        treemap.put("sender_username", at.j());
        treemap.put("viewer_username", Bt.q());
        if (flag)
        {
            (new EasyMetric("REPLAY_ACCEPT")).b(treemap).b(true);
            return;
        } else
        {
            (new EasyMetric("REPLAY_DECLINE")).b(treemap).b(true);
            return;
        }
    }

    public static void a(boolean flag, Bk bk)
    {
        if (!bk.B()) goto _L2; else goto _L1
_L1:
        if (ReleaseManager.f())
        {
            throw new RuntimeException("onEndStoryViewingSession shouldn't be called while story snap is being viewed!");
        }
          goto _L3
_L2:
        HashMap hashmap;
        HashMap hashmap1;
        hashmap = new HashMap(4);
        double d1;
        double d2;
        Object obj;
        Object obj2;
        HashMap hashmap2;
        int i1;
        boolean flag1;
        if (flag)
        {
            obj = "0";
        } else
        {
            obj = "1";
        }
        hashmap.put("viewing_type", obj);
        hashmap.put("type", c(bk));
        hashmap.put("time", Float.toString((float)bk.C() / 1000F));
        hashmap1 = new HashMap(3);
        hashmap1.put("id", bk.d());
        hashmap1.put("viewer_username", Bt.q());
        hashmap1.put("poster_username", bk.j());
        d1 = (double)bk.C() / 1000D;
        d2 = (double)Math.round(10D * d1) / 10D;
        if (d1 >= bk.G() - 0.10000000149011612D)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 1;
        }
        obj = bk.j();
        obj2 = bk.d();
        hashmap2 = new HashMap(5);
        hashmap2.put("time_viewed", Double.valueOf(d2));
        hashmap2.put("full_view", Boolean.valueOf(flag1));
        hashmap2.put("view_location", Integer.valueOf(i1));
        hashmap2.put("poster_id", obj);
        hashmap2.put("story_snap_id", obj2);
        d1 = bk.G();
        obj = c(bk);
        obj2 = new HashMap(2);
        ((Map) (obj2)).put("snap_time", Double.valueOf(d1));
        ((Map) (obj2)).put("type", obj);
        (new EasyMetric("VIEW_STORY")).a(hashmap).b(hashmap1).b(true);
        if (!TextUtils.isEmpty(bk.H()))
        {
            obj = new TreeMap();
            ((Map) (obj)).put("filter_id", bk.H());
            ((Map) (obj)).put("my_story", Boolean.toString(TextUtils.equals(Bt.q(), bk.j())));
            (new EasyMetric("VIEW_STORY_GEOFILTER")).a(((Map) (obj))).b(true);
        }
        if (!bk.mIsShared) goto _L5; else goto _L4
_L4:
        if (!bk.aJ()) goto _L3; else goto _L6
_L6:
        if (bk.aJ()) goto _L8; else goto _L7
_L7:
        Timber.e("AnalyticsEvents", "onEndBrandSnapView called on a non-brand snap", new Object[0]);
        bk = null;
_L11:
        (new EasyMetric(bk)).a(hashmap).b(hashmap1).b(true);
_L3:
        return;
_L8:
        Object obj1 = null;
        String as[] = bk.d().split("~");
        bk = obj1;
        if (as.length > 1)
        {
            bk = (new StringBuilder("VIEW_BRAND_SNAP_STORY_")).append(as[1]).toString();
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (TextUtils.equals(bk.j(), Bt.q()))
        {
            (new EasyMetric("VIEW_MY_STORY")).a(hashmap).b(hashmap1).b(true);
            return;
        }
        if (!TextUtils.equals(bk.j(), "teamsnapchat")) goto _L3; else goto _L9
_L9:
        (new EasyMetric("VIEW_TEAMSNAPCHAT_STORY")).a(hashmap).b(hashmap1).b(true);
        return;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public static void a(boolean flag, String s1, List list)
    {
        if (flag && list != null)
        {
            ArrayList arraylist = new ArrayList(list);
            Collections.sort(list, new a());
            int i1;
            for (i1 = 0; i1 < arraylist.size() && !((ChatFeedItem)arraylist.get(i1)).j().equals(s1); i1++) { }
            if (i1 > 0)
            {
                (new EasyMetric("CHAT_RELEASED_POTENTIALLY_UNVIEWED")).b(true);
                return;
            }
        }
    }

    public static void b()
    {
        (new EasyMetric("PAGE_SETTINGS")).b(true);
    }

    public static void b(int i1)
    {
        (new EasyMetric("CHAT_ADDRESS_SHOWN")).a("count", Integer.valueOf(i1)).b(false);
    }

    public static void b(int i1, int j1)
    {
        EasyMetric easymetric = new EasyMetric("MediaPlayer onError");
        easymetric.a("what", Integer.valueOf(i1));
        easymetric.a("extra", Integer.valueOf(j1));
        easymetric.b(true);
    }

    public static void b(long l1, String s1, String s2, String s3)
    {
        EasyMetric easymetric = (new EasyMetric("MINI_PROFILE_CHAT")).a("user_last_taken_ts", Long.toString(l1));
        Object obj = s1;
        if (s1 == null)
        {
            obj = "";
        }
        obj = easymetric.a("mini_profile_page", ((String) (obj)));
        s1 = s2;
        if (s2 == null)
        {
            s1 = "";
        }
        s2 = ((EasyMetric) (obj)).a("friend", s1);
        s1 = s3;
        if (s3 == null)
        {
            s1 = "";
        }
        s2.a("friend_has_picture", s1);
    }

    public static void b(AT at)
    {
        HashMap hashmap = new HashMap(3);
        hashmap.put("time", Integer.toString((int)at.G()));
        HashMap hashmap1;
        if (at.am() == 0)
        {
            hashmap.put("type", "IMAGE");
        } else
        {
            hashmap.put("type", "VIDEO");
            if (at.am() == 1)
            {
                hashmap.put("videoType", "SOUND");
            } else
            {
                hashmap.put("videoType", "NO_SOUND");
            }
        }
        hashmap1 = new HashMap(2);
        hashmap1.put("id", at.d());
        hashmap1.put("sender", at.j());
        if (at instanceof Bk)
        {
            (new EasyMetric("SCREENSHOT_STORY")).a(hashmap).b(hashmap1).b(true);
            return;
        } else
        {
            (new EasyMetric("SNAP_SCREENSHOT")).a(hashmap).b(hashmap1).b(true);
            return;
        }
    }

    public static void b(ChatMedia chatmedia)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("type", c(chatmedia).name());
        hashmap.put("reachability", Pg.b());
        a("CHAT_MEDIA_DISPLAYED_FULL_SCREEN", chatmedia.d(), hashmap);
    }

    public static void b(String s1)
    {
        (new EasyMetric("USER_OPENED_BROADCAST_SNAP_LINK")).a("url", s1).b(true);
    }

    public static void b(String s1, int i1)
    {
        (new EasyMetric("SNAPCASH_PAYMENT_RECEIVE_FAILED")).a("reason", s1).a("statusCode", Integer.valueOf(i1)).b(true);
    }

    public static void b(String s1, String s2)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("FROM", String.valueOf(s1));
        hashmap.put("TO", s2);
        FlurryAgent.logEvent("ACTIVITY_TRANSITION", hashmap);
    }

    public static void b(String s1, boolean flag)
    {
        (new EasyMetric("SNAPCASH_PAYMENT_SEND_INITIATED")).a("amount", s1).a("swipe", Boolean.valueOf(flag)).b(true);
    }

    public static void b(boolean flag)
    {
        EasyMetric easymetric = new EasyMetric("LOGOUT_DIALOG");
        String s1;
        if (flag)
        {
            s1 = "yes";
        } else
        {
            s1 = "no";
        }
        easymetric.a("result", s1).b(true);
    }

    private static ChatPerformanceAnalytics.ChatMediaType c(ChatMedia chatmedia)
    {
        if (chatmedia instanceof BD)
        {
            if (chatmedia.ak())
            {
                return ChatPerformanceAnalytics.ChatMediaType.DISCOVER_SHARE_VIDEO;
            } else
            {
                return ChatPerformanceAnalytics.ChatMediaType.DISCOVER_SHARE_IMAGE;
            }
        }
        if (chatmedia instanceof BF)
        {
            if (chatmedia.ak())
            {
                return ChatPerformanceAnalytics.ChatMediaType.STORY_REPLY_VIDEO;
            } else
            {
                return ChatPerformanceAnalytics.ChatMediaType.STORY_REPLY_IMAGE;
            }
        } else
        {
            return ChatPerformanceAnalytics.ChatMediaType.CHAT_MEDIA;
        }
    }

    private static String c(AT at)
    {
        switch (at.am())
        {
        default:
            return "IMAGE";

        case 1: // '\001'
            return "VIDEO";

        case 2: // '\002'
            return "VIDEO_NO_SOUND";
        }
    }

    public static void c()
    {
        (new EasyMetric("PAGE_MY_FRIENDS_SESSION_START")).b(true);
    }

    public static void c(int i1)
    {
        (new EasyMetric("CHAT_CONNECT_ATTEMPT")).a("count", Integer.valueOf(i1)).b(true);
    }

    public static void c(long l1, String s1, String s2, String s3)
    {
        EasyMetric easymetric = (new EasyMetric("MINI_PROFILE_SNAP")).a("user_last_taken_ts", Long.toString(l1));
        Object obj = s1;
        if (s1 == null)
        {
            obj = "";
        }
        obj = easymetric.a("mini_profile_page", ((String) (obj)));
        s1 = s2;
        if (s2 == null)
        {
            s1 = "";
        }
        s2 = ((EasyMetric) (obj)).a("friend", s1);
        s1 = s3;
        if (s3 == null)
        {
            s1 = "";
        }
        s2.a("friend_has_picture", s1);
    }

    public static void c(String s1)
    {
        (new EasyMetric((new StringBuilder("CHAT_")).append(s1.toUpperCase(Locale.US)).append("_VIEWED").toString())).b(true);
        (new EasyMetric("CHAT_VIEWED")).b(true);
        D();
    }

    public static void c(String s1, String s2)
    {
        if (!sEventsTimer.containsKey(s1))
        {
            sEventsTimer.put(s1, new HashMap());
        }
        ((Map)sEventsTimer.get(s1)).put(s2, Long.valueOf(System.currentTimeMillis()));
    }

    public static void c(String s1, boolean flag)
    {
        EasyMetric easymetric = new EasyMetric("CHATBURGER_VIEW_EXIT");
        Object obj = s1;
        if (s1 == null)
        {
            obj = "";
        }
        obj = easymetric.a("friend", ((String) (obj)));
        if (flag)
        {
            s1 = "1";
        } else
        {
            s1 = "0";
        }
        ((EasyMetric) (obj)).a("has_picture", s1).b(false);
    }

    public static void c(boolean flag)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("success", "true");
        String s1;
        if (flag)
        {
            s1 = "storySnap";
        } else
        {
            s1 = "snap";
        }
        hashmap.put("type", s1);
        (new EasyMetric("VIDEO_PLAY_ATTEMPT")).a(hashmap).b(false);
    }

    public static void d()
    {
        (new EasyMetric("PAGE_MY_FRIENDS_SESSION_END")).b(true);
    }

    public static void d(int i1)
    {
        (new EasyMetric("CHAT_SEND_DELAY_FOR_SEQNUM_GENERATION")).a("delayed_messages_count", Integer.valueOf(i1)).a(false);
    }

    public static void d(long l1, String s1, String s2, String s3)
    {
        EasyMetric easymetric = (new EasyMetric("MINI_PROFILE_SETTINGS_GEAR")).a("user_last_taken_ts", Long.toString(l1));
        Object obj = s1;
        if (s1 == null)
        {
            obj = "";
        }
        obj = easymetric.a("mini_profile_page", ((String) (obj)));
        s1 = s2;
        if (s2 == null)
        {
            s1 = "";
        }
        s2 = ((EasyMetric) (obj)).a("friend", s1);
        s1 = s3;
        if (s3 == null)
        {
            s1 = "";
        }
        s2.a("friend_has_picture", s1);
    }

    public static void d(String s1)
    {
        (new EasyMetric("CLEAR_CONVERSATION")).a("cleared_username", s1).b(true);
    }

    public static void d(String s1, String s2)
    {
        HashMap hashmap = new HashMap();
        if (s1 != null)
        {
            hashmap.put("trophy_display_unicode", s1);
        }
        if (s2 != null)
        {
            hashmap.put("trophy_display_label", s2);
        }
        (new EasyMetric("TROPHY_POPUP_PAGE_VIEW")).a(hashmap).b(true);
    }

    public static void d(boolean flag)
    {
        EasyMetric easymetric = new EasyMetric("CHAT_STORY_REPLY");
        String s1;
        if (flag)
        {
            s1 = "1";
        } else
        {
            s1 = "0";
        }
        easymetric.a("follow_through", s1).b(true);
    }

    private static String e(int i1)
    {
        switch (i1)
        {
        default:
            throw new RuntimeException((new StringBuilder("Unexpected page number: ")).append(i1).toString());

        case 0: // '\0'
            return "Chat";

        case 1: // '\001'
            return "Feed";

        case 2: // '\002'
            return "Camera";

        case 3: // '\003'
            return "Stories";

        case 4: // '\004'
            return "Discover";
        }
    }

    public static void e()
    {
        (new EasyMetric("MANAGE_ADDITIONAL_SERVICES")).b(true);
    }

    public static void e(String s1)
    {
        (new EasyMetric("SNAPCASH_PHONE_VERIFICATION_FAILED")).a("reason", s1).b(true);
    }

    public static void e(boolean flag)
    {
        HashMap hashmap = new HashMap(1);
        String s1;
        if (flag)
        {
            s1 = "yes";
        } else
        {
            s1 = "no";
        }
        hashmap.put("result", s1);
        (new EasyMetric("BETA_SIGNUP_DIALOG")).a(hashmap).b(true);
    }

    public static void f()
    {
        (new EasyMetric("PAGE_CLEAR_FEED")).b(true);
    }

    public static void f(String s1)
    {
        (new EasyMetric("SNAPCASH_PAYMENT_SENT")).a("amount", s1).b(true);
    }

    public static void f(boolean flag)
    {
        HashMap hashmap = new HashMap(1);
        String s1;
        if (flag)
        {
            s1 = "yes";
        } else
        {
            s1 = "no";
        }
        hashmap.put("result", s1);
        (new EasyMetric("PLAY_STORE_REVIEW_DIALOG")).a(hashmap).b(true);
    }

    public static void g()
    {
        (new EasyMetric("FILTER_SETTING_CHANGED_FROM_CAMERA")).b(true);
    }

    public static void g(String s1)
    {
        (new EasyMetric("SNAPCASH_PAYMENT_SEND_FAILED")).a("reason", s1).b(true);
    }

    public static void g(boolean flag)
    {
        if (flag)
        {
            (new EasyMetric("OPEN_NOTIFICATION")).b(true);
            return;
        } else
        {
            (new EasyMetric("OPEN")).b(true);
            return;
        }
    }

    public static void h()
    {
        (new EasyMetric("TYPED_CAPTION")).b(true);
    }

    public static void h(String s1)
    {
        (new EasyMetric("SNAPCASH_PAYMENT_SEND_RETRIED")).a("amount", s1).b(true);
    }

    public static void h(boolean flag)
    {
        (new EasyMetric("DOUBLE_TAP")).a("follow_through", Boolean.valueOf(flag)).b(true);
    }

    public static void i()
    {
        (new EasyMetric("DRAWING_BUTTON_PRESSED")).b(true);
    }

    public static void i(String s1)
    {
        (new EasyMetric("SNAPCASH_PAYMENT_RECEIVE_INITIATED")).a("amount", s1).b(true);
    }

    public static void i(boolean flag)
    {
        (new EasyMetric("SNAPCASH_CARD_LINKING_SUCCEEDED")).a("relink", Boolean.valueOf(flag)).b(true);
    }

    public static void j()
    {
        (new EasyMetric("CHAT_SESSION_START")).b(true);
    }

    public static void j(String s1)
    {
        (new EasyMetric("SNAPCASH_PAYMENT_RECEIVED")).a("amount", s1).b(true);
    }

    public static void k()
    {
        D();
    }

    public static void k(String s1)
    {
        (new EasyMetric("SNAPCASH_PAYMENT_RECEIVE_FAILED")).a("reason", s1).b(true);
    }

    public static void l()
    {
        (new EasyMetric("R01_LOGIN_SUCCESSFUL")).b(true);
    }

    public static void l(String s1)
    {
        (new EasyMetric("SNAPCASH_PAYMENT_EXPIRED")).a("amount", s1).b(true);
    }

    public static void m()
    {
        (new EasyMetric("CLEAR_ALL")).b(true);
    }

    public static void m(String s1)
    {
        (new EasyMetric("SNAPCASH_PAYMENT_REFUNDED")).a("amount", s1).b(true);
    }

    public static void n()
    {
        (new EasyMetric("CLEAR_USED")).b(true);
    }

    public static void n(String s1)
    {
        (new EasyMetric("SNAPCASH_CASH_TAG_CREATED")).a("amount", s1).b(true);
    }

    public static void o()
    {
        (new EasyMetric("SNAPCASH_SQUARE_TOS_ACCEPTED")).b(true);
    }

    public static void o(String s1)
    {
        (new EasyMetric("SNAPCASH_CARD_LINKING_FAILED")).a("reason", s1).b(true);
    }

    public static void p()
    {
        (new EasyMetric("SNAPCASH_SQUARE_TOS_CANCELED")).b(true);
    }

    public static void p(String s1)
    {
        EasyMetric easymetric = new EasyMetric("CHATBURGER_VIEW");
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "";
        }
        easymetric.a("friend", s2).b(false);
    }

    public static void q()
    {
        (new EasyMetric("SNAPCASH_PHONE_VERIFICATION_SUCCEEDED")).b(true);
    }

    public static void r()
    {
        (new EasyMetric("SNAPCASH_PHONE_VERIFICATION_CANCELED")).b(true);
    }

    public static void s()
    {
        (new EasyMetric("SNAPCASH_BUTTON_TAPPED")).b(true);
    }

    public static void t()
    {
        (new EasyMetric("SNAPCASH_CARD_LINKING_CANCELED")).b(true);
    }

    public static void u()
    {
        (new EasyMetric("SNAPCASH_ASKED_TO_RELINK")).b(true);
    }

    public static void v()
    {
        (new EasyMetric("SNAPCASH_IDENTITY_VERIFICATION_SUCCEEDED")).b(true);
    }

    public static void w()
    {
        (new EasyMetric("SNAPCASH_IDENTITY_VERIFICATION_FAILED")).b(true);
    }

    public static void x()
    {
        (new EasyMetric("SNAPCASH_IDENTITY_VERIFICATION_CANCELED")).b(true);
    }

    public static void y()
    {
        (new EasyMetric("CHAT_PRESERVED")).a("reachability", sNetworkStatusManager.f()).a("travel_mode", Boolean.valueOf(AS.a().mTravelModeEnabled)).b(false);
    }

    public static void z()
    {
        (new EasyMetric("CHAT_UNPRESERVED")).a("reachability", sNetworkStatusManager.f()).a("travel_mode", Boolean.valueOf(AS.a().mTravelModeEnabled)).b(false);
    }

}
