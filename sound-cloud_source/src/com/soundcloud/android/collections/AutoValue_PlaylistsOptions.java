// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;


// Referenced classes of package com.soundcloud.android.collections:
//            PlaylistsOptions

final class AutoValue_PlaylistsOptions extends PlaylistsOptions
{
    static final class Builder extends PlaylistsOptions.Builder
    {

        private Boolean showLikes;
        private Boolean showOfflineOnly;
        private Boolean showPosts;
        private Boolean sortByTitle;

        public final PlaylistsOptions build()
        {
            String s1 = "";
            if (showLikes == null)
            {
                s1 = (new StringBuilder()).append("").append(" showLikes").toString();
            }
            String s = s1;
            if (showPosts == null)
            {
                s = (new StringBuilder()).append(s1).append(" showPosts").toString();
            }
            s1 = s;
            if (showOfflineOnly == null)
            {
                s1 = (new StringBuilder()).append(s).append(" showOfflineOnly").toString();
            }
            s = s1;
            if (sortByTitle == null)
            {
                s = (new StringBuilder()).append(s1).append(" sortByTitle").toString();
            }
            if (!s.isEmpty())
            {
                throw new IllegalStateException((new StringBuilder("Missing required properties:")).append(s).toString());
            } else
            {
                return new AutoValue_PlaylistsOptions(showLikes.booleanValue(), showPosts.booleanValue(), showOfflineOnly.booleanValue(), sortByTitle.booleanValue(), null);
            }
        }

        public final PlaylistsOptions.Builder showLikes(boolean flag)
        {
            showLikes = Boolean.valueOf(flag);
            return this;
        }

        public final PlaylistsOptions.Builder showOfflineOnly(boolean flag)
        {
            showOfflineOnly = Boolean.valueOf(flag);
            return this;
        }

        public final PlaylistsOptions.Builder showPosts(boolean flag)
        {
            showPosts = Boolean.valueOf(flag);
            return this;
        }

        public final PlaylistsOptions.Builder sortByTitle(boolean flag)
        {
            sortByTitle = Boolean.valueOf(flag);
            return this;
        }

        Builder()
        {
        }

        Builder(PlaylistsOptions playlistsoptions)
        {
            showLikes = Boolean.valueOf(playlistsoptions.showLikes());
            showPosts = Boolean.valueOf(playlistsoptions.showPosts());
            showOfflineOnly = Boolean.valueOf(playlistsoptions.showOfflineOnly());
            sortByTitle = Boolean.valueOf(playlistsoptions.sortByTitle());
        }
    }


    private final boolean showLikes;
    private final boolean showOfflineOnly;
    private final boolean showPosts;
    private final boolean sortByTitle;

    private AutoValue_PlaylistsOptions(boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        showLikes = flag;
        showPosts = flag1;
        showOfflineOnly = flag2;
        sortByTitle = flag3;
    }

    AutoValue_PlaylistsOptions(boolean flag, boolean flag1, boolean flag2, boolean flag3, _cls1 _pcls1)
    {
        this(flag, flag1, flag2, flag3);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof PlaylistsOptions)
            {
                if (showLikes != ((PlaylistsOptions) (obj = (PlaylistsOptions)obj)).showLikes() || showPosts != ((PlaylistsOptions) (obj)).showPosts() || showOfflineOnly != ((PlaylistsOptions) (obj)).showOfflineOnly() || sortByTitle != ((PlaylistsOptions) (obj)).sortByTitle())
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        char c3 = '\u04CF';
        char c;
        char c1;
        char c2;
        if (showLikes)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (showPosts)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        if (showOfflineOnly)
        {
            c2 = '\u04CF';
        } else
        {
            c2 = '\u04D5';
        }
        if (!sortByTitle)
        {
            c3 = '\u04D5';
        }
        return (c2 ^ (c1 ^ (c ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ c3;
    }

    public final boolean showLikes()
    {
        return showLikes;
    }

    public final boolean showOfflineOnly()
    {
        return showOfflineOnly;
    }

    public final boolean showPosts()
    {
        return showPosts;
    }

    public final boolean sortByTitle()
    {
        return sortByTitle;
    }

    public final String toString()
    {
        return (new StringBuilder("PlaylistsOptions{showLikes=")).append(showLikes).append(", showPosts=").append(showPosts).append(", showOfflineOnly=").append(showOfflineOnly).append(", sortByTitle=").append(sortByTitle).append("}").toString();
    }
}
