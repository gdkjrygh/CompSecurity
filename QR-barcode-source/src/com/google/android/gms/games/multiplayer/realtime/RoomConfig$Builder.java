// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.common.internal.o;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            RoomConfig, RoomUpdateListener, RoomStatusUpdateListener, RealTimeMessageReceivedListener

public static final class <init>
{

    int acd;
    final RoomUpdateListener aco;
    RoomStatusUpdateListener acp;
    RealTimeMessageReceivedListener acq;
    Bundle acs;
    boolean act;
    String acu;
    ArrayList acv;

    public <init> addPlayersToInvite(ArrayList arraylist)
    {
        o.i(arraylist);
        acv.addAll(arraylist);
        return this;
    }

    public transient acv addPlayersToInvite(String as[])
    {
        o.i(as);
        acv.addAll(Arrays.asList(as));
        return this;
    }

    public RoomConfig build()
    {
        return new RoomConfig(this, null);
    }

    public acv setAutoMatchCriteria(Bundle bundle)
    {
        acs = bundle;
        return this;
    }

    public acs setInvitationIdToAccept(String s)
    {
        o.i(s);
        acu = s;
        return this;
    }

    public ivedListener setMessageReceivedListener(RealTimeMessageReceivedListener realtimemessagereceivedlistener)
    {
        acq = realtimemessagereceivedlistener;
        return this;
    }

    public tener setRoomStatusUpdateListener(RoomStatusUpdateListener roomstatusupdatelistener)
    {
        acp = roomstatusupdatelistener;
        return this;
    }

    public acp setSocketCommunicationEnabled(boolean flag)
    {
        act = flag;
        return this;
    }

    public act setVariant(int i)
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

    private tener(RoomUpdateListener roomupdatelistener)
    {
        acu = null;
        acd = -1;
        acv = new ArrayList();
        act = false;
        aco = (RoomUpdateListener)o.b(roomupdatelistener, "Must provide a RoomUpdateListener");
    }

    aco(RoomUpdateListener roomupdatelistener, aco aco1)
    {
        this(roomupdatelistener);
    }
}
