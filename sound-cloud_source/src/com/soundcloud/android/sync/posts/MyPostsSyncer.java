// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.posts;

import android.net.Uri;
import com.soundcloud.android.sync.ApiSyncResult;
import com.soundcloud.android.sync.SyncStrategy;

// Referenced classes of package com.soundcloud.android.sync.posts:
//            PostsSyncer

public class MyPostsSyncer
    implements SyncStrategy
{

    private final PostsSyncer playlistPostsSyncer;
    private final PostsSyncer trackPostsSyncer;

    public MyPostsSyncer(PostsSyncer postssyncer, PostsSyncer postssyncer1)
    {
        trackPostsSyncer = postssyncer;
        playlistPostsSyncer = postssyncer1;
    }

    public ApiSyncResult syncContent(Uri uri, String s)
        throws Exception
    {
        if (trackPostsSyncer.call().booleanValue() || playlistPostsSyncer.call().booleanValue())
        {
            return ApiSyncResult.fromSuccessfulChange(uri);
        } else
        {
            return ApiSyncResult.fromSuccessWithoutChange(uri);
        }
    }
}
