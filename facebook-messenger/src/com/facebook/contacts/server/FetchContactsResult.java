// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.contacts.models.Contact;
import com.facebook.fbservice.c.a;
import com.facebook.fbservice.c.b;
import com.google.common.a.es;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.contacts.server:
//            n

public class FetchContactsResult extends a
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new n();
    private final es a;

    private FetchContactsResult(Parcel parcel)
    {
        super(parcel);
        a = es.a(parcel.readArrayList(com/facebook/contacts/models/Contact.getClassLoader()));
    }

    FetchContactsResult(Parcel parcel, n n1)
    {
        this(parcel);
    }

    public FetchContactsResult(b b, long l, es es1)
    {
        super(b, l);
        Preconditions.checkNotNull(es1);
        a = es1;
    }

    public es a()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append("FetchContactsResult: ").append(a).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeList(a);
    }

}
