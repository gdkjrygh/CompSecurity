// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;

final class fay
    implements gjy
{

    private final PlayerTrack a;
    private fax b;

    fay(PlayerTrack playertrack, fax fax1)
    {
        b = fax1;
        a = (PlayerTrack)ctz.a(playertrack);
    }

    public final boolean a(PlayerTrack playertrack)
    {
        ctz.a(playertrack);
        dgz dgz1 = (dgz)b.a.getTag(0x7f1100e1);
        return PlayerTrackUtil.areUidsEqual(a, playertrack) && dgz1.a();
    }
}
