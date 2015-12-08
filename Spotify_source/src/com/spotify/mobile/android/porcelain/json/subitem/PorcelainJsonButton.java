// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json.subitem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.porcelain.subitem.PorcelainIcon;
import com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink;
import ctz;
import drv;
import gdf;
import gen;

// Referenced classes of package com.spotify.mobile.android.porcelain.json.subitem:
//            PorcelainJsonNavigationLink

public class PorcelainJsonButton
    implements Parcelable, JacksonModel, drv
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new PorcelainJsonButton(parcel.readString(), PorcelainIcon.values()[parcel.readInt()], (PorcelainJsonNavigationLink)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonNavigationLink.getClassLoader()), gen.a(parcel));
        }

        public final volatile Object[] newArray(int i)
        {
            return new PorcelainJsonButton[i];
        }

    };
    private static final String KEY_ICON = "icon";
    private static final String KEY_LINK = "link";
    private static final String KEY_PRESERVE = "preserve";
    private static final String KEY_TEXT = "text";
    private final PorcelainIcon mIcon;
    private final PorcelainJsonNavigationLink mLink;
    private final boolean mPreserve;
    private final String mText;

    public PorcelainJsonButton(String s, PorcelainIcon porcelainicon, PorcelainJsonNavigationLink porcelainjsonnavigationlink, boolean flag)
    {
        mText = (String)ctz.a(s);
        mIcon = (PorcelainIcon)ctz.a(porcelainicon);
        mLink = porcelainjsonnavigationlink;
        mPreserve = flag;
    }

    PorcelainJsonButton(String s, String s1, PorcelainJsonNavigationLink porcelainjsonnavigationlink, Boolean boolean1)
    {
        s1 = (PorcelainIcon)PorcelainIcon.a().b(s1).a(PorcelainIcon.i);
        boolean flag;
        if (boolean1 == null || boolean1.booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this(s, ((PorcelainIcon) (s1)), porcelainjsonnavigationlink, flag);
    }

    public int describeContents()
    {
        return 0;
    }

    public PorcelainIcon getIcon()
    {
        return mIcon;
    }

    public PorcelainJsonNavigationLink getLink()
    {
        return mLink;
    }

    public volatile PorcelainNavigationLink getLink()
    {
        return getLink();
    }

    public String getText()
    {
        return mText;
    }

    public boolean isPreserved()
    {
        return mPreserve;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mText);
        parcel.writeInt(mIcon.ordinal());
        parcel.writeParcelable(mLink, 0);
        gen.a(parcel, mPreserve);
    }

}
