// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.android.paste.widget.CheckableImageButton;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.player.views.TrackInfoView;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.SpotifyLink;

public final class fcm extends fbe
{

    private final fae f;

    public fcm(fae fae1, Player player, ezh ezh, fbf fbf, Flags flags)
    {
        super(fae1, player, ezh, fbf, flags);
        f = fae1;
    }

    public final void a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        super.a(layoutinflater, viewgroup);
        f.a(false);
        super.a.a.setVisibility(4);
        super.a.b.setVisibility(4);
    }

    public final void a(ViewGroup viewgroup)
    {
        super.a(viewgroup);
        f.a(true);
    }

    public final void onPlayerStateReceived(PlayerState playerstate)
    {
        super.onPlayerStateReceived(playerstate);
        playerstate = new SpotifyLink(playerstate.entityUri());
        boolean flag;
        if (((SpotifyLink) (playerstate)).c == com.spotify.mobile.android.util.SpotifyLink.LinkType.aF)
        {
            flag = "original-content".equals(playerstate.a(2));
        } else
        {
            flag = false;
        }
        f.a(flag);
    }
}
