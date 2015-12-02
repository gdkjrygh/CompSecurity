// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.model.threads;

import android.os.Parcel;

// Referenced classes of package com.facebook.messages.model.threads:
//            TitanAttachmentInfo

final class i
    implements android.os.Parcelable.Creator
{

    i()
    {
    }

    public TitanAttachmentInfo a(Parcel parcel)
    {
        return new TitanAttachmentInfo(parcel, null);
    }

    public TitanAttachmentInfo[] a(int j)
    {
        return new TitanAttachmentInfo[j];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int j)
    {
        return a(j);
    }
}
