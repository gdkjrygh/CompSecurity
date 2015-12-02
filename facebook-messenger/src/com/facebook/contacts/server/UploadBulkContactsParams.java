// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.a.es;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.contacts.server:
//            ak, UploadBulkContactChange

public class UploadBulkContactsParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ak();
    private final String a;
    private final es b;

    private UploadBulkContactsParams(Parcel parcel)
    {
        a = parcel.readString();
        b = es.a(parcel.readArrayList(com/facebook/contacts/server/UploadBulkContactChange.getClassLoader()));
    }

    UploadBulkContactsParams(Parcel parcel, ak ak1)
    {
        this(parcel);
    }

    public UploadBulkContactsParams(String s, es es1)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (s == null || s.length() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (es1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (!es1.isEmpty())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
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

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeList(b);
    }

}
