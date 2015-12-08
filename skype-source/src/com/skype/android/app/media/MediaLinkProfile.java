// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;


public final class MediaLinkProfile extends Enum
{

    private static final MediaLinkProfile $VALUES[];
    public static final MediaLinkProfile CACHE_PROFILE;
    public static final MediaLinkProfile DEFAULT_PROFILE;
    public static final MediaLinkProfile FAVICON_PROFILE;
    public static final MediaLinkProfile GROUP_AVATAR_PROFILE;
    public static final MediaLinkProfile IMG_PROFILE;
    public static final MediaLinkProfile ORIGINAL;
    public static final MediaLinkProfile PREVIEW_PROFILE;
    public static final MediaLinkProfile SAVE_PROFILE;
    public static final MediaLinkProfile THUMBNAIL_PROFILE;
    public static final MediaLinkProfile UNKNOWN_PROFILE;
    public static final MediaLinkProfile VIDEO_PROFILE;
    private final String profile;

    private MediaLinkProfile(String s, int i, String s1)
    {
        super(s, i);
        profile = s1;
    }

    public static final MediaLinkProfile fromString(String s)
    {
        MediaLinkProfile amedialinkprofile[] = values();
        int j = amedialinkprofile.length;
        for (int i = 0; i < j; i++)
        {
            MediaLinkProfile medialinkprofile = amedialinkprofile[i];
            if (medialinkprofile.toString().equals(s))
            {
                return medialinkprofile;
            }
        }

        return UNKNOWN_PROFILE;
    }

    public static MediaLinkProfile valueOf(String s)
    {
        return (MediaLinkProfile)Enum.valueOf(com/skype/android/app/media/MediaLinkProfile, s);
    }

    public static MediaLinkProfile[] values()
    {
        return (MediaLinkProfile[])$VALUES.clone();
    }

    public final String toString()
    {
        return profile;
    }

    static 
    {
        IMG_PROFILE = new MediaLinkProfile("IMG_PROFILE", 0, "imgt1");
        PREVIEW_PROFILE = new MediaLinkProfile("PREVIEW_PROFILE", 1, "imgo");
        SAVE_PROFILE = new MediaLinkProfile("SAVE_PROFILE", 2, "imgpsh_mobile_save");
        CACHE_PROFILE = new MediaLinkProfile("CACHE_PROFILE", 3, "?imgpsh");
        GROUP_AVATAR_PROFILE = new MediaLinkProfile("GROUP_AVATAR_PROFILE", 4, "avatar_fullsize");
        THUMBNAIL_PROFILE = new MediaLinkProfile("THUMBNAIL_PROFILE", 5, "thumbnail");
        VIDEO_PROFILE = new MediaLinkProfile("VIDEO_PROFILE", 6, "video");
        DEFAULT_PROFILE = new MediaLinkProfile("DEFAULT_PROFILE", 7, "default");
        FAVICON_PROFILE = new MediaLinkProfile("FAVICON_PROFILE", 8, "favicon");
        ORIGINAL = new MediaLinkProfile("ORIGINAL", 9, "original");
        UNKNOWN_PROFILE = new MediaLinkProfile("UNKNOWN_PROFILE", 10, "");
        $VALUES = (new MediaLinkProfile[] {
            IMG_PROFILE, PREVIEW_PROFILE, SAVE_PROFILE, CACHE_PROFILE, GROUP_AVATAR_PROFILE, THUMBNAIL_PROFILE, VIDEO_PROFILE, DEFAULT_PROFILE, FAVICON_PROFILE, ORIGINAL, 
            UNKNOWN_PROFILE
        });
    }
}
