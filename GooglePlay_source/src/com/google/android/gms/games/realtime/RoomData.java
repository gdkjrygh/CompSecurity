// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.realtime;

import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.realtime.Room;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.games.realtime:
//            RoomParticipant

public final class RoomData
{

    public final String mCurrentParticipantId;
    public boolean mCurrentParticipantInConnectedSet;
    public final ArrayMap mPeerParticipantIdToParticipantDataMap = new ArrayMap();
    public final ArrayMap mPublicProfileJidToParticipantDataMap = new ArrayMap();
    public final String mRoomId;
    public int mRoomStatus;
    public int mStatusVersion;

    public RoomData(String s, Room room)
    {
        s = room.getParticipantId(s);
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = room.getParticipants();
        int i = 0;
        for (int j = arraylist1.size(); i < j; i++)
        {
            Participant participant = (Participant)arraylist1.get(i);
            arraylist.add(new RoomParticipant(participant.getParticipantId(), participant.getClientAddress(), participant.getStatus(), false, participant.getCapabilities()));
        }

        mRoomId = room.getRoomId();
        mCurrentParticipantId = s;
        mRoomStatus = room.getStatus();
        mCurrentParticipantInConnectedSet = false;
        mStatusVersion = -1;
        fillMaps(arraylist);
    }

    private void fillMaps(ArrayList arraylist)
    {
        int i = 0;
        for (int j = arraylist.size(); i < j; i++)
        {
            RoomParticipant roomparticipant = (RoomParticipant)arraylist.get(i);
            if (roomparticipant.mParticipantId.equals(mCurrentParticipantId))
            {
                continue;
            }
            mPeerParticipantIdToParticipantDataMap.put(roomparticipant.mParticipantId, roomparticipant);
            if (!TextUtils.isEmpty(roomparticipant.mPublicProfileJid))
            {
                mPublicProfileJidToParticipantDataMap.put(roomparticipant.mPublicProfileJid, roomparticipant);
            }
        }

    }

    public final RoomParticipant getPeerParticipantForParticipantId(String s)
    {
        return (RoomParticipant)mPeerParticipantIdToParticipantDataMap.get(s);
    }

    public final RoomParticipant getPeerParticipantForPublicProfileJid(String s)
    {
        return (RoomParticipant)mPublicProfileJidToParticipantDataMap.get(s);
    }

    public final String getPeerParticipantId(String s)
    {
        s = (RoomParticipant)mPublicProfileJidToParticipantDataMap.get(s);
        if (s != null)
        {
            return ((RoomParticipant) (s)).mParticipantId;
        } else
        {
            return null;
        }
    }

    public final ArrayList getPeerParticipants()
    {
        return new ArrayList(mPeerParticipantIdToParticipantDataMap.values());
    }

    public final String getPeerPublicProfileJid(String s)
    {
        RoomParticipant roomparticipant = (RoomParticipant)mPeerParticipantIdToParticipantDataMap.get(s);
        if (roomparticipant == null)
        {
            GamesLog.e("RoomData", (new StringBuilder("Received bad participant ID: ")).append(s).toString());
            return null;
        } else
        {
            return roomparticipant.mPublicProfileJid;
        }
    }

    public final boolean isValidPeerParticipantId(String s)
    {
        return mPeerParticipantIdToParticipantDataMap.containsKey(s);
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        RoomParticipant roomparticipant;
        for (Iterator iterator = mPeerParticipantIdToParticipantDataMap.values().iterator(); iterator.hasNext(); stringbuilder.append(Objects.toStringHelper(roomparticipant).add("participant", roomparticipant.toString()).toString()))
        {
            roomparticipant = (RoomParticipant)iterator.next();
        }

        return Objects.toStringHelper(this).add("mRoomId", mRoomId).add("mCurrentParticipantId", mCurrentParticipantId).add("mRoomStatus", Integer.valueOf(mRoomStatus)).add("mCurrentParticipantInConnectedSet", Boolean.valueOf(mCurrentParticipantInConnectedSet)).add("mStatusVersion", Integer.valueOf(mStatusVersion)).add("mParticipants", stringbuilder.toString()).toString();
    }
}
