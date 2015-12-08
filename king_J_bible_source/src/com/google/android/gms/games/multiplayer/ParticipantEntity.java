// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.fo;
import com.google.android.gms.internal.gm;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Participant, ParticipantEntityCreator, ParticipantResult

public final class ParticipantEntity extends GamesDowngradeableSafeParcel
    implements Participant
{
    static final class ParticipantEntityCreatorCompat extends ParticipantEntityCreator
    {

        public ParticipantEntity av(Parcel parcel)
        {
            boolean flag = true;
            if (ParticipantEntity.b(ParticipantEntity.gg()) || ParticipantEntity.az(com/google/android/gms/games/multiplayer/ParticipantEntity.getCanonicalName()))
            {
                return super.av(parcel);
            }
            String s = parcel.readString();
            String s1 = parcel.readString();
            Object obj = parcel.readString();
            Object obj1;
            String s2;
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
            if (parcel.readInt() <= 0)
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

        public Object createFromParcel(Parcel parcel)
        {
            return av(parcel);
        }

        ParticipantEntityCreatorCompat()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new ParticipantEntityCreatorCompat();
    private final String HA;
    private final Uri HF;
    private final Uri HG;
    private final String HQ;
    private final String HR;
    private final String Is;
    private final String Jg;
    private final PlayerEntity LH;
    private final int MB;
    private final boolean MC;
    private final int MD;
    private final ParticipantResult ME;
    private final int xH;

    ParticipantEntity(int i, String s, String s1, Uri uri, Uri uri1, int j, String s2, 
            boolean flag, PlayerEntity playerentity, int k, ParticipantResult participantresult, String s3, String s4)
    {
        xH = i;
        Jg = s;
        HA = s1;
        HF = uri;
        HG = uri1;
        MB = j;
        Is = s2;
        MC = flag;
        LH = playerentity;
        MD = k;
        ME = participantresult;
        HQ = s3;
        HR = s4;
    }

    public ParticipantEntity(Participant participant)
    {
        xH = 3;
        Jg = participant.getParticipantId();
        HA = participant.getDisplayName();
        HF = participant.getIconImageUri();
        HG = participant.getHiResImageUri();
        MB = participant.getStatus();
        Is = participant.gi();
        MC = participant.isConnectedToRoom();
        Object obj = participant.getPlayer();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = new PlayerEntity(((Player) (obj)));
        }
        LH = ((PlayerEntity) (obj));
        MD = participant.getCapabilities();
        ME = participant.getResult();
        HQ = participant.getIconImageUrl();
        HR = participant.getHiResImageUrl();
    }

    static int a(Participant participant)
    {
        return fo.hashCode(new Object[] {
            participant.getPlayer(), Integer.valueOf(participant.getStatus()), participant.gi(), Boolean.valueOf(participant.isConnectedToRoom()), participant.getDisplayName(), participant.getIconImageUri(), participant.getHiResImageUri(), Integer.valueOf(participant.getCapabilities()), participant.getResult(), participant.getParticipantId()
        });
    }

    static boolean a(Participant participant, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof Participant) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (participant == obj) goto _L4; else goto _L3
_L3:
        obj = (Participant)obj;
        if (!fo.equal(((Participant) (obj)).getPlayer(), participant.getPlayer()) || !fo.equal(Integer.valueOf(((Participant) (obj)).getStatus()), Integer.valueOf(participant.getStatus())) || !fo.equal(((Participant) (obj)).gi(), participant.gi()) || !fo.equal(Boolean.valueOf(((Participant) (obj)).isConnectedToRoom()), Boolean.valueOf(participant.isConnectedToRoom())) || !fo.equal(((Participant) (obj)).getDisplayName(), participant.getDisplayName()) || !fo.equal(((Participant) (obj)).getIconImageUri(), participant.getIconImageUri()) || !fo.equal(((Participant) (obj)).getHiResImageUri(), participant.getHiResImageUri()) || !fo.equal(Integer.valueOf(((Participant) (obj)).getCapabilities()), Integer.valueOf(participant.getCapabilities())) || !fo.equal(((Participant) (obj)).getResult(), participant.getResult()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (fo.equal(((Participant) (obj)).getParticipantId(), participant.getParticipantId())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static boolean az(String s)
    {
        return al(s);
    }

    static String b(Participant participant)
    {
        return fo.e(participant).a("ParticipantId", participant.getParticipantId()).a("Player", participant.getPlayer()).a("Status", Integer.valueOf(participant.getStatus())).a("ClientAddress", participant.gi()).a("ConnectedToRoom", Boolean.valueOf(participant.isConnectedToRoom())).a("DisplayName", participant.getDisplayName()).a("IconImage", participant.getIconImageUri()).a("IconImageUrl", participant.getIconImageUrl()).a("HiResImage", participant.getHiResImageUri()).a("HiResImageUrl", participant.getHiResImageUrl()).a("Capabilities", Integer.valueOf(participant.getCapabilities())).a("Result", participant.getResult()).toString();
    }

    static boolean b(Integer integer)
    {
        return c(integer);
    }

    static Integer gg()
    {
        return eJ();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Participant freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public int getCapabilities()
    {
        return MD;
    }

    public String getDisplayName()
    {
        if (LH == null)
        {
            return HA;
        } else
        {
            return LH.getDisplayName();
        }
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        if (LH == null)
        {
            gm.b(HA, chararraybuffer);
            return;
        } else
        {
            LH.getDisplayName(chararraybuffer);
            return;
        }
    }

    public Uri getHiResImageUri()
    {
        if (LH == null)
        {
            return HG;
        } else
        {
            return LH.getHiResImageUri();
        }
    }

    public String getHiResImageUrl()
    {
        if (LH == null)
        {
            return HR;
        } else
        {
            return LH.getHiResImageUrl();
        }
    }

    public Uri getIconImageUri()
    {
        if (LH == null)
        {
            return HF;
        } else
        {
            return LH.getIconImageUri();
        }
    }

    public String getIconImageUrl()
    {
        if (LH == null)
        {
            return HQ;
        } else
        {
            return LH.getIconImageUrl();
        }
    }

    public String getParticipantId()
    {
        return Jg;
    }

    public Player getPlayer()
    {
        return LH;
    }

    public ParticipantResult getResult()
    {
        return ME;
    }

    public int getStatus()
    {
        return MB;
    }

    public int getVersionCode()
    {
        return xH;
    }

    public String gi()
    {
        return Is;
    }

    public int hashCode()
    {
        return a(this);
    }

    public boolean isConnectedToRoom()
    {
        return MC;
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
        Object obj = null;
        boolean flag = false;
        if (!eK())
        {
            ParticipantEntityCreator.a(this, parcel, i);
        } else
        {
            parcel.writeString(Jg);
            parcel.writeString(HA);
            String s;
            int j;
            if (HF == null)
            {
                s = null;
            } else
            {
                s = HF.toString();
            }
            parcel.writeString(s);
            if (HG == null)
            {
                s = obj;
            } else
            {
                s = HG.toString();
            }
            parcel.writeString(s);
            parcel.writeInt(MB);
            parcel.writeString(Is);
            if (MC)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            parcel.writeInt(j);
            if (LH == null)
            {
                j = ((flag) ? 1 : 0);
            } else
            {
                j = 1;
            }
            parcel.writeInt(j);
            if (LH != null)
            {
                LH.writeToParcel(parcel, i);
                return;
            }
        }
    }

}
