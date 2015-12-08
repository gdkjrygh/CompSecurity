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
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.le;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            Room, RoomEntityCreator

public final class RoomEntity extends GamesDowngradeableSafeParcel
    implements Room
{
    static final class RoomEntityCreatorCompat extends RoomEntityCreator
    {

        public RoomEntity cC(Parcel parcel)
        {
            if (RoomEntity.b(RoomEntity.kD()) || RoomEntity.bz(com/google/android/gms/games/multiplayer/realtime/RoomEntity.getCanonicalName()))
            {
                return super.cC(parcel);
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
            return cC(parcel);
        }

        RoomEntityCreatorCompat()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new RoomEntityCreatorCompat();
    private final int CK;
    private final String UO;
    private final String YI;
    private final long adS;
    private final ArrayList adV;
    private final int adW;
    private final Bundle aem;
    private final String aep;
    private final int aeq;
    private final int aer;

    RoomEntity(int i, String s, String s1, long l, int j, String s2, 
            int k, Bundle bundle, ArrayList arraylist, int i1)
    {
        CK = i;
        YI = s;
        aep = s1;
        adS = l;
        aeq = j;
        UO = s2;
        adW = k;
        aem = bundle;
        adV = arraylist;
        aer = i1;
    }

    public RoomEntity(Room room)
    {
        CK = 2;
        YI = room.getRoomId();
        aep = room.getCreatorId();
        adS = room.getCreationTimestamp();
        aeq = room.getStatus();
        UO = room.getDescription();
        adW = room.getVariant();
        aem = room.getAutoMatchCriteria();
        ArrayList arraylist = room.getParticipants();
        int j = arraylist.size();
        adV = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            adV.add((ParticipantEntity)((Participant)arraylist.get(i)).freeze());
        }

        aer = room.getAutoMatchWaitEstimateSeconds();
    }

    static int a(Room room)
    {
        return jv.hashCode(new Object[] {
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
        if (!jv.equal(((Room) (obj)).getRoomId(), room.getRoomId()) || !jv.equal(((Room) (obj)).getCreatorId(), room.getCreatorId()) || !jv.equal(Long.valueOf(((Room) (obj)).getCreationTimestamp()), Long.valueOf(room.getCreationTimestamp())) || !jv.equal(Integer.valueOf(((Room) (obj)).getStatus()), Integer.valueOf(room.getStatus())) || !jv.equal(((Room) (obj)).getDescription(), room.getDescription()) || !jv.equal(Integer.valueOf(((Room) (obj)).getVariant()), Integer.valueOf(room.getVariant())) || !jv.equal(((Room) (obj)).getAutoMatchCriteria(), room.getAutoMatchCriteria()) || !jv.equal(((Room) (obj)).getParticipants(), room.getParticipants()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (jv.equal(Integer.valueOf(((Room) (obj)).getAutoMatchWaitEstimateSeconds()), Integer.valueOf(room.getAutoMatchWaitEstimateSeconds()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(Room room)
    {
        return jv.h(room).a("RoomId", room.getRoomId()).a("CreatorId", room.getCreatorId()).a("CreationTimestamp", Long.valueOf(room.getCreationTimestamp())).a("RoomStatus", Integer.valueOf(room.getStatus())).a("Description", room.getDescription()).a("Variant", Integer.valueOf(room.getVariant())).a("AutoMatchCriteria", room.getAutoMatchCriteria()).a("Participants", room.getParticipants()).a("AutoMatchWaitEstimateSeconds", Integer.valueOf(room.getAutoMatchWaitEstimateSeconds())).toString();
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

    static boolean bz(String s)
    {
        return aW(s);
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

    static Integer kD()
    {
        return ht();
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
        return aem;
    }

    public int getAutoMatchWaitEstimateSeconds()
    {
        return aer;
    }

    public long getCreationTimestamp()
    {
        return adS;
    }

    public String getCreatorId()
    {
        return aep;
    }

    public String getDescription()
    {
        return UO;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        le.b(UO, chararraybuffer);
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
        return new ArrayList(adV);
    }

    public String getRoomId()
    {
        return YI;
    }

    public int getStatus()
    {
        return aeq;
    }

    public int getVariant()
    {
        return adW;
    }

    public int getVersionCode()
    {
        return CK;
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
        if (!hu())
        {
            RoomEntityCreator.a(this, parcel, i);
        } else
        {
            parcel.writeString(YI);
            parcel.writeString(aep);
            parcel.writeLong(adS);
            parcel.writeInt(aeq);
            parcel.writeString(UO);
            parcel.writeInt(adW);
            parcel.writeBundle(aem);
            int k = adV.size();
            parcel.writeInt(k);
            int j = 0;
            while (j < k) 
            {
                ((ParticipantEntity)adV.get(j)).writeToParcel(parcel, i);
                j++;
            }
        }
    }

}
