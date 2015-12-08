// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.internal.dm;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            RoomConfig, RoomUpdateListener, RoomStatusUpdateListener, RealTimeMessageReceivedListener

public static final class <init>
{

    int nR;
    final RoomUpdateListener od;
    RoomStatusUpdateListener oe;
    RealTimeMessageReceivedListener of;
    Bundle oh;
    boolean oi;
    String oj;
    ArrayList ok;

    public <init> addPlayersToInvite(ArrayList arraylist)
    {
        dm.e(arraylist);
        ok.addAll(arraylist);
        return this;
    }

    public transient ok addPlayersToInvite(String as[])
    {
        dm.e(as);
        ok.addAll(Arrays.asList(as));
        return this;
    }

    public RoomConfig build()
    {
        return new RoomConfig(this, null);
    }

    public ok setAutoMatchCriteria(Bundle bundle)
    {
        oh = bundle;
        return this;
    }

    public oh setInvitationIdToAccept(String s)
    {
        dm.e(s);
        oj = s;
        return this;
    }

    public ivedListener setMessageReceivedListener(RealTimeMessageReceivedListener realtimemessagereceivedlistener)
    {
        of = realtimemessagereceivedlistener;
        return this;
    }

    public tener setRoomStatusUpdateListener(RoomStatusUpdateListener roomstatusupdatelistener)
    {
        oe = roomstatusupdatelistener;
        return this;
    }

    public oe setSocketCommunicationEnabled(boolean flag)
    {
        oi = flag;
        return this;
    }

    public oi setVariant(int i)
    {
        nR = i;
        return this;
    }

    private tener(RoomUpdateListener roomupdatelistener)
    {
        oj = null;
        nR = -1;
        ok = new ArrayList();
        oi = false;
        od = (RoomUpdateListener)dm.a(roomupdatelistener, "Must provide a RoomUpdateListener");
    }

    od(RoomUpdateListener roomupdatelistener, od od1)
    {
        this(roomupdatelistener);
    }
}
