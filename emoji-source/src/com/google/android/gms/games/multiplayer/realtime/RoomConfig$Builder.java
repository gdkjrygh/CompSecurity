// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.internal.hm;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            RoomConfig, RoomUpdateListener, RoomStatusUpdateListener, RealTimeMessageReceivedListener

public static final class <init>
{

    int SY;
    final RoomUpdateListener Tk;
    RoomStatusUpdateListener Tl;
    RealTimeMessageReceivedListener Tm;
    Bundle To;
    boolean Tp;
    String Tq;
    ArrayList Tr;

    public <init> addPlayersToInvite(ArrayList arraylist)
    {
        hm.f(arraylist);
        Tr.addAll(arraylist);
        return this;
    }

    public transient Tr addPlayersToInvite(String as[])
    {
        hm.f(as);
        Tr.addAll(Arrays.asList(as));
        return this;
    }

    public RoomConfig build()
    {
        return new RoomConfig(this, null);
    }

    public Tr setAutoMatchCriteria(Bundle bundle)
    {
        To = bundle;
        return this;
    }

    public To setInvitationIdToAccept(String s)
    {
        hm.f(s);
        Tq = s;
        return this;
    }

    public ivedListener setMessageReceivedListener(RealTimeMessageReceivedListener realtimemessagereceivedlistener)
    {
        Tm = realtimemessagereceivedlistener;
        return this;
    }

    public tener setRoomStatusUpdateListener(RoomStatusUpdateListener roomstatusupdatelistener)
    {
        Tl = roomstatusupdatelistener;
        return this;
    }

    public Tl setSocketCommunicationEnabled(boolean flag)
    {
        Tp = flag;
        return this;
    }

    public Tp setVariant(int i)
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

    private tener(RoomUpdateListener roomupdatelistener)
    {
        Tq = null;
        SY = -1;
        Tr = new ArrayList();
        Tp = false;
        Tk = (RoomUpdateListener)hm.b(roomupdatelistener, "Must provide a RoomUpdateListener");
    }

    Tk(RoomUpdateListener roomupdatelistener, Tk tk)
    {
        this(roomupdatelistener);
    }
}
