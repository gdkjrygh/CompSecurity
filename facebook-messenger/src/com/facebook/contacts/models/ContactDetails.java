// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.contacts.models:
//            c, EntrySection

public class ContactDetails
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    private final String a;
    private final EntrySection b;
    private final boolean c;

    private ContactDetails(Parcel parcel)
    {
        a = parcel.readString();
        b = (EntrySection)parcel.readParcelable(com/facebook/contacts/models/EntrySection.getClassLoader());
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
    }

    ContactDetails(Parcel parcel, c c1)
    {
        this(parcel);
    }

    public ContactDetails(String s, EntrySection entrysection, boolean flag)
    {
        Preconditions.checkNotNull(s);
        Preconditions.checkNotNull(entrysection);
        a = s;
        b = entrysection;
        c = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getContactId()
    {
        return a;
    }

    public EntrySection getContactInfoSection()
    {
        return b;
    }

    public boolean getHasTimeline()
    {
        return c;
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append("<").append(a).append("> has timeline: ").append(c).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeParcelable(b, i);
        if (c)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}
