// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import java.util.Map;

public final class fbn
{

    public static Uri a(PlayerTrack playertrack, Flags flags, long l)
    {
        if (playertrack == null || flags == null)
        {
            return Uri.EMPTY;
        }
        playertrack = ezr.a(playertrack, "media.manifest_id");
        if (TextUtils.isEmpty(playertrack))
        {
            return Uri.EMPTY;
        } else
        {
            return Uri.parse(ggj.a(flags, playertrack, l));
        }
    }

    public static boolean a(PlayerTrack playertrack)
    {
        while (playertrack == null || TextUtils.isEmpty(ezr.a(playertrack, "media.manifest_id")) || TextUtils.isEmpty(ezr.a(playertrack, "media.start_position"))) 
        {
            return false;
        }
        return true;
    }

    public static long b(PlayerTrack playertrack)
    {
        if (!a(playertrack))
        {
            throw new IllegalArgumentException("track does not have a freeze frame!");
        } else
        {
            Assertion.a(playertrack);
            return Long.parseLong(ezr.a(playertrack, "media.start_position"));
        }
    }

    public static Uri c(PlayerTrack playertrack)
    {
        Uri uri;
        if (playertrack == null)
        {
            uri = Uri.EMPTY;
        } else
        {
            Uri uri1 = dto.a(ezr.a(playertrack, "image_large_url"));
            uri = uri1;
            if (Uri.EMPTY.equals(uri1))
            {
                return dto.a((String)playertrack.metadata().get("image_url"));
            }
        }
        return uri;
    }
}
