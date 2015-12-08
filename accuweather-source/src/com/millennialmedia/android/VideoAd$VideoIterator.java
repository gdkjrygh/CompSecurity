// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;
import java.lang.ref.WeakReference;

// Referenced classes of package com.millennialmedia.android:
//            VideoAd, AdCache, MMLog, CachedAd

private static class contextRef extends contextRef
{

    private WeakReference contextRef;
    boolean hasSharedVideoFile;
    private WeakReference videoAdRef;

    boolean callback(CachedAd cachedad)
    {
        if (cachedad != null && (cachedad instanceof VideoAd))
        {
            VideoAd videoad = (VideoAd)cachedad;
            VideoAd videoad1 = (VideoAd)videoAdRef.get();
            if (videoad1 != null && VideoAd.access$000(videoad).equals(VideoAd.access$000(videoad1)))
            {
                hasSharedVideoFile = true;
            }
        }
        return super.ack(cachedad);
    }

    void deleteVideoFile(Context context)
    {
        VideoAd videoad = (VideoAd)videoAdRef.get();
        if (videoad != null && AdCache.deleteFile(context, (new StringBuilder()).append(VideoAd.access$000(videoad)).append("video.dat").toString()))
        {
            MMLog.v("VideoAd", String.format("VideoAd video file %s was deleted.", new Object[] {
                VideoAd.access$000(videoad)
            }));
        }
    }

    void done()
    {
        if (!hasSharedVideoFile)
        {
            Context context = (Context)contextRef.get();
            if (context != null)
            {
                deleteVideoFile(context);
            }
        }
        super.deleteVideoFile();
    }

    public (Context context, VideoAd videoad)
    {
        hasSharedVideoFile = false;
        videoAdRef = new WeakReference(videoad);
        contextRef = new WeakReference(context);
    }
}
