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
//            Image, SimpleArtist, Tracks

public class Album
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new Album(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new Album[i];
        }

    };
    private String mArtistString;
    private final SimpleArtist mArtists[];
    private final String mId;
    private final List mImages;
    private final String mName;
    private final Tracks mTracks;
    private final String mType;

    protected Album(Parcel parcel)
    {
        mArtistString = "";
        mId = parcel.readString();
        mName = parcel.readString();
        mType = parcel.readString();
        mImages = new ArrayList();
        parcel.readTypedList(mImages, Image.CREATOR);
        mTracks = null;
        mArtists = new SimpleArtist[0];
        parcel.readTypedArray(mArtists, SimpleArtist.CREATOR);
        buildArtistString();
    }

    private Album(String s, String s1, String s2, List list, SimpleArtist asimpleartist[], Tracks tracks)
    {
        mArtistString = "";
        mId = s;
        mName = s1;
        mType = s2;
        mImages = list;
        mTracks = tracks;
        mArtists = asimpleartist;
        buildArtistString();
    }

    private void buildArtistString()
    {
        if (mArtists == null || mArtists.length == 0)
        {
            return;
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(mArtists[0].getName());
        for (int i = 1; i < mArtists.length; i++)
        {
            stringbuilder.append(", ");
            stringbuilder.append(mArtists[i].getName());
        }

        mArtistString = stringbuilder.toString();
    }

    public boolean containsImage()
    {
        return mImages != null && !mImages.isEmpty();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getArtistString()
    {
        return mArtistString;
    }

    public SimpleArtist[] getArtists()
    {
        return mArtists;
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

    public Tracks getTracks()
    {
        return mTracks;
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
        parcel.writeTypedList(mImages);
        parcel.writeTypedArray(mArtists, 0);
    }

}
