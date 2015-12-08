// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.games.internal.constants.PlatformType;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            GameInstance

public final class GameInstanceRef extends d
    implements GameInstance
{

    GameInstanceRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public String getApplicationId()
    {
        return getString("external_game_id");
    }

    public String getDisplayName()
    {
        return getString("instance_display_name");
    }

    public String getPackageName()
    {
        return getString("package_name");
    }

    public int iR()
    {
        return getInteger("platform_type");
    }

    public boolean le()
    {
        return getInteger("real_time_support") > 0;
    }

    public boolean lf()
    {
        return getInteger("turn_based_support") > 0;
    }

    public boolean lg()
    {
        return getInteger("piracy_check") > 0;
    }

    public boolean lh()
    {
        return getInteger("installed") > 0;
    }

    public String toString()
    {
        return n.h(this).a("ApplicationId", getApplicationId()).a("DisplayName", getDisplayName()).a("SupportsRealTime", Boolean.valueOf(le())).a("SupportsTurnBased", Boolean.valueOf(lf())).a("PlatformType", PlatformType.dH(iR())).a("PackageName", getPackageName()).a("PiracyCheckEnabled", Boolean.valueOf(lg())).a("Installed", Boolean.valueOf(lh())).toString();
    }
}
