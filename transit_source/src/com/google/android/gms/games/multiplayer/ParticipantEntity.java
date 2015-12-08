// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.en;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Participant, c

public final class ParticipantEntity extends en
    implements Participant
{
    static final class a extends c
    {

        public Object createFromParcel(Parcel parcel)
        {
            return w(parcel);
        }

        public ParticipantEntity w(Parcel parcel)
        {
            boolean flag = false;
            if (ParticipantEntity.b(ParticipantEntity.bQ()) || ParticipantEntity.J(com/google/android/gms/games/multiplayer/ParticipantEntity.getCanonicalName()))
            {
                return super.w(parcel);
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
            if (parcel.readInt() > 0)
            {
                flag = true;
            }
            if (flag)
            {
                parcel = (PlayerEntity)PlayerEntity.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            return new ParticipantEntity(1, s, s1, ((Uri) (obj)), ((Uri) (obj1)), i, s2, flag1, parcel, 7);
        }

        a()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final int iM;
    private final String ml;
    private final Uri mq;
    private final Uri mr;
    private final int nU;
    private final String nV;
    private final boolean nW;
    private final PlayerEntity nX;
    private final int nY;
    private final String nd;

    ParticipantEntity(int i, String s, String s1, Uri uri, Uri uri1, int j, String s2, 
            boolean flag, PlayerEntity playerentity, int k)
    {
        iM = i;
        nd = s;
        ml = s1;
        mq = uri;
        mr = uri1;
        nU = j;
        nV = s2;
        nW = flag;
        nX = playerentity;
        nY = k;
    }

    public ParticipantEntity(Participant participant)
    {
        iM = 1;
        nd = participant.getParticipantId();
        ml = participant.getDisplayName();
        mq = participant.getIconImageUri();
        mr = participant.getHiResImageUri();
        nU = participant.getStatus();
        nV = participant.ci();
        nW = participant.isConnectedToRoom();
        Object obj = participant.getPlayer();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = new PlayerEntity(((Player) (obj)));
        }
        nX = ((PlayerEntity) (obj));
        nY = participant.getCapabilities();
    }

    static boolean J(String s)
    {
        return y(s);
    }

    static int a(Participant participant)
    {
        return dl.hashCode(new Object[] {
            participant.getPlayer(), Integer.valueOf(participant.getStatus()), participant.ci(), Boolean.valueOf(participant.isConnectedToRoom()), participant.getDisplayName(), participant.getIconImageUri(), participant.getHiResImageUri(), Integer.valueOf(participant.getCapabilities())
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
        if (!dl.equal(((Participant) (obj)).getPlayer(), participant.getPlayer()) || !dl.equal(Integer.valueOf(((Participant) (obj)).getStatus()), Integer.valueOf(participant.getStatus())) || !dl.equal(((Participant) (obj)).ci(), participant.ci()) || !dl.equal(Boolean.valueOf(((Participant) (obj)).isConnectedToRoom()), Boolean.valueOf(participant.isConnectedToRoom())) || !dl.equal(((Participant) (obj)).getDisplayName(), participant.getDisplayName()) || !dl.equal(((Participant) (obj)).getIconImageUri(), participant.getIconImageUri()) || !dl.equal(((Participant) (obj)).getHiResImageUri(), participant.getHiResImageUri()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (dl.equal(Integer.valueOf(((Participant) (obj)).getCapabilities()), Integer.valueOf(participant.getCapabilities()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(Participant participant)
    {
        return dl.d(participant).a("Player", participant.getPlayer()).a("Status", Integer.valueOf(participant.getStatus())).a("ClientAddress", participant.ci()).a("ConnectedToRoom", Boolean.valueOf(participant.isConnectedToRoom())).a("DisplayName", participant.getDisplayName()).a("IconImage", participant.getIconImageUri()).a("HiResImage", participant.getHiResImageUri()).a("Capabilities", Integer.valueOf(participant.getCapabilities())).toString();
    }

    static boolean b(Integer integer)
    {
        return c(integer);
    }

    static Integer bQ()
    {
        return aW();
    }

    public String ci()
    {
        return nV;
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
        return nY;
    }

    public String getDisplayName()
    {
        if (nX == null)
        {
            return ml;
        } else
        {
            return nX.getDisplayName();
        }
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        if (nX == null)
        {
            eg.b(ml, chararraybuffer);
            return;
        } else
        {
            nX.getDisplayName(chararraybuffer);
            return;
        }
    }

    public Uri getHiResImageUri()
    {
        if (nX == null)
        {
            return mr;
        } else
        {
            return nX.getHiResImageUri();
        }
    }

    public Uri getIconImageUri()
    {
        if (nX == null)
        {
            return mq;
        } else
        {
            return nX.getIconImageUri();
        }
    }

    public String getParticipantId()
    {
        return nd;
    }

    public Player getPlayer()
    {
        return nX;
    }

    public int getStatus()
    {
        return nU;
    }

    public int getVersionCode()
    {
        return iM;
    }

    public int hashCode()
    {
        return a(this);
    }

    public boolean isConnectedToRoom()
    {
        return nW;
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
        if (!aX())
        {
            c.a(this, parcel, i);
        } else
        {
            parcel.writeString(nd);
            parcel.writeString(ml);
            String s;
            int j;
            if (mq == null)
            {
                s = null;
            } else
            {
                s = mq.toString();
            }
            parcel.writeString(s);
            if (mr == null)
            {
                s = obj;
            } else
            {
                s = mr.toString();
            }
            parcel.writeString(s);
            parcel.writeInt(nU);
            parcel.writeString(nV);
            if (nW)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            parcel.writeInt(j);
            if (nX == null)
            {
                j = ((flag) ? 1 : 0);
            } else
            {
                j = 1;
            }
            parcel.writeInt(j);
            if (nX != null)
            {
                nX.writeToParcel(parcel, i);
                return;
            }
        }
    }

}
