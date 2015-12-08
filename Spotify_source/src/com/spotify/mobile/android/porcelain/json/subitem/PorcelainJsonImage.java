// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json.subitem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.porcelain.subitem.PorcelainIcon;
import com.spotify.mobile.android.porcelain.subitem.PorcelainImage;
import ctz;
import gdf;

public class PorcelainJsonImage
    implements Parcelable, JacksonModel, PorcelainImage
{

    private static final gdf BADGE_PARSER = gdf.a(com/spotify/mobile/android/porcelain/subitem/PorcelainImage$Badge);
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            String s = parcel.readString();
            PorcelainIcon porcelainicon = PorcelainIcon.values()[parcel.readInt()];
            return new PorcelainJsonImage(s, com.spotify.mobile.android.porcelain.subitem.PorcelainImage.Shape.values()[parcel.readInt()], com.spotify.mobile.android.porcelain.subitem.PorcelainImage.Badge.values()[parcel.readInt()], porcelainicon);
        }

        public final volatile Object[] newArray(int i)
        {
            return new PorcelainJsonImage[i];
        }

    };
    private static final String KEY_BADGE = "badge";
    private static final String KEY_PLACEHOLDER = "placeholder";
    private static final String KEY_SHAPE = "shape";
    private static final String KEY_URI = "uri";
    private static final gdf SHAPE_PARSER = gdf.a(com/spotify/mobile/android/porcelain/subitem/PorcelainImage$Shape);
    private final com.spotify.mobile.android.porcelain.subitem.PorcelainImage.Badge mBadge;
    private final String mImageUrl;
    private final PorcelainIcon mPlaceHolder;
    private final com.spotify.mobile.android.porcelain.subitem.PorcelainImage.Shape mShape;

    public PorcelainJsonImage(String s, com.spotify.mobile.android.porcelain.subitem.PorcelainImage.Shape shape, com.spotify.mobile.android.porcelain.subitem.PorcelainImage.Badge badge, PorcelainIcon porcelainicon)
    {
        mPlaceHolder = (PorcelainIcon)ctz.a(porcelainicon);
        mShape = (com.spotify.mobile.android.porcelain.subitem.PorcelainImage.Shape)ctz.a(shape);
        mBadge = (com.spotify.mobile.android.porcelain.subitem.PorcelainImage.Badge)ctz.a(badge);
        mImageUrl = s;
    }

    PorcelainJsonImage(String s, String s1, String s2, String s3)
    {
        this(s, (com.spotify.mobile.android.porcelain.subitem.PorcelainImage.Shape)SHAPE_PARSER.a(s1).a(com.spotify.mobile.android.porcelain.subitem.PorcelainImage.Shape.a), (com.spotify.mobile.android.porcelain.subitem.PorcelainImage.Badge)BADGE_PARSER.a(s2).a(com.spotify.mobile.android.porcelain.subitem.PorcelainImage.Badge.a), (PorcelainIcon)PorcelainIcon.a().a(s3).a(PorcelainIcon.o));
    }

    public int describeContents()
    {
        return 0;
    }

    public com.spotify.mobile.android.porcelain.subitem.PorcelainImage.Badge getBadge()
    {
        return mBadge;
    }

    public PorcelainIcon getPlaceHolder()
    {
        return mPlaceHolder;
    }

    public com.spotify.mobile.android.porcelain.subitem.PorcelainImage.Shape getShape()
    {
        return mShape;
    }

    public String getUrl()
    {
        return mImageUrl;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mImageUrl);
        parcel.writeInt(mPlaceHolder.ordinal());
        parcel.writeInt(mShape.ordinal());
        parcel.writeInt(mBadge.ordinal());
    }

}
