// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.spotify.mobile.android.porcelain.json.item.PorcelainJsonBaseCardItem;
import com.spotify.mobile.android.porcelain.json.item.PorcelainJsonBaseItem;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonImage;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonMetricsData;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonNavigationLink;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonPlayable;

public abstract class drm extends drn
{

    public drm()
    {
    }

    public abstract PorcelainJsonBaseCardItem a(String s, PorcelainJsonMetricsData porcelainjsonmetricsdata, PorcelainJsonImage porcelainjsonimage, PorcelainJsonNavigationLink porcelainjsonnavigationlink, PorcelainJsonNavigationLink porcelainjsonnavigationlink1, PorcelainJsonPlayable porcelainjsonplayable, int i, 
            boolean flag, Parcel parcel);

    public final PorcelainJsonBaseItem a(String s, PorcelainJsonMetricsData porcelainjsonmetricsdata, Parcel parcel)
    {
        boolean flag = gen.a(parcel);
        int i = parcel.readInt();
        return a(s, porcelainjsonmetricsdata, (PorcelainJsonImage)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonImage.getClassLoader()), (PorcelainJsonNavigationLink)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonNavigationLink.getClassLoader()), (PorcelainJsonNavigationLink)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonNavigationLink.getClassLoader()), (PorcelainJsonPlayable)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonPlayable.getClassLoader()), i, flag, parcel);
    }
}
