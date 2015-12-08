// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.os;

import android.os.Parcel;

// Referenced classes of package android.support.v4.os:
//            ParcelableCompatCreatorCallbacks

final class ParcelableCompatCreatorHoneycombMR2
    implements android.os.Parcelable.ClassLoaderCreator
{

    private final ParcelableCompatCreatorCallbacks mCallbacks;

    public ParcelableCompatCreatorHoneycombMR2(ParcelableCompatCreatorCallbacks parcelablecompatcreatorcallbacks)
    {
        mCallbacks = parcelablecompatcreatorcallbacks;
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return mCallbacks.createFromParcel(parcel, null);
    }

    public final Object createFromParcel(Parcel parcel, ClassLoader classloader)
    {
        return mCallbacks.createFromParcel(parcel, classloader);
    }

    public final Object[] newArray(int i)
    {
        return mCallbacks.newArray(i);
    }
}
