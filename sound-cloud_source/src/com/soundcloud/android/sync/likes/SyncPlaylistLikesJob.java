// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.likes;

import android.net.Uri;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.android.sync.LegacySyncJob;
import dagger.Lazy;
import java.util.concurrent.Callable;

// Referenced classes of package com.soundcloud.android.sync.likes:
//            DefaultSyncJob

public class SyncPlaylistLikesJob extends DefaultSyncJob
{

    public SyncPlaylistLikesJob(Lazy lazy)
    {
        super((Callable)lazy.a());
    }

    private boolean isLegacyMyLikesSyncJob(Object obj)
    {
        return (obj instanceof LegacySyncJob) && ((LegacySyncJob)obj).getContentUri().equals(Content.ME_LIKES.uri);
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof SyncPlaylistLikesJob) || isLegacyMyLikesSyncJob(obj);
    }
}
