// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.contacts.models.Contact;
import com.facebook.contacts.models.ContactDetails;
import com.facebook.fbservice.c.a;
import com.facebook.fbservice.c.b;

// Referenced classes of package com.facebook.contacts.server:
//            l

public class FetchContactResult extends a
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new l();
    public static final FetchContactResult a;
    private final Contact b;
    private final ContactDetails c;

    private FetchContactResult(Parcel parcel)
    {
        super(parcel);
        b = (Contact)parcel.readParcelable(com/facebook/contacts/models/Contact.getClassLoader());
        c = (ContactDetails)parcel.readParcelable(com/facebook/contacts/models/ContactDetails.getClassLoader());
    }

    FetchContactResult(Parcel parcel, l l1)
    {
        this(parcel);
    }

    public FetchContactResult(b b1, long l1, Contact contact, ContactDetails contactdetails)
    {
        super(b1, l1);
        b = contact;
        c = contactdetails;
    }

    public Contact a()
    {
        return b;
    }

    public ContactDetails b()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append("FetchContactResult (ts ").append(f()).append(") (contactSummary ").append(b).append(") (freshness ").append(e()).append(")").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(b, i);
        parcel.writeParcelable(c, i);
    }

    static 
    {
        a = new FetchContactResult(b.NO_DATA, -1L, null, null);
    }
}
