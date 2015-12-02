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
//            h

public class FetchAllContactsResult extends a
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new h();
    private final es a;
    private final String b;
    private final boolean c;
    private final String d;

    private FetchAllContactsResult(Parcel parcel)
    {
        boolean flag = true;
        super(parcel);
        a = es.a(parcel.readArrayList(com/facebook/contacts/models/Contact.getClassLoader()));
        b = parcel.readString();
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        c = flag;
        d = parcel.readString();
    }

    FetchAllContactsResult(Parcel parcel, h h1)
    {
        this(parcel);
    }

    public FetchAllContactsResult(b b1, es es1, String s, boolean flag, String s1, long l)
    {
        super(b1, l);
        Preconditions.checkNotNull(es1);
        a = es1;
        b = s;
        c = flag;
        d = s1;
    }

    public es a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public boolean c()
    {
        return c;
    }

    public String d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeList(a);
        parcel.writeString(b);
        if (c)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeString(d);
    }

}
