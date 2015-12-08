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
import com.google.android.gms.internal.hl;
import com.google.android.gms.internal.il;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Participant, ParticipantEntityCreator, ParticipantResult

public final class ParticipantEntity extends GamesDowngradeableSafeParcel
    implements Participant
{
    static final class ParticipantEntityCreatorCompat extends ParticipantEntityCreator
    {

        public ParticipantEntity bm(Parcel parcel)
        {
            boolean flag = true;
            if (ParticipantEntity.b(ParticipantEntity.gM()) || ParticipantEntity.aQ(com/google/android/gms/games/multiplayer/ParticipantEntity.getCanonicalName()))
            {
                return super.bm(parcel);
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
            return bm(parcel);
        }

        ParticipantEntityCreatorCompat()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new ParticipantEntityCreatorCompat();
    private final int Am;
    private final String Lk;
    private final String MA;
    private final Uri Mo;
    private final Uri Mp;
    private final String Mz;
    private final PlayerEntity Ng;
    private final String Nk;
    private final String On;
    private final int SY;
    private final boolean SZ;
    private final ParticipantResult Ta;
    private final int xJ;

    ParticipantEntity(int i, String s, String s1, Uri uri, Uri uri1, int j, String s2, 
            boolean flag, PlayerEntity playerentity, int k, ParticipantResult participantresult, String s3, String s4)
    {
        xJ = i;
        On = s;
        Lk = s1;
        Mo = uri;
        Mp = uri1;
        SY = j;
        Nk = s2;
        SZ = flag;
        Ng = playerentity;
        Am = k;
        Ta = participantresult;
        Mz = s3;
        MA = s4;
    }

    public ParticipantEntity(Participant participant)
    {
        xJ = 3;
        On = participant.getParticipantId();
        Lk = participant.getDisplayName();
        Mo = participant.getIconImageUri();
        Mp = participant.getHiResImageUri();
        SY = participant.getStatus();
        Nk = participant.gR();
        SZ = participant.isConnectedToRoom();
        Object obj = participant.getPlayer();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = new PlayerEntity(((Player) (obj)));
        }
        Ng = ((PlayerEntity) (obj));
        Am = participant.getCapabilities();
        Ta = participant.getResult();
        Mz = participant.getIconImageUrl();
        MA = participant.getHiResImageUrl();
    }

    static int a(Participant participant)
    {
        return hl.hashCode(new Object[] {
            participant.getPlayer(), Integer.valueOf(participant.getStatus()), participant.gR(), Boolean.valueOf(participant.isConnectedToRoom()), participant.getDisplayName(), participant.getIconImageUri(), participant.getHiResImageUri(), Integer.valueOf(participant.getCapabilities()), participant.getResult(), participant.getParticipantId()
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
        if (!hl.equal(((Participant) (obj)).getPlayer(), participant.getPlayer()) || !hl.equal(Integer.valueOf(((Participant) (obj)).getStatus()), Integer.valueOf(participant.getStatus())) || !hl.equal(((Participant) (obj)).gR(), participant.gR()) || !hl.equal(Boolean.valueOf(((Participant) (obj)).isConnectedToRoom()), Boolean.valueOf(participant.isConnectedToRoom())) || !hl.equal(((Participant) (obj)).getDisplayName(), participant.getDisplayName()) || !hl.equal(((Participant) (obj)).getIconImageUri(), participant.getIconImageUri()) || !hl.equal(((Participant) (obj)).getHiResImageUri(), participant.getHiResImageUri()) || !hl.equal(Integer.valueOf(((Participant) (obj)).getCapabilities()), Integer.valueOf(participant.getCapabilities())) || !hl.equal(((Participant) (obj)).getResult(), participant.getResult()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hl.equal(((Participant) (obj)).getParticipantId(), participant.getParticipantId())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static boolean aQ(String s)
    {
        return aA(s);
    }

    static String b(Participant participant)
    {
        return hl.e(participant).a("ParticipantId", participant.getParticipantId()).a("Player", participant.getPlayer()).a("Status", Integer.valueOf(participant.getStatus())).a("ClientAddress", participant.gR()).a("ConnectedToRoom", Boolean.valueOf(participant.isConnectedToRoom())).a("DisplayName", participant.getDisplayName()).a("IconImage", participant.getIconImageUri()).a("IconImageUrl", participant.getIconImageUrl()).a("HiResImage", participant.getHiResImageUri()).a("HiResImageUrl", participant.getHiResImageUrl()).a("Capabilities", Integer.valueOf(participant.getCapabilities())).a("Result", participant.getResult()).toString();
    }

    static boolean b(Integer integer)
    {
        return c(integer);
    }

    static Integer gM()
    {
        return fl();
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

    public String gR()
    {
        return Nk;
    }

    public int getCapabilities()
    {
        return Am;
    }

    public String getDisplayName()
    {
        if (Ng == null)
        {
            return Lk;
        } else
        {
            return Ng.getDisplayName();
        }
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        if (Ng == null)
        {
            il.b(Lk, chararraybuffer);
            return;
        } else
        {
            Ng.getDisplayName(chararraybuffer);
            return;
        }
    }

    public Uri getHiResImageUri()
    {
        if (Ng == null)
        {
            return Mp;
        } else
        {
            return Ng.getHiResImageUri();
        }
    }

    public String getHiResImageUrl()
    {
        if (Ng == null)
        {
            return MA;
        } else
        {
            return Ng.getHiResImageUrl();
        }
    }

    public Uri getIconImageUri()
    {
        if (Ng == null)
        {
            return Mo;
        } else
        {
            return Ng.getIconImageUri();
        }
    }

    public String getIconImageUrl()
    {
        if (Ng == null)
        {
            return Mz;
        } else
        {
            return Ng.getIconImageUrl();
        }
    }

    public String getParticipantId()
    {
        return On;
    }

    public Player getPlayer()
    {
        return Ng;
    }

    public ParticipantResult getResult()
    {
        return Ta;
    }

    public int getStatus()
    {
        return SY;
    }

    public int getVersionCode()
    {
        return xJ;
    }

    public int hashCode()
    {
        return a(this);
    }

    public boolean isConnectedToRoom()
    {
        return SZ;
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
        if (!fm())
        {
            ParticipantEntityCreator.a(this, parcel, i);
        } else
        {
            parcel.writeString(On);
            parcel.writeString(Lk);
            String s;
            int j;
            if (Mo == null)
            {
                s = null;
            } else
            {
                s = Mo.toString();
            }
            parcel.writeString(s);
            if (Mp == null)
            {
                s = obj;
            } else
            {
                s = Mp.toString();
            }
            parcel.writeString(s);
            parcel.writeInt(SY);
            parcel.writeString(Nk);
            if (SZ)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            parcel.writeInt(j);
            if (Ng == null)
            {
                j = ((flag) ? 1 : 0);
            } else
            {
                j = 1;
            }
            parcel.writeInt(j);
            if (Ng != null)
            {
                Ng.writeToParcel(parcel, i);
                return;
            }
        }
    }

}
