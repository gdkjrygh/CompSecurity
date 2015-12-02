// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.service.s;

// Referenced classes of package com.facebook.contacts.server:
//            aa

public class SyncToCacheParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new aa();
    private final s a;

    private SyncToCacheParams(Parcel parcel)
    {
        a = s.valueOf(parcel.readString());
    }

    SyncToCacheParams(Parcel parcel, aa aa1)
    {
        this(parcel);
    }

    public SyncToCacheParams(s s1)
    {
        a = s1;
    }

    public s a()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a.toString());
    }

}
