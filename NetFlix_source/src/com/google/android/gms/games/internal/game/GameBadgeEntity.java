// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.fo;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            GameBadge, GameBadgeEntityCreator

public final class GameBadgeEntity extends GamesDowngradeableSafeParcel
    implements GameBadge
{
    static final class GameBadgeEntityCreatorCompat extends GameBadgeEntityCreator
    {

        public GameBadgeEntity ar(Parcel parcel)
        {
            if (GameBadgeEntity.b(GameBadgeEntity.gg()) || GameBadgeEntity.az(com/google/android/gms/games/internal/game/GameBadgeEntity.getCanonicalName()))
            {
                return super.ar(parcel);
            }
            int i = parcel.readInt();
            String s = parcel.readString();
            String s1 = parcel.readString();
            parcel = parcel.readString();
            if (parcel == null)
            {
                parcel = null;
            } else
            {
                parcel = Uri.parse(parcel);
            }
            return new GameBadgeEntity(1, i, s, s1, parcel);
        }

        public Object createFromParcel(Parcel parcel)
        {
            return ar(parcel);
        }

        GameBadgeEntityCreatorCompat()
        {
        }
    }


    public static final GameBadgeEntityCreator CREATOR = new GameBadgeEntityCreatorCompat();
    private String EB;
    private String HD;
    private Uri HF;
    private int LF;
    private final int xH;

    GameBadgeEntity(int i, int j, String s, String s1, Uri uri)
    {
        xH = i;
        LF = j;
        EB = s;
        HD = s1;
        HF = uri;
    }

    public GameBadgeEntity(GameBadge gamebadge)
    {
        xH = 1;
        LF = gamebadge.getType();
        EB = gamebadge.getTitle();
        HD = gamebadge.getDescription();
        HF = gamebadge.getIconImageUri();
    }

    static int a(GameBadge gamebadge)
    {
        return fo.hashCode(new Object[] {
            Integer.valueOf(gamebadge.getType()), gamebadge.getTitle(), gamebadge.getDescription(), gamebadge.getIconImageUri()
        });
    }

    static boolean a(GameBadge gamebadge, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof GameBadge) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (gamebadge == obj) goto _L4; else goto _L3
_L3:
        obj = (GameBadge)obj;
        if (!fo.equal(Integer.valueOf(((GameBadge) (obj)).getType()), gamebadge.getTitle()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (fo.equal(((GameBadge) (obj)).getDescription(), gamebadge.getIconImageUri())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static boolean az(String s)
    {
        return al(s);
    }

    static String b(GameBadge gamebadge)
    {
        return fo.e(gamebadge).a("Type", Integer.valueOf(gamebadge.getType())).a("Title", gamebadge.getTitle()).a("Description", gamebadge.getDescription()).a("IconImageUri", gamebadge.getIconImageUri()).toString();
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

    public Object freeze()
    {
        return hh();
    }

    public String getDescription()
    {
        return HD;
    }

    public Uri getIconImageUri()
    {
        return HF;
    }

    public String getTitle()
    {
        return EB;
    }

    public int getType()
    {
        return LF;
    }

    public int getVersionCode()
    {
        return xH;
    }

    public int hashCode()
    {
        return a(this);
    }

    public GameBadge hh()
    {
        return this;
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
        if (!eK())
        {
            GameBadgeEntityCreator.a(this, parcel, i);
            return;
        }
        parcel.writeInt(LF);
        parcel.writeString(EB);
        parcel.writeString(HD);
        String s;
        if (HF == null)
        {
            s = null;
        } else
        {
            s = HF.toString();
        }
        parcel.writeString(s);
    }

}
