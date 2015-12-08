// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.Map;

final class fbt
{

    PlayerTrack a;
    Uri b;

    fbt()
    {
    }

    fbt(PlayerState playerstate)
    {
        b = Uri.parse((String)playerstate.track().metadata().get("click_url"));
        a = playerstate.track();
    }

    public final boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        obj = (fbt)obj;
        if (a == null ? ((fbt) (obj)).a != null : !a.equals(((fbt) (obj)).a))
        {
            return false;
        }
        if (b == null) goto _L4; else goto _L3
_L3:
        if (b.equals(((fbt) (obj)).b)) goto _L1; else goto _L5
_L5:
        return false;
_L4:
        if (((fbt) (obj)).b == null)
        {
            return true;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (a != null)
        {
            i = a.hashCode();
        } else
        {
            i = 0;
        }
        if (b != null)
        {
            j = b.hashCode();
        }
        return i * 31 + j;
    }
}
