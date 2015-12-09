// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.internal.fq;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            RoomUpdateListener, RoomStatusUpdateListener, RealTimeMessageReceivedListener

public final class RoomConfig
{
    public static final class Builder
    {

        final RoomUpdateListener MK;
        RoomStatusUpdateListener ML;
        RealTimeMessageReceivedListener MM;
        Bundle MO;
        boolean MP;
        String MQ;
        ArrayList MR;
        int My;

        public Builder addPlayersToInvite(ArrayList arraylist)
        {
            fq.f(arraylist);
            MR.addAll(arraylist);
            return this;
        }

        public transient Builder addPlayersToInvite(String as[])
        {
            fq.f(as);
            MR.addAll(Arrays.asList(as));
            return this;
        }

        public RoomConfig build()
        {
            return new RoomConfig(this);
        }

        public Builder setAutoMatchCriteria(Bundle bundle)
        {
            MO = bundle;
            return this;
        }

        public Builder setInvitationIdToAccept(String s)
        {
            fq.f(s);
            MQ = s;
            return this;
        }

        public Builder setMessageReceivedListener(RealTimeMessageReceivedListener realtimemessagereceivedlistener)
        {
            MM = realtimemessagereceivedlistener;
            return this;
        }

        public Builder setRoomStatusUpdateListener(RoomStatusUpdateListener roomstatusupdatelistener)
        {
            ML = roomstatusupdatelistener;
            return this;
        }

        public Builder setSocketCommunicationEnabled(boolean flag)
        {
            MP = flag;
            return this;
        }

        public Builder setVariant(int i)
        {
            boolean flag;
            if (i == -1 || i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            fq.b(flag, "Variant must be a positive integer or Room.ROOM_VARIANT_ANY");
            My = i;
            return this;
        }

        private Builder(RoomUpdateListener roomupdatelistener)
        {
            MQ = null;
            My = -1;
            MR = new ArrayList();
            MP = false;
            MK = (RoomUpdateListener)fq.b(roomupdatelistener, "Must provide a RoomUpdateListener");
        }

    }


    private final String IV;
    private final RoomUpdateListener MK;
    private final RoomStatusUpdateListener ML;
    private final RealTimeMessageReceivedListener MM;
    private final String MN[];
    private final Bundle MO;
    private final boolean MP;
    private final int My;

    private RoomConfig(Builder builder1)
    {
        MK = builder1.MK;
        ML = builder1.ML;
        MM = builder1.MM;
        IV = builder1.MQ;
        My = builder1.My;
        MO = builder1.MO;
        MP = builder1.MP;
        int i = builder1.MR.size();
        MN = (String[])builder1.MR.toArray(new String[i]);
        if (MM == null)
        {
            fq.a(MP, "Must either enable sockets OR specify a message listener");
        }
    }


    public static Builder builder(RoomUpdateListener roomupdatelistener)
    {
        return new Builder(roomupdatelistener);
    }

    public static Bundle createAutoMatchCriteria(int i, int j, long l)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("min_automatch_players", i);
        bundle.putInt("max_automatch_players", j);
        bundle.putLong("exclusive_bit_mask", l);
        return bundle;
    }

    public Bundle getAutoMatchCriteria()
    {
        return MO;
    }

    public String getInvitationId()
    {
        return IV;
    }

    public String[] getInvitedPlayerIds()
    {
        return MN;
    }

    public RealTimeMessageReceivedListener getMessageReceivedListener()
    {
        return MM;
    }

    public RoomStatusUpdateListener getRoomStatusUpdateListener()
    {
        return ML;
    }

    public RoomUpdateListener getRoomUpdateListener()
    {
        return MK;
    }

    public int getVariant()
    {
        return My;
    }

    public boolean isSocketEnabled()
    {
        return MP;
    }
}
