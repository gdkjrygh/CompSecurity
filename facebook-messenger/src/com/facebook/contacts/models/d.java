// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.models;

import android.os.Parcel;

// Referenced classes of package com.facebook.contacts.models:
//            ContactPhone

final class d
    implements android.os.Parcelable.Creator
{

    d()
    {
    }

    public ContactPhone a(Parcel parcel)
    {
        return new ContactPhone(parcel, null);
    }

    public ContactPhone[] a(int i)
    {
        return new ContactPhone[i];
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
