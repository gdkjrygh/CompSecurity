// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.model.threads;

import android.os.Parcel;

final class j
    implements android.os.Parcelable.Creator
{

    j()
    {
    }

    public TitanAttachmentInfo.ImageData a(Parcel parcel)
    {
        return new TitanAttachmentInfo.ImageData(parcel);
    }

    public TitanAttachmentInfo.ImageData[] a(int i)
    {
        return new TitanAttachmentInfo.ImageData[i];
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
