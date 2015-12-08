// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json.collection;

import android.os.Parcel;
import com.spotify.mobile.android.porcelain.json.item.PorcelainJsonCardItem;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonMetricsData;
import drl;
import java.util.LinkedList;

// Referenced classes of package com.spotify.mobile.android.porcelain.json.collection:
//            PorcelainJsonCarouselCollection, PorcelainBaseJsonCollection

final class tyle extends drl
{

    public final PorcelainBaseJsonCollection a(String s, Parcel parcel)
    {
        PorcelainJsonMetricsData porcelainjsonmetricsdata = (PorcelainJsonMetricsData)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonMetricsData.getClassLoader());
        String s1 = parcel.readString();
        com.spotify.mobile.android.porcelain.collection.oundStyle oundstyle = com.spotify.mobile.android.porcelain.collection.oundStyle.values()[parcel.readInt()];
        String s2 = parcel.readString();
        LinkedList linkedlist = new LinkedList();
        parcel.readList(linkedlist, com/spotify/mobile/android/porcelain/json/item/PorcelainJsonCardItem.getClassLoader());
        return new PorcelainJsonCarouselCollection(s, porcelainjsonmetricsdata, com.spotify.mobile.android.porcelain.collection.alues()[parcel.readInt()], linkedlist, s1, oundstyle, s2);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PorcelainJsonCarouselCollection[i];
    }

    tyle()
    {
    }
}
