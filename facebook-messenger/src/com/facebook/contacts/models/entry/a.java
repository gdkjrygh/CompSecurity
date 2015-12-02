// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.models.entry;

import android.os.Parcel;

// Referenced classes of package com.facebook.contacts.models.entry:
//            AddressEntry

final class a
    implements android.os.Parcelable.Creator
{

    a()
    {
    }

    public AddressEntry a(Parcel parcel)
    {
        return new AddressEntry(parcel);
    }

    public AddressEntry[] a(int i)
    {
        return new AddressEntry[i];
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
