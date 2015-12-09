// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.ads.model.AdEvent;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.ViewUri;

public class edt
    implements com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver, dmx
{

    AdEvent a;
    private edu b;
    private Context c;

    public edt(Context context)
    {
        c = context;
    }

    private void a()
    {
        ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.ap, com.spotify.mobile.android.util.ClientEvent.SubEvent.dv);
        dmz.a(fop);
        fop.a(c, ViewUri.bN, clientevent);
    }

    public void onPlayerStateReceived(PlayerState playerstate)
    {
label0:
        {
            ctz.a(playerstate);
            boolean flag = Boolean.parseBoolean(ezr.a(playerstate, "is_advertisement"));
            String s = ezr.a(playerstate, "ad_type");
            Object obj = s;
            if (TextUtils.isEmpty(s))
            {
                obj = "0";
            }
            obj = com.spotify.mobile.android.provider.Metadata.Track.AdType.values()[Integer.parseInt(((String) (obj)))];
            playerstate = playerstate.track();
            if (playerstate != null)
            {
                playerstate = playerstate.uri();
            } else
            {
                playerstate = "";
            }
            obj = new edu(flag, ((com.spotify.mobile.android.provider.Metadata.Track.AdType) (obj)), playerstate);
            if (TextUtils.isEmpty(playerstate) || ((edu) (obj)).equals(b))
            {
                break label0;
            }
            if (b != null)
            {
                if (((edu) (obj)).b == com.spotify.mobile.android.provider.Metadata.Track.AdType.a && b.b == com.spotify.mobile.android.provider.Metadata.Track.AdType.a)
                {
                    break label0;
                }
                if (b.a && b.b.equals(com.spotify.mobile.android.provider.Metadata.Track.AdType.a))
                {
                    if (a == null)
                    {
                        Logger.c("we have no offer ad event - so nothing to match on : %s", new Object[] {
                            b
                        });
                        a();
                    } else
                    if (!b.c.contains(a.getAd().getId()))
                    {
                        Logger.c("we have an offer ad event BUT it does not match : %s, %s", new Object[] {
                            b, a
                        });
                        a();
                    } else
                    {
                        a = null;
                    }
                }
            }
            b = ((edu) (obj));
        }
    }
}
