// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            Room, RoomEntityCreator

public final class RoomEntity extends GamesDowngradeableSafeParcel
    implements Room
{
    static final class RoomEntityCreatorCompat extends RoomEntityCreator
    {

        public final RoomEntity createFromParcel(Parcel parcel)
        {
            if (RoomEntity.versionSupportsSafeParcel(RoomEntity.getUnparcelClientVersion()) || RoomEntity.canUnparcelSafely(com/google/android/gms/games/multiplayer/realtime/RoomEntity.getCanonicalName()))
            {
                return super.createFromParcel(parcel);
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

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        RoomEntityCreatorCompat()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new RoomEntityCreatorCompat();
    final Bundle mAutoMatchCriteria;
    final int mAutoMatchWaitEstimateSeconds;
    final long mCreationTimestamp;
    final String mCreatorId;
    final String mDescription;
    private final ArrayList mParticipants;
    final String mRoomId;
    final int mRoomStatus;
    final int mVariant;
    final int mVersionCode;

    RoomEntity(int i, String s, String s1, long l, int j, String s2, 
            int k, Bundle bundle, ArrayList arraylist, int i1)
    {
        mVersionCode = i;
        mRoomId = s;
        mCreatorId = s1;
        mCreationTimestamp = l;
        mRoomStatus = j;
        mDescription = s2;
        mVariant = k;
        mAutoMatchCriteria = bundle;
        mParticipants = arraylist;
        mAutoMatchWaitEstimateSeconds = i1;
    }

    public RoomEntity(Room room)
    {
        mVersionCode = 2;
        mRoomId = room.getRoomId();
        mCreatorId = room.getCreatorId();
        mCreationTimestamp = room.getCreationTimestamp();
        mRoomStatus = room.getStatus();
        mDescription = room.getDescription();
        mVariant = room.getVariant();
        mAutoMatchCriteria = room.getAutoMatchCriteria();
        ArrayList arraylist = room.getParticipants();
        int j = arraylist.size();
        mParticipants = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            mParticipants.add((ParticipantEntity)((Participant)arraylist.get(i)).freeze());
        }

        mAutoMatchWaitEstimateSeconds = room.getAutoMatchWaitEstimateSeconds();
    }

    static boolean equals(Room room, Object obj)
    {
        if (obj instanceof Room)
        {
            if (room == obj)
            {
                return true;
            }
            obj = (Room)obj;
            if (Objects.equal(((Room) (obj)).getRoomId(), room.getRoomId()) && Objects.equal(((Room) (obj)).getCreatorId(), room.getCreatorId()) && Objects.equal(Long.valueOf(((Room) (obj)).getCreationTimestamp()), Long.valueOf(room.getCreationTimestamp())) && Objects.equal(Integer.valueOf(((Room) (obj)).getStatus()), Integer.valueOf(room.getStatus())) && Objects.equal(((Room) (obj)).getDescription(), room.getDescription()) && Objects.equal(Integer.valueOf(((Room) (obj)).getVariant()), Integer.valueOf(room.getVariant())) && Objects.equal(((Room) (obj)).getAutoMatchCriteria(), room.getAutoMatchCriteria()) && Objects.equal(((Room) (obj)).getParticipants(), room.getParticipants()) && Objects.equal(Integer.valueOf(((Room) (obj)).getAutoMatchWaitEstimateSeconds()), Integer.valueOf(room.getAutoMatchWaitEstimateSeconds())))
            {
                return true;
            }
        }
        return false;
    }

    static String getParticipantId(Room room, String s)
    {
        Object obj = null;
        ArrayList arraylist = room.getParticipants();
        int i = 0;
        int j = arraylist.size();
        do
        {
label0:
            {
                room = obj;
                if (i < j)
                {
                    room = (Participant)arraylist.get(i);
                    Player player = room.getPlayer();
                    if (player == null || !player.getPlayerId().equals(s))
                    {
                        break label0;
                    }
                    room = room.getParticipantId();
                }
                return room;
            }
            i++;
        } while (true);
    }

    static int hashCode(Room room)
    {
        return Arrays.hashCode(new Object[] {
            room.getRoomId(), room.getCreatorId(), Long.valueOf(room.getCreationTimestamp()), Integer.valueOf(room.getStatus()), room.getDescription(), Integer.valueOf(room.getVariant()), room.getAutoMatchCriteria(), room.getParticipants(), Integer.valueOf(room.getAutoMatchWaitEstimateSeconds())
        });
    }

    static String toString(Room room)
    {
        return Objects.toStringHelper(room).add("RoomId", room.getRoomId()).add("CreatorId", room.getCreatorId()).add("CreationTimestamp", Long.valueOf(room.getCreationTimestamp())).add("RoomStatus", Integer.valueOf(room.getStatus())).add("Description", room.getDescription()).add("Variant", Integer.valueOf(room.getVariant())).add("AutoMatchCriteria", room.getAutoMatchCriteria()).add("Participants", room.getParticipants()).add("AutoMatchWaitEstimateSeconds", Integer.valueOf(room.getAutoMatchWaitEstimateSeconds())).toString();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return equals(((Room) (this)), obj);
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final Bundle getAutoMatchCriteria()
    {
        return mAutoMatchCriteria;
    }

    public final int getAutoMatchWaitEstimateSeconds()
    {
        return mAutoMatchWaitEstimateSeconds;
    }

    public final long getCreationTimestamp()
    {
        return mCreationTimestamp;
    }

    public final String getCreatorId()
    {
        return mCreatorId;
    }

    public final String getDescription()
    {
        return mDescription;
    }

    public final String getParticipantId(String s)
    {
        return getParticipantId(((Room) (this)), s);
    }

    public final ArrayList getParticipants()
    {
        return new ArrayList(mParticipants);
    }

    public final String getRoomId()
    {
        return mRoomId;
    }

    public final int getStatus()
    {
        return mRoomStatus;
    }

    public final int getVariant()
    {
        return mVariant;
    }

    public final int hashCode()
    {
        return hashCode(((Room) (this)));
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final void setShouldDowngrade(boolean flag)
    {
        super.setShouldDowngrade(flag);
        int i = 0;
        for (int j = mParticipants.size(); i < j; i++)
        {
            ((ParticipantEntity)mParticipants.get(i)).setShouldDowngrade(flag);
        }

    }

    public final String toString()
    {
        return toString(((Room) (this)));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (!super.mShouldDowngrade)
        {
            RoomEntityCreator.writeToParcel$24df22bb(this, parcel);
        } else
        {
            parcel.writeString(mRoomId);
            parcel.writeString(mCreatorId);
            parcel.writeLong(mCreationTimestamp);
            parcel.writeInt(mRoomStatus);
            parcel.writeString(mDescription);
            parcel.writeInt(mVariant);
            parcel.writeBundle(mAutoMatchCriteria);
            int k = mParticipants.size();
            parcel.writeInt(k);
            int j = 0;
            while (j < k) 
            {
                ((ParticipantEntity)mParticipants.get(j)).writeToParcel(parcel, i);
                j++;
            }
        }
    }




}
