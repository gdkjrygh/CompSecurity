// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.models;

import android.os.Parcel;

// Referenced classes of package com.facebook.contacts.models:
//            Contact

final class a
    implements android.os.Parcelable.Creator
{

    a()
    {
    }

    public Contact a(Parcel parcel)
    {
        return new Contact(parcel, null);
    }

    public Contact[] a(int i)
    {
        return new Contact[i];
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
