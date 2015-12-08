// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.fb;
import com.google.android.gms.internal.fo;
import com.google.android.gms.internal.gm;

// Referenced classes of package com.google.android.gms.games:
//            Player, PlayerEntityCreator

public final class PlayerEntity extends GamesDowngradeableSafeParcel
    implements Player
{
    static final class PlayerEntityCreatorCompat extends PlayerEntityCreator
    {

        public PlayerEntity ao(Parcel parcel)
        {
            if (PlayerEntity.b(PlayerEntity.gg()) || PlayerEntity.az(com/google/android/gms/games/PlayerEntity.getCanonicalName()))
            {
                return super.ao(parcel);
            }
            String s = parcel.readString();
            String s1 = parcel.readString();
            Object obj = parcel.readString();
            Object obj1 = parcel.readString();
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = Uri.parse(((String) (obj)));
            }
            if (obj1 == null)
            {
                obj1 = null;
            } else
            {
                obj1 = Uri.parse(((String) (obj1)));
            }
            return new PlayerEntity(4, s, s1, ((Uri) (obj)), ((Uri) (obj1)), parcel.readLong(), -1, -1L, null, null);
        }

        public Object createFromParcel(Parcel parcel)
        {
            return ao(parcel);
        }

        PlayerEntityCreatorCompat()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new PlayerEntityCreatorCompat();
    private final String HA;
    private final Uri HF;
    private final Uri HG;
    private final String HQ;
    private final String HR;
    private final String Ie;
    private final long If;
    private final int Ig;
    private final long Ih;
    private final int xH;

    PlayerEntity(int i, String s, String s1, Uri uri, Uri uri1, long l, 
            int j, long l1, String s2, String s3)
    {
        xH = i;
        Ie = s;
        HA = s1;
        HF = uri;
        HQ = s2;
        HG = uri1;
        HR = s3;
        If = l;
        Ig = j;
        Ih = l1;
    }

    public PlayerEntity(Player player)
    {
        xH = 4;
        Ie = player.getPlayerId();
        HA = player.getDisplayName();
        HF = player.getIconImageUri();
        HQ = player.getIconImageUrl();
        HG = player.getHiResImageUri();
        HR = player.getHiResImageUrl();
        If = player.getRetrievedTimestamp();
        Ig = player.gh();
        Ih = player.getLastPlayedWithTimestamp();
        fb.d(Ie);
        fb.d(HA);
        boolean flag;
        if (If > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fb.x(flag);
    }

    static int a(Player player)
    {
        return fo.hashCode(new Object[] {
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
        if (!fo.equal(((Player) (obj)).getPlayerId(), player.getPlayerId()) || !fo.equal(((Player) (obj)).getDisplayName(), player.getDisplayName()) || !fo.equal(((Player) (obj)).getIconImageUri(), player.getIconImageUri()) || !fo.equal(((Player) (obj)).getHiResImageUri(), player.getHiResImageUri()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (fo.equal(Long.valueOf(((Player) (obj)).getRetrievedTimestamp()), Long.valueOf(player.getRetrievedTimestamp()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static boolean az(String s)
    {
        return al(s);
    }

    static String b(Player player)
    {
        return fo.e(player).a("PlayerId", player.getPlayerId()).a("DisplayName", player.getDisplayName()).a("IconImageUri", player.getIconImageUri()).a("IconImageUrl", player.getIconImageUrl()).a("HiResImageUri", player.getHiResImageUri()).a("HiResImageUrl", player.getHiResImageUrl()).a("RetrievedTimestamp", Long.valueOf(player.getRetrievedTimestamp())).toString();
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
        return HA;
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        gm.b(HA, chararraybuffer);
    }

    public Uri getHiResImageUri()
    {
        return HG;
    }

    public String getHiResImageUrl()
    {
        return HR;
    }

    public Uri getIconImageUri()
    {
        return HF;
    }

    public String getIconImageUrl()
    {
        return HQ;
    }

    public long getLastPlayedWithTimestamp()
    {
        return Ih;
    }

    public String getPlayerId()
    {
        return Ie;
    }

    public long getRetrievedTimestamp()
    {
        return If;
    }

    public int getVersionCode()
    {
        return xH;
    }

    public int gh()
    {
        return Ig;
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
        if (!eK())
        {
            PlayerEntityCreator.a(this, parcel, i);
            return;
        }
        parcel.writeString(Ie);
        parcel.writeString(HA);
        String s;
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
        parcel.writeLong(If);
    }

}
