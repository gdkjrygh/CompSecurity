// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.c.a;
import com.facebook.fbservice.c.b;
import com.google.common.a.es;

// Referenced classes of package com.facebook.contacts.server:
//            al

public class UploadBulkContactsResult extends a
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new al();
    private final String a;
    private final es b;

    private UploadBulkContactsResult(Parcel parcel)
    {
        super(parcel);
        a = parcel.readString();
        b = es.a(parcel.readArrayList(com/facebook/contacts/server/UploadBulkContactsResult.getClassLoader()));
    }

    UploadBulkContactsResult(Parcel parcel, al al1)
    {
        this(parcel);
    }

    public UploadBulkContactsResult(String s, es es1, b b1, long l)
    {
        super(b1, l);
        a = s;
        b = es1;
    }

    public String a()
    {
        return a;
    }

    public es b()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append("UploadBulkContactsResult<").append(a).append(">: ").append(b).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeString(a);
        parcel.writeList(b);
    }

}
