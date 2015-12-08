// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.os;

import android.os.Parcel;

// Referenced classes of package android.support.v4.os:
//            ParcelableCompat, ParcelableCompatCreatorCallbacks

public static final class mCallbacks
    implements android.os.patCreator
{

    final ParcelableCompatCreatorCallbacks mCallbacks;

    public final Object createFromParcel(Parcel parcel)
    {
        return mCallbacks.createFromParcel(parcel, null);
    }

    public final Object[] newArray(int i)
    {
        return mCallbacks.newArray(i);
    }

    public s(ParcelableCompatCreatorCallbacks parcelablecompatcreatorcallbacks)
    {
        mCallbacks = parcelablecompatcreatorcallbacks;
    }
}
