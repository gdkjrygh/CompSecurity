// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.games.internal.player:
//            MostRecentGameInfo, MostRecentGameInfoEntityCreator

public final class MostRecentGameInfoEntity
    implements SafeParcelable, MostRecentGameInfo
{

    public static final MostRecentGameInfoEntityCreator CREATOR = new MostRecentGameInfoEntityCreator();
    private final int BR;
    private final String aaM;
    private final String aaN;
    private final long aaO;
    private final Uri aaP;
    private final Uri aaQ;
    private final Uri aaR;

    MostRecentGameInfoEntity(int i, String s, String s1, long l, Uri uri, Uri uri1, 
            Uri uri2)
    {
        BR = i;
        aaM = s;
        aaN = s1;
        aaO = l;
        aaP = uri;
        aaQ = uri1;
        aaR = uri2;
    }

    public MostRecentGameInfoEntity(MostRecentGameInfo mostrecentgameinfo)
    {
        BR = 2;
        aaM = mostrecentgameinfo.lp();
        aaN = mostrecentgameinfo.lq();
        aaO = mostrecentgameinfo.lr();
        aaP = mostrecentgameinfo.ls();
        aaQ = mostrecentgameinfo.lt();
        aaR = mostrecentgameinfo.lu();
    }

    static int a(MostRecentGameInfo mostrecentgameinfo)
    {
        return n.hashCode(new Object[] {
            mostrecentgameinfo.lp(), mostrecentgameinfo.lq(), Long.valueOf(mostrecentgameinfo.lr()), mostrecentgameinfo.ls(), mostrecentgameinfo.lt(), mostrecentgameinfo.lu()
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
        if (!n.equal(((MostRecentGameInfo) (obj)).lp(), mostrecentgameinfo.lp()) || !n.equal(((MostRecentGameInfo) (obj)).lq(), mostrecentgameinfo.lq()) || !n.equal(Long.valueOf(((MostRecentGameInfo) (obj)).lr()), Long.valueOf(mostrecentgameinfo.lr())) || !n.equal(((MostRecentGameInfo) (obj)).ls(), mostrecentgameinfo.ls()) || !n.equal(((MostRecentGameInfo) (obj)).lt(), mostrecentgameinfo.lt()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (n.equal(((MostRecentGameInfo) (obj)).lu(), mostrecentgameinfo.lu())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(MostRecentGameInfo mostrecentgameinfo)
    {
        return n.h(mostrecentgameinfo).a("GameId", mostrecentgameinfo.lp()).a("GameName", mostrecentgameinfo.lq()).a("ActivityTimestampMillis", Long.valueOf(mostrecentgameinfo.lr())).a("GameIconUri", mostrecentgameinfo.ls()).a("GameHiResUri", mostrecentgameinfo.lt()).a("GameFeaturedUri", mostrecentgameinfo.lu()).toString();
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
        return lv();
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

    public String lp()
    {
        return aaM;
    }

    public String lq()
    {
        return aaN;
    }

    public long lr()
    {
        return aaO;
    }

    public Uri ls()
    {
        return aaP;
    }

    public Uri lt()
    {
        return aaQ;
    }

    public Uri lu()
    {
        return aaR;
    }

    public MostRecentGameInfo lv()
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
