// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import android.os.Parcel;

final class av
    implements android.os.Parcelable.Creator
{

    av()
    {
    }

    public SendWebrtcMessageMethod.Params a(Parcel parcel)
    {
        return new SendWebrtcMessageMethod.Params(parcel);
    }

    public SendWebrtcMessageMethod.Params[] a(int i)
    {
        return new SendWebrtcMessageMethod.Params[i];
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
