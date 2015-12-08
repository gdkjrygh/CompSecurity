// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json.item;

import android.os.Parcel;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonAccessory;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonImage;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonMetricsData;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonNavigationLink;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonPlayable;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonText;
import com.spotify.mobile.android.porcelain.metrics.PorcelainMetricsRenderType;
import com.spotify.mobile.android.porcelain.subitem.PorcelainImage;
import com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink;
import com.spotify.mobile.android.porcelain.subitem.PorcelainText;
import ctz;
import drk;
import drn;
import dru;
import drz;
import dsi;
import dsn;
import gen;
import ghl;
import java.util.Collections;

// Referenced classes of package com.spotify.mobile.android.porcelain.json.item:
//            PorcelainJsonBaseItem

public final class PorcelainJsonWideCellItem extends PorcelainJsonBaseItem
    implements drk
{

    public static final android.os.Parcelable.Creator CREATOR = new drn() {

        public final PorcelainJsonBaseItem a(String s, PorcelainJsonMetricsData porcelainjsonmetricsdata, Parcel parcel)
        {
            boolean flag = gen.a(parcel);
            PorcelainJsonText porcelainjsontext = (PorcelainJsonText)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonText.getClassLoader());
            String s1 = parcel.readString();
            PorcelainJsonNavigationLink porcelainjsonnavigationlink = (PorcelainJsonNavigationLink)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonNavigationLink.getClassLoader());
            PorcelainJsonNavigationLink porcelainjsonnavigationlink1 = (PorcelainJsonNavigationLink)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonNavigationLink.getClassLoader());
            PorcelainJsonPlayable porcelainjsonplayable = (PorcelainJsonPlayable)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonPlayable.getClassLoader());
            return new PorcelainJsonWideCellItem(s, porcelainjsonmetricsdata, porcelainjsontext, s1, porcelainjsonnavigationlink, porcelainjsonnavigationlink1, (PorcelainJsonImage)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonAccessory.getClassLoader()), (PorcelainJsonAccessory)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonAccessory.getClassLoader()), porcelainjsonplayable, Boolean.valueOf(flag));
        }

        public final volatile Object[] newArray(int i)
        {
            return new PorcelainJsonWideCellItem[i];
        }

    };
    private static final String KEY_ACCESSORY_RIGHT = "accessoryRight";
    private static final String KEY_CAPTION = "caption";
    private static final String KEY_ENABLED = "enabled";
    private static final String KEY_IMAGE = "image";
    private static final String KEY_LINK = "link";
    private static final String KEY_LINK_LONG_CLICK = "longClick";
    private static final String KEY_PLAYABLE = "playback";
    private static final String KEY_TEXT = "text";
    private final PorcelainJsonAccessory mAccessoryRight;
    private final String mCaption;
    private final PorcelainJsonImage mImage;
    private final boolean mIsEnabled;
    private final PorcelainJsonNavigationLink mLink;
    private final PorcelainJsonNavigationLink mLongClickLink;
    private final PorcelainJsonPlayable mPlayable;
    private final PorcelainJsonText mText;

    public PorcelainJsonWideCellItem(String s, PorcelainJsonMetricsData porcelainjsonmetricsdata, PorcelainJsonText porcelainjsontext, String s1, PorcelainJsonNavigationLink porcelainjsonnavigationlink, PorcelainJsonNavigationLink porcelainjsonnavigationlink1, PorcelainJsonImage porcelainjsonimage, 
            PorcelainJsonAccessory porcelainjsonaccessory, PorcelainJsonPlayable porcelainjsonplayable, Boolean boolean1)
    {
        super(s, porcelainjsonmetricsdata);
        mText = porcelainjsontext;
        mCaption = s1;
        mLink = porcelainjsonnavigationlink;
        mLongClickLink = porcelainjsonnavigationlink1;
        boolean flag;
        if (boolean1 != null && boolean1.booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIsEnabled = flag;
        mPlayable = porcelainjsonplayable;
        mImage = (PorcelainJsonImage)ctz.a(porcelainjsonimage);
        mAccessoryRight = porcelainjsonaccessory;
    }

    public final PorcelainJsonAccessory getAccessoryRight()
    {
        return mAccessoryRight;
    }

    public final volatile dru getAccessoryRight()
    {
        return getAccessoryRight();
    }

    public final volatile CharSequence getCaption()
    {
        return getCaption();
    }

    public final String getCaption()
    {
        return mCaption;
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
        return PorcelainMetricsRenderType.e;
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
        return 0x7f1100f6;
    }

    public final boolean isEnabled()
    {
        return mIsEnabled;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        gen.a(parcel, mIsEnabled);
        parcel.writeParcelable(mText, 0);
        parcel.writeString(mCaption);
        parcel.writeParcelable(mLink, 0);
        parcel.writeParcelable(mLongClickLink, 0);
        parcel.writeParcelable(mPlayable, 0);
        parcel.writeParcelable(mImage, 0);
        parcel.writeParcelable(mAccessoryRight, 0);
    }

}
