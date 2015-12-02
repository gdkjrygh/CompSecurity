// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.service.s;

// Referenced classes of package com.facebook.contacts.server:
//            i

public class FetchChatContextParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new i();
    private final s a;

    private FetchChatContextParams(Parcel parcel)
    {
        a = s.valueOf(parcel.readString());
    }

    FetchChatContextParams(Parcel parcel, i j)
    {
        this(parcel);
    }

    public FetchChatContextParams(s s1)
    {
        a = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        parcel.writeString(a.toString());
    }

}
