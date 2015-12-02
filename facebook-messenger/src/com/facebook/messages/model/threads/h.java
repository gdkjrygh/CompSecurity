// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.model.threads;

import android.os.Parcel;

// Referenced classes of package com.facebook.messages.model.threads:
//            SendError

final class h
    implements android.os.Parcelable.Creator
{

    h()
    {
    }

    public SendError a(Parcel parcel)
    {
        return new SendError(parcel, null);
    }

    public SendError[] a(int i)
    {
        return new SendError[i];
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
