// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.TextView;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.spotlets.miniplayer.view.MiniPlayerPageView;
import java.util.Map;

public final class etz
    implements eub
{

    private MiniPlayerPageView a;

    public etz(MiniPlayerPageView miniplayerpageview)
    {
        a = miniplayerpageview;
        super();
    }

    public final void a(PlayerTrack playertrack)
    {
        if (playertrack == null)
        {
            return;
        } else
        {
            MiniPlayerPageView.a(a).setText((CharSequence)playertrack.metadata().get("title"));
            MiniPlayerPageView.d(a).setText(PlayerTrackUtil.getArtists(playertrack));
            MiniPlayerPageView.d(a).setSelected(true);
            return;
        }
    }

    public final String b(PlayerTrack playertrack)
    {
        if (playertrack == null)
        {
            return "";
        } else
        {
            return (String)playertrack.metadata().get("title");
        }
    }
}
