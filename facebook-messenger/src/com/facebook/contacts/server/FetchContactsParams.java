// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.a.fi;
import com.google.common.a.hq;

// Referenced classes of package com.facebook.contacts.server:
//            m

public class FetchContactsParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new m();
    private final fi a;

    private FetchContactsParams(Parcel parcel)
    {
        a = fi.a(parcel.createStringArrayList());
    }

    FetchContactsParams(Parcel parcel, m m1)
    {
        this(parcel);
    }

    public FetchContactsParams(fi fi1)
    {
        a = fi1;
    }

    public fi a()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeStringList(hq.a(a));
    }

}
