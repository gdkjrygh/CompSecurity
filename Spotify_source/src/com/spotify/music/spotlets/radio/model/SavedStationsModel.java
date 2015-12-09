// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.radio.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

// Referenced classes of package com.spotify.music.spotlets.radio.model:
//            RadioStationModel

public class SavedStationsModel
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            parcel = parcel.readParcelableArray(com/spotify/music/spotlets/radio/model/SavedStationsModel.getClassLoader());
            RadioStationModel aradiostationmodel[] = new RadioStationModel[parcel.length];
            System.arraycopy(parcel, 0, aradiostationmodel, 0, parcel.length);
            return new SavedStationsModel(aradiostationmodel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new SavedStationsModel[i];
        }

    };
    public final RadioStationModel a[];

    public SavedStationsModel(RadioStationModel aradiostationmodel[])
    {
        a = aradiostationmodel;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof SavedStationsModel)
        {
            obj = (SavedStationsModel)obj;
            return Arrays.equals(a, ((SavedStationsModel) (obj)).a);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return Arrays.hashCode(a);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelableArray(a, 0);
    }

}
