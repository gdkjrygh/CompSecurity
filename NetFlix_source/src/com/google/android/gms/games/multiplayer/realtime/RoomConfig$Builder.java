// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.internal.fq;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            RoomConfig, RoomUpdateListener, RoomStatusUpdateListener, RealTimeMessageReceivedListener

public static final class <init>
{

    final RoomUpdateListener MK;
    RoomStatusUpdateListener ML;
    RealTimeMessageReceivedListener MM;
    Bundle MO;
    boolean MP;
    String MQ;
    ArrayList MR;
    int My;

    public <init> addPlayersToInvite(ArrayList arraylist)
    {
        fq.f(arraylist);
        MR.addAll(arraylist);
        return this;
    }

    public transient MR addPlayersToInvite(String as[])
    {
        fq.f(as);
        MR.addAll(Arrays.asList(as));
        return this;
    }

    public RoomConfig build()
    {
        return new RoomConfig(this, null);
    }

    public MR setAutoMatchCriteria(Bundle bundle)
    {
        MO = bundle;
        return this;
    }

    public MO setInvitationIdToAccept(String s)
    {
        fq.f(s);
        MQ = s;
        return this;
    }

    public ivedListener setMessageReceivedListener(RealTimeMessageReceivedListener realtimemessagereceivedlistener)
    {
        MM = realtimemessagereceivedlistener;
        return this;
    }

    public tener setRoomStatusUpdateListener(RoomStatusUpdateListener roomstatusupdatelistener)
    {
        ML = roomstatusupdatelistener;
        return this;
    }

    public ML setSocketCommunicationEnabled(boolean flag)
    {
        MP = flag;
        return this;
    }

    public MP setVariant(int i)
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

    private tener(RoomUpdateListener roomupdatelistener)
    {
        MQ = null;
        My = -1;
        MR = new ArrayList();
        MP = false;
        MK = (RoomUpdateListener)fq.b(roomupdatelistener, "Must provide a RoomUpdateListener");
    }

    MK(RoomUpdateListener roomupdatelistener, MK mk)
    {
        this(roomupdatelistener);
    }
}
