// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.common.internal.o;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            RoomUpdateListener, RoomStatusUpdateListener, RealTimeMessageReceivedListener

public final class RoomConfig
{
    public static final class Builder
    {

        int acd;
        final RoomUpdateListener aco;
        RoomStatusUpdateListener acp;
        RealTimeMessageReceivedListener acq;
        Bundle acs;
        boolean act;
        String acu;
        ArrayList acv;

        public Builder addPlayersToInvite(ArrayList arraylist)
        {
            o.i(arraylist);
            acv.addAll(arraylist);
            return this;
        }

        public transient Builder addPlayersToInvite(String as[])
        {
            o.i(as);
            acv.addAll(Arrays.asList(as));
            return this;
        }

        public RoomConfig build()
        {
            return new RoomConfig(this);
        }

        public Builder setAutoMatchCriteria(Bundle bundle)
        {
            acs = bundle;
            return this;
        }

        public Builder setInvitationIdToAccept(String s)
        {
            o.i(s);
            acu = s;
            return this;
        }

        public Builder setMessageReceivedListener(RealTimeMessageReceivedListener realtimemessagereceivedlistener)
        {
            acq = realtimemessagereceivedlistener;
            return this;
        }

        public Builder setRoomStatusUpdateListener(RoomStatusUpdateListener roomstatusupdatelistener)
        {
            acp = roomstatusupdatelistener;
            return this;
        }

        public Builder setSocketCommunicationEnabled(boolean flag)
        {
            act = flag;
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
            o.b(flag, "Variant must be a positive integer or Room.ROOM_VARIANT_ANY");
            acd = i;
            return this;
        }

        private Builder(RoomUpdateListener roomupdatelistener)
        {
            acu = null;
            acd = -1;
            acv = new ArrayList();
            act = false;
            aco = (RoomUpdateListener)o.b(roomupdatelistener, "Must provide a RoomUpdateListener");
        }

    }


    private final String WO;
    private final int acd;
    private final RoomUpdateListener aco;
    private final RoomStatusUpdateListener acp;
    private final RealTimeMessageReceivedListener acq;
    private final String acr[];
    private final Bundle acs;
    private final boolean act;

    private RoomConfig(Builder builder1)
    {
        aco = builder1.aco;
        acp = builder1.acp;
        acq = builder1.acq;
        WO = builder1.acu;
        acd = builder1.acd;
        acs = builder1.acs;
        act = builder1.act;
        int i = builder1.acv.size();
        acr = (String[])builder1.acv.toArray(new String[i]);
        if (acq == null)
        {
            o.a(act, "Must either enable sockets OR specify a message listener");
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
        return acs;
    }

    public String getInvitationId()
    {
        return WO;
    }

    public String[] getInvitedPlayerIds()
    {
        return acr;
    }

    public RealTimeMessageReceivedListener getMessageReceivedListener()
    {
        return acq;
    }

    public RoomStatusUpdateListener getRoomStatusUpdateListener()
    {
        return acp;
    }

    public RoomUpdateListener getRoomUpdateListener()
    {
        return aco;
    }

    public int getVariant()
    {
        return acd;
    }

    public boolean isSocketEnabled()
    {
        return act;
    }
}
