// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.models.entry;

import android.os.Parcel;

// Referenced classes of package com.facebook.contacts.models.entry:
//            Entry, b, d

public class DefaultEntry
    implements Entry
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    private final String a;
    private final String b;

    protected DefaultEntry(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
    }

    public DefaultEntry(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public d a()
    {
        return d.DEFAULT;
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
            obj = (DefaultEntry)obj;
            if (!a.equals(((DefaultEntry) (obj)).getLabel()))
            {
                return false;
            }
            if (!b.equals(((DefaultEntry) (obj)).getValue()))
            {
                return false;
            }
        }
        return true;
    }

    public String getLabel()
    {
        return a;
    }

    public String getValue()
    {
        return b;
    }

    public int hashCode()
    {
        return a.hashCode() * 31 + b.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
    }

}
