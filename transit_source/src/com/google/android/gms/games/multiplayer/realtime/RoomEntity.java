// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.en;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            Room, b

public final class RoomEntity extends en
    implements Room
{
    static final class a extends b
    {

        public Object createFromParcel(Parcel parcel)
        {
            return y(parcel);
        }

        public RoomEntity y(Parcel parcel)
        {
            if (RoomEntity.b(RoomEntity.bQ()) || RoomEntity.J(com/google/android/gms/games/multiplayer/realtime/RoomEntity.getCanonicalName()))
            {
                return super.y(parcel);
            }
            String s = parcel.readString();
            String s1 = parcel.readString();
            long l1 = parcel.readLong();
            int j = parcel.readInt();
            String s2 = parcel.readString();
            int k = parcel.readInt();
            Bundle bundle = parcel.readBundle();
            int l = parcel.readInt();
            ArrayList arraylist = new ArrayList(l);
            for (int i = 0; i < l; i++)
            {
                arraylist.add(ParticipantEntity.CREATOR.createFromParcel(parcel));
            }

            return new RoomEntity(2, s, s1, l1, j, s2, k, bundle, arraylist, -1);
        }

        a()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final int iM;
    private final String mo;
    private final long nN;
    private final ArrayList nQ;
    private final int nR;
    private final String nb;
    private final Bundle oh;
    private final String ol;
    private final int om;
    private final int on;

    RoomEntity(int i, String s, String s1, long l, int j, String s2, 
            int k, Bundle bundle, ArrayList arraylist, int i1)
    {
        iM = i;
        nb = s;
        ol = s1;
        nN = l;
        om = j;
        mo = s2;
        nR = k;
        oh = bundle;
        nQ = arraylist;
        on = i1;
    }

    public RoomEntity(Room room)
    {
        iM = 2;
        nb = room.getRoomId();
        ol = room.getCreatorId();
        nN = room.getCreationTimestamp();
        om = room.getStatus();
        mo = room.getDescription();
        nR = room.getVariant();
        oh = room.getAutoMatchCriteria();
        ArrayList arraylist = room.getParticipants();
        int j = arraylist.size();
        nQ = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            nQ.add((ParticipantEntity)((Participant)arraylist.get(i)).freeze());
        }

        on = room.getAutoMatchWaitEstimateSeconds();
    }

    static boolean J(String s)
    {
        return y(s);
    }

    static int a(Room room)
    {
        return dl.hashCode(new Object[] {
            room.getRoomId(), room.getCreatorId(), Long.valueOf(room.getCreationTimestamp()), Integer.valueOf(room.getStatus()), room.getDescription(), Integer.valueOf(room.getVariant()), room.getAutoMatchCriteria(), room.getParticipants(), Integer.valueOf(room.getAutoMatchWaitEstimateSeconds())
        });
    }

    static boolean a(Room room, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof Room) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (room == obj) goto _L4; else goto _L3
_L3:
        obj = (Room)obj;
        if (!dl.equal(((Room) (obj)).getRoomId(), room.getRoomId()) || !dl.equal(((Room) (obj)).getCreatorId(), room.getCreatorId()) || !dl.equal(Long.valueOf(((Room) (obj)).getCreationTimestamp()), Long.valueOf(room.getCreationTimestamp())) || !dl.equal(Integer.valueOf(((Room) (obj)).getStatus()), Integer.valueOf(room.getStatus())) || !dl.equal(((Room) (obj)).getDescription(), room.getDescription()) || !dl.equal(Integer.valueOf(((Room) (obj)).getVariant()), Integer.valueOf(room.getVariant())) || !dl.equal(((Room) (obj)).getAutoMatchCriteria(), room.getAutoMatchCriteria()) || !dl.equal(((Room) (obj)).getParticipants(), room.getParticipants()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (dl.equal(Integer.valueOf(((Room) (obj)).getAutoMatchWaitEstimateSeconds()), Integer.valueOf(room.getAutoMatchWaitEstimateSeconds()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(Room room)
    {
        return dl.d(room).a("RoomId", room.getRoomId()).a("CreatorId", room.getCreatorId()).a("CreationTimestamp", Long.valueOf(room.getCreationTimestamp())).a("RoomStatus", Integer.valueOf(room.getStatus())).a("Description", room.getDescription()).a("Variant", Integer.valueOf(room.getVariant())).a("AutoMatchCriteria", room.getAutoMatchCriteria()).a("Participants", room.getParticipants()).a("AutoMatchWaitEstimateSeconds", Integer.valueOf(room.getAutoMatchWaitEstimateSeconds())).toString();
    }

    static boolean b(Integer integer)
    {
        return c(integer);
    }

    static Integer bQ()
    {
        return aW();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Room freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public Bundle getAutoMatchCriteria()
    {
        return oh;
    }

    public int getAutoMatchWaitEstimateSeconds()
    {
        return on;
    }

    public long getCreationTimestamp()
    {
        return nN;
    }

    public String getCreatorId()
    {
        return ol;
    }

    public String getDescription()
    {
        return mo;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        eg.b(mo, chararraybuffer);
    }

    public String getParticipantId(String s)
    {
        int j = nQ.size();
        for (int i = 0; i < j; i++)
        {
            Participant participant = (Participant)nQ.get(i);
            Player player = participant.getPlayer();
            if (player != null && player.getPlayerId().equals(s))
            {
                return participant.getParticipantId();
            }
        }

        return null;
    }

    public ArrayList getParticipantIds()
    {
        int j = nQ.size();
        ArrayList arraylist = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            arraylist.add(((ParticipantEntity)nQ.get(i)).getParticipantId());
        }

        return arraylist;
    }

    public int getParticipantStatus(String s)
    {
        int j = nQ.size();
        for (int i = 0; i < j; i++)
        {
            Participant participant = (Participant)nQ.get(i);
            if (participant.getParticipantId().equals(s))
            {
                return participant.getStatus();
            }
        }

        throw new IllegalStateException((new StringBuilder()).append("Participant ").append(s).append(" is not in room ").append(getRoomId()).toString());
    }

    public ArrayList getParticipants()
    {
        return new ArrayList(nQ);
    }

    public String getRoomId()
    {
        return nb;
    }

    public int getStatus()
    {
        return om;
    }

    public int getVariant()
    {
        return nR;
    }

    public int getVersionCode()
    {
        return iM;
    }

    public int hashCode()
    {
        return a(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (!aX())
        {
            com.google.android.gms.games.multiplayer.realtime.b.a(this, parcel, i);
        } else
        {
            parcel.writeString(nb);
            parcel.writeString(ol);
            parcel.writeLong(nN);
            parcel.writeInt(om);
            parcel.writeString(mo);
            parcel.writeInt(nR);
            parcel.writeBundle(oh);
            int k = nQ.size();
            parcel.writeInt(k);
            int j = 0;
            while (j < k) 
            {
                ((ParticipantEntity)nQ.get(j)).writeToParcel(parcel, i);
                j++;
            }
        }
    }

}
