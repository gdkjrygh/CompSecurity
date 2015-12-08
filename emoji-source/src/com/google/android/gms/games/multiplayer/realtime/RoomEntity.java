// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.hk;
import com.google.android.gms.internal.ik;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            Room, RoomEntityCreator

public final class RoomEntity extends GamesDowngradeableSafeParcel
    implements Room
{
    static final class RoomEntityCreatorCompat extends RoomEntityCreator
    {

        public RoomEntity bo(Parcel parcel)
        {
            if (RoomEntity.b(RoomEntity.gR()) || RoomEntity.aQ(com/google/android/gms/games/multiplayer/realtime/RoomEntity.getCanonicalName()))
            {
                return super.bo(parcel);
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

        public Object createFromParcel(Parcel parcel)
        {
            return bo(parcel);
        }

        RoomEntityCreatorCompat()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new RoomEntityCreatorCompat();
    private final String Mp;
    private final String NS;
    private final long SU;
    private final ArrayList SX;
    private final int SY;
    private final Bundle To;
    private final String Ts;
    private final int Tt;
    private final int Tu;
    private final int xM;

    RoomEntity(int i, String s, String s1, long l, int j, String s2, 
            int k, Bundle bundle, ArrayList arraylist, int i1)
    {
        xM = i;
        NS = s;
        Ts = s1;
        SU = l;
        Tt = j;
        Mp = s2;
        SY = k;
        To = bundle;
        SX = arraylist;
        Tu = i1;
    }

    public RoomEntity(Room room)
    {
        xM = 2;
        NS = room.getRoomId();
        Ts = room.getCreatorId();
        SU = room.getCreationTimestamp();
        Tt = room.getStatus();
        Mp = room.getDescription();
        SY = room.getVariant();
        To = room.getAutoMatchCriteria();
        ArrayList arraylist = room.getParticipants();
        int j = arraylist.size();
        SX = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            SX.add((ParticipantEntity)((Participant)arraylist.get(i)).freeze());
        }

        Tu = room.getAutoMatchWaitEstimateSeconds();
    }

    static int a(Room room)
    {
        return hk.hashCode(new Object[] {
            room.getRoomId(), room.getCreatorId(), Long.valueOf(room.getCreationTimestamp()), Integer.valueOf(room.getStatus()), room.getDescription(), Integer.valueOf(room.getVariant()), room.getAutoMatchCriteria(), room.getParticipants(), Integer.valueOf(room.getAutoMatchWaitEstimateSeconds())
        });
    }

    static int a(Room room, String s)
    {
        ArrayList arraylist = room.getParticipants();
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            Participant participant = (Participant)arraylist.get(i);
            if (participant.getParticipantId().equals(s))
            {
                return participant.getStatus();
            }
        }

        throw new IllegalStateException((new StringBuilder()).append("Participant ").append(s).append(" is not in room ").append(room.getRoomId()).toString());
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
        if (!hk.equal(((Room) (obj)).getRoomId(), room.getRoomId()) || !hk.equal(((Room) (obj)).getCreatorId(), room.getCreatorId()) || !hk.equal(Long.valueOf(((Room) (obj)).getCreationTimestamp()), Long.valueOf(room.getCreationTimestamp())) || !hk.equal(Integer.valueOf(((Room) (obj)).getStatus()), Integer.valueOf(room.getStatus())) || !hk.equal(((Room) (obj)).getDescription(), room.getDescription()) || !hk.equal(Integer.valueOf(((Room) (obj)).getVariant()), Integer.valueOf(room.getVariant())) || !hk.equal(((Room) (obj)).getAutoMatchCriteria(), room.getAutoMatchCriteria()) || !hk.equal(((Room) (obj)).getParticipants(), room.getParticipants()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hk.equal(Integer.valueOf(((Room) (obj)).getAutoMatchWaitEstimateSeconds()), Integer.valueOf(room.getAutoMatchWaitEstimateSeconds()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static boolean aQ(String s)
    {
        return aA(s);
    }

    static String b(Room room)
    {
        return hk.e(room).a("RoomId", room.getRoomId()).a("CreatorId", room.getCreatorId()).a("CreationTimestamp", Long.valueOf(room.getCreationTimestamp())).a("RoomStatus", Integer.valueOf(room.getStatus())).a("Description", room.getDescription()).a("Variant", Integer.valueOf(room.getVariant())).a("AutoMatchCriteria", room.getAutoMatchCriteria()).a("Participants", room.getParticipants()).a("AutoMatchWaitEstimateSeconds", Integer.valueOf(room.getAutoMatchWaitEstimateSeconds())).toString();
    }

    static String b(Room room, String s)
    {
        room = room.getParticipants();
        int j = room.size();
        for (int i = 0; i < j; i++)
        {
            Participant participant = (Participant)room.get(i);
            Player player = participant.getPlayer();
            if (player != null && player.getPlayerId().equals(s))
            {
                return participant.getParticipantId();
            }
        }

        return null;
    }

    static boolean b(Integer integer)
    {
        return c(integer);
    }

    static Participant c(Room room, String s)
    {
        ArrayList arraylist = room.getParticipants();
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            Participant participant = (Participant)arraylist.get(i);
            if (participant.getParticipantId().equals(s))
            {
                return participant;
            }
        }

        throw new IllegalStateException((new StringBuilder()).append("Participant ").append(s).append(" is not in match ").append(room.getRoomId()).toString());
    }

    static ArrayList c(Room room)
    {
        room = room.getParticipants();
        int j = room.size();
        ArrayList arraylist = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            arraylist.add(((Participant)room.get(i)).getParticipantId());
        }

        return arraylist;
    }

    static Integer gR()
    {
        return fq();
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
        return To;
    }

    public int getAutoMatchWaitEstimateSeconds()
    {
        return Tu;
    }

    public long getCreationTimestamp()
    {
        return SU;
    }

    public String getCreatorId()
    {
        return Ts;
    }

    public String getDescription()
    {
        return Mp;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        ik.b(Mp, chararraybuffer);
    }

    public Participant getParticipant(String s)
    {
        return c(this, s);
    }

    public String getParticipantId(String s)
    {
        return b(this, s);
    }

    public ArrayList getParticipantIds()
    {
        return c(this);
    }

    public int getParticipantStatus(String s)
    {
        return a(this, s);
    }

    public ArrayList getParticipants()
    {
        return new ArrayList(SX);
    }

    public String getRoomId()
    {
        return NS;
    }

    public int getStatus()
    {
        return Tt;
    }

    public int getVariant()
    {
        return SY;
    }

    public int getVersionCode()
    {
        return xM;
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
        if (!fr())
        {
            RoomEntityCreator.a(this, parcel, i);
        } else
        {
            parcel.writeString(NS);
            parcel.writeString(Ts);
            parcel.writeLong(SU);
            parcel.writeInt(Tt);
            parcel.writeString(Mp);
            parcel.writeInt(SY);
            parcel.writeBundle(To);
            int k = SX.size();
            parcel.writeInt(k);
            int j = 0;
            while (j < k) 
            {
                ((ParticipantEntity)SX.get(j)).writeToParcel(parcel, i);
                j++;
            }
        }
    }

}
