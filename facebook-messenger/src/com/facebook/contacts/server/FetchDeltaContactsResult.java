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
//            p

public class FetchDeltaContactsResult extends a
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new p();
    private final es a;
    private final es b;
    private final String c;
    private final boolean d;

    private FetchDeltaContactsResult(Parcel parcel)
    {
        boolean flag = true;
        super(parcel);
        a = es.a(parcel.readArrayList(com/facebook/contacts/models/Contact.getClassLoader()));
        b = es.a(parcel.createStringArrayList());
        c = parcel.readString();
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        d = flag;
    }

    FetchDeltaContactsResult(Parcel parcel, p p1)
    {
        this(parcel);
    }

    public FetchDeltaContactsResult(b b1, es es1, es es2, String s, boolean flag, long l)
    {
        super(b1, l);
        Preconditions.checkNotNull(es1);
        Preconditions.checkNotNull(es2);
        a = es1;
        b = es2;
        c = s;
        d = flag;
    }

    public es a()
    {
        return a;
    }

    public es b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public boolean d()
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
        parcel.writeList(b);
        parcel.writeString(c);
        if (d)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}
