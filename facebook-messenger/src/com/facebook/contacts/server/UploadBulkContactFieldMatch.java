// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.contacts.server:
//            ah, ai, aj

public class UploadBulkContactFieldMatch
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ah();
    private final ai a;
    private final aj b;

    private UploadBulkContactFieldMatch(Parcel parcel)
    {
        a = (ai)Enum.valueOf(com/facebook/contacts/server/ai, parcel.readString());
        b = (aj)Enum.valueOf(com/facebook/contacts/server/aj, parcel.readString());
    }

    UploadBulkContactFieldMatch(Parcel parcel, ah ah1)
    {
        this(parcel);
    }

    public UploadBulkContactFieldMatch(ai ai1, aj aj1)
    {
        a = ai1;
        b = aj1;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append(" match type: ").append(a).append(" value type: ").append(b).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a.toString());
        parcel.writeString(b.toString());
    }

}
