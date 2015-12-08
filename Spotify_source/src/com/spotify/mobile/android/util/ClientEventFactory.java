// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util;

import android.net.Uri;
import android.text.TextUtils;
import ctz;

// Referenced classes of package com.spotify.mobile.android.util:
//            ClientEvent

public final class ClientEventFactory
{

    public ClientEventFactory()
    {
    }

    public static ClientEvent.SubEvent a(String s)
    {
        ctz.a(s);
        if (TextUtils.isEmpty(s))
        {
            return ClientEvent.SubEvent.a;
        }
        if ("offline_mode".equals(s))
        {
            return ClientEvent.SubEvent.bx;
        }
        if ("private_session".equals(s))
        {
            return ClientEvent.SubEvent.by;
        }
        if ("broadcast_play_state".equals(s))
        {
            return ClientEvent.SubEvent.bm;
        }
        if ("download_over_3g".equals(s))
        {
            return ClientEvent.SubEvent.bn;
        }
        if ("download_quality".equals(s))
        {
            return ClientEvent.SubEvent.bo;
        }
        if ("stream_quality".equals(s))
        {
            return ClientEvent.SubEvent.bB;
        }
        if ("facebook_connected".equals(s))
        {
            return ClientEvent.SubEvent.bp;
        }
        if ("post_to_facebook".equals(s))
        {
            return ClientEvent.SubEvent.bz;
        }
        if ("seconds_to_offline_expiry".equals(s))
        {
            return ClientEvent.SubEvent.bA;
        }
        if ("lastfm_username".equals(s))
        {
            return ClientEvent.SubEvent.bv;
        }
        if ("lastfm_password".equals(s))
        {
            return ClientEvent.SubEvent.bw;
        }
        if ("gapless".equals(s))
        {
            return ClientEvent.SubEvent.bt;
        }
        if ("show_unavailable_tracks".equals(s))
        {
            return ClientEvent.SubEvent.bu;
        }
        if ("crossfade".equals(s))
        {
            return ClientEvent.SubEvent.bq;
        }
        if ("normalize".equals(s))
        {
            return ClientEvent.SubEvent.br;
        }
        if ("crossfade_time_seconds".equals(s))
        {
            return ClientEvent.SubEvent.bs;
        }
        if ("ap".equals(s))
        {
            return ClientEvent.SubEvent.bl;
        } else
        {
            throw new NoMatchingSettingException((new StringBuilder()).append(s).append("not mapped to a ").append(com/spotify/mobile/android/util/ClientEvent$SubEvent.getSimpleName()).toString());
        }
    }

    public static ClientEvent a(Uri uri, long l)
    {
        ClientEvent clientevent = new ClientEvent(ClientEvent.Event.O, ClientEvent.SubEvent.ah);
        clientevent.a("context_uri", uri.toString());
        clientevent.a("row_id", String.valueOf(l));
        return clientevent;
    }

    public static ClientEvent a(String s, ClientEvent.SubEvent subevent, String s1, Long long1)
    {
        subevent = new ClientEvent(ClientEvent.Event.O, subevent);
        if (s1 != null)
        {
            subevent.a("target_uri", s1);
        }
        if (long1 != null)
        {
            subevent.a("index", String.valueOf(long1));
        }
        subevent.a("section", s);
        return subevent;
    }

    public static ClientEvent b(Uri uri, long l)
    {
        ClientEvent clientevent = new ClientEvent(ClientEvent.Event.O, ClientEvent.SubEvent.ai);
        clientevent.a("context_uri", uri.toString());
        clientevent.a("row_id", String.valueOf(l));
        return clientevent;
    }

    private class NoMatchingSettingException extends RuntimeException
    {

        private static final long serialVersionUID = 0x2028cbd5624f4e5cL;

        public NoMatchingSettingException(String s)
        {
            super(s);
        }
    }

}
