// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.charts.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import gdw;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.charts.model:
//            ChartsBlock

public class ChartsOverview
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new ChartsOverview(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new ChartsOverview[i];
        }

    };
    public final List blocks;

    private ChartsOverview(Parcel parcel)
    {
        blocks = parcel.createTypedArrayList(ChartsBlock.CREATOR);
    }


    public ChartsOverview(List list)
    {
        blocks = gdw.a(list);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeTypedList(blocks);
    }

}
