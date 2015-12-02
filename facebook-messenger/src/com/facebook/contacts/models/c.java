// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.models;

import android.os.Parcel;

// Referenced classes of package com.facebook.contacts.models:
//            ContactDetails

final class c
    implements android.os.Parcelable.Creator
{

    c()
    {
    }

    public ContactDetails a(Parcel parcel)
    {
        return new ContactDetails(parcel, null);
    }

    public ContactDetails[] a(int i)
    {
        return new ContactDetails[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
