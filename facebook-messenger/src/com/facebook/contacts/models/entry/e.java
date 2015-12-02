// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.models.entry;

import android.os.Parcel;

// Referenced classes of package com.facebook.contacts.models.entry:
//            PhoneEntry

final class e
    implements android.os.Parcelable.Creator
{

    e()
    {
    }

    public PhoneEntry a(Parcel parcel)
    {
        return new PhoneEntry(parcel);
    }

    public PhoneEntry[] a(int i)
    {
        return new PhoneEntry[i];
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
