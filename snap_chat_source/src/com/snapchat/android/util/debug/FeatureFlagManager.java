// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.debug;

import Ly;
import android.content.SharedPreferences;

// Referenced classes of package com.snapchat.android.util.debug:
//            ReleaseManager

public final class FeatureFlagManager
{
    public static final class FeatureFlag extends Enum
    {

        private static final FeatureFlag $VALUES[];
        public static final FeatureFlag CHAT_V2;
        public static final FeatureFlag DELTA_FETCH_FRIENDS;
        public static final FeatureFlag OFFICIAL_STORIES_COLLABORATION;
        public static final FeatureFlag OFFICIAL_STORIES_SEARCH;
        public static final FeatureFlag REPLY_STORY_TO_CHAT;
        public static final FeatureFlag SHOULD_IGNORE_BACKEND_STORE_AVAILABLE;
        public static final FeatureFlag SHOULD_USE_LOCAL_DATE_FOR_SCHEDULED_LENSES;
        public static final FeatureFlag STORIES_SCROLL_BAR;
        public static final FeatureFlag STORY_EXPLORER;
        private final Ly mDebugFlag;
        private final String mDescription;

        static String a(FeatureFlag featureflag)
        {
            return featureflag.mDescription;
        }

        static Ly b(FeatureFlag featureflag)
        {
            return featureflag.mDebugFlag;
        }

        public static FeatureFlag valueOf(String s)
        {
            return (FeatureFlag)Enum.valueOf(com/snapchat/android/util/debug/FeatureFlagManager$FeatureFlag, s);
        }

        public static FeatureFlag[] values()
        {
            return (FeatureFlag[])$VALUES.clone();
        }

        static 
        {
            DELTA_FETCH_FRIENDS = new FeatureFlag("DELTA_FETCH_FRIENDS", 0, "enable_delta_fetch_friends", "Enable delta fetch of outgoing friends", true);
            CHAT_V2 = new FeatureFlag("CHAT_V2", 1, "enable_chat_v2", "Enable chat v2", false);
            REPLY_STORY_TO_CHAT = new FeatureFlag("REPLY_STORY_TO_CHAT", 2, "enable_reply_story_to_chat", "Enable reply story to Chat", false);
            STORIES_SCROLL_BAR = new FeatureFlag("STORIES_SCROLL_BAR", 3, "enable_new_scroll_bar_stories", "Enable new scroll bar for stories", true);
            STORY_EXPLORER = new FeatureFlag("STORY_EXPLORER", 4, "enable_story_explorer", "Enable Story Explorer", false);
            OFFICIAL_STORIES_COLLABORATION = new FeatureFlag("OFFICIAL_STORIES_COLLABORATION", 5, "enable_official_stories_collaboration", "Enable Official Stories Collaboration", false);
            OFFICIAL_STORIES_SEARCH = new FeatureFlag("OFFICIAL_STORIES_SEARCH", 6, "enable_official_stories_search", "Enable Official Stories Search", true);
            SHOULD_USE_LOCAL_DATE_FOR_SCHEDULED_LENSES = new FeatureFlag("SHOULD_USE_LOCAL_DATE_FOR_SCHEDULED_LENSES", 7, "should_use_local_date_for_scheduled_lenses", "Should use local date for scheduled lenses", false);
            SHOULD_IGNORE_BACKEND_STORE_AVAILABLE = new FeatureFlag("SHOULD_IGNORE_BACKEND_STORE_AVAILABLE", 8, "should_ignore_backend_store_available", "Should ignore backend currencies/country check", false);
            $VALUES = (new FeatureFlag[] {
                DELTA_FETCH_FRIENDS, CHAT_V2, REPLY_STORY_TO_CHAT, STORIES_SCROLL_BAR, STORY_EXPLORER, OFFICIAL_STORIES_COLLABORATION, OFFICIAL_STORIES_SEARCH, SHOULD_USE_LOCAL_DATE_FOR_SCHEDULED_LENSES, SHOULD_IGNORE_BACKEND_STORE_AVAILABLE
            });
        }

        private FeatureFlag(String s, int i, String s1, String s2, boolean flag)
        {
            super(s, i);
            mDebugFlag = new Ly(s1, flag);
            mDescription = s2;
        }
    }


    private static final FeatureFlagManager sInstance = new FeatureFlagManager();

    private FeatureFlagManager()
    {
    }

    public static FeatureFlagManager a()
    {
        return sInstance;
    }

    public static String a(FeatureFlag featureflag)
    {
        return FeatureFlag.a(featureflag);
    }

    public static void a(FeatureFlag featureflag, boolean flag)
    {
        featureflag = FeatureFlag.b(featureflag);
        if (!((Ly) (featureflag)).mReleaseManager.c())
        {
            throw new IllegalStateException("Debug flags can only be flipped on internal builds.");
        } else
        {
            ((Ly) (featureflag)).mSharedPreferences.edit().putBoolean(((Ly) (featureflag)).mSharedPreferenceKey, flag).apply();
            return;
        }
    }

    public static boolean b(FeatureFlag featureflag)
    {
        featureflag = FeatureFlag.b(featureflag);
        if (((Ly) (featureflag)).mReleaseManager.c() && ((Ly) (featureflag)).mSharedPreferences.contains(((Ly) (featureflag)).mSharedPreferenceKey))
        {
            return ((Ly) (featureflag)).mSharedPreferences.getBoolean(((Ly) (featureflag)).mSharedPreferenceKey, false);
        } else
        {
            return ((Ly) (featureflag)).mIsEnabled;
        }
    }

}
