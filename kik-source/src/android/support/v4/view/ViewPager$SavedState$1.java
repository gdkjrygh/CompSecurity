// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Parcel;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;

final class llbacks
    implements ParcelableCompatCreatorCallbacks
{

    public final llbacks createFromParcel(Parcel parcel, ClassLoader classloader)
    {
        return new nit>(parcel, classloader);
    }

    public final volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
    {
        return createFromParcel(parcel, classloader);
    }

    public final createFromParcel[] newArray(int i)
    {
        return new createFromParcel[i];
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    llbacks()
    {
    }
}
