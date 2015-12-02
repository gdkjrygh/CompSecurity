// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;

// Referenced classes of package com.facebook.contacts.server:
//            UploadBulkContactsResult

final class al
    implements android.os.Parcelable.Creator
{

    al()
    {
    }

    public UploadBulkContactsResult a(Parcel parcel)
    {
        return new UploadBulkContactsResult(parcel, null);
    }

    public UploadBulkContactsResult[] a(int i)
    {
        return new UploadBulkContactsResult[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
