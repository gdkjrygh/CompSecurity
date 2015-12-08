// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.internal.db;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.en;

// Referenced classes of package com.google.android.gms.games:
//            Player, c

public final class PlayerEntity extends en
    implements Player
{
    static final class a extends c
    {

        public Object createFromParcel(Parcel parcel)
        {
            return u(parcel);
        }

        public PlayerEntity u(Parcel parcel)
        {
            Uri uri = null;
            if (PlayerEntity.b(PlayerEntity.bQ()) || PlayerEntity.J(com/google/android/gms/games/PlayerEntity.getCanonicalName()))
            {
                return super.u(parcel);
            }
            String s = parcel.readString();
            String s1 = parcel.readString();
            Object obj = parcel.readString();
            String s2 = parcel.readString();
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = Uri.parse(((String) (obj)));
            }
            if (s2 != null)
            {
                uri = Uri.parse(s2);
            }
            return new PlayerEntity(1, s, s1, ((Uri) (obj)), uri, parcel.readLong());
        }

        a()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final int iM;
    private final String mD;
    private final long mE;
    private final String ml;
    private final Uri mq;
    private final Uri mr;

    PlayerEntity(int i, String s, String s1, Uri uri, Uri uri1, long l)
    {
        iM = i;
        mD = s;
        ml = s1;
        mq = uri;
        mr = uri1;
        mE = l;
    }

    public PlayerEntity(Player player)
    {
        boolean flag = true;
        super();
        iM = 1;
        mD = player.getPlayerId();
        ml = player.getDisplayName();
        mq = player.getIconImageUri();
        mr = player.getHiResImageUri();
        mE = player.getRetrievedTimestamp();
        db.c(mD);
        db.c(ml);
        if (mE <= 0L)
        {
            flag = false;
        }
        db.k(flag);
    }

    static boolean J(String s)
    {
        return y(s);
    }

    static int a(Player player)
    {
        return dl.hashCode(new Object[] {
            player.getPlayerId(), player.getDisplayName(), player.getIconImageUri(), player.getHiResImageUri(), Long.valueOf(player.getRetrievedTimestamp())
        });
    }

    static boolean a(Player player, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof Player) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (player == obj) goto _L4; else goto _L3
_L3:
        obj = (Player)obj;
        if (!dl.equal(((Player) (obj)).getPlayerId(), player.getPlayerId()) || !dl.equal(((Player) (obj)).getDisplayName(), player.getDisplayName()) || !dl.equal(((Player) (obj)).getIconImageUri(), player.getIconImageUri()) || !dl.equal(((Player) (obj)).getHiResImageUri(), player.getHiResImageUri()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (dl.equal(Long.valueOf(((Player) (obj)).getRetrievedTimestamp()), Long.valueOf(player.getRetrievedTimestamp()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(Player player)
    {
        return dl.d(player).a("PlayerId", player.getPlayerId()).a("DisplayName", player.getDisplayName()).a("IconImageUri", player.getIconImageUri()).a("HiResImageUri", player.getHiResImageUri()).a("RetrievedTimestamp", Long.valueOf(player.getRetrievedTimestamp())).toString();
    }

    static boolean b(Integer integer)
    {
        return c(integer);
    }

    static Integer bQ()
    {
        return aW();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Player freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public String getDisplayName()
    {
        return ml;
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        eg.b(ml, chararraybuffer);
    }

    public Uri getHiResImageUri()
    {
        return mr;
    }

    public Uri getIconImageUri()
    {
        return mq;
    }

    public String getPlayerId()
    {
        return mD;
    }

    public long getRetrievedTimestamp()
    {
        return mE;
    }

    public int getVersionCode()
    {
        return iM;
    }

    public boolean hasHiResImage()
    {
        return getHiResImageUri() != null;
    }

    public boolean hasIconImage()
    {
        return getIconImageUri() != null;
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
        Object obj = null;
        if (!aX())
        {
            c.a(this, parcel, i);
            return;
        }
        parcel.writeString(mD);
        parcel.writeString(ml);
        String s;
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
        parcel.writeLong(mE);
    }

}
