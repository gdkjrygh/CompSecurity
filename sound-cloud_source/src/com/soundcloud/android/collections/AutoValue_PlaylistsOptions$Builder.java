// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;


// Referenced classes of package com.soundcloud.android.collections:
//            AutoValue_PlaylistsOptions, PlaylistsOptions

static final class sortByTitle extends sortByTitle
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

    public final sortByTitle showLikes(boolean flag)
    {
        showLikes = Boolean.valueOf(flag);
        return this;
    }

    public final showLikes showOfflineOnly(boolean flag)
    {
        showOfflineOnly = Boolean.valueOf(flag);
        return this;
    }

    public final showOfflineOnly showPosts(boolean flag)
    {
        showPosts = Boolean.valueOf(flag);
        return this;
    }

    public final showPosts sortByTitle(boolean flag)
    {
        sortByTitle = Boolean.valueOf(flag);
        return this;
    }

    ()
    {
    }

    (PlaylistsOptions playlistsoptions)
    {
        showLikes = Boolean.valueOf(playlistsoptions.showLikes());
        showPosts = Boolean.valueOf(playlistsoptions.showPosts());
        showOfflineOnly = Boolean.valueOf(playlistsoptions.showOfflineOnly());
        sortByTitle = Boolean.valueOf(playlistsoptions.sortByTitle());
    }
}
