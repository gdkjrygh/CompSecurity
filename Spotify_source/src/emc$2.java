// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import com.spotify.mobile.android.spotlets.charts.model.Chart;
import com.spotify.mobile.android.spotlets.charts.model.ChartEntry;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;

final class ang.Object
    implements fuj
{

    private emc a;

    public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
    {
        obj = (ChartEntry)obj;
        emg emg1 = emc.b(a);
        u u = a.k();
        if (((ChartEntry) (obj)).playable)
        {
            if (emg1.i.rankType == com.spotify.mobile.android.spotlets.charts.model.RankType.b)
            {
                spotifycontextmenu.b = u.getResources().getQuantityString(0x7f090009, ((ChartEntry) (obj)).rank, new Object[] {
                    Integer.valueOf(((ChartEntry) (obj)).rank)
                });
            }
            emg1.a.a(spotifycontextmenu, ((ChartEntry) (obj)));
        }
    }

    (emc emc1)
    {
        a = emc1;
        super();
    }
}
