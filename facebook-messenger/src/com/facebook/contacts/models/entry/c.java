// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.models.entry;

import android.os.Parcel;

// Referenced classes of package com.facebook.contacts.models.entry:
//            EmailEntry

final class c
    implements android.os.Parcelable.Creator
{

    c()
    {
    }

    public EmailEntry a(Parcel parcel)
    {
        return new EmailEntry(parcel);
    }

    public EmailEntry[] a(int i)
    {
        return new EmailEntry[i];
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
