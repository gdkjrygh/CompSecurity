// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.album.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.JacksonModel;
import ctz;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.album.model:
//            AlbumTrack

public class AlbumDisc
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new AlbumDisc(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new AlbumDisc[i];
        }

    };
    public final String name;
    public final int number;
    public final List tracks;

    public AlbumDisc(int i, String s, List list)
    {
        number = i;
        name = (String)ctz.a(s);
        tracks = (List)Optional.c(list).a(new ArrayList());
    }

    private AlbumDisc(Parcel parcel)
    {
        number = parcel.readInt();
        name = parcel.readString();
        tracks = parcel.createTypedArrayList(AlbumTrack.CREATOR);
    }


    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(number);
        parcel.writeString(name);
        parcel.writeTypedList(tracks);
    }

}
