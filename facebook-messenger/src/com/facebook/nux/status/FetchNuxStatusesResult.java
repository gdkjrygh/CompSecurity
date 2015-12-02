// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nux.status;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.a.es;

// Referenced classes of package com.facebook.nux.status:
//            c, NuxStatusResult

public class FetchNuxStatusesResult
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    private final es a;

    private FetchNuxStatusesResult(Parcel parcel)
    {
        a = es.a(parcel.readArrayList(com/facebook/nux/status/NuxStatusResult.getClassLoader()));
    }

    FetchNuxStatusesResult(Parcel parcel, c c1)
    {
        this(parcel);
    }

    public FetchNuxStatusesResult(es es1)
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
