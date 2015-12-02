// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.user.UserKey;

// Referenced classes of package com.facebook.contacts.server:
//            a

public class BlockContactParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final UserKey a;

    private BlockContactParams(Parcel parcel)
    {
        a = UserKey.a(parcel.readString());
    }

    BlockContactParams(Parcel parcel, a a1)
    {
        this(parcel);
    }

    public BlockContactParams(UserKey userkey)
    {
        a = userkey;
    }

    public UserKey a()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a.c());
    }

}
