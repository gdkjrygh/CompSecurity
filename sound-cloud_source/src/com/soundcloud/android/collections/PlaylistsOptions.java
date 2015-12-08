// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;


public abstract class PlaylistsOptions
{
    public static abstract class Builder
    {

        public abstract PlaylistsOptions build();

        public abstract Builder showLikes(boolean flag);

        public abstract Builder showOfflineOnly(boolean flag);

        public abstract Builder showPosts(boolean flag);

        public abstract Builder sortByTitle(boolean flag);

        public Builder()
        {
        }
    }


    public PlaylistsOptions()
    {
    }

    public static Builder builder()
    {
        return (new AutoValue_PlaylistsOptions.Builder()).showPosts(false).showLikes(false).showOfflineOnly(false).sortByTitle(false);
    }

    public abstract boolean showLikes();

    public abstract boolean showOfflineOnly();

    public abstract boolean showPosts();

    public abstract boolean sortByTitle();
}
