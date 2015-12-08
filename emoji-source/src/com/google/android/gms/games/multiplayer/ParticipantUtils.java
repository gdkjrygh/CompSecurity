// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import com.google.android.gms.games.Player;
import com.google.android.gms.internal.hm;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Participant

public final class ParticipantUtils
{

    private ParticipantUtils()
    {
    }

    public static boolean bn(String s)
    {
        hm.b(s, "Participant ID must not be null");
        return s.startsWith("p_");
    }

    public static String getParticipantId(ArrayList arraylist, String s)
    {
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            Participant participant = (Participant)arraylist.get(i);
            Player player = participant.getPlayer();
            if (player != null && player.getPlayerId().equals(s))
            {
                return participant.getParticipantId();
            }
        }

        return null;
    }
}
