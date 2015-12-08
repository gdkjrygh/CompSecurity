// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.video.model.VideoPlayerAdvanceReason;
import com.spotify.mobile.android.video.model.VideoPlayerError;
import com.spotify.mobile.android.video.model.VideoPlayerState;

public interface gkf
    extends dmx
{

    public static final VideoPlayerAdvanceReason a = new VideoPlayerAdvanceReason(com.spotify.mobile.android.video.model.VideoPlayerAdvanceReason.Reason.a, null);
    public static final VideoPlayerAdvanceReason b = new VideoPlayerAdvanceReason(com.spotify.mobile.android.video.model.VideoPlayerAdvanceReason.Reason.b, com.spotify.mobile.android.video.model.VideoPlayerAdvanceReason.UnplayableReason.b);
    public static final VideoPlayerAdvanceReason c = new VideoPlayerAdvanceReason(com.spotify.mobile.android.video.model.VideoPlayerAdvanceReason.Reason.b, com.spotify.mobile.android.video.model.VideoPlayerAdvanceReason.UnplayableReason.c);
    public static final VideoPlayerAdvanceReason d = new VideoPlayerAdvanceReason(com.spotify.mobile.android.video.model.VideoPlayerAdvanceReason.Reason.b, com.spotify.mobile.android.video.model.VideoPlayerAdvanceReason.UnplayableReason.b);
    public static final VideoPlayerAdvanceReason e = new VideoPlayerAdvanceReason(com.spotify.mobile.android.video.model.VideoPlayerAdvanceReason.Reason.b, com.spotify.mobile.android.video.model.VideoPlayerAdvanceReason.UnplayableReason.a);

    public abstract hew a();

    public abstract Boolean a(VideoPlayerAdvanceReason videoplayeradvancereason);

    public abstract Boolean a(VideoPlayerError videoplayererror);

    public abstract Boolean a(VideoPlayerState videoplayerstate);

    public abstract void b();

}
