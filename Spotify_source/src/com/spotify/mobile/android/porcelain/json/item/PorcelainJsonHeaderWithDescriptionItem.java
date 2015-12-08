// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json.item;

import android.os.Parcel;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonMetricsData;
import com.spotify.mobile.android.porcelain.metrics.PorcelainMetricsRenderType;
import ctz;
import dre;
import drn;
import dsi;
import dsn;
import ghl;

// Referenced classes of package com.spotify.mobile.android.porcelain.json.item:
//            PorcelainJsonBaseItem

public class PorcelainJsonHeaderWithDescriptionItem extends PorcelainJsonBaseItem
    implements dre
{

    public static final android.os.Parcelable.Creator CREATOR = new drn() {

        public final PorcelainJsonBaseItem a(String s, PorcelainJsonMetricsData porcelainjsonmetricsdata, Parcel parcel)
        {
            return new PorcelainJsonHeaderWithDescriptionItem(s, porcelainjsonmetricsdata, parcel.readString(), parcel.readString());
        }

        public final volatile Object[] newArray(int i)
        {
            return new PorcelainJsonHeaderWithDescriptionItem[i];
        }

    };
    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_TITLE = "title";
    private final String mDescription;
    private final String mTitle;

    public PorcelainJsonHeaderWithDescriptionItem(String s, PorcelainJsonMetricsData porcelainjsonmetricsdata, String s1, String s2)
    {
        super(s, porcelainjsonmetricsdata);
        mTitle = (String)ctz.a(s1);
        mDescription = (String)ctz.a(s2);
    }

    public CharSequence getDescription()
    {
        return mDescription;
    }

    public volatile dsi getInfo()
    {
        return getInfo();
    }

    public dsn getInfo()
    {
        return (dsn)b.a(this);
    }

    public Iterable getPlayables()
    {
        return ImmutableList.d();
    }

    protected PorcelainMetricsRenderType getRenderType()
    {
        return PorcelainMetricsRenderType.d;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public int getType()
    {
        return 0x7f1100f9;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeString(mTitle);
        parcel.writeString(mDescription);
    }

}
