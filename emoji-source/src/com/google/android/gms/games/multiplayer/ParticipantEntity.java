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
import com.google.android.gms.internal.hk;
import com.google.android.gms.internal.ik;

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
            if (ParticipantEntity.b(ParticipantEntity.gR()) || ParticipantEntity.aQ(com/google/android/gms/games/multiplayer/ParticipantEntity.getCanonicalName()))
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
    private final int Ap;
    private final String Ln;
    private final String MC;
    private final String MD;
    private final Uri Mr;
    private final Uri Ms;
    private final PlayerEntity Nj;
    private final String Nn;
    private final String Oq;
    private final int Tb;
    private final boolean Tc;
    private final ParticipantResult Td;
    private final int xM;

    ParticipantEntity(int i, String s, String s1, Uri uri, Uri uri1, int j, String s2, 
            boolean flag, PlayerEntity playerentity, int k, ParticipantResult participantresult, String s3, String s4)
    {
        xM = i;
        Oq = s;
        Ln = s1;
        Mr = uri;
        Ms = uri1;
        Tb = j;
        Nn = s2;
        Tc = flag;
        Nj = playerentity;
        Ap = k;
        Td = participantresult;
        MC = s3;
        MD = s4;
    }

    public ParticipantEntity(Participant participant)
    {
        xM = 3;
        Oq = participant.getParticipantId();
        Ln = participant.getDisplayName();
        Mr = participant.getIconImageUri();
        Ms = participant.getHiResImageUri();
        Tb = participant.getStatus();
        Nn = participant.gW();
        Tc = participant.isConnectedToRoom();
        Object obj = participant.getPlayer();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = new PlayerEntity(((Player) (obj)));
        }
        Nj = ((PlayerEntity) (obj));
        Ap = participant.getCapabilities();
        Td = participant.getResult();
        MC = participant.getIconImageUrl();
        MD = participant.getHiResImageUrl();
    }

    static int a(Participant participant)
    {
        return hk.hashCode(new Object[] {
            participant.getPlayer(), Integer.valueOf(participant.getStatus()), participant.gW(), Boolean.valueOf(participant.isConnectedToRoom()), participant.getDisplayName(), participant.getIconImageUri(), participant.getHiResImageUri(), Integer.valueOf(participant.getCapabilities()), participant.getResult(), participant.getParticipantId()
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
        if (!hk.equal(((Participant) (obj)).getPlayer(), participant.getPlayer()) || !hk.equal(Integer.valueOf(((Participant) (obj)).getStatus()), Integer.valueOf(participant.getStatus())) || !hk.equal(((Participant) (obj)).gW(), participant.gW()) || !hk.equal(Boolean.valueOf(((Participant) (obj)).isConnectedToRoom()), Boolean.valueOf(participant.isConnectedToRoom())) || !hk.equal(((Participant) (obj)).getDisplayName(), participant.getDisplayName()) || !hk.equal(((Participant) (obj)).getIconImageUri(), participant.getIconImageUri()) || !hk.equal(((Participant) (obj)).getHiResImageUri(), participant.getHiResImageUri()) || !hk.equal(Integer.valueOf(((Participant) (obj)).getCapabilities()), Integer.valueOf(participant.getCapabilities())) || !hk.equal(((Participant) (obj)).getResult(), participant.getResult()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hk.equal(((Participant) (obj)).getParticipantId(), participant.getParticipantId())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static boolean aQ(String s)
    {
        return aA(s);
    }

    static String b(Participant participant)
    {
        return hk.e(participant).a("ParticipantId", participant.getParticipantId()).a("Player", participant.getPlayer()).a("Status", Integer.valueOf(participant.getStatus())).a("ClientAddress", participant.gW()).a("ConnectedToRoom", Boolean.valueOf(participant.isConnectedToRoom())).a("DisplayName", participant.getDisplayName()).a("IconImage", participant.getIconImageUri()).a("IconImageUrl", participant.getIconImageUrl()).a("HiResImage", participant.getHiResImageUri()).a("HiResImageUrl", participant.getHiResImageUrl()).a("Capabilities", Integer.valueOf(participant.getCapabilities())).a("Result", participant.getResult()).toString();
    }

    static boolean b(Integer integer)
    {
        return c(integer);
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

    public Participant freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public String gW()
    {
        return Nn;
    }

    public int getCapabilities()
    {
        return Ap;
    }

    public String getDisplayName()
    {
        if (Nj == null)
        {
            return Ln;
        } else
        {
            return Nj.getDisplayName();
        }
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        if (Nj == null)
        {
            ik.b(Ln, chararraybuffer);
            return;
        } else
        {
            Nj.getDisplayName(chararraybuffer);
            return;
        }
    }

    public Uri getHiResImageUri()
    {
        if (Nj == null)
        {
            return Ms;
        } else
        {
            return Nj.getHiResImageUri();
        }
    }

    public String getHiResImageUrl()
    {
        if (Nj == null)
        {
            return MD;
        } else
        {
            return Nj.getHiResImageUrl();
        }
    }

    public Uri getIconImageUri()
    {
        if (Nj == null)
        {
            return Mr;
        } else
        {
            return Nj.getIconImageUri();
        }
    }

    public String getIconImageUrl()
    {
        if (Nj == null)
        {
            return MC;
        } else
        {
            return Nj.getIconImageUrl();
        }
    }

    public String getParticipantId()
    {
        return Oq;
    }

    public Player getPlayer()
    {
        return Nj;
    }

    public ParticipantResult getResult()
    {
        return Td;
    }

    public int getStatus()
    {
        return Tb;
    }

    public int getVersionCode()
    {
        return xM;
    }

    public int hashCode()
    {
        return a(this);
    }

    public boolean isConnectedToRoom()
    {
        return Tc;
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
        if (!fr())
        {
            ParticipantEntityCreator.a(this, parcel, i);
        } else
        {
            parcel.writeString(Oq);
            parcel.writeString(Ln);
            String s;
            int j;
            if (Mr == null)
            {
                s = null;
            } else
            {
                s = Mr.toString();
            }
            parcel.writeString(s);
            if (Ms == null)
            {
                s = obj;
            } else
            {
                s = Ms.toString();
            }
            parcel.writeString(s);
            parcel.writeInt(Tb);
            parcel.writeString(Nn);
            if (Tc)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            parcel.writeInt(j);
            if (Nj == null)
            {
                j = ((flag) ? 1 : 0);
            } else
            {
                j = 1;
            }
            parcel.writeInt(j);
            if (Nj != null)
            {
                Nj.writeToParcel(parcel, i);
                return;
            }
        }
    }

}
