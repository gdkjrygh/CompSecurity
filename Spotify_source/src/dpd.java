// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.porcelain.json.item.PorcelainJsonBaseCardItem;
import com.spotify.mobile.android.porcelain.json.item.PorcelainJsonCardItem;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonImage;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonMetricsData;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonNavigationLink;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonText;

public final class dpd extends dpb
{

    private com.spotify.mobile.android.porcelain.item.PorcelainCardItem.TextStyle c;

    public dpd()
    {
        c = com.spotify.mobile.android.porcelain.item.PorcelainCardItem.TextStyle.a;
    }

    final PorcelainJsonBaseCardItem a(PorcelainJsonMetricsData porcelainjsonmetricsdata, Object obj, PorcelainJsonImage porcelainjsonimage, PorcelainJsonNavigationLink porcelainjsonnavigationlink, PorcelainJsonNavigationLink porcelainjsonnavigationlink1, int i, boolean flag)
    {
        return new PorcelainJsonCardItem(null, porcelainjsonmetricsdata, (PorcelainJsonText)obj, porcelainjsonimage, porcelainjsonnavigationlink, porcelainjsonnavigationlink1, null, i, flag, c);
    }

    public final dpd a(dpn dpn1)
    {
        return (dpd)a(dpn1.a());
    }
}
