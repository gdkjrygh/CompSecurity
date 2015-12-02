// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.picker;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.contacts.picker:
//            k

public final class ContactPickerColorScheme extends Enum
    implements Parcelable
{

    private static final ContactPickerColorScheme $VALUES[];
    public static final android.os.Parcelable.Creator CREATOR = new k();
    public static final ContactPickerColorScheme DEFAULT_SCHEME;
    public static final ContactPickerColorScheme DIVEBAR_SCHEME;

    private ContactPickerColorScheme(String s, int i)
    {
        super(s, i);
    }

    public static ContactPickerColorScheme valueOf(String s)
    {
        return (ContactPickerColorScheme)Enum.valueOf(com/facebook/contacts/picker/ContactPickerColorScheme, s);
    }

    public static ContactPickerColorScheme[] values()
    {
        return (ContactPickerColorScheme[])$VALUES.clone();
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
        DEFAULT_SCHEME = new ContactPickerColorScheme("DEFAULT_SCHEME", 0);
        DIVEBAR_SCHEME = new ContactPickerColorScheme("DIVEBAR_SCHEME", 1);
        $VALUES = (new ContactPickerColorScheme[] {
            DEFAULT_SCHEME, DIVEBAR_SCHEME
        });
    }
}
