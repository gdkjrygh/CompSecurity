// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.contacts.models.entry.Entry;
import com.google.common.a.es;
import com.google.common.base.Objects;

// Referenced classes of package com.facebook.contacts.models:
//            h

public class EntrySection
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new h();
    private final String a;
    private final es b;
    private final es c;

    private EntrySection(Parcel parcel)
    {
        a = parcel.readString();
        b = es.a(parcel.readArrayList(com/facebook/contacts/models/entry/Entry.getClassLoader()));
        c = es.a(parcel.readArrayList(com/facebook/contacts/models/entry/Entry.getClassLoader()));
    }

    EntrySection(Parcel parcel, h h1)
    {
        this(parcel);
    }

    public EntrySection(String s, es es1, es es2)
    {
        a = s;
        b = es1;
        c = es2;
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
            obj = (EntrySection)obj;
            if (!Objects.equal(a, ((EntrySection) (obj)).getTitle()) || !Objects.equal(b, ((EntrySection) (obj)).getEntries()) || !Objects.equal(c, ((EntrySection) (obj)).getHiddenEntries()))
            {
                return false;
            }
        }
        return true;
    }

    public es getEntries()
    {
        return b;
    }

    public es getHiddenEntries()
    {
        return c;
    }

    public String getTitle()
    {
        return a;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            a, b, c
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeList(b);
        parcel.writeList(c);
    }

}
