// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hk;

// Referenced classes of package com.google.android.gms.games.internal.player:
//            MostRecentGameInfo, MostRecentGameInfoEntityCreator

public final class MostRecentGameInfoEntity
    implements SafeParcelable, MostRecentGameInfo
{

    public static final MostRecentGameInfoEntityCreator CREATOR = new MostRecentGameInfoEntityCreator();
    private final String RI;
    private final String RJ;
    private final long RK;
    private final Uri RL;
    private final Uri RM;
    private final Uri RN;
    private final int xM;

    MostRecentGameInfoEntity(int i, String s, String s1, long l, Uri uri, Uri uri1, 
            Uri uri2)
    {
        xM = i;
        RI = s;
        RJ = s1;
        RK = l;
        RL = uri;
        RM = uri1;
        RN = uri2;
    }

    public MostRecentGameInfoEntity(MostRecentGameInfo mostrecentgameinfo)
    {
        xM = 2;
        RI = mostrecentgameinfo.ip();
        RJ = mostrecentgameinfo.iq();
        RK = mostrecentgameinfo.ir();
        RL = mostrecentgameinfo.is();
        RM = mostrecentgameinfo.it();
        RN = mostrecentgameinfo.iu();
    }

    static int a(MostRecentGameInfo mostrecentgameinfo)
    {
        return hk.hashCode(new Object[] {
            mostrecentgameinfo.ip(), mostrecentgameinfo.iq(), Long.valueOf(mostrecentgameinfo.ir()), mostrecentgameinfo.is(), mostrecentgameinfo.it(), mostrecentgameinfo.iu()
        });
    }

    static boolean a(MostRecentGameInfo mostrecentgameinfo, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof MostRecentGameInfo) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (mostrecentgameinfo == obj) goto _L4; else goto _L3
_L3:
        obj = (MostRecentGameInfo)obj;
        if (!hk.equal(((MostRecentGameInfo) (obj)).ip(), mostrecentgameinfo.ip()) || !hk.equal(((MostRecentGameInfo) (obj)).iq(), mostrecentgameinfo.iq()) || !hk.equal(Long.valueOf(((MostRecentGameInfo) (obj)).ir()), Long.valueOf(mostrecentgameinfo.ir())) || !hk.equal(((MostRecentGameInfo) (obj)).is(), mostrecentgameinfo.is()) || !hk.equal(((MostRecentGameInfo) (obj)).it(), mostrecentgameinfo.it()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hk.equal(((MostRecentGameInfo) (obj)).iu(), mostrecentgameinfo.iu())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(MostRecentGameInfo mostrecentgameinfo)
    {
        return hk.e(mostrecentgameinfo).a("GameId", mostrecentgameinfo.ip()).a("GameName", mostrecentgameinfo.iq()).a("ActivityTimestampMillis", Long.valueOf(mostrecentgameinfo.ir())).a("GameIconUri", mostrecentgameinfo.is()).a("GameHiResUri", mostrecentgameinfo.it()).a("GameFeaturedUri", mostrecentgameinfo.iu()).toString();
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
        return iv();
    }

    public int getVersionCode()
    {
        return xM;
    }

    public int hashCode()
    {
        return a(this);
    }

    public String ip()
    {
        return RI;
    }

    public String iq()
    {
        return RJ;
    }

    public long ir()
    {
        return RK;
    }

    public Uri is()
    {
        return RL;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public Uri it()
    {
        return RM;
    }

    public Uri iu()
    {
        return RN;
    }

    public MostRecentGameInfo iv()
    {
        return this;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        MostRecentGameInfoEntityCreator.a(this, parcel, i);
    }

}
