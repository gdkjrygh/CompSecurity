// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hl;

// Referenced classes of package com.google.android.gms.games.internal.player:
//            MostRecentGameInfo, MostRecentGameInfoEntityCreator

public final class MostRecentGameInfoEntity
    implements SafeParcelable, MostRecentGameInfo
{

    public static final MostRecentGameInfoEntityCreator CREATOR = new MostRecentGameInfoEntityCreator();
    private final String RF;
    private final String RG;
    private final long RH;
    private final Uri RI;
    private final Uri RJ;
    private final Uri RK;
    private final int xJ;

    MostRecentGameInfoEntity(int i, String s, String s1, long l, Uri uri, Uri uri1, 
            Uri uri2)
    {
        xJ = i;
        RF = s;
        RG = s1;
        RH = l;
        RI = uri;
        RJ = uri1;
        RK = uri2;
    }

    public MostRecentGameInfoEntity(MostRecentGameInfo mostrecentgameinfo)
    {
        xJ = 2;
        RF = mostrecentgameinfo.ik();
        RG = mostrecentgameinfo.il();
        RH = mostrecentgameinfo.im();
        RI = mostrecentgameinfo.in();
        RJ = mostrecentgameinfo.io();
        RK = mostrecentgameinfo.ip();
    }

    static int a(MostRecentGameInfo mostrecentgameinfo)
    {
        return hl.hashCode(new Object[] {
            mostrecentgameinfo.ik(), mostrecentgameinfo.il(), Long.valueOf(mostrecentgameinfo.im()), mostrecentgameinfo.in(), mostrecentgameinfo.io(), mostrecentgameinfo.ip()
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
        if (!hl.equal(((MostRecentGameInfo) (obj)).ik(), mostrecentgameinfo.ik()) || !hl.equal(((MostRecentGameInfo) (obj)).il(), mostrecentgameinfo.il()) || !hl.equal(Long.valueOf(((MostRecentGameInfo) (obj)).im()), Long.valueOf(mostrecentgameinfo.im())) || !hl.equal(((MostRecentGameInfo) (obj)).in(), mostrecentgameinfo.in()) || !hl.equal(((MostRecentGameInfo) (obj)).io(), mostrecentgameinfo.io()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hl.equal(((MostRecentGameInfo) (obj)).ip(), mostrecentgameinfo.ip())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(MostRecentGameInfo mostrecentgameinfo)
    {
        return hl.e(mostrecentgameinfo).a("GameId", mostrecentgameinfo.ik()).a("GameName", mostrecentgameinfo.il()).a("ActivityTimestampMillis", Long.valueOf(mostrecentgameinfo.im())).a("GameIconUri", mostrecentgameinfo.in()).a("GameHiResUri", mostrecentgameinfo.io()).a("GameFeaturedUri", mostrecentgameinfo.ip()).toString();
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
        return iq();
    }

    public int getVersionCode()
    {
        return xJ;
    }

    public int hashCode()
    {
        return a(this);
    }

    public String ik()
    {
        return RF;
    }

    public String il()
    {
        return RG;
    }

    public long im()
    {
        return RH;
    }

    public Uri in()
    {
        return RI;
    }

    public Uri io()
    {
        return RJ;
    }

    public Uri ip()
    {
        return RK;
    }

    public MostRecentGameInfo iq()
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
        MostRecentGameInfoEntityCreator.a(this, parcel, i);
    }

}
