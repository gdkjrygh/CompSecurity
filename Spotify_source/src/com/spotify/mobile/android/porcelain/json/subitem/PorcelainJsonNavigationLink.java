// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json.subitem;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.base.Optional;
import com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink;
import ctz;
import gdf;
import gen;

// Referenced classes of package com.spotify.mobile.android.porcelain.json.subitem:
//            PorcelainJsonLoggableEntity

public class PorcelainJsonNavigationLink extends PorcelainJsonLoggableEntity
    implements Parcelable, PorcelainNavigationLink
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            String s = parcel.readString();
            String s1 = parcel.readString();
            return new PorcelainJsonNavigationLink(com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink.Type.values()[parcel.readInt()], s, s1, gen.e(parcel));
        }

        public final volatile Object[] newArray(int i)
        {
            return new PorcelainJsonNavigationLink[i];
        }

    };
    private static final String KEY_LOGGING_DATA = "loggingData";
    private static final String KEY_TARGET_TITLE = "targetTitle";
    private static final String KEY_TYPE = "type";
    private static final String KEY_URI = "uri";
    private static final gdf TYPE_PARSER = gdf.a(com/spotify/mobile/android/porcelain/subitem/PorcelainNavigationLink$Type);
    private final String mTargetTitle;
    private final com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink.Type mType;
    private final String mUri;

    public PorcelainJsonNavigationLink(com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink.Type type, String s, String s1, JsonNode jsonnode)
    {
        super(s, jsonnode);
        mUri = (String)ctz.a(s);
        mType = (com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink.Type)ctz.a(type);
        mTargetTitle = s1;
    }

    PorcelainJsonNavigationLink(String s, String s1, String s2, JsonNode jsonnode)
    {
        this((com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink.Type)TYPE_PARSER.a(s).a(com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink.Type.b), (String)ctz.a(s1), s2, jsonnode);
    }

    public int describeContents()
    {
        return 0;
    }

    public String getTargetTitle()
    {
        return mTargetTitle;
    }

    public com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink.Type getType()
    {
        return mType;
    }

    public String getUri()
    {
        return mUri;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mUri);
        parcel.writeString(mTargetTitle);
        parcel.writeInt(mType.ordinal());
        writeExtraDataToParcel(parcel);
    }

}
