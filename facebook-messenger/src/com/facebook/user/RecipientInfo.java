// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.a.es;
import com.google.common.a.et;
import java.util.Iterator;

// Referenced classes of package com.facebook.user:
//            l, UserIdentifier, Name, UserWithIdentifier, 
//            User

public class RecipientInfo
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new l();
    private final UserIdentifier a;
    private final Name b;

    private RecipientInfo(Parcel parcel)
    {
        a = (UserIdentifier)parcel.readParcelable(com/facebook/user/UserIdentifier.getClassLoader());
        b = (Name)parcel.readParcelable(com/facebook/user/Name.getClassLoader());
    }

    RecipientInfo(Parcel parcel, l l1)
    {
        this(parcel);
    }

    public RecipientInfo(UserIdentifier useridentifier, Name name)
    {
        a = useridentifier;
        b = name;
    }

    public static RecipientInfo a(UserWithIdentifier userwithidentifier)
    {
        return new RecipientInfo(userwithidentifier.c(), userwithidentifier.a().d());
    }

    public static es a(es es1)
    {
        et et1 = es.e();
        for (es1 = es1.iterator(); es1.hasNext(); et1.b(a((UserWithIdentifier)es1.next()))) { }
        return et1.b();
    }

    public UserIdentifier a()
    {
        return a;
    }

    public Name b()
    {
        return b;
    }

    public String c()
    {
        return b.f();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
        parcel.writeParcelable(b, i);
    }

}
