// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.models.entry;

import android.os.Parcel;

// Referenced classes of package com.facebook.contacts.models.entry:
//            Entry, c, d

public class EmailEntry
    implements Entry
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    private final String a;

    protected EmailEntry(Parcel parcel)
    {
        a = parcel.readString();
    }

    public EmailEntry(String s)
    {
        a = s;
    }

    public d a()
    {
        return d.EMAIL;
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
            obj = (EmailEntry)obj;
            if (!a.equals(((EmailEntry) (obj)).getEmail()))
            {
                return false;
            }
        }
        return true;
    }

    public String getEmail()
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
