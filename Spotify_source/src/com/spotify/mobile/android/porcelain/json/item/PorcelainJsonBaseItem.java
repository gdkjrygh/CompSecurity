// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json.item;

import android.os.Parcel;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonMetricsData;
import com.spotify.mobile.android.porcelain.metrics.PorcelainMetricsRenderType;
import dok;
import drp;

// Referenced classes of package com.spotify.mobile.android.porcelain.json.item:
//            PorcelainJsonItem

public abstract class PorcelainJsonBaseItem extends dok
    implements PorcelainJsonItem
{

    protected static final String KEY_METRICS_DATA = "metricsData";
    private final PorcelainJsonMetricsData mMetricsData;

    PorcelainJsonBaseItem(String s, PorcelainJsonMetricsData porcelainjsonmetricsdata)
    {
        super(s);
        mMetricsData = porcelainjsonmetricsdata;
    }

    public int describeContents()
    {
        return 0;
    }

    public final String getId()
    {
        return super.getId();
    }

    protected PorcelainJsonMetricsData getMetricsData()
    {
        return mMetricsData;
    }

    public drp getMetricsInfo()
    {
        PorcelainJsonMetricsData porcelainjsonmetricsdata = getMetricsData();
        if (porcelainjsonmetricsdata != null)
        {
            return porcelainjsonmetricsdata.toInfo(getRenderType());
        } else
        {
            return null;
        }
    }

    protected abstract PorcelainMetricsRenderType getRenderType();

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(getId());
        parcel.writeParcelable(mMetricsData, i);
    }
}
