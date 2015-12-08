// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            b, d, Command

public abstract class c extends Binder
    implements b
{

    public static b a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
        if (iinterface != null && (iinterface instanceof b))
        {
            return (b)iinterface;
        } else
        {
            return new d(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.analytics.internal.IAnalyticsService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
            a(parcel.readHashMap(getClass().getClassLoader()), parcel.readLong(), parcel.readString(), parcel.createTypedArrayList(Command.CREATOR));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
            a();
            parcel1.writeNoException();
            return true;
        }
    }
}
