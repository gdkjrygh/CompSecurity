// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.exoplayer;

import android.util.LruCache;
import com.facebook.exoplayer.ipc.VideoPlayerSession;
import java.util.List;

// Referenced classes of package com.facebook.exoplayer:
//            VideoPlayerService

class a extends LruCache
{

    final VideoPlayerService a;

    private void a(boolean flag, VideoPlayerSession videoplayersession)
    {
        if (flag)
        {
            synchronized (VideoPlayerService.a(a))
            {
                VideoPlayerService.b(a).add(videoplayersession);
            }
            return;
        } else
        {
            return;
        }
        videoplayersession;
        hashmap;
        JVM INSTR monitorexit ;
        throw videoplayersession;
    }

    protected void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
    {
        a(flag, (VideoPlayerSession)obj1);
    }

    n(VideoPlayerService videoplayerservice, int i)
    {
        a = videoplayerservice;
        super(i);
    }
}
