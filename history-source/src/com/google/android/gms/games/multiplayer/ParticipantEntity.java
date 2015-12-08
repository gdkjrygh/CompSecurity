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
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.le;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Participant, ParticipantEntityCreator, ParticipantResult

public final class ParticipantEntity extends GamesDowngradeableSafeParcel
    implements Participant
{
    static final class ParticipantEntityCreatorCompat extends ParticipantEntityCreator
    {

        public ParticipantEntity cA(Parcel parcel)
        {
            boolean flag = true;
            if (ParticipantEntity.b(ParticipantEntity.kD()) || ParticipantEntity.bz(com/google/android/gms/games/multiplayer/ParticipantEntity.getCanonicalName()))
            {
                return super.cA(parcel);
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
            return cA(parcel);
        }

        ParticipantEntityCreatorCompat()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new ParticipantEntityCreatorCompat();
    private final int CK;
    private final int FO;
    private final int FP;
    private final String OS;
    private final Uri WD;
    private final Uri WE;
    private final String WO;
    private final String WP;
    private final PlayerEntity XE;
    private final String Yi;
    private final String Zk;
    private final boolean adZ;
    private final ParticipantResult aea;

    ParticipantEntity(int i, String s, String s1, Uri uri, Uri uri1, int j, String s2, 
            boolean flag, PlayerEntity playerentity, int k, ParticipantResult participantresult, String s3, String s4)
    {
        CK = i;
        Zk = s;
        OS = s1;
        WD = uri;
        WE = uri1;
        FP = j;
        Yi = s2;
        adZ = flag;
        XE = playerentity;
        FO = k;
        aea = participantresult;
        WO = s3;
        WP = s4;
    }

    public ParticipantEntity(Participant participant)
    {
        CK = 3;
        Zk = participant.getParticipantId();
        OS = participant.getDisplayName();
        WD = participant.getIconImageUri();
        WE = participant.getHiResImageUri();
        FP = participant.getStatus();
        Yi = participant.le();
        adZ = participant.isConnectedToRoom();
        Object obj = participant.getPlayer();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = new PlayerEntity(((Player) (obj)));
        }
        XE = ((PlayerEntity) (obj));
        FO = participant.getCapabilities();
        aea = participant.getResult();
        WO = participant.getIconImageUrl();
        WP = participant.getHiResImageUrl();
    }

    static int a(Participant participant)
    {
        return jv.hashCode(new Object[] {
            participant.getPlayer(), Integer.valueOf(participant.getStatus()), participant.le(), Boolean.valueOf(participant.isConnectedToRoom()), participant.getDisplayName(), participant.getIconImageUri(), participant.getHiResImageUri(), Integer.valueOf(participant.getCapabilities()), participant.getResult(), participant.getParticipantId()
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
        if (!jv.equal(((Participant) (obj)).getPlayer(), participant.getPlayer()) || !jv.equal(Integer.valueOf(((Participant) (obj)).getStatus()), Integer.valueOf(participant.getStatus())) || !jv.equal(((Participant) (obj)).le(), participant.le()) || !jv.equal(Boolean.valueOf(((Participant) (obj)).isConnectedToRoom()), Boolean.valueOf(participant.isConnectedToRoom())) || !jv.equal(((Participant) (obj)).getDisplayName(), participant.getDisplayName()) || !jv.equal(((Participant) (obj)).getIconImageUri(), participant.getIconImageUri()) || !jv.equal(((Participant) (obj)).getHiResImageUri(), participant.getHiResImageUri()) || !jv.equal(Integer.valueOf(((Participant) (obj)).getCapabilities()), Integer.valueOf(participant.getCapabilities())) || !jv.equal(((Participant) (obj)).getResult(), participant.getResult()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (jv.equal(((Participant) (obj)).getParticipantId(), participant.getParticipantId())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(Participant participant)
    {
        return jv.h(participant).a("ParticipantId", participant.getParticipantId()).a("Player", participant.getPlayer()).a("Status", Integer.valueOf(participant.getStatus())).a("ClientAddress", participant.le()).a("ConnectedToRoom", Boolean.valueOf(participant.isConnectedToRoom())).a("DisplayName", participant.getDisplayName()).a("IconImage", participant.getIconImageUri()).a("IconImageUrl", participant.getIconImageUrl()).a("HiResImage", participant.getHiResImageUri()).a("HiResImageUrl", participant.getHiResImageUrl()).a("Capabilities", Integer.valueOf(participant.getCapabilities())).a("Result", participant.getResult()).toString();
    }

    static boolean b(Integer integer)
    {
        return c(integer);
    }

    static boolean bz(String s)
    {
        return aW(s);
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
        return FO;
    }

    public String getDisplayName()
    {
        if (XE == null)
        {
            return OS;
        } else
        {
            return XE.getDisplayName();
        }
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        if (XE == null)
        {
            com.google.android.gms.internal.le.b(OS, chararraybuffer);
            return;
        } else
        {
            XE.getDisplayName(chararraybuffer);
            return;
        }
    }

    public Uri getHiResImageUri()
    {
        if (XE == null)
        {
            return WE;
        } else
        {
            return XE.getHiResImageUri();
        }
    }

    public String getHiResImageUrl()
    {
        if (XE == null)
        {
            return WP;
        } else
        {
            return XE.getHiResImageUrl();
        }
    }

    public Uri getIconImageUri()
    {
        if (XE == null)
        {
            return WD;
        } else
        {
            return XE.getIconImageUri();
        }
    }

    public String getIconImageUrl()
    {
        if (XE == null)
        {
            return WO;
        } else
        {
            return XE.getIconImageUrl();
        }
    }

    public String getParticipantId()
    {
        return Zk;
    }

    public Player getPlayer()
    {
        return XE;
    }

    public ParticipantResult getResult()
    {
        return aea;
    }

    public int getStatus()
    {
        return FP;
    }

    public int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return a(this);
    }

    public boolean isConnectedToRoom()
    {
        return adZ;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String le()
    {
        return Yi;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        Object obj = null;
        boolean flag = false;
        if (!hu())
        {
            ParticipantEntityCreator.a(this, parcel, i);
        } else
        {
            parcel.writeString(Zk);
            parcel.writeString(OS);
            String s;
            int j;
            if (WD == null)
            {
                s = null;
            } else
            {
                s = WD.toString();
            }
            parcel.writeString(s);
            if (WE == null)
            {
                s = obj;
            } else
            {
                s = WE.toString();
            }
            parcel.writeString(s);
            parcel.writeInt(FP);
            parcel.writeString(Yi);
            if (adZ)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            parcel.writeInt(j);
            if (XE == null)
            {
                j = ((flag) ? 1 : 0);
            } else
            {
                j = 1;
            }
            parcel.writeInt(j);
            if (XE != null)
            {
                XE.writeToParcel(parcel, i);
                return;
            }
        }
    }

}
