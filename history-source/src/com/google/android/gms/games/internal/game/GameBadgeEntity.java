// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.jv;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            GameBadge, GameBadgeEntityCreator

public final class GameBadgeEntity extends GamesDowngradeableSafeParcel
    implements GameBadge
{
    static final class GameBadgeEntityCreatorCompat extends GameBadgeEntityCreator
    {

        public Object createFromParcel(Parcel parcel)
        {
            return cv(parcel);
        }

        public GameBadgeEntity cv(Parcel parcel)
        {
            if (GameBadgeEntity.b(GameBadgeEntity.kD()) || GameBadgeEntity.bz(com/google/android/gms/games/internal/game/GameBadgeEntity.getCanonicalName()))
            {
                return super.cv(parcel);
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

        GameBadgeEntityCreatorCompat()
        {
        }
    }


    public static final GameBadgeEntityCreator CREATOR = new GameBadgeEntityCreatorCompat();
    private final int CK;
    private int Gt;
    private String OH;
    private String UO;
    private Uri WD;

    GameBadgeEntity(int i, int j, String s, String s1, Uri uri)
    {
        CK = i;
        Gt = j;
        OH = s;
        UO = s1;
        WD = uri;
    }

    public GameBadgeEntity(GameBadge gamebadge)
    {
        CK = 1;
        Gt = gamebadge.getType();
        OH = gamebadge.getTitle();
        UO = gamebadge.getDescription();
        WD = gamebadge.getIconImageUri();
    }

    static int a(GameBadge gamebadge)
    {
        return jv.hashCode(new Object[] {
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
        if (!jv.equal(Integer.valueOf(((GameBadge) (obj)).getType()), gamebadge.getTitle()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (jv.equal(((GameBadge) (obj)).getDescription(), gamebadge.getIconImageUri())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(GameBadge gamebadge)
    {
        return jv.h(gamebadge).a("Type", Integer.valueOf(gamebadge.getType())).a("Title", gamebadge.getTitle()).a("Description", gamebadge.getDescription()).a("IconImageUri", gamebadge.getIconImageUri()).toString();
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

    public Object freeze()
    {
        return mk();
    }

    public String getDescription()
    {
        return UO;
    }

    public Uri getIconImageUri()
    {
        return WD;
    }

    public String getTitle()
    {
        return OH;
    }

    public int getType()
    {
        return Gt;
    }

    public int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return a(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public GameBadge mk()
    {
        return this;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (!hu())
        {
            GameBadgeEntityCreator.a(this, parcel, i);
            return;
        }
        parcel.writeInt(Gt);
        parcel.writeString(OH);
        parcel.writeString(UO);
        String s;
        if (WD == null)
        {
            s = null;
        } else
        {
            s = WD.toString();
        }
        parcel.writeString(s);
    }

}
