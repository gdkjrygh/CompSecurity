// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Parcel;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;

// Referenced classes of package android.support.v4.view:
//            ViewPager

static final class llbacks
    implements ParcelableCompatCreatorCallbacks
{

    private static llbacks createFromParcel(Parcel parcel, ClassLoader classloader)
    {
        return new nit>(parcel, classloader);
    }

    private static nit>[] newArray(int i)
    {
        return new nit>[i];
    }

    public final volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
    {
        return createFromParcel(parcel, classloader);
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    llbacks()
    {
    }
}
