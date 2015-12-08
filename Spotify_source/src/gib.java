// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.Map;

public final class gib
{

    public static String a(PlayerTrack playertrack)
    {
        if (playertrack == null)
        {
            return "(PlayerTrack) NULL";
        } else
        {
            StringBuilder stringbuilder = new StringBuilder();
            String s = Integer.toHexString(playertrack.hashCode());
            String s1 = (String)playertrack.metadata().get("title");
            playertrack = (String)playertrack.metadata().get("artist_name");
            stringbuilder.append("0x").append(s).append(" : ").append(s1).append(" - ").append(playertrack).append('\n');
            return stringbuilder.toString();
        }
    }

    public static void a(String s, PlayerTrack aplayertrack[], PlayerTrack playertrack, PlayerTrack aplayertrack1[])
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append(s).append(": \n");
        int i;
        int j;
        int k;
        if (aplayertrack == null)
        {
            i = 0;
        } else
        {
            i = aplayertrack.length;
        }
        k = 0;
        for (j = 0; k < i; j++)
        {
            a(stringbuilder, j, aplayertrack[k], false);
            k++;
        }

        i = j;
        if (playertrack != null)
        {
            a(stringbuilder, j, playertrack, true);
            i = j + 1;
        }
        if (aplayertrack1 == null)
        {
            j = 0;
        } else
        {
            j = aplayertrack1.length;
        }
        for (k = 0; k < j; k++)
        {
            a(stringbuilder, i, aplayertrack1[k], false);
            i++;
        }

    }

    private static void a(StringBuilder stringbuilder, int i, PlayerTrack playertrack, boolean flag)
    {
        String s;
        if (flag)
        {
            s = "->";
        } else
        {
            s = "| ";
        }
        stringbuilder.append(s);
        stringbuilder.append(i).append(": ").append(a(playertrack));
    }
}
