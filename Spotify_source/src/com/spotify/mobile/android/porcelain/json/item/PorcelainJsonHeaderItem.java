// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json.item;

import android.os.Parcel;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonMetricsData;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonNavigationLink;
import com.spotify.mobile.android.porcelain.metrics.PorcelainMetricsRenderType;
import com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink;
import ctz;
import drd;
import drn;
import dsi;
import dsn;
import ghl;

// Referenced classes of package com.spotify.mobile.android.porcelain.json.item:
//            PorcelainJsonBaseItem

public class PorcelainJsonHeaderItem extends PorcelainJsonBaseItem
    implements drd
{

    public static final android.os.Parcelable.Creator CREATOR = new drn() {

        public final PorcelainJsonBaseItem a(String s, PorcelainJsonMetricsData porcelainjsonmetricsdata, Parcel parcel)
        {
            return new PorcelainJsonHeaderItem(s, porcelainjsonmetricsdata, parcel.readString(), parcel.readString(), (PorcelainJsonNavigationLink)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonNavigationLink.getClassLoader()));
        }

        public final volatile Object[] newArray(int i)
        {
            return new PorcelainJsonHeaderItem[i];
        }

    };
    private static final String KEY_BUTTON_LINK = "buttonLink";
    private static final String KEY_BUTTON_TEXT = "buttonText";
    private static final String KEY_TITLE = "text";
    private final PorcelainJsonNavigationLink mButtonLink;
    private final String mButtonText;
    private final String mTitle;

    public PorcelainJsonHeaderItem(String s, PorcelainJsonMetricsData porcelainjsonmetricsdata, String s1, String s2, PorcelainJsonNavigationLink porcelainjsonnavigationlink)
    {
        super(s, porcelainjsonmetricsdata);
        mTitle = (String)ctz.a(s1);
        mButtonText = s2;
        mButtonLink = porcelainjsonnavigationlink;
    }

    public PorcelainJsonNavigationLink getButtonLink()
    {
        return mButtonLink;
    }

    public volatile PorcelainNavigationLink getButtonLink()
    {
        return getButtonLink();
    }

    public String getButtonText()
    {
        return mButtonText;
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
        return 0x7f1100f8;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeString(mTitle);
        parcel.writeString(mButtonText);
        parcel.writeParcelable(mButtonLink, 0);
    }

}
