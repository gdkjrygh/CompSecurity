// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json.item;

import android.os.Parcel;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonAccessory;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonImage;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonMetricsData;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonNavigationLink;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonPlayable;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonText;
import drn;
import gen;

// Referenced classes of package com.spotify.mobile.android.porcelain.json.item:
//            PorcelainJsonWideCellItem, PorcelainJsonBaseItem

final class nk extends drn
{

    public final PorcelainJsonBaseItem a(String s, PorcelainJsonMetricsData porcelainjsonmetricsdata, Parcel parcel)
    {
        boolean flag = gen.a(parcel);
        PorcelainJsonText porcelainjsontext = (PorcelainJsonText)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonText.getClassLoader());
        String s1 = parcel.readString();
        PorcelainJsonNavigationLink porcelainjsonnavigationlink = (PorcelainJsonNavigationLink)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonNavigationLink.getClassLoader());
        PorcelainJsonNavigationLink porcelainjsonnavigationlink1 = (PorcelainJsonNavigationLink)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonNavigationLink.getClassLoader());
        PorcelainJsonPlayable porcelainjsonplayable = (PorcelainJsonPlayable)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonPlayable.getClassLoader());
        return new PorcelainJsonWideCellItem(s, porcelainjsonmetricsdata, porcelainjsontext, s1, porcelainjsonnavigationlink, porcelainjsonnavigationlink1, (PorcelainJsonImage)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonAccessory.getClassLoader()), (PorcelainJsonAccessory)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonAccessory.getClassLoader()), porcelainjsonplayable, Boolean.valueOf(flag));
    }

    public final volatile Object[] newArray(int i)
    {
        return new PorcelainJsonWideCellItem[i];
    }

    nk()
    {
    }
}
