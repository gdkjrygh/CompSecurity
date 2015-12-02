// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.upload;

import android.os.Parcel;

// Referenced classes of package com.facebook.contacts.upload:
//            ContactsUploadProgressMode

final class b
    implements android.os.Parcelable.Creator
{

    b()
    {
    }

    public ContactsUploadProgressMode a(Parcel parcel)
    {
        int i = parcel.readInt();
        return ((ContactsUploadProgressMode[])com/facebook/contacts/upload/ContactsUploadProgressMode.getEnumConstants())[i];
    }

    public ContactsUploadProgressMode[] a(int i)
    {
        return new ContactsUploadProgressMode[i];
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
