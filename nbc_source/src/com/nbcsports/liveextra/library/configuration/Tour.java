// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.configuration;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.nbcsports.liveextra.library.configuration:
//            Sport, TourParcelablePlease

public class Tour extends Sport
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Tour createFromParcel(Parcel parcel)
        {
            Tour tour = new Tour();
            TourParcelablePlease.readFromParcel(tour, parcel);
            return tour;
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public Tour[] newArray(int i)
        {
            return new Tour[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    String sportAdLogo;
    String sportLogo;

    public Tour()
    {
    }

    public Tour(Parcel parcel)
    {
    }

    public int describeContents()
    {
        return 0;
    }

    public String getSportAdLogo()
    {
        return sportAdLogo;
    }

    public String getSportLogo()
    {
        return sportLogo;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        TourParcelablePlease.writeToParcel(this, parcel, i);
    }

}
