// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.porcelain.json.item.PorcelainJsonCellItem;
import com.spotify.mobile.android.porcelain.json.item.PorcelainJsonItem;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonAccessory;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonMetricsData;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonNavigationLink;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonPlayable;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonText;

public final class dpe extends dpc
{

    public PorcelainJsonText a;
    public PorcelainJsonNavigationLink c;
    public PorcelainJsonAccessory d;
    public PorcelainJsonPlayable e;
    public com.spotify.mobile.android.porcelain.item.PorcelainCellItem.CellSize f;
    public boolean g;

    public dpe()
    {
        f = com.spotify.mobile.android.porcelain.item.PorcelainCellItem.CellSize.b;
    }

    final PorcelainJsonItem a(PorcelainJsonMetricsData porcelainjsonmetricsdata)
    {
        return new PorcelainJsonCellItem(null, porcelainjsonmetricsdata, f, a, c, null, d, null, e, g);
    }
}
