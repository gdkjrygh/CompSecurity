// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json.collection;

import android.os.Parcel;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection;
import com.spotify.mobile.android.porcelain.json.item.PorcelainJsonCardItem;
import com.spotify.mobile.android.porcelain.json.item.PorcelainJsonItem;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonMetricsData;
import ctz;
import cuq;
import dps;
import dqz;
import drl;
import drp;
import dsf;
import dsi;
import dsj;
import dsn;
import gdf;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.porcelain.json.collection:
//            PorcelainBaseJsonCollection

public class PorcelainJsonCarouselCollection extends PorcelainBaseJsonCollection
    implements PorcelainCarouselCollection, PorcelainJsonItem
{

    private static final gdf BACKGROUND_STYLE_PARSER = gdf.a(com/spotify/mobile/android/porcelain/collection/PorcelainCarouselCollection$BackgroundStyle);
    public static final android.os.Parcelable.Creator CREATOR = new drl() {

        public final PorcelainBaseJsonCollection a(String s, Parcel parcel)
        {
            PorcelainJsonMetricsData porcelainjsonmetricsdata = (PorcelainJsonMetricsData)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonMetricsData.getClassLoader());
            String s1 = parcel.readString();
            com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection.BackgroundStyle backgroundstyle = com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection.BackgroundStyle.values()[parcel.readInt()];
            String s2 = parcel.readString();
            LinkedList linkedlist = new LinkedList();
            parcel.readList(linkedlist, com/spotify/mobile/android/porcelain/json/item/PorcelainJsonCardItem.getClassLoader());
            return new PorcelainJsonCarouselCollection(s, porcelainjsonmetricsdata, com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection.Size.values()[parcel.readInt()], linkedlist, s1, backgroundstyle, s2);
        }

        public final volatile Object[] newArray(int i)
        {
            return new PorcelainJsonCarouselCollection[i];
        }

    };
    static final String KEY_BACKGROUND = "background";
    static final String KEY_BACKGROUND_STYLE = "backgroundStyle";
    protected static final String KEY_METRICS_DATA = "metricsData";
    static final String KEY_SIZE = "size";
    static final String KEY_TITLE = "title";
    private static final gdf SIZE_PARSER = gdf.a(com/spotify/mobile/android/porcelain/collection/PorcelainCarouselCollection$Size);
    private final String mBackground;
    private final com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection.BackgroundStyle mBackgroundStyle;
    private final PorcelainJsonMetricsData mMetricsData;
    private final com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection.Size mSize;
    private final String mText;

    public PorcelainJsonCarouselCollection(String s, PorcelainJsonMetricsData porcelainjsonmetricsdata, com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection.Size size, List list, String s1, com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection.BackgroundStyle backgroundstyle, String s2)
    {
        super(s, list);
        mSize = (com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection.Size)ctz.a(size);
        mBackground = s1;
        mBackgroundStyle = (com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection.BackgroundStyle)ctz.a(backgroundstyle);
        mText = s2;
        mMetricsData = porcelainjsonmetricsdata;
    }

    PorcelainJsonCarouselCollection(String s, PorcelainJsonMetricsData porcelainjsonmetricsdata, String s1, List list, String s2, String s3, String s4)
    {
        this(s, porcelainjsonmetricsdata, (com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection.Size)SIZE_PARSER.a(s1).a(com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection.Size.a), list, s2, (com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection.BackgroundStyle)BACKGROUND_STYLE_PARSER.a(s3).a(com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection.BackgroundStyle.b), s4);
    }

    public PorcelainJsonCarouselCollection append(PorcelainJsonCarouselCollection porcelainjsoncarouselcollection)
    {
        return new PorcelainJsonCarouselCollection(getId(), mMetricsData, mSize, ImmutableList.h().b(getItems()).b(porcelainjsoncarouselcollection.getItems()).a(), mBackground, mBackgroundStyle, mText);
    }

    public volatile dps append(dps dps)
    {
        return append((PorcelainJsonCarouselCollection)dps);
    }

    public volatile int describeContents()
    {
        return super.describeContents();
    }

    public String getBackground()
    {
        return mBackground;
    }

    public com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection.BackgroundStyle getBackgroundStyle()
    {
        return mBackgroundStyle;
    }

    public dsf getInfo()
    {
        return new dsf(this);
    }

    public volatile dsi getInfo()
    {
        return getInfo();
    }

    public volatile dsj getInfo()
    {
        return getInfo();
    }

    public volatile dsn getInfo()
    {
        return getInfo();
    }

    public volatile dqz getItem(int i)
    {
        return (dqz)super.getItem(i);
    }

    public drp getMetricsInfo()
    {
        return null;
    }

    public com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection.Size getSize()
    {
        return mSize;
    }

    public volatile CharSequence getTitle()
    {
        return getTitle();
    }

    public String getTitle()
    {
        return mText;
    }

    public int getType()
    {
        return mSize.viewType;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(mMetricsData, i);
        parcel.writeString(mBackground);
        parcel.writeInt(mBackgroundStyle.ordinal());
        parcel.writeString(mText);
        parcel.writeList(getItems());
        parcel.writeInt(mSize.ordinal());
    }

}
