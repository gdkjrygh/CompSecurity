// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Parcel;

final class b
    implements android.os.Parcelable.Creator
{

    b()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new MediaSessionCompat.ResultReceiverWrapper(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new MediaSessionCompat.ResultReceiverWrapper[i];
    }
}
