// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import java.util.Map;

public final class fag
{

    public static boolean a(PlayerState playerstate)
    {
        return "true".equals(playerstate.contextMetadata().get("is_loading"));
    }

    public static boolean b(PlayerState playerstate)
    {
        return !playerstate.isPlaying() && !a(playerstate);
    }
}
