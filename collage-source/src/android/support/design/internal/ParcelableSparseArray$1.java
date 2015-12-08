// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.internal;

import android.os.Parcel;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;

// Referenced classes of package android.support.design.internal:
//            ParcelableSparseArray

static final class 
    implements ParcelableCompatCreatorCallbacks
{

    public ParcelableSparseArray createFromParcel(Parcel parcel, ClassLoader classloader)
    {
        return new ParcelableSparseArray(parcel, classloader);
    }

    public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
    {
        return createFromParcel(parcel, classloader);
    }

    public ParcelableSparseArray[] newArray(int i)
    {
        return new ParcelableSparseArray[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
