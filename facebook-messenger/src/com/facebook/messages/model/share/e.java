// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.model.share;

import android.os.Parcel;

// Referenced classes of package com.facebook.messages.model.share:
//            ShareMediaPhoto

final class e
    implements android.os.Parcelable.Creator
{

    e()
    {
    }

    public ShareMediaPhoto a(Parcel parcel)
    {
        return new ShareMediaPhoto(parcel, null);
    }

    public ShareMediaPhoto[] a(int i)
    {
        return new ShareMediaPhoto[i];
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
