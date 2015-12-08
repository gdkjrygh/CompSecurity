// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;


// Referenced classes of package com.millennialmedia.android:
//            PreCacheWorker, AdCache, DTOCachedVideo, CachedAd

class val.cachedVideo
    implements skListener
{

    final PreCacheWorker this$0;
    final DTOCachedVideo val$cachedVideo;

    public void downloadCompleted(CachedAd cachedad, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        AdCache.save(PreCacheWorker.access$000(PreCacheWorker.this), cachedad);
        PreCacheWorker.access$102(PreCacheWorker.this, true);
        ent(val$cachedVideo.preCacheCompleteURL);
_L1:
        notify();
        this;
        JVM INSTR monitorexit ;
        return;
        ent(val$cachedVideo.preCacheFailedURL);
          goto _L1
        cachedad;
        throw cachedad;
    }

    public void downloadStart(CachedAd cachedad)
    {
        ent(val$cachedVideo.preCacheStartURL);
    }

    skListener()
    {
        this$0 = final_precacheworker;
        val$cachedVideo = DTOCachedVideo.this;
        super();
    }
}
