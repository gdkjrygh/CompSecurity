// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.user.User;
import com.google.common.a.es;
import java.util.List;

// Referenced classes of package com.facebook.contacts.server:
//            ab

public class UpdateFavoriteContactsParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ab();
    private final es a;

    UpdateFavoriteContactsParams(Parcel parcel)
    {
        a = es.a(parcel.readArrayList(com/facebook/user/User.getClassLoader()));
    }

    public UpdateFavoriteContactsParams(List list)
    {
        a = es.a(list);
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
