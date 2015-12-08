// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.internal.constants.PlatformType;
import com.google.android.gms.internal.hk;

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

    public boolean id()
    {
        return getInteger("real_time_support") > 0;
    }

    public boolean ie()
    {
        return getInteger("turn_based_support") > 0;
    }

    public int _mthif()
    {
        return getInteger("platform_type");
    }

    public boolean ig()
    {
        return getInteger("piracy_check") > 0;
    }

    public boolean ih()
    {
        return getInteger("installed") > 0;
    }

    public String toString()
    {
        return hk.e(this).a("ApplicationId", getApplicationId()).a("DisplayName", getDisplayName()).a("SupportsRealTime", Boolean.valueOf(id())).a("SupportsTurnBased", Boolean.valueOf(ie())).a("PlatformType", PlatformType.cm(_mthif())).a("PackageName", getPackageName()).a("PiracyCheckEnabled", Boolean.valueOf(ig())).a("Installed", Boolean.valueOf(ih())).toString();
    }
}
