// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics;

import Io;
import android.text.TextUtils;
import android.util.Pair;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendAction;
import com.snapchat.android.model.FriendManager;
import com.snapchat.android.model.SuggestedFriendAction;
import hL;
import hR;
import hT;
import hV;
import hW;
import hY;
import hZ;
import iA;
import iF;
import iG;
import iH;
import iI;
import iK;
import iO;
import iP;
import iQ;
import iR;
import iS;
import iT;
import iV;
import ie;
import if;
import ih;
import in;
import io;
import ip;
import iq;
import ir;
import is;
import ix;
import iy;
import jM;

public final class ProfileEventAnalytics
{
    public static final class ProfilePageMetricParams extends Enum
    {

        private static final ProfilePageMetricParams $VALUES[];
        public static final ProfilePageMetricParams CONTACT_INFO;
        public static final ProfilePageMetricParams CONTACT_NAME;
        public static final ProfilePageMetricParams DISPLAY_NAME;
        public static final ProfilePageMetricParams FRIEND;
        public static final ProfilePageMetricParams HAS_PICTURE;
        public static final ProfilePageMetricParams IDENTITY_CELL_INDEX;
        public static final ProfilePageMetricParams IDENTITY_PROFILE_PAGE;
        public static final ProfilePageMetricParams IN_MY_CONTACTS;
        public static final ProfilePageMetricParams LAST_TAKEN_TIMESTAMP;
        public static final ProfilePageMetricParams REASON;
        public static final ProfilePageMetricParams SOURCE;
        public static final ProfilePageMetricParams STATUS;

        public static ProfilePageMetricParams valueOf(String s)
        {
            return (ProfilePageMetricParams)Enum.valueOf(com/snapchat/android/analytics/ProfileEventAnalytics$ProfilePageMetricParams, s);
        }

        public static ProfilePageMetricParams[] values()
        {
            return (ProfilePageMetricParams[])$VALUES.clone();
        }

        public final String nameInLowerCase()
        {
            return Io.a(this);
        }

        static 
        {
            DISPLAY_NAME = new ProfilePageMetricParams("DISPLAY_NAME", 0);
            IDENTITY_CELL_INDEX = new ProfilePageMetricParams("IDENTITY_CELL_INDEX", 1);
            FRIEND = new ProfilePageMetricParams("FRIEND", 2);
            STATUS = new ProfilePageMetricParams("STATUS", 3);
            REASON = new ProfilePageMetricParams("REASON", 4);
            IDENTITY_PROFILE_PAGE = new ProfilePageMetricParams("IDENTITY_PROFILE_PAGE", 5);
            SOURCE = new ProfilePageMetricParams("SOURCE", 6);
            CONTACT_NAME = new ProfilePageMetricParams("CONTACT_NAME", 7);
            CONTACT_INFO = new ProfilePageMetricParams("CONTACT_INFO", 8);
            IN_MY_CONTACTS = new ProfilePageMetricParams("IN_MY_CONTACTS", 9);
            LAST_TAKEN_TIMESTAMP = new ProfilePageMetricParams("LAST_TAKEN_TIMESTAMP", 10);
            HAS_PICTURE = new ProfilePageMetricParams("HAS_PICTURE", 11);
            $VALUES = (new ProfilePageMetricParams[] {
                DISPLAY_NAME, IDENTITY_CELL_INDEX, FRIEND, STATUS, REASON, IDENTITY_PROFILE_PAGE, SOURCE, CONTACT_NAME, CONTACT_INFO, IN_MY_CONTACTS, 
                LAST_TAKEN_TIMESTAMP, HAS_PICTURE
            });
        }

