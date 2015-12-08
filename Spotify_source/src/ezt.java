// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.Map;

final class ezt
{

    final String a;
    final String b;
    final String c;
    final String d;
    final String e;
    final String f;
    final String g;
    final PlayerState h;

    ezt(PlayerState playerstate, String s)
    {
        boolean flag1 = true;
        super();
        h = playerstate;
        Object obj = playerstate.playOrigin().viewUri();
        boolean flag;
        if (obj == null)
        {
            obj = "";
        }
        a = (String)obj;
        playerstate.entityUri();
        obj = ezr.a(playerstate, "mft.injection_source");
        if (obj == null)
        {
            obj = "";
        }
        if (!TextUtils.isEmpty((String)obj))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = playerstate.track();
        if (obj == null || !((PlayerTrack) (obj)).metadata().containsKey("is_queued"))
        {
            flag1 = false;
        }
        if (flag || flag1)
        {
            obj = "";
        } else
        {
            obj = a;
        }
        b = ((String) (obj));
        f = ezr.a(playerstate, "album_title");
        g = ezr.a(playerstate, "artist_name");
        c = ezr.b(playerstate, "context_description");
        d = ezr.b(playerstate, "context_owner");
        e = s;
    }

    static ezs a(faj faj, faj faj1, String s)
    {
        return new ezs(faj, faj1, s);
    }

    final ezs a(faj faj, faj faj1)
    {
        return new ezs(faj, faj1, b);
    }
}
