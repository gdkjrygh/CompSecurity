// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.service.s;
import com.facebook.user.UserKey;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.contacts.server:
//            k

public class FetchContactParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new k();
    private final UserKey a;
    private final s b;

    private FetchContactParams(Parcel parcel)
    {
        a = UserKey.a(parcel.readString());
        b = s.valueOf(parcel.readString());
    }

    FetchContactParams(Parcel parcel, k k1)
    {
        this(parcel);
    }

    public FetchContactParams(s s1, UserKey userkey)
    {
        Preconditions.checkNotNull(userkey);
        a = userkey;
        b = s1;
    }

    public UserKey a()
    {
        return a;
    }

    public s b()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a.c());
        parcel.writeString(b.toString());
    }

}
