// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.spotify.mobile.android.porcelain.json.item.PorcelainJsonBaseItem;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonMetricsData;

public abstract class drn
    implements android.os.Parcelable.Creator
{

    public drn()
    {
    }

    public abstract PorcelainJsonBaseItem a(String s, PorcelainJsonMetricsData porcelainjsonmetricsdata, Parcel parcel);

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel.readString(), (PorcelainJsonMetricsData)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonMetricsData.getClassLoader()), parcel);
    }
}
