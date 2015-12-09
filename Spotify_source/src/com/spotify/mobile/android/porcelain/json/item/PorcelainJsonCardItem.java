// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json.item;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Optional;
import com.spotify.mobile.android.porcelain.item.PorcelainCardItem;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonImage;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonMetricsData;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonNavigationLink;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonPlayable;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonText;
import com.spotify.mobile.android.porcelain.subitem.PorcelainText;
import ctz;
import drm;
import dsi;
import dsn;
import gdf;
import ghl;

// Referenced classes of package com.spotify.mobile.android.porcelain.json.item:
//            PorcelainJsonBaseCardItem

public final class PorcelainJsonCardItem extends PorcelainJsonBaseCardItem
    implements PorcelainCardItem
{

    public static final android.os.Parcelable.Creator CREATOR = new drm() {

        public final PorcelainJsonBaseCardItem a(String s, PorcelainJsonMetricsData porcelainjsonmetricsdata, PorcelainJsonImage porcelainjsonimage, PorcelainJsonNavigationLink porcelainjsonnavigationlink, PorcelainJsonNavigationLink porcelainjsonnavigationlink1, PorcelainJsonPlayable porcelainjsonplayable, int i, 
                boolean flag, Parcel parcel)
        {
            return new PorcelainJsonCardItem(s, porcelainjsonmetricsdata, (PorcelainJsonText)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonText.getClassLoader()), porcelainjsonimage, porcelainjsonnavigationlink, porcelainjsonnavigationlink1, porcelainjsonplayable, i, flag, com.spotify.mobile.android.porcelain.item.PorcelainCardItem.TextStyle.values()[parcel.readInt()]);
        }

        public final volatile Object[] newArray(int i)
        {
            return new PorcelainJsonCardItem[i];
        }

    };
    private static final String KEY_TEXT_STYLE = "textStyle";
    private static final gdf STYLE_PARSER = gdf.a(com/spotify/mobile/android/porcelain/item/PorcelainCardItem$TextStyle);
    private final com.spotify.mobile.android.porcelain.item.PorcelainCardItem.TextStyle mTextStyle;

    public PorcelainJsonCardItem(String s, PorcelainJsonMetricsData porcelainjsonmetricsdata, PorcelainJsonText porcelainjsontext, PorcelainJsonImage porcelainjsonimage, PorcelainJsonNavigationLink porcelainjsonnavigationlink, PorcelainJsonNavigationLink porcelainjsonnavigationlink1, PorcelainJsonPlayable porcelainjsonplayable, 
            int i, boolean flag, com.spotify.mobile.android.porcelain.item.PorcelainCardItem.TextStyle textstyle)
    {
        super(s, porcelainjsonmetricsdata, porcelainjsonimage, porcelainjsontext, porcelainjsonnavigationlink, porcelainjsonnavigationlink1, porcelainjsonplayable, i, flag);
        mTextStyle = (com.spotify.mobile.android.porcelain.item.PorcelainCardItem.TextStyle)ctz.a(textstyle);
    }

    PorcelainJsonCardItem(String s, PorcelainJsonMetricsData porcelainjsonmetricsdata, PorcelainJsonText porcelainjsontext, PorcelainJsonImage porcelainjsonimage, PorcelainJsonNavigationLink porcelainjsonnavigationlink, PorcelainJsonNavigationLink porcelainjsonnavigationlink1, PorcelainJsonPlayable porcelainjsonplayable, 
            Integer integer, Boolean boolean1, String s1)
    {
        int i;
        boolean flag;
        if (integer != null)
        {
            i = integer.intValue();
        } else
        {
            i = -1;
        }
        if (boolean1 != null && boolean1.booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this(s, porcelainjsonmetricsdata, porcelainjsontext, porcelainjsonimage, porcelainjsonnavigationlink, porcelainjsonnavigationlink1, porcelainjsonplayable, i, flag, (com.spotify.mobile.android.porcelain.item.PorcelainCardItem.TextStyle)STYLE_PARSER.a(s1).a(com.spotify.mobile.android.porcelain.item.PorcelainCardItem.TextStyle.a));
    }

    public final volatile dsi getInfo()
    {
        return getInfo();
    }

    public final dsn getInfo()
    {
        return (dsn)c.a(this);
    }

    public final volatile PorcelainText getText()
    {
        return (PorcelainText)super.getText();
    }

    public final com.spotify.mobile.android.porcelain.item.PorcelainCardItem.TextStyle getTextStyle()
    {
        return mTextStyle;
    }

    public final int getType()
    {
        return 0x7f1100ed;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable((Parcelable)getText(), 0);
        parcel.writeInt(mTextStyle.ordinal());
    }

}
