// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.internal.jx;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            RoomConfig, RoomUpdateListener, RoomConfigImpl, RoomStatusUpdateListener, 
//            RealTimeMessageReceivedListener

public static final class <init>
{

    int adW;
    final RoomUpdateListener aeh;
    RoomStatusUpdateListener aei;
    RealTimeMessageReceivedListener aej;
    String aek;
    ArrayList ael;
    Bundle aem;
    boolean aen;

    public <init> addPlayersToInvite(ArrayList arraylist)
    {
        jx.i(arraylist);
        ael.addAll(arraylist);
        return this;
    }

    public transient ael addPlayersToInvite(String as[])
    {
        jx.i(as);
        ael.addAll(Arrays.asList(as));
        return this;
    }

    public RoomConfig build()
    {
        return new RoomConfigImpl(this);
    }

    public t> setAutoMatchCriteria(Bundle bundle)
    {
        aem = bundle;
        return this;
    }

    public aem setInvitationIdToAccept(String s)
    {
        jx.i(s);
        aek = s;
        return this;
    }

    public ivedListener setMessageReceivedListener(RealTimeMessageReceivedListener realtimemessagereceivedlistener)
    {
        aej = realtimemessagereceivedlistener;
        return this;
    }

    public tener setRoomStatusUpdateListener(RoomStatusUpdateListener roomstatusupdatelistener)
    {
        aei = roomstatusupdatelistener;
        return this;
    }

    public aei setSocketCommunicationEnabled(boolean flag)
    {
        aen = flag;
        return this;
    }

    public aen setVariant(int i)
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

    private tener(RoomUpdateListener roomupdatelistener)
    {
        aek = null;
        adW = -1;
        ael = new ArrayList();
        aen = false;
        aeh = (RoomUpdateListener)jx.b(roomupdatelistener, "Must provide a RoomUpdateListener");
    }

    aeh(RoomUpdateListener roomupdatelistener, aeh aeh1)
    {
        this(roomupdatelistener);
    }
}