        private ProfilePageMetricParams(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class ProfilePageMetrics extends Enum
    {

        private static final ProfilePageMetrics $VALUES[];
        public static final ProfilePageMetrics PROFILE_ADD_BY_CAMERAROLL_CLICK;
        public static final ProfilePageMetrics PROFILE_ADD_BY_SNAPCODE_CLICK;
        public static final ProfilePageMetrics PROFILE_ADD_NEARBY_CLICK;
        public static final ProfilePageMetrics PROFILE_CONTACT_BLOCK;
        public static final ProfilePageMetrics PROFILE_CONTACT_NAME_EDIT;
        public static final ProfilePageMetrics PROFILE_CONTACT_UNBLOCK;
        public static final ProfilePageMetrics PROFILE_EMPTY_ADDRESS_BOOK;
        public static final ProfilePageMetrics PROFILE_FRIENDS_REQUESTS_SENT;
        public static final ProfilePageMetrics PROFILE_FRIEND_BLOCK;
        public static final ProfilePageMetrics PROFILE_FRIEND_REQUEST_ACCEPT;
        public static final ProfilePageMetrics PROFILE_FRIEND_REQUEST_BLOCK;
        public static final ProfilePageMetrics PROFILE_FRIEND_REQUEST_IGNORE;
        public static final ProfilePageMetrics PROFILE_MY_CONTACTS_PAGE_VIEW;
        public static final ProfilePageMetrics PROFILE_PICTURES_DELETE_PICTURES;
        public static final ProfilePageMetrics PROFILE_PICTURES_PAGE_VIEW;
        public static final ProfilePageMetrics PROFILE_PICTURES_SHARE_PICTURES;
        public static final ProfilePageMetrics PROFILE_PICTURES_TAKE_NEW_PICTURES;
        public static final ProfilePageMetrics PROFILE_SUGGESTED_FRIENDS_REQUEST_HIDDEN;

        public static ProfilePageMetrics valueOf(String s)
        {
            return (ProfilePageMetrics)Enum.valueOf(com/snapchat/android/analytics/ProfileEventAnalytics$ProfilePageMetrics, s);
        }

        public static ProfilePageMetrics[] values()
        {
            return (ProfilePageMetrics[])$VALUES.clone();
        }

        static 
        {
            PROFILE_PICTURES_PAGE_VIEW = new ProfilePageMetrics("PROFILE_PICTURES_PAGE_VIEW", 0);
            PROFILE_PICTURES_DELETE_PICTURES = new ProfilePageMetrics("PROFILE_PICTURES_DELETE_PICTURES", 1);
            PROFILE_PICTURES_TAKE_NEW_PICTURES = new ProfilePageMetrics("PROFILE_PICTURES_TAKE_NEW_PICTURES", 2);
            PROFILE_PICTURES_SHARE_PICTURES = new ProfilePageMetrics("PROFILE_PICTURES_SHARE_PICTURES", 3);
            PROFILE_FRIEND_REQUEST_ACCEPT = new ProfilePageMetrics("PROFILE_FRIEND_REQUEST_ACCEPT", 4);
            PROFILE_FRIEND_REQUEST_IGNORE = new ProfilePageMetrics("PROFILE_FRIEND_REQUEST_IGNORE", 5);
            PROFILE_FRIEND_REQUEST_BLOCK = new ProfilePageMetrics("PROFILE_FRIEND_REQUEST_BLOCK", 6);
            PROFILE_FRIEND_BLOCK = new ProfilePageMetrics("PROFILE_FRIEND_BLOCK", 7);
            PROFILE_ADD_BY_SNAPCODE_CLICK = new ProfilePageMetrics("PROFILE_ADD_BY_SNAPCODE_CLICK", 8);
            PROFILE_ADD_BY_CAMERAROLL_CLICK = new ProfilePageMetrics("PROFILE_ADD_BY_CAMERAROLL_CLICK", 9);
            PROFILE_ADD_NEARBY_CLICK = new ProfilePageMetrics("PROFILE_ADD_NEARBY_CLICK", 10);
            PROFILE_FRIENDS_REQUESTS_SENT = new ProfilePageMetrics("PROFILE_FRIENDS_REQUESTS_SENT", 11);
            PROFILE_MY_CONTACTS_PAGE_VIEW = new ProfilePageMetrics("PROFILE_MY_CONTACTS_PAGE_VIEW", 12);
            PROFILE_CONTACT_NAME_EDIT = new ProfilePageMetrics("PROFILE_CONTACT_NAME_EDIT", 13);
            PROFILE_CONTACT_BLOCK = new ProfilePageMetrics("PROFILE_CONTACT_BLOCK", 14);
            PROFILE_CONTACT_UNBLOCK = new ProfilePageMetrics("PROFILE_CONTACT_UNBLOCK", 15);
            PROFILE_SUGGESTED_FRIENDS_REQUEST_HIDDEN = new ProfilePageMetrics("PROFILE_SUGGESTED_FRIENDS_REQUEST_HIDDEN", 16);
            PROFILE_EMPTY_ADDRESS_BOOK = new ProfilePageMetrics("PROFILE_EMPTY_ADDRESS_BOOK", 17);
            $VALUES = (new ProfilePageMetrics[] {
                PROFILE_PICTURES_PAGE_VIEW, PROFILE_PICTURES_DELETE_PICTURES, PROFILE_PICTURES_TAKE_NEW_PICTURES, PROFILE_PICTURES_SHARE_PICTURES, PROFILE_FRIEND_REQUEST_ACCEPT, PROFILE_FRIEND_REQUEST_IGNORE, PROFILE_FRIEND_REQUEST_BLOCK, PROFILE_FRIEND_BLOCK, PROFILE_ADD_BY_SNAPCODE_CLICK, PROFILE_ADD_BY_CAMERAROLL_CLICK, 
                PROFILE_ADD_NEARBY_CLICK, PROFILE_FRIENDS_REQUESTS_SENT, PROFILE_MY_CONTACTS_PAGE_VIEW, PROFILE_CONTACT_NAME_EDIT, PROFILE_CONTACT_BLOCK, PROFILE_CONTACT_UNBLOCK, PROFILE_SUGGESTED_FRIENDS_REQUEST_HIDDEN, PROFILE_EMPTY_ADDRESS_BOOK
            });
        }

        private ProfilePageMetrics(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class ProfilePageMetricsBoolean extends Enum
    {

        private static final ProfilePageMetricsBoolean $VALUES[];
        public static final ProfilePageMetricsBoolean No;
        public static final ProfilePageMetricsBoolean Yes;

        public static ProfilePageMetricsBoolean fromValue(boolean flag)
        {
            if (flag)
            {
                return Yes;
            } else
            {
                return No;
            }
        }

        public static ProfilePageMetricsBoolean valueOf(String s)
        {
            return (ProfilePageMetricsBoolean)Enum.valueOf(com/snapchat/android/analytics/ProfileEventAnalytics$ProfilePageMetricsBoolean, s);
        }

        public static ProfilePageMetricsBoolean[] values()
        {
            return (ProfilePageMetricsBoolean[])$VALUES.clone();
        }

        static 
        {
            Yes = new ProfilePageMetricsBoolean("Yes", 0);
            No = new ProfilePageMetricsBoolean("No", 1);
            $VALUES = (new ProfilePageMetricsBoolean[] {
                Yes, No
            });
        }

        private ProfilePageMetricsBoolean(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class ProfilePageMetricsResponseStatus extends Enum
    {

        private static final ProfilePageMetricsResponseStatus $VALUES[];
        public static final ProfilePageMetricsResponseStatus FAIL;
        public static final ProfilePageMetricsResponseStatus SUCCESS;

        public static ProfilePageMetricsResponseStatus valueOf(String s)
        {
            return (ProfilePageMetricsResponseStatus)Enum.valueOf(com/snapchat/android/analytics/ProfileEventAnalytics$ProfilePageMetricsResponseStatus, s);
        }

        public static ProfilePageMetricsResponseStatus[] values()
        {
            return (ProfilePageMetricsResponseStatus[])$VALUES.clone();
        }

        static 
        {
            SUCCESS = new ProfilePageMetricsResponseStatus("SUCCESS", 0);
            FAIL = new ProfilePageMetricsResponseStatus("FAIL", 1);
            $VALUES = (new ProfilePageMetricsResponseStatus[] {
                SUCCESS, FAIL
            });
        }

        private ProfilePageMetricsResponseStatus(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String TAG = "ProfileEventAnalytics";
    private static final String UNKNOWN = "unknown";
    private static final ProfileEventAnalytics sInstance = new ProfileEventAnalytics();
    public final BlizzardEventLogger mBlizzardEventLogger;
    private final FriendManager mFriendManager;

    public ProfileEventAnalytics()
    {
        this(BlizzardEventLogger.a(), FriendManager.e());
    }

    private ProfileEventAnalytics(BlizzardEventLogger blizzardeventlogger, FriendManager friendmanager)
    {
        mBlizzardEventLogger = blizzardeventlogger;
        mFriendManager = friendmanager;
    }

    public static ProfileEventAnalytics a()
    {
        return sInstance;
    }

    private static iR a(com.snapchat.android.model.Friend.AddSourceType addsourcetype)
    {
        if (addsourcetype == null)
        {
            return null;
        }
        public static final class _cls1
        {

            public static final int $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[];
            static final int $SwitchMap$com$snapchat$android$model$Friend$AddSourceType[];
            static final int $SwitchMap$com$snapchat$android$model$FriendAction[];
            public static final int $SwitchMap$com$snapchat$android$model$SuggestedFriendAction[];

            static 
            {
                $SwitchMap$com$snapchat$android$model$Friend$AddSourceType = new int[com.snapchat.android.model.Friend.AddSourceType.values().length];
                try
                {
                    $SwitchMap$com$snapchat$android$model$Friend$AddSourceType[com.snapchat.android.model.Friend.AddSourceType.ADDED_BY_ADDED_ME_BACK.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror29) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Friend$AddSourceType[com.snapchat.android.model.Friend.AddSourceType.ADDED_BY_PHONE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror28) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Friend$AddSourceType[com.snapchat.android.model.Friend.AddSourceType.ADDED_BY_QR_CODE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror27) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Friend$AddSourceType[com.snapchat.android.model.Friend.AddSourceType.ADDED_BY_USERNAME.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror26) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Friend$AddSourceType[com.snapchat.android.model.Friend.AddSourceType.ADDED_BY_NEARBY.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror25) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Friend$AddSourceType[com.snapchat.android.model.Friend.AddSourceType.ADDED_BY_SUGGESTED.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror24) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$Friend$AddSourceType[com.snapchat.android.model.Friend.AddSourceType.ADDED_BY_OFFICIAL_STORY_SEARCH.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror23) { }
                $SwitchMap$com$snapchat$android$model$FriendAction = new int[FriendAction.values().length];
                try
                {
                    $SwitchMap$com$snapchat$android$model$FriendAction[FriendAction.ADD.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror22) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$FriendAction[FriendAction.DELETE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror21) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$FriendAction[FriendAction.BLOCK.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$FriendAction[FriendAction.UNBLOCK.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$FriendAction[FriendAction.SET_DISPLAY_NAME.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$FriendAction[FriendAction.IGNORE.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                $SwitchMap$com$snapchat$android$model$SuggestedFriendAction = new int[SuggestedFriendAction.values().length];
                try
                {
                    $SwitchMap$com$snapchat$android$model$SuggestedFriendAction[SuggestedFriendAction.HIDE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext = new int[AnalyticsEvents.AnalyticsContext.values().length];
                try
                {
                    $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[AnalyticsEvents.AnalyticsContext.PROFILE_MAIN_PAGE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[AnalyticsEvents.AnalyticsContext.PROFILE_PICTURES_PAGE_VIEW.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[AnalyticsEvents.AnalyticsContext.PROFILE_ADDED_ME_PAGE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[AnalyticsEvents.AnalyticsContext.PROFILE_ADD_FRIENDS_MENU_PAGE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[AnalyticsEvents.AnalyticsContext.PROFILE_ADD_FRIENDS_BY_USERNAME_PAGE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[AnalyticsEvents.AnalyticsContext.PROFILE_ADD_NEARBY_FRIENDS_PAGE.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[AnalyticsEvents.AnalyticsContext.PROFILE_MY_FRIENDS_PAGE.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[AnalyticsEvents.AnalyticsContext.PROFILE_ADD_FRIENDS_BY_CONTACTS_PAGE.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[AnalyticsEvents.AnalyticsContext.PROFILE_MY_CONTACTS_PAGE.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[AnalyticsEvents.AnalyticsContext.CAMERA_PAGE.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[AnalyticsEvents.AnalyticsContext.FEED.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[AnalyticsEvents.AnalyticsContext.STORIES.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[AnalyticsEvents.AnalyticsContext.HELP_PAGE.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[AnalyticsEvents.AnalyticsContext.SETTINGS.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[AnalyticsEvents.AnalyticsContext.SNAPCODE_PAGE.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[AnalyticsEvents.AnalyticsContext.TROPHY.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.snapchat.android.model.Friend.AddSourceType[addsourcetype.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return iR.ADDED_BY_ADDED_ME_BACK;

        case 2: // '\002'
            return iR.ADDED_BY_PHONE;

        case 3: // '\003'
            return iR.ADDED_BY_QR_CODE;

        case 4: // '\004'
            return iR.ADDED_BY_USERNAME;

        case 5: // '\005'
            return iR.ADDED_BY_NEARBY;

        case 6: // '\006'
            return iR.ADDED_BY_SUGGESTED;

        case 7: // '\007'
            return iR.ADDED_BY_OFFICIAL_STORY_SEARCH;
        }
    }

    public static jM a(boolean flag)
    {
        if (flag)
        {
            return jM.PHONE;
        } else
        {
            return jM.CAPTCHA;
        }
    }

    private static void a(EasyMetric easymetric, Friend friend)
    {
        friend = friend.mAddSourceType;
        if (friend != null)
        {
            easymetric.a(ProfilePageMetricParams.SOURCE.nameInLowerCase(), friend.getMetricName());
            return;
        } else
        {
            easymetric.a(ProfilePageMetricParams.SOURCE.nameInLowerCase(), "unknown");
            return;
        }
    }

    public static void a(EasyMetric easymetric, boolean flag, String s)
    {
        if (flag)
        {
            easymetric.a(Io.a(ProfilePageMetricParams.STATUS), Io.a(ProfilePageMetricsResponseStatus.SUCCESS));
            return;
        } else
        {
            easymetric.a(ProfilePageMetricParams.STATUS.nameInLowerCase(), Io.a(ProfilePageMetricsResponseStatus.FAIL)).a(ProfilePageMetricParams.REASON.nameInLowerCase(), s);
            return;
        }
    }

    public static void a(Boolean boolean1)
    {
        EasyMetric easymetric = new EasyMetric(ProfilePageMetrics.PROFILE_PICTURES_SHARE_PICTURES.name());
        easymetric.a(ProfilePageMetricParams.HAS_PICTURE.nameInLowerCase(), boolean1.toString());
        easymetric.b(true);
    }

    public static void a(Long long1)
    {
        EasyMetric easymetric = new EasyMetric(ProfilePageMetrics.PROFILE_PICTURES_TAKE_NEW_PICTURES.name());
        easymetric.a(ProfilePageMetricParams.LAST_TAKEN_TIMESTAMP.nameInLowerCase(), long1.toString());
        easymetric.b(true);
    }

    public static void b()
    {
        (new EasyMetric(ProfilePageMetrics.PROFILE_ADD_BY_SNAPCODE_CLICK.name())).e();
    }

    public static void b(Long long1)
    {
        EasyMetric easymetric = new EasyMetric(ProfilePageMetrics.PROFILE_PICTURES_DELETE_PICTURES.name());
        easymetric.a(ProfilePageMetricParams.LAST_TAKEN_TIMESTAMP.nameInLowerCase(), long1.toString());
        easymetric.b(true);
    }

    public static Pair c(AnalyticsEvents.AnalyticsContext analyticscontext)
    {
        iP ip1 = null;
        _cls1..SwitchMap.com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext[analyticscontext.ordinal()];
        JVM INSTR tableswitch 3 16: default 80
    //                   3 120
    //                   4 164
    //                   5 153
    //                   6 142
    //                   7 186
    //                   8 131
    //                   9 175
    //                   10 88
    //                   11 95
    //                   12 102
    //                   13 109
    //                   14 197
    //                   15 208
    //                   16 219;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
        analyticscontext = null;
_L17:
        return Pair.create(analyticscontext, ip1);
_L9:
        analyticscontext = hR.CAMERA_VIEWFINDER;
        continue; /* Loop/switch isn't completed */
_L10:
        analyticscontext = hR.CHAT_FEED;
        continue; /* Loop/switch isn't completed */
_L11:
        analyticscontext = hR.STORY;
        continue; /* Loop/switch isn't completed */
_L12:
        analyticscontext = hR.PROFILE;
        ip1 = iP.HELP;
        continue; /* Loop/switch isn't completed */
_L2:
        analyticscontext = hR.PROFILE_FRIEND_LIST;
        ip1 = iP.ADDED_ME;
        continue; /* Loop/switch isn't completed */
_L7:
        analyticscontext = hR.PROFILE_FRIEND_LIST;
        ip1 = iP.ADDRESS_BOOK;
        continue; /* Loop/switch isn't completed */
_L5:
        analyticscontext = hR.PROFILE_FRIEND_LIST;
        ip1 = iP.ADD_NEARBY;
        continue; /* Loop/switch isn't completed */
_L4:
        analyticscontext = hR.PROFILE_FRIEND_LIST;
        ip1 = iP.ADD_BY_USERNAME;
        continue; /* Loop/switch isn't completed */
_L3:
        analyticscontext = hR.PROFILE_FRIEND_LIST;
        ip1 = iP.ADD_FRIENDS_MENU;
        continue; /* Loop/switch isn't completed */
_L8:
        analyticscontext = hR.PROFILE_FRIEND_LIST;
        ip1 = iP.MY_CONTACTS;
        continue; /* Loop/switch isn't completed */
_L6:
        analyticscontext = hR.PROFILE_FRIEND_LIST;
        ip1 = iP.MY_FRIENDS;
        continue; /* Loop/switch isn't completed */
_L13:
        analyticscontext = hR.PROFILE;
        ip1 = iP.SETTING;
        continue; /* Loop/switch isn't completed */
_L14:
        analyticscontext = hR.PROFILE_FRIEND_LIST;
        ip1 = iP.ADD_BY_SNAPCODE;
        continue; /* Loop/switch isn't completed */
_L15:
        analyticscontext = hR.PROFILE;
        ip1 = iP.TROPHY;
        if (true) goto _L17; else goto _L16
_L16:
    }

    public static void c()
    {
        (new EasyMetric(ProfilePageMetrics.PROFILE_ADD_NEARBY_CLICK.name())).e();
    }

    public static void d()
    {
        (new EasyMetric(ProfilePageMetrics.PROFILE_EMPTY_ADDRESS_BOOK.name())).e();
    }

    public final void a(AnalyticsEvents.AnalyticsContext analyticscontext)
    {
        switch (_cls1..SwitchMap.com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext[analyticscontext.ordinal()])
        {
        default:
            Timber.e("ProfileEventAnalytics", (new StringBuilder("onProfilePagesView  - Unknown analytics context ")).append(analyticscontext).toString(), new Object[0]);
            return;

        case 1: // '\001'
            analyticscontext = new iQ();
            mBlizzardEventLogger.a(analyticscontext);
            return;

        case 2: // '\002'
            (new EasyMetric(ProfilePageMetrics.PROFILE_PICTURES_PAGE_VIEW.name())).b(true);
            return;

        case 3: // '\003'
            analyticscontext = new hY();
            mBlizzardEventLogger.a(analyticscontext);
            return;

        case 4: // '\004'
            analyticscontext = new hV();
            mBlizzardEventLogger.a(analyticscontext);
            return;

        case 5: // '\005'
            analyticscontext = new iV();
            mBlizzardEventLogger.a(analyticscontext);
            return;

        case 6: // '\006'
            analyticscontext = new hW();
            mBlizzardEventLogger.a(analyticscontext);
            return;

        case 7: // '\007'
            analyticscontext = new iK();
            break;
        }
        mBlizzardEventLogger.a(analyticscontext);
    }

    public final void a(AnalyticsEvents.AnalyticsContext analyticscontext, int i, boolean flag)
    {
        iO io1 = new iO();
        analyticscontext = c(analyticscontext);
        io1.destination = (hR)((Pair) (analyticscontext)).first;
        io1.destinationPage = (iP)((Pair) (analyticscontext)).second;
        io1.newAddedMeCount = Long.valueOf(i);
        io1.hasProfilePic = Boolean.valueOf(flag);
        mBlizzardEventLogger.a(io1);
    }

    public final void a(AnalyticsEvents.AnalyticsContext analyticscontext, String s)
    {
        hL hl = new hL();
        analyticscontext = c(analyticscontext);
        hl.source = (hR)((Pair) (analyticscontext)).first;
        hl.sourcePage = (iP)((Pair) (analyticscontext)).second;
        hl.hasProfilePic = Boolean.valueOf(TextUtils.equals(s, "YES"));
        mBlizzardEventLogger.a(hl);
    }

    public final void a(AnalyticsEvents.AnalyticsContext analyticscontext, boolean flag, boolean flag1, AnalyticsEvents.AnalyticsContext analyticscontext1)
    {
        switch (_cls1..SwitchMap.com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext[analyticscontext.ordinal()])
        {
        default:
            Timber.e("ProfileEventAnalytics", (new StringBuilder("onProfileContactsPagesView  - Unknown analytics context ")).append(analyticscontext).toString(), new Object[0]);
            return;

        case 8: // '\b'
            analyticscontext = new ih();
            analyticscontext.hasContactAccess = Boolean.valueOf(flag);
            analyticscontext.verificationType = a(flag1);
            analyticscontext1 = c(analyticscontext1);
            analyticscontext.source = (hR)((Pair) (analyticscontext1)).first;
            analyticscontext.sourcePage = (iP)((Pair) (analyticscontext1)).second;
            mBlizzardEventLogger.a(analyticscontext);
            return;

        case 9: // '\t'
            analyticscontext = new iA();
            break;
        }
        mBlizzardEventLogger.a(analyticscontext);
        analyticscontext.hasContactAccess = Boolean.valueOf(flag);
        analyticscontext.verificationType = a(flag1);
    }

    public final void a(FriendAction friendaction, AnalyticsEvents.AnalyticsContext analyticscontext, int i, Friend friend, com.snapchat.android.model.Friend.AddSourceType addsourcetype, boolean flag, String s, 
            hT ht)
    {
        if (friend != null && analyticscontext != null) goto _L2; else goto _L1
_L1:
        Timber.e("ProfileEventAnalytics", "invalid event params", new Object[0]);
_L19:
        return;
_L2:
        _cls1..SwitchMap.com.snapchat.android.model.FriendAction[friendaction.ordinal()];
        JVM INSTR tableswitch 1 6: default 68
    //                   1 95
    //                   2 596
    //                   3 771
    //                   4 1108
    //                   5 1162
    //                   6 1326;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        Timber.e("ProfileEventAnalytics", (new StringBuilder("onProfileFriendActionEvents  - Unknown friendAction ")).append(friendaction).toString(), new Object[0]);
        return;
_L4:
        _cls1..SwitchMap.com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext[analyticscontext.ordinal()];
        JVM INSTR tableswitch 3 10: default 148
    //                   3 175
    //                   4 551
    //                   5 354
    //                   6 148
    //                   7 496
    //                   8 406
    //                   9 458
    //                   10 534;
           goto _L10 _L11 _L12 _L13 _L10 _L14 _L15 _L16 _L17
_L10:
        Timber.e("ProfileEventAnalytics", (new StringBuilder("onAddAction Unknown analyticsContext ")).append(analyticscontext).toString(), new Object[0]);
        return;
_L11:
        if (flag)
        {
            boolean flag1 = friend.f();
            friendaction = a(addsourcetype);
            ht = new io();
            ht.hasDisplayName = Boolean.valueOf(flag1);
            ht.source = friendaction;
            mBlizzardEventLogger.a(ht);
        }
        friendaction = new EasyMetric(ProfilePageMetrics.PROFILE_FRIEND_REQUEST_ACCEPT.name());
        a(((EasyMetric) (friendaction)), friend);
_L18:
        if (addsourcetype != null && addsourcetype != com.snapchat.android.model.Friend.AddSourceType.UNKNOWN)
        {
            friendaction.a(ProfilePageMetricParams.SOURCE.nameInLowerCase(), addsourcetype.getMetricName());
        }
        friendaction.a(ProfilePageMetricParams.FRIEND.nameInLowerCase(), friend.g()).a(ProfilePageMetricParams.IDENTITY_PROFILE_PAGE.nameInLowerCase(), Io.a(analyticscontext));
        if (mFriendManager.f())
        {
            friendaction.a(ProfilePageMetricParams.IN_MY_CONTACTS.nameInLowerCase(), ProfilePageMetricsBoolean.fromValue(mFriendManager.b(friend)).name());
        }
        a(((EasyMetric) (friendaction)), flag, s);
        friendaction.e();
        return;
_L13:
        if (flag)
        {
            friendaction = a(addsourcetype);
            ht = new iT();
            ht.source = friendaction;
            mBlizzardEventLogger.a(ht);
        }
        friendaction = new EasyMetric(ProfilePageMetrics.PROFILE_FRIENDS_REQUESTS_SENT.name());
          goto _L18
_L15:
        if (flag)
        {
            friendaction = a(addsourcetype);
            ht = new if();
            ht.source = friendaction;
            mBlizzardEventLogger.a(ht);
        }
        friendaction = new EasyMetric(ProfilePageMetrics.PROFILE_FRIENDS_REQUESTS_SENT.name());
          goto _L18
_L16:
        if (flag)
        {
            friendaction = new iy();
            mBlizzardEventLogger.a(friendaction);
        }
        friendaction = new EasyMetric(ProfilePageMetrics.PROFILE_FRIENDS_REQUESTS_SENT.name());
          goto _L18
_L14:
        if (flag)
        {
            friendaction = new iH();
            mBlizzardEventLogger.a(friendaction);
        }
        friendaction = new EasyMetric(ProfilePageMetrics.PROFILE_FRIENDS_REQUESTS_SENT.name());
          goto _L18
_L17:
        friendaction = new EasyMetric(ProfilePageMetrics.PROFILE_FRIENDS_REQUESTS_SENT.name());
          goto _L18
_L12:
        ht = new EasyMetric(ProfilePageMetrics.PROFILE_FRIENDS_REQUESTS_SENT.name());
        friendaction = ht;
        if (i != -1)
        {
            ht.a(ProfilePageMetricParams.IDENTITY_CELL_INDEX.nameInLowerCase(), Integer.valueOf(i));
            friendaction = ht;
        }
          goto _L18
_L5:
        if (flag)
        {
            switch (_cls1..SwitchMap.com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext[analyticscontext.ordinal()])
            {
            case 4: // '\004'
            case 6: // '\006'
            default:
                return;

            case 3: // '\003'
                flag = friend.f();
                friendaction = a(addsourcetype);
                analyticscontext = new iq();
                analyticscontext.hasDisplayName = Boolean.valueOf(flag);
                analyticscontext.source = friendaction;
                analyticscontext.method = ht;
                mBlizzardEventLogger.a(analyticscontext);
                return;

            case 5: // '\005'
                friendaction = new iS();
                mBlizzardEventLogger.a(friendaction);
                return;

            case 8: // '\b'
                friendaction = new ie();
                mBlizzardEventLogger.a(friendaction);
                return;

            case 7: // '\007'
                friendaction = new iG();
                mBlizzardEventLogger.a(friendaction);
                return;

            case 9: // '\t'
                friendaction = new ix();
                break;
            }
            mBlizzardEventLogger.a(friendaction);
            return;
        }
          goto _L19
_L6:
        boolean flag2;
        if (mFriendManager.f())
        {
            flag2 = mFriendManager.c(friend.g());
        } else
        {
            flag2 = false;
        }
        _cls1..SwitchMap.com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext[analyticscontext.ordinal()];
        JVM INSTR lookupswitch 3: default 836
    //                   3: 869
    //                   7: 1048
    //                   9: 1048;
           goto _L20 _L21 _L22 _L22
_L20:
        Timber.e("ProfileEventAnalytics", (new StringBuilder("onBlockAction Unknown analyticsContext ")).append(analyticscontext).toString(), new Object[0]);
        return;
_L21:
        if (flag && ht != null)
        {
            boolean flag4 = friend.f();
            friendaction = a(addsourcetype);
            addsourcetype = new ip();
            addsourcetype.hasDisplayName = Boolean.valueOf(flag4);
            addsourcetype.source = friendaction;
            addsourcetype.method = ht;
            mBlizzardEventLogger.a(addsourcetype);
        }
        if (flag2)
        {
            friendaction = ProfilePageMetrics.PROFILE_FRIEND_BLOCK.name();
        } else
        {
            friendaction = ProfilePageMetrics.PROFILE_FRIEND_REQUEST_BLOCK.name();
        }
        friendaction = new EasyMetric(friendaction);
        a(((EasyMetric) (friendaction)), friend);
        if (mFriendManager.f())
        {
            friendaction.a(ProfilePageMetricParams.IN_MY_CONTACTS.nameInLowerCase(), ProfilePageMetricsBoolean.fromValue(mFriendManager.b(friend)).name());
        }
_L23:
        friendaction.a(ProfilePageMetricParams.FRIEND.nameInLowerCase(), friend.g()).a(ProfilePageMetricParams.IDENTITY_PROFILE_PAGE.nameInLowerCase(), Io.a(analyticscontext));
        a(((EasyMetric) (friendaction)), flag, s);
        friendaction.e();
        return;
_L22:
        if (flag)
        {
            friendaction = new iF();
            mBlizzardEventLogger.a(friendaction);
        }
        if (flag2)
        {
            friendaction = new EasyMetric(ProfilePageMetrics.PROFILE_FRIEND_BLOCK.name());
        } else
        {
            friendaction = new EasyMetric(ProfilePageMetrics.PROFILE_CONTACT_BLOCK.name());
        }
          goto _L23
_L7:
        friendaction = (new EasyMetric(ProfilePageMetrics.PROFILE_CONTACT_UNBLOCK.name())).a(ProfilePageMetricParams.FRIEND.nameInLowerCase(), friend.g()).a(ProfilePageMetricParams.IDENTITY_PROFILE_PAGE.nameInLowerCase(), Io.a(analyticscontext));
        a(((EasyMetric) (friendaction)), flag, s);
        friendaction.e();
        return;
_L8:
        _cls1..SwitchMap.com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext[analyticscontext.ordinal()];
        JVM INSTR lookupswitch 3: default 1204
    //                   1: 1231
    //                   3: 1253
    //                   7: 1302;
           goto _L24 _L25 _L26 _L27
_L24:
        Timber.e("ProfileEventAnalytics", (new StringBuilder("onSetDisplayNameAction Unknown analyticsContext ")).append(analyticscontext).toString(), new Object[0]);
        return;
_L25:
        if (flag)
        {
            friendaction = new in();
            mBlizzardEventLogger.a(friendaction);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L26:
        if (flag)
        {
            flag = friend.f();
            friendaction = a(addsourcetype);
            analyticscontext = new is();
            analyticscontext.hasDisplayName = Boolean.valueOf(flag);
            analyticscontext.source = friendaction;
            mBlizzardEventLogger.a(analyticscontext);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L27:
        if (flag)
        {
            friendaction = new iI();
            mBlizzardEventLogger.a(friendaction);
        }
          goto _L24
_L9:
        if (flag && ht != null)
        {
            boolean flag3 = friend.f();
            friendaction = a(addsourcetype);
            addsourcetype = new ir();
            addsourcetype.hasDisplayName = Boolean.valueOf(flag3);
            addsourcetype.source = friendaction;
            addsourcetype.method = ht;
            mBlizzardEventLogger.a(addsourcetype);
        }
        friendaction = (new EasyMetric(ProfilePageMetrics.PROFILE_FRIEND_REQUEST_IGNORE.name())).a(ProfilePageMetricParams.FRIEND.nameInLowerCase(), friend.g()).a(ProfilePageMetricParams.IDENTITY_PROFILE_PAGE.nameInLowerCase(), Io.a(analyticscontext));
        a(((EasyMetric) (friendaction)), friend);
        if (mFriendManager.f())
        {
            friendaction.a(ProfilePageMetricParams.IN_MY_CONTACTS.nameInLowerCase(), ProfilePageMetricsBoolean.fromValue(mFriendManager.b(friend)).name());
        }
        a(((EasyMetric) (friendaction)), flag, s);
        friendaction.e();
        return;
        if (true) goto _L19; else goto _L28
_L28:
    }

    public final void b(AnalyticsEvents.AnalyticsContext analyticscontext)
    {
        hZ hz = new hZ();
        analyticscontext = c(analyticscontext);
        hz.source = (hR)((Pair) (analyticscontext)).first;
        hz.sourcePage = (iP)((Pair) (analyticscontext)).second;
        mBlizzardEventLogger.a(hz);
    }

}
