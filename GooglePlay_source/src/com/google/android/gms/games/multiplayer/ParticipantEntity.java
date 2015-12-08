// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Participant, ParticipantEntityCreator, ParticipantResult

public final class ParticipantEntity extends GamesDowngradeableSafeParcel
    implements Participant
{
    static final class ParticipantEntityCreatorCompat extends ParticipantEntityCreator
    {

        public final ParticipantEntity createFromParcel(Parcel parcel)
        {
            if (ParticipantEntity.versionSupportsSafeParcel(ParticipantEntity.getUnparcelClientVersion()) || ParticipantEntity.canUnparcelSafely(com/google/android/gms/games/multiplayer/ParticipantEntity.getCanonicalName()))
            {
                return super.createFromParcel(parcel);
            }
            String s = parcel.readString();
            String s1 = parcel.readString();
            Object obj = parcel.readString();
            Object obj1;
            String s2;
            boolean flag;
            int i;
            boolean flag1;
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = Uri.parse(((String) (obj)));
            }
            obj1 = parcel.readString();
            if (obj1 == null)
            {
                obj1 = null;
            } else
            {
                obj1 = Uri.parse(((String) (obj1)));
            }
            i = parcel.readInt();
            s2 = parcel.readString();
            if (parcel.readInt() > 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (parcel.readInt() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                parcel = (PlayerEntity)PlayerEntity.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            return new ParticipantEntity(3, s, s1, ((Uri) (obj)), ((Uri) (obj1)), i, s2, flag1, parcel, 7, null, null, null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        ParticipantEntityCreatorCompat()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new ParticipantEntityCreatorCompat();
    final int mCapabilities;
    final String mClientAddress;
    final boolean mConnectedToRoom;
    private final String mDisplayName;
    private final Uri mHiResImageUri;
    private final String mHiResImageUrl;
    private final Uri mIconImageUri;
    private final String mIconImageUrl;
    final String mParticipantId;
    final PlayerEntity mPlayer;
    final ParticipantResult mResult;
    final int mStatus;
    final int mVersionCode;

    ParticipantEntity(int i, String s, String s1, Uri uri, Uri uri1, int j, String s2, 
            boolean flag, PlayerEntity playerentity, int k, ParticipantResult participantresult, String s3, String s4)
    {
        mVersionCode = i;
        mParticipantId = s;
        mDisplayName = s1;
        mIconImageUri = uri;
        mHiResImageUri = uri1;
        mStatus = j;
        mClientAddress = s2;
        mConnectedToRoom = flag;
        mPlayer = playerentity;
        mCapabilities = k;
        mResult = participantresult;
        mIconImageUrl = s3;
        mHiResImageUrl = s4;
    }

    public ParticipantEntity(Participant participant)
    {
        mVersionCode = 3;
        mParticipantId = participant.getParticipantId();
        mDisplayName = participant.getDisplayName();
        mIconImageUri = participant.getIconImageUri();
        mHiResImageUri = participant.getHiResImageUri();
        mStatus = participant.getStatus();
        mClientAddress = participant.getClientAddress();
        mConnectedToRoom = participant.isConnectedToRoom();
        Object obj = participant.getPlayer();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = new PlayerEntity(((Player) (obj)));
        }
        mPlayer = ((PlayerEntity) (obj));
        mCapabilities = participant.getCapabilities();
        mResult = participant.getResult();
        mIconImageUrl = participant.getIconImageUrl();
        mHiResImageUrl = participant.getHiResImageUrl();
    }

    static boolean equals(Participant participant, Object obj)
    {
        if (obj instanceof Participant)
        {
            if (participant == obj)
            {
                return true;
            }
            obj = (Participant)obj;
            if (Objects.equal(((Participant) (obj)).getPlayer(), participant.getPlayer()) && Objects.equal(Integer.valueOf(((Participant) (obj)).getStatus()), Integer.valueOf(participant.getStatus())) && Objects.equal(((Participant) (obj)).getClientAddress(), participant.getClientAddress()) && Objects.equal(Boolean.valueOf(((Participant) (obj)).isConnectedToRoom()), Boolean.valueOf(participant.isConnectedToRoom())) && Objects.equal(((Participant) (obj)).getDisplayName(), participant.getDisplayName()) && Objects.equal(((Participant) (obj)).getIconImageUri(), participant.getIconImageUri()) && Objects.equal(((Participant) (obj)).getHiResImageUri(), participant.getHiResImageUri()) && Objects.equal(Integer.valueOf(((Participant) (obj)).getCapabilities()), Integer.valueOf(participant.getCapabilities())) && Objects.equal(((Participant) (obj)).getResult(), participant.getResult()) && Objects.equal(((Participant) (obj)).getParticipantId(), participant.getParticipantId()))
            {
                return true;
            }
        }
        return false;
    }

    static int hashCode(Participant participant)
    {
        return Arrays.hashCode(new Object[] {
            participant.getPlayer(), Integer.valueOf(participant.getStatus()), participant.getClientAddress(), Boolean.valueOf(participant.isConnectedToRoom()), participant.getDisplayName(), participant.getIconImageUri(), participant.getHiResImageUri(), Integer.valueOf(participant.getCapabilities()), participant.getResult(), participant.getParticipantId()
        });
    }

    static String toString(Participant participant)
    {
        return Objects.toStringHelper(participant).add("ParticipantId", participant.getParticipantId()).add("Player", participant.getPlayer()).add("Status", Integer.valueOf(participant.getStatus())).add("ClientAddress", participant.getClientAddress()).add("ConnectedToRoom", Boolean.valueOf(participant.isConnectedToRoom())).add("DisplayName", participant.getDisplayName()).add("IconImage", participant.getIconImageUri()).add("IconImageUrl", participant.getIconImageUrl()).add("HiResImage", participant.getHiResImageUri()).add("HiResImageUrl", participant.getHiResImageUrl()).add("Capabilities", Integer.valueOf(participant.getCapabilities())).add("Result", participant.getResult()).toString();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return equals(((Participant) (this)), obj);
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final int getCapabilities()
    {
        return mCapabilities;
    }

    public final String getClientAddress()
    {
        return mClientAddress;
    }

    public final String getDisplayName()
    {
        if (mPlayer == null)
        {
            return mDisplayName;
        } else
        {
            return mPlayer.mDisplayName;
        }
    }

    public final void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        if (mPlayer == null)
        {
            DataUtils.copyStringToBuffer(mDisplayName, chararraybuffer);
            return;
        } else
        {
            mPlayer.getDisplayName(chararraybuffer);
            return;
        }
    }

    public final Uri getHiResImageUri()
    {
        if (mPlayer == null)
        {
            return mHiResImageUri;
        } else
        {
            return mPlayer.mHiResImageUri;
        }
    }

    public final String getHiResImageUrl()
    {
        if (mPlayer == null)
        {
            return mHiResImageUrl;
        } else
        {
            return mPlayer.mHiResImageUrl;
        }
    }

    public final Uri getIconImageUri()
    {
        if (mPlayer == null)
        {
            return mIconImageUri;
        } else
        {
            return mPlayer.mIconImageUri;
        }
    }

    public final String getIconImageUrl()
    {
        if (mPlayer == null)
        {
            return mIconImageUrl;
        } else
        {
            return mPlayer.mIconImageUrl;
        }
    }

    public final String getParticipantId()
    {
        return mParticipantId;
    }

    public final Player getPlayer()
    {
        return mPlayer;
    }

    public final ParticipantResult getResult()
    {
        return mResult;
    }

    public final int getStatus()
    {
        return mStatus;
    }

    public final int hashCode()
    {
        return hashCode(((Participant) (this)));
    }

    public final boolean isConnectedToRoom()
    {
        return mConnectedToRoom;
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final void setShouldDowngrade(boolean flag)
    {
        super.setShouldDowngrade(flag);
        if (mPlayer != null)
        {
            mPlayer.setShouldDowngrade(flag);
        }
    }

    public final String toString()
    {
        return toString(((Participant) (this)));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        Object obj = null;
        boolean flag = false;
        if (!super.mShouldDowngrade)
        {
            ParticipantEntityCreator.writeToParcel(this, parcel, i);
        } else
        {
            parcel.writeString(mParticipantId);
            parcel.writeString(mDisplayName);
            String s;
            int j;
            if (mIconImageUri == null)
            {
                s = null;
            } else
            {
                s = mIconImageUri.toString();
            }
            parcel.writeString(s);
            if (mHiResImageUri == null)
            {
                s = obj;
            } else
            {
                s = mHiResImageUri.toString();
            }
            parcel.writeString(s);
            parcel.writeInt(mStatus);
            parcel.writeString(mClientAddress);
            if (mConnectedToRoom)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            parcel.writeInt(j);
            if (mPlayer == null)
            {
                j = ((flag) ? 1 : 0);
            } else
            {
                j = 1;
            }
            parcel.writeInt(j);
            if (mPlayer != null)
            {
                mPlayer.writeToParcel(parcel, i);
                return;
            }
        }
    }




}
