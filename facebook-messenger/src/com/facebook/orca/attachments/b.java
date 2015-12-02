// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.attachments;

import android.os.Parcel;

// Referenced classes of package com.facebook.orca.attachments:
//            AudioAttachmentData

final class b
    implements android.os.Parcelable.Creator
{

    b()
    {
    }

    public AudioAttachmentData a(Parcel parcel)
    {
        return new AudioAttachmentData(parcel, null);
    }

    public AudioAttachmentData[] a(int i)
    {
        return new AudioAttachmentData[i];
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
