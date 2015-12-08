// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database;

import android.text.TextUtils;
import com.snapchat.android.Timber;
import java.util.Locale;

// Referenced classes of package com.snapchat.android.database:
//            SharedPreferenceKey

public final class OnboardingTooltip extends Enum
{

    private static final OnboardingTooltip $VALUES[];
    public static final OnboardingTooltip ADD_NEARBY_PROMPT;
    public static final OnboardingTooltip CAPTION;
    public static final OnboardingTooltip DISCOVER_ONBOARDING;
    public static final OnboardingTooltip FIRST_LOCATION;
    public static final OnboardingTooltip LENSES_FIRST_APPEARANCE;
    public static final OnboardingTooltip MY_STORY;
    public static final OnboardingTooltip NEW_FRIEND_REQUEST;
    public static final OnboardingTooltip POST_STORY;
    public static final OnboardingTooltip PROFILE;
    public static final OnboardingTooltip PROFILE_PICTURES;
    public static final OnboardingTooltip SAVE_TO_GALLERY;
    public static final OnboardingTooltip SHARE_DISCOVER;
    public static final OnboardingTooltip SNAP;
    public static final OnboardingTooltip SWIPE_FILTERS;
    public static final OnboardingTooltip SWIPE_TO_DISMISS;
    public static final OnboardingTooltip TAP_TO_SKIP;
    public static final OnboardingTooltip TROPHY_CASE;
    public static final OnboardingTooltip UNKNOWN;
    private SharedPreferenceKey a;

    private OnboardingTooltip(String s, int i, SharedPreferenceKey sharedpreferencekey)
    {
        super(s, i);
        a = sharedpreferencekey;
    }

    public static OnboardingTooltip fromValue(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            Timber.e("OnBoardingTooltip", (new StringBuilder("Failed to convert an empty string(")).append(s).append(") into OnboardingTooltip. ").toString(), new Object[0]);
            return UNKNOWN;
        }
        OnboardingTooltip onboardingtooltip;
        try
        {
            onboardingtooltip = valueOf(s.toUpperCase(Locale.US));
        }
        catch (Exception exception)
        {
            Timber.e("OnBoardingTooltip", (new StringBuilder("Failed to convert ")).append(s).append(" into OnboardingTooltip. ").append(exception).toString(), new Object[0]);
            return UNKNOWN;
        }
        return onboardingtooltip;
    }

    public static OnboardingTooltip valueOf(String s)
    {
        return (OnboardingTooltip)Enum.valueOf(com/snapchat/android/database/OnboardingTooltip, s);
    }

    public static OnboardingTooltip[] values()
    {
        return (OnboardingTooltip[])$VALUES.clone();
    }

    public final SharedPreferenceKey getSharedPreferenceKey()
    {
        return a;
    }

    static 
    {
        SNAP = new OnboardingTooltip("SNAP", 0, SharedPreferenceKey.HAS_SEEN_TAKE_SNAP_ONBOARDING_MESSAGE);
        CAPTION = new OnboardingTooltip("CAPTION", 1, SharedPreferenceKey.HAS_SEEN_CAPTION_ONBOARDING_MESSAGE);
        SWIPE_FILTERS = new OnboardingTooltip("SWIPE_FILTERS", 2, SharedPreferenceKey.HAS_SEEN_SWIPE_FILTERS_ONBOARDING_MESSAGE);
        MY_STORY = new OnboardingTooltip("MY_STORY", 3, SharedPreferenceKey.HAS_POSTED_STORY_FROM_SEND_TO);
        FIRST_LOCATION = new OnboardingTooltip("FIRST_LOCATION", 4, SharedPreferenceKey.HAS_SEEN_PROMPT_FOR_LOCATION_IN_CAMERA);
        PROFILE = new OnboardingTooltip("PROFILE", 5, SharedPreferenceKey.HAS_SEEN_PROFILE_PAGE_ONBOARDING_MESSAGE);
        NEW_FRIEND_REQUEST = new OnboardingTooltip("NEW_FRIEND_REQUEST", 6, SharedPreferenceKey.HAS_SEEN_NEW_FRIEND_REQUEST_ONBOARDING_MESSAGE);
        ADD_NEARBY_PROMPT = new OnboardingTooltip("ADD_NEARBY_PROMPT", 7, SharedPreferenceKey.HAS_ACCEPTED_ADD_NEARBY_PROMPT);
        PROFILE_PICTURES = new OnboardingTooltip("PROFILE_PICTURES", 8, SharedPreferenceKey.HAS_SEEN_PROFILE_PICTURES_ONBOARDING_MESSAGE);
        TROPHY_CASE = new OnboardingTooltip("TROPHY_CASE", 9, SharedPreferenceKey.HAS_SEEN_TROPHY_CASE_TOOLTIP);
        DISCOVER_ONBOARDING = new OnboardingTooltip("DISCOVER_ONBOARDING", 10, SharedPreferenceKey.DISCOVER_SEEN_ONBOARDING);
        TAP_TO_SKIP = new OnboardingTooltip("TAP_TO_SKIP", 11, SharedPreferenceKey.TAPPED_TO_SKIP);
        SWIPE_TO_DISMISS = new OnboardingTooltip("SWIPE_TO_DISMISS", 12, SharedPreferenceKey.SWIPED_DOWN_IN_VIEWER);
        POST_STORY = new OnboardingTooltip("POST_STORY", 13, SharedPreferenceKey.HAS_SEEN_POST_STORY_DIALOG);
        SAVE_TO_GALLERY = new OnboardingTooltip("SAVE_TO_GALLERY", 14, SharedPreferenceKey.DISABLED_SAVE_STORY_TO_GALLERY_CONFIRMATION);
        SHARE_DISCOVER = new OnboardingTooltip("SHARE_DISCOVER", 15, SharedPreferenceKey.HAS_SHARED_DISCOVER_SNAP);
        LENSES_FIRST_APPEARANCE = new OnboardingTooltip("LENSES_FIRST_APPEARANCE", 16, SharedPreferenceKey.HAS_SEEN_LENS_TOOLTIP);
        UNKNOWN = new OnboardingTooltip("UNKNOWN", 17, null);
        $VALUES = (new OnboardingTooltip[] {
            SNAP, CAPTION, SWIPE_FILTERS, MY_STORY, FIRST_LOCATION, PROFILE, NEW_FRIEND_REQUEST, ADD_NEARBY_PROMPT, PROFILE_PICTURES, TROPHY_CASE, 
            DISCOVER_ONBOARDING, TAP_TO_SKIP, SWIPE_TO_DISMISS, POST_STORY, SAVE_TO_GALLERY, SHARE_DISCOVER, LENSES_FIRST_APPEARANCE, UNKNOWN
        });
    }
}
