// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;

// Referenced classes of package com.facebook.contacts.server:
//            UploadBulkContactFieldMatch

final class ah
    implements android.os.Parcelable.Creator
{

    ah()
    {
    }

    public UploadBulkContactFieldMatch a(Parcel parcel)
    {
        return new UploadBulkContactFieldMatch(parcel, null);
    }

    public UploadBulkContactFieldMatch[] a(int i)
    {
        return new UploadBulkContactFieldMatch[i];
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
