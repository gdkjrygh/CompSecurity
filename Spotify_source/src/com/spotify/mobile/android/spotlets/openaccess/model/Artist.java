// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.openaccess.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import ctz;
import geh;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.openaccess.model:
//            Image

public class Artist
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new Artist(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new Artist[i];
        }

    };
    private final String mId;
    private final List mImages;
    private final String mName;
    private final String mType;

    protected Artist(Parcel parcel)
    {
        mId = parcel.readString();
        mName = parcel.readString();
        mType = parcel.readString();
        mImages = new ArrayList();
        parcel.readTypedList(mImages, Image.CREATOR);
    }

    private Artist(String s, String s1, String s2, List list)
    {
        mId = s;
        mName = s1;
        mType = s2;
        mImages = list;
    }

    public boolean containsImage()
    {
        return mImages != null && !mImages.isEmpty();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getId()
    {
        return mId;
    }

    public Image getLargestImage()
    {
        ctz.a(mImages);
        geh.a(mImages, "Images array may not be empty");
        return (Image)mImages.get(0);
    }

    public String getName()
    {
        return mName;
    }

    public String getType()
    {
        return mType;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mId);
        parcel.writeString(mName);
        parcel.writeString(mType);
        parcel.writeList(mImages);
    }

}
