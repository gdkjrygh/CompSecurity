// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.user.UserWithIdentifier;
import com.google.common.a.es;
import java.util.List;

// Referenced classes of package com.facebook.orca.server:
//            b

public class AddMembersParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    private final String a;
    private final es b;

    private AddMembersParams(Parcel parcel)
    {
        a = parcel.readString();
        b = es.a(parcel.readArrayList(com/facebook/user/UserWithIdentifier.getClassLoader()));
    }

    AddMembersParams(Parcel parcel, b b1)
    {
        this(parcel);
    }

    public AddMembersParams(String s, List list)
    {
        a = s;
        b = es.a(list);
    }

    public String a()
    {
        return a;
    }

    public es b()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeList(b);
    }

}
