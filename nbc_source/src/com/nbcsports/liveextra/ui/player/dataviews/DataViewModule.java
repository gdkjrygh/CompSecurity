// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.dataviews;

import android.content.Context;
import android.content.res.Resources;
import com.nbcsports.liveextra.library.api.models.Asset;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;

// Referenced classes of package com.nbcsports.liveextra.ui.player.dataviews:
//            DataEngine

public class DataViewModule
{

    public DataViewModule()
    {
    }

    DataEngine engine(Context context, AssetViewModel assetviewmodel)
    {
        while (!context.getResources().getBoolean(0x7f0b0005) || assetviewmodel.asset().getOverlayId() == null || android.os.Build.VERSION.SDK_INT <= 15 || !PremierLeagueEngine.handles(assetviewmodel)) 
        {
            return null;
        }
        return new PremierLeagueEngine();
    }
}
