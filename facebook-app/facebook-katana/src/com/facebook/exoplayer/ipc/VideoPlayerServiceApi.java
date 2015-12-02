// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.exoplayer.ipc;

import android.net.Uri;
import android.os.IInterface;
import android.view.Surface;
import java.util.Map;

// Referenced classes of package com.facebook.exoplayer.ipc:
//            VideoPlayerSession, VideoPlayRequest, MediaRenderer, VideoPlayerServiceListener

public interface VideoPlayerServiceApi
    extends IInterface
{

    public abstract int a(VideoPlayerSession videoplayersession);

    public abstract VideoPlayerSession a(String s, VideoPlayRequest videoplayrequest);

    public abstract void a(Uri uri);

    public abstract void a(VideoPlayerSession videoplayersession, long l);

    public abstract void a(VideoPlayerSession videoplayersession, Uri uri);

    public abstract void a(VideoPlayerSession videoplayersession, MediaRenderer mediarenderer, float f1);

    public abstract void a(VideoPlayerSession videoplayersession, MediaRenderer mediarenderer, Surface surface);

    public abstract void a(VideoPlayerSession videoplayersession, MediaRenderer mediarenderer, MediaRenderer mediarenderer1);

    public abstract void a(VideoPlayerSession videoplayersession, MediaRenderer mediarenderer, boolean flag);

    public abstract void a(VideoPlayerSession videoplayersession, VideoPlayerServiceListener videoplayerservicelistener);

    public abstract void a(VideoPlayerSession videoplayersession, boolean flag);

    public abstract void a(Map map);

    public abstract void b(VideoPlayerSession videoplayersession, VideoPlayerServiceListener videoplayerservicelistener);

    public abstract void b(VideoPlayerSession videoplayersession, boolean flag);

    public abstract boolean b(VideoPlayerSession videoplayersession);

    public abstract void c(VideoPlayerSession videoplayersession);

    public abstract long d(VideoPlayerSession videoplayersession);

    public abstract long e(VideoPlayerSession videoplayersession);

    public abstract long f(VideoPlayerSession videoplayersession);

    public abstract int g(VideoPlayerSession videoplayersession);
}
