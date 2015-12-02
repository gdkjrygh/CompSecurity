// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.c.a;
import com.facebook.fbservice.c.b;
import com.facebook.user.User;
import com.google.common.a.es;

// Referenced classes of package com.facebook.contacts.server:
//            s

public class FetchMessagingFavoritesResult extends a
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new s();
    private final es a;

    private FetchMessagingFavoritesResult(Parcel parcel)
    {
        super(parcel);
        a = es.a(parcel.readArrayList(com/facebook/user/User.getClassLoader()));
    }

    FetchMessagingFavoritesResult(Parcel parcel, s s1)
    {
        this(parcel);
    }

    public FetchMessagingFavoritesResult(b b, es es1, long l)
    {
        super(b, l);
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
        super.writeToParcel(parcel, i);
        parcel.writeList(a);
    }

}
