// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.videoplayer.FullscreenVideoActivity;
import com.spotify.mobile.android.spotlets.videoplayer.VideoActivityConfig;
import com.spotify.music.spotlets.FeatureIdentifier;

public final class flo
{

    public boolean a;
    public boolean b;
    public PlayerState c;
    private final Context d;
    private int e;
    private int f;
    private int g;

    private flo(Context context)
    {
        d = context;
        e = com.spotify.mobile.android.spotlets.videoplayer.VideoActivityActions.OnRotateAction.a.ordinal();
        f = com.spotify.mobile.android.spotlets.videoplayer.VideoActivityActions.OnTapVideoAction.a.ordinal();
        g = com.spotify.mobile.android.spotlets.videoplayer.VideoActivityActions.OnTapVideoAction.a.ordinal();
        a = false;
        b = true;
    }

    public static flo a(Context context)
    {
        return new flo(context);
    }

    public final flo a()
    {
        e = com.spotify.mobile.android.spotlets.videoplayer.VideoActivityActions.OnRotateAction.b.ordinal();
        return this;
    }

    public final void a(FeatureIdentifier featureidentifier)
    {
        Intent intent = new Intent(d, com/spotify/mobile/android/spotlets/videoplayer/FullscreenVideoActivity);
        intent.putExtra("video_activity_config", new VideoActivityConfig(e, f, g, a, b));
        intent.putExtra("video_activity_player_state", c);
        gnl.a(intent, featureidentifier);
        d.startActivity(intent);
    }

    public final flo b()
    {
        f = com.spotify.mobile.android.spotlets.videoplayer.VideoActivityActions.OnTapVideoAction.b.ordinal();
        return this;
    }
}
