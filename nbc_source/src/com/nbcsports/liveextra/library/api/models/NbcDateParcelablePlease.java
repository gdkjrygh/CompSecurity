// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.api.models;

import android.os.Parcel;
import org.joda.time.DateTime;

// Referenced classes of package com.nbcsports.liveextra.library.api.models:
//            NbcDate

public class NbcDateParcelablePlease
{

    public NbcDateParcelablePlease()
    {
    }

    public static void readFromParcel(NbcDate nbcdate, Parcel parcel)
    {
        nbcdate.rawDate = parcel.readString();
        nbcdate.date = (DateTime)parcel.readSerializable();
    }

    public static void writeToParcel(NbcDate nbcdate, Parcel parcel, int i)
    {
        parcel.writeString(nbcdate.rawDate);
        parcel.writeSerializable(nbcdate.date);
    }
}
