// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.models;

import android.os.Parcel;

// Referenced classes of package com.facebook.contacts.models:
//            EntrySection

final class h
    implements android.os.Parcelable.Creator
{

    h()
    {
    }

    public EntrySection a(Parcel parcel)
    {
        return new EntrySection(parcel, null);
    }

    public EntrySection[] a(int i)
    {
        return new EntrySection[i];
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
