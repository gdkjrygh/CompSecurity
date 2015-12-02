// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nux.status;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.a.es;

// Referenced classes of package com.facebook.nux.status:
//            b

public class FetchNuxStatusesParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    private final es a;

    private FetchNuxStatusesParams(Parcel parcel)
    {
        a = es.a(parcel.readArrayList(java/lang/String.getClassLoader()));
    }

    FetchNuxStatusesParams(Parcel parcel, b b1)
    {
        this(parcel);
    }

    public FetchNuxStatusesParams(es es1)
    {
        a = es1;
    }

    public es a()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeList(a);
    }

}
