// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json.item;

import android.os.Parcel;
import com.google.common.base.Optional;
import com.spotify.mobile.android.porcelain.item.PorcelainCellItem;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonAccessory;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonMetricsData;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonNavigationLink;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonPlayable;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonText;
import com.spotify.mobile.android.porcelain.metrics.PorcelainMetricsRenderType;
import com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink;
import com.spotify.mobile.android.porcelain.subitem.PorcelainText;
import ctz;
import drn;
import dru;
import drz;
import dsi;
import dsn;
import gdf;
import gen;
import ghl;
import java.util.Collections;

// Referenced classes of package com.spotify.mobile.android.porcelain.json.item:
//            PorcelainJsonBaseItem

public final class PorcelainJsonCellItem extends PorcelainJsonBaseItem
    implements PorcelainCellItem
{

    public static final android.os.Parcelable.Creator CREATOR = new drn() {

        public final PorcelainJsonBaseItem a(String s, PorcelainJsonMetricsData porcelainjsonmetricsdata, Parcel parcel)
        {
            boolean flag = gen.a(parcel);
            com.spotify.mobile.android.porcelain.item.PorcelainCellItem.CellSize cellsize = com.spotify.mobile.android.porcelain.item.PorcelainCellItem.CellSize.values()[parcel.readInt()];
            PorcelainJsonText porcelainjsontext = (PorcelainJsonText)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonText.getClassLoader());
            PorcelainJsonNavigationLink porcelainjsonnavigationlink = (PorcelainJsonNavigationLink)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonNavigationLink.getClassLoader());
            PorcelainJsonNavigationLink porcelainjsonnavigationlink1 = (PorcelainJsonNavigationLink)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonNavigationLink.getClassLoader());
            PorcelainJsonPlayable porcelainjsonplayable = (PorcelainJsonPlayable)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonPlayable.getClassLoader());
            return new PorcelainJsonCellItem(s, porcelainjsonmetricsdata, cellsize, porcelainjsontext, porcelainjsonnavigationlink, porcelainjsonnavigationlink1, (PorcelainJsonAccessory)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonAccessory.getClassLoader()), (PorcelainJsonAccessory)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonAccessory.getClassLoader()), porcelainjsonplayable, flag);
        }

        public final volatile Object[] newArray(int i)
        {
            return new PorcelainJsonCellItem[i];
        }

    };
    private static final String KEY_ACCESSORY_LEFT = "accessoryLeft";
    private static final String KEY_ACCESSORY_RIGHT = "accessoryRight";
    private static final String KEY_ENABLED = "enabled";
    private static final String KEY_LINK = "link";
    private static final String KEY_LINK_LONG_CLICK = "longClick";
    private static final String KEY_PLAYABLE = "playback";
    private static final String KEY_SIZE = "size";
    private static final String KEY_SMALL = "small";
    private static final String KEY_TEXT = "text";
    private static final gdf SIZE_PARSER = gdf.a(com/spotify/mobile/android/porcelain/item/PorcelainCellItem$CellSize);
    private final PorcelainJsonAccessory mAccessoryLeft;
    private final PorcelainJsonAccessory mAccessoryRight;
    private final boolean mIsEnabled;
    private final PorcelainJsonNavigationLink mLink;
    private final PorcelainJsonNavigationLink mLongClickLink;
    private final PorcelainJsonPlayable mPlayable;
    private final com.spotify.mobile.android.porcelain.item.PorcelainCellItem.CellSize mSize;
    private final PorcelainJsonText mText;

    public PorcelainJsonCellItem(String s, PorcelainJsonMetricsData porcelainjsonmetricsdata, com.spotify.mobile.android.porcelain.item.PorcelainCellItem.CellSize cellsize, PorcelainJsonText porcelainjsontext, PorcelainJsonNavigationLink porcelainjsonnavigationlink, PorcelainJsonNavigationLink porcelainjsonnavigationlink1, PorcelainJsonAccessory porcelainjsonaccessory, 
            PorcelainJsonAccessory porcelainjsonaccessory1, PorcelainJsonPlayable porcelainjsonplayable, boolean flag)
    {
        super(s, porcelainjsonmetricsdata);
        mSize = (com.spotify.mobile.android.porcelain.item.PorcelainCellItem.CellSize)ctz.a(cellsize);
        mText = porcelainjsontext;
        mLink = porcelainjsonnavigationlink;
        mLongClickLink = porcelainjsonnavigationlink1;
        mIsEnabled = flag;
        mPlayable = porcelainjsonplayable;
        mAccessoryLeft = porcelainjsonaccessory;
        mAccessoryRight = porcelainjsonaccessory1;
    }

    PorcelainJsonCellItem(String s, PorcelainJsonMetricsData porcelainjsonmetricsdata, String s1, PorcelainJsonText porcelainjsontext, PorcelainJsonNavigationLink porcelainjsonnavigationlink, PorcelainJsonNavigationLink porcelainjsonnavigationlink1, PorcelainJsonAccessory porcelainjsonaccessory, 
            PorcelainJsonAccessory porcelainjsonaccessory1, PorcelainJsonPlayable porcelainjsonplayable, Boolean boolean1, Boolean boolean2)
    {
        Optional optional = SIZE_PARSER.a(s1);
        boolean flag;
        if (boolean1 != null && boolean1.booleanValue())
        {
            s1 = com.spotify.mobile.android.porcelain.item.PorcelainCellItem.CellSize.a;
        } else
        {
            s1 = com.spotify.mobile.android.porcelain.item.PorcelainCellItem.CellSize.b;
        }
        s1 = (com.spotify.mobile.android.porcelain.item.PorcelainCellItem.CellSize)optional.a(s1);
        if (boolean2 != null && boolean2.booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this(s, porcelainjsonmetricsdata, ((com.spotify.mobile.android.porcelain.item.PorcelainCellItem.CellSize) (s1)), porcelainjsontext, porcelainjsonnavigationlink, porcelainjsonnavigationlink1, porcelainjsonaccessory, porcelainjsonaccessory1, porcelainjsonplayable, flag);
    }

    public final PorcelainJsonAccessory getAccessoryLeft()
    {
        return mAccessoryLeft;
    }

    public final volatile dru getAccessoryLeft()
    {
        return getAccessoryLeft();
    }

    public final PorcelainJsonAccessory getAccessoryRight()
    {
        return mAccessoryRight;
    }

    public final volatile dru getAccessoryRight()
    {
        return getAccessoryRight();
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
        return mLongClickLink;
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
        if (getSize() == com.spotify.mobile.android.porcelain.item.PorcelainCellItem.CellSize.c)
        {
            return PorcelainMetricsRenderType.f;
        } else
        {
            return PorcelainMetricsRenderType.e;
        }
    }

    public final com.spotify.mobile.android.porcelain.item.PorcelainCellItem.CellSize getSize()
    {
        return mSize;
    }

    public final PorcelainJsonText getText()
    {
        return mText;
    }

    public final volatile PorcelainText getText()
    {
        return getText();
    }

    public final int getType()
    {
        return mSize.type;
    }

    public final boolean isEnabled()
    {
        return mIsEnabled;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        gen.a(parcel, mIsEnabled);
        parcel.writeInt(mSize.ordinal());
        parcel.writeParcelable(mText, 0);
        parcel.writeParcelable(mLink, 0);
        parcel.writeParcelable(mLongClickLink, 0);
        parcel.writeParcelable(mPlayable, 0);
        parcel.writeParcelable(mAccessoryLeft, 0);
        parcel.writeParcelable(mAccessoryRight, 0);
    }

}
