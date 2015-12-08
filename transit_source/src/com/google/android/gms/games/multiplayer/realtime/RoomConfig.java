// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.internal.dm;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            RoomUpdateListener, RoomStatusUpdateListener, RealTimeMessageReceivedListener

public final class RoomConfig
{
    public static final class Builder
    {

        int nR;
        final RoomUpdateListener od;
        RoomStatusUpdateListener oe;
        RealTimeMessageReceivedListener of;
        Bundle oh;
        boolean oi;
        String oj;
        ArrayList ok;

        public Builder addPlayersToInvite(ArrayList arraylist)
        {
            dm.e(arraylist);
            ok.addAll(arraylist);
            return this;
        }

        public transient Builder addPlayersToInvite(String as[])
        {
            dm.e(as);
            ok.addAll(Arrays.asList(as));
            return this;
        }

        public RoomConfig build()
        {
            return new RoomConfig(this);
        }

        public Builder setAutoMatchCriteria(Bundle bundle)
        {
            oh = bundle;
            return this;
        }

        public Builder setInvitationIdToAccept(String s)
        {
            dm.e(s);
            oj = s;
            return this;
        }

        public Builder setMessageReceivedListener(RealTimeMessageReceivedListener realtimemessagereceivedlistener)
        {
            of = realtimemessagereceivedlistener;
            return this;
        }

        public Builder setRoomStatusUpdateListener(RoomStatusUpdateListener roomstatusupdatelistener)
        {
            oe = roomstatusupdatelistener;
            return this;
        }

        public Builder setSocketCommunicationEnabled(boolean flag)
        {
            oi = flag;
            return this;
        }

        public Builder setVariant(int i)
        {
            nR = i;
            return this;
        }

        private Builder(RoomUpdateListener roomupdatelistener)
        {
            oj = null;
            nR = -1;
            ok = new ArrayList();
            oi = false;
            od = (RoomUpdateListener)dm.a(roomupdatelistener, "Must provide a RoomUpdateListener");
        }

    }


    private final String nM;
    private final int nR;
    private final RoomUpdateListener od;
    private final RoomStatusUpdateListener oe;
    private final RealTimeMessageReceivedListener of;
    private final String og[];
    private final Bundle oh;
    private final boolean oi;

    private RoomConfig(Builder builder1)
    {
        od = builder1.od;
        oe = builder1.oe;
        of = builder1.of;
        nM = builder1.oj;
        nR = builder1.nR;
        oh = builder1.oh;
        oi = builder1.oi;
        int i = builder1.ok.size();
        og = (String[])builder1.ok.toArray(new String[i]);
        if (of == null)
        {
            dm.a(oi, "Must either enable sockets OR specify a message listener");
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
        return oh;
    }

    public String getInvitationId()
    {
        return nM;
    }

    public String[] getInvitedPlayerIds()
    {
        return og;
    }

    public RealTimeMessageReceivedListener getMessageReceivedListener()
    {
        return of;
    }

    public RoomStatusUpdateListener getRoomStatusUpdateListener()
    {
        return oe;
    }

    public RoomUpdateListener getRoomUpdateListener()
    {
        return od;
    }

    public int getVariant()
    {
        return nR;
    }

    public boolean isSocketEnabled()
    {
        return oi;
    }
}
