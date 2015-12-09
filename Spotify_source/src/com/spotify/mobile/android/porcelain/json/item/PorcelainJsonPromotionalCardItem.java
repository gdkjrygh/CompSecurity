// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json.item;

import android.os.Parcel;
import com.google.common.base.Optional;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonMetricsData;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonNavigationLink;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonPlayable;
import com.spotify.mobile.android.porcelain.metrics.PorcelainMetricsRenderType;
import com.spotify.mobile.android.porcelain.subitem.PorcelainIcon;
import com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink;
import dri;
import drn;
import drz;
import dsi;
import dsn;
import gdf;
import ghl;
import java.util.Collections;

// Referenced classes of package com.spotify.mobile.android.porcelain.json.item:
//            PorcelainJsonBaseItem

public class PorcelainJsonPromotionalCardItem extends PorcelainJsonBaseItem
    implements dri
{

    public static final android.os.Parcelable.Creator CREATOR = new drn() {

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

    };
    private static final String KEY_BG_IMAGE = "backgroundImage";
    private static final String KEY_ICON = "icon";
    private static final String KEY_LINK = "link";
    private static final String KEY_LONG_CLICK_LINK = "longClick";
    private static final String KEY_PLAYABLE = "playback";
    private static final String KEY_TITLE = "title";
    private final String mBackgroundImageUri;
    private final PorcelainIcon mIcon;
    private final PorcelainJsonNavigationLink mLink;
    private final PorcelainJsonNavigationLink mLongClick;
    private final PorcelainJsonPlayable mPlayable;
    private final String mTitle;

    public PorcelainJsonPromotionalCardItem(String s, PorcelainJsonMetricsData porcelainjsonmetricsdata, String s1, PorcelainIcon porcelainicon, String s2, PorcelainJsonNavigationLink porcelainjsonnavigationlink, PorcelainJsonNavigationLink porcelainjsonnavigationlink1, 
            PorcelainJsonPlayable porcelainjsonplayable)
    {
        super(s, porcelainjsonmetricsdata);
        mBackgroundImageUri = s1;
        mIcon = porcelainicon;
        mTitle = s2;
        mLink = porcelainjsonnavigationlink;
        mLongClick = porcelainjsonnavigationlink1;
        mPlayable = porcelainjsonplayable;
    }

    PorcelainJsonPromotionalCardItem(String s, PorcelainJsonMetricsData porcelainjsonmetricsdata, String s1, String s2, String s3, PorcelainJsonNavigationLink porcelainjsonnavigationlink, PorcelainJsonNavigationLink porcelainjsonnavigationlink1, 
            PorcelainJsonPlayable porcelainjsonplayable)
    {
        this(s, porcelainjsonmetricsdata, s1, (PorcelainIcon)PorcelainIcon.a().a(s2).d(), s3, porcelainjsonnavigationlink, porcelainjsonnavigationlink1, porcelainjsonplayable);
    }

    public String getBackgroundImageUri()
    {
        return mBackgroundImageUri;
    }

    public PorcelainIcon getIcon()
    {
        return mIcon;
    }

    public volatile dsi getInfo()
    {
        return getInfo();
    }

    public dsn getInfo()
    {
        return (dsn)b.a(this);
    }

    public PorcelainJsonNavigationLink getLink()
    {
        return mLink;
    }

    public volatile PorcelainNavigationLink getLink()
    {
        return getLink();
    }

    public PorcelainJsonNavigationLink getLongClickLink()
    {
        return mLongClick;
    }

    public volatile PorcelainNavigationLink getLongClickLink()
    {
        return getLongClickLink();
    }

    public PorcelainJsonPlayable getPlayable()
    {
        return mPlayable;
    }

    public volatile drz getPlayable()
    {
        return getPlayable();
    }

    public Iterable getPlayables()
    {
        if (mPlayable != null)
        {
            return Collections.singleton(mPlayable);
        } else
        {
            return Collections.emptySet();
        }
    }

    protected PorcelainMetricsRenderType getRenderType()
    {
        return PorcelainMetricsRenderType.c;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public int getType()
    {
        return 0x7f1100fa;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeString(mBackgroundImageUri);
        if (mIcon != null)
        {
            i = mIcon.ordinal();
        } else
        {
            i = -1;
        }
        parcel.writeInt(i);
        parcel.writeString(mTitle);
        parcel.writeParcelable(mLink, 0);
        parcel.writeParcelable(mLongClick, 0);
        parcel.writeParcelable(mPlayable, 0);
    }

}
