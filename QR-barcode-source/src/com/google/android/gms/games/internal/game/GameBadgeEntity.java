// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            GameBadge, GameBadgeEntityCreator

public final class GameBadgeEntity extends GamesDowngradeableSafeParcel
    implements GameBadge
{
    static final class GameBadgeEntityCreatorCompat extends GameBadgeEntityCreator
    {

        public GameBadgeEntity ch(Parcel parcel)
        {
            if (GameBadgeEntity.b(GameBadgeEntity.jT()) || GameBadgeEntity.bw(com/google/android/gms/games/internal/game/GameBadgeEntity.getCanonicalName()))
            {
                return super.ch(parcel);
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
            return ch(parcel);
        }

        GameBadgeEntityCreatorCompat()
        {
        }
    }


    public static final GameBadgeEntityCreator CREATOR = new GameBadgeEntityCreatorCompat();
    private final int BR;
    private int FD;
    private String Nw;
    private String Tr;
    private Uri Vh;

    GameBadgeEntity(int i, int j, String s, String s1, Uri uri)
    {
        BR = i;
        FD = j;
        Nw = s;
        Tr = s1;
        Vh = uri;
    }

    public GameBadgeEntity(GameBadge gamebadge)
    {
        BR = 1;
        FD = gamebadge.getType();
        Nw = gamebadge.getTitle();
        Tr = gamebadge.getDescription();
        Vh = gamebadge.getIconImageUri();
    }

    static int a(GameBadge gamebadge)
    {
        return n.hashCode(new Object[] {
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
        if (!n.equal(Integer.valueOf(((GameBadge) (obj)).getType()), gamebadge.getTitle()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (n.equal(((GameBadge) (obj)).getDescription(), gamebadge.getIconImageUri())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(GameBadge gamebadge)
    {
        return n.h(gamebadge).a("Type", Integer.valueOf(gamebadge.getType())).a("Title", gamebadge.getTitle()).a("Description", gamebadge.getDescription()).a("IconImageUri", gamebadge.getIconImageUri()).toString();
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

    public Object freeze()
    {
        return ld();
    }

    public String getDescription()
    {
        return Tr;
    }

    public Uri getIconImageUri()
    {
        return Vh;
    }

    public String getTitle()
    {
        return Nw;
    }

    public int getType()
    {
        return FD;
    }

    public int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return a(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public GameBadge ld()
    {
        return this;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (!gQ())
        {
            GameBadgeEntityCreator.a(this, parcel, i);
            return;
        }
        parcel.writeInt(FD);
        parcel.writeString(Nw);
        parcel.writeString(Tr);
        String s;
        if (Vh == null)
        {
            s = null;
        } else
        {
            s = Vh.toString();
        }
        parcel.writeString(s);
    }

}
