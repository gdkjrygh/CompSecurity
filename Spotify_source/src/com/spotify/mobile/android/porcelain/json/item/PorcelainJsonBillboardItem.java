// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json.item;

import android.os.Parcel;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonImage;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonMetricsData;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonNavigationLink;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonPlayable;
import com.spotify.mobile.android.porcelain.metrics.PorcelainMetricsRenderType;
import com.spotify.mobile.android.porcelain.subitem.PorcelainImage;
import com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink;
import ctz;
import dra;
import drn;
import drz;
import dsi;
import dsn;
import ghl;
import java.util.Collections;

// Referenced classes of package com.spotify.mobile.android.porcelain.json.item:
//            PorcelainJsonBaseItem

public final class PorcelainJsonBillboardItem extends PorcelainJsonBaseItem
    implements dra
{

    public static final android.os.Parcelable.Creator CREATOR = new drn() {

        public final PorcelainJsonBaseItem a(String s, PorcelainJsonMetricsData porcelainjsonmetricsdata, Parcel parcel)
        {
            return new PorcelainJsonBillboardItem(s, porcelainjsonmetricsdata, (PorcelainJsonImage)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonImage.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), (PorcelainJsonNavigationLink)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonNavigationLink.getClassLoader()), (PorcelainJsonNavigationLink)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonNavigationLink.getClassLoader()), (PorcelainJsonPlayable)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonPlayable.getClassLoader()));
        }

        public final volatile Object[] newArray(int i)
        {
            return new PorcelainJsonBillboardItem[i];
        }

    };
    private static final String KEY_CAPTION = "caption";
    private static final String KEY_DESCRIPTION = "description";
    private static final String KEY_IMAGE = "image";
    private static final String KEY_LINK = "link";
    private static final String KEY_LONG_CLICK_LINK = "longClick";
    private static final String KEY_PLAYABLE = "playback";
    private static final String KEY_TITLE = "title";
    private final String mCaption;
    private final String mDescription;
    private final PorcelainJsonImage mImage;
    private final PorcelainJsonNavigationLink mLink;
    private final PorcelainJsonNavigationLink mLongClick;
    private final PorcelainJsonPlayable mPlayable;
    private final String mTitle;

    public PorcelainJsonBillboardItem(String s, PorcelainJsonMetricsData porcelainjsonmetricsdata, PorcelainJsonImage porcelainjsonimage, String s1, String s2, String s3, PorcelainJsonNavigationLink porcelainjsonnavigationlink, 
            PorcelainJsonNavigationLink porcelainjsonnavigationlink1, PorcelainJsonPlayable porcelainjsonplayable)
    {
        super(s, porcelainjsonmetricsdata);
        mImage = (PorcelainJsonImage)ctz.a(porcelainjsonimage);
        mTitle = (String)ctz.a(s1);
        mCaption = s2;
        mDescription = s3;
        mLink = porcelainjsonnavigationlink;
        mLongClick = porcelainjsonnavigationlink1;
        mPlayable = porcelainjsonplayable;
    }

    public final volatile CharSequence getCaption()
    {
        return getCaption();
    }

    public final String getCaption()
    {
        return mCaption;
    }

    public final volatile CharSequence getDescription()
    {
        return getDescription();
    }

    public final String getDescription()
    {
        return mDescription;
    }

    public final PorcelainJsonImage getImage()
    {
        return mImage;
    }

    public final volatile PorcelainImage getImage()
    {
        return getImage();
    }

    public final volatile dsi getInfo()
    {
        return getInfo();
    }

    public final dsn getInfo()
    {
        return (dsn)b.a(this);
    }

    public final PorcelainJsonNavigationLink getLink()
    {
        return mLink;
    }

    public final volatile PorcelainNavigationLink getLink()
    {
        return getLink();
    }

    public final PorcelainJsonNavigationLink getLongClickLink()
    {
        return mLongClick;
    }

    public final volatile PorcelainNavigationLink getLongClickLink()
    {
        return getLongClickLink();
    }

    public final PorcelainJsonPlayable getPlayable()
    {
        return mPlayable;
    }

    public final volatile drz getPlayable()
    {
        return getPlayable();
    }

    public final Iterable getPlayables()
    {
        if (mPlayable != null)
        {
            return Collections.singleton(mPlayable);
        } else
        {
            return Collections.emptySet();
        }
    }

    protected final PorcelainMetricsRenderType getRenderType()
    {
        return PorcelainMetricsRenderType.a;
    }

    public final volatile CharSequence getTitle()
    {
        return getTitle();
    }

    public final String getTitle()
    {
        return mTitle;
    }

    public final int getType()
    {
        return 0x7f1100ec;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(mImage, 0);
        parcel.writeString(mTitle);
        parcel.writeString(mCaption);
        parcel.writeString(mDescription);
        parcel.writeParcelable(mLink, 0);
        parcel.writeParcelable(mLongClick, 0);
        parcel.writeParcelable(mPlayable, 0);
    }

}
