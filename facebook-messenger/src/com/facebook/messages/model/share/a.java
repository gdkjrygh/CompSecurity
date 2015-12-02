// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.model.share;

import android.os.Parcel;

// Referenced classes of package com.facebook.messages.model.share:
//            Share

final class a
    implements android.os.Parcelable.Creator
{

    a()
    {
    }

    public Share a(Parcel parcel)
    {
        return new Share(parcel, null);
    }

    public Share[] a(int i)
    {
        return new Share[i];
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
