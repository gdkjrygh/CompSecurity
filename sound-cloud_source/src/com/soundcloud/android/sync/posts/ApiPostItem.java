// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.posts;

import com.soundcloud.android.model.PropertySetSource;
import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.sync.posts:
//            ApiPost, ApiRepost

public class ApiPostItem
    implements PropertySetSource
{

    private final ApiPost playlistPost;
    private final ApiRepost playlistRepost;
    private final ApiPost trackPost;
    private final ApiRepost trackRepost;

    public ApiPostItem(ApiPost apipost, ApiRepost apirepost, ApiPost apipost1, ApiRepost apirepost1)
    {
        trackPost = apipost;
        trackRepost = apirepost;
        playlistPost = apipost1;
        playlistRepost = apirepost1;
    }

    public PropertySet toPropertySet()
    {
        if (trackPost != null)
        {
            return trackPost.toPropertySet();
        }
        if (trackRepost != null)
        {
            return trackRepost.toPropertySet();
        }
        if (playlistPost != null)
        {
            return playlistPost.toPropertySet();
        } else
        {
            return playlistRepost.toPropertySet();
        }
    }
}
