// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.models.entry;

import android.os.Parcel;

// Referenced classes of package com.facebook.contacts.models.entry:
//            Entry, a, d

public class AddressEntry
    implements Entry
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final String a;

    protected AddressEntry(Parcel parcel)
    {
        a = parcel.readString();
    }

    public AddressEntry(String s)
    {
        a = s;
    }

    public d a()
    {
        return d.ADDRESS;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (AddressEntry)obj;
            if (!a.equals(((AddressEntry) (obj)).getAddress()))
            {
                return false;
            }
        }
        return true;
    }

    public String getAddress()
    {
        return a;
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
    }

}
