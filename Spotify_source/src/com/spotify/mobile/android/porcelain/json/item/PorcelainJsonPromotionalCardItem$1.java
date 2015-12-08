// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json.item;

import android.os.Parcel;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonMetricsData;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonNavigationLink;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonPlayable;
import com.spotify.mobile.android.porcelain.subitem.PorcelainIcon;
import drn;

// Referenced classes of package com.spotify.mobile.android.porcelain.json.item:
//            PorcelainJsonPromotionalCardItem, PorcelainJsonBaseItem

final class  extends drn
{

    public final PorcelainJsonBaseItem a(String s, PorcelainJsonMetricsData porcelainjsonmetricsdata, Parcel parcel)
    {
        String s1 = parcel.readString();
        int i = parcel.readInt();
        PorcelainIcon porcelainicon;
        if (i < 0)
        {
            porcelainicon = null;
        } else
        {
            porcelainicon = PorcelainIcon.values()[i];
        }
        return new PorcelainJsonPromotionalCardItem(s, porcelainjsonmetricsdata, s1, porcelainicon, parcel.readString(), (PorcelainJsonNavigationLink)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonNavigationLink.getClassLoader()), (PorcelainJsonNavigationLink)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonNavigationLink.getClassLoader()), (PorcelainJsonPlayable)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonPlayable.getClassLoader()));
    }

    public final volatile Object[] newArray(int i)
    {
        return new PorcelainJsonPromotionalCardItem[i];
    }

    ()
    {
    }
}
