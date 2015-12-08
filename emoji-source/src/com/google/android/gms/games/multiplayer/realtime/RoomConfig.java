// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.internal.hm;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            RoomUpdateListener, RoomStatusUpdateListener, RealTimeMessageReceivedListener

public final class RoomConfig
{
    public static final class Builder
    {

        int SY;
        final RoomUpdateListener Tk;
        RoomStatusUpdateListener Tl;
        RealTimeMessageReceivedListener Tm;
        Bundle To;
        boolean Tp;
        String Tq;
        ArrayList Tr;

        public Builder addPlayersToInvite(ArrayList arraylist)
        {
            hm.f(arraylist);
            Tr.addAll(arraylist);
            return this;
        }

        public transient Builder addPlayersToInvite(String as[])
        {
            hm.f(as);
            Tr.addAll(Arrays.asList(as));
            return this;
        }

        public RoomConfig build()
        {
            return new RoomConfig(this);
        }

        public Builder setAutoMatchCriteria(Bundle bundle)
        {
            To = bundle;
            return this;
        }

        public Builder setInvitationIdToAccept(String s)
        {
            hm.f(s);
            Tq = s;
            return this;
        }

        public Builder setMessageReceivedListener(RealTimeMessageReceivedListener realtimemessagereceivedlistener)
        {
            Tm = realtimemessagereceivedlistener;
            return this;
        }

        public Builder setRoomStatusUpdateListener(RoomStatusUpdateListener roomstatusupdatelistener)
        {
            Tl = roomstatusupdatelistener;
            return this;
        }

        public Builder setSocketCommunicationEnabled(boolean flag)
        {
            Tp = flag;
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
            hm.b(flag, "Variant must be a positive integer or Room.ROOM_VARIANT_ANY");
            SY = i;
            return this;
        }

        private Builder(RoomUpdateListener roomupdatelistener)
        {
            Tq = null;
            SY = -1;
            Tr = new ArrayList();
            Tp = false;
            Tk = (RoomUpdateListener)hm.b(roomupdatelistener, "Must provide a RoomUpdateListener");
        }

    }


    private final String NQ;
    private final int SY;
    private final RoomUpdateListener Tk;
    private final RoomStatusUpdateListener Tl;
    private final RealTimeMessageReceivedListener Tm;
    private final String Tn[];
    private final Bundle To;
    private final boolean Tp;

    private RoomConfig(Builder builder1)
    {
        Tk = builder1.Tk;
        Tl = builder1.Tl;
        Tm = builder1.Tm;
        NQ = builder1.Tq;
        SY = builder1.SY;
        To = builder1.To;
        Tp = builder1.Tp;
        int i = builder1.Tr.size();
        Tn = (String[])builder1.Tr.toArray(new String[i]);
        if (Tm == null)
        {
            hm.a(Tp, "Must either enable sockets OR specify a message listener");
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
        return To;
    }

    public String getInvitationId()
    {
        return NQ;
    }

    public String[] getInvitedPlayerIds()
    {
        return Tn;
    }

    public RealTimeMessageReceivedListener getMessageReceivedListener()
    {
        return Tm;
    }

    public RoomStatusUpdateListener getRoomStatusUpdateListener()
    {
        return Tl;
    }

    public RoomUpdateListener getRoomUpdateListener()
    {
        return Tk;
    }

    public int getVariant()
    {
        return SY;
    }

    public boolean isSocketEnabled()
    {
        return Tp;
    }
}
