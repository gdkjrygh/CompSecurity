// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.internal.jx;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            RoomUpdateListener, RealTimeMessageReceivedListener, RoomStatusUpdateListener, RoomConfigImpl

public abstract class RoomConfig
{
    public static final class Builder
    {

        int adW;
        final RoomUpdateListener aeh;
        RoomStatusUpdateListener aei;
        RealTimeMessageReceivedListener aej;
        String aek;
        ArrayList ael;
        Bundle aem;
        boolean aen;

        public Builder addPlayersToInvite(ArrayList arraylist)
        {
            jx.i(arraylist);
            ael.addAll(arraylist);
            return this;
        }

        public transient Builder addPlayersToInvite(String as[])
        {
            jx.i(as);
            ael.addAll(Arrays.asList(as));
            return this;
        }

        public RoomConfig build()
        {
            return new RoomConfigImpl(this);
        }

        public Builder setAutoMatchCriteria(Bundle bundle)
        {
            aem = bundle;
            return this;
        }

        public Builder setInvitationIdToAccept(String s)
        {
            jx.i(s);
            aek = s;
            return this;
        }

        public Builder setMessageReceivedListener(RealTimeMessageReceivedListener realtimemessagereceivedlistener)
        {
            aej = realtimemessagereceivedlistener;
            return this;
        }

        public Builder setRoomStatusUpdateListener(RoomStatusUpdateListener roomstatusupdatelistener)
        {
            aei = roomstatusupdatelistener;
            return this;
        }

        public Builder setSocketCommunicationEnabled(boolean flag)
        {
            aen = flag;
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
            jx.b(flag, "Variant must be a positive integer or Room.ROOM_VARIANT_ANY");
            adW = i;
            return this;
        }

        private Builder(RoomUpdateListener roomupdatelistener)
        {
            aek = null;
            adW = -1;
            ael = new ArrayList();
            aen = false;
            aeh = (RoomUpdateListener)jx.b(roomupdatelistener, "Must provide a RoomUpdateListener");
        }

    }


    protected RoomConfig()
    {
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

    public abstract Bundle getAutoMatchCriteria();

    public abstract String getInvitationId();

    public abstract String[] getInvitedPlayerIds();

    public abstract RealTimeMessageReceivedListener getMessageReceivedListener();

    public abstract RoomStatusUpdateListener getRoomStatusUpdateListener();

    public abstract RoomUpdateListener getRoomUpdateListener();

    public abstract int getVariant();

    public abstract boolean isSocketEnabled();
}
