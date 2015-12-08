// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;

// Referenced classes of package com.google.android.gms.games.internal.player:
//            MostRecentGameInfo, MostRecentGameInfoEntityCreator

public final class MostRecentGameInfoEntity
    implements SafeParcelable, MostRecentGameInfo
{

    public static final MostRecentGameInfoEntityCreator CREATOR = new MostRecentGameInfoEntityCreator();
    private final int CK;
    private final String acF;
    private final String acG;
    private final long acH;
    private final Uri acI;
    private final Uri acJ;
    private final Uri acK;

    MostRecentGameInfoEntity(int i, String s, String s1, long l, Uri uri, Uri uri1, 
            Uri uri2)
    {
        CK = i;
        acF = s;
        acG = s1;
        acH = l;
        acI = uri;
        acJ = uri1;
        acK = uri2;
    }

    public MostRecentGameInfoEntity(MostRecentGameInfo mostrecentgameinfo)
    {
        CK = 2;
        acF = mostrecentgameinfo.mw();
        acG = mostrecentgameinfo.mx();
        acH = mostrecentgameinfo.my();
        acI = mostrecentgameinfo.mz();
        acJ = mostrecentgameinfo.mA();
        acK = mostrecentgameinfo.mB();
    }

    static int a(MostRecentGameInfo mostrecentgameinfo)
    {
        return jv.hashCode(new Object[] {
            mostrecentgameinfo.mw(), mostrecentgameinfo.mx(), Long.valueOf(mostrecentgameinfo.my()), mostrecentgameinfo.mz(), mostrecentgameinfo.mA(), mostrecentgameinfo.mB()
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
        if (!jv.equal(((MostRecentGameInfo) (obj)).mw(), mostrecentgameinfo.mw()) || !jv.equal(((MostRecentGameInfo) (obj)).mx(), mostrecentgameinfo.mx()) || !jv.equal(Long.valueOf(((MostRecentGameInfo) (obj)).my()), Long.valueOf(mostrecentgameinfo.my())) || !jv.equal(((MostRecentGameInfo) (obj)).mz(), mostrecentgameinfo.mz()) || !jv.equal(((MostRecentGameInfo) (obj)).mA(), mostrecentgameinfo.mA()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (jv.equal(((MostRecentGameInfo) (obj)).mB(), mostrecentgameinfo.mB())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(MostRecentGameInfo mostrecentgameinfo)
    {
        return jv.h(mostrecentgameinfo).a("GameId", mostrecentgameinfo.mw()).a("GameName", mostrecentgameinfo.mx()).a("ActivityTimestampMillis", Long.valueOf(mostrecentgameinfo.my())).a("GameIconUri", mostrecentgameinfo.mz()).a("GameHiResUri", mostrecentgameinfo.mA()).a("GameFeaturedUri", mostrecentgameinfo.mB()).toString();
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
        return mC();
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

    public Uri mA()
    {
        return acJ;
    }

    public Uri mB()
    {
        return acK;
    }

    public MostRecentGameInfo mC()
    {
        return this;
    }

    public String mw()
    {
        return acF;
    }

    public String mx()
    {
        return acG;
    }

    public long my()
    {
        return acH;
    }

    public Uri mz()
    {
        return acI;
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
