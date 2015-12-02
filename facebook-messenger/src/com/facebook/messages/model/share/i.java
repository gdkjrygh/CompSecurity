// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.model.share;

import android.os.Parcel;

// Referenced classes of package com.facebook.messages.model.share:
//            ShareProperty

final class i
    implements android.os.Parcelable.Creator
{

    i()
    {
    }

    public ShareProperty a(Parcel parcel)
    {
        return new ShareProperty(parcel, null);
    }

    public ShareProperty[] a(int j)
    {
        return new ShareProperty[j];
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
