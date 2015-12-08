// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.porcelain.json.item.PorcelainJsonBaseCardItem;
import com.spotify.mobile.android.porcelain.json.item.PorcelainJsonCompactCardItem;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonImage;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonMetricsData;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonNavigationLink;

public final class dpf extends dpb
{

    public dpf()
    {
    }

    final PorcelainJsonBaseCardItem a(PorcelainJsonMetricsData porcelainjsonmetricsdata, Object obj, PorcelainJsonImage porcelainjsonimage, PorcelainJsonNavigationLink porcelainjsonnavigationlink, PorcelainJsonNavigationLink porcelainjsonnavigationlink1, int i, boolean flag)
    {
        return new PorcelainJsonCompactCardItem(null, porcelainjsonmetricsdata, (String)obj, porcelainjsonimage, porcelainjsonnavigationlink, porcelainjsonnavigationlink1, null, Integer.valueOf(i), Boolean.valueOf(flag));
    }
}
