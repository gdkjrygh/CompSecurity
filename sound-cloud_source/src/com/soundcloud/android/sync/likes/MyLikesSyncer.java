// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.likes;

import android.net.Uri;
import com.soundcloud.android.sync.ApiSyncResult;
import com.soundcloud.android.sync.SyncStrategy;
import dagger.Lazy;

// Referenced classes of package com.soundcloud.android.sync.likes:
//            LikesSyncer

public class MyLikesSyncer
    implements SyncStrategy
{

    private final Lazy playlistLikesSyncer;
    private final Lazy trackLikesSyncer;

    public MyLikesSyncer(Lazy lazy, Lazy lazy1)
    {
        trackLikesSyncer = lazy;
        playlistLikesSyncer = lazy1;
    }

    public ApiSyncResult syncContent(Uri uri, String s)
        throws Exception
    {
        s = ((LikesSyncer)trackLikesSyncer.a()).call();
        Boolean boolean1 = ((LikesSyncer)playlistLikesSyncer.a()).call();
        if (s.booleanValue() || boolean1.booleanValue())
        {
            return ApiSyncResult.fromSuccessfulChange(uri);
        } else
        {
            return ApiSyncResult.fromSuccessWithoutChange(uri);
        }
    }
}
