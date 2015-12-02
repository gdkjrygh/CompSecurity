// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.exoplayer.ipc;

import android.os.IInterface;
import java.util.List;

// Referenced classes of package com.facebook.exoplayer.ipc:
//            VideoPlayerStreamFormat, MediaRenderer, VideoPlayerStreamEvaluation

public interface VideoPlayerServiceListener
    extends IInterface
{

    public abstract void a();

    public abstract void a(int i, int j, float f);

    public abstract void a(int i, VideoPlayerStreamFormat videoplayerstreamformat, int j, int k, long l);

    public abstract void a(MediaRenderer mediarenderer, MediaRenderer mediarenderer1, String s);

    public abstract void a(String s, String s1);

    public abstract void a(List list, long l, VideoPlayerStreamFormat avideoplayerstreamformat[], VideoPlayerStreamEvaluation videoplayerstreamevaluation);

    public abstract void a(boolean flag, int i, int j);

    public abstract void b();
}
