// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.b;
import com.google.android.gms.games.internal.constants.PlatformType;
import com.google.android.gms.internal.fo;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            GameInstance

public final class GameInstanceRef extends b
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

    public boolean hi()
    {
        return getInteger("real_time_support") > 0;
    }

    public boolean hj()
    {
        return getInteger("turn_based_support") > 0;
    }

    public int hk()
    {
        return getInteger("platform_type");
    }

    public boolean hl()
    {
        return getInteger("piracy_check") > 0;
    }

    public boolean hm()
    {
        return getInteger("installed") > 0;
    }

    public String toString()
    {
        return fo.e(this).a("ApplicationId", getApplicationId()).a("DisplayName", getDisplayName()).a("SupportsRealTime", Boolean.valueOf(hi())).a("SupportsTurnBased", Boolean.valueOf(hj())).a("PlatformType", PlatformType.bd(hk())).a("PackageName", getPackageName()).a("PiracyCheckEnabled", Boolean.valueOf(hl())).a("Installed", Boolean.valueOf(hm())).toString();
    }
}
