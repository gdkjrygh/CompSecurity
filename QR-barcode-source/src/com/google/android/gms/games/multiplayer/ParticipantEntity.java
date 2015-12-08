// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.jv;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Participant, ParticipantEntityCreator, ParticipantResult

public final class ParticipantEntity extends GamesDowngradeableSafeParcel
    implements Participant
{
    static final class ParticipantEntityCreatorCompat extends ParticipantEntityCreator
    {

        public ParticipantEntity cm(Parcel parcel)
        {
            boolean flag = true;
            if (ParticipantEntity.b(ParticipantEntity.jT()) || ParticipantEntity.bw(com/google/android/gms/games/multiplayer/ParticipantEntity.getCanonicalName()))
            {
                return super.cm(parcel);
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
            return cm(parcel);
        }

        ParticipantEntityCreatorCompat()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new ParticipantEntityCreatorCompat();
    private final int BR;
    private final int EZ;
    private final int Fa;
    private final String NH;
    private final Uri Vh;
    private final Uri Vi;
    private final String Vs;
    private final String Vt;
    private final PlayerEntity Wh;
    private final String Wq;
    private final String Xr;
    private final boolean acg;
    private final ParticipantResult ach;

    ParticipantEntity(int i, String s, String s1, Uri uri, Uri uri1, int j, String s2, 
            boolean flag, PlayerEntity playerentity, int k, ParticipantResult participantresult, String s3, String s4)
    {
        BR = i;
        Xr = s;
        NH = s1;
        Vh = uri;
        Vi = uri1;
        Fa = j;
        Wq = s2;
        acg = flag;
        Wh = playerentity;
        EZ = k;
        ach = participantresult;
        Vs = s3;
        Vt = s4;
    }

    public ParticipantEntity(Participant participant)
    {
        BR = 3;
        Xr = participant.getParticipantId();
        NH = participant.getDisplayName();
        Vh = participant.getIconImageUri();
        Vi = participant.getHiResImageUri();
        Fa = participant.getStatus();
        Wq = participant.jX();
        acg = participant.isConnectedToRoom();
        Object obj = participant.getPlayer();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = new PlayerEntity(((Player) (obj)));
        }
        Wh = ((PlayerEntity) (obj));
        EZ = participant.getCapabilities();
        ach = participant.getResult();
        Vs = participant.getIconImageUrl();
        Vt = participant.getHiResImageUrl();
    }

    static int a(Participant participant)
    {
        return n.hashCode(new Object[] {
            participant.getPlayer(), Integer.valueOf(participant.getStatus()), participant.jX(), Boolean.valueOf(participant.isConnectedToRoom()), participant.getDisplayName(), participant.getIconImageUri(), participant.getHiResImageUri(), Integer.valueOf(participant.getCapabilities()), participant.getResult(), participant.getParticipantId()
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
        if (!n.equal(((Participant) (obj)).getPlayer(), participant.getPlayer()) || !n.equal(Integer.valueOf(((Participant) (obj)).getStatus()), Integer.valueOf(participant.getStatus())) || !n.equal(((Participant) (obj)).jX(), participant.jX()) || !n.equal(Boolean.valueOf(((Participant) (obj)).isConnectedToRoom()), Boolean.valueOf(participant.isConnectedToRoom())) || !n.equal(((Participant) (obj)).getDisplayName(), participant.getDisplayName()) || !n.equal(((Participant) (obj)).getIconImageUri(), participant.getIconImageUri()) || !n.equal(((Participant) (obj)).getHiResImageUri(), participant.getHiResImageUri()) || !n.equal(Integer.valueOf(((Participant) (obj)).getCapabilities()), Integer.valueOf(participant.getCapabilities())) || !n.equal(((Participant) (obj)).getResult(), participant.getResult()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (n.equal(((Participant) (obj)).getParticipantId(), participant.getParticipantId())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(Participant participant)
    {
        return n.h(participant).a("ParticipantId", participant.getParticipantId()).a("Player", participant.getPlayer()).a("Status", Integer.valueOf(participant.getStatus())).a("ClientAddress", participant.jX()).a("ConnectedToRoom", Boolean.valueOf(participant.isConnectedToRoom())).a("DisplayName", participant.getDisplayName()).a("IconImage", participant.getIconImageUri()).a("IconImageUrl", participant.getIconImageUrl()).a("HiResImage", participant.getHiResImageUri()).a("HiResImageUrl", participant.getHiResImageUrl()).a("Capabilities", Integer.valueOf(participant.getCapabilities())).a("Result", participant.getResult()).toString();
    }

    static boolean b(Integer integer)
    {
        return c(integer);
    }

    static boolean bw(String s)
    {
        return aV(s);
    }

    static Integer jT()
    {
        return gP();
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
        return EZ;
    }

    public String getDisplayName()
    {
        if (Wh == null)
        {
            return NH;
        } else
        {
            return Wh.getDisplayName();
        }
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        if (Wh == null)
        {
            jv.b(NH, chararraybuffer);
            return;
        } else
        {
            Wh.getDisplayName(chararraybuffer);
            return;
        }
    }

    public Uri getHiResImageUri()
    {
        if (Wh == null)
        {
            return Vi;
        } else
        {
            return Wh.getHiResImageUri();
        }
    }

    public String getHiResImageUrl()
    {
        if (Wh == null)
        {
            return Vt;
        } else
        {
            return Wh.getHiResImageUrl();
        }
    }

    public Uri getIconImageUri()
    {
        if (Wh == null)
        {
            return Vh;
        } else
        {
            return Wh.getIconImageUri();
        }
    }

    public String getIconImageUrl()
    {
        if (Wh == null)
        {
            return Vs;
        } else
        {
            return Wh.getIconImageUrl();
        }
    }

    public String getParticipantId()
    {
        return Xr;
    }

    public Player getPlayer()
    {
        return Wh;
    }

    public ParticipantResult getResult()
    {
        return ach;
    }

    public int getStatus()
    {
        return Fa;
    }

    public int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return a(this);
    }

    public boolean isConnectedToRoom()
    {
        return acg;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String jX()
    {
        return Wq;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        Object obj = null;
        boolean flag = false;
        if (!gQ())
        {
            ParticipantEntityCreator.a(this, parcel, i);
        } else
        {
            parcel.writeString(Xr);
            parcel.writeString(NH);
            String s;
            int j;
            if (Vh == null)
            {
                s = null;
            } else
            {
                s = Vh.toString();
            }
            parcel.writeString(s);
            if (Vi == null)
            {
                s = obj;
            } else
            {
                s = Vi.toString();
            }
            parcel.writeString(s);
            parcel.writeInt(Fa);
            parcel.writeString(Wq);
            if (acg)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            parcel.writeInt(j);
            if (Wh == null)
            {
                j = ((flag) ? 1 : 0);
            } else
            {
                j = 1;
            }
            parcel.writeInt(j);
            if (Wh != null)
            {
                Wh.writeToParcel(parcel, i);
                return;
            }
        }
    }

}
