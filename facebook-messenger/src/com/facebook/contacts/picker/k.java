// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.picker;

import android.os.Parcel;

// Referenced classes of package com.facebook.contacts.picker:
//            ContactPickerColorScheme

final class k
    implements android.os.Parcelable.Creator
{

    k()
    {
    }

    public ContactPickerColorScheme a(Parcel parcel)
    {
        return ContactPickerColorScheme.values()[parcel.readInt()];
    }

    public ContactPickerColorScheme[] a(int i)
    {
        return new ContactPickerColorScheme[i];
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
