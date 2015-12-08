// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json.item;

import android.os.Parcel;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonImage;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonMetricsData;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonNavigationLink;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonPlayable;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonText;
import drm;

// Referenced classes of package com.spotify.mobile.android.porcelain.json.item:
//            PorcelainJsonCardItem, PorcelainJsonBaseCardItem

final class m extends drm
{

    public final PorcelainJsonBaseCardItem a(String s, PorcelainJsonMetricsData porcelainjsonmetricsdata, PorcelainJsonImage porcelainjsonimage, PorcelainJsonNavigationLink porcelainjsonnavigationlink, PorcelainJsonNavigationLink porcelainjsonnavigationlink1, PorcelainJsonPlayable porcelainjsonplayable, int i, 
            boolean flag, Parcel parcel)
    {
        return new PorcelainJsonCardItem(s, porcelainjsonmetricsdata, (PorcelainJsonText)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonText.getClassLoader()), porcelainjsonimage, porcelainjsonnavigationlink, porcelainjsonnavigationlink1, porcelainjsonplayable, i, flag, com.spotify.mobile.android.porcelain.item.yle.values()[parcel.readInt()]);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PorcelainJsonCardItem[i];
    }

    m()
    {
    }
}
