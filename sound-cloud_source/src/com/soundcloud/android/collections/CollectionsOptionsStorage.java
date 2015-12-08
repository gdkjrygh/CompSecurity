// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import android.content.SharedPreferences;

// Referenced classes of package com.soundcloud.android.collections:
//            PlaylistsOptions

class CollectionsOptionsStorage
{

    static final String KEY_SHOW_LIKES = "showLikes";
    static final String KEY_SHOW_OFFLINE_ONLY = "showOfflineOnly";
    static final String KEY_SHOW_POSTS = "showPosts";
    static final String KEY_SORT_BY_TITLE = "sortByTitle";
    private static final String ONBOARDING_DISABLED = "ONBOARDING_DISABLED";
    private final SharedPreferences preferences;

    public CollectionsOptionsStorage(SharedPreferences sharedpreferences)
    {
        preferences = sharedpreferences;
    }

    void clear()
    {
        preferences.edit().clear().apply();
    }

    void disableOnboarding()
    {
        preferences.edit().putBoolean("ONBOARDING_DISABLED", true).apply();
    }

    public PlaylistsOptions getLastOrDefault()
    {
        return PlaylistsOptions.builder().showLikes(preferences.getBoolean("showLikes", false)).showPosts(preferences.getBoolean("showPosts", false)).showOfflineOnly(preferences.getBoolean("showOfflineOnly", false)).sortByTitle(preferences.getBoolean("sortByTitle", false)).build();
    }

    boolean isOnboardingEnabled()
    {
        boolean flag = false;
        if (!preferences.getBoolean("ONBOARDING_DISABLED", false))
        {
            flag = true;
        }
        return flag;
    }

    public void store(PlaylistsOptions playlistsoptions)
    {
        preferences.edit().putBoolean("showLikes", playlistsoptions.showLikes()).putBoolean("showPosts", playlistsoptions.showPosts()).putBoolean("showOfflineOnly", playlistsoptions.showOfflineOnly()).putBoolean("sortByTitle", playlistsoptions.sortByTitle()).apply();
    }
}
