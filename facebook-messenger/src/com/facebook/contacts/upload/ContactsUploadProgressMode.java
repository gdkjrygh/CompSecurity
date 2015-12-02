// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.upload;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.contacts.upload:
//            b

public final class ContactsUploadProgressMode extends Enum
    implements Parcelable
{

    private static final ContactsUploadProgressMode $VALUES[];
    public static final android.os.Parcelable.Creator CREATOR = new b();
    public static final ContactsUploadProgressMode SHOW_IN_DIVE_BAR_ONLY;
    public static final ContactsUploadProgressMode SHOW_IN_THREAD_LIST_AND_DIVE_BAR;

    private ContactsUploadProgressMode(String s, int i)
    {
        super(s, i);
    }

    public static ContactsUploadProgressMode valueOf(String s)
    {
        return (ContactsUploadProgressMode)Enum.valueOf(com/facebook/contacts/upload/ContactsUploadProgressMode, s);
    }

    public static ContactsUploadProgressMode[] values()
    {
        return (ContactsUploadProgressMode[])$VALUES.clone();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(ordinal());
    }

    static 
    {
        SHOW_IN_THREAD_LIST_AND_DIVE_BAR = new ContactsUploadProgressMode("SHOW_IN_THREAD_LIST_AND_DIVE_BAR", 0);
        SHOW_IN_DIVE_BAR_ONLY = new ContactsUploadProgressMode("SHOW_IN_DIVE_BAR_ONLY", 1);
        $VALUES = (new ContactsUploadProgressMode[] {
            SHOW_IN_THREAD_LIST_AND_DIVE_BAR, SHOW_IN_DIVE_BAR_ONLY
        });
    }
}
